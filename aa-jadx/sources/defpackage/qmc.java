package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qmc extends java.util.concurrent.ThreadPoolExecutor implements java.lang.AutoCloseable {
    final /* synthetic */ defpackage.qmf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmc(defpackage.qmf qmfVar) {
        super(1, 1, 1L, java.util.concurrent.TimeUnit.MINUTES, new java.util.concurrent.LinkedBlockingQueue());
        this.a = qmfVar;
        setThreadFactory(new defpackage.qmd());
        allowCoreThreadTimeOut(true);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.a.k(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return new defpackage.qmb(this, runnable, obj);
    }
}
