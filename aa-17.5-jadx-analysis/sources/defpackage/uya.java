package defpackage;

import java.lang.Thread;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class uya implements Thread.UncaughtExceptionHandler {
    private static final yob a = yob.c("com/google/android/libraries/geo/systems/concurrent/UncaughtExceptionHandlerInstaller");
    private final ackk b;
    private final AtomicBoolean c = new AtomicBoolean();
    private Thread.UncaughtExceptionHandler d;

    public uya(ackk ackkVar) {
        this.b = ackkVar;
    }

    public final void a() {
        if (!this.c.compareAndSet(false, true) || ((Set) this.b.a()).isEmpty()) {
            return;
        }
        this.d = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            for (Thread.UncaughtExceptionHandler uncaughtExceptionHandler : (Set) this.b.a()) {
                try {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } catch (RuntimeException e) {
                    ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9721)).y("Uncaught exception handler failed: %s", uncaughtExceptionHandler);
                }
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.d;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
