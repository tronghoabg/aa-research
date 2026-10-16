package od;

import java.lang.Thread;

/* renamed from: od.u1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3729u1 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw md.k0.e(th).h("Uncaught exception in the SynchronizationContext. Re-thrown.").a();
    }
}
