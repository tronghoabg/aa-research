package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qmf {
    public static volatile defpackage.qmf a;
    public final android.content.Context b;
    public final java.util.List c;
    public final defpackage.qmc d;
    public volatile defpackage.qmi e;
    public java.lang.Thread.UncaughtExceptionHandler f;

    public qmf(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        defpackage.sqs.aA(applicationContext);
        this.b = applicationContext;
        this.d = new defpackage.qmc(this);
        this.c = new java.util.concurrent.CopyOnWriteArrayList();
        new defpackage.qlw();
    }

    public static void b() {
        if (!(java.lang.Thread.currentThread() instanceof defpackage.qme)) {
            throw new java.lang.IllegalStateException("Call expected from worker thread");
        }
    }

    public final java.util.concurrent.Future a(java.util.concurrent.Callable callable) {
        if (!(java.lang.Thread.currentThread() instanceof defpackage.qme)) {
            return this.d.submit(callable);
        }
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void c(java.lang.Runnable runnable) {
        this.d.submit(runnable);
    }
}
