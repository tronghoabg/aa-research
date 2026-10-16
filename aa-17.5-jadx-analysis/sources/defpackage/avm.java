package defpackage;

/* loaded from: classes.dex */
public final class avm extends cfx implements cwu {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e = true;

    public avm(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        int iEF = ctsVar.eF(this.a) + ctsVar.eF(this.c);
        int iEF2 = ctsVar.eF(this.b) + ctsVar.eF(this.d);
        cuo cuoVarV = ctoVar.v(dlf.h(j, -iEF, -iEF2));
        int i = cuoVarV.a + iEF;
        int iD = dle.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = dle.b(j);
        if (i > iB) {
            i = iB;
        }
        int i2 = cuoVarV.b + iEF2;
        int iC = dle.c(j);
        int iA = dle.a(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return ctsVar.eK(i, iA, afbf.a, new aju(this, cuoVarV, 10, null));
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
}
