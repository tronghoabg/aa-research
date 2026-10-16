package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface j0 {
    j$.util.stream.j0 a(int i);

    long count();

    void forEach(java.util.function.Consumer consumer);

    j$.util.stream.j0 g(long j, long j2, java.util.function.IntFunction intFunction);

    void h(java.lang.Object[] objArr, int i);

    java.lang.Object[] k(java.util.function.IntFunction intFunction);

    int l();

    j$.util.Spliterator spliterator();
}
