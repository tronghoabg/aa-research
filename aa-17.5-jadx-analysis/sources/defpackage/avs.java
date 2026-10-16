package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class avs extends cfx implements cwu {
    public avp a;

    public avs(avp avpVar) {
        this.a = avpVar;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        float fB = this.a.b(ctsVar.p());
        float fD = this.a.d();
        float fC = this.a.c(ctsVar.p());
        float fA = this.a.a();
        if (!((dlj.a(fB, BitmapDescriptorFactory.HUE_RED) >= 0) & (dlj.a(fD, BitmapDescriptorFactory.HUE_RED) >= 0) & (dlj.a(fC, BitmapDescriptorFactory.HUE_RED) >= 0) & (dlj.a(fA, BitmapDescriptorFactory.HUE_RED) >= 0))) {
            awx.a("Padding must be non-negative");
        }
        int iEF = ctsVar.eF(fB);
        int iEF2 = ctsVar.eF(fC) + iEF;
        int iEF3 = ctsVar.eF(fD);
        int iEF4 = ctsVar.eF(fA) + iEF3;
        cuo cuoVarV = ctoVar.v(dlf.h(j, -iEF2, -iEF4));
        int i = cuoVarV.a + iEF2;
        int iD = dle.d(j);
        int iB = dle.b(j);
        if (i < iD) {
            i = iD;
        }
        if (i <= iB) {
            iB = i;
        }
        int i2 = cuoVarV.b + iEF4;
        int iC = dle.c(j);
        int iA = dle.a(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return ctsVar.eK(iB, iA, afbf.a, new auv(cuoVarV, iEF, iEF3, 2));
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
