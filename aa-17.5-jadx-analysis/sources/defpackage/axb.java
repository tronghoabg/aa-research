package defpackage;

/* loaded from: classes.dex */
public final class axb implements azy {
    final /* synthetic */ axr a;
    final /* synthetic */ boolean b;
    private final bym c;

    public axb(axr axrVar, boolean z) {
        this.a = axrVar;
        this.b = z;
        alg algVar = new alg(axrVar, 14);
        lah lahVar = byj.a;
        this.c = new bvk(algVar, null);
    }

    private final int g() {
        return ((Number) this.c.a()).intValue();
    }

    @Override // defpackage.azy
    public final float a() {
        axr axrVar = this.a;
        int iC = axrVar.c() + (axrVar.b() * 500);
        return axrVar.h() ? iC + 100.0f : iC;
    }

    @Override // defpackage.azy
    public final float b() {
        axr axrVar = this.a;
        return axrVar.c() + (axrVar.b() * 500);
    }

    @Override // defpackage.azy
    public final int c() {
        axr axrVar = this.a;
        return axrVar.l().a() + axrVar.l().o;
    }

    @Override // defpackage.azy
    public final int d() {
        axr axrVar = this.a;
        return (int) (axrVar.l().n == api.a ? axrVar.l().d() & 4294967295L : axrVar.l().d() >> 32);
    }

    @Override // defpackage.azy
    public final ddh e() {
        return this.b ? new ddh(g(), 1) : new ddh(1, g());
    }

    @Override // defpackage.azy
    public final Object f(int i, afck afckVar) {
        cdt cdtVar = axr.q;
        Object objO = this.a.o(i, afckVar);
        return objO == afcr.a ? objO : afak.a;
    }
}
