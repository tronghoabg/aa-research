package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public /* synthetic */ class ud {
    public static defpackage.cno a;

    public static void a(defpackage.bzp bzpVar, defpackage.buq buqVar, int i) {
        while (true) {
            int i2 = bzpVar.q;
            if (i > i2 && i < bzpVar.p) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            bzpVar.I();
            if (bzpVar.S(bzpVar.q)) {
                buqVar.h();
            }
            bzpVar.V();
        }
    }

    public static long b(int i, int i2, int i3, int i4) {
        return ((long) (i & 32767)) | (((long) (i2 & 32767)) << 15) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static int c(cyo cyoVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        defpackage.cud cudVar = new defpackage.cud(csyVar, 2, 2, 2);
        long jD = defpackage.dln.d(0, i, 0, Integer.MAX_VALUE);
        return ((defpackage.cxd) cyoVar).a.dt(new defpackage.ctb(cszVar, cszVar.p()), cudVar, jD).b();
    }

    public static int d(cyo cyoVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        defpackage.cud cudVar = new defpackage.cud(csyVar, 2, 1, 2);
        long jD = defpackage.dln.d(0, Integer.MAX_VALUE, 0, i);
        return ((defpackage.cxd) cyoVar).a.dt(new defpackage.ctb(cszVar, cszVar.p()), cudVar, jD).c();
    }

    public static int e(cyo cyoVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        defpackage.cud cudVar = new defpackage.cud(csyVar, 1, 2, 2);
        long jD = defpackage.dln.d(0, i, 0, Integer.MAX_VALUE);
        return ((defpackage.cxd) cyoVar).a.dt(new defpackage.ctb(cszVar, cszVar.p()), cudVar, jD).b();
    }

    public static int f(cyo cyoVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        defpackage.cud cudVar = new defpackage.cud(csyVar, 1, 1, 2);
        long jD = defpackage.dln.d(0, Integer.MAX_VALUE, 0, i);
        return ((defpackage.cxd) cyoVar).a.dt(new defpackage.ctb(cszVar, cszVar.p()), cudVar, jD).c();
    }

    public static void g(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    public static java.util.List h(defpackage.csz cszVar) {
        cszVar.getClass();
        defpackage.cxl cxlVarL = ((defpackage.cya) cszVar).L();
        boolean zI = i(cxlVarL);
        java.util.List listX = cxlVarL.x();
        java.util.ArrayList arrayList = new java.util.ArrayList(listX.size());
        int size = listX.size();
        for (int i = 0; i < size; i++) {
            defpackage.cxl cxlVar = (defpackage.cxl) listX.get(i);
            arrayList.add(zI ? cxlVar.t() : cxlVar.u());
        }
        return arrayList;
    }

    private static boolean i(defpackage.cxl cxlVar) {
        int iAv = cxlVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new defpackage.afas();
                }
                defpackage.cxl cxlVarL = cxlVar.l();
                if (cxlVarL != null) {
                    return i(cxlVarL);
                }
                throw new java.lang.IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }
}
