package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mru {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.BackdropWinCtrl");
    public defpackage.sax g;
    public defpackage.iey h;
    public final mrt b = new mrt();
    public final defpackage.eqt e = new defpackage.mmz(this, 5);
    public final defpackage.eqt f = new defpackage.mmz(this, 6);
    public final defpackage.eqp c = defpackage.tcu.n(defpackage.ngf.a().f);
    public final defpackage.eqp d = defpackage.tcu.n(defpackage.ksi.d().e);

    public static boolean a() {
        if (!defpackage.acyc.be()) {
            return false;
        }
        if (!defpackage.kit.b().r()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5236)).u("shouldShow car not connected");
            return false;
        }
        int i = 3;
        defpackage.kyr kyrVar = new defpackage.kyr(i);
        defpackage.zbe zbeVar = defpackage.zbe.SYSTEM_UI_BACKDROP;
        defpackage.zbd zbdVar = defpackage.zbd.Jy;
        defpackage.sax saxVar = (defpackage.sax) defpackage.kgu.c(kyrVar, "GH.BackdropWinCtrl", zbeVar, zbdVar, true, "shouldShow: failed to get CarWindowManager", new java.lang.Object[0]);
        saxVar.getClass();
        return b((com.google.android.gms.car.display.CarDisplay) defpackage.kgu.c(new defpackage.kjg(saxVar, i), "GH.BackdropWinCtrl", zbeVar, zbdVar, true, "shouldShow: unable to get CarDisplay", new java.lang.Object[0]), defpackage.acyc.aY() ? (com.google.android.gms.car.CarInfo) defpackage.kgu.c(new defpackage.kyr(4), "GH.BackdropWinCtrl", zbeVar, zbdVar, true, "shouldShow: failed to get CarInfo", new java.lang.Object[0]) : null);
    }

    public static boolean b(com.google.android.gms.car.display.CarDisplay carDisplay, com.google.android.gms.car.CarInfo carInfo) {
        defpackage.acyc acycVar = defpackage.acyc.a;
        if (acycVar.fF().aW()) {
            defpackage.absc abscVarI = acycVar.fF().I();
            defpackage.yqm yqmVar = defpackage.kjl.a;
            if (defpackage.kjl.g(carInfo, abscVarI.b)) {
                return false;
            }
        }
        defpackage.yqm yqmVar2 = defpackage.nte.a;
        if (((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).i(carDisplay.a)) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5239)).u("shouldShowForCarDisplay disabled for irregular display");
            return false;
        }
        android.graphics.Rect rectA = carDisplay.a();
        if (rectA.left >= ((int) acycVar.fF().D()) || rectA.top >= ((int) acycVar.fF().D()) || rectA.right >= ((int) acycVar.fF().D()) || rectA.bottom >= ((int) acycVar.fF().D())) {
            return true;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5237)).y("shouldShowForCarDisplay threshold not met i=%s", rectA);
        return false;
    }

    public static boolean c(defpackage.qsh qshVar) {
        defpackage.acyc acycVar = defpackage.acyc.a;
        if (!acycVar.fF().bc()) {
            return false;
        }
        defpackage.kjg kjgVar = new defpackage.kjg(qshVar, 2);
        defpackage.zbe zbeVar = defpackage.zbe.SYSTEM_UI_BACKDROP;
        defpackage.zbd zbdVar = defpackage.zbd.Jy;
        defpackage.sax saxVar = (defpackage.sax) defpackage.kgu.c(kjgVar, "GH.BackdropWinCtrl", zbeVar, zbdVar, false, "shouldShowOutOfLifetime: failed to get CarWindowManager", new java.lang.Object[0]);
        saxVar.getClass();
        return b((com.google.android.gms.car.display.CarDisplay) defpackage.kgu.c(new defpackage.kjg(saxVar, 3), "GH.BackdropWinCtrl", zbeVar, zbdVar, false, "shouldShowOutOfLifetime: unable to get CarDisplay", new java.lang.Object[0]), acycVar.fF().aW() ? (com.google.android.gms.car.CarInfo) defpackage.kgu.c(new defpackage.kjg(qshVar, 4), "GH.BackdropWinCtrl", zbeVar, zbdVar, false, "shouldShowOutOfLifetime: failed to get CarInfo", new java.lang.Object[0]) : null);
    }
}
