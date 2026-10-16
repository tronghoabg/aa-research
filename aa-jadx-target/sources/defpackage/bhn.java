package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bhn extends defpackage.cwo implements defpackage.cwm, defpackage.bhs {
    public defpackage.affc a;
    public defpackage.affc b;
    public defpackage.affc c;
    public aiwg d;
    public defpackage.vuj e;
    private final defpackage.bys f;
    private defpackage.cjj g;

    public bhn(defpackage.vuj vujVar, defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.affc affcVar3) {
        this.e = vujVar;
        this.a = affcVar;
        this.b = affcVar2;
        this.c = affcVar3;
        defpackage.bfd bfdVar = new defpackage.bfd(this, 9);
        defpackage.lam lamVar = defpackage.byp.a;
        this.f = new defpackage.bvr(bfdVar, null);
        this.g = defpackage.cjj.a;
    }

    @Override // defpackage.bhs
    public final long a(defpackage.ctc ctcVar) {
        return c(ctcVar).c();
    }

    @Override // defpackage.bhs
    public final defpackage.bfx b() {
        return (defpackage.bfx) this.f.a();
    }

    @Override // defpackage.bhs
    public final defpackage.cjj c(defpackage.ctc ctcVar) {
        java.lang.Object objInvoke;
        if (!this.A || (objInvoke = this.c.invoke(ctcVar)) == null) {
            return this.g;
        }
        defpackage.cjj cjjVar = (defpackage.cjj) objInvoke;
        this.g = cjjVar;
        return cjjVar;
    }

    @Override // defpackage.cge
    public final void dz() {
        defpackage.vuj vujVar = this.e;
        vujVar.a = 3;
        vujVar.b = this;
    }

    @Override // defpackage.cge
    public final void q() {
        defpackage.vuj vujVar = this.e;
        vujVar.a = 2;
        vujVar.b = null;
    }
}
