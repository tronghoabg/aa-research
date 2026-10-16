package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jgy implements defpackage.jgu {
    public android.os.Handler a;
    int b;
    private final defpackage.xzi c;
    private final defpackage.xzi d;
    private java.util.concurrent.ScheduledExecutorService e;
    private java.util.concurrent.Future f;
    private final java.lang.Runnable g;

    public jgy(defpackage.jgv jgvVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, defpackage.xzi xziVar) {
        defpackage.ilu iluVar = new defpackage.ilu(carDisplayId, 13);
        this.c = defpackage.ysr.aQ(xziVar);
        this.d = iluVar;
        this.g = new defpackage.aq(this, jgvVar, 16);
    }

    @Override // defpackage.jgu
    public final void a(java.io.PrintWriter printWriter) {
        printWriter.println("Using executor based VSync");
        printWriter.println("Period: " + this.b);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // defpackage.jgu
    public final void b(android.os.Handler handler) {
        this.a = handler;
        this.e = this.d.fF();
        int iIntValue = (int) ((1000.0d / ((double) ((java.lang.Integer) this.c.fF()).intValue())) * 1000000.0d);
        this.b = iIntValue;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.e;
        scheduledExecutorService.getClass();
        this.f = scheduledExecutorService.scheduleAtFixedRate(this.g, 0L, iIntValue, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    @Override // defpackage.jgu
    public final void c() {
        this.f.cancel(false);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.e = null;
        }
    }
}
