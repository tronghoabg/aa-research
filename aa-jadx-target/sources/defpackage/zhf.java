package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class zhf extends defpackage.yfr implements java.util.concurrent.Future, defpackage.zhs {
    protected zhf() {
    }

    protected abstract defpackage.zhs a();

    @Override // defpackage.zhs
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        a().c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return e().cancel(z);
    }

    protected /* bridge */ /* synthetic */ java.util.concurrent.Future e() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return e().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return e().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return e().isDone();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return e().get(j, timeUnit);
    }
}
