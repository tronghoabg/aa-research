package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ixi implements defpackage.jbf {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.MIC");
    public com.google.android.gms.car.CarAudioConfiguration[] c;
    public volatile defpackage.jbg d;
    public final android.content.Context h;
    public final boolean i;
    public final defpackage.isn j;
    public volatile iwc k;
    public volatile boolean b = false;
    public final java.util.List e = new java.util.ArrayList();
    public final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger();
    private final android.os.Handler l = new defpackage.rce(this, android.os.Looper.getMainLooper());
    private final java.lang.Runnable m = new defpackage.ire(this, 9);
    public volatile boolean g = false;

    public ixi(android.content.Context context, boolean z, defpackage.isn isnVar) {
        this.h = context;
        this.i = z;
        this.j = isnVar;
    }

    public final void a() {
        if (!this.b) {
            throw new java.lang.IllegalStateException("Attempted to use MicrophoneInputService before end point is ready.");
        }
    }

    @Override // defpackage.izd
    public final /* synthetic */ defpackage.jbq b(defpackage.jbu jbuVar) {
        return new defpackage.jbg(this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    public final void e() {
        this.l.postDelayed(this.m, 2000L);
    }

    public final void f() {
        this.l.removeCallbacks(this.m);
    }

    @Override // defpackage.izd
    public final void m(java.io.PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.izd
    public final void q() {
        throw null;
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        this.d = (defpackage.jbg) jbqVar;
        this.b = true;
    }
}
