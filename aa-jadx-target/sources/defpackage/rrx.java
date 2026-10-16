package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rrx {
    public static boolean a;
    private static final j$.util.concurrent.ConcurrentHashMap b = new j$.util.concurrent.ConcurrentHashMap();

    public static void a(java.lang.String str, java.lang.Throwable th, java.lang.String str2) {
        d(3, str, th, str2, new java.lang.Object[0]);
    }

    public static void b(java.lang.String str, java.lang.Throwable th, java.lang.String str2) {
        d(6, str, th, str2, new java.lang.Object[0]);
    }

    public static void c(java.lang.String str, java.lang.Throwable th, java.lang.String str2) {
        d(4, str, th, str2, new java.lang.Object[0]);
    }

    public static void d(int i, java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
        java.util.logging.Level level;
        if (a) {
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = b;
            defpackage.yqm yqmVar = (defpackage.yqm) concurrentHashMap.get(str);
            if (yqmVar == null) {
                yqmVar = new defpackage.yqm(defpackage.yrs.d(str));
                defpackage.yqm yqmVar2 = (defpackage.yqm) concurrentHashMap.putIfAbsent(str, yqmVar);
                if (yqmVar2 != null) {
                    yqmVar = yqmVar2;
                }
            }
            if (i >= 6) {
                level = java.util.logging.Level.SEVERE;
            } else if (i >= 5) {
                level = java.util.logging.Level.WARNING;
            } else if (i >= 4) {
                level = java.util.logging.Level.INFO;
            } else {
                level = i >= 3 ? java.util.logging.Level.CONFIG : java.util.logging.Level.FINEST;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.a(level).p(th)).ai(8228)).Y(str2, objArr);
            return;
        }
        if (objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.US, str2, objArr);
        }
        if (i == 2) {
            android.util.Log.v(str, str2, th);
            return;
        }
        if (i == 3) {
            android.util.Log.d(str, str2, th);
            return;
        }
        if (i == 4) {
            android.util.Log.i(str, str2, th);
        } else if (i != 5) {
            android.util.Log.e(str, str2, th);
        } else {
            android.util.Log.w(str, str2, th);
        }
    }

    public static boolean e(java.lang.String str, int i) {
        if (a) {
            return true;
        }
        return android.util.Log.isLoggable(str, i);
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        d(2, str, null, str2, new java.lang.Object[0]);
    }
}
