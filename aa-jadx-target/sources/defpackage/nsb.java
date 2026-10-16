package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nsb implements nsc {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.CanonicalCM");
    private final defpackage.xzi c;

    public nsb(defpackage.xzi xziVar) {
        this.c = xziVar;
    }

    public final void d() {
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 5332)).u("Using canonical content manager");
    }

    public final void eN() {
        java.lang.Object objFF = this.c.fF();
        defpackage.mqj mqjVarF = defpackage.mpj.b().f();
        if (mqjVarF != null && mqjVarF.a().equals(defpackage.mkt.s) && objFF != null && !defpackage.nye.b().f()) {
            defpackage.mpk.a().i(new android.content.Intent().setComponent((android.content.ComponentName) objFF));
            return;
        }
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.APP_LAUNCHER, defpackage.zbd.kR).l());
        defpackage.ngy.g().h(mrb.a);
        defpackage.mpk.a().i(new android.content.Intent().setComponent(defpackage.mkt.s));
    }

    public final void eO(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (eP(carRegionId)) {
            defpackage.mug.a().x();
        } else {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 5336)).u("Unable to increase content area");
        }
    }

    public final boolean eP(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (defpackage.nte.c().a(carRegionId.h).k(carRegionId) != defpackage.nta.s) {
            ((defpackage.yqj) ((defpackage.yqj) b.l().l(1000, java.util.concurrent.TimeUnit.MILLISECONDS)).ai(5331)).u("Only maps apps can increase their area");
            return false;
        }
        int i = defpackage.nqx.a;
        int i2 = defpackage.nqz.a;
        if (!defpackage.nqy.a.h()) {
            return defpackage.mug.a().u();
        }
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 5330)).u("Can't increase content area due to immersive mode");
        return false;
    }

    public final void h() {
        defpackage.nye nyeVarB = defpackage.nye.b();
        if (nyeVarB.f()) {
            nyeVarB.d();
        } else {
            nyeVarB.e();
        }
    }

    public final void i() {
        if (!defpackage.nte.c().b().K()) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 5335)).u("Trying to start dashboard for a display which does not support it");
            return;
        }
        boolean z = defpackage.lee.a().b() && defpackage.nte.c().b().H();
        defpackage.mug.a().p(true, null);
        defpackage.mqj mqjVarE = defpackage.mpj.b().e(com.google.android.gms.car.display.CarRegionId.a);
        if (!defpackage.nye.b().f() || ((mqjVarE == null || mqjVarE.b != defpackage.mqg.NAVIGATION) && !z)) {
            ((defpackage.yqj) b.l().ai((char) 5333)).u("Not closing notification center for dashboard press");
        } else {
            defpackage.nye.b().d();
            ((defpackage.yqj) b.l().ai((char) 5334)).u("Closing notification center for dashboard press");
        }
        if (!z || defpackage.mpj.b().f() == null) {
            return;
        }
        defpackage.kgu.d(new nsa(0), "GH.CanonicalCM", defpackage.zbe.RAIL, defpackage.zbd.eT, "Car not connected when trying to stop activity", new java.lang.Object[0]);
    }

    public final void g() {
    }
}
