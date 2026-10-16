package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wfp {
    private static final java.lang.Object a = new java.lang.Object();
    private static java.lang.Thread b;
    private static volatile android.os.Handler c;

    public static android.os.Handler a() {
        if (c == null) {
            synchronized (a) {
                if (c == null) {
                    c = new android.os.Handler(android.os.Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public static void b() throws wfo {
        if (h(java.lang.Thread.currentThread())) {
            throw new wfo("Must be called on a background thread");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public static void c() throws wfo {
        if (!h(java.lang.Thread.currentThread())) {
            throw new wfo("Must be called on the main thread");
        }
    }

    public static void d(java.lang.Runnable runnable, long j) {
        a().postDelayed(runnable, j);
    }

    public static void e(java.lang.Runnable runnable) {
        a().post(runnable);
    }

    public static void f(java.lang.Runnable runnable) {
        a().removeCallbacks(runnable);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static boolean g() {
        return h(java.lang.Thread.currentThread());
    }

    public static boolean h(java.lang.Thread thread) {
        java.lang.Thread thread2 = b;
        if (thread2 == null) {
            thread2 = android.os.Looper.getMainLooper().getThread();
            b = thread2;
        }
        return thread == thread2;
    }
}
