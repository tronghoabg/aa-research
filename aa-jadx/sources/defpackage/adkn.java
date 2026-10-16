package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adkn implements java.lang.Runnable {
    final defpackage.adkl a;
    public final defpackage.adkr b;
    private final java.util.concurrent.Executor c;

    public adkn(java.util.concurrent.Executor executor, defpackage.adkl adklVar, defpackage.adkr adkrVar) {
        this.c = executor;
        this.a = adklVar;
        this.b = adkrVar;
    }

    final void a() {
        try {
            this.c.execute(this);
        } catch (java.lang.Throwable th) {
            defpackage.adkr.c.logp(java.util.logging.Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
