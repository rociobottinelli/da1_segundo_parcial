package ar.jornadas.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0012J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u001fJ\u000e\u0010\'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u001fJ\u0006\u0010)\u001a\u00020\"R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010\u00a8\u0006*"}, d2 = {"Lar/jornadas/ui/ProgramaModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "saved", "Landroidx/lifecycle/SavedStateHandle;", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;)V", "cargando", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getCargando", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "cartelera", "Lkotlinx/coroutines/flow/StateFlow;", "Lar/jornadas/data/Cartelera;", "getCartelera", "()Lkotlinx/coroutines/flow/StateFlow;", "dia", "", "getDia", "mesa", "Lar/jornadas/lab/ServicioLocal;", "getMesa", "()Lar/jornadas/lab/ServicioLocal;", "repo", "Lar/jornadas/data/AgendaRepository;", "servicios", "Lar/jornadas/Servicios;", "sinConexion", "getSinConexion", "tema", "", "getTema", "cargarAlAbrir", "", "elegirDia", "indice", "elegirTema", "valor", "marcar", "id", "recargar", "app_debug"})
public final class ProgramaModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle saved = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.Servicios servicios = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.lab.ServicioLocal mesa = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.data.AgendaRepository repo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<ar.jornadas.data.Cartelera> cartelera = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> dia = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> tema = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> sinConexion = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> cargando = null;
    
    public ProgramaModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle saved) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ar.jornadas.lab.ServicioLocal getMesa() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<ar.jornadas.data.Cartelera> getCartelera() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getDia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getTema() {
        return null;
    }
    
    public final void elegirDia(int indice) {
    }
    
    public final void elegirTema(@org.jetbrains.annotations.NotNull()
    java.lang.String valor) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getSinConexion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getCargando() {
        return null;
    }
    
    public final void cargarAlAbrir() {
    }
    
    public final void recargar() {
    }
    
    public final void marcar(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}