package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
final class aww extends cfx implements cwu {
    public boolean a;
    public afeg b;
    public int c;

    public aww(int i, boolean z, afeg afegVar) {
        this.c = i;
        this.a = z;
        this.b = afegVar;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        int i = this.c;
        int iC = 0;
        int iD = i != 1 ? 0 : dle.d(j);
        if (i == 2) {
            iC = dle.c(j);
            i = 2;
        }
        int iA = Alert.DURATION_SHOW_INDEFINITELY;
        int iB = (i == 1 || !this.a) ? dle.b(j) : Integer.MAX_VALUE;
        if (i == 2 || !this.a) {
            iA = dle.a(j);
        }
        cuo cuoVarV = ctoVar.v(dlf.d(iD, iB, iC, iA));
        int iG = afpt.g(cuoVarV.a, dle.d(j), dle.b(j));
        int iG2 = afpt.g(cuoVarV.b, dle.c(j), dle.a(j));
        return ctsVar.eK(iG, iG2, afbf.a, new awv(this, iG, cuoVarV, iG2, ctsVar, 0));
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
