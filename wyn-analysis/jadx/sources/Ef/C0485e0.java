package Ef;

import A7.RunnableC0278p;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jf.InterfaceC3108h;

/* renamed from: Ef.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0485e0 extends AbstractC0483d0 implements M {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f3727b;

    public C0485e0(Executor executor) {
        Method method;
        this.f3727b = executor;
        Method method2 = Jf.a.f6096a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = Jf.a.f6096a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // Ef.M
    public final U b(long j8, M0 m02, InterfaceC3108h interfaceC3108h) {
        Executor executor = this.f3727b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(m02, j8, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationExceptionA = H.a("The task was rejected", e7);
                InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) interfaceC3108h.get(C0499l0.f3748a);
                if (interfaceC0501m0 != null) {
                    interfaceC0501m0.cancel(cancellationExceptionA);
                }
            }
        }
        return scheduledFutureSchedule != null ? new T(scheduledFutureSchedule) : I.f3678i.b(j8, m02, interfaceC3108h);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f3727b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0485e0) && ((C0485e0) obj).f3727b == this.f3727b;
    }

    @Override // Ef.M
    public final void h(long j8, C0502n c0502n) {
        Executor executor = this.f3727b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new RunnableC0278p(this, false, c0502n, 16), j8, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationExceptionA = H.a("The task was rejected", e7);
                InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) c0502n.f3755e.get(C0499l0.f3748a);
                if (interfaceC0501m0 != null) {
                    interfaceC0501m0.cancel(cancellationExceptionA);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c0502n.w(new C0494j(scheduledFutureSchedule, 0));
        } else {
            I.f3678i.h(j8, c0502n);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3727b);
    }

    @Override // Ef.A
    public final void i(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        try {
            this.f3727b.execute(runnable);
        } catch (RejectedExecutionException e7) {
            CancellationException cancellationExceptionA = H.a("The task was rejected", e7);
            InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) interfaceC3108h.get(C0499l0.f3748a);
            if (interfaceC0501m0 != null) {
                interfaceC0501m0.cancel(cancellationExceptionA);
            }
            Lf.e eVar = S.f3698a;
            Lf.d.f7120b.i(interfaceC3108h, runnable);
        }
    }

    @Override // Ef.A
    public final String toString() {
        return this.f3727b.toString();
    }

    @Override // Ef.AbstractC0483d0
    public final Executor z() {
        return this.f3727b;
    }
}
