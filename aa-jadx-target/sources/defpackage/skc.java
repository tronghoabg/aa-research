package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class skc implements defpackage.sjl {
    public static final defpackage.wbl a;
    public static final j$.util.concurrent.ConcurrentHashMap b;
    static java.lang.Boolean c;
    static java.lang.Long d;
    public final android.content.Context e;

    static {
        defpackage.wbl wblVar = new defpackage.wbl(defpackage.way.a("com.google.android.gms.clearcut.public"), "", "", false, false);
        if (wblVar.d) {
            throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        defpackage.wbl wblVar2 = new defpackage.wbl(wblVar.a, "gms:playlog:service:samplingrules_", wblVar.c, false, wblVar.e);
        a = new defpackage.wbl(wblVar2.a, wblVar2.b, "LogSamplingRulesV2__", wblVar2.d, wblVar2.e);
        b = new j$.util.concurrent.ConcurrentHashMap();
        c = null;
        d = null;
    }

    public skc(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext != null) {
            defpackage.wbn.f(applicationContext);
        }
    }
}
