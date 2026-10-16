package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class zrz {
    public static final ExecutorService a = Executors.newFixedThreadPool(2, g("bg", 4));
    public static final ExecutorService b = Executors.newSingleThreadExecutor(g("lpbg", 1));
    public static final zrz c = new zrz();
    public static final Runnable d = new oyx(17);

    public static Thread a(Runnable runnable, String str) {
        return new Thread(runnable, "androidmapsapi-".concat(str));
    }

    public static Executor b() {
        return new fpe(new Handler(Looper.getMainLooper()), 11);
    }

    public static ExecutorService c(String str, int i) {
        return Executors.newFixedThreadPool(i, f(str));
    }

    public static ExecutorService d(String str) {
        return Executors.newSingleThreadExecutor(f(str));
    }

    public static ScheduledExecutorService e(String str) {
        return Executors.newSingleThreadScheduledExecutor(f(str));
    }

    public static ThreadFactory f(String str) {
        return new zry("androidmapsapi-".concat(str), 5);
    }

    public static ThreadFactory g(String str, int i) {
        return new zry("androidmapsapi-".concat(str), i);
    }
}
