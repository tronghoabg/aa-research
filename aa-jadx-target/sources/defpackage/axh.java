package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class axh implements defpackage.bad {
    final /* synthetic */ defpackage.axx a;
    final /* synthetic */ boolean b;
    private final defpackage.bys c;

    public axh(defpackage.axx axxVar, boolean z) {
        this.a = axxVar;
        this.b = z;
        defpackage.aln alnVar = new defpackage.aln(axxVar, 13);
        defpackage.lam lamVar = defpackage.byp.a;
        this.c = new defpackage.bvr(alnVar, null);
    }

    private final int g() {
        return ((java.lang.Number) this.c.a()).intValue();
    }

    @Override // defpackage.bad
    public final float a() {
        defpackage.axx axxVar = this.a;
        int iC = axxVar.c() + (axxVar.b() * 500);
        return axxVar.h() ? iC + 100.0f : iC;
    }

    @Override // defpackage.bad
    public final float b() {
        defpackage.axx axxVar = this.a;
        return axxVar.c() + (axxVar.b() * 500);
    }

    @Override // defpackage.bad
    public final int c() {
        defpackage.axx axxVar = this.a;
        return axxVar.l().a() + axxVar.l().o;
    }

    @Override // defpackage.bad
    public final int d() {
        defpackage.axx axxVar = this.a;
        return (int) (axxVar.l().n == defpackage.apn.a ? axxVar.l().d() & 4294967295L : axxVar.l().d() >> 32);
    }

    @Override // defpackage.bad
    public final defpackage.ddp e() {
        return this.b ? new defpackage.ddp(g(), 1) : new defpackage.ddp(1, g());
    }

    @Override // defpackage.bad
    public final java.lang.Object f(int i, defpackage.afdk afdkVar) {
        defpackage.cdz cdzVar = defpackage.axx.q;
        java.lang.Object objO = this.a.o(i, afdkVar);
        return objO == defpackage.afdr.a ? objO : defpackage.afbk.a;
    }
}
