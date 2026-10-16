package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ilp implements java.lang.Thread.UncaughtExceptionHandler {
    java.lang.Thread.UncaughtExceptionHandler a;
    public boolean b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
