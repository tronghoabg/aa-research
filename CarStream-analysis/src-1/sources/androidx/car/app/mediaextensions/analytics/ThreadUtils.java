package androidx.car.app.mediaextensions.analytics;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class ThreadUtils {
    private ThreadUtils() {
    }

    public static Executor getMainThreadExecutor() {
        return new Executor() { // from class: androidx.car.app.mediaextensions.analytics.ThreadUtils.1
            private final Handler mHandler = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.mHandler.post(runnable);
            }
        };
    }
}
