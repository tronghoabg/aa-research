package j$.util.stream;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public class x1 extends z1 {
    public final Object c;

    public x1(x1 x1Var, i0 i0Var, int i) {
        super(x1Var, i0Var, i);
        this.c = x1Var.c;
    }

    @Override // j$.util.stream.z1
    public final void a() {
        ((i0) this.a).d(this.b, this.c);
    }

    @Override // j$.util.stream.z1
    public final z1 b(int i, int i2) {
        return new x1(this, ((i0) this.a).a(i), i2);
    }

    public x1(i0 i0Var, Object obj) {
        super(i0Var);
        this.c = obj;
    }
}
