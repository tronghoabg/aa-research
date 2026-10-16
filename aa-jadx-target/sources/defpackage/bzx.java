package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzx extends defpackage.cbd {
    public static final defpackage.bzx a = new defpackage.bzx();

    private bzx() {
        super(0, 4);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        defpackage.bws bwsVar = (defpackage.bws) cbgVar.c(2);
        defpackage.bws bwsVar2 = (defpackage.bws) cbgVar.c(3);
        defpackage.bvi bviVar = (defpackage.bvi) cbgVar.c(1);
        defpackage.khb khbVarW = (defpackage.khb) cbgVar.c(0);
        if (khbVarW == null && (khbVarW = bviVar.w(bwsVar)) == null) {
            defpackage.bvg.a("Could not resolve state for movable content");
            throw new defpackage.afap();
        }
        java.lang.Object obj = khbVarW.a;
        if (bzpVar.m > 0 || bzpVar.i(bzpVar.o + 1) != 1) {
            defpackage.bvg.b("Check failed");
        }
        int i = bzpVar.o;
        int i2 = bzpVar.h;
        int i3 = bzpVar.i;
        bzpVar.u(1);
        bzpVar.J();
        bzpVar.v();
        defpackage.bzp bzpVarF = ((defpackage.bzm) obj).f();
        try {
            java.util.List listG = defpackage.bzo.g(bzpVarF, 2, bzpVar, false, true, true);
            bzpVarF.w(true);
            bzpVar.x();
            bzpVar.V();
            bzpVar.o = i;
            bzpVar.h = i2;
            bzpVar.i = i3;
            defpackage.bxi.c(bzpVar, listG, bwsVar2.f);
        } catch (java.lang.Throwable th) {
            bzpVarF.w(false);
            throw th;
        }
    }
}
