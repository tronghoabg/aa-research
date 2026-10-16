package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class bvq {
    public static final czz a = new czz();

    public static final aitx a(afco afcoVar, bux buxVar) {
        return new bxt(buxVar.h(), afcoVar);
    }

    public static final void b(Object obj, Object obj2, afec afecVar, bux buxVar) {
        boolean zC = buxVar.C(obj) | buxVar.C(obj2);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = new bvm(afecVar);
            buxVar.x(objG);
        }
    }

    public static final void c(Object obj, afec afecVar, bux buxVar) {
        boolean zC = buxVar.C(obj);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = new bvm(afecVar);
            buxVar.x(objG);
        }
    }

    public static final void d(Object[] objArr, afec afecVar, bux buxVar) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zA = buxVar.A(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zA |= buxVar.C(obj);
        }
        Object objG = buxVar.g();
        if (zA || objG == buw.a) {
            buxVar.x(new bvm(afecVar));
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, afeg afegVar, bux buxVar) {
        afco afcoVarH = buxVar.h();
        boolean zC = buxVar.C(obj) | buxVar.C(obj2) | buxVar.C(obj3);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = new bwg(afcoVarH, afegVar);
            buxVar.x(objG);
        }
    }

    public static final void f(Object obj, Object obj2, afeg afegVar, bux buxVar) {
        afco afcoVarH = buxVar.h();
        boolean zC = buxVar.C(obj) | buxVar.C(obj2);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = new bwg(afcoVarH, afegVar);
            buxVar.x(objG);
        }
    }

    public static final void g(Object obj, afeg afegVar, bux buxVar) {
        afco afcoVarH = buxVar.h();
        boolean zC = buxVar.C(obj);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = new bwg(afcoVarH, afegVar);
            buxVar.x(objG);
        }
    }

    public static final void h(Object[] objArr, afeg afegVar, bux buxVar) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zA = buxVar.A(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zA |= buxVar.C(obj);
        }
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (zA || objS == buw.a) {
            bvvVar.ad(new bwg(bvvVar.s, afegVar));
        }
    }
}
