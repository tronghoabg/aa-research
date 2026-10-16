package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bqb {
    public static final bqb a = new bqb();
    private static final cjm b = new cjm((byte[]) null);

    public static final void a(cmd cmdVar, api apiVar, long j, long j2, long j3, float f, float f2) {
        cjc cjcVarB;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        if (apiVar == api.a) {
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            cjcVarB = byx.B(byx.E(j, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
            cjcVarB = byx.B(byx.E(j, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        cjm cjmVar = b;
        cjmVar.q(cjcVarB);
        czz.aJ(cmdVar, cjmVar, j3, null, 60);
        cjmVar.k();
    }

    public static final bpv b(bng bngVar) {
        bpv bpvVar = bngVar.ae;
        if (bpvVar != null) {
            return bpvVar;
        }
        bpv bpvVar2 = new bpv(bnh.e(bngVar, 26), bnh.e(bngVar, 26), bnh.e(bngVar, 32), bnh.e(bngVar, 32), bnh.e(bngVar, 26), cjn.l(cjv.h(bnh.e(bngVar, 18), 0.38f), bngVar.p), cjv.h(bnh.e(bngVar, 18), 0.38f), cjv.h(bnh.e(bngVar, 18), 0.12f), cjv.h(bnh.e(bngVar, 18), 0.12f), cjv.h(bnh.e(bngVar, 18), 0.38f));
        bngVar.ae = bpvVar2;
        return bpvVar2;
    }

    public static final void f(cmd cmdVar, long j, long j2) {
        czz.aH(cmdVar, j2, cmdVar.eA(4.0f) / 2.0f, j, null, 120);
    }

    public final void c(final asf asfVar, final cfy cfyVar, final bpv bpvVar, final boolean z, final long j, bux buxVar, final int i) {
        asf asfVar2;
        int i2;
        bqb bqbVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-290277409);
        if (i3 == 0) {
            asfVar2 = asfVar;
            i2 = (true != buxVarC.C(asfVar2) ? 2 : 4) | i;
        } else {
            asfVar2 = asfVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(bpvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.B(j) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            bqbVar = this;
            i2 |= true != buxVarC.C(bqbVar) ? 65536 : 131072;
        } else {
            bqbVar = this;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            int i4 = i2 & 7168;
            bqh.c(asfVar2, cfyVar, bpvVar, z, j, buxVarC, (i2 & 14) | 196608 | (i2 & 112) | (i2 & 896) | i4 | (i2 & 57344));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            final bqb bqbVar2 = bqbVar;
            bxfVarJ.c = new afeg() { // from class: bpx
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    bqb bqbVar3 = this.a;
                    asf asfVar3 = asfVar;
                    int i5 = i;
                    int i6 = i5 | 1;
                    int i7 = 306783378 & i6;
                    int i8 = 613566756 & i6;
                    bqbVar3.c(asfVar3, cfyVar, bpvVar, z, j, buxVar2, (i8 >> 1) | i7 | (i6 & (-920350135)) | ((i7 + i7) & i8));
                    return afak.a;
                }
            };
        }
    }

    public final void d(final bqj bqjVar, final cfy cfyVar, final boolean z, final bpv bpvVar, afeg afegVar, afeh afehVar, float f, float f2, bux buxVar, final int i) {
        bqj bqjVar2;
        int i2;
        cfy cfyVar2;
        final afeg afegVar2;
        final afeh afehVar2;
        final float f3;
        bux buxVar2;
        final float f4;
        afeg afegVar3;
        float f5;
        float f6;
        afeh afehVar3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(49984771);
        int i4 = 1;
        if (i3 == 0) {
            bqjVar2 = bqjVar;
            i2 = (true != buxVarC.E(bqjVar2) ? 2 : 4) | i;
        } else {
            bqjVar2 = bqjVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            cfyVar2 = cfyVar;
            i2 |= true != buxVarC.C(cfyVar2) ? 16 : 32;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(bpvVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        int i5 = i2 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= true != buxVarC.C(this) ? 33554432 : 67108864;
        }
        if (buxVarC.I((38347923 & i5) != 38347922, i5 & 1)) {
            int i6 = (-57345) & i5;
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                boolean z2 = (((i5 & 7168) ^ 3072) > 2048 && buxVarC.C(bpvVar)) || (i5 & 3072) == 2048;
                boolean z3 = (i5 & 896) == 256;
                Object objS = bvvVar.S();
                if ((z2 | z3) || objS == buw.a) {
                    objS = new jtl(bpvVar, z, i4);
                    bvvVar.ad(objS);
                }
                afegVar3 = (afeg) objS;
                Object objS2 = bvvVar.S();
                if (objS2 == buw.a) {
                    objS2 = mtk.b;
                    bvvVar.ad(objS2);
                }
                f5 = bqh.a;
                f6 = bqh.b;
                afehVar3 = (afeh) objS2;
            } else {
                buxVarC.s();
                afegVar3 = afegVar;
                afehVar3 = afehVar;
                f5 = f;
                f6 = f2;
            }
            buxVarC.l();
            int i7 = i6 << 3;
            afeg afegVar4 = afegVar3;
            float f7 = f5;
            float f8 = f6;
            e(bqjVar2, cfyVar2, z, bpvVar, afegVar4, afehVar3, f7, f8, buxVarC, (i7 & 234881024) | (i5 & 14) | 805306416 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (3670016 & i7) | (29360128 & i7), ((i5 >> 21) & 112) | 6);
            buxVar2 = buxVarC;
            f4 = f8;
            f3 = f7;
            afehVar2 = afehVar3;
            afegVar2 = afegVar4;
        } else {
            buxVarC.s();
            afegVar2 = afegVar;
            afehVar2 = afehVar;
            f3 = f;
            buxVar2 = buxVarC;
            f4 = f2;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bqa
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar3 = (bux) obj;
                    ((Integer) obj2).intValue();
                    bqb bqbVar = this.a;
                    bqj bqjVar3 = bqjVar;
                    cfy cfyVar3 = cfyVar;
                    boolean z4 = z;
                    bpv bpvVar2 = bpvVar;
                    int i8 = i | 1;
                    int i9 = 306783378 & i8;
                    int i10 = 613566756 & i8;
                    bqbVar.d(bqjVar3, cfyVar3, z4, bpvVar2, afegVar2, afehVar2, f3, f4, buxVar3, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10));
                    return afak.a;
                }
            };
        }
    }

    public final void e(final bqj bqjVar, final cfy cfyVar, final boolean z, final bpv bpvVar, final afeg afegVar, final afeh afehVar, final float f, final float f2, bux buxVar, final int i, final int i2) {
        int i3;
        int i4;
        bux buxVar2;
        cfy cfyVarD;
        cfy cfyVar2;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(133396521);
        if (i5 == 0) {
            i3 = (true != buxVarC.E(bqjVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.z(Float.NaN) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.C(bpvVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.E(afegVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.E(afehVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != buxVarC.z(f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != buxVarC.z(f2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != buxVarC.D(false) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.D(false) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i6 = i3;
            final long jB = bpvVar.b(z, false);
            final long jB2 = bpvVar.b(z, true);
            int i7 = i4;
            final long jA = bpvVar.a(z, false);
            final long jA2 = bpvVar.a(z, true);
            Object obj = ((kgx) buxVarC.f(bpe.a)).a;
            if (bqjVar.f == api.a) {
                float f3 = bqh.a;
                cfyVarD = awd.b(awd.m(cfyVar, 16.0f), 1.0f);
            } else {
                cfy cfyVarR = awd.r(cfyVar);
                float f4 = bqh.a;
                cfyVarD = awd.d(cfyVarR, 16.0f);
            }
            boolean z2 = (i6 & 112) == 32;
            cfv cfvVar = cfy.e;
            boolean zE = z2 | buxVarC.E(bqjVar);
            bvv bvvVar = (bvv) buxVarC;
            boolean z3 = z2;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new bol(bqjVar, 2);
                bvvVar.ad(objS);
            }
            cfy cfyVarA = cfyVarD.a(bzi.C(cfvVar, (afeh) objS));
            boolean zE2 = z3 | buxVarC.E(bqjVar) | ((i7 & 14) == 4) | buxVarC.B(jB) | buxVarC.B(jB2) | buxVarC.B(jA) | buxVarC.B(jA2) | ((i6 & 29360128) == 8388608) | buxVarC.z(BitmapDescriptorFactory.HUE_RED);
            boolean z4 = (i6 & 234881024) == 67108864;
            boolean z5 = (i6 & 458752) == 131072;
            boolean z6 = (i6 & 3670016) == 1048576;
            boolean z7 = (i6 & 1879048192) == 536870912;
            Object objS2 = bvvVar.S();
            if (((zE2 | z4 | z5 | z6) || z7) || objS2 == buw.a) {
                buxVar2 = buxVarC;
                cfyVar2 = cfyVarA;
                objS2 = new afec() { // from class: bpy
                    @Override // defpackage.afec
                    public final Object invoke(Object obj2) {
                        float fEA;
                        float fEA2;
                        float fEA3;
                        float f5;
                        float f6;
                        long j;
                        float f7;
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        long jFloatToRawIntBits3;
                        int iFloatToRawIntBits2;
                        float f8;
                        float f9;
                        float f10;
                        long jFloatToRawIntBits4;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits5;
                        long j2;
                        cmd cmdVar;
                        api apiVar;
                        long jFloatToRawIntBits6;
                        float f11;
                        long j3;
                        long jFloatToRawIntBits7;
                        int iFloatToRawIntBits4;
                        long jFloatToRawIntBits8;
                        cmd cmdVar2 = (cmd) obj2;
                        bqb bqbVar = bqb.a;
                        bqj bqjVar2 = bqjVar;
                        if (dlj.c(Float.NaN, Float.NaN)) {
                            fEA = (bqjVar2.f == api.a ? Float.intBitsToFloat((int) (cmdVar2.o() >> 32)) : Float.intBitsToFloat((int) (cmdVar2.o() & 4294967295L))) / 2.0f;
                        } else {
                            fEA = cmdVar2.eA(Float.NaN);
                        }
                        float f12 = f;
                        bqjVar2.a();
                        bqjVar2.a();
                        float fEy = cmdVar2.ey(bqjVar2.e());
                        float fEy2 = cmdVar2.ey(bqjVar2.d());
                        float[] fArr = bqjVar2.c;
                        float fA = bqjVar2.a();
                        float fEx = cmdVar2.ex(fEA);
                        api apiVar2 = bqjVar2.f;
                        api apiVar3 = api.a;
                        boolean z8 = false;
                        boolean z9 = cmdVar2.p() == dlr.b;
                        boolean z10 = apiVar2 == apiVar3;
                        if (z9 && !z10) {
                            z8 = true;
                        }
                        float fEA4 = cmdVar2.eA(fEx);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (z10 ? cmdVar2.o() & 4294967295L : cmdVar2.o() >> 32));
                        float f13 = f12 + BitmapDescriptorFactory.HUE_RED;
                        float f14 = f2;
                        float f15 = fIntBitsToFloat - fEA4;
                        float f16 = (fIntBitsToFloat + BitmapDescriptorFactory.HUE_RED) * fA;
                        float fEA5 = cmdVar2.eA(f14);
                        if (z10) {
                            if (dlj.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > 0) {
                                cmdVar2.eA(BitmapDescriptorFactory.HUE_RED);
                                cmdVar2.eA(BitmapDescriptorFactory.HUE_RED);
                            }
                            if (dlj.a(f13, BitmapDescriptorFactory.HUE_RED) > 0) {
                                fEA2 = cmdVar2.eA(fEy2) / 2.0f;
                                fEA3 = cmdVar2.eA(f13);
                                f5 = fEA2 + fEA3;
                            }
                            f5 = 0.0f;
                        } else {
                            if (dlj.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > 0) {
                                cmdVar2.eA(BitmapDescriptorFactory.HUE_RED);
                                cmdVar2.eA(BitmapDescriptorFactory.HUE_RED);
                            }
                            if (dlj.a(f13, BitmapDescriptorFactory.HUE_RED) > 0) {
                                fEA2 = cmdVar2.eA(fEy) / 2.0f;
                                fEA3 = cmdVar2.eA(f13);
                                f5 = fEA2 + fEA3;
                            }
                            f5 = 0.0f;
                        }
                        float f17 = f16 + BitmapDescriptorFactory.HUE_RED;
                        Float.intBitsToFloat((int) (z10 ? cmdVar2.n() & 4294967295L : cmdVar2.n() >> 32));
                        float f18 = f17 + f5;
                        afeg afegVar2 = afegVar;
                        if (f17 < (fIntBitsToFloat - f5) - fEA4) {
                            if (true != z8) {
                                f8 = 0.0f;
                                f9 = fEA5;
                            } else {
                                f8 = 0.0f;
                                f9 = fEA4;
                            }
                            float f19 = true != z8 ? fEA4 : fEA5;
                            float f20 = fIntBitsToFloat - f18;
                            if (z10) {
                                long jFloatToRawIntBits9 = Float.floatToRawIntBits(f8);
                                f10 = f8;
                                j = 4294967295L;
                                jFloatToRawIntBits5 = Float.floatToRawIntBits(f18);
                                j2 = jFloatToRawIntBits9 << 32;
                            } else {
                                f10 = f8;
                                j = 4294967295L;
                                if (z9) {
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f10);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(f10);
                                } else {
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f18);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(f10);
                                }
                                jFloatToRawIntBits5 = iFloatToRawIntBits3;
                                j2 = jFloatToRawIntBits4 << 32;
                            }
                            long j4 = j2 | (jFloatToRawIntBits5 & j);
                            if (z10) {
                                jFloatToRawIntBits6 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cmdVar2.o() >> 32))) << 32) | (Float.floatToRawIntBits(f20) & j);
                                apiVar = apiVar2;
                                f11 = f18;
                                j3 = j4;
                            } else {
                                if (z9) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cmdVar2.o() >> 32)) - f18;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cmdVar2.o() & j));
                                    long jFloatToRawIntBits10 = Float.floatToRawIntBits(fIntBitsToFloat2);
                                    int iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat3);
                                    cmdVar = cmdVar2;
                                    apiVar = apiVar2;
                                    jFloatToRawIntBits6 = (jFloatToRawIntBits10 << 32) | (iFloatToRawIntBits5 & j);
                                } else {
                                    cmdVar = cmdVar2;
                                    apiVar = apiVar2;
                                    jFloatToRawIntBits6 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cmdVar.o() & j))) & j) | (Float.floatToRawIntBits(f20) << 32);
                                }
                                f11 = f18;
                                j3 = j4;
                                cmdVar2 = cmdVar;
                            }
                            long j5 = jFloatToRawIntBits6;
                            f6 = f11;
                            apiVar2 = apiVar;
                            f7 = f10;
                            bqb.a(cmdVar2, apiVar2, j3, j5, jB, f9, f19);
                            if (z10) {
                                jFloatToRawIntBits8 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cmdVar2.n() >> 32))) << 32) | (Float.floatToRawIntBits(f15) & j);
                            } else {
                                if (z9) {
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (cmdVar2.n() & j));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(fEA4);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat4);
                                } else {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (cmdVar2.n() & j));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(f15);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat5);
                                }
                                jFloatToRawIntBits8 = (jFloatToRawIntBits7 << 32) | (iFloatToRawIntBits4 & j);
                            }
                            if (afegVar2 != null) {
                                afegVar2.invoke(cmdVar2, new cja(jFloatToRawIntBits8));
                            }
                        } else {
                            f6 = f18;
                            j = 4294967295L;
                            f7 = 0.0f;
                        }
                        float f21 = f17 - f5;
                        float f22 = !z8 ? fEA4 : fEA5;
                        float f23 = true != z8 ? fEA5 : fEA4;
                        float f24 = z8 ? f21 : f21 + f7;
                        if (f24 > f22) {
                            if (!z10 && z9) {
                                jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (cmdVar2.o() >> 32)) - f21);
                                iFloatToRawIntBits = Float.floatToRawIntBits(f7);
                            } else {
                                jFloatToRawIntBits = Float.floatToRawIntBits(f7);
                                iFloatToRawIntBits = Float.floatToRawIntBits(f7);
                            }
                            long j6 = (jFloatToRawIntBits << 32) | (iFloatToRawIntBits & j);
                            if (z10) {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (cmdVar2.o() >> 32)));
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f24);
                            } else if (z9) {
                                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (cmdVar2.o() & j));
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(f21);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat6);
                            } else {
                                jFloatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cmdVar2.o() & j))) & j) | (Float.floatToRawIntBits(f24) << 32);
                                bqb.a(cmdVar2, apiVar2, j6, jFloatToRawIntBits2, jB2, f22, f23);
                            }
                            jFloatToRawIntBits2 = (jFloatToRawIntBits3 << 32) | (iFloatToRawIntBits2 & j);
                            bqb.a(cmdVar2, apiVar2, j6, jFloatToRawIntBits2, jB2, f22, f23);
                        }
                        new afgw(f7, f21);
                        new afgw(f21, f6);
                        return afak.a;
                    }
                };
                bvvVar.ad(objS2);
            } else {
                buxVar2 = buxVarC;
                cfyVar2 = cfyVarA;
            }
            afp.z(cfyVar2, (afec) objS2, buxVar2, 0);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bpz
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    bqb bqbVar = this.a;
                    bqj bqjVar2 = bqjVar;
                    cfy cfyVar3 = cfyVar;
                    boolean z8 = z;
                    bpv bpvVar2 = bpvVar;
                    int i8 = i;
                    afeg afegVar2 = afegVar;
                    int i9 = i2;
                    int i10 = i8 | 1;
                    int i11 = i9 & 306783378;
                    int i12 = 306783378 & i10;
                    float f5 = f;
                    int i13 = i9 & 613566756;
                    int i14 = i10 & 613566756;
                    float f6 = f2;
                    bqbVar.e(bqjVar2, cfyVar3, z8, bpvVar2, afegVar2, afehVar, f5, f6, (bux) obj2, (i10 & (-920350135)) | i12 | (i14 >> 1) | ((i12 + i12) & i14), (i9 & (-920350135)) | i11 | (i13 >> 1) | ((i11 + i11) & i13));
                    return afak.a;
                }
            };
        }
    }
}
