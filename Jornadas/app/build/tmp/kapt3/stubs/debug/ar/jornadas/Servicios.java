package ar.jornadas;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lar/jornadas/Servicios;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "agenda", "Lar/jornadas/data/AgendaRepository;", "getAgenda", "()Lar/jornadas/data/AgendaRepository;", "api", "Lar/jornadas/data/ProgramaApi;", "kotlin.jvm.PlatformType", "app", "archivo", "Lar/jornadas/data/Archivo;", "cargaAutomaticaHecha", "", "mesa", "Lar/jornadas/lab/ServicioLocal;", "getMesa", "()Lar/jornadas/lab/ServicioLocal;", "reclamarCargaAutomatica", "app_debug"})
public final class Servicios {
    private final android.content.Context app = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.lab.ServicioLocal mesa = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.data.Archivo archivo = null;
    private final ar.jornadas.data.ProgramaApi api = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.data.AgendaRepository agenda = null;
    private boolean cargaAutomaticaHecha = false;
    
    public Servicios(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ar.jornadas.lab.ServicioLocal getMesa() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ar.jornadas.data.AgendaRepository getAgenda() {
        return null;
    }
    
    public final boolean reclamarCargaAutomatica() {
        return false;
    }
}