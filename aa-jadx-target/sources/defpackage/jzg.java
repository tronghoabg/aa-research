package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jzg extends defpackage.nzc {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("CarApp.H");
    private static final defpackage.yhx c = new defpackage.ynu(defpackage.nzd.b);
    private boolean d;

    public jzg() {
        super("AppHostNavigation");
        this.d = false;
    }

    public static defpackage.jzg a() {
        return (defpackage.jzg) defpackage.mkp.a.i(defpackage.jzg.class);
    }

    @Override // defpackage.nzc
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        java.util.List listC = defpackage.mkc.b().c(qshVar, new defpackage.nzf(new android.content.Intent("androidx.car.app.CarAppService").addCategory("androidx.car.app.category.NAVIGATION"), defpackage.qqe.h, nzeVar.c(c)));
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai((char) 2863)).y("Raw list of car navigation apps found: %s", listC);
        defpackage.ygw ygwVarM = m(listC, defpackage.adae.c());
        if (!this.d) {
            defpackage.rrv rrvVarA = defpackage.kag.a(defpackage.zbd.sl);
            rrvVarA.q(ygwVarM);
            defpackage.kag.e(rrvVarA);
            ((defpackage.yqj) yqmVar.l().ai((char) 2864)).y("Template navigation apps found: %s", ygwVarM);
            this.d = true;
        }
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(ygwVarM).map(new defpackage.jvi(13));
        int i = defpackage.ygw.d;
        return (defpackage.ygw) map.collect(defpackage.yds.a);
    }
}
