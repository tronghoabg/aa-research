package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dap extends aiut {
    public static final defpackage.afar a = defpackage.afga.cB(1, new defpackage.con(5));
    public static final java.lang.ThreadLocal b = new defpackage.dan();
    public final android.view.Choreographer c;
    public final android.os.Handler d;
    public boolean h;
    public final defpackage.bwq j;
    private boolean n;
    public final java.lang.Object e = new java.lang.Object();
    private final defpackage.afbz m = new defpackage.afbz();
    public java.util.List f = new java.util.ArrayList();
    public java.util.List g = new java.util.ArrayList();
    public final defpackage.dao i = new defpackage.dao(this);

    public dap(android.view.Choreographer choreographer, android.os.Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.j = new defpackage.das(choreographer, this);
    }

    private final java.lang.Runnable e() {
        java.lang.Runnable runnable;
        synchronized (this.e) {
            runnable = (java.lang.Runnable) this.m.g();
        }
        return runnable;
    }

    public final void a(defpackage.afdo afdoVar, java.lang.Runnable runnable) {
        synchronized (this.e) {
            this.m.addLast(runnable);
            if (!this.n) {
                this.n = true;
                android.os.Handler handler = this.d;
                defpackage.dao daoVar = this.i;
                handler.post(daoVar);
                if (!this.h) {
                    this.h = true;
                    this.c.postFrameCallback(daoVar);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            java.lang.Runnable runnableE = e();
            while (runnableE != null) {
                runnableE.run();
                runnableE = e();
            }
            synchronized (this.e) {
                if (this.m.isEmpty()) {
                    z = false;
                    this.n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
