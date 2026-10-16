package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ikm implements defpackage.jbv, defpackage.iyy {
    public final java.lang.Object a = new java.lang.Object();
    public final java.util.List b = new java.util.ArrayList();

    static {
        defpackage.yqm.c("CarIntentService");
    }

    @Override // defpackage.jbv
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        if ((xpaVar.b & 131072) != 0) {
            return this;
        }
        return null;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new iyz(this, jbuVar);
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
    }
}
