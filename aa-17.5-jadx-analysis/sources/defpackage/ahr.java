package defpackage;

/* loaded from: classes2.dex */
final class ahr extends ahw {
    /* JADX WARN: Type inference failed for: r2v2, types: [aew, java.lang.Object] */
    @Override // defpackage.ahw
    public final bym a(agg aggVar, int i, bux buxVar, int i2) {
        Object objE;
        float fFloatValue;
        float fFloatValue2;
        buxVar.v(2006928772);
        kvn kvnVar = new kvn(this, i, 1);
        int i3 = ((i2 << 3) & 896) | (i2 & 14);
        int i4 = (i3 & 14) | ((i3 << 3) & 7168);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        bii biiVar = agm.a;
        if (aggVar.w()) {
            buxVar.v(1666827533);
            ((bvv) buxVar).Y(false);
            objE = aggVar.e();
        } else {
            buxVar.v(1666573488);
            boolean z = (i6 > 4 && buxVar.C(aggVar)) || (i4 & 6) == 4;
            bvv bvvVar = (bvv) buxVar;
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
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        buxVar.v(-1743438372);
        if (zBooleanValue) {
            Object obj = ((aig) woy.bK(this.a)).e;
            obj.getClass();
            fFloatValue = ((Number) ((ahs) woy.bK(((aib) obj).b)).b).floatValue();
        } else {
            Object obj2 = ((aig) woy.bF(this.a)).e;
            obj2.getClass();
            fFloatValue = ((Number) ((ahs) woy.bF(((aib) obj2).b)).b).floatValue();
        }
        bvv bvvVar2 = (bvv) buxVar;
        bvvVar2.Y(false);
        Float fValueOf = Float.valueOf(fFloatValue);
        boolean z2 = (i6 > 4 && buxVar.C(aggVar)) || (i4 & 6) == 4;
        Object objS = bvvVar2.S();
        if (z2 || objS == buw.a) {
            ahp ahpVar = new ahp(aggVar, 0);
            lah lahVar = byj.a;
            objS = new bvk(ahpVar, null);
            bvvVar2.ad(objS);
        }
        boolean zBooleanValue2 = ((Boolean) ((bym) objS).a()).booleanValue();
        buxVar.v(-1743438372);
        if (zBooleanValue2) {
            Object obj3 = ((aig) woy.bK(this.a)).e;
            obj3.getClass();
            fFloatValue2 = ((Number) ((ahs) woy.bK(((aib) obj3).b)).b).floatValue();
        } else {
            Object obj4 = ((aig) woy.bF(this.a)).e;
            obj4.getClass();
            fFloatValue2 = ((Number) ((ahs) woy.bF(((aib) obj4).b)).b).floatValue();
        }
        bvvVar2.Y(false);
        Float fValueOf2 = Float.valueOf(fFloatValue2);
        boolean z3 = (i6 > 4 && buxVar.C(aggVar)) || (i4 & 6) == 4;
        Object objS2 = bvvVar2.S();
        if (z3 || objS2 == buw.a) {
            ahq ahqVar = new ahq(aggVar, 0);
            lah lahVar2 = byj.a;
            bvk bvkVar = new bvk(ahqVar, null);
            bvvVar2.ad(bvkVar);
            objS2 = bvkVar;
        }
        bym bymVarAf = afp.af(aggVar, fValueOf, fValueOf2, kvnVar.invoke(((bym) objS2).a(), buxVar, 0), biiVar, buxVar, i5 | ((i4 << 6) & 458752));
        bvvVar2.Y(false);
        return bymVarAf;
    }
}
