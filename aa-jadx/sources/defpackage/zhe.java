package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class zhe extends defpackage.zhm {
    private final defpackage.zhs a;

    public zhe(defpackage.zhs zhsVar) {
        zhsVar.getClass();
        this.a = zhsVar;
    }

    @Override // defpackage.zga, defpackage.zhs
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // defpackage.zga, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.zga, java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.a.get();
    }

    @Override // defpackage.zga, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.zga, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.zga
    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // defpackage.zga, java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.a.get(j, timeUnit);
    }
}
