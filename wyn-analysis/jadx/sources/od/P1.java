package od;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class P1 implements Executor, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f41775d = Logger.getLogger(P1.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final S1 f41776e;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f41777a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f41778b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public volatile int f41779c = 0;

    static {
        S1 o12;
        try {
            o12 = new N1(AtomicIntegerFieldUpdater.newUpdater(P1.class, "c"));
        } catch (Throwable th) {
            f41775d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            o12 = new O1();
        }
        f41776e = o12;
    }

    public P1(Executor executor) {
        Fe.e.t(executor, "'executor' must not be null.");
        this.f41777a = executor;
    }

    public final void b(Runnable runnable) {
        S1 s12 = f41776e;
        if (s12.q(this)) {
            try {
                this.f41777a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f41778b.remove(runnable);
                }
                s12.r(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f41778b;
        Fe.e.t(runnable, "'r' must not be null.");
        concurrentLinkedQueue.add(runnable);
        b(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        S1 s12 = f41776e;
        while (true) {
            concurrentLinkedQueue = this.f41778b;
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e7) {
                    f41775d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e7);
                }
            } catch (Throwable th) {
                s12.r(this);
                throw th;
            }
        }
        s12.r(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        b(null);
    }
}
