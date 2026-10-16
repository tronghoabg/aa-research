package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class gev {
    public static final /* synthetic */ int a = 0;
    private static final Handler b = new Handler(Looper.getMainLooper());
    private static Thread c;

    public static void a(Runnable runnable) {
        b.post(runnable);
    }

    public static void b() {
        if (c == null) {
            c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != c) {
            throw new AssertionError("Must be called on the UI thread");
        }
    }

    public static void c(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            b.post(runnable);
        }
    }
}
