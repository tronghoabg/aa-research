package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gfb {
    public static final /* synthetic */ int a = 0;
    private static final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());
    private static java.lang.Thread c;

    public static void a(java.lang.Runnable runnable) {
        b.post(runnable);
    }

    public static void b() {
        if (c == null) {
            c = android.os.Looper.getMainLooper().getThread();
        }
        if (java.lang.Thread.currentThread() != c) {
            throw new java.lang.AssertionError("Must be called on the UI thread");
        }
    }

    public static void c(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            b.post(runnable);
        }
    }
}
