package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rzv implements defpackage.ryv {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    private final android.os.Handler f;
    public final java.lang.Object b = new java.lang.Object();
    public defpackage.rzs c = null;
    int d = 0;
    public final long e = defpackage.adcq.a.fF().j();
    private final java.lang.Runnable g = new defpackage.rzu(this, 0);

    public rzv(android.os.Handler handler) {
        this.f = handler;
    }

    @Override // defpackage.ryv
    public final void c(defpackage.rzs rzsVar) {
        defpackage.rzs rzsVar2;
        synchronized (this.b) {
            if (!rzsVar.c && ((rzsVar2 = this.c) == null || rzsVar2.c)) {
                this.d++;
            }
            this.c = rzsVar;
        }
    }

    @Override // defpackage.ryv
    public final /* synthetic */ java.lang.String[] f() {
        return defpackage.rox.d();
    }

    public final void g() {
        synchronized (this.b) {
            this.d = 0;
            this.c = null;
        }
    }

    @Override // defpackage.ryv
    public final void v(java.lang.String str, defpackage.xyn xynVar) {
        if (xynVar.f() && defpackage.yyn.FRAMER_READ_IO_EXCEPTION.equals(xynVar.b())) {
            g();
            android.os.Handler handler = this.f;
            java.lang.Runnable runnable = this.g;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.e);
        }
    }

    @Override // defpackage.ryv
    public final void d() {
    }

    @Override // defpackage.ryv
    public final void e() {
    }

    @Override // defpackage.ryv
    public final void b(rzq rzqVar) {
    }
}
