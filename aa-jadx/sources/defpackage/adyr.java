package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class adyr {
    public final java.util.concurrent.ScheduledExecutorService a;
    public final java.util.concurrent.Executor b;
    public final java.lang.Runnable c;
    public long d;
    public boolean e;
    public java.util.concurrent.ScheduledFuture f;
    private final defpackage.xzg g;

    public adyr(java.lang.Runnable runnable, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.xzg xzgVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = xzgVar;
        xzgVar.e();
    }

    public final long a() {
        return this.g.a(java.util.concurrent.TimeUnit.NANOSECONDS);
    }
}
