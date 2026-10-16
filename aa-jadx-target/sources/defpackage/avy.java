package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class avy extends defpackage.cge implements defpackage.cxe {
    public defpackage.avv a;

    public avy(defpackage.avv avvVar) {
        this.a = avvVar;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        float fB = this.a.b(cubVar.p());
        float fD = this.a.d();
        float fC = this.a.c(cubVar.p());
        float fA = this.a.a();
        if (!((defpackage.dlr.a(fB, 0.0f) >= 0) & (defpackage.dlr.a(fD, 0.0f) >= 0) & (defpackage.dlr.a(fC, 0.0f) >= 0) & (defpackage.dlr.a(fA, 0.0f) >= 0))) {
            defpackage.axd.a("Padding must be non-negative");
        }
        int iDN = cubVar.dN(fB);
        int iDN2 = cubVar.dN(fC) + iDN;
        int iDN3 = cubVar.dN(fD);
        int iDN4 = cubVar.dN(fA) + iDN3;
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dln.h(j, -iDN2, -iDN4));
        int i = cuxVarV.a + iDN2;
        int iD = defpackage.dlm.d(j);
        int iB = defpackage.dlm.b(j);
        if (i < iD) {
            i = iD;
        }
        if (i <= iB) {
            iB = i;
        }
        int i2 = cuxVarV.b + iDN4;
        int iC = defpackage.dlm.c(j);
        int iA = defpackage.dlm.a(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return cubVar.dS(iB, iA, defpackage.afcf.a, new defpackage.avb(cuxVarV, iDN, iDN3, 2));
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.c(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.d(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.e(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.f(new defpackage.cxd(this), cszVar, csyVar, i);
    }
}
