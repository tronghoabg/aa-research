package ud;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class c extends ConcurrentLinkedQueue implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f46776b = Logger.getLogger(c.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final Object f46777c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f46778a;

    public final void b() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Runnable runnable = (Runnable) poll();
        if (runnable == null) {
            this.f46778a = Thread.currentThread();
            do {
                try {
                    Runnable runnable2 = (Runnable) poll();
                    if (runnable2 == null) {
                        LockSupport.park(this);
                    } else {
                        this.f46778a = null;
                        runnable = runnable2;
                    }
                } catch (Throwable th) {
                    this.f46778a = null;
                    throw th;
                }
            } while (!Thread.interrupted());
            throw new InterruptedException();
        }
        do {
            try {
                runnable.run();
            } catch (Throwable th2) {
                f46776b.log(Level.WARNING, "Runnable threw exception", th2);
            }
            runnable = (Runnable) poll();
        } while (runnable != null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        add(runnable);
        Object obj = this.f46778a;
        if (obj != f46777c) {
            LockSupport.unpark((Thread) obj);
        } else if (remove(runnable) && e.f46783b) {
            throw new RejectedExecutionException();
        }
    }

    public final void shutdown() {
        this.f46778a = f46777c;
        while (true) {
            Runnable runnable = (Runnable) poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f46776b.log(Level.WARNING, "Runnable threw exception", th);
            }
        }
    }
}
