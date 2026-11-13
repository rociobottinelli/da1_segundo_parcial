package ar.jornadas.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine

data class Cartelera(val charlas: List<Charla>, val hayEdicion: Boolean)

class AgendaRepository(private val api: ProgramaApi, private val dao: CarteleraDao) {
    val cartelera: Flow<Cartelera> =
        combine(dao.observar(), dao.hayEdicion()) { charlas, hay -> Cartelera(charlas, hay) }

    suspend fun sincronizar() {
        val fichas = api.consultar().map {
            Charla(it.id, it.title, it.track, it.day, it.time, it.room, it.speaker, it.summary)
        }
        dao.aplicarEdicion(fichas, System.currentTimeMillis())
    }

    suspend fun cambiarFavorita(id: String) = dao.alternar(id)
}