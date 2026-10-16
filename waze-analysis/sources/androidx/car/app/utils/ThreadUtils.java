package androidx.car.app.utils;

import android.os.Handler;
import android.os.Looper;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ThreadUtils {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());

    private ThreadUtils() {
    }

    public static void checkMainThread() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to");
        }
    }

    public static void runOnMain(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            HANDLER.post(runnable);
        }
    }
}
