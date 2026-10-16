package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class prb extends AbstractExecutorService implements AutoCloseable, zgt {
    public final int a;
    public final tmb b;
    private final String e;
    private final ScheduledExecutorService f;
    protected final AtomicInteger c = new AtomicInteger();
    private final CountDownLatch g = new CountDownLatch(1);
    public final Map d = new ConcurrentHashMap();
    private yfq h = null;

    public prb(String str, int i, tmb tmbVar, ScheduledExecutorService scheduledExecutorService) {
        this.e = str;
        this.a = i;
        this.b = tmbVar;
        this.f = scheduledExecutorService;
    }

    protected pra a() {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.g.await(j, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ScheduledExecutorService] */
    public final prb b(String str, int i, psb psbVar) {
        ?? r0 = this.f;
        return new prf(str, i, this, this.b, r0 == 0 ? this : r0, psbVar);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: c */
    public final zgp submit(Runnable runnable) {
        int i = prh.a;
        pqz pqzVar = new pqz(Executors.callable(runnable), true, this, 0L, 0L, 0L, TimeUnit.NANOSECONDS);
        execute(pqzVar);
        return pqzVar;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.l(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: d */
    public final zgp submit(Callable callable) {
        int i = prh.a;
        callable.getClass();
        pqz pqzVar = new pqz(callable, true, this, 0L, 0L, 0L, TimeUnit.NANOSECONDS);
        execute(pqzVar);
        return pqzVar;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: e */
    public final zgp submit(Runnable runnable, Object obj) {
        int i = prh.a;
        pqz pqzVar = new pqz(Executors.callable(runnable, obj), true, this, 0L, 0L, 0L, TimeUnit.NANOSECONDS);
        execute(pqzVar);
        return pqzVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        prb prbVar;
        pqz pqzVar;
        if (isShutdown()) {
            throw new RejectedExecutionException("execute() on shut down Executor: ".concat(String.valueOf(this.e)));
        }
        if (runnable instanceof pqz) {
            pqzVar = (pqz) runnable;
            prbVar = this;
        } else {
            Callable<Object> callable = Executors.callable(runnable);
            int i = prh.a;
            prbVar = this;
            pqzVar = new pqz(callable, false, prbVar, 0L, 0L, 0L, TimeUnit.NANOSECONDS);
        }
        prbVar.j(pqzVar);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final zgr schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final zgr schedule(Callable callable, long j, TimeUnit timeUnit) {
        int i = prh.a;
        return q(callable, j, 0L, 0L, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final zgr scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Callable<Object> callable = Executors.callable(runnable);
        int i = prh.a;
        return q(callable, j, j2, 0L, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final zgr scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Callable<Object> callable = Executors.callable(runnable);
        int i = prh.a;
        return q(callable, j, 0L, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return (this.c.get() & (-16777216)) >= 33554432;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return (this.c.get() & (-16777216)) == 50331648;
    }

    protected abstract void j(pqz pqzVar);

    protected final void k() {
        if (p(33554432, 16777216)) {
            this.g.countDown();
        }
    }

    public final void m(final pqz pqzVar) {
        ScheduledExecutorService scheduledExecutorService = this.f;
        if (scheduledExecutorService != null) {
            long delay = pqzVar.getDelay(TimeUnit.NANOSECONDS);
            if (delay > 0) {
                synchronized (this.c) {
                    if (isShutdown()) {
                        throw new RejectedExecutionException("Delayed task on shut down Executor: " + this.e);
                    }
                    this.d.put(pqzVar, scheduledExecutorService.schedule(new Runnable() { // from class: pqy
                        @Override // java.lang.Runnable
                        public final void run() {
                            prb prbVar = this.a;
                            pqz pqzVar2 = pqzVar;
                            synchronized (prbVar.c) {
                                if (((ScheduledFuture) prbVar.d.remove(pqzVar2)) != null && !pqzVar2.isDone()) {
                                    prbVar.j(pqzVar2);
                                }
                            }
                        }
                    }, delay, TimeUnit.NANOSECONDS));
                }
                return;
            }
        }
        if (isShutdown()) {
            throw new RejectedExecutionException("Immeditate task on shut down Executor: ".concat(String.valueOf(this.e)));
        }
        j(pqzVar);
    }

    public final void n() {
        synchronized (this.c) {
            if (p(0, 16777216)) {
                yfl yflVar = new yfl(4);
                woy.Z(p(16777216, 16777216));
                for (pqz pqzVar : this.d.keySet()) {
                    if (o(pqzVar) && !pqzVar.isDone()) {
                        yflVar.i(pqzVar);
                    }
                }
                this.h = yflVar.g();
                l();
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new pqz(Executors.callable(runnable, obj), true, this, 0L, 0L, 0L, TimeUnit.NANOSECONDS);
    }

    public final boolean o(pqz pqzVar) {
        ScheduledFuture scheduledFuture;
        if (this.f == null || (scheduledFuture = (ScheduledFuture) this.d.remove(pqzVar)) == null) {
            return false;
        }
        scheduledFuture.cancel(false);
        return true;
    }

    protected final boolean p(int i, int i2) {
        AtomicInteger atomicInteger;
        int i3;
        woy.N((i & (-16777216)) <= 50331648);
        do {
            atomicInteger = this.c;
            i3 = atomicInteger.get();
            if ((i3 & (-16777216)) != i) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i3, i3 + i2));
        return true;
    }

    protected final zgr q(Callable callable, long j, long j2, long j3, TimeUnit timeUnit) {
        pqz pqzVar = new pqz(callable, true, this, j, j2, j3, timeUnit);
        m(pqzVar);
        return pqzVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        n();
    }

    @Override // java.util.concurrent.ExecutorService
    @ResultIgnorabilityUnspecified
    public List shutdownNow() {
        yfq yfqVar;
        synchronized (this.c) {
            n();
            yfqVar = this.h;
            yfqVar.getClass();
            this.h = yls.a;
        }
        return yfqVar;
    }

    public final String toString() {
        pra praVarA = a();
        if (praVarA == null) {
            return String.format(Locale.ENGLISH, "%s@%x[%s]", getClass().getSimpleName(), Integer.valueOf(hashCode()), this.e);
        }
        return String.format(Locale.ENGLISH, "%s@%x[%s %d/%d/%dq%d]", getClass().getSimpleName(), Integer.valueOf(hashCode()), this.e, Integer.valueOf(praVarA.a), Integer.valueOf(praVarA.b), Integer.valueOf(praVarA.c), Integer.valueOf(praVarA.d));
    }

    protected void l() {
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return new pqz(callable, true, this, 0L, 0L, 0L, TimeUnit.NANOSECONDS);
    }
}
