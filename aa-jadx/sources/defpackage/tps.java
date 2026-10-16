package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tps implements defpackage.tox {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/api/model/Region2D");

    @Override // defpackage.tox
    public defpackage.tpr a() {
        throw null;
    }

    @Override // defpackage.tox
    public boolean b(defpackage.tps tpsVar) {
        if (tpsVar == null || tpsVar.e(0) == null) {
            ((defpackage.ype) a.a(defpackage.uzo.a).ai((char) 9121)).u("Tried to intersect null region, or region with null vertex.");
            return false;
        }
        int iMin = e(0).a;
        int iMin2 = e(0).b;
        int iMax = iMin2;
        int iMax2 = iMin;
        for (int i = 1; i < 4; i++) {
            iMin = java.lang.Math.min(iMin, e(i).a);
            iMax2 = java.lang.Math.max(iMax2, e(i).a);
            iMin2 = java.lang.Math.min(iMin2, e(i).b);
            iMax = java.lang.Math.max(iMax, e(i).b);
        }
        int iMax3 = tpsVar.e(0).a;
        int iMin3 = tpsVar.e(0).b;
        int iMax4 = iMin3;
        int iMin4 = iMax3;
        for (int i2 = 1; i2 < 4; i2++) {
            iMin4 = java.lang.Math.min(iMin4, tpsVar.e(i2).a);
            iMax3 = java.lang.Math.max(iMax3, tpsVar.e(i2).a);
            iMin3 = java.lang.Math.min(iMin3, tpsVar.e(i2).b);
            iMax4 = java.lang.Math.max(iMax4, tpsVar.e(i2).b);
        }
        if (iMin > iMax3 || iMin2 > iMax4 || iMax2 < iMin4 || iMax < iMin3) {
            return false;
        }
        if (f(tpsVar.e(0)) || tpsVar.f(e(0))) {
            return true;
        }
        defpackage.tpm tpmVarD = d();
        defpackage.tpm tpmVarD2 = tpsVar.d();
        int i3 = 0;
        while (i3 < 4) {
            defpackage.tpm tpmVarE = e(i3);
            int i4 = 0;
            defpackage.tpm tpmVar = tpmVarD2;
            while (i4 < 4) {
                defpackage.tpm tpmVarE2 = tpsVar.e(i4);
                if (defpackage.tnm.n(tpmVarD, tpmVarE, tpmVar, tpmVarE2)) {
                    return true;
                }
                i4++;
                tpmVar = tpmVarE2;
            }
            i3++;
            tpmVarD = tpmVarE;
        }
        return false;
    }

    public defpackage.tpm d() {
        throw null;
    }

    public abstract defpackage.tpm e(int i);

    public abstract boolean f(defpackage.tpm tpmVar);

    public boolean j(defpackage.tps tpsVar) {
        throw null;
    }
}
