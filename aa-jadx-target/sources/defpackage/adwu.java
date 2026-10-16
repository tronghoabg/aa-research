package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adwu implements java.util.concurrent.ScheduledExecutorService, java.lang.AutoCloseable {
    final java.util.concurrent.ScheduledExecutorService a;
    private final /* synthetic */ int b;

    public adwu(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, int i) {
        this.b = i;
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        if (this.b == 0) {
            return this.a.awaitTermination(j, timeUnit);
        }
        android.util.Log.i("DebugExecutorService", "awaitTermination() called with timeout: " + j + ", unit: " + java.lang.String.valueOf(timeUnit));
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this.b != 0) {
            defpackage.a.k(this);
        } else {
            defpackage.a.k(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (this.b == 0) {
            this.a.execute(runnable);
            return;
        }
        android.util.Log.i("DebugExecutorService", "execute() called with Runnable: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(runnable))));
        this.a.execute(runnable);
        android.util.Log.i("DebugExecutorService", java.lang.String.valueOf(java.lang.String.valueOf(runnable)).concat(" finished on thread"));
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        if (this.b == 0) {
            return this.a.invokeAll(collection, j, timeUnit);
        }
        android.util.Log.i("DebugExecutorService", "invokeAll() called with tasks: " + java.lang.String.valueOf(collection) + ", timeout: " + j + ", unit: " + java.lang.String.valueOf(timeUnit));
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (this.b == 0) {
            return this.a.invokeAny(collection, j, timeUnit);
        }
        android.util.Log.i("DebugExecutorService", "invokeAny() called with tasks: " + java.lang.String.valueOf(collection) + ", timeout: " + j + ", unit: " + java.lang.String.valueOf(timeUnit));
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        if (this.b == 0) {
            return this.a.isShutdown();
        }
        android.util.Log.i("DebugExecutorService", "isShutdown() called");
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        if (this.b == 0) {
            return this.a.isTerminated();
        }
        android.util.Log.i("DebugExecutorService", "isTerminated() called");
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        int i = this.b;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.a;
        return i != 0 ? scheduledExecutorService.schedule(runnable, j, timeUnit) : scheduledExecutorService.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        int i = this.b;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.a;
        return i != 0 ? scheduledExecutorService.scheduleAtFixedRate(runnable, j, j2, timeUnit) : scheduledExecutorService.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        int i = this.b;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.a;
        return i != 0 ? scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j2, timeUnit) : scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        if (this.b == 0) {
            throw new java.lang.UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }
        android.util.Log.i("DebugExecutorService", "shutdown() called");
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        if (this.b == 0) {
            throw new java.lang.UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }
        android.util.Log.i("DebugExecutorService", "shutdownNow() called");
        return this.a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        if (this.b == 0) {
            return this.a.submit(runnable);
        }
        android.util.Log.i("DebugExecutorService", "submit() called with Runnable: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(runnable))));
        return this.a.submit(runnable);
    }

    public adwu(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, int i, byte[] bArr) {
        this.b = i;
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        int i = this.b;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.a;
        return i != 0 ? scheduledExecutorService.schedule(callable, j, timeUnit) : scheduledExecutorService.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        if (this.b != 0) {
            android.util.Log.i("DebugExecutorService", "submit() called with Callable: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(callable))));
            return this.a.submit(callable);
        }
        return this.a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        if (this.b != 0) {
            android.util.Log.i("DebugExecutorService", defpackage.a.bK(obj, runnable, "submit() called with Runnable: ", ", result: "));
            return this.a.submit(runnable, obj);
        }
        return this.a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection) throws java.lang.InterruptedException {
        if (this.b != 0) {
            android.util.Log.i("DebugExecutorService", "invokeAll() called with tasks: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(collection))));
            return this.a.invokeAll(collection);
        }
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        if (this.b != 0) {
            android.util.Log.i("DebugExecutorService", "invokeAny() called with tasks: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(collection))));
            return this.a.invokeAny(collection);
        }
        return this.a.invokeAny(collection);
    }
}
