package defpackage;

/* loaded from: classes.dex */
final class awk extends cfx implements cwu {
    public float a;
    public float b;

    public awk(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        int iD;
        int iC;
        if (Float.isNaN(this.a) || dle.d(j) != 0) {
            iD = dle.d(j);
        } else {
            int iEF = ctsVar.eF(this.a);
            iD = dle.b(j);
            if (iEF < 0) {
                iEF = 0;
            }
            if (iEF <= iD) {
                iD = iEF;
            }
        }
        int iB = dle.b(j);
        if (Float.isNaN(this.b) || dle.c(j) != 0) {
            iC = dle.c(j);
        } else {
            int iEF2 = ctsVar.eF(this.b);
            iC = dle.a(j);
            int i = iEF2 >= 0 ? iEF2 : 0;
            if (i <= iC) {
                iC = i;
            }
        }
        cuo cuoVarV = ctoVar.v(dlf.d(iD, iB, iC, dle.a(j)));
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new aui(cuoVarV, 9));
    }

    @Override // defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) {
        int iC = cspVar.c(i);
        int iEF = !Float.isNaN(this.b) ? csqVar.eF(this.b) : 0;
        return iC < iEF ? iEF : iC;
    }

    @Override // defpackage.cwu
    public final int i(csq csqVar, csp cspVar, int i) {
        int iD = cspVar.d(i);
        int iEF = !Float.isNaN(this.a) ? csqVar.eF(this.a) : 0;
        return iD < iEF ? iEF : iD;
    }

    @Override // defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) {
        int iE = cspVar.e(i);
        int iEF = !Float.isNaN(this.b) ? csqVar.eF(this.b) : 0;
        return iE < iEF ? iEF : iE;
    }

    @Override // defpackage.cwu
    public final int k(csq csqVar, csp cspVar, int i) {
        int iF = cspVar.f(i);
        int iEF = !Float.isNaN(this.a) ? csqVar.eF(this.a) : 0;
        return iF < iEF ? iEF : iF;
    }
}
