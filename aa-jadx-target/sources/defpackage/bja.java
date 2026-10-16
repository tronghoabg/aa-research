package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bja extends defpackage.cwo implements defpackage.cxe, defpackage.cwu, defpackage.cwv, defpackage.cwm, defpackage.cyp, defpackage.cxc, defpackage.czj {
    public defpackage.bjb a;
    public final defpackage.bjk b;
    public boolean c;

    public bja(defpackage.dfb dfbVar, defpackage.dgd dgdVar, defpackage.wde wdeVar, defpackage.affc affcVar, int i, boolean z, int i2, int i3, java.util.List list, defpackage.affc affcVar2, defpackage.bjb bjbVar) {
        this.a = bjbVar;
        defpackage.bjk bjkVar = new defpackage.bjk(dfbVar, dgdVar, wdeVar, affcVar, i, z, i2, i3, list, affcVar2, this.a, null);
        W(bjkVar);
        this.b = bjkVar;
        if (this.a != null) {
            return;
        }
        defpackage.asq.a("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new defpackage.afap();
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        this.b.b(cxnVar);
    }

    @Override // defpackage.cwv
    public final void dA(defpackage.ctc ctcVar) {
        defpackage.bjb bjbVar = this.a;
        if (bjbVar != null) {
            bjbVar.d = defpackage.bjh.a(bjbVar.d, ctcVar, null, null, 6);
            bjbVar.b.d();
        }
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        return this.b.dt(cubVar, ctxVar, j);
    }

    @Override // defpackage.czj
    public final void dv() {
        if (this.c) {
            this.c = false;
            defpackage.bjb bjbVar = this.a;
            if (bjbVar != null) {
                bjbVar.b();
            }
        }
    }

    @Override // defpackage.cge
    public final void dz() {
        defpackage.bjb bjbVar = this.a;
        if (bjbVar != null) {
            bjbVar.c(l());
        }
    }

    @Override // defpackage.cxc
    public final void f(defpackage.ctc ctcVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        defpackage.bjb bjbVar = this.a;
        if (bjbVar != null) {
            bjbVar.a();
        }
    }

    @Override // defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return this.b.h(cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return this.b.i(cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return this.b.j(cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return this.b.k(cszVar, csyVar, i);
    }

    public final defpackage.azu l() {
        defpackage.afgv afgvVar = new defpackage.afgv();
        defpackage.dai.z(this, new defpackage.ajz(afgvVar, this, 17));
        return (defpackage.azu) afgvVar.a;
    }

    @Override // defpackage.cge
    public final void q() {
        defpackage.bjb bjbVar = this.a;
        if (bjbVar != null) {
            bjbVar.c(null);
        }
    }

    @Override // defpackage.cyp
    public final void r() {
        defpackage.bjb bjbVar = this.a;
        if (bjbVar != null) {
            bjbVar.c(l());
        }
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.cyb
    public final /* synthetic */ void dB(long j) {
    }
}
