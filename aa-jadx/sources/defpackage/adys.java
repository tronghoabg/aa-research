package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adys implements java.lang.Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        throw new defpackage.adou(defpackage.ador.c(th).e("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
    }
}
