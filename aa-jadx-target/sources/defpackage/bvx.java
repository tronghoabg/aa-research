package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bvx {
    public static final defpackage.bxi a = new defpackage.bxi();

    public static final aiuw a(defpackage.afdo afdoVar, defpackage.bve bveVar) {
        return new defpackage.bxz(bveVar.h(), afdoVar);
    }

    public static final void b(java.lang.Object obj, java.lang.Object obj2, defpackage.affc affcVar, defpackage.bve bveVar) {
        boolean zC = bveVar.C(obj) | bveVar.C(obj2);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            objG = new defpackage.bvt(affcVar);
            bveVar.x(objG);
        }
    }

    public static final void c(java.lang.Object obj, defpackage.affc affcVar, defpackage.bve bveVar) {
        boolean zC = bveVar.C(obj);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            objG = new defpackage.bvt(affcVar);
            bveVar.x(objG);
        }
    }

    public static final void d(java.lang.Object[] objArr, defpackage.affc affcVar, defpackage.bve bveVar) {
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        boolean zA = bveVar.A(objArrCopyOf.length);
        for (java.lang.Object obj : objArrCopyOf) {
            zA |= bveVar.C(obj);
        }
        java.lang.Object objG = bveVar.g();
        if (zA || objG == defpackage.bvd.a) {
            bveVar.x(new defpackage.bvt(affcVar));
        }
    }

    public static final void e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, defpackage.affg affgVar, defpackage.bve bveVar) {
        defpackage.afdo afdoVarH = bveVar.h();
        boolean zC = bveVar.C(obj) | bveVar.C(obj2) | bveVar.C(obj3);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            objG = new defpackage.bwn(afdoVarH, affgVar);
            bveVar.x(objG);
        }
    }

    public static final void f(java.lang.Object obj, java.lang.Object obj2, defpackage.affg affgVar, defpackage.bve bveVar) {
        defpackage.afdo afdoVarH = bveVar.h();
        boolean zC = bveVar.C(obj) | bveVar.C(obj2);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            objG = new defpackage.bwn(afdoVarH, affgVar);
            bveVar.x(objG);
        }
    }

    public static final void g(java.lang.Object obj, defpackage.affg affgVar, defpackage.bve bveVar) {
        defpackage.afdo afdoVarH = bveVar.h();
        boolean zC = bveVar.C(obj);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            objG = new defpackage.bwn(afdoVarH, affgVar);
            bveVar.x(objG);
        }
    }

    public static final void h(java.lang.Object[] objArr, defpackage.affg affgVar, defpackage.bve bveVar) {
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        boolean zA = bveVar.A(objArrCopyOf.length);
        for (java.lang.Object obj : objArrCopyOf) {
            zA |= bveVar.C(obj);
        }
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (zA || objS == defpackage.bvd.a) {
            bwcVar.ad(new defpackage.bwn(bwcVar.s, affgVar));
        }
    }
}
