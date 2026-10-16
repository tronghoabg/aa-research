package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class atw implements defpackage.cty, defpackage.avz {
    public final defpackage.cft a;
    private final defpackage.ath b;

    public atw(defpackage.ath athVar, defpackage.cft cftVar) {
        this.b = athVar;
        this.a = cftVar;
    }

    @Override // defpackage.cty
    public final int a(defpackage.csz cszVar, java.util.List list, int i) {
        int iDN = cszVar.dN(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.csy csyVar = (defpackage.csy) list.get(i3);
            defpackage.awa awaVarC = defpackage.asq.C(csyVar);
            float f2 = awaVarC != null ? awaVarC.a : 0.0f;
            int iC = csyVar.c(i);
            if (f2 == 0.0f) {
                i2 += iC;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = java.lang.Math.max(iMax, java.lang.Math.round(iC / f2));
            }
        }
        return java.lang.Math.round(iMax * f) + i2 + ((list.size() - 1) * iDN);
    }

    @Override // defpackage.cty
    public final int b(defpackage.csz cszVar, java.util.List list, int i) {
        int iDN = cszVar.dN(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = java.lang.Math.min((list.size() - 1) * iDN, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.csy csyVar = (defpackage.csy) list.get(i2);
            defpackage.awa awaVarC = defpackage.asq.C(csyVar);
            float f2 = awaVarC != null ? awaVarC.a : 0.0f;
            if (f2 == 0.0f) {
                int iMin2 = java.lang.Math.min(csyVar.c(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = java.lang.Math.max(iMax, csyVar.d(iMin2));
            } else if (f2 > 0.0f) {
                f += f2;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            defpackage.csy csyVar2 = (defpackage.csy) list.get(i3);
            defpackage.awa awaVarC2 = defpackage.asq.C(csyVar2);
            float f3 = awaVarC2 != null ? awaVarC2.a : 0.0f;
            if (f3 > 0.0f) {
                iMax = java.lang.Math.max(iMax, csyVar2.d(iRound != Integer.MAX_VALUE ? java.lang.Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.cty
    public final int c(defpackage.csz cszVar, java.util.List list, int i) {
        int iDN = cszVar.dN(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.csy csyVar = (defpackage.csy) list.get(i3);
            defpackage.awa awaVarC = defpackage.asq.C(csyVar);
            float f2 = awaVarC != null ? awaVarC.a : 0.0f;
            int iE = csyVar.e(i);
            if (f2 == 0.0f) {
                i2 += iE;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = java.lang.Math.max(iMax, java.lang.Math.round(iE / f2));
            }
        }
        return java.lang.Math.round(iMax * f) + i2 + ((list.size() - 1) * iDN);
    }

    @Override // defpackage.cty
    public final int d(defpackage.csz cszVar, java.util.List list, int i) {
        int iDN = cszVar.dN(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = java.lang.Math.min((list.size() - 1) * iDN, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.csy csyVar = (defpackage.csy) list.get(i2);
            defpackage.awa awaVarC = defpackage.asq.C(csyVar);
            float f2 = awaVarC != null ? awaVarC.a : 0.0f;
            if (f2 == 0.0f) {
                int iMin2 = java.lang.Math.min(csyVar.c(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = java.lang.Math.max(iMax, csyVar.f(iMin2));
            } else if (f2 > 0.0f) {
                f += f2;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            defpackage.csy csyVar2 = (defpackage.csy) list.get(i3);
            defpackage.awa awaVarC2 = defpackage.asq.C(csyVar2);
            float f3 = awaVarC2 != null ? awaVarC2.a : 0.0f;
            if (f3 > 0.0f) {
                iMax = java.lang.Math.max(iMax, csyVar2.f(iRound != Integer.MAX_VALUE ? java.lang.Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        return defpackage.asq.B(this, defpackage.dlm.c(j), defpackage.dlm.d(j), defpackage.dlm.a(j), defpackage.dlm.b(j), cubVar.dN(this.b.a()), cubVar, list, new defpackage.cux[list.size()], 0, list.size(), null, 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.atw)) {
            return false;
        }
        defpackage.atw atwVar = (defpackage.atw) obj;
        return defpackage.afga.f(this.b, atwVar.b) && defpackage.afga.f(this.a, atwVar.a);
    }

    @Override // defpackage.avz
    public final int f(defpackage.cux cuxVar) {
        return cuxVar.a;
    }

    @Override // defpackage.avz
    public final int g(defpackage.cux cuxVar) {
        return cuxVar.b;
    }

    @Override // defpackage.avz
    public final defpackage.ctz h(defpackage.cux[] cuxVarArr, defpackage.cub cubVar, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return cubVar.dS(i3, i2, defpackage.afcf.a, new defpackage.atv(cuxVarArr, this, i3, i, cubVar, iArr, 0));
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.avz
    public final void i(int i, int[] iArr, int[] iArr2, defpackage.cub cubVar) {
        this.b.c(cubVar, i, iArr, iArr2);
    }

    @Override // defpackage.avz
    public final long j(int i, int i2, int i3, boolean z) {
        return !z ? defpackage.dln.d(0, i3, i, i2) : defpackage.dln.k(0, i3, i, i2);
    }

    public final java.lang.String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.b + ", horizontalAlignment=" + this.a + ")";
    }
}
