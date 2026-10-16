package od;

import java.util.logging.Level;
import java.util.logging.Logger;
import k8.AbstractC3211t;

/* renamed from: od.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3731v0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f42111b = Logger.getLogger(RunnableC3731v0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f42112a;

    public RunnableC3731v0(Runnable runnable) {
        this.f42112a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f42112a;
        try {
            runnable.run();
        } catch (Throwable th) {
            f42111b.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = AbstractC3211t.f39322a;
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
        return "LogExceptionRunnable(" + this.f42112a + ")";
    }
}
