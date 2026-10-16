package e.a.d;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jj implements Executor, Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47226a = Logger.getLogger(jj.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final jg f47227b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f47228c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f47229d = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private volatile int f47230e = 0;

    static {
        jg jiVar;
        try {
            jiVar = new jh(AtomicIntegerFieldUpdater.newUpdater(jj.class, "e"));
        } catch (Throwable th) {
            f47226a.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            jiVar = new ji();
        }
        f47227b = jiVar;
    }

    public jj(Executor executor) {
        com.google.d.b.an.C(executor, "'executor' must not be null.");
        this.f47228c = executor;
    }

    private final void c(Runnable runnable) {
        if (f47227b.a(this)) {
            try {
                this.f47228c.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f47229d.remove(runnable);
                }
                f47227b.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        com.google.d.b.an.C(runnable, "'r' must not be null.");
        this.f47229d.add(runnable);
        c(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Runnable runnable = (Runnable) this.f47229d.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e2) {
                    f47226a.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "run", "Exception while executing runnable " + runnable.toString(), (Throwable) e2);
                }
            } catch (Throwable th) {
                f47227b.b(this);
                throw th;
            }
        }
        f47227b.b(this);
        if (this.f47229d.isEmpty()) {
            return;
        }
        c(null);
    }
}
