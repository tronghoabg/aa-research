package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rys implements defpackage.ryv {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SERVICE.FCD");
    static final defpackage.yhx b = defpackage.yhx.r("com.google.android.gms.car.VERSION_NEGOTIATION", "com.google.android.gms.car.SSL_NEGOTIATION", "com.google.android.gms.car.SDP_NEGOTIATION", "com.google.android.gms.car.AUTHORIZATION");
    static final defpackage.yhx c = defpackage.ysr.o(defpackage.rsm.b, defpackage.rsm.d, defpackage.rsm.e);
    public final defpackage.yhe d;
    final android.content.BroadcastReceiver e;
    public final android.content.Context f;
    public defpackage.ryq g;
    private final android.os.Handler h;
    private final defpackage.xzi i;
    private final java.lang.Runnable j;
    private boolean k;

    public rys(android.content.Context context, android.os.Handler handler) {
        defpackage.ryo ryoVar = new defpackage.ryo(context, 0);
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(defpackage.ryq.b, new defpackage.ryr(defpackage.rst.c, defpackage.rst.f, new defpackage.riu(3), new defpackage.qtk(this, 17)));
        yhaVar.f(defpackage.ryq.c, new defpackage.ryr(defpackage.rst.d, defpackage.rst.g, new defpackage.riu(4), new defpackage.qtk(this, 18)));
        yhaVar.f(defpackage.ryq.d, new defpackage.ryr(defpackage.rst.e, defpackage.rst.h, new defpackage.riu(5), new defpackage.qtk(this, 19)));
        this.d = defpackage.ysr.F(yhaVar.d(true));
        this.e = new defpackage.ryp(this);
        this.j = new defpackage.qtk(this, 20);
        this.g = defpackage.ryq.a;
        this.k = false;
        this.f = context;
        this.h = handler;
        this.i = ryoVar;
    }

    @Override // defpackage.ryv
    public final void b(rzq rzqVar) {
        if (rzqVar.a) {
            return;
        }
        h(defpackage.ryq.a);
    }

    @Override // defpackage.ryv
    public final void c(defpackage.rzs rzsVar) {
        if (!rzsVar.c || !rzsVar.b) {
            h(defpackage.ryq.a);
            return;
        }
        int iOrdinal = this.g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (rzsVar.e) {
                return;
            }
            h(defpackage.ryq.b);
        } else if (rzsVar.e) {
            h(defpackage.ryq.c);
        } else {
            h(defpackage.ryq.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ryv
    public final void d() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
        defpackage.yot it = b.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((java.lang.String) it.next());
        }
        intentFilter.addAction("com.google.android.gms.car.FRX");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_STARTED");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_ENDED");
        android.content.Context context = this.f;
        android.content.BroadcastReceiver broadcastReceiver = this.e;
        defpackage.eth.a(context).b(broadcastReceiver, intentFilter);
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addAction(android.app.UiModeManager.ACTION_ENTER_CAR_MODE);
        intentFilter2.addAction(android.app.UiModeManager.ACTION_EXIT_CAR_MODE);
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        defpackage.duw.e(context, broadcastReceiver, intentFilter2, null, 2);
    }

    @Override // defpackage.ryv
    public final void e() {
        h(defpackage.ryq.a);
        android.content.Context context = this.f;
        defpackage.eth ethVarA = defpackage.eth.a(context);
        android.content.BroadcastReceiver broadcastReceiver = this.e;
        ethVarA.c(broadcastReceiver);
        context.unregisterReceiver(broadcastReceiver);
    }

    @Override // defpackage.ryv
    public final /* synthetic */ java.lang.String[] f() {
        return defpackage.rox.d();
    }

    public final void g(boolean z) {
        if (!z || !((java.lang.Boolean) this.i.fF()).booleanValue()) {
            this.k = true;
        } else {
            a.f().ai(8557).y("USB connection was reset in stage %s", this.g);
            h(defpackage.ryq.a);
        }
    }

    final void h(defpackage.ryq ryqVar) {
        if (ryqVar == this.g) {
            return;
        }
        android.os.Handler handler = this.h;
        java.lang.Runnable runnable = this.j;
        handler.removeCallbacks(runnable);
        if (this.k && ryqVar.ordinal() > this.g.ordinal()) {
            defpackage.yhe yheVar = this.d;
            if (yheVar.containsKey(this.g)) {
                defpackage.omv.h(this.f, "com.google.android.gms.car.USB_ISSUE_FOUND", ((defpackage.ryr) yheVar.get(this.g)).b, null);
            }
        }
        defpackage.yhe yheVar2 = this.d;
        if (yheVar2.containsKey(ryqVar)) {
            handler.postDelayed(runnable, ((defpackage.ryr) yheVar2.get(ryqVar)).a());
        }
        a.l().ai(8559).M("transitioning %s -> %s", this.g, ryqVar);
        this.g = ryqVar;
        this.k = false;
    }

    public final void i() {
        android.content.Context context = this.f;
        rzh rzhVarA = rzi.a(context);
        if (!rzhVarA.b) {
            a.h().ai(8562).u("Could not launch FirstActivity because no android auto accessory was attached.");
            return;
        }
        a.f().ai(8560).u("Force starting first activity");
        android.content.Intent intentAddFlags = new android.content.Intent("com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START").setComponent((android.content.ComponentName) defpackage.riv.c.fF()).putExtra("accessory", rzhVarA.a).addFlags(268435456);
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        intentAddFlags.putExtra("EXTRA_GEARHEAD_ORIGIN", true);
        try {
            context.startActivity(intentAddFlags);
        } catch (android.content.ActivityNotFoundException e) {
            a.h().p(e).ai(8561).u("Could not launch Android Auto first activity");
        }
    }

    @Override // defpackage.ryv
    public final /* synthetic */ void v(java.lang.String str, defpackage.xyn xynVar) {
    }
}
