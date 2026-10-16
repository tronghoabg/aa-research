package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uyv extends defpackage.zge implements java.lang.AutoCloseable, defpackage.zhw {
    public static final /* synthetic */ int c = 0;
    public final defpackage.tmy a;
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());

    public uyv(defpackage.tmy tmyVar) {
        this.a = tmyVar;
    }

    public static int a(java.util.concurrent.Delayed delayed, java.util.concurrent.Delayed delayed2) {
        long delay = delayed2.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    private final defpackage.zhu b(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        defpackage.uyt uytVar = new defpackage.uyt(this, runnable, this.a.a() + millis, timeUnit.toMillis(j2), z);
        this.b.postDelayed(uytVar, millis);
        j(uytVar, uytVar);
        return uytVar;
    }

    private final void j(defpackage.zhs zhsVar, java.lang.Runnable runnable) {
        zhsVar.c(new defpackage.umi(this, runnable, 10), defpackage.zgt.INSTANCE);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.zge, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this != java.util.concurrent.ForkJoinPool.commonPool()) {
            shutdown();
            boolean zAwaitTermination = false;
            boolean z = false;
            while (!zAwaitTermination) {
                try {
                    zAwaitTermination = awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
                } catch (java.lang.InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                    }
                    z = true;
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    @Override // defpackage.zge, defpackage.zhv
    /* JADX INFO: renamed from: d */
    public final defpackage.zhs submit(final java.util.concurrent.Callable callable) {
        final defpackage.zif zifVar = new defpackage.zif();
        this.b.post(new java.lang.Runnable() { // from class: uys
            @Override // java.lang.Runnable
            public final void run() {
                int i = defpackage.uyv.c;
                defpackage.zif zifVar2 = zifVar;
                try {
                    zifVar2.o(callable.call());
                } catch (java.lang.Exception e) {
                    zifVar2.p(e);
                    throw new java.lang.RuntimeException(e);
                }
            }
        });
        return zifVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.zhu schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return schedule(java.util.concurrent.Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final defpackage.zhu schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        defpackage.uyu uyuVar = new defpackage.uyu(this, callable, this.a.a() + millis);
        this.b.postDelayed(uyuVar, millis);
        j(uyuVar, uyuVar);
        return uyuVar;
    }

    @Override // defpackage.zhw
    public final defpackage.zhu h(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return b(runnable, j, j2, timeUnit, true);
    }

    @Override // defpackage.zhw
    public final defpackage.zhu i(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return b(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return b(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return b(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.zge, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return submit(callable);
    }
}
