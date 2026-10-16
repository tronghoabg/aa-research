package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajep {
    public static final java.lang.String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        java.lang.String property;
        int i = defpackage.ajea.a;
        try {
            property = java.lang.System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = defpackage.afvs.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, Long.MAX_VALUE);
        c = defpackage.afvs.e("kotlinx.coroutines.scheduler.core.pool.size", defpackage.afqt.e(defpackage.ajea.a, 2), androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        d = defpackage.afvs.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 2097150);
        e = java.util.concurrent.TimeUnit.SECONDS.toNanos(defpackage.afvs.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, Long.MAX_VALUE));
    }
}
