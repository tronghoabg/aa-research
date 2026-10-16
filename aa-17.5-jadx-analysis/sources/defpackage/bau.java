package defpackage;

/* loaded from: classes.dex */
public final class bau implements azy {
    final /* synthetic */ bbt a;
    final /* synthetic */ boolean b;

    public bau(bbt bbtVar, boolean z) {
        this.a = bbtVar;
        this.b = z;
    }

    @Override // defpackage.azy
    public final float a() {
        bbt bbtVar = this.a;
        return bbv.a(bbtVar.x(), bbtVar.b());
    }

    @Override // defpackage.azy
    public final float b() {
        return afp.T(this.a);
    }

    @Override // defpackage.azy
    public final int c() {
        bbt bbtVar = this.a;
        return bbtVar.x().a() + bbtVar.x().d;
    }

    @Override // defpackage.azy
    public final int d() {
        bbt bbtVar = this.a;
        return (int) (bbtVar.x().e == api.a ? bbtVar.x().d() & 4294967295L : bbtVar.x().d() >> 32);
    }

    @Override // defpackage.azy
    public final ddh e() {
        boolean z = this.b;
        bbt bbtVar = this.a;
        return z ? new ddh(bbtVar.b(), 1) : new ddh(1, bbtVar.b());
    }

    @Override // defpackage.azy
    public final Object f(int i, afck afckVar) {
        Object objA = this.a.A(i, afckVar);
        return objA == afcr.a ? objA : afak.a;
    }
}
