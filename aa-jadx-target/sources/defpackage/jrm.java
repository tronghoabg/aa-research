package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum jrm {
    PROJECTION("projection"),
    SHARED_SERVICE("shared"),
    CAR("car"),
    CROSS_PROFILE("crossprofile"),
    PROVIDER("provider"),
    PRIMES_LIFEBOAT("primes_lifeboat"),
    WATCHDOG("watchdog"),
    EMPTY("");

    private final java.lang.String j;

    jrm(java.lang.String str) {
        this.j = str;
    }

    public static defpackage.jrm a() {
        return (defpackage.jrm) defpackage.mkp.a.i(defpackage.jrm.class);
    }

    public static defpackage.jrm b(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        for (defpackage.jrm jrmVar : values()) {
            if (jrmVar.c(context).equals(str)) {
                return jrmVar;
            }
        }
        android.content.Context applicationContext = context.getApplicationContext();
        if (!applicationContext.getPackageName().equals(str)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "Unexpected process name: ", ". All android components in manifest must run in a known process."));
        }
        try {
            str2 = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 0).processName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.e("GH.ProcessInfo", "Error detecting process name from manifest.");
            str2 = "<unknown>";
        }
        android.util.Log.e("GH.ProcessInfo", "processName given is the package name default process. Should have run as ".concat(java.lang.String.valueOf(str2)));
        return EMPTY;
    }

    public final java.lang.String c(android.content.Context context) {
        return context.getApplicationContext().getPackageName() + ":" + this.j;
    }
}
