package We;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class q extends He.m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f15519b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f15520c;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f15521a;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f15520c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f15519b = new l("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public q() {
        AtomicReference atomicReference = new AtomicReference();
        this.f15521a = atomicReference;
        boolean z2 = o.f15512a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f15519b);
        if (o.f15512a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            o.f15515d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // He.m
    public final He.l a() {
        return new p((ScheduledExecutorService) this.f15521a.get());
    }

    @Override // He.m
    public final Je.b c(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        m mVar = new m(runnable);
        try {
            mVar.a(((ScheduledExecutorService) this.f15521a.get()).submit(mVar));
            return mVar;
        } catch (RejectedExecutionException e7) {
            S3.f.A(e7);
            return Me.b.f7635a;
        }
    }
}
