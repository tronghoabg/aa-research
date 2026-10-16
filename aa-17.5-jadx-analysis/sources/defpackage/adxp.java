package defpackage;

import java.lang.Thread;

/* loaded from: classes3.dex */
final class adxp implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new adnt(adnq.c(th).e("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
    }
}
