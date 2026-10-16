package defpackage;

/* loaded from: classes2.dex */
final class ahn extends ahw {
    /* JADX WARN: Type inference failed for: r2v2, types: [aew, java.lang.Object] */
    @Override // defpackage.ahw
    public final bym a(agg aggVar, int i, bux buxVar, int i2) {
        long j;
        Object objE;
        int i3;
        long j2;
        long j3;
        buxVar.v(-2133734837);
        kvn kvnVar = new kvn(this, i, 1);
        boolean zBooleanValue = ((Boolean) aggVar.g()).booleanValue();
        buxVar.v(1880460593);
        if (zBooleanValue) {
            Object obj = ((aig) woy.bK(this.a)).e;
            obj.getClass();
            j = ((cjv) ((ahs) woy.bK(((ahz) obj).b)).b).a;
        } else {
            Object obj2 = ((aig) woy.bF(this.a)).e;
            obj2.getClass();
            j = ((cjv) ((ahs) woy.bF(((ahz) obj2).b)).b).a;
        }
        bvv bvvVar = (bvv) buxVar;
        bvvVar.Y(false);
        clh clhVarF = cjv.f(j);
        boolean zC = buxVar.C(clhVarF);
        Object objS = bvvVar.S();
        if (zC || objS == buw.a) {
            objS = abx.a.invoke(clhVarF);
            bvvVar.ad(objS);
        }
        bii biiVar = (bii) objS;
        int i4 = ((i2 << 3) & 896) | (i2 & 14);
        int i5 = (i4 & 14) | ((i4 << 3) & 7168);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        if (aggVar.w()) {
            buxVar.v(1666827533);
            bvvVar.Y(false);
            objE = aggVar.e();
        } else {
            buxVar.v(1666573488);
            boolean z = (i7 > 4 && buxVar.C(aggVar)) || (i5 & 6) == 4;
            objE = bvvVar.S();
            if (z || objE == buw.a) {
                cec cecVarH = byx.h();
                afec afecVarI = cecVarH != null ? cecVarH.i() : null;
                cec cecVarI = byx.i(cecVarH);
                try {
                    Object objE2 = aggVar.e();
                    byx.l(cecVarH, cecVarI, afecVarI);
                    bvvVar.ad(objE2);
                    objE = objE2;
                } catch (Throwable th) {
                    byx.l(cecVarH, cecVarI, afecVarI);
                    throw th;
                }
            }
            bvvVar.Y(false);
        }
        boolean zBooleanValue2 = ((Boolean) objE).booleanValue();
        buxVar.v(1880460593);
        if (zBooleanValue2) {
            Object obj3 = ((aig) woy.bK(this.a)).e;
            obj3.getClass();
            i3 = i6;
            j2 = ((cjv) ((ahs) woy.bK(((ahz) obj3).b)).b).a;
        } else {
            i3 = i6;
            Object obj4 = ((aig) woy.bF(this.a)).e;
            obj4.getClass();
            j2 = ((cjv) ((ahs) woy.bF(((ahz) obj4).b)).b).a;
        }
        bvvVar.Y(false);
        cjv cjvVar = new cjv(j2);
        boolean z2 = (i7 > 4 && buxVar.C(aggVar)) || (i5 & 6) == 4;
        Object objS2 = bvvVar.S();
        if (z2 || objS2 == buw.a) {
            ahp ahpVar = new ahp(aggVar, 1);
            lah lahVar = byj.a;
            objS2 = new bvk(ahpVar, null);
            bvvVar.ad(objS2);
        }
        boolean zBooleanValue3 = ((Boolean) ((bym) objS2).a()).booleanValue();
        buxVar.v(1880460593);
        if (zBooleanValue3) {
            Object obj5 = ((aig) woy.bK(this.a)).e;
            obj5.getClass();
            j3 = ((cjv) ((ahs) woy.bK(((ahz) obj5).b)).b).a;
        } else {
            Object obj6 = ((aig) woy.bF(this.a)).e;
            obj6.getClass();
            j3 = ((cjv) ((ahs) woy.bF(((ahz) obj6).b)).b).a;
        }
        bvvVar.Y(false);
        cjv cjvVar2 = new cjv(j3);
        boolean z3 = (i7 > 4 && buxVar.C(aggVar)) || (i5 & 6) == 4;
        Object objS3 = bvvVar.S();
        if (z3 || objS3 == buw.a) {
            ahq ahqVar = new ahq(aggVar, 1);
            lah lahVar2 = byj.a;
            bvk bvkVar = new bvk(ahqVar, null);
            bvvVar.ad(bvkVar);
            objS3 = bvkVar;
        }
        bym bymVarAf = afp.af(aggVar, cjvVar, cjvVar2, kvnVar.invoke(((bym) objS3).a(), buxVar, 0), biiVar, buxVar, i3 | ((i5 << 6) & 458752));
        bvvVar.Y(false);
        return bymVarAf;
    }
}
