package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class boz {
    public static final aen a;
    public static final aen b;

    static {
        aen aenVar = bub.a;
        a = bub.a;
        b = bub.d;
    }

    public static final afc a() {
        return ca.G(ca.E(new bmk(6)), 0, 6);
    }

    public static final afc b() {
        return ca.G(ca.E(new bmk(7)), 0, 6);
    }

    public static final afc c() {
        return ca.G(ca.E(new bmk(10)), 0, 6);
    }

    public static final afc d() {
        return ca.G(ca.E(new bmk(11)), 0, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.afdr r31, defpackage.cfy r32, long r33, long r35, int r37, float r38, defpackage.afec r39, defpackage.bux r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boz.e(afdr, cfy, long, long, int, float, afec, bux, int, int):void");
    }

    public static final void f(cmd cmdVar, float f, float f2, long j, cmg cmgVar) {
        long jO = cmdVar.o() >> 32;
        float f3 = cmgVar.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) jO) - (f3 + f3);
        czz.aF(cmdVar, j, f, f2, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), cmgVar, 832);
    }

    public static final void g(cmd cmdVar, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cmdVar.o() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = cmdVar.p() == dlr.a;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (a.Y(i, 0) || fIntBitsToFloat2 > fIntBitsToFloat) {
            cmdVar.s(j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f3, 0);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (Math.abs(f2 - f) > BitmapDescriptorFactory.HUE_RED) {
            if (f6 > f8) {
                f6 = f8;
            }
            if (f5 <= f8) {
                f8 = f5;
            }
            cmdVar.s(j, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f3, i);
        }
    }

    public static final void h(cfy cfyVar, long j, float f, long j2, int i, float f2, bux buxVar, int i2) {
        int i3;
        bux buxVar2;
        final long j3;
        float f3;
        long j4;
        int i4;
        float f4;
        long jF;
        long jI;
        float f5;
        final int i5;
        final float f6;
        final long j5;
        bux buxVarC = buxVar.c(333154241);
        if ((i2 & 6) == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= 16;
        }
        int i6 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i6 = i3 | 1408;
        }
        int i7 = 221184 | i6;
        if (buxVarC.I((74899 & i7) != 74898, i7 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || buxVarC.F()) {
                jF = bnh.f(26, buxVarC);
                jI = cjn.i(0);
                f5 = 4.0f;
                i5 = 1;
                f6 = 4.0f;
            } else {
                buxVarC.s();
                jF = j;
                f5 = f;
                jI = j2;
                i5 = i;
                f6 = f2;
            }
            buxVarC.l();
            final cmg cmgVar = new cmg(((dlg) buxVarC.f(dbc.d)).eA(f5), BitmapDescriptorFactory.HUE_RED, i5, 0, 26);
            afh afhVarL = afp.l(buxVarC);
            final bym bymVarK = afp.k(afhVarL, BitmapDescriptorFactory.HUE_RED, 1080.0f, ca.G(ca.F(6000, 0, aev.d, 2), 0, 6), buxVarC, 4536);
            final bym bymVarK2 = afp.k(afhVarL, BitmapDescriptorFactory.HUE_RED, 360.0f, ca.G(ca.E(new bmk(9)), 0, 6), buxVarC, 4536);
            buxVar2 = buxVarC;
            final bym bymVarK3 = afp.k(afhVarL, 0.1f, 0.87f, ca.G(ca.E(new bmk(8)), 0, 6), buxVarC, 4536);
            cfy cfyVarI = awd.i(ca.aZ(cfyVar), 40.0f);
            final float f7 = f5;
            boolean zC = ((i7 & 896) == 256) | ((57344 & i7) == 16384) | buxVar2.C(bymVarK3) | ((458752 & i7) == 131072) | buxVar2.C(bymVarK) | buxVar2.C(bymVarK2) | buxVar2.B(jI) | buxVar2.E(cmgVar) | buxVar2.B(jF);
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                j3 = jF;
                j5 = jI;
                afec afecVar = new afec() { // from class: boy
                    @Override // defpackage.afec
                    public final Object invoke(Object obj) {
                        cmd cmdVar = (cmd) obj;
                        aen aenVar = boz.a;
                        float fFloatValue = ((Number) bymVarK3.a()).floatValue() * 360.0f;
                        int i8 = i5;
                        long j6 = j3;
                        boolean zY = a.Y(i8, 0);
                        float f8 = f6;
                        long j7 = j5;
                        cmg cmgVar2 = cmgVar;
                        float f9 = (zY || Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L)) > Float.intBitsToFloat((int) (cmdVar.o() >> 32))) ? f8 : f7 + f8;
                        bym bymVar = bymVarK2;
                        float fEx = (f9 / ((float) (cmdVar.ex(Float.intBitsToFloat((int) (cmdVar.o() >> 32))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) bymVarK.a()).floatValue() + ((Number) bymVar.a()).floatValue();
                        long jN = cmdVar.n();
                        cma cmaVarR = cmdVar.r();
                        long jA = cmaVarR.a();
                        cmaVarR.b().g();
                        try {
                            cmaVarR.c.j(fFloatValue2, jN);
                            float fMin = Math.min(fFloatValue, fEx) + fFloatValue;
                            float fMin2 = Math.min(fFloatValue, fEx);
                            boz.f(cmdVar, fMin, (360.0f - fFloatValue) - (fMin2 + fMin2), j7, cmgVar2);
                            boz.f(cmdVar, BitmapDescriptorFactory.HUE_RED, fFloatValue, j6, cmgVar2);
                            cmaVarR.b().e();
                            cmaVarR.h(jA);
                            return afak.a;
                        } catch (Throwable th) {
                            cmaVarR.b().e();
                            cmaVarR.h(jA);
                            throw th;
                        }
                    }
                };
                bvvVar.ad(afecVar);
                objS = afecVar;
            } else {
                j3 = jF;
                j5 = jI;
            }
            afp.z(cfyVarI, (afec) objS, buxVar2, 0);
            i4 = i5;
            f4 = f6;
            f3 = f7;
            j4 = j5;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            j3 = j;
            f3 = f;
            j4 = j2;
            i4 = i;
            f4 = f2;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mwe(cfyVar, j3, f3, j4, i4, f4, i2, 1);
        }
    }

    public static final void i(final cfy cfyVar, final long j, final long j2, float f, bux buxVar, final int i) {
        int i2;
        final float f2;
        boolean z;
        final float f3;
        bux buxVarC = buxVar.c(567589233);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.B(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.A(1) ? 1024 : 2048;
        }
        int i3 = i2 | 24576;
        if (buxVarC.I((i3 & 9363) != 9362, i3 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                z = true;
                f3 = 4.0f;
            } else {
                buxVarC.s();
                z = true;
                f3 = f;
            }
            buxVarC.l();
            afh afhVarL = afp.l(buxVarC);
            final bym bymVarK = afp.k(afhVarL, BitmapDescriptorFactory.HUE_RED, 1.0f, a(), buxVarC, 4536);
            final bym bymVarK2 = afp.k(afhVarL, BitmapDescriptorFactory.HUE_RED, 1.0f, b(), buxVarC, 4536);
            final bym bymVarK3 = afp.k(afhVarL, BitmapDescriptorFactory.HUE_RED, 1.0f, c(), buxVarC, 4536);
            final bym bymVarK4 = afp.k(afhVarL, BitmapDescriptorFactory.HUE_RED, 1.0f, d(), buxVarC, 4536);
            cfy cfyVarK = awd.k(ca.aZ(cfyVar.a(bsd.b)), 240.0f, 4.0f);
            boolean zC = ((57344 & i3) == 16384 ? z : false) | ((i3 & 7168) == 2048 ? z : false) | buxVarC.C(bymVarK) | (((((i3 & 896) ^ 384) <= 256 || !buxVarC.B(j2)) && (i3 & 384) != 256) ? false : z) | buxVarC.C(bymVarK2);
            if ((((i3 & 112) ^ 48) <= 32 || !buxVarC.B(j)) && (i3 & 48) != 32) {
                z = false;
            }
            boolean zC2 = zC | z | buxVarC.C(bymVarK3) | buxVarC.C(bymVarK4);
            Object objS = bvvVar.S();
            if (zC2 || objS == buw.a) {
                afec afecVar = new afec() { // from class: bow
                    @Override // defpackage.afec
                    public final Object invoke(Object obj) {
                        long j3;
                        cmd cmdVar = (cmd) obj;
                        aen aenVar = boz.a;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L));
                        float fEx = f3;
                        if (!a.Y(1, 0) && Float.intBitsToFloat((int) (4294967295L & cmdVar.o())) <= Float.intBitsToFloat((int) (cmdVar.o() >> 32))) {
                            fEx += cmdVar.ex(fIntBitsToFloat);
                        }
                        long j4 = j2;
                        bym bymVar = bymVarK;
                        float fEx2 = fEx / cmdVar.ex(Float.intBitsToFloat((int) (cmdVar.o() >> 32)));
                        if (((Number) bymVar.a()).floatValue() < 1.0f - fEx2) {
                            boz.g(cmdVar, ((Number) bymVar.a()).floatValue() > BitmapDescriptorFactory.HUE_RED ? ((Number) bymVar.a()).floatValue() + fEx2 : 0.0f, 1.0f, j4, fIntBitsToFloat, 1);
                        }
                        long j5 = j;
                        bym bymVar2 = bymVarK2;
                        if (((Number) bymVar.a()).floatValue() - ((Number) bymVar2.a()).floatValue() > BitmapDescriptorFactory.HUE_RED) {
                            boz.g(cmdVar, ((Number) bymVar.a()).floatValue(), ((Number) bymVar2.a()).floatValue(), j5, fIntBitsToFloat, 1);
                            j3 = j5;
                        } else {
                            j3 = j5;
                        }
                        bym bymVar3 = bymVarK3;
                        if (((Number) bymVar2.a()).floatValue() > fEx2) {
                            boz.g(cmdVar, ((Number) bymVar3.a()).floatValue() > BitmapDescriptorFactory.HUE_RED ? ((Number) bymVar3.a()).floatValue() + fEx2 : 0.0f, ((Number) bymVar2.a()).floatValue() < 1.0f ? ((Number) bymVar2.a()).floatValue() - fEx2 : 1.0f, j4, fIntBitsToFloat, 1);
                        }
                        bym bymVar4 = bymVarK4;
                        if (((Number) bymVar3.a()).floatValue() - ((Number) bymVar4.a()).floatValue() > BitmapDescriptorFactory.HUE_RED) {
                            boz.g(cmdVar, ((Number) bymVar3.a()).floatValue(), ((Number) bymVar4.a()).floatValue(), j3, fIntBitsToFloat, 1);
                            cmdVar = cmdVar;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        if (((Number) bymVar4.a()).floatValue() > fEx2) {
                            boz.g(cmdVar, BitmapDescriptorFactory.HUE_RED, ((Number) bymVar4.a()).floatValue() < 1.0f ? ((Number) bymVar4.a()).floatValue() - fEx2 : 1.0f, j4, fIntBitsToFloat, 1);
                        }
                        return afak.a;
                    }
                };
                bvvVar.ad(afecVar);
                objS = afecVar;
            }
            afp.z(cfyVarK, (afec) objS, buxVarC, 0);
            f2 = f3;
        } else {
            buxVarC.s();
            f2 = f;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: box
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    boz.i(cfyVar, j, j2, f2, buxVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return afak.a;
                }
            };
        }
    }
}
