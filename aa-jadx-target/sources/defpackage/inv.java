package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class inv {
    public final com.google.android.gms.car.display.CarRegionId a;
    defpackage.iof b;
    android.content.Intent c;
    int d;
    defpackage.inn e;
    android.content.ComponentName f;
    boolean g;
    android.graphics.Rect i;
    public final defpackage.iny j;
    public final android.os.HandlerThread k;
    final android.os.Handler l;
    public defpackage.inn n;
    public ioc o;
    public boolean p;
    final defpackage.fbk q;
    public final java.util.List h = new java.util.ArrayList();
    public final java.util.concurrent.Semaphore m = new java.util.concurrent.Semaphore(0);

    public inv(defpackage.ioh iohVar, defpackage.fbk fbkVar) {
        this.q = fbkVar;
        com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) fbkVar.b;
        this.i = carActivityRegionLayoutConfig.d.f;
        com.google.android.gms.car.display.CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
        this.a = carRegionId;
        defpackage.iny inyVar = new defpackage.iny(iohVar, carRegionId);
        this.j = inyVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(java.lang.String.format(java.util.Locale.US, "WaitForStopThenStartClient-D:%d-R:%d", java.lang.Integer.valueOf(carRegionId.h.b), java.lang.Integer.valueOf(carRegionId.g)), -2);
        this.k = handlerThread;
        inyVar.setName(java.lang.String.format(java.util.Locale.US, "ClientConnectionThread-D:%d-R:%d", java.lang.Integer.valueOf(carRegionId.h.b), java.lang.Integer.valueOf(carRegionId.g)));
        inyVar.start();
        handlerThread.start();
        this.l = new defpackage.rce(null, handlerThread.getLooper());
    }

    public final synchronized void a() {
        if (this.j.i) {
            this.p = true;
        }
    }

    public final synchronized void b(java.lang.Runnable runnable) {
        this.l.post(runnable);
    }

    public final synchronized void c() {
        defpackage.rcm.f(this.m);
    }

    public final synchronized void d(defpackage.inn innVar) {
        if (this.m.drainPermits() > 0) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ioh.b.h()).ai(627)).y("Drained unexpected stop permit for region: %s", this.a);
        }
        this.n = innVar;
    }

    public final synchronized void e() {
        defpackage.ill.d();
        defpackage.iny inyVar = this.j;
        inyVar.g = false;
        synchronized (inyVar.f) {
            inyVar.k = null;
        }
        inyVar.interrupt();
        this.k.quit();
    }
}
