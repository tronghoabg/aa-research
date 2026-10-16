package j$.util.stream;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class y1 extends z1 {
    public final Object[] c;

    public y1(y1 y1Var, j0 j0Var, int i) {
        super(y1Var, j0Var, i);
        this.c = y1Var.c;
    }

    @Override // j$.util.stream.z1
    public final void a() {
        this.a.h(this.c, this.b);
    }

    @Override // j$.util.stream.z1
    public final z1 b(int i, int i2) {
        return new y1(this, this.a.a(i), i2);
    }

    public y1(j0 j0Var, Object[] objArr) {
        super(j0Var);
        this.c = objArr;
    }
}
