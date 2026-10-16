package We;

import Re.I;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class j extends He.l {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f15497a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f15498b;

    public j(l lVar) {
        boolean z2 = o.f15512a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, lVar);
        if (o.f15512a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            o.f15515d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f15497a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // He.l
    public final Je.b a(Runnable runnable, TimeUnit timeUnit) {
        return this.f15498b ? Me.b.f7635a : c(runnable, timeUnit, null);
    }

    @Override // He.l
    public final void b(I i5) {
        a(i5, null);
    }

    public final n c(Runnable runnable, TimeUnit timeUnit, Je.a aVar) {
        n nVar = new n(runnable, aVar);
        if (aVar == null || aVar.a(nVar)) {
            try {
                nVar.a(this.f15497a.submit((Callable) nVar));
                return nVar;
            } catch (RejectedExecutionException e7) {
                if (aVar != null) {
                    aVar.f(nVar);
                }
                S3.f.A(e7);
            }
        }
        return nVar;
    }

    @Override // Je.b
    public final void dispose() {
        if (this.f15498b) {
            return;
        }
        this.f15498b = true;
        this.f15497a.shutdownNow();
    }
}
