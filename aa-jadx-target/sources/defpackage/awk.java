package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class awk extends defpackage.cge implements defpackage.cxe {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;

    public awk(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    private final long d(defpackage.dlo dloVar) {
        int iDN;
        int iDN2;
        int iDN3;
        int i = 0;
        if (java.lang.Float.isNaN(this.c)) {
            iDN = Integer.MAX_VALUE;
        } else {
            iDN = dloVar.dN(this.c);
            if (iDN < 0) {
                iDN = 0;
            }
        }
        if (java.lang.Float.isNaN(this.d)) {
            iDN2 = Integer.MAX_VALUE;
        } else {
            iDN2 = dloVar.dN(this.d);
            if (iDN2 < 0) {
                iDN2 = 0;
            }
        }
        if (java.lang.Float.isNaN(this.a)) {
            iDN3 = 0;
        } else {
            iDN3 = dloVar.dN(this.a);
            if (iDN3 < 0) {
                iDN3 = 0;
            }
            if (iDN3 > iDN) {
                iDN3 = iDN;
            }
            if (iDN3 == Integer.MAX_VALUE) {
                iDN3 = 0;
            }
        }
        if (!java.lang.Float.isNaN(this.b)) {
            int iDN4 = dloVar.dN(this.b);
            if (iDN4 < 0) {
                iDN4 = 0;
            }
            if (iDN4 > iDN2) {
                iDN4 = iDN2;
            }
            if (iDN4 != Integer.MAX_VALUE) {
                i = iDN4;
            }
        }
        return defpackage.dln.d(iDN3, iDN, i, iDN2);
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        int iD;
        int iB;
        int iC;
        int iA;
        long jD;
        long jD2 = d(cubVar);
        if (this.e) {
            jD = defpackage.dln.f(j, jD2);
        } else {
            if (java.lang.Float.isNaN(this.a)) {
                iD = defpackage.dlm.d(j);
                int iB2 = defpackage.dlm.b(jD2);
                if (iD > iB2) {
                    iD = iB2;
                }
            } else {
                iD = defpackage.dlm.d(jD2);
            }
            if (java.lang.Float.isNaN(this.c)) {
                iB = defpackage.dlm.b(j);
                int iD2 = defpackage.dlm.d(jD2);
                if (iB < iD2) {
                    iB = iD2;
                }
            } else {
                iB = defpackage.dlm.b(jD2);
            }
            if (java.lang.Float.isNaN(this.b)) {
                iC = defpackage.dlm.c(j);
                int iA2 = defpackage.dlm.a(jD2);
                if (iC > iA2) {
                    iC = iA2;
                }
            } else {
                iC = defpackage.dlm.c(jD2);
            }
            if (java.lang.Float.isNaN(this.d)) {
                iA = defpackage.dlm.a(j);
                int iC2 = defpackage.dlm.c(jD2);
                if (iA < iC2) {
                    iA = iC2;
                }
            } else {
                iA = defpackage.dlm.a(jD2);
            }
            jD = defpackage.dln.d(iD, iB, iC, iA);
        }
        defpackage.cux cuxVarV = ctxVar.v(jD);
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.aun(cuxVarV, 8));
    }

    @Override // defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        long jD = d(cszVar);
        if (defpackage.dlm.i(jD)) {
            return defpackage.dlm.a(jD);
        }
        if (!this.e) {
            int iD = defpackage.dlm.d(jD);
            int iB = defpackage.dlm.b(jD);
            if (i < iD) {
                i = iD;
            }
            if (i > iB) {
                i = iB;
            }
        }
        int iC = csyVar.c(i);
        int iC2 = defpackage.dlm.c(jD);
        int iA = defpackage.dlm.a(jD);
        if (iC < iC2) {
            iC = iC2;
        }
        return iC > iA ? iA : iC;
    }

    @Override // defpackage.cxe
    public final int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        long jD = d(cszVar);
        if (defpackage.dlm.j(jD)) {
            return defpackage.dlm.b(jD);
        }
        if (!this.e) {
            int iC = defpackage.dlm.c(jD);
            int iA = defpackage.dlm.a(jD);
            if (i < iC) {
                i = iC;
            }
            if (i > iA) {
                i = iA;
            }
        }
        int iD = csyVar.d(i);
        int iD2 = defpackage.dlm.d(jD);
        int iB = defpackage.dlm.b(jD);
        if (iD < iD2) {
            iD = iD2;
        }
        return iD > iB ? iB : iD;
    }

    @Override // defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        long jD = d(cszVar);
        if (defpackage.dlm.i(jD)) {
            return defpackage.dlm.a(jD);
        }
        if (!this.e) {
            int iD = defpackage.dlm.d(jD);
            int iB = defpackage.dlm.b(jD);
            if (i < iD) {
                i = iD;
            }
            if (i > iB) {
                i = iB;
            }
        }
        int iE = csyVar.e(i);
        int iC = defpackage.dlm.c(jD);
        int iA = defpackage.dlm.a(jD);
        if (iE < iC) {
            iE = iC;
        }
        return iE > iA ? iA : iE;
    }

    @Override // defpackage.cxe
    public final int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        long jD = d(cszVar);
        if (defpackage.dlm.j(jD)) {
            return defpackage.dlm.b(jD);
        }
        if (!this.e) {
            int iC = defpackage.dlm.c(jD);
            int iA = defpackage.dlm.a(jD);
            if (i < iC) {
                i = iC;
            }
            if (i > iA) {
                i = iA;
            }
        }
        int iF = csyVar.f(i);
        int iD = defpackage.dlm.d(jD);
        int iB = defpackage.dlm.b(jD);
        if (iF < iD) {
            iF = iD;
        }
        return iF > iB ? iB : iF;
    }
}
