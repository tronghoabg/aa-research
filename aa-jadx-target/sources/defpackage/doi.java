package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class doi implements defpackage.zhs {
    final java.lang.ref.WeakReference a;
    public final defpackage.dod b = new defpackage.doh(this);

    public doi(defpackage.doe doeVar) {
        this.a = new java.lang.ref.WeakReference(doeVar);
    }

    public final boolean a(java.lang.Throwable th) {
        return this.b.f(th);
    }

    @Override // defpackage.zhs
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        defpackage.doe doeVar = (defpackage.doe) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || doeVar == null) {
            return zCancel;
        }
        doeVar.a = null;
        doeVar.b = null;
        doeVar.c.e(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.b.get(j, timeUnit);
    }
}
