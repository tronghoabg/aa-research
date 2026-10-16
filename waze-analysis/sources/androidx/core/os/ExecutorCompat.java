package androidx.core.os;

import android.os.Handler;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ExecutorCompat {

    /* compiled from: WazeSource */
    class HandlerExecutor implements Executor {
        private final Handler mHandler;

        HandlerExecutor(Handler handler) {
            Preconditions.checkNotNull(handler);
            this.mHandler = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Preconditions.checkNotNull(runnable);
            if (this.mHandler.post(runnable)) {
                return;
            }
            Handler handler = this.mHandler;
            Objects.toString(handler);
            throw new RejectedExecutionException(String.valueOf(handler).concat(" is shutting down"));
        }
    }

    private ExecutorCompat() {
    }

    public static Executor create(Handler handler) {
        return new HandlerExecutor(handler);
    }
}
