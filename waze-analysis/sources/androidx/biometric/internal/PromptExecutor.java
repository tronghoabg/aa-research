package androidx.biometric.internal;

import android.os.Handler;
import android.os.Looper;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PromptExecutor implements Executor {
    private final Handler promptHandler = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        x.f(runnable, "runnable");
        this.promptHandler.post(runnable);
    }
}
