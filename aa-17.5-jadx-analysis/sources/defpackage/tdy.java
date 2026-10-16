package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class tdy extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public tdy() {
        super(1);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) throws ExecutionException, InterruptedException {
        runnable.getClass();
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof FutureTask)) {
            FutureTask futureTask = (FutureTask) runnable;
            if (!futureTask.isDone() || futureTask.isCancelled()) {
                return;
            }
            try {
                futureTask.get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                throw new ExecutionException("propagate ExecutionException", e);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.l(this);
    }
}
