package od;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class M1 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f41706c = Logger.getLogger(M1.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public boolean f41707a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f41708b;

    public final void b() {
        while (true) {
            Runnable runnable = (Runnable) this.f41708b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f41706c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Fe.e.t(runnable, "'task' must not be null.");
        if (this.f41707a) {
            if (this.f41708b == null) {
                this.f41708b = new ArrayDeque(4);
            }
            this.f41708b.add(runnable);
            return;
        }
        this.f41707a = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                f41706c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.f41708b != null) {
                    b();
                }
                this.f41707a = false;
            } finally {
                if (this.f41708b != null) {
                    b();
                }
                this.f41707a = false;
            }
        }
    }
}
