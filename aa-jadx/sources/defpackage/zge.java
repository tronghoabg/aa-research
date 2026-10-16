package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zge extends java.util.concurrent.AbstractExecutorService implements java.lang.AutoCloseable, defpackage.zhv {
    protected zge() {
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.zhs submit(java.lang.Runnable runnable) {
        return (defpackage.zhs) super.submit(runnable);
    }

    public /* synthetic */ void close() {
        defpackage.a.k(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public defpackage.zhs submit(java.util.concurrent.Callable callable) {
        return (defpackage.zhs) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final defpackage.zhs submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return (defpackage.zhs) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return new defpackage.zim(java.util.concurrent.Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable callable) {
        return new defpackage.zim(callable);
    }
}
