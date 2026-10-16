package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c1 implements j$.util.stream.j0 {
    @Override // j$.util.stream.j0, j$.util.stream.i0
    public j$.util.stream.j0 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.j0
    public final long count() {
        return 0L;
    }

    @Override // j$.util.stream.j0
    public /* synthetic */ j$.util.stream.j0 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.a2.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.j0
    public final java.lang.Object[] k(java.util.function.IntFunction intFunction) {
        return (java.lang.Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.j0
    public final int l() {
        return 0;
    }

    public final void e(java.lang.Object obj) {
    }

    public final void d(int i, java.lang.Object obj) {
    }
}
