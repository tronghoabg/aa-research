package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class awq extends defpackage.cge implements defpackage.cxe {
    public float a;
    public float b;

    public awq(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        int iD;
        int iC;
        if (java.lang.Float.isNaN(this.a) || defpackage.dlm.d(j) != 0) {
            iD = defpackage.dlm.d(j);
        } else {
            int iDN = cubVar.dN(this.a);
            iD = defpackage.dlm.b(j);
            if (iDN < 0) {
                iDN = 0;
            }
            if (iDN <= iD) {
                iD = iDN;
            }
        }
        int iB = defpackage.dlm.b(j);
        if (java.lang.Float.isNaN(this.b) || defpackage.dlm.c(j) != 0) {
            iC = defpackage.dlm.c(j);
        } else {
            int iDN2 = cubVar.dN(this.b);
            iC = defpackage.dlm.a(j);
            int i = iDN2 >= 0 ? iDN2 : 0;
            if (i <= iC) {
                iC = i;
            }
        }
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dln.d(iD, iB, iC, defpackage.dlm.a(j)));
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.aun(cuxVarV, 9));
    }

    @Override // defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        int iC = csyVar.c(i);
        int iDN = !java.lang.Float.isNaN(this.b) ? cszVar.dN(this.b) : 0;
        return iC < iDN ? iDN : iC;
    }

    @Override // defpackage.cxe
    public final int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        int iD = csyVar.d(i);
        int iDN = !java.lang.Float.isNaN(this.a) ? cszVar.dN(this.a) : 0;
        return iD < iDN ? iDN : iD;
    }

    @Override // defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        int iE = csyVar.e(i);
        int iDN = !java.lang.Float.isNaN(this.b) ? cszVar.dN(this.b) : 0;
        return iE < iDN ? iDN : iE;
    }

    @Override // defpackage.cxe
    public final int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        int iF = csyVar.f(i);
        int iDN = !java.lang.Float.isNaN(this.a) ? cszVar.dN(this.a) : 0;
        return iF < iDN ? iDN : iF;
    }
}
