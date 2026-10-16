package defpackage;

/* loaded from: classes3.dex */
public abstract class tou implements tnz {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/api/model/Region2D");

    @Override // defpackage.tnz
    public tot a() {
        throw null;
    }

    @Override // defpackage.tnz
    public boolean b(tou touVar) {
        if (touVar == null || touVar.e(0) == null) {
            ((ynz) a.a(uys.a).ai((char) 9096)).u("Tried to intersect null region, or region with null vertex.");
            return false;
        }
        int iMin = e(0).a;
        int iMin2 = e(0).b;
        int iMax = iMin2;
        int iMax2 = iMin;
        for (int i = 1; i < 4; i++) {
            iMin = Math.min(iMin, e(i).a);
            iMax2 = Math.max(iMax2, e(i).a);
            iMin2 = Math.min(iMin2, e(i).b);
            iMax = Math.max(iMax, e(i).b);
        }
        int iMax3 = touVar.e(0).a;
        int iMin3 = touVar.e(0).b;
        int iMax4 = iMin3;
        int iMin4 = iMax3;
        for (int i2 = 1; i2 < 4; i2++) {
            iMin4 = Math.min(iMin4, touVar.e(i2).a);
            iMax3 = Math.max(iMax3, touVar.e(i2).a);
            iMin3 = Math.min(iMin3, touVar.e(i2).b);
            iMax4 = Math.max(iMax4, touVar.e(i2).b);
        }
        if (iMin > iMax3 || iMin2 > iMax4 || iMax2 < iMin4 || iMax < iMin3) {
            return false;
        }
        if (f(touVar.e(0)) || touVar.f(e(0))) {
            return true;
        }
        too tooVarD = d();
        too tooVarD2 = touVar.d();
        int i3 = 0;
        while (i3 < 4) {
            too tooVarE = e(i3);
            int i4 = 0;
            too tooVar = tooVarD2;
            while (i4 < 4) {
                too tooVarE2 = touVar.e(i4);
                if (tss.l(tooVarD, tooVarE, tooVar, tooVarE2)) {
                    return true;
                }
                i4++;
                tooVar = tooVarE2;
            }
            i3++;
            tooVarD = tooVarE;
        }
        return false;
    }

    public too d() {
        throw null;
    }

    public abstract too e(int i);

    public abstract boolean f(too tooVar);

    public boolean j(tou touVar) {
        throw null;
    }
}
