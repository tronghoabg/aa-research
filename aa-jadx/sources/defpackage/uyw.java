package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uyw implements java.lang.Thread.UncaughtExceptionHandler {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/systems/concurrent/UncaughtExceptionHandlerInstaller");
    private final defpackage.aclm b;
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();
    private java.lang.Thread.UncaughtExceptionHandler d;

    public uyw(defpackage.aclm aclmVar) {
        this.b = aclmVar;
    }

    public final void a() {
        if (!this.c.compareAndSet(false, true) || ((java.util.Set) this.b.a()).isEmpty()) {
            return;
        }
        this.d = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        try {
            for (java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler : (java.util.Set) this.b.a()) {
                try {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) a.g()).p(e)).ai(9749)).y("Uncaught exception handler failed: %s", uncaughtExceptionHandler);
                }
            }
            java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.d;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.d;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
