package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class aiva extends aiuz implements aiuf {
    private final Executor a;

    public aiva(Executor executor) {
        Method method;
        this.a = executor;
        Method method2 = ajbt.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = ajbt.a) == null) {
                return;
            }
            method.invoke(scheduledThreadPoolExecutor, true);
        } catch (Throwable unused) {
        }
    }

    private static final void i(afco afcoVar, RejectedExecutionException rejectedExecutionException) {
        affx.e(afcoVar, aije.a("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture j(ScheduledExecutorService scheduledExecutorService, Runnable runnable, afco afcoVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            i(afcoVar, e);
            return null;
        }
    }

    @Override // defpackage.aitu
    public final void a(afco afcoVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            i(afcoVar, e);
            aitu aituVar = aium.a;
            ajdk.a.a(afcoVar, runnable);
        }
    }

    @Override // defpackage.aiuf
    public final void c(long j, aitf aitfVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureJ = scheduledExecutorService != null ? j(scheduledExecutorService, new aiwa(this, aitfVar, 0), ((aitg) aitfVar).b, j) : null;
        if (scheduledFutureJ != null) {
            ((aitg) aitfVar).A(new aitd(scheduledFutureJ));
        } else {
            aiub.a.c(j, aitfVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.aiuz
    public final Executor e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aiva) && ((aiva) obj).a == this.a;
    }

    @Override // defpackage.aiuf
    public final aiuo h(long j, Runnable runnable, afco afcoVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureJ = scheduledExecutorService != null ? j(scheduledExecutorService, runnable, afcoVar, j) : null;
        return scheduledFutureJ != null ? new aiun(scheduledFutureJ) : aiub.a.t(j, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.aitu
    public final String toString() {
        return this.a.toString();
    }
}
