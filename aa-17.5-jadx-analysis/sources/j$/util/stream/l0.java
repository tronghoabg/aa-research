package j$.util.stream;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class l0 implements j0 {
    public final j0 a;
    public final j0 b;
    public final long c;

    public l0(j0 j0Var, j0 j0Var2) {
        this.a = j0Var;
        this.b = j0Var2;
        this.c = j0Var2.count() + j0Var.count();
    }

    @Override // j$.util.stream.j0, j$.util.stream.i0
    public final j0 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
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
    public /* bridge */ /* synthetic */ i0 a(int i) {
        return (i0) a(i);
    }
}
