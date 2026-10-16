package androidx.window.layout.util;

import h.g.b.x;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SerialExecutor implements Executor {
    private Runnable active;
    private final Executor executor;
    private final Object lock;
    private final ArrayDeque<Runnable> tasks;

    public SerialExecutor(Executor executor) {
        x.f(executor, "executor");
        this.executor = executor;
        this.lock = new Object();
        this.tasks = new ArrayDeque<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0$0(Runnable runnable, SerialExecutor serialExecutor) {
        try {
            runnable.run();
        } finally {
            serialExecutor.scheduleNext();
        }
    }

    private final void scheduleNext() {
        synchronized (this.lock) {
            Runnable runnablePoll = this.tasks.poll();
            this.active = runnablePoll;
            if (runnablePoll != null) {
                this.executor.execute(runnablePoll);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        x.f(runnable, "r");
        synchronized (this.lock) {
            this.tasks.add(new Runnable() { // from class: androidx.window.layout.util.SerialExecutor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SerialExecutor.execute$lambda$0$0(runnable, this);
                }
            });
            if (this.active == null) {
                scheduleNext();
            }
        }
    }
}
