package defpackage;

/* loaded from: classes.dex */
public class auw extends aus implements cwu {
    private awo a;

    public auw(awo awoVar) {
        this.a = awoVar;
    }

    @Override // defpackage.aus
    public final awo b(awo awoVar) {
        return new awi(awoVar, this.a);
    }

    @Override // defpackage.aus
    public final void d() {
        super.d();
        bzi.q(this).I();
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        int iB = this.c.b(ctsVar, ctsVar.p()) - this.b.b(ctsVar, ctsVar.p());
        int iD = this.c.d(ctsVar) - this.b.d(ctsVar);
        int iC = this.c.c(ctsVar, ctsVar.p()) - this.b.c(ctsVar, ctsVar.p());
        int iA = (this.c.a(ctsVar) - this.b.a(ctsVar)) + iD;
        int i = iC + iB;
        cuo cuoVarV = ctoVar.v(dlf.h(j, -i, -iA));
        int i2 = cuoVarV.a + i;
        int iD2 = dle.d(j);
        if (i2 < iD2) {
            i2 = iD2;
        }
        int iB2 = dle.b(j);
        if (i2 > iB2) {
            i2 = iB2;
        }
        int i3 = cuoVarV.b + iA;
        int iC2 = dle.c(j);
        int iA2 = dle.a(j);
        if (i3 < iC2) {
            i3 = iC2;
        }
        if (i3 <= iA2) {
            iA2 = i3;
        }
        return ctsVar.eK(i2, iA2, afbf.a, new auv(cuoVarV, iB, iD, 0));
    }

    public final void f(awo awoVar) {
        if (affa.f(awoVar, this.a)) {
            return;
        }
        this.a = awoVar;
        d();
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
