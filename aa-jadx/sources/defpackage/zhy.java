package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class zhy extends defpackage.zge {
    private final java.util.concurrent.ExecutorService a;

    public zhy(java.util.concurrent.ExecutorService executorService) {
        executorService.getClass();
        this.a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final java.lang.String toString() {
        java.util.concurrent.ExecutorService executorService = this.a;
        return super.toString() + "[" + java.lang.String.valueOf(executorService) + "]";
    }
}
