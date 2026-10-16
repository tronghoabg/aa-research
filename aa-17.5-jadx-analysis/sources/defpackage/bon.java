package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bon {
    public static final float a;
    private static final float b;
    private static final float c;

    static {
        asl.K(4.0f, BitmapDescriptorFactory.HUE_RED, 2);
        new avr(4.0f, 2.0f, 4.0f, 2.0f);
        ((Boolean) bos.a.a()).booleanValue();
        a = 8.0f;
        b = 112.0f;
        c = 280.0f;
    }

    public static final void a(afeg afegVar, afdr afdrVar, cfy cfyVar, boolean z, bok bokVar, avp avpVar, bux buxVar, int i) {
        afeg afegVar2;
        int i2;
        afdr afdrVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1325192924);
        if (i3 == 0) {
            afegVar2 = afegVar;
            i2 = (true != buxVarC.E(afegVar2) ? 2 : 4) | i;
        } else {
            afegVar2 = afegVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            afdrVar2 = afdrVar;
            i2 |= true != buxVarC.E(afdrVar2) ? 16 : 32;
        } else {
            afdrVar2 = afdrVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(bokVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.C(avpVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != buxVarC.C(null) ? 33554432 : 67108864;
        }
        if (buxVarC.I((38347923 & i2) != 38347922, i2 & 1)) {
            cfy cfyVarG = asl.G(awd.l(awd.r(afp.w(cfyVar, null, bpe.a(true, BitmapDescriptorFactory.HUE_RED, 0L, null, false, 254), z, null, afdrVar2)), b, 48.0f, c, Float.NaN), avpVar);
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarG);
            afdr afdrVar3 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar3);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            brp.a(czz.av(buxVarC).m, bxc.i(865999929, true, new guy(bokVar, z, avy.a, afegVar2, 1), buxVarC), buxVarC, 48);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(afegVar, afdrVar, cfyVar, z, bokVar, avpVar, i, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [aew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [aew, java.lang.Object] */
    public static final void b(final cfy cfyVar, final afm afmVar, final afdr afdrVar, final alh alhVar, final ckv ckvVar, final long j, final float f, final afeh afehVar, bux buxVar, final int i) {
        Object obj;
        int i2;
        Object obj2;
        Object objE;
        Float f2;
        Object objE2;
        Float f3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1278879194);
        int i4 = 1;
        if (i3 == 0) {
            obj = cfyVar;
            i2 = (true != buxVarC.C(obj) ? 2 : 4) | i;
        } else {
            obj = cfyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(afmVar) : buxVarC.E(afmVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(alhVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(ckvVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.B(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.z(BitmapDescriptorFactory.HUE_RED) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.z(f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != buxVarC.C(null) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            obj2 = afehVar;
            i2 |= true != buxVarC.E(obj2) ? 268435456 : 536870912;
        } else {
            obj2 = afehVar;
        }
        if (buxVarC.I((306783379 & i2) != 306783378, i2 & 1)) {
            agg aggVarR = afp.r(afmVar, "DropDownMenu", buxVarC, ((((i2 >> 3) & 14) | 48) & 14) | 48);
            aew aewVarB = rl.b(2, buxVarC);
            aew aewVarB2 = rl.b(5, buxVarC);
            bol bolVar = new bol(aewVarB, i4);
            bii biiVar = agm.a;
            if (aggVarR.w()) {
                buxVarC.v(1666827533);
                ((bvv) buxVarC).Y(false);
                objE = aggVarR.e();
            } else {
                buxVarC.v(1666573488);
                boolean zC = buxVarC.C(aggVarR);
                bvv bvvVar = (bvv) buxVarC;
                objE = bvvVar.S();
                if (zC || objE == buw.a) {
                    cec cecVarH = byx.h();
                    afec afecVarI = cecVarH != null ? cecVarH.i() : null;
                    cec cecVarI = byx.i(cecVarH);
                    try {
                        Object objE3 = aggVarR.e();
                        byx.l(cecVarH, cecVarI, afecVarI);
                        bvvVar.ad(objE3);
                        objE = objE3;
                    } finally {
                    }
                }
                bvvVar.Y(false);
            }
            boolean zBooleanValue = ((Boolean) objE).booleanValue();
            buxVarC.v(-904349302);
            float f4 = true != zBooleanValue ? 0.8f : 1.0f;
            bvv bvvVar2 = (bvv) buxVarC;
            bvvVar2.Y(false);
            Float fValueOf = Float.valueOf(f4);
            boolean zC2 = buxVarC.C(aggVarR);
            Object objS = bvvVar2.S();
            if (zC2 || objS == buw.a) {
                ahp ahpVar = new ahp(aggVarR, 4);
                lah lahVar = byj.a;
                objS = new bvk(ahpVar, null);
                bvvVar2.ad(objS);
            }
            boolean zBooleanValue2 = ((Boolean) ((bym) objS).a()).booleanValue();
            buxVarC.v(-904349302);
            float f5 = true != zBooleanValue2 ? 0.8f : 1.0f;
            bvvVar2.Y(false);
            Float fValueOf2 = Float.valueOf(f5);
            boolean zC3 = buxVarC.C(aggVarR);
            Object objS2 = bvvVar2.S();
            if (zC3 || objS2 == buw.a) {
                ahq ahqVar = new ahq(aggVarR, 3);
                lah lahVar2 = byj.a;
                f2 = fValueOf;
                objS2 = new bvk(ahqVar, null);
                bvvVar2.ad(objS2);
            } else {
                f2 = fValueOf;
            }
            boolean z = false;
            bym bymVarAf = afp.af(aggVarR, f2, fValueOf2, bolVar.invoke(((bym) objS2).a(), buxVarC, 0), biiVar, buxVarC, 0);
            bol bolVar2 = new bol(aewVarB2, false ? 1 : 0);
            bii biiVar2 = agm.a;
            if (aggVarR.w()) {
                buxVarC.v(1666827533);
                bvvVar2.Y(false);
                objE2 = aggVarR.e();
            } else {
                buxVarC.v(1666573488);
                boolean zC4 = buxVarC.C(aggVarR);
                objE2 = bvvVar2.S();
                if (zC4 || objE2 == buw.a) {
                    cec cecVarH2 = byx.h();
                    afec afecVarI2 = cecVarH2 != null ? cecVarH2.i() : null;
                    cec cecVarI2 = byx.i(cecVarH2);
                    try {
                        Object objE4 = aggVarR.e();
                        byx.l(cecVarH2, cecVarI2, afecVarI2);
                        bvvVar2.ad(objE4);
                        objE2 = objE4;
                        z = false;
                    } finally {
                    }
                }
                bvvVar2.Y(z);
            }
            boolean zBooleanValue3 = ((Boolean) objE2).booleanValue();
            buxVarC.v(2062693622);
            float f6 = true != zBooleanValue3 ? BitmapDescriptorFactory.HUE_RED : 1.0f;
            bvvVar2.Y(z);
            Float fValueOf3 = Float.valueOf(f6);
            boolean zC5 = buxVarC.C(aggVarR);
            Object objS3 = bvvVar2.S();
            if (zC5 || objS3 == buw.a) {
                ahp ahpVar2 = new ahp(aggVarR, 5);
                lah lahVar3 = byj.a;
                objS3 = new bvk(ahpVar2, null);
                bvvVar2.ad(objS3);
            }
            boolean zBooleanValue4 = ((Boolean) ((bym) objS3).a()).booleanValue();
            buxVarC.v(2062693622);
            float f7 = true != zBooleanValue4 ? BitmapDescriptorFactory.HUE_RED : 1.0f;
            bvvVar2.Y(false);
            Float fValueOf4 = Float.valueOf(f7);
            boolean zC6 = buxVarC.C(aggVarR);
            Object objS4 = bvvVar2.S();
            if (zC6 || objS4 == buw.a) {
                ahq ahqVar2 = new ahq(aggVarR, 4);
                lah lahVar4 = byj.a;
                f3 = fValueOf3;
                objS4 = new bvk(ahqVar2, null);
                bvvVar2.ad(objS4);
            } else {
                f3 = fValueOf3;
            }
            bym bymVarAf2 = afp.af(aggVarR, f3, fValueOf4, bolVar2.invoke(((bym) objS4).a(), buxVarC, 0), biiVar2, buxVarC, 0);
            boolean zBooleanValue5 = ((Boolean) buxVarC.f(dbo.a)).booleanValue();
            cfv cfvVar = cfy.e;
            boolean zD = buxVarC.D(zBooleanValue5) | buxVarC.C(bymVarAf) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && buxVarC.E(afmVar))) | buxVarC.C(bymVarAf2);
            boolean z2 = (i2 & 896) == 256;
            Object objS5 = bvvVar2.S();
            if ((zD | z2) || objS5 == buw.a) {
                objS5 = new ewn(zBooleanValue5, afmVar, afdrVar, bymVarAf, bymVarAf2, 1);
                bvvVar2.ad(objS5);
            }
            bqp.b(cjn.f(cfvVar, (afec) objS5), ckvVar, j, 0L, f, null, bxc.i(-816027071, true, new brf(obj, (Object) alhVar, obj2, 1, (byte[]) null), buxVarC), buxVarC, 8);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bom
                @Override // defpackage.afeg
                public final Object invoke(Object obj3, Object obj4) {
                    bux buxVar2 = (bux) obj3;
                    ((Integer) obj4).intValue();
                    cfy cfyVar2 = cfyVar;
                    afm afmVar2 = afmVar;
                    afdr afdrVar2 = afdrVar;
                    alh alhVar2 = alhVar;
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    bon.b(cfyVar2, afmVar2, afdrVar2, alhVar2, ckvVar, j, f, afehVar, buxVar2, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7));
                    return afak.a;
                }
            };
        }
    }
}
