package java.util.function;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface Function<T, R> {
    /* JADX INFO: renamed from: andThen */
    <V> java.util.function.Function<T, V> mo330andThen(java.util.function.Function<? super R, ? extends V> function);

    R apply(T t);
}
