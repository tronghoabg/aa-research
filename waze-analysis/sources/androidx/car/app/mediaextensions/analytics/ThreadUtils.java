package androidx.car.app.mediaextensions.analytics;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
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
