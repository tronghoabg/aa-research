package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface BaseStream<T, S extends j$.util.stream.BaseStream<T, S>> extends java.lang.AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    java.util.Iterator<T> iterator();

    j$.util.stream.a sequential();

    j$.util.Spliterator spliterator();
}
