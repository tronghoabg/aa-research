package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iue {
    private static final defpackage.wbl f = new defpackage.wbl(defpackage.way.a("com.google.android.gms.car"), "", "", false, false).b().a();
    private static volatile defpackage.iue g;
    public final defpackage.wbl a;
    public final j$.util.concurrent.ConcurrentHashMap b = new j$.util.concurrent.ConcurrentHashMap();
    public final j$.util.concurrent.ConcurrentHashMap c = new j$.util.concurrent.ConcurrentHashMap();
    public final j$.util.concurrent.ConcurrentHashMap d = new j$.util.concurrent.ConcurrentHashMap();
    public final j$.util.concurrent.ConcurrentHashMap e = new j$.util.concurrent.ConcurrentHashMap();

    public iue(defpackage.wbl wblVar) {
        this.a = wblVar;
    }

    public static defpackage.iue a() {
        if (g == null) {
            synchronized (defpackage.iue.class) {
                if (g == null) {
                    g = new defpackage.iue(f);
                }
            }
        }
        return g;
    }
}
