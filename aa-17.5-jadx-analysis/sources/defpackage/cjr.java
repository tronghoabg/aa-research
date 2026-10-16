package defpackage;

/* loaded from: classes.dex */
public final class cjr extends cfx implements cwu, cyu {
    public afec a;

    public cjr(afec afecVar) {
        this.a = afecVar;
    }

    public final void d() {
        cjn.v(this, this.a);
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        cuo cuoVarV = ctoVar.v(j);
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new bee(cuoVarV, this, 16));
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        ckv ckvVar;
        boolean z;
        cyc cycVarR = bzi.r(this, 2);
        if (cycVarR.E) {
            ckvVar = cycVarR.A;
            z = cycVarR.D;
        } else {
            cks cksVar = cjn.a;
            if (cksVar == null) {
                cjn.a = new cks();
            } else {
                cksVar.n();
            }
            cks cksVar2 = cjn.a;
            cksVar2.getClass();
            cksVar2.t = cycVarR.t.r;
            cksVar2.r = dln.k(cycVarR.c);
            cec cecVar = (cec) cek.i.j();
            afec afecVarI = cecVar != null ? cecVar.i() : null;
            cec cecVarI = byx.i(cecVar);
            try {
                this.a.invoke(cksVar2);
                byx.l(cecVar, cecVarI, afecVarI);
                ckvVar = cksVar2.o;
                z = cksVar2.p;
            } catch (Throwable th) {
                byx.l(cecVar, cecVarI, afecVarI);
                throw th;
            }
        }
        if (z) {
            decVar.a(ddx.T, ckvVar);
        }
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int h(csq csqVar, csp cspVar, int i) {
        return ty.d(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int i(csq csqVar, csp cspVar, int i) {
        return ty.e(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int j(csq csqVar, csp cspVar, int i) {
        return ty.f(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int k(csq csqVar, csp cspVar, int i) {
        return ty.g(new cwt(this), csqVar, cspVar, i);
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.a + ")";
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.cyu
    public final boolean z() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }
}
