package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qmb extends java.util.concurrent.FutureTask {
    final /* synthetic */ defpackage.qmc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmb(defpackage.qmc qmcVar, java.lang.Runnable runnable, java.lang.Object obj) {
        super(runnable, obj);
        this.a = qmcVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(java.lang.Throwable th) {
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a.a.f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), th);
        } else if (android.util.Log.isLoggable("GAv4", 6)) {
            android.util.Log.e("GAv4", "MeasurementExecutor: job failed with ".concat(java.lang.String.valueOf(java.lang.String.valueOf(th))));
        }
        super.setException(th);
    }
}
