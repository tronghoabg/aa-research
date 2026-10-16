package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ztd {
    public static final java.util.concurrent.ExecutorService a = java.util.concurrent.Executors.newFixedThreadPool(2, g("bg", 4));
    public static final java.util.concurrent.ExecutorService b = java.util.concurrent.Executors.newSingleThreadExecutor(g("lpbg", 1));
    public static final defpackage.ztd c = new defpackage.ztd();
    public static final java.lang.Runnable d = new defpackage.ozv(18);

    public static java.lang.Thread a(java.lang.Runnable runnable, java.lang.String str) {
        return new java.lang.Thread(runnable, "androidmapsapi-".concat(str));
    }

    public static java.util.concurrent.Executor b() {
        return new defpackage.czu(new android.os.Handler(android.os.Looper.getMainLooper()), 13);
    }

    public static java.util.concurrent.ExecutorService c(java.lang.String str, int i) {
        return java.util.concurrent.Executors.newFixedThreadPool(i, f(str));
    }

    public static java.util.concurrent.ExecutorService d(java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadExecutor(f(str));
    }

    public static java.util.concurrent.ScheduledExecutorService e(java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(f(str));
    }

    public static java.util.concurrent.ThreadFactory f(java.lang.String str) {
        return new defpackage.ztc("androidmapsapi-".concat(str), 5);
    }

    public static java.util.concurrent.ThreadFactory g(java.lang.String str, int i) {
        return new defpackage.ztc("androidmapsapi-".concat(str), i);
    }
}
