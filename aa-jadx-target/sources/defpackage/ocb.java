package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ocb implements defpackage.cty {
    public static final defpackage.ocb a = new defpackage.ocb(1);
    private final /* synthetic */ int b;

    public ocb(int i) {
        this.b = i;
    }

    public static final void f(defpackage.cuw cuwVar, defpackage.cux cuxVar, int i, int i2) {
        cuwVar.r(cuxVar, i2, defpackage.afhi.k((i - cuxVar.b) / 2.0f), 0.0f);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int a(defpackage.csz cszVar, java.util.List list, int i) {
        return this.b != 0 ? defpackage.tw.q(this, cszVar, list, i) : defpackage.tw.q(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int b(defpackage.csz cszVar, java.util.List list, int i) {
        return this.b != 0 ? defpackage.tw.r(this, cszVar, list, i) : defpackage.tw.r(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int c(defpackage.csz cszVar, java.util.List list, int i) {
        return this.b != 0 ? defpackage.tw.s(this, cszVar, list, i) : defpackage.tw.s(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int d(defpackage.csz cszVar, java.util.List list, int i) {
        return this.b != 0 ? defpackage.tw.t(this, cszVar, list, i) : defpackage.tw.t(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        defpackage.cux cuxVarV;
        java.lang.Object obj;
        defpackage.cux cuxVarV2;
        java.lang.Object obj2;
        int iK;
        int i = 0;
        if (this.b != 0) {
            return cubVar.dS(defpackage.dlm.j(j) ? defpackage.dlm.b(j) : 0, defpackage.dlm.i(j) ? defpackage.dlm.a(j) : 0, defpackage.afcf.a, new defpackage.awl(0));
        }
        cubVar.getClass();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.ctx ctxVar = (defpackage.ctx) list.get(i2);
            if (defpackage.afga.f(defpackage.dai.I(ctxVar), defpackage.oca.a)) {
                int iA = defpackage.dlm.a(j);
                defpackage.ocd ocdVar = defpackage.obt.a;
                float f = iA / 13.0f;
                long jB = defpackage.obt.a.b(f);
                int i3 = (int) (jB >> 32);
                int i4 = (int) (jB & 4294967295L);
                defpackage.cux cuxVarV3 = ctxVar.v(defpackage.dlm.l(defpackage.afhi.k(java.lang.Float.intBitsToFloat(i3)), defpackage.afhi.k(java.lang.Float.intBitsToFloat(i3)), defpackage.afhi.k(java.lang.Float.intBitsToFloat(i4)), defpackage.afhi.k(java.lang.Float.intBitsToFloat(i4))));
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    cuxVarV = null;
                    if (i5 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i5);
                    if (defpackage.afga.f(defpackage.dai.I((defpackage.ctx) obj), defpackage.obz.a)) {
                        break;
                    }
                    i5++;
                }
                defpackage.ctx ctxVar2 = (defpackage.ctx) obj;
                if (ctxVar2 != null) {
                    long jB2 = defpackage.obt.b.b(f);
                    int iK2 = defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (jB2 >> 32)));
                    int iK3 = defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (jB2 & 4294967295L)));
                    cuxVarV2 = ctxVar2.v(defpackage.dlm.l(iK2, iK2, iK3, iK3));
                } else {
                    cuxVarV2 = null;
                }
                int size3 = list.size();
                while (true) {
                    if (i >= size3) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i);
                    if (defpackage.dai.I((defpackage.ctx) obj2) instanceof defpackage.oby) {
                        break;
                    }
                    i++;
                }
                defpackage.ctx ctxVar3 = (defpackage.ctx) obj2;
                if (ctxVar3 != null) {
                    java.lang.Object objI = defpackage.dai.I(ctxVar3);
                    objI.getClass();
                    long jD = ((defpackage.oby) objI).a.d(f);
                    int iK4 = defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (jD >> 32)));
                    int iK5 = defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (jD & 4294967295L)));
                    cuxVarV = ctxVar3.v(defpackage.dlm.l(iK4, iK4, iK5, iK5));
                }
                defpackage.cux cuxVar = cuxVarV;
                int i6 = cuxVarV3.a;
                if (cuxVar == null) {
                    if (cuxVarV2 != null) {
                        iK = cuxVarV2.a + defpackage.afhi.k(f);
                    }
                    return cubVar.dS(i6, defpackage.afhi.k(java.lang.Float.intBitsToFloat(i4)), defpackage.afcf.a, new defpackage.obx(cubVar, cuxVar, cuxVarV2, f, cuxVarV3, 0));
                }
                iK = defpackage.afhi.j(((double) cuxVar.a) * 0.8d);
                i6 += iK;
                return cubVar.dS(i6, defpackage.afhi.k(java.lang.Float.intBitsToFloat(i4)), defpackage.afcf.a, new defpackage.obx(cubVar, cuxVar, cuxVarV2, f, cuxVarV3, 0));
            }
        }
        defpackage.dmh.a("Collection contains no element matching the predicate.");
        throw new defpackage.afap();
    }
}
