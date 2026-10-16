package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jym extends defpackage.nzc {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("CarApp.H");
    private static final defpackage.yhx c = new defpackage.ynu(defpackage.nzd.b);

    public jym() {
        super("TemplateMessagingAppProvider");
    }

    @Override // defpackage.nzc
    public final defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        if (defpackage.acyc.V() && !jrl.b(defpackage.mkp.a.c)) {
            int i = defpackage.ygw.d;
            return defpackage.ymx.a;
        }
        android.content.Intent intent = new android.content.Intent("androidx.car.app.CarAppService");
        intent.addCategory("androidx.car.app.category.MESSAGING");
        java.util.List listC = defpackage.mkc.b().c(qshVar, new defpackage.nzf(intent, defpackage.qqe.h, nzeVar.c(c)));
        ((defpackage.yqj) b.l().ai((char) 2829)).y("Raw list of messaging car apps found: %s", listC);
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(n(listC)).filter(new defpackage.hmj(13)).map(new defpackage.jvi(3));
        int i2 = defpackage.ygw.d;
        return (defpackage.ygw) map.collect(defpackage.yds.a);
    }
}
