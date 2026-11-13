package ar.jornadas.data

import androidx.room.*
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import retrofit2.http.GET
import kotlinx.coroutines.flow.Flow

data class FichaRemota(val id: String, val title: String, val track: String, val day: Int,
                       val time: String, val room: String, val speaker: String, val summary: String)

interface ProgramaApi {
    @GET("programa") suspend fun consultar(): List<FichaRemota>
}

@Entity(tableName = "charlas")
data class Charla(@PrimaryKey val id: String, val titulo: String, val tema: String, val dia: Int,
                  val hora: String, val sala: String, val ponente: String, val resumen: String,
                  val favorita: Boolean = false)

@Entity(tableName = "edicion")
data class Edicion(@PrimaryKey val id: Int = 1, val descargadaEn: Long)

@Dao
abstract class CarteleraDao {
    @Query("SELECT * FROM charlas ORDER BY dia, hora, sala")
    abstract fun observar(): Flow<List<Charla>>

    @Query("SELECT EXISTS(SELECT 1 FROM edicion)")
    abstract fun hayEdicion(): Flow<Boolean>

    @Query("UPDATE charlas SET favorita = NOT favorita WHERE id = :id")
    abstract suspend fun alternar(id: String)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun insertarNuevas(fichas: List<Charla>)

    @Query("UPDATE charlas SET titulo = :titulo, tema = :tema, dia = :dia, hora = :hora, " +
            "sala = :sala, ponente = :ponente, resumen = :resumen WHERE id = :id")
    abstract suspend fun actualizarContenido(id: String, titulo: String, tema: String, dia: Int,
                                             hora: String, sala: String, ponente: String, resumen: String)

    @Query("DELETE FROM charlas WHERE id NOT IN (:vigentes)")
    abstract suspend fun retirarFueraDe(vigentes: List<String>)

    @Query("DELETE FROM charlas")
    abstract suspend fun vaciar()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun registrarEdicion(edicion: Edicion)

    @Transaction
    open suspend fun aplicarEdicion(fichas: List<Charla>, ahora: Long) {
        insertarNuevas(fichas)
        fichas.forEach {
            actualizarContenido(it.id, it.titulo, it.tema, it.dia, it.hora, it.sala, it.ponente, it.resumen)
        }
        if (fichas.isEmpty()) vaciar() else retirarFueraDe(fichas.map { it.id })
        registrarEdicion(Edicion(descargadaEn = ahora))
    }
}

@Database(entities = [Charla::class, Edicion::class], version = 2, exportSchema = false)
abstract class Archivo : RoomDatabase() {
    abstract fun cartelera(): CarteleraDao
}

val MIGRACION_1_2 = object : Migration(1, 2) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `edicion` " +
                "(`id` INTEGER NOT NULL, `descargadaEn` INTEGER NOT NULL, PRIMARY KEY(`id`))")
        db.execSQL("INSERT INTO edicion (id, descargadaEn) SELECT 1, 0 WHERE EXISTS (SELECT 1 FROM charlas)")
    }
}