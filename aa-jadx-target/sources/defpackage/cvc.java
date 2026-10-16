package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cvc extends defpackage.cxk {
    public static final defpackage.cvc a = new defpackage.cvc();

    private cvc() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        int size = list.size();
        if (size == 0) {
            return cubVar.dS(defpackage.dlm.d(j), defpackage.dlm.c(j), defpackage.afcf.a, new defpackage.cmr(4));
        }
        if (size == 1) {
            defpackage.cux cuxVarV = ((defpackage.ctx) list.get(0)).v(j);
            int i = cuxVarV.a;
            int iD = defpackage.dlm.d(j);
            int iB = defpackage.dlm.b(j);
            if (i < iD) {
                i = iD;
            }
            if (i <= iB) {
                iB = i;
            }
            int i2 = cuxVarV.b;
            int iC = defpackage.dlm.c(j);
            int iA = defpackage.dlm.a(j);
            if (i2 < iC) {
                i2 = iC;
            }
            if (i2 <= iA) {
                iA = i2;
            }
            return cubVar.dS(iB, iA, defpackage.afcf.a, new defpackage.chq(cuxVarV, 10));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            defpackage.cux cuxVarV2 = ((defpackage.ctx) list.get(i3)).v(j);
            iMax = java.lang.Math.max(cuxVarV2.a, iMax);
            iMax2 = java.lang.Math.max(cuxVarV2.b, iMax2);
            arrayList.add(cuxVarV2);
        }
        int iD2 = defpackage.dlm.d(j);
        int iB2 = defpackage.dlm.b(j);
        if (iMax < iD2) {
            iMax = iD2;
        }
        if (iMax <= iB2) {
            iB2 = iMax;
        }
        int iC2 = defpackage.dlm.c(j);
        int iA2 = defpackage.dlm.a(j);
        if (iMax2 < iC2) {
            iMax2 = iC2;
        }
        if (iMax2 <= iA2) {
            iA2 = iMax2;
        }
        return cubVar.dS(iB2, iA2, defpackage.afcf.a, new defpackage.chs(arrayList, 12));
    }
}
