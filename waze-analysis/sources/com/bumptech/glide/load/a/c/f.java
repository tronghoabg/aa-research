package com.bumptech.glide.load.a.c;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements ExecutorService, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private static final long f3116a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f3117b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f3118c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f3116a = 10000L;
    }

    f(ExecutorService executorService) {
        this.f3118c = executorService;
    }

    public static int a() {
        if (f3117b == 0) {
            f3117b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f3117b;
    }

    public static a b() {
        int iA = a();
        a aVar = new a(true);
        aVar.c(iA >= 4 ? 2 : 1);
        aVar.b("animation");
        return aVar;
    }

    public static a c() {
        a aVar = new a(true);
        aVar.c(1);
        aVar.b("disk-cache");
        return aVar;
    }

    public static a d() {
        a aVar = new a(false);
        aVar.c(a());
        aVar.b("source");
        return aVar;
    }

    public static f e() {
        return new f(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f3116a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new e(new c(), "source-unlimited", false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f3118c.awaitTermination(j2, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.a.f(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3118c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f3118c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f3118c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f3118c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f3118c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f3118c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f3118c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f3118c.submit(runnable);
    }

    public final String toString() {
        return this.f3118c.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return this.f3118c.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return (T) this.f3118c.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.f3118c.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f3118c.submit(callable);
    }
}
