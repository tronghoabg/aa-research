package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class tdu implements AutoCloseable, zgs {
    private final zgs a;
    private final Thread b;

    public tdu(zgs zgsVar, Thread thread) {
        this.a = zgsVar;
        this.b = thread;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: c */
    public final zgp submit(Runnable runnable) {
        runnable.getClass();
        zgp zgpVarSubmit = this.a.submit(runnable);
        zgpVarSubmit.getClass();
        return new tdt(zgpVarSubmit, this.b);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.l(this);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: d */
    public final zgp submit(Callable callable) {
        callable.getClass();
        zgp zgpVarSubmit = this.a.submit(callable);
        zgpVarSubmit.getClass();
        return new tdt(zgpVarSubmit, this.b);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: e */
    public final zgp submit(Runnable runnable, Object obj) {
        runnable.getClass();
        zgp zgpVarSubmit = this.a.submit(runnable, obj);
        zgpVarSubmit.getClass();
        return new tdt(zgpVarSubmit, this.b);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.a.execute(runnable);
    }

    @Override // defpackage.zgs, java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException {
        collection.getClass();
        timeUnit.getClass();
        List<Future> listInvokeAll = this.a.invokeAll(collection, j, timeUnit);
        listInvokeAll.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(listInvokeAll, 10));
        for (Future future : listInvokeAll) {
            future.getClass();
            arrayList.add(new tds(future, this.b));
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        collection.getClass();
        timeUnit.getClass();
        return this.a.invokeAny(collection, j, timeUnit);
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
    public final List shutdownNow() {
        List<Runnable> listShutdownNow = this.a.shutdownNow();
        listShutdownNow.getClass();
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        collection.getClass();
        return this.a.invokeAny(collection);
    }

    @Override // defpackage.zgs, java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) throws InterruptedException {
        collection.getClass();
        List<Future> listInvokeAll = this.a.invokeAll(collection);
        listInvokeAll.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(listInvokeAll, 10));
        for (Future future : listInvokeAll) {
            future.getClass();
            arrayList.add(new tds(future, this.b));
        }
        return arrayList;
    }
}
