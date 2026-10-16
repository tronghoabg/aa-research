package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hro {
    public static final java.lang.String a = "Volley";
    public static final boolean b = android.util.Log.isLoggable("Volley", 2);
    private static final java.lang.String c = defpackage.hro.class.getName();

    public static void a(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.d(a, e(str, objArr));
    }

    public static void b(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e(a, e(str, objArr));
    }

    public static void c(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e(a, e(str, objArr), th);
    }

    public static void d(java.lang.String str, java.lang.Object... objArr) {
        if (b) {
            android.util.Log.v(a, e(str, objArr));
        }
    }

    private static java.lang.String e(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2;
        java.lang.String str3 = java.lang.String.format(java.util.Locale.US, str, objArr);
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(c)) {
                java.lang.String className = stackTrace[i].getClassName();
                java.lang.String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                return java.lang.String.format(java.util.Locale.US, "[%d] %s: %s", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), str2, str3);
            }
        }
        str2 = "<unknown>";
        return java.lang.String.format(java.util.Locale.US, "[%d] %s: %s", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), str2, str3);
    }
}
