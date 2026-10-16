package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tev extends java.util.concurrent.ScheduledThreadPoolExecutor implements java.lang.AutoCloseable {
    public tev() {
        super(1);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th) throws java.util.concurrent.ExecutionException {
        runnable.getClass();
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof java.util.concurrent.FutureTask)) {
            java.util.concurrent.FutureTask futureTask = (java.util.concurrent.FutureTask) runnable;
            if (!futureTask.isDone() || futureTask.isCancelled()) {
                return;
            }
            try {
                futureTask.get();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.ExecutionException e) {
                throw new java.util.concurrent.ExecutionException("propagate ExecutionException", e);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.a.k(this);
    }
}
