package defpackage;

/* loaded from: classes.dex */
public final class avh extends cfx implements cwu {
    public float a;
    public float b;
    public boolean c = true;

    public avh(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        cuo cuoVarV = ctoVar.v(j);
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new aju(this, cuoVarV, 8, null));
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

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }
}
