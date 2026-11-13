package ar.jornadas.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0011J$\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0097@\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\'J\u001c\u0010\u001c\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001aH\'J\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u00a7@\u00a2\u0006\u0002\u0010\"J\u001c\u0010#\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010%\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010&\u00a8\u0006\'"}, d2 = {"Lar/jornadas/data/CarteleraDao;", "", "()V", "actualizarContenido", "", "id", "", "titulo", "tema", "dia", "", "hora", "sala", "ponente", "resumen", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "alternar", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aplicarEdicion", "fichas", "", "Lar/jornadas/data/Charla;", "ahora", "", "(Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hayEdicion", "Lkotlinx/coroutines/flow/Flow;", "", "insertarNuevas", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observar", "registrarEdicion", "edicion", "Lar/jornadas/data/Edicion;", "(Lar/jornadas/data/Edicion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retirarFueraDe", "vigentes", "vaciar", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract class CarteleraDao {
    
    public CarteleraDao() {
        super();
    }
    
    @androidx.room.Query(value = "SELECT * FROM charlas ORDER BY dia, hora, sala")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ar.jornadas.data.Charla>> observar();
    
    @androidx.room.Query(value = "SELECT EXISTS(SELECT 1 FROM edicion)")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> hayEdicion();
    
    @androidx.room.Query(value = "UPDATE charlas SET favorita = NOT favorita WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object alternar(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertarNuevas(@org.jetbrains.annotations.NotNull()
    java.util.List<ar.jornadas.data.Charla> fichas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE charlas SET titulo = :titulo, tema = :tema, dia = :dia, hora = :hora, sala = :sala, ponente = :ponente, resumen = :resumen WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarContenido(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String titulo, @org.jetbrains.annotations.NotNull()
    java.lang.String tema, int dia, @org.jetbrains.annotations.NotNull()
    java.lang.String hora, @org.jetbrains.annotations.NotNull()
    java.lang.String sala, @org.jetbrains.annotations.NotNull()
    java.lang.String ponente, @org.jetbrains.annotations.NotNull()
    java.lang.String resumen, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM charlas WHERE id NOT IN (:vigentes)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object retirarFueraDe(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> vigentes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM charlas")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object vaciar(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registrarEdicion(@org.jetbrains.annotations.NotNull()
    ar.jornadas.data.Edicion edicion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object aplicarEdicion(@org.jetbrains.annotations.NotNull()
    java.util.List<ar.jornadas.data.Charla> fichas, long ahora, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}