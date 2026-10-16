package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class brb {
    public static final float a;
    public static final float b = 16.0f;
    public static final long c;

    static {
        float f = bud.a;
        a = bud.a;
        c = dln.f(20);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r21, final defpackage.afdr r22, defpackage.cfy r23, boolean r24, long r25, long r27, defpackage.asf r29, final defpackage.afeh r30, defpackage.bux r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brb.a(boolean, afdr, cfy, boolean, long, long, asf, afeh, bux, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [aew, java.lang.Object] */
    public static final void b(final long j, final long j2, boolean z, final afeg afegVar, bux buxVar, final int i) {
        long j3;
        int i2;
        final boolean z2;
        int i3;
        boolean z3;
        Object objE;
        bii biiVar;
        long j4;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-833145221);
        if (i4 == 0) {
            j3 = j;
            i2 = (true != buxVarC.B(j3) ? 2 : 4) | i;
        } else {
            j3 = j;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.B(j2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= true != buxVarC.D(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            int i5 = i2 >> 6;
            agg aggVarP = afp.p(Boolean.valueOf(z2), null, buxVarC, i5 & 14, 2);
            bqy bqyVar = new bqy(0);
            boolean zBooleanValue = ((Boolean) aggVarP.g()).booleanValue();
            buxVarC.v(-1069234984);
            long j5 = true != zBooleanValue ? j2 : j3;
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.Y(false);
            clh clhVarF = cjv.f(j5);
            boolean zC = buxVarC.C(clhVarF);
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = abx.a.invoke(clhVarF);
                bvvVar.ad(objS);
            }
            bii biiVar2 = (bii) objS;
            if (aggVarP.w()) {
                i3 = i5;
                z3 = false;
                buxVarC.v(1666827533);
                bvvVar.Y(false);
                objE = aggVarP.e();
            } else {
                buxVarC.v(1666573488);
                boolean zC2 = buxVarC.C(aggVarP);
                objE = bvvVar.S();
                if (zC2 || objE == buw.a) {
                    cec cecVarH = byx.h();
                    afec afecVarI = cecVarH != null ? cecVarH.i() : null;
                    cec cecVarI = byx.i(cecVarH);
                    i3 = i5;
                    try {
                        Object objE2 = aggVarP.e();
                        byx.l(cecVarH, cecVarI, afecVarI);
                        bvvVar.ad(objE2);
                        objE = objE2;
                        z3 = false;
                    } catch (Throwable th) {
                        byx.l(cecVarH, cecVarI, afecVarI);
                        throw th;
                    }
                } else {
                    i3 = i5;
                    z3 = false;
                }
                bvvVar.Y(z3);
            }
            boolean zBooleanValue2 = ((Boolean) objE).booleanValue();
            buxVarC.v(-1069234984);
            long j6 = true != zBooleanValue2 ? j2 : j3;
            bvvVar.Y(z3);
            cjv cjvVar = new cjv(j6);
            boolean zC3 = buxVarC.C(aggVarP);
            Object objS2 = bvvVar.S();
            if (zC3 || objS2 == buw.a) {
                ahp ahpVar = new ahp(aggVarP, 8);
                lah lahVar = byj.a;
                objS2 = new bvk(ahpVar, null);
                bvvVar.ad(objS2);
            }
            boolean zBooleanValue3 = ((Boolean) ((bym) objS2).a()).booleanValue();
            buxVarC.v(-1069234984);
            if (true != zBooleanValue3) {
                biiVar = biiVar2;
                j4 = j2;
            } else {
                biiVar = biiVar2;
                j4 = j3;
            }
            bvvVar.Y(false);
            cjv cjvVar2 = new cjv(j4);
            boolean zC4 = buxVarC.C(aggVarP);
            Object objS3 = bvvVar.S();
            if (zC4 || objS3 == buw.a) {
                ahq ahqVar = new ahq(aggVarP, 5);
                lah lahVar2 = byj.a;
                objS3 = new bvk(ahqVar, null);
                bvvVar.ad(objS3);
            }
            czz.am(bnm.a.b(new cjv(((cjv) afp.af(aggVarP, cjvVar, cjvVar2, bqyVar.invoke(((bym) objS3).a(), buxVarC, 0), biiVar, buxVarC, 0).a()).a)), afegVar, buxVarC, (i3 & 112) | 8);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bqz
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i6 = i | 1;
                    int i7 = 306783378 & i6;
                    int i8 = 613566756 & i6;
                    brb.b(j, j2, z2, afegVar, buxVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-1349901398);
        if (i4 == 0) {
            i2 = (true != buxVarC.E(afegVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(null) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i5 = i2 & 14;
            boolean z3 = i5 == 4;
            boolean z4 = (i2 & 112) == 32;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if ((z4 | z3) || objS == buw.a) {
                objS = new bra(afegVar, 0);
                bvvVar.ad(objS);
            }
            ctp ctpVar = (ctp) objS;
            cfv cfvVar = cfy.e;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar2 = cwb.e;
            byq.c(buxVarC, ctpVar, afegVar2);
            afeg afegVar3 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar3);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar4 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar4);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar5 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar5);
            if (afegVar != null) {
                buxVarC.v(870361332);
                cfy cfyVarI = asl.I(new csv("text"), b, BitmapDescriptorFactory.HUE_RED);
                ctp ctpVarB = atk.b(cfl.a, false);
                int iG2 = a.g(bvvVar.u);
                ccx ccxVarAh2 = bvvVar.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarI);
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarB, afegVar2);
                byq.c(buxVarC, ccxVarAh2, afegVar3);
                byq.c(buxVarC, Integer.valueOf(iG2), afegVar4);
                byq.b(buxVarC, afecVar);
                byq.c(buxVarC, cfyVarJ2, afegVar5);
                afegVar.invoke(buxVarC, Integer.valueOf(i5));
                z = true;
                bvvVar.Y(true);
                z2 = 0;
                bvvVar.Y(false);
            } else {
                z = true;
                z2 = 0;
                buxVarC.v(870466081);
                bvvVar.Y(false);
            }
            buxVarC.v(870557345);
            bvvVar.Y(z2);
            bvvVar.Y(z);
            i3 = z2;
        } else {
            i3 = 0;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(afegVar, i, i3);
        }
    }

    public static final void d(boolean z, afdr afdrVar, cfy cfyVar, boolean z2, afeg afegVar, long j, long j2, bux buxVar, int i) {
        boolean z3;
        int i2;
        bux buxVar2;
        cfy cfyVar2;
        boolean z4;
        long j3;
        long j4;
        cfy cfyVar3;
        long j5;
        long j6;
        boolean z5;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1015017965);
        if (i3 == 0) {
            z3 = z;
            i2 = (true != buxVarC.D(z3) ? 2 : 4) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        int i4 = i2 | 3456;
        if ((i & 24576) == 0) {
            i4 |= true != buxVarC.E(afegVar) ? 8192 : 16384;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = i4 | 720896;
        }
        if ((i & 12582912) == 0) {
            i5 |= 4194304;
        }
        int i6 = 100663296 | i5;
        if (buxVarC.I((38347923 & i6) != 38347922, i6 & 1)) {
            int i7 = (-33030145) & i6;
            bvv bvvVar = (bvv) buxVarC;
            cct cctVarI = null;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfyVar3 = cfy.e;
                j5 = ((cjv) buxVarC.f(bnm.a)).a;
                j6 = j5;
                z5 = true;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                z5 = z2;
                j5 = j;
                j6 = j2;
            }
            buxVarC.l();
            if (afegVar == null) {
                buxVarC.v(1830887765);
                bvvVar.Y(false);
            } else {
                buxVarC.v(1830887766);
                cctVarI = bxc.i(-1745256900, true, new bly(afegVar, 7), buxVarC);
                bvvVar.Y(false);
            }
            buxVar2 = buxVarC;
            a(z3, afdrVar, bzi.C(cfyVar3, new bqy(1)), z5, j5, j6, null, bxc.i(-906085472, true, new bol(cctVarI, 3), buxVarC), buxVar2, 12582912 | (i6 & 14) | (i6 & 112) | (i6 & 7168) | (3670016 & (i7 >> 6)), 0);
            cfyVar2 = cfyVar3;
            z4 = z5;
            j3 = j5;
            j4 = j6;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
            z4 = z2;
            j3 = j;
            j4 = j2;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new myc(z, afdrVar, cfyVar2, z4, afegVar, j3, j4, i, 1);
        }
    }
}
