package ar.jornadas.ui

import android.app.Application
import androidx.lifecycle.*
import ar.jornadas.JornadasApp
import ar.jornadas.data.Cartelera
import com.google.gson.JsonParseException
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.io.IOException

class ProgramaModel(app: Application, private val saved: SavedStateHandle) : AndroidViewModel(app) {
    private val servicios = (app as JornadasApp).servicios
    val mesa = servicios.mesa
    private val repo = servicios.agenda

    val cartelera: StateFlow<Cartelera?> =
        repo.cartelera.stateIn(viewModelScope, SharingStarted.Eagerly, null)

    val dia: StateFlow<Int> = saved.getStateFlow("dia", 0)
    val tema: StateFlow<String> = saved.getStateFlow("tema", "Todos")
    fun elegirDia(indice: Int) { saved["dia"] = indice }
    fun elegirTema(valor: String) { saved["tema"] = valor }

    val sinConexion = MutableStateFlow(false)
    val cargando = MutableStateFlow(false)

    fun cargarAlAbrir() { if (servicios.reclamarCargaAutomatica()) recargar() }

    fun recargar() {
        if (cargando.value) return
        cargando.value = true
        viewModelScope.launch {
            try {
                repo.sincronizar()
                sinConexion.value = false
            } catch (e: IOException) {
                sinConexion.value = true
            } catch (e: JsonParseException) {
                sinConexion.value = true
            } finally {
                cargando.value = false
            }
        }
    }

    fun marcar(id: String) { viewModelScope.launch { repo.cambiarFavorita(id) } }
}