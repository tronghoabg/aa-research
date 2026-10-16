package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wzb implements java.lang.Thread.UncaughtExceptionHandler {
    final java.lang.Thread.UncaughtExceptionHandler a;

    public wzb(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.a.uncaughtException(thread, th);
    }
}
