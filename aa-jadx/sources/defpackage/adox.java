package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adox implements java.util.concurrent.Executor {
    private final java.lang.Thread.UncaughtExceptionHandler a;
    private final java.util.Queue b = new j$.util.concurrent.ConcurrentLinkedQueue();
    private final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference();

    public adox(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final void a() {
        while (defpackage.a.o(this.c, java.lang.Thread.currentThread())) {
            while (true) {
                try {
                    java.lang.Runnable runnable = (java.lang.Runnable) this.b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (java.lang.Throwable th) {
                        this.a.uncaughtException(java.lang.Thread.currentThread(), th);
                    }
                } catch (java.lang.Throwable th2) {
                    this.c.set(null);
                    throw th2;
                }
            }
            this.c.set(null);
            if (this.b.isEmpty()) {
                return;
            }
        }
    }

    public final void b(java.lang.Runnable runnable) {
        runnable.getClass();
        this.b.add(runnable);
    }

    public final void c() {
        defpackage.ysr.bk(java.lang.Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    public final defpackage.aecg d(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        defpackage.adow adowVar = new defpackage.adow(runnable);
        return new defpackage.aecg(adowVar, (java.util.concurrent.ScheduledFuture) scheduledExecutorService.schedule(new defpackage.adov(this, adowVar, runnable, 0), j, timeUnit));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        b(runnable);
        a();
    }
}
