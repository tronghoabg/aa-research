package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jea implements defpackage.izd, defpackage.jbv {
    private final int a;
    private final defpackage.rsi b;

    public jea(int i, defpackage.rsi rsiVar) {
        this.a = i;
        this.b = rsiVar;
    }

    @Override // defpackage.jbv
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        if (xpaVar.c == this.a) {
            return this;
        }
        return null;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new defpackage.jdz(this.b.a(), this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.jdc.a;
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.jdc.a;
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
