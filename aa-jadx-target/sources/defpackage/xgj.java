package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xgj implements qll {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.PassengerModeUiContr");
    public defpackage.sax d;
    public final sav b = new sav() { // from class: xgh
        public final void i(boolean z) {
            this.a.b(z);
        }
    };
    private final java.lang.Runnable g = new xgr(this, 1);
    private final android.os.Handler h = new android.os.Handler();
    public boolean c = true;
    public final defpackage.eqs e = new defpackage.eqs();
    public final defpackage.kfp f = new defpackage.xgi(this);

    public final void a() {
        ((defpackage.yqj) a.l().ai((char) 10260)).u("cancelling notification");
        this.h.removeCallbacks(this.g);
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) defpackage.mkp.a.c.getSystemService("notification");
        defpackage.maz.c();
        notificationManager.cancel("gearhead_alerts", 87859647);
    }

    public final void b(boolean z) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 10262)).y("video focus changed: %b", java.lang.Boolean.valueOf(z));
        defpackage.sax saxVar = this.d;
        if (saxVar == null) {
            defpackage.rox.o("GH.PassengerModeUiContr", "onVideoFocusChanged called but CarWindowManager was null", new java.lang.Object[0]);
            return;
        }
        if (z) {
            a();
            this.d.h(this.b);
            defpackage.kit.b().w(this.f);
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10261)).u("lock screen user disabled");
            defpackage.mpd.b().e();
            this.e.m(defpackage.mpc.c);
            return;
        }
        saxVar.e(this.b);
        if (!this.c) {
            this.e.m(defpackage.mpc.b);
            android.content.Context context = defpackage.mkp.a.c;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.carhome.ProjectedHomeActivity.class);
            intent.setFlags(335544320);
            context.startActivity(intent, defpackage.luq.c());
            return;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 10264)).u("showing notification");
        android.content.Context context2 = defpackage.mkp.a.c;
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) context2.getSystemService("notification");
        defpackage.maz.c();
        defpackage.dte dteVar = new defpackage.dte(context2, "gearhead_alerts");
        android.app.Notification notification = dteVar.y;
        notification.defaults = -1;
        notification.flags |= 1;
        dteVar.n(2131233012);
        android.graphics.drawable.Drawable drawable = context2.getResources().getDrawable(2131233012);
        dteVar.k(defpackage.kfn.b(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
        dteVar.i(context2.getResources().getString(2132084620));
        dteVar.h(context2.getResources().getString(2132084619));
        dteVar.i = 2;
        defpackage.maz.c();
        notificationManager.notify("gearhead_alerts", 87859647, dteVar.a());
        defpackage.omf.u().o(defpackage.zbe.LOCK_SCREEN, defpackage.zbd.js);
        this.h.postDelayed(this.g, 7000L);
    }
}
