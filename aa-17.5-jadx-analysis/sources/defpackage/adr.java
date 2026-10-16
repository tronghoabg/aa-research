package defpackage;

/* loaded from: classes.dex */
final class adr extends cfx implements cwu {
    public float a;

    public adr(float f) {
        this.a = f;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        cuo cuoVarV = ctoVar.v(j);
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new abi(cuoVarV, this, 12));
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int h(csq csqVar, csp cspVar, int i) {
        return tv.c(this, csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int i(csq csqVar, csp cspVar, int i) {
        return tv.d(this, csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int j(csq csqVar, csp cspVar, int i) {
        return tv.e(this, csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int k(csq csqVar, csp cspVar, int i) {
        return tv.f(this, csqVar, cspVar, i);
    }
}
