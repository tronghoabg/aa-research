package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ill {
    private static final defpackage.yqm a = defpackage.yqm.c("CAR.SERVICE");
    private static final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();

    public static int a(android.content.Context context, java.lang.String str) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = b;
        boolean z = true;
        if (atomicBoolean.get() && !defpackage.ilk.b) {
            z = false;
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 235)).y("Compare pid: %b", java.lang.Boolean.valueOf(z));
        ((defpackage.yqj) yqmVar.l().ai(236)).B("Calling pid: %d\nProcess pid: %d", android.os.Binder.getCallingPid(), android.os.Process.myPid());
        if (z && android.os.Binder.getCallingPid() == android.os.Process.myPid()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 237)).u("Caller is self, permission denied");
            return -1;
        }
        if (atomicBoolean.get()) {
            java.util.HashMap map = defpackage.ilk.a;
            if (map.containsKey(str)) {
                return ((java.lang.Integer) map.get(str)).intValue();
            }
            return 0;
        }
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
        ((defpackage.yqj) yqmVar.l().ai((char) 231)).y("Checking permission: %s", str);
        if (packagesForUid == null || packagesForUid.length <= 0) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 232)).u("No package with that UID, denied!");
            return -1;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 233)).y("All packages: %s", java.util.Arrays.toString(packagesForUid));
        ((defpackage.yqj) yqmVar.l().ai(234)).U("calling pid: %d, calling uid: %d, process pid: %d, process uid: %d, package name: %s, permission: %s", java.lang.Integer.valueOf(android.os.Binder.getCallingPid()), java.lang.Integer.valueOf(android.os.Binder.getCallingUid()), java.lang.Integer.valueOf(android.os.Process.myPid()), java.lang.Integer.valueOf(android.os.Process.myUid()), packagesForUid[0], str);
        return defpackage.dmh.F(context, str, android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid(), packagesForUid[0]);
    }

    public static java.io.File b(android.content.Context context) {
        java.io.File file = new java.io.File(context.getExternalFilesDir(null), "auto");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 238)).u("Failed to create auto-specific file dir");
        return null;
    }

    public static java.lang.String c(android.content.Context context) {
        try {
            if (!b.get()) {
                return defpackage.qun.b(context, defpackage.slj.a(context).b(context.getPackageName()));
            }
            java.util.HashMap map = defpackage.ilk.a;
            return defpackage.qun.b(context, defpackage.slj.a(context).b(context.getPackageName()));
        } catch (java.lang.IllegalStateException | java.lang.SecurityException unused) {
            return "";
        }
    }

    public static void d() {
        if (b.get()) {
            java.util.HashMap map = defpackage.ilk.a;
        } else if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("expecting main thread");
        }
    }

    public static void e() {
        if (b.get()) {
            java.util.HashMap map = defpackage.ilk.a;
        } else if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("unexpected main thread");
        }
    }
}
