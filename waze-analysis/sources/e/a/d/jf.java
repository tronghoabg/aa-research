package e.a.d;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jf implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47222a = Logger.getLogger(jf.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private boolean f47223b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayDeque f47224c;

    jf() {
    }

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f47224c.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f47222a.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        com.google.d.b.an.C(runnable, "'task' must not be null.");
        if (this.f47223b) {
            ArrayDeque arrayDeque = this.f47224c;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque(4);
                this.f47224c = arrayDeque;
            }
            arrayDeque.add(runnable);
            return;
        }
        this.f47223b = true;
        try {
            runnable.run();
            if (this.f47224c != null) {
                a();
            }
            this.f47223b = false;
        } catch (Throwable th) {
            try {
                f47222a.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", "Exception while executing runnable " + String.valueOf(runnable), th);
                if (this.f47224c != null) {
                    a();
                }
                this.f47223b = false;
            } catch (Throwable th2) {
                if (this.f47224c != null) {
                    a();
                }
                this.f47223b = false;
                throw th2;
            }
        }
    }
}
