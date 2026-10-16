package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rly {
    public static boolean a = false;
    public static final defpackage.kwv b = new defpackage.kwv("debug.car.svc.dev_only_log");
    public static final defpackage.kwv c = new defpackage.kwv("debug.car.svc.enable_systrace");

    public static boolean a(defpackage.kwv kwvVar) {
        if (a) {
            return "true".equals(android.os.SystemProperties.get((java.lang.String) kwvVar.a, "false"));
        }
        return false;
    }
}
