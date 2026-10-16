package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adzr implements java.util.concurrent.Executor, java.lang.Runnable {
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.adzr.class.getName());
    private static final defpackage.adzo c;
    private final java.util.concurrent.Executor d;
    private final java.util.Queue e = new j$.util.concurrent.ConcurrentLinkedQueue();
    public volatile int a = 0;

    static {
        defpackage.adzp adzqVar;
        try {
            adzqVar = new defpackage.adzp(java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.adzr.class, "a"));
        } catch (java.lang.Throwable th) {
            b.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            adzqVar = new adzq();
        }
        c = adzqVar;
    }

    public adzr(java.util.concurrent.Executor executor) {
        executor.getClass();
        this.d = executor;
    }

    private final void a(java.lang.Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (java.lang.Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        this.e.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                java.lang.Runnable runnable = (java.lang.Runnable) this.e.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (java.lang.RuntimeException e) {
                    b.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializingExecutor", "run", defpackage.a.bW(runnable, "Exception while executing runnable "), (java.lang.Throwable) e);
                }
            } catch (java.lang.Throwable th) {
                c.b(this);
                throw th;
            }
        }
        c.b(this);
        if (this.e.isEmpty()) {
            return;
        }
        a(null);
    }
}
