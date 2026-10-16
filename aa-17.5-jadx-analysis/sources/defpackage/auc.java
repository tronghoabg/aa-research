package defpackage;

/* loaded from: classes.dex */
final class auc extends cfx implements cwu, cyq {
    public float a;
    public int b;

    public auc(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.cyq
    public final Object ek(Object obj) {
        aud audVar = obj instanceof aud ? (aud) obj : null;
        return audVar == null ? obj == null ? new aud() : obj : audVar;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        int iD;
        int iB;
        int iA;
        int i;
        if (!dle.h(j) || this.b == 1) {
            iD = dle.d(j);
            iB = dle.b(j);
        } else {
            float fB = dle.b(j) * this.a;
            int iD2 = dle.d(j);
            iD = dle.b(j);
            int iRound = Math.round(fB);
            if (iRound >= iD2) {
                iD2 = iRound;
            }
            if (iD2 <= iD) {
                iD = iD2;
            }
            iB = iD;
        }
        if (!dle.g(j) || this.b == 2) {
            int iC = dle.c(j);
            int iA2 = dle.a(j);
            iA = iC;
            i = iA2;
        } else {
            float fA = dle.a(j) * this.a;
            int iC2 = dle.c(j);
            iA = dle.a(j);
            int iRound2 = Math.round(fA);
            if (iRound2 >= iC2) {
                iC2 = iRound2;
            }
            if (iC2 <= iA) {
                iA = iC2;
            }
            i = iA;
        }
        cuo cuoVarV = ctoVar.v(dlf.d(iD, iB, iA, i));
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new acm(cuoVarV, 20));
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
