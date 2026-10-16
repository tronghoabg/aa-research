package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rzk implements defpackage.ryv {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SERVICE.UsbIssueDetector");
    private final android.content.Context c;
    private final defpackage.ryv d;
    private final android.content.BroadcastReceiver b = new defpackage.rzj(this);
    private boolean e = false;

    public rzk(android.content.Context context, defpackage.ryv ryvVar) {
        this.c = context;
        this.d = ryvVar;
    }

    @Override // defpackage.ryv
    public final void b(rzq rzqVar) {
        if (this.e) {
            this.d.b(rzqVar);
        }
    }

    @Override // defpackage.ryv
    public final void c(defpackage.rzs rzsVar) {
        if (this.e) {
            this.d.c(rzsVar);
        }
    }

    @Override // defpackage.ryv
    public final void d() {
        defpackage.ysr.bj(!this.e);
        g();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_STARTED");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_ENDED");
        defpackage.eth.a(this.c).b(this.b, intentFilter);
    }

    @Override // defpackage.ryv
    public final void e() {
        defpackage.eth.a(this.c).c(this.b);
        h();
    }

    @Override // defpackage.ryv
    public final java.lang.String[] f() {
        return this.e ? this.d.f() : new java.lang.String[0];
    }

    public final void g() {
        if (this.e) {
            return;
        }
        this.d.d();
        this.e = true;
    }

    public final void h() {
        if (this.e) {
            this.d.e();
            this.e = false;
        }
    }

    @Override // defpackage.ryv
    public final void v(java.lang.String str, defpackage.xyn xynVar) {
        if (this.e) {
            this.d.v(str, xynVar);
        }
    }
}
