package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
public abstract class zey extends AbstractExecutorService implements AutoCloseable, zgs {
    protected zey() {
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zgp submit(Runnable runnable) {
        return (zgp) super.submit(runnable);
    }

    public /* synthetic */ void close() throws InterruptedException {
        a.l(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public zgp submit(Callable callable) {
        return (zgp) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final zgp submit(Runnable runnable, Object obj) {
        return (zgp) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new zhk(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new zhk(callable);
    }
}
