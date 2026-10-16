package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kmj {
    public static final defpackage.bvm a;
    public static final defpackage.bvm b = new defpackage.byu(new defpackage.con(17));
    public static final defpackage.bvm c;

    static {
        defpackage.byu byuVar = new defpackage.byu(new defpackage.con(18));
        c = byuVar;
        a = byuVar;
    }

    public static final void a(java.lang.Object obj, defpackage.mnj mnjVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        mnjVar.getClass();
        defpackage.bve bveVarC = bveVar.c(1068974296);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != bveVarC.E(obj) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.E(mnjVar) ? 16 : 32;
        }
        if (bveVarC.I((i3 & 19) != 18, 1 & i3)) {
            if (i2 != 0) {
                obj = defpackage.afbk.a;
            }
            java.util.Set set = (java.util.Set) bveVarC.f(b);
            boolean zE = bveVarC.E(set) | bveVarC.E(mnjVar);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new defpackage.jxq(set, mnjVar, 7, null);
                bwcVar.ad(objS);
            }
            defpackage.bvx.c(obj, (defpackage.affc) objS, bveVarC);
        } else {
            bveVarC.s();
        }
        java.lang.Object obj2 = obj;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.fxi(obj2, mnjVar, i, i2, 13);
        }
    }
}
