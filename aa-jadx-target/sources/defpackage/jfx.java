package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jfx {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.PeriodicTask");
    private final java.lang.Runnable b;
    private final java.util.concurrent.ScheduledExecutorService c;
    private final long d;
    private final long e;
    private final java.util.concurrent.TimeUnit f;
    private java.util.concurrent.Future g;

    public jfx(defpackage.jfv jfvVar) {
        defpackage.zhn zhnVar = defpackage.zhn.a;
        this.g = zhnVar == null ? new defpackage.zhn() : zhnVar;
        this.b = new defpackage.ire(jfvVar, 13);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = jfvVar.b;
        scheduledExecutorService.getClass();
        this.c = scheduledExecutorService;
        this.d = jfvVar.c;
        this.e = jfvVar.d;
        java.util.concurrent.TimeUnit timeUnit = jfvVar.e;
        timeUnit.getClass();
        this.f = timeUnit;
    }

    public final synchronized void a() {
        defpackage.ysr.bk(this.g.isCancelled(), "Periodic task is already running");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.c;
        defpackage.ysr.bk(!scheduledExecutorService.isShutdown(), "Can't schedule periodic task: ExecutorService is shut down");
        this.g = scheduledExecutorService.scheduleAtFixedRate(this.b, this.d, this.e, this.f);
    }

    public final synchronized void b() {
        if (!this.c.isShutdown()) {
            defpackage.ysr.bk(this.g.cancel(false), "Failed to cancel the periodic task");
        } else {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2001)).u("ExecutorService is shutdown.");
            this.g.cancel(false);
        }
    }
}
