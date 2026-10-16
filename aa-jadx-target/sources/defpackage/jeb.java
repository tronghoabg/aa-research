package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jeb implements defpackage.izd {
    public final defpackage.izd a;
    private final defpackage.jdb b;
    private final defpackage.jdb c;
    private final defpackage.mbt d;

    public jeb(defpackage.izd izdVar, defpackage.jdb jdbVar, defpackage.jdb jdbVar2, defpackage.mbt mbtVar) {
        this.a = izdVar;
        this.b = jdbVar;
        this.c = jdbVar2;
        this.d = mbtVar;
    }

    private static final defpackage.jdc a(defpackage.jdb jdbVar, defpackage.jbq jbqVar, defpackage.xzi xziVar) {
        return jdbVar != defpackage.jdc.c ? jdbVar.a(jbqVar) : (defpackage.jdc) xziVar.fF();
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        defpackage.jbq jbqVarB = this.a.b(jbuVar);
        if (jbqVarB == null) {
            return null;
        }
        return new defpackage.jee(jbqVarB, this.d, a(this.b, jbqVarB, new defpackage.ilu(this, 10)), a(this.c, jbqVarB, new defpackage.ilu(this, 11)));
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        throw new java.lang.UnsupportedOperationException("Should not be wrapping a Proxy Car Service");
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        throw new java.lang.UnsupportedOperationException("Should not be wrapping a Proxy Car Service");
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
        this.a.r(jbqVar);
    }
}
