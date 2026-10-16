package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bi extends bh implements ao {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f51757b;

    public bi(Executor executor) {
        this.f51757b = executor;
        kotlinx.coroutines.e.c.a(executor);
    }

    private static final void c(h.c.j jVar, RejectedExecutionException rejectedExecutionException) {
        aj.W(jVar, bo.g("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture d(ScheduledExecutorService scheduledExecutorService, Runnable runnable, h.c.j jVar, long j2) {
        try {
            return scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            c(jVar, e2);
            return null;
        }
    }

    @Override // kotlinx.coroutines.bh
    public final Executor a() {
        return this.f51757b;
    }

    @Override // kotlinx.coroutines.ao
    public final ax b(long j2, Runnable runnable, h.c.j jVar) {
        Executor executor = this.f51757b;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureD = scheduledExecutorService != null ? d(scheduledExecutorService, runnable, jVar, j2) : null;
        return scheduledFutureD != null ? new aw(scheduledFutureD) : ak.f51351b.r(j2, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f51757b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatch(h.c.j jVar, Runnable runnable) {
        try {
            this.f51757b.execute(runnable);
        } catch (RejectedExecutionException e2) {
            c(jVar, e2);
            av.b().dispatch(jVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bi) && ((bi) obj).f51757b == this.f51757b;
    }

    @Override // kotlinx.coroutines.ao
    public final void f(long j2, k kVar) {
        Executor executor = this.f51757b;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureD = scheduledExecutorService != null ? d(scheduledExecutorService, new ct(this, kVar), kVar.getContext(), j2) : null;
        if (scheduledFutureD != null) {
            bo.m(kVar, new i(scheduledFutureD, 1));
        } else {
            ak.f51351b.f(j2, kVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f51757b);
    }

    @Override // kotlinx.coroutines.ab
    public final String toString() {
        return this.f51757b.toString();
    }
}
