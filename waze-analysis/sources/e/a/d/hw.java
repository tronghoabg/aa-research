package e.a.d;

import j$.util.Objects;
import java.lang.Thread;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hw implements Thread.UncaughtExceptionHandler {
    hw(iy iyVar) {
        Objects.requireNonNull(iyVar);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new e.a.eh(e.a.ee.e(th).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}
