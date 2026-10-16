package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 implements j$.util.stream.j0 {
    public final j$.util.stream.j0 a;
    public final j$.util.stream.j0 b;
    public final long c;

    public l0(j$.util.stream.j0 j0Var, j$.util.stream.j0 j0Var2) {
        this.a = j0Var;
        this.b = j0Var2;
        this.c = j0Var2.count() + j0Var.count();
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final j$.util.stream.j0 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.j0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.j0
    public final int l() {
        return 2;
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public /* bridge */ /* synthetic */ j$.util.stream.i0 a(int i) {
        return (j$.util.stream.i0) a(i);
    }
}
