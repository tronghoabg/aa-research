package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bix extends cwe implements cwu, cwk, cwl, cwc, cyg, cws, czb {
    public biy a;
    public final bjg b;
    public boolean c;

    public bix(deu deuVar, dfw dfwVar, wci wciVar, afec afecVar, int i, boolean z, int i2, int i3, List list, afec afecVar2, biy biyVar) {
        this.a = biyVar;
        bjg bjgVar = new bjg(deuVar, dfwVar, wciVar, afecVar, i, z, i2, i3, list, afecVar2, this.a, null);
        W(bjgVar);
        this.b = bjgVar;
        if (this.a != null) {
            return;
        }
        asl.a("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new aezp();
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        this.b.b(cxdVar);
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        return this.b.el(ctsVar, ctoVar, j);
    }

    @Override // defpackage.czb
    public final void en() {
        if (this.c) {
            this.c = false;
            biy biyVar = this.a;
            if (biyVar != null) {
                biyVar.b();
            }
        }
    }

    @Override // defpackage.cfx
    public final void er() {
        biy biyVar = this.a;
        if (biyVar != null) {
            biyVar.c(l());
        }
    }

    @Override // defpackage.cwl
    public final void es(cst cstVar) {
        biy biyVar = this.a;
        if (biyVar != null) {
            biyVar.d = bjd.a(biyVar.d, cstVar, null, null, 6);
            biyVar.b.d();
        }
    }

    @Override // defpackage.cws
    public final void f(cst cstVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        biy biyVar = this.a;
        if (biyVar != null) {
            biyVar.a();
        }
    }

    @Override // defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) {
        return this.b.h(csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final int i(csq csqVar, csp cspVar, int i) {
        return this.b.i(csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) {
        return this.b.j(csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final int k(csq csqVar, csp cspVar, int i) {
        return this.b.k(csqVar, cspVar, i);
    }

    public final azp l() {
        affv affvVar = new affv();
        cjn.p(this, new aiy(affvVar, this, 18, null));
        return (azp) affvVar.a;
    }

    @Override // defpackage.cfx
    public final void q() {
        biy biyVar = this.a;
        if (biyVar != null) {
            biyVar.c(null);
        }
    }

    @Override // defpackage.cyg
    public final void r() {
        biy biyVar = this.a;
        if (biyVar != null) {
            biyVar.c(l());
        }
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.cxs
    public final /* synthetic */ void et(long j) {
    }
}
