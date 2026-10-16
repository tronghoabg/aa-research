package androidx.car.app.utils;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
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
