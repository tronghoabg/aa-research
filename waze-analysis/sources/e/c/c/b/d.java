package e.c.c.b;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final e.c.a.b f47878a;

    /* renamed from: b, reason: collision with root package name */
    private final long f47879b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentLinkedQueue f47880c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f47881d;

    /* renamed from: e, reason: collision with root package name */
    private final Future f47882e;

    d(long j2, TimeUnit timeUnit) {
        d dVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
        this.f47879b = nanos;
        this.f47880c = new ConcurrentLinkedQueue();
        this.f47878a = new e.c.a.b();
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, e.f47883b);
            dVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(dVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            dVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        dVar.f47881d = scheduledExecutorServiceNewScheduledThreadPool;
        dVar.f47882e = scheduledFutureScheduleWithFixedDelay;
    }

    final void a() {
        this.f47878a.a();
        Future future = this.f47882e;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.f47881d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f47880c;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (jNanoTime < 0) {
                return;
            }
            if (concurrentLinkedQueue.remove(gVar)) {
                this.f47878a.b(gVar);
            }
        }
    }
}
