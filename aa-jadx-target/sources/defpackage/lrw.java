package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lrw extends defpackage.lhm {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MediaSuggNotifier");
    static final long b;
    public final android.content.Context d;
    public defpackage.eqp e;
    public android.content.ComponentName f;
    public lqa g;
    private final defpackage.eqt i = new defpackage.lnj(this, 8);
    public final defpackage.eqt c = new defpackage.lnj(this, 9);
    public final defpackage.onf h = new defpackage.onf(defpackage.tgf.GEARHEAD_CAR_PROJECTION_MEDIA_SUGGESTION_ITEM_ALBUM_ART, new defpackage.lrs(this));
    private final defpackage.lrv l = new defpackage.lrv(this);
    private final defpackage.eqp k = defpackage.tcu.C(defpackage.ebo.e(defpackage.tcu.C(defpackage.lhe.b().a(defpackage.mqg.MEDIA), new defpackage.lqi(13))), new defpackage.lqi(14));

    static {
        int i = defpackage.yud.a;
        b = defpackage.ytv.a.b("MediaAlwaysAutoplayButtonNotification").c();
    }

    public lrw(android.content.Context context) {
        this.d = context;
    }

    public static void b(defpackage.zbd zbdVar, android.content.ComponentName componentName) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_CONTENT_SUGGESTION, zbdVar);
        rrvVarH.p(componentName);
        defpackage.omf.u().F((defpackage.rrw) rrvVarH.l());
    }

    private static android.content.Intent h(java.lang.String str, android.content.ComponentName componentName) {
        android.content.Intent intent = new android.content.Intent(str).setPackage("com.google.android.projection.gearhead");
        intent.putExtra("media_suggestion_target_app_key", componentName);
        return intent;
    }

    private static java.lang.CharSequence i(java.lang.CharSequence charSequence) {
        return android.text.TextUtils.isEmpty(charSequence) ? "" : charSequence;
    }

    public final void a(lqa lqaVar, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon) {
        android.content.Context context = this.d;
        java.lang.CharSequence charSequenceF = lqaVar.f(context);
        java.lang.CharSequence charSequenceE = lqaVar.e(context);
        android.content.ComponentName componentNameA = lqaVar.a();
        android.content.Intent intentH = h("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_PLAY", componentNameA);
        intentH.putExtra("media_suggestion_playback_payload_key", (android.os.Parcelable) lqaVar.d());
        aafz aafzVar = new aafz((byte[]) null);
        aafzVar.e = com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context, 2131233143);
        aafzVar.b = android.app.PendingIntent.getBroadcast(context, 0, intentH, 201326592);
        nvb nvbVar = new nvb(aafzVar);
        nvc nvcVar = new nvc();
        nvcVar.d = ghIcon;
        nvcVar.c = android.app.PendingIntent.getBroadcast(context, 0, h("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_ICON", componentNameA), 201326592);
        nvcVar.f = componentNameA.getPackageName();
        nvcVar.B = componentNameA;
        nvcVar.x = defpackage.nve.b;
        nvcVar.a = nvf.b;
        nvcVar.m = i(charSequenceF);
        nvcVar.n = i(charSequenceE);
        nvcVar.l = true;
        nvcVar.q = nvbVar;
        nvh nvhVarB = nvcVar.b();
        android.content.ComponentName componentNameA2 = lqaVar.a();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(4243)).M("Posting notification: %s for component: %s", nvhVarB, componentNameA2);
        defpackage.nuz.b().j(defpackage.zaw.MEDIA.name(), b, nvhVarB);
        this.f = componentNameA2;
        b(defpackage.zbd.gA, lqaVar.a());
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        super.d();
        this.d.unregisterReceiver(this.l);
        g();
        this.e = null;
        this.f = null;
    }

    public final void e() {
        if (this.f == null) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4232)).u("Canceling posted notification.");
        this.h.b(this.d);
        this.g = null;
        defpackage.nuz.b().g(defpackage.zaw.MEDIA.name(), b, this.f.getPackageName());
        this.f = null;
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        super.eQ();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_ICON");
        intentFilter.addAction("com.google.android.gearhead.mediacontentsuggestionnotifier.ACTION_PLAY");
        boolean zN = defpackage.actz.N();
        android.content.Context context = this.d;
        if (zN) {
            defpackage.duw.e(context, this.l, intentFilter, null, 4);
        } else {
            defpackage.duw.e(context, this.l, intentFilter, null, 2);
        }
        this.k.eM(this, this.i);
    }

    public final void f() {
        if (this.e == null) {
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 4235)).u("Removing media suggestion observer.");
        this.e.k(this.c);
        this.e = null;
    }

    public final void g() {
        ((defpackage.yqj) a.l().ai((char) 4244)).u("Removing all observers.");
        this.k.k(this.i);
        f();
        e();
    }
}
