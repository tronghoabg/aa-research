package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class qtt implements java.lang.Thread.UncaughtExceptionHandler {
    java.lang.Thread.UncaughtExceptionHandler b;
    public boolean c;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
