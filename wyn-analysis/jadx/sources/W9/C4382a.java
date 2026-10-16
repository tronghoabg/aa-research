package w9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: w9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4382a extends ScheduledThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExecutorC4384c f47409a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4382a(ExecutorC4384c executorC4384c, RunnableC4383b runnableC4383b) {
        super(1, runnableC4383b);
        this.f47409a = executorC4384c;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) throws ExecutionException, InterruptedException {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            try {
                if (future.isDone()) {
                    future.get();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException unused2) {
            } catch (ExecutionException e7) {
                th = e7.getCause();
            }
        }
        if (th != null) {
            this.f47409a.f47416d.c(th);
        }
    }
}
