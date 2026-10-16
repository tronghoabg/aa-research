package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o implements ScheduledExecutorService, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9030a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f9031b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f9032c;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f9031b = executorService;
        this.f9032c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f9031b.awaitTermination(j2, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.a.f(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9031b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f9031b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f9031b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f9031b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f9031b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j2, final TimeUnit timeUnit) {
        return new r(new q() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.q
            public final ScheduledFuture a(p pVar) {
                o oVar = this.f9003a;
                return oVar.f9032c.schedule(new Runnable() { // from class: com.google.firebase.concurrent.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8992a.f9031b.execute(new Runnable() { // from class: com.google.firebase.concurrent.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = o.f9030a;
                                Runnable runnable2 = runnable;
                                p pVar2 = pVar;
                                try {
                                    runnable2.run();
                                    pVar2.a(null);
                                } catch (Exception e2) {
                                    pVar2.b(e2);
                                }
                            }
                        });
                    }
                }, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j2, final long j3, final TimeUnit timeUnit) {
        return new r(new q() { // from class: com.google.firebase.concurrent.j
            @Override // com.google.firebase.concurrent.q
            public final ScheduledFuture a(p pVar) {
                o oVar = this.f9013a;
                return oVar.f9032c.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f9031b.execute(new Runnable() { // from class: com.google.firebase.concurrent.k
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                int i2 = o.f9030a;
                                try {
                                    runnable.run();
                                } catch (Exception e2) {
                                    pVar.b(e2);
                                    throw e2;
                                }
                            }
                        });
                    }
                }, j2, j3, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j2, final long j3, final TimeUnit timeUnit) {
        return new r(new q() { // from class: com.google.firebase.concurrent.m
            @Override // com.google.firebase.concurrent.q
            public final ScheduledFuture a(p pVar) {
                o oVar = this.f9022a;
                return oVar.f9032c.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9010a.f9031b.execute(new Runnable() { // from class: com.google.firebase.concurrent.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = o.f9030a;
                                try {
                                    runnable.run();
                                } catch (Exception e2) {
                                    pVar.b(e2);
                                }
                            }
                        });
                    }
                }, j2, j3, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f9031b.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return this.f9031b.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return (T) this.f9031b.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.f9031b.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f9031b.submit(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j2, final TimeUnit timeUnit) {
        return new r(new q() { // from class: com.google.firebase.concurrent.d
            @Override // com.google.firebase.concurrent.q
            public final ScheduledFuture a(p pVar) {
                o oVar = this.f8995a;
                return oVar.f9032c.schedule(new Callable() { // from class: com.google.firebase.concurrent.h
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return oVar.f9031b.submit(new Runnable() { // from class: com.google.firebase.concurrent.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = o.f9030a;
                                Callable callable2 = callable;
                                p pVar2 = pVar;
                                try {
                                    pVar2.a(callable2.call());
                                } catch (Exception e2) {
                                    pVar2.b(e2);
                                }
                            }
                        });
                    }
                }, j2, timeUnit);
            }
        });
    }
}
