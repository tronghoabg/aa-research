package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class adwl implements java.util.concurrent.Executor {
    private final defpackage.adxu a;
    private java.util.concurrent.Executor b;

    public adwl(defpackage.adxu adxuVar) {
        this.a = adxuVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    final synchronized java.util.concurrent.Executor a() {
        if (this.b == null) {
            ?? A = this.a.a();
            A.getClass();
            this.b = A;
        }
        return this.b;
    }

    final synchronized void b() {
        java.util.concurrent.Executor executor = this.b;
        if (executor != null) {
            this.a.b(executor);
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        a().execute(runnable);
    }
}
