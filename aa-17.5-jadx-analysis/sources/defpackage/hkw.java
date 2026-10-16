package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class hkw {
    public static final cfy a(cfy cfyVar, boolean z) {
        return cfyVar.a(z ? awd.c(cfy.e, 1.0f) : awd.u(cfy.e, null, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02cf  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.cfy r39, defpackage.hkx r40, defpackage.hju r41, defpackage.cil r42, defpackage.bux r43, int r44) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkw.b(cfy, hkx, hju, cil, bux, int):void");
    }

    public static final void c(hju hjuVar, boolean z, cfy cfyVar, cil cilVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(844506100);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hjuVar) : buxVarC.E(hjuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            cfy cfyVarJ = bxc.j(cfy.e, cilVar);
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarJ);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ2, cwb.c);
            if (hjuVar == null) {
                buxVarC.v(-1407399836);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1407399835);
                if (z) {
                    buxVarC.v(328083795);
                    xb.a(null, BitmapDescriptorFactory.HUE_RED, 0L, buxVarC, 0, 7);
                    bvvVar.Y(false);
                } else {
                    buxVarC.v(328119352);
                    bvvVar.Y(false);
                }
                gvq.g(hjuVar, cfyVar, buxVarC, (i2 >> 3) & 112, 0);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hkv(hjuVar, z, cfyVar, cilVar, i, 0);
        }
    }

    public static final void d(cil cilVar, hky hkyVar, bux buxVar, int i) {
        int i2;
        cilVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1544083920);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cilVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hkyVar) : buxVarC.E(hkyVar)) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i4 = i2 & 14;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i4 == 4 || objS == buw.a) {
                objS = new giy(cilVar, (afck) null, 3, (char[]) null);
                bvvVar.ad(objS);
            }
            bvq.g(hkyVar, (afeg) objS, buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu(cilVar, hkyVar, i, 12);
        }
    }

    public static final void e(alh alhVar, boolean z, bux buxVar, int i) {
        int i2;
        alh alhVar2;
        boolean z2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-716565812);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(alhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            alhVar2 = alhVar;
            z2 = z;
            fyz.d(alhVar2, awd.b(asl.J(cfy.e, gjk.c.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 1.0f), z2, null, null, buxVarC, (i2 & 14) | ((i2 << 3) & 896), 24);
        } else {
            alhVar2 = alhVar;
            z2 = z;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gpv(alhVar2, z2, i, 3);
        }
    }

    public static final void f(hky hkyVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1414593592);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hkyVar) : buxVarC.E(hkyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = i2;
        if (buxVarC.I((i4 & 19) != 18, i4 & 1)) {
            hkx hkxVar = ((Boolean) buxVarC.f(gfo.a)).booleanValue() ? hkx.b : hkx.a;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new cil();
                bvvVar.ad(objS);
            }
            cil cilVar = (cil) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new cil();
                bvvVar.ad(objS2);
            }
            cil cilVar2 = (cil) objS2;
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                objS3 = new cil();
                bvvVar.ad(objS3);
            }
            cil cilVar3 = (cil) objS3;
            czz.am(gfl.a.b(gfl.a(hkyVar.a != null, buxVarC)), bxc.i(-1707976952, true, new hjg(hkxVar, cfyVar, hkyVar, cilVar2, cilVar, cilVar3, 2), buxVarC), buxVarC, 56);
            if (hkyVar.c != null) {
                cilVar = cilVar3;
            }
            d(cilVar, hkyVar, buxVarC, (i4 << 3) & 112);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) hkyVar, cfyVar, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.cfy r26, defpackage.afeg r27, defpackage.afeg r28, defpackage.bux r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkw.g(cfy, afeg, afeg, bux, int, int):void");
    }
}
