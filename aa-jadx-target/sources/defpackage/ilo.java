package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ilo implements defpackage.jcl, defpackage.jbv {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WIFI_PROJ");
    public jcm b;
    public volatile boolean c;
    public java.lang.String d;
    public android.content.Context e;
    public com.google.android.gms.carsetup.CarInfoInternal f;
    public final defpackage.jez g;

    public ilo(defpackage.jez jezVar) {
        this.g = jezVar;
    }

    @Override // defpackage.jbv
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        if ((xpaVar.b & 8192) == 0) {
            return null;
        }
        defpackage.xqm xqmVar = xpaVar.l;
        if (xqmVar == null) {
            xqmVar = defpackage.xqm.a;
        }
        this.d = xqmVar.b;
        ((defpackage.yqj) a.l().ai(270)).y("onServiceDiscovery. Car wifi BSSID is %s", this.d);
        return this;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new jcm(this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
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
        this.b = (jcm) jbqVar;
        this.c = true;
    }
}
