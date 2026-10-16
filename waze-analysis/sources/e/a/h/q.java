package e.a.h;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends ConcurrentLinkedQueue implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47794a = Logger.getLogger(q.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Object f47795b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f47796c;

    q() {
    }

    private static void c(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            f47794a.logp(Level.WARNING, "io.grpc.stub.ClientCalls$ThreadlessExecutor", "runQuietly", "Runnable threw exception", th);
        }
    }

    private static void d() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final void a() {
        this.f47796c = f47795b;
        while (true) {
            Runnable runnable = (Runnable) poll();
            if (runnable == null) {
                return;
            } else {
                c(runnable);
            }
        }
    }

    public final void b() throws InterruptedException {
        Runnable runnable;
        d();
        Runnable runnable2 = (Runnable) poll();
        if (runnable2 == null) {
            this.f47796c = Thread.currentThread();
            while (true) {
                try {
                    runnable = (Runnable) poll();
                    if (runnable != null) {
                        break;
                    }
                    LockSupport.park(this);
                    d();
                } catch (Throwable th) {
                    this.f47796c = null;
                    throw th;
                }
            }
            this.f47796c = null;
            runnable2 = runnable;
        }
        do {
            c(runnable2);
            runnable2 = (Runnable) poll();
        } while (runnable2 != null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        add(runnable);
        Object obj = this.f47796c;
        if (obj != f47795b) {
            LockSupport.unpark((Thread) obj);
        } else if (remove(runnable) && s.f47800a) {
            throw new RejectedExecutionException();
        }
    }
}
