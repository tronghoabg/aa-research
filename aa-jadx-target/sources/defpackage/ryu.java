package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ryu implements defpackage.ryv {
    private static final defpackage.yqk h = defpackage.omv.n("ryu");
    public final android.content.Context a;
    public final long c;
    public final long d;
    public long e;
    public boolean f;
    private final int i;
    private final java.util.concurrent.Executor k;
    private boolean l;
    private final java.util.List j = new java.util.ArrayList();
    public boolean g = false;
    public final android.os.Handler b = new defpackage.stq(android.os.Looper.getMainLooper());

    public ryu(android.content.Context context, java.util.concurrent.Executor executor, int i, long j, long j2) {
        this.a = context;
        this.k = executor;
        this.i = i;
        this.c = j;
        this.d = j2;
    }

    private final void h(boolean z) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        int i = 1;
        if (!this.g) {
            this.g = true;
            this.b.postDelayed(new defpackage.ryw(this, i), this.d);
        }
        java.util.List list = this.j;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        defpackage.ysr.av(list, new ryt(this, jElapsedRealtime));
        list.add(java.lang.Long.valueOf(jElapsedRealtime));
        if (list.size() > this.i && !this.f) {
            h.l().ai(8564).u("Flakey connection detected!");
            this.f = true;
            defpackage.omv.h(this.a, "com.google.android.gms.car.USB_ISSUE_FOUND", defpackage.rst.j, null);
            if (android.os.Build.VERSION.SDK_INT >= 30 && defpackage.adcq.a.fF().o()) {
                this.k.execute(new defpackage.rid(this, 20));
            }
        }
        this.e = jElapsedRealtime;
        h.l().ai(8563).y("Usb change, %s", list);
    }

    @Override // defpackage.ryv
    public final void b(rzq rzqVar) {
        h(rzqVar.a);
    }

    @Override // defpackage.ryv
    public final void c(defpackage.rzs rzsVar) {
        h(rzsVar.c);
    }

    @Override // defpackage.ryv
    public final void e() {
        this.b.removeCallbacksAndMessages(null);
        g();
        h.l().ai(8565).u("Stopping flakey connection detector");
    }

    @Override // defpackage.ryv
    public final /* synthetic */ java.lang.String[] f() {
        return defpackage.rox.d();
    }

    public final void g() {
        this.g = false;
    }

    @Override // defpackage.ryv
    public final void d() {
    }

    @Override // defpackage.ryv
    public final /* synthetic */ void v(java.lang.String str, defpackage.xyn xynVar) {
    }
}
