package defpackage;

/* loaded from: classes.dex */
abstract class avb extends cfx implements cwu {
    public abstract boolean d();

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        long jF = f(ctoVar, j);
        if (d()) {
            jF = dlf.f(j, jF);
        }
        cuo cuoVarV = ctoVar.v(jF);
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new aui(cuoVarV, 7));
    }

    public abstract long f(cto ctoVar, long j);

    public int h(csq csqVar, csp cspVar, int i) {
        return cspVar.c(i);
    }

    @Override // defpackage.cwu
    public int i(csq csqVar, csp cspVar, int i) {
        return cspVar.d(i);
    }

    public int j(csq csqVar, csp cspVar, int i) {
        return cspVar.e(i);
    }

    @Override // defpackage.cwu
    public int k(csq csqVar, csp cspVar, int i) {
        return cspVar.f(i);
    }
}
