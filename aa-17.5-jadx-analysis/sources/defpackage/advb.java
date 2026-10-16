package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class advb implements Runnable {
    private static final Logger a = Logger.getLogger(advb.class.getName());
    private final Runnable b;

    public advb(Runnable runnable) {
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            a.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(this.b.toString()), th);
            xyg.c(th);
            throw new AssertionError(th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.b.toString() + ")";
    }
}
