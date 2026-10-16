package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bgq {
    public static final /* synthetic */ int a = 0;
    private static final doc b = new doc(true, true, 1002, 1536);

    public static final void a(defpackage.bgb bgbVar, defpackage.bfx bfxVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1904307118);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(bgbVar) : bveVarC.E(bgbVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(bfxVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            bveVarC.v(-1009482584);
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.Y(false);
            boolean zE = bveVarC.E(bfxVar);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !bveVarC.E(bgbVar))) {
                z = false;
            }
            boolean zE2 = zE | z | bveVarC.E(context);
            java.lang.Object objS = bwcVar.S();
            if (zE2 || objS == defpackage.bvd.a) {
                defpackage.acn acnVar = new defpackage.acn((java.lang.Object) bfxVar, (java.lang.Object) context, (java.lang.Object) bgbVar, 8, (short[]) null);
                bwcVar.ad(acnVar);
                objS = acnVar;
            }
            defpackage.amb.c(null, null, (defpackage.affc) objS, bveVarC, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(bgbVar, bfxVar, i, 11, null);
        }
    }

    public static final void b(final int i, long j, defpackage.bve bveVar, final int i2) {
        int i3;
        defpackage.cjx cjxVar;
        final long j2 = j;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-1240244237);
        if (i4 == 0) {
            i3 = i2 | (true != bveVarC.A(i) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.B(j2) ? 16 : 32;
        }
        if (bveVarC.I((i3 & 19) != 18, i3 & 1)) {
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            boolean zC = bveVarC.C(context) | ((i3 & 14) == 4);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = java.lang.Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                bwcVar.ad(objS);
            }
            int iIntValue = ((java.lang.Number) objS).intValue();
            if (iIntValue == -1) {
                defpackage.bxl bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    final int i5 = 1;
                    bxlVarJ.c = new defpackage.affg() { // from class: bgo
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            if (i5 != 0) {
                                ((java.lang.Integer) obj2).intValue();
                                int i6 = i2;
                                long j3 = j2;
                                int i7 = i6 | 1;
                                int i8 = i7 & 306783378;
                                int i9 = 613566756 & i7;
                                defpackage.bgq.b(i, j3, (defpackage.bve) obj, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                                return defpackage.afbk.a;
                            }
                            ((java.lang.Integer) obj2).intValue();
                            int i10 = i2;
                            long j4 = j2;
                            int i11 = i10 | 1;
                            int i12 = i11 & 306783378;
                            int i13 = 613566756 & i11;
                            defpackage.bgq.b(i, j4, (defpackage.bve) obj, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
                            return defpackage.afbk.a;
                        }
                    };
                    return;
                }
                return;
            }
            defpackage.cne cneVarH = defpackage.day.h(iIntValue, bveVarC, 0);
            int i6 = i3 & 112;
            java.lang.Object objS2 = bwcVar.S();
            if (i6 == 32 || objS2 == defpackage.bvd.a) {
                if (j2 == 16) {
                    cjxVar = null;
                    j2 = 16;
                } else {
                    cjxVar = new defpackage.cjx(j2, 5);
                }
                objS2 = cjxVar;
                bwcVar.ad(objS2);
            }
            defpackage.cke ckeVar = (defpackage.cke) objS2;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            long j3 = defpackage.alx.a;
            defpackage.atp.c(defpackage.bzd.v(defpackage.awj.i(cgcVar, 24.0f), cneVarH, null, defpackage.csq.b, 0.0f, ckeVar, 22), bveVarC, 0);
        } else {
            bveVarC.s();
        }
        final long j4 = j2;
        defpackage.bxl bxlVarJ2 = bveVarC.J();
        if (bxlVarJ2 != null) {
            final int i7 = 0;
            bxlVarJ2.c = new defpackage.affg() { // from class: bgo
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    if (i7 != 0) {
                        ((java.lang.Integer) obj2).intValue();
                        int i8 = i2;
                        long j5 = j4;
                        int i9 = i8 | 1;
                        int i10 = i9 & 306783378;
                        int i11 = 613566756 & i9;
                        defpackage.bgq.b(i, j5, (defpackage.bve) obj, (i9 & (-920350135)) | i10 | (i11 >> 1) | ((i10 + i10) & i11));
                        return defpackage.afbk.a;
                    }
                    ((java.lang.Integer) obj2).intValue();
                    int i12 = i2;
                    long j6 = j4;
                    int i13 = i12 | 1;
                    int i14 = i13 & 306783378;
                    int i15 = 613566756 & i13;
                    defpackage.bgq.b(i, j6, (defpackage.bve) obj, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 + i14) & i15));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void c(defpackage.bgb bgbVar, defpackage.bhs bhsVar, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-2040393164);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(bgbVar) : bveVarC.E(bgbVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(bhsVar) : bveVarC.E(bhsVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        boolean z = false;
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && bveVarC.C(bhsVar));
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (z2 || objS == defpackage.bvd.a) {
                objS = new defpackage.bgs(new defpackage.alv(new defpackage.ajz(bhsVar, aferVar, i4, null)));
                bwcVar.ad(objS);
            }
            defpackage.bgs bgsVar = (defpackage.bgs) objS;
            int i5 = 8;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && bveVarC.E(bgbVar))) {
                z = true;
            }
            java.lang.Object objS2 = bwcVar.S();
            if (z || objS2 == defpackage.bvd.a) {
                objS2 = new defpackage.bfd(bgbVar, 6);
                bwcVar.ad(objS2);
            }
            dnj.b(bgsVar, (defpackage.afer) objS2, b, defpackage.dai.as(1315155414, true, new defpackage.aps(bhsVar, bgbVar, i5), bveVarC), bveVarC, 3456, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.alz(bgbVar, bhsVar, aferVar, i, 5, null);
        }
    }

    public static final void d(defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cgf cgfVar2;
        defpackage.affg affgVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1392105195);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            cgfVar2 = cgfVar;
            affgVar2 = affgVar;
            defpackage.axd.S(cgfVar2, defpackage.bhu.a, defpackage.bgn.a, affgVar2, bveVarC, (i2 & 14) | 432 | ((i2 << 6) & 7168));
        } else {
            cgfVar2 = cgfVar;
            affgVar2 = affgVar;
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(cgfVar2, affgVar2, i, 12);
        }
    }
}
