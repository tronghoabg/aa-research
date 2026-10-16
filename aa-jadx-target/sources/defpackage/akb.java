package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class akb extends defpackage.cwo implements defpackage.czc, defpackage.cwm, defpackage.cyp {
    public defpackage.ask a;
    public final defpackage.affc b;
    public defpackage.asd c;
    public defpackage.azu d;
    public final defpackage.cjc e;

    public akb(defpackage.ask askVar, int i, defpackage.affc affcVar) {
        this.a = askVar;
        this.b = affcVar;
        defpackage.cjc cjcVar = new defpackage.cjc(i, false, new defpackage.aka(this), 10);
        W(cjcVar);
        this.e = cjcVar;
    }

    public final void a(defpackage.ask askVar, defpackage.asi asiVar) {
        if (!this.A) {
            askVar.c(asiVar);
        } else {
            aiwg aiwgVar = N().a.get(aiwg.d);
            ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ait(askVar, asiVar, aiwgVar != null ? aiwgVar.p(new defpackage.ajy(askVar, asiVar, 0)) : null, (defpackage.afdk) null, 4), 3);
        }
    }

    public final void b(defpackage.ask askVar) {
        defpackage.asd asdVar;
        if (defpackage.afga.f(this.a, askVar)) {
            return;
        }
        defpackage.ask askVar2 = this.a;
        if (askVar2 != null && (asdVar = this.c) != null) {
            askVar2.c(new defpackage.ase(asdVar));
        }
        this.c = null;
        this.a = askVar;
    }

    public final defpackage.azu d() {
        defpackage.afgv afgvVar = new defpackage.afgv();
        defpackage.dai.z(this, new defpackage.ajz(afgvVar, this, 0));
        return (defpackage.azu) afgvVar.a;
    }

    @Override // defpackage.cge
    public final void du() {
        defpackage.azu azuVar = this.d;
        if (azuVar != null) {
            azuVar.a();
        }
        this.d = null;
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        dekVar.a(defpackage.def.l, java.lang.Boolean.valueOf(this.e.g().b()));
        dekVar.a(defpackage.ddy.w, new defpackage.ddn(null, new defpackage.bgp((java.lang.Object) this, 1, (byte[]) null)));
    }

    @Override // defpackage.cyp
    public final void r() {
        defpackage.azu azuVarD = d();
        if (this.e.g().b()) {
            defpackage.azu azuVar = this.d;
            if (azuVar != null) {
                azuVar.a();
            }
            if (azuVarD != null) {
                azuVarD.d();
            } else {
                azuVarD = null;
            }
            this.d = azuVarD;
        }
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }
}
