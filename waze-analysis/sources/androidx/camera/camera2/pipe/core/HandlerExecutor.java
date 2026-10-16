package androidx.camera.camera2.pipe.core;

import android.os.Handler;
import h.g.b.x;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HandlerExecutor implements Executor {
    private final Handler handler;

    public HandlerExecutor(Handler handler) {
        x.f(handler, "handler");
        this.handler = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        x.f(runnable, "command");
        if (this.handler.post(runnable)) {
            return;
        }
        Handler handler = this.handler;
        Objects.toString(handler);
        throw new RejectedExecutionException(String.valueOf(handler).concat(" is shutting down"));
    }
}
