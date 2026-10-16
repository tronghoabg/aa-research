package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ryn implements defpackage.ryv {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SERVICE");
    public final android.content.Context b;
    public defpackage.wij g;
    private final android.os.Handler h;
    private final long i;
    final java.lang.Runnable c = new defpackage.qtk(this, 16, null);
    android.content.BroadcastReceiver d = null;
    public boolean e = false;
    private boolean j = false;
    public boolean f = false;

    public ryn(android.content.Context context, android.os.Handler handler, long j) {
        this.b = context;
        this.h = handler;
        this.i = j;
    }

    public static final boolean h(android.content.Intent intent) {
        return (intent.getIntExtra("plugged", 0) & 3) != 0;
    }

    private final void i() {
        if (!this.j || this.f) {
            k();
        } else {
            j();
        }
    }

    private final void j() {
        this.h.postDelayed(this.c, this.i);
    }

    private final void k() {
        this.h.removeCallbacks(this.c);
        defpackage.wij wijVar = this.g;
        if (wijVar != null) {
            wijVar.a(!this.f);
        }
        if (this.e && this.f) {
            defpackage.omv.h(this.b, "com.google.android.gms.car.USB_ISSUE_FOUND", defpackage.rst.b, null);
        }
        this.e = false;
    }

    @Override // defpackage.ryv
    public final void b(defpackage.rzq rzqVar) {
        g(rzqVar.a);
    }

    @Override // defpackage.ryv
    public final void c(defpackage.rzs rzsVar) {
        boolean z = this.f;
        boolean z2 = rzsVar.b;
        if (z != z2) {
            this.f = z2;
            i();
        }
    }

    @Override // defpackage.ryv
    public final void d() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        android.content.Context context = this.b;
        android.content.Intent intentE = defpackage.duw.e(context, null, intentFilter, null, 2);
        boolean z = false;
        if (intentE != null && h(intentE)) {
            z = true;
        }
        this.j = z;
        if (z) {
            j();
        }
        this.d = new defpackage.rym(this);
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addAction("android.intent.action.BATTERY_CHANGED");
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        int i = android.os.Build.VERSION.SDK_INT;
        android.content.BroadcastReceiver broadcastReceiver = this.d;
        if (i >= 30) {
            defpackage.duw.e(context, broadcastReceiver, intentFilter2, null, 2);
        } else {
            defpackage.duw.e(context, broadcastReceiver, intentFilter2, null, 2);
        }
    }

    @Override // defpackage.ryv
    public final void e() {
        k();
        android.content.BroadcastReceiver broadcastReceiver = this.d;
        if (broadcastReceiver != null) {
            this.b.unregisterReceiver(broadcastReceiver);
            this.d = null;
        }
        this.j = false;
        this.f = false;
    }

    @Override // defpackage.ryv
    public final /* synthetic */ java.lang.String[] f() {
        return defpackage.rox.d();
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            i();
        }
    }

    @Override // defpackage.ryv
    public final /* synthetic */ void v(java.lang.String str, defpackage.xyn xynVar) {
    }
}
