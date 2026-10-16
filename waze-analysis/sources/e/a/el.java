package e.a;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class el implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f47427a;

    /* renamed from: b, reason: collision with root package name */
    private final Queue f47428b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f47429c = new AtomicReference();

    public el(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f47427a = uncaughtExceptionHandler;
    }

    public final ek a(Runnable runnable, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        ej ejVar = new ej(runnable);
        return new ek(ejVar, scheduledExecutorService.schedule(new ei(this, ejVar, runnable), j2, timeUnit));
    }

    public final void b() {
        while (a.a.g(this.f47429c, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f47428b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f47427a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.f47429c.set(null);
                    throw th2;
                }
            }
            this.f47429c.set(null);
            if (this.f47428b.isEmpty()) {
                return;
            }
        }
    }

    public final void c(Runnable runnable) {
        com.google.d.b.an.C(runnable, "runnable is null");
        this.f47428b.add(runnable);
    }

    public final void d() {
        com.google.d.b.an.v(Thread.currentThread() == this.f47429c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable);
        b();
    }
}
