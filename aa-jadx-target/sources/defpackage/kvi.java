package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kvi {
    public static final defpackage.yqm a = defpackage.yqm.c("Gh.FocusRing");
    public static final defpackage.bvm b = new defpackage.byu(new defpackage.ksa(12));

    /* JADX WARN: Type inference failed for: r4v6, types: [bys, java.lang.Object] */
    public static final defpackage.cgf a(defpackage.cgf cgfVar, defpackage.cld cldVar, long j, long j2, defpackage.kvk kvkVar, defpackage.kvk kvkVar2, defpackage.asj asjVar, boolean z, boolean z2, defpackage.bve bveVar, int i, int i2) {
        cgfVar.getClass();
        cldVar.getClass();
        long jA = (i2 & 2) != 0 ? ((defpackage.kvj) bveVar.f(b)).a(bveVar) : j;
        long jB = (i2 & 4) != 0 ? ((defpackage.kvj) bveVar.f(b)).b(bveVar) : j2;
        defpackage.kvk kvkVarD = (i2 & 8) != 0 ? ((defpackage.kvj) bveVar.f(b)).d(bveVar) : kvkVar;
        defpackage.kvk kvkVarC = (i2 & 16) != 0 ? ((defpackage.kvj) bveVar.f(b)).c(bveVar) : kvkVar2;
        defpackage.bys bysVarI = null;
        defpackage.asj asjVar2 = (i2 & 32) != 0 ? null : asjVar;
        boolean z3 = ((i2 & 64) == 0) & z;
        boolean z4 = ((i2 & 128) == 0) & z2;
        if (asjVar2 == null) {
            bveVar.v(1429075946);
        } else {
            bveVar.v(-1062279433);
            bysVarI = defpackage.asq.i(asjVar2, bveVar, (i >> 18) & 14);
        }
        bveVar.o();
        if (bysVarI == null) {
            bveVar.v(1429104994);
            java.lang.Object objG = bveVar.g();
            if (objG == defpackage.bvd.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bveVar.x(parcelableSnapshotMutableState);
                objG = parcelableSnapshotMutableState;
            }
            bysVarI = (defpackage.bwx) objG;
        } else {
            bveVar.v(-1062279984);
        }
        bveVar.o();
        java.lang.Object objG2 = bveVar.g();
        java.lang.Object obj = defpackage.bvd.a;
        if (objG2 == obj) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
            bveVar.x(parcelableSnapshotMutableState2);
            objG2 = parcelableSnapshotMutableState2;
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objG2;
        boolean zBooleanValue = ((java.lang.Boolean) ((defpackage.mbt) bveVar.f(defpackage.kmj.a)).b.a()).booleanValue();
        int iL = ((defpackage.kwv) bveVar.f(defpackage.dbl.h)).L();
        java.lang.Object objG3 = bveVar.g();
        if (objG3 == obj) {
            objG3 = new defpackage.dbj(bwxVar, 15);
            bveVar.x(objG3);
        }
        return c(cgfVar.a(new defpackage.chx((defpackage.affc) objG3)), ((java.lang.Boolean) bysVarI.a()).booleanValue(), ((java.lang.Boolean) bwxVar.a()).booleanValue(), zBooleanValue, iL, cldVar, jA, jB, kvkVarD, kvkVarC, z3, z4);
    }

    public static final defpackage.cgf b(defpackage.cgf cgfVar, defpackage.asj asjVar, defpackage.cld cldVar, boolean z, defpackage.bve bveVar, int i, int i2) {
        defpackage.bwx bwxVar;
        cgfVar.getClass();
        asjVar.getClass();
        cldVar.getClass();
        long jA = (i2 & 4) != 0 ? ((defpackage.kvj) bveVar.f(b)).a(bveVar) : 0L;
        long jB = (i2 & 8) != 0 ? ((defpackage.kvj) bveVar.f(b)).b(bveVar) : 0L;
        defpackage.kvk kvkVarD = (i2 & 16) != 0 ? ((defpackage.kvj) bveVar.f(b)).d(bveVar) : null;
        defpackage.kvk kvkVarC = (i2 & 32) != 0 ? ((defpackage.kvj) bveVar.f(b)).c(bveVar) : null;
        boolean z2 = ((i2 & 128) == 0) & z;
        int i3 = i >> 3;
        int i4 = i3 & 14;
        defpackage.bys bysVarI = defpackage.asq.i(asjVar, bveVar, i4);
        defpackage.bys bysVarJ = defpackage.asq.j(asjVar, bveVar, i4);
        java.lang.Object objG = bveVar.g();
        java.lang.Object obj = defpackage.bvd.a;
        if (objG == obj) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
            bveVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        defpackage.bwx bwxVar2 = (defpackage.bwx) objG;
        boolean z3 = (((i3 & 14) ^ 6) > 4 && bveVar.C(asjVar)) || (i3 & 6) == 4;
        java.lang.Object objG2 = bveVar.g();
        if (z3 || objG2 == obj) {
            bwxVar = bwxVar2;
            objG2 = new defpackage.ais(asjVar, bwxVar, (defpackage.afdk) null, 14, (byte[]) null);
            bveVar.x(objG2);
        } else {
            bwxVar = bwxVar2;
        }
        defpackage.bvx.g(asjVar, (defpackage.affg) objG2, bveVar);
        return c(cgfVar, ((java.lang.Boolean) bysVarI.a()).booleanValue(), ((java.lang.Boolean) bysVarJ.a()).booleanValue(), ((java.lang.Boolean) bwxVar.a()).booleanValue(), ((defpackage.kwv) bveVar.f(defpackage.dbl.h)).L(), cldVar, jA, jB, kvkVarD, kvkVarC, false, z2);
    }

    private static final defpackage.cgf c(defpackage.cgf cgfVar, boolean z, boolean z2, boolean z3, int i, final defpackage.cld cldVar, long j, long j2, defpackage.kvk kvkVar, defpackage.kvk kvkVar2, boolean z4, boolean z5) {
        float f;
        final float f2;
        defpackage.cgf cgfVarA;
        boolean z6 = false;
        if (i == 2 && z2) {
            z6 = true;
        }
        final long j3 = z6 ? j : 0L;
        final long j4 = true != z6 ? 0L : j2;
        float f3 = 0.0f;
        if (z6) {
            if (z) {
                f = kvkVar.c;
            } else {
                f = z3 ? kvkVar.b : kvkVar.a;
            }
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if (z6) {
            if (z) {
                f3 = kvkVar2.c;
            } else {
                f3 = z3 ? kvkVar2.b : kvkVar2.a;
            }
        }
        final float f4 = f3;
        if (z5) {
            cgfVar.getClass();
            cgfVarA = cgfVar.a(new defpackage.ctd(new defpackage.akm(new defpackage.avx(f2, f2, f2, f2), 6)));
        } else {
            cgfVarA = cgfVar;
        }
        defpackage.cgf cgfVarA2 = cgfVarA.a(new defpackage.chl(new defpackage.affc() { // from class: kvg
            @Override // defpackage.affc
            public final java.lang.Object invoke(java.lang.Object obj) {
                defpackage.chg chgVar = (defpackage.chg) obj;
                defpackage.yqm yqmVar = defpackage.kvi.a;
                chgVar.getClass();
                float fA = chgVar.a();
                final float f5 = f2;
                final float f6 = f5 * fA;
                final float fA2 = f4 * chgVar.a();
                final defpackage.cku ckuVarA = cldVar.a(chgVar.n(), chgVar.o(), chgVar);
                final long j5 = j4;
                final long j6 = j3;
                return chgVar.q(new defpackage.affc() { // from class: kvf
                    @Override // defpackage.affc
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        defpackage.cxn cxnVar = (defpackage.cxn) obj2;
                        defpackage.yqm yqmVar2 = defpackage.kvi.a;
                        cxnVar.getClass();
                        int iDN = cxnVar.dN(f5);
                        float f7 = iDN + iDN;
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cxnVar.o() >> 32)) - f7;
                        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (cxnVar.o() & 4294967295L)) - f7;
                        if (fIntBitsToFloat < 0.0f || fIntBitsToFloat2 < 0.0f) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kvi.a.h()).l(5, java.util.concurrent.TimeUnit.SECONDS)).n(java.lang.String.valueOf(cxnVar.hashCode()))).q(defpackage.yqi.MEDIUM)).u("Content smaller than 0, unable to draw");
                        } else {
                            cxnVar.q();
                        }
                        defpackage.cku ckuVar = ckuVarA;
                        defpackage.cju cjuVar = new defpackage.cju((byte[]) null);
                        if (ckuVar instanceof defpackage.cks) {
                            cjuVar.q(((defpackage.cks) ckuVar).a);
                        } else if (ckuVar instanceof defpackage.ckt) {
                            cjuVar.r(((defpackage.ckt) ckuVar).a);
                        } else {
                            if (!(ckuVar instanceof defpackage.ckr)) {
                                throw new defpackage.afas();
                            }
                            cjuVar.p(((defpackage.ckr) ckuVar).a);
                        }
                        defpackage.cmi cmiVarR = cxnVar.r();
                        long jA = cmiVarR.a();
                        cmiVarR.b().g();
                        try {
                            cmiVarR.c.m(cjuVar);
                            float f8 = f6;
                            long j7 = j5;
                            if (j7 != 0) {
                                float f9 = fA2 + f8;
                                if (f9 > 0.0f) {
                                    defpackage.dai.aJ(cxnVar, ckuVar, j7, new defpackage.cmo(f9 + f9, 0.0f, 0, 0, 30), 52);
                                }
                            }
                            long j8 = j6;
                            if (j8 != 0 && f8 > 0.0f) {
                                defpackage.dai.aJ(cxnVar, ckuVar, j8, new defpackage.cmo(f8 + f8, 0.0f, 0, 0, 30), 52);
                            }
                            return defpackage.afbk.a;
                        } finally {
                            cmiVarR.b().e();
                            cmiVarR.h(jA);
                        }
                    }
                });
            }
        }));
        if (z4) {
            cgfVarA2 = defpackage.cjv.h(cgfVarA2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar, true, 0, 1042431);
        }
        return z5 ? cgfVarA2.a(new defpackage.avr(f2, f2, f2, f2)) : cgfVarA2;
    }
}
