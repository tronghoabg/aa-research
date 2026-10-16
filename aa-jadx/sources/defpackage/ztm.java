package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ztm extends java.util.concurrent.FutureTask {
    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        defpackage.zsx.a.b();
        return super.get();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        defpackage.zsx.a.b();
        return super.get(j, timeUnit);
    }
}
