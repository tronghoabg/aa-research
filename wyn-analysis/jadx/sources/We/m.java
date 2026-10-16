package We;

import A7.RunnableC0307z;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class m extends AtomicReference implements Callable, Je.b {

    /* renamed from: c, reason: collision with root package name */
    public static final FutureTask f15503c;

    /* renamed from: d, reason: collision with root package name */
    public static final FutureTask f15504d;

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f15505a;

    /* renamed from: b, reason: collision with root package name */
    public Thread f15506b;

    static {
        RunnableC0307z runnableC0307z = Ne.b.f8672b;
        f15503c = new FutureTask(runnableC0307z, null);
        f15504d = new FutureTask(runnableC0307z, null);
    }

    public m(Runnable runnable) {
        this.f15505a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f15503c) {
                return;
            }
            if (future2 == f15504d) {
                future.cancel(this.f15506b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = f15503c;
        this.f15506b = Thread.currentThread();
        try {
            this.f15505a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f15506b = null;
        }
    }

    @Override // Je.b
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f15503c || future == (futureTask = f15504d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f15506b != Thread.currentThread());
    }
}
