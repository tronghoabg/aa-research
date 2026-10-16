package We;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f15478a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f15479b;

    /* renamed from: c, reason: collision with root package name */
    public final Je.a f15480c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f15481d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledFuture f15482e;

    /* renamed from: f, reason: collision with root package name */
    public final l f15483f;

    public e(long j8, TimeUnit timeUnit, l lVar) {
        e eVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j8) : 0L;
        this.f15478a = nanos;
        this.f15479b = new ConcurrentLinkedQueue();
        this.f15480c = new Je.a(0);
        this.f15483f = lVar;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, h.f15490c);
            eVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(eVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            eVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        eVar.f15481d = scheduledExecutorServiceNewScheduledThreadPool;
        eVar.f15482e = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f15479b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar.f15488c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(gVar)) {
                this.f15480c.f(gVar);
            }
        }
    }
}
