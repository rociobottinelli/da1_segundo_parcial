package ar.jornadas

import android.content.Context
import androidx.room.Room
import ar.jornadas.data.*
import ar.jornadas.lab.ServicioLocal
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Servicios(context: Context) {
    private val app = context.applicationContext
    val mesa = ServicioLocal(app)
    private val archivo = Room.databaseBuilder(app, Archivo::class.java, "cartelera.db")
        .addMigrations(MIGRACION_1_2)
        .build()
    private val api = Retrofit.Builder().baseUrl("https://programa.invalid/")
        .client(OkHttpClient.Builder().addInterceptor(mesa).build())
        .addConverterFactory(GsonConverterFactory.create()).build().create(ProgramaApi::class.java)
    val agenda = AgendaRepository(api, archivo.cartelera())

    private var cargaAutomaticaHecha = false
    fun reclamarCargaAutomatica(): Boolean {
        if (cargaAutomaticaHecha) return false
        cargaAutomaticaHecha = true
        return true
    }
}