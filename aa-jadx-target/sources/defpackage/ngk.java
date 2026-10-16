package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ngk implements defpackage.lhn, defpackage.mnj {
    public final defpackage.eqs c = new defpackage.eqs();
    public final defpackage.eqs d = new defpackage.eqs();
    public final defpackage.eqs e = new defpackage.eqs();
    public final defpackage.eqs f = new defpackage.eqs();
    private final defpackage.afar i = new defpackage.afay(new defpackage.djm(this, 14));
    public static final defpackage.ngj a = new defpackage.ngj();
    private static final defpackage.yqm g = defpackage.yqm.c("GH.DisplayUiFeaturesMgr");
    private static final java.util.List h = defpackage.afga.ac("resizeType", "hasClock", "hasBatteryLevel", "hasPhoneSignal");
    public static final defpackage.afhl b = new defpackage.nfw(defpackage.mkp.b, 3);

    public final rdb a() {
        return (rdb) this.i.a();
    }

    public final void b() {
        ((defpackage.yqj) g.f()).u("Requesting exiting AAP.");
        defpackage.mpk.a().i(new android.content.Intent().setComponent(defpackage.mkt.e));
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CAR_DISPLAY_UI_FEATURES, defpackage.zbd.Lv).l());
    }

    @Override // defpackage.lhn
    public final void d() {
        if (defpackage.kit.b().q()) {
            defpackage.khg.u(new defpackage.wde("GH.DisplayUiFeaturesMgr", defpackage.zbe.CAR_DISPLAY_UI_FEATURES, defpackage.zbd.Ls, "Car not connected when registering listener for display UI features.", new java.lang.Object[0]), new defpackage.nas(this, 13));
        }
        defpackage.mni.a().d(defpackage.mnh.B);
    }

    public final void e(defpackage.qsh qshVar) {
        ((defpackage.yqj) g.f()).u("Requesting HU to resize the primary display larger.");
        defpackage.zbe zbeVar = defpackage.zbe.CAR_DISPLAY_UI_FEATURES;
        defpackage.khg.u(new defpackage.wde("GH.DisplayUiFeaturesMgr", zbeVar, defpackage.zbd.Lu, "Car not connected when requesting display to be resized larger.", new java.lang.Object[0]), new defpackage.nas(qshVar, 15));
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.Lx).l());
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.zbe zbeVar = defpackage.zbe.CAR_DISPLAY_UI_FEATURES;
        defpackage.khg.u(new defpackage.wde("GH.DisplayUiFeaturesMgr", zbeVar, defpackage.zbd.Lr, "Car not connected when registering listener for display UI features.", new java.lang.Object[0]), new defpackage.nas(this, 12));
        defpackage.khg.u(new defpackage.wde("GH.DisplayUiFeaturesMgr", zbeVar, defpackage.zbd.Lq, "Car not connected when retrieving initial display UI features.", new java.lang.Object[0]), new defpackage.nas(this, 14));
        defpackage.mni.a().b(defpackage.mnh.B, this);
    }

    public final void f(defpackage.qsh qshVar) {
        ((defpackage.yqj) g.f()).u("Requesting HU to resize the primary display smaller.");
        defpackage.zbe zbeVar = defpackage.zbe.CAR_DISPLAY_UI_FEATURES;
        defpackage.khg.u(new defpackage.wde("GH.DisplayUiFeaturesMgr", zbeVar, defpackage.zbd.Lt, "Car not connected when requesting display to be resized smaller.", new java.lang.Object[0]), new defpackage.nas(qshVar, 16));
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.Lw).l());
    }

    public final void g(com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures, java.lang.String str) {
        ((defpackage.yqj) g.f()).M("updateValues from %s: %s", str, carDisplayUiFeatures);
        this.c.m(java.lang.Integer.valueOf(carDisplayUiFeatures.a));
        this.d.m(java.lang.Boolean.valueOf(carDisplayUiFeatures.a(1)));
        this.e.m(java.lang.Boolean.valueOf(carDisplayUiFeatures.a(2)));
        this.f.m(java.lang.Boolean.valueOf(carDisplayUiFeatures.a(4)));
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        printWriter.getClass();
        mnl mnlVarL = mnq.l();
        for (java.lang.String str : h) {
            mnm mnmVarA = mnn.a();
            mnmVarA.a = str;
            mnmVarA.b();
            mnmVarA.c('|');
            mnmVarA.d(true);
            mnlVarL.b(mnmVarA.a());
        }
        mnlVarL.c(new java.lang.Object[]{this.c.e(), this.d.e(), this.e.e(), this.f.e()});
        mnlVarL.a().m(printWriter);
        printWriter.println("\n-------------------------------");
    }
}
