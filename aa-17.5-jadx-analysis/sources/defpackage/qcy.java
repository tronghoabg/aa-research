package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class qcy implements ScheduledExecutorService, AutoCloseable {
    private final ScheduledExecutorService a;

    public qcy(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        Log.i("DebugExecutorService", "awaitTermination() called with timeout: " + j + ", unit: " + String.valueOf(timeUnit));
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.l(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Log.i("DebugExecutorService", "execute() called with Runnable: ".concat(String.valueOf(String.valueOf(runnable))));
        this.a.execute(runnable);
        Log.i("DebugExecutorService", String.valueOf(String.valueOf(runnable)).concat(" finished on thread"));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException {
        Log.i("DebugExecutorService", "invokeAll() called with tasks: " + String.valueOf(collection) + ", timeout: " + j + ", unit: " + String.valueOf(timeUnit));
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Log.i("DebugExecutorService", "invokeAny() called with tasks: " + String.valueOf(collection) + ", timeout: " + j + ", unit: " + String.valueOf(timeUnit));
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        Log.i("DebugExecutorService", "isShutdown() called");
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        Log.i("DebugExecutorService", "isTerminated() called");
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        Log.i("DebugExecutorService", "shutdown() called");
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        Log.i("DebugExecutorService", "shutdownNow() called");
        return this.a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        Log.i("DebugExecutorService", "submit() called with Runnable: ".concat(String.valueOf(String.valueOf(runnable))));
        return this.a.submit(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.a.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        Log.i("DebugExecutorService", a.bL(obj, runnable, "submit() called with Runnable: ", ", result: "));
        return this.a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        Log.i("DebugExecutorService", "submit() called with Callable: ".concat(String.valueOf(String.valueOf(callable))));
        return this.a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) throws InterruptedException {
        Log.i("DebugExecutorService", "invokeAll() called with tasks: ".concat(String.valueOf(String.valueOf(collection))));
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) throws ExecutionException, InterruptedException {
        Log.i("DebugExecutorService", "invokeAny() called with tasks: ".concat(String.valueOf(String.valueOf(collection))));
        return this.a.invokeAny(collection);
    }
}
