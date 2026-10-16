package md;

import A7.RunnableC0299w0;
import ba.C1521a;
import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class n0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f40703a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f40704b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f40705c = new AtomicReference();

    public n0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f40703a = uncaughtExceptionHandler;
    }

    public final void b() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        do {
            AtomicReference atomicReference = this.f40705c;
            Thread threadCurrentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, threadCurrentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                concurrentLinkedQueue = this.f40704b;
                try {
                    Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f40703a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    atomicReference.set(null);
                    throw th2;
                }
            }
            atomicReference.set(null);
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final void c(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f40704b;
        Fe.e.t(runnable, "runnable is null");
        concurrentLinkedQueue.add(runnable);
    }

    public final C1521a d(Runnable runnable, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        N6.w wVar = new N6.w(runnable);
        return new C1521a(wVar, scheduledExecutorService.schedule(new RunnableC0299w0(this, wVar, runnable, 25), j8, timeUnit));
    }

    public final void e() {
        Fe.e.w("Not called from the SynchronizationContext", Thread.currentThread() == this.f40705c.get());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable);
        b();
    }
}
