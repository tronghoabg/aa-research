package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class lni implements lkb, defpackage.lkf {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MediaPlaybackMonitor");
    public final android.content.Context b;
    protected lkc c;
    protected defpackage.ltn d;
    public defpackage.ltn e;
    protected defpackage.ltn f;
    ltc h;
    public defpackage.lmk i;
    public boolean k;
    private boolean o;
    private boolean p;
    private final defpackage.lne m = new defpackage.lne(this);
    protected boolean j = false;
    private boolean q = true;
    private final java.lang.Runnable r = new defpackage.lmh(this, 3);
    protected final android.content.BroadcastReceiver l = new lnd();
    private final android.content.BroadcastReceiver n = new defpackage.lnf(this);
    public final defpackage.lnh g = new defpackage.lnh(this);

    public lni(android.content.Context context) {
        this.b = context;
    }

    public static boolean r(android.content.ComponentName componentName) {
        return componentName.equals(defpackage.mkt.F) || componentName.equals(defpackage.mkt.G);
    }

    private final void s(defpackage.lmk lmkVar) {
        defpackage.lnh lnhVar = this.g;
        android.os.Message messageObtainMessage = lnhVar.obtainMessage(1, lmkVar);
        lnhVar.removeMessages(1);
        lnhVar.sendMessage(messageObtainMessage);
    }

    private final void t() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.MEDIA_BUTTON");
        android.content.Context context = this.b;
        defpackage.duw.e(context, this.n, intentFilter, null, 2);
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addAction("android.media.action.MEDIA_PLAY_FROM_SEARCH");
        intentFilter2.addAction("android.intent.action.MEDIA_SEARCH");
        defpackage.duw.e(context, this.l, intentFilter2, null, 2);
    }

    public final void a(android.content.ComponentName componentName, android.content.ComponentName componentName2) {
        ((defpackage.yqj) a.l().ai((char) 4031)).M("MediaBrowser onMediaAppChanged called current=%s new=%s", componentName, componentName2);
        this.g.removeCallbacksAndMessages(null);
    }

    public final void b() {
        ((defpackage.yqj) a.l().ai((char) 4032)).u("MediaBrowser onConnected called");
        this.g.removeCallbacksAndMessages(null);
        this.q = true;
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackStateC = this.c.c();
        if (aaPlaybackStateC != null) {
            h(aaPlaybackStateC);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public void d() throws wfo {
        defpackage.wfp.c();
        if (this.o) {
            android.content.Context context = this.b;
            context.unregisterReceiver(this.l);
            context.unregisterReceiver(this.n);
            if (defpackage.lmp.a().e()) {
                this.d = null;
                this.e = null;
                this.f = null;
            } else {
                ltc ltcVar = this.h;
                ltcVar.c(true);
                ltcVar.b.e(ltcVar.i);
                this.h = null;
                this.c.g();
                this.c = null;
            }
            o();
            if (defpackage.actz.A()) {
                defpackage.wfp.f(this.r);
            }
            defpackage.lnh lnhVar = this.g;
            defpackage.wfp.c();
            kfv kfvVar = lnhVar.j;
            if (kfvVar != null) {
                lnhVar.g.a(kfvVar);
                lnhVar.j = null;
            }
            lng lngVar = lnhVar.h;
            if (lngVar != null) {
                lngVar.cancel(true);
                lnhVar.h = null;
            }
            lnhVar.removeCallbacksAndMessages(null);
            this.o = false;
            this.i = null;
        }
    }

    public final void e(java.lang.CharSequence charSequence) {
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 4033)).u("Media browser service connection FAILED!");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo {
        ((defpackage.yqj) a.l().ai((char) 4043)).u("start called");
        defpackage.wfp.c();
        int i = 1;
        if (defpackage.actz.A()) {
            this.k = true;
            defpackage.wfp.d(this.r, defpackage.actz.f());
        }
        if (!defpackage.lmp.a().e()) {
            this.c = defpackage.kzi.s().b();
            n();
            this.c.d(this);
            ltc ltcVar = new ltc(this.c);
            this.h = ltcVar;
            ltcVar.b.d(ltcVar.i);
            this.c.f();
            t();
            this.o = true;
            return;
        }
        defpackage.zbe zbeVar = defpackage.zbe.MEDIA_FACET;
        this.d = defpackage.ltu.e(zbeVar, null, null, null, 14);
        defpackage.eqp eqpVarT = defpackage.tcu.t(defpackage.lhe.b().a(defpackage.mqg.PHONE_MEDIA));
        this.e = defpackage.ltu.e(zbeVar, eqpVarT, defpackage.tcu.C(eqpVarT, new defpackage.lnc(i)), null, 8);
        int i2 = 20;
        this.f = defpackage.ltu.c(zbeVar, defpackage.tcu.t(defpackage.tcu.w(defpackage.lsd.a().c, new defpackage.llk(i2))), defpackage.ltu.d());
        ((defpackage.ltt) this.d).d.eM(defpackage.ler.c(), new defpackage.lkt(4));
        ((defpackage.ltt) this.e).d.eM(defpackage.ler.c(), new defpackage.lkt(5));
        defpackage.tcu.n(((defpackage.ltt) this.f).a).eM(defpackage.ler.c(), new defpackage.kqk(this, 18));
        defpackage.tcu.n(defpackage.tcu.z(defpackage.tcu.t(((defpackage.ltt) this.f).d), defpackage.tcu.t(defpackage.tcu.w(((defpackage.ltt) this.f).e, new defpackage.lnc(2))))).eM(defpackage.ler.c(), new defpackage.kqk(this, 19));
        defpackage.tcu.n(defpackage.tcu.t(((defpackage.ltt) this.f).c)).eM(defpackage.ler.c(), new defpackage.kqk(this, i2));
        defpackage.tcu.F(defpackage.tcu.t(defpackage.tcu.w(((defpackage.ltt) this.d).a, new defpackage.lnc(0))), new defpackage.ixc(11)).eM(defpackage.ler.c(), new defpackage.lnj(this, 1));
        t();
        n();
        this.o = true;
    }

    public final void f() {
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4034)).u("Media browser service connection suspended. Waiting to be reconnected....");
    }

    public final void g(defpackage.lmk lmkVar) {
        defpackage.yqm yqmVar = a;
        if (yqmVar.l().Z()) {
            ((defpackage.yqj) yqmVar.l().ai((char) 4039)).y("onMetadataChanged called with %s", j$.util.Objects.toString(lmkVar));
        }
        if (lmkVar != null) {
            lmkVar.h();
            lmj lmjVarH = lmkVar.h();
            if (android.text.TextUtils.isEmpty(lmjVarH.S()) && android.text.TextUtils.isEmpty(lmjVarH.R())) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 4038)).u("Invalid metadata, no title and subtitle.");
                return;
            }
            defpackage.lmk lmkVar2 = this.i;
            if (lmkVar2 != null) {
                lmj lmjVarH2 = lmkVar.h();
                lmj lmjVarH3 = lmkVar2.h();
                if (android.text.TextUtils.equals(lmjVarH2.S(), lmjVarH3.S()) && android.text.TextUtils.equals(lmjVarH2.R(), lmjVarH3.R()) && android.text.TextUtils.equals(lmjVarH2.Q(), lmjVarH3.Q()) && lmkVar.O("android.media.metadata.DURATION") == lmkVar2.O("android.media.metadata.DURATION")) {
                    android.graphics.Bitmap bitmapO = lmjVarH.O();
                    if (bitmapO == null) {
                        ((defpackage.yqj) yqmVar.l().ai((char) 4037)).u("No album art");
                        return;
                    }
                    android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapO, 256, 256, false);
                    defpackage.lnh lnhVar = this.g;
                    if (bitmapCreateScaledBitmap.sameAs(lnhVar.f)) {
                        ((defpackage.yqj) yqmVar.l().ai((char) 4036)).u("Received duplicate metadata, ignoring...");
                        return;
                    }
                    ((defpackage.yqj) yqmVar.l().ai((char) 4035)).u("Received metadata with new album art");
                    android.os.Message messageObtainMessage = lnhVar.obtainMessage(3, bitmapCreateScaledBitmap);
                    lnhVar.removeMessages(3);
                    lnhVar.sendMessage(messageObtainMessage);
                    return;
                }
            }
            s(lmkVar);
        }
    }

    public final void h(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState) {
        if (aaPlaybackState == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4040)).u("playback state is null in onPlaybackStateChanged");
        } else {
            l(aaPlaybackState, this.c.a().c);
        }
    }

    public final void i(boolean z) {
        if (z) {
            return;
        }
        s(this.c.b());
    }

    public final void j(java.lang.CharSequence charSequence) {
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 4042)).u("Media session is destroyed");
    }

    @Override // defpackage.lkf
    public final boolean k() {
        return this.p;
    }

    public final void l(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, java.lang.String str) {
        aaPlaybackState.Q();
        if (this.q && !defpackage.lmp.a().e()) {
            this.q = false;
            s(this.c.b());
        }
        m();
        defpackage.lne lneVar = this.m;
        if (aaPlaybackState == null) {
            throw new java.lang.IllegalArgumentException("playbackstate cannot be null");
        }
        lneVar.a = aaPlaybackState;
        lneVar.b = str;
        this.g.post(lneVar);
        int iQ = aaPlaybackState.Q();
        this.p = iQ == 3 || iQ == 6;
    }

    protected final void m() {
        this.g.removeCallbacks(this.m);
    }

    protected void n() {
    }

    protected void o() {
    }

    protected void q(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, java.lang.String str) {
    }

    protected void p(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr, long j) {
    }
}
