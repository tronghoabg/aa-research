package e.a.d;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class em implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46892a = Logger.getLogger(em.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f46893b;

    public em(Runnable runnable) {
        this.f46893b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f46893b.run();
        } catch (Throwable th) {
            f46892a.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(this.f46893b.toString()), th);
            int i2 = com.google.d.b.ao.f7220a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new AssertionError(th);
            }
            throw ((Error) th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f46893b.toString() + ")";
    }
}
