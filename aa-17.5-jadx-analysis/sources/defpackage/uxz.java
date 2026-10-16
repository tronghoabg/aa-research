package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class uxz extends zey implements AutoCloseable, zgt {
    public static final /* synthetic */ int c = 0;
    public final tmb a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public uxz(tmb tmbVar) {
        this.a = tmbVar;
    }

    public static int a(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    private final zgr b(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        uxx uxxVar = new uxx(this, runnable, this.a.a() + millis, timeUnit.toMillis(j2), z);
        this.b.postDelayed(uxxVar, millis);
        j(uxxVar, uxxVar);
        return uxxVar;
    }

    private final void j(zgp zgpVar, Runnable runnable) {
        zgpVar.c(new unj(this, runnable, 6), zfq.a);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.zey, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        if (this != ForkJoinPool.commonPool()) {
            shutdown();
            boolean zAwaitTermination = false;
            boolean z = false;
            while (!zAwaitTermination) {
                try {
                    zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                    }
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // defpackage.zey, defpackage.zgs
    /* renamed from: d */
    public final zgp submit(final Callable callable) {
        final zhc zhcVar = new zhc();
        this.b.post(new Runnable() { // from class: uxw
            @Override // java.lang.Runnable
            public final void run() {
                int i = uxz.c;
                zhc zhcVar2 = zhcVar;
                try {
                    zhcVar2.o(callable.call());
                } catch (Exception e) {
                    zhcVar2.p(e);
                    throw new RuntimeException(e);
                }
            }
        });
        return zhcVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final zgr schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final zgr schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        uxy uxyVar = new uxy(this, callable, this.a.a() + millis);
        this.b.postDelayed(uxyVar, millis);
        j(uxyVar, uxyVar);
        return uxyVar;
    }

    @Override // defpackage.zgt
    public final zgr h(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return b(runnable, j, j2, timeUnit, true);
    }

    @Override // defpackage.zgt
    public final zgr i(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return b(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return b(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return b(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.zey, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }
}
