package defpackage;

import android.content.SharedPreferences;
import androidx.car.app.model.CarColor;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class fyz {
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.fza r14, defpackage.cfy r15, float r16, defpackage.bux r17, int r18, int r19) {
        /*
            r4 = r18
            r0 = r4 & 6
            r1 = -1163935894(0xffffffffba9fbf6a, float:-0.0012187783)
            r2 = r17
            bux r12 = r2.c(r1)
            r1 = 1
            if (r0 != 0) goto L24
            r0 = r4 & 8
            if (r0 != 0) goto L19
            boolean r0 = r12.C(r14)
            goto L1d
        L19:
            boolean r0 = r12.E(r14)
        L1d:
            if (r1 == r0) goto L21
            r0 = 2
            goto L22
        L21:
            r0 = 4
        L22:
            r0 = r0 | r4
            goto L25
        L24:
            r0 = r4
        L25:
            r2 = r19 & 2
            if (r2 == 0) goto L2c
            r0 = r0 | 48
            goto L3c
        L2c:
            r3 = r4 & 48
            if (r3 != 0) goto L3c
            boolean r5 = r12.C(r15)
            if (r1 == r5) goto L39
            r5 = 16
            goto L3b
        L39:
            r5 = 32
        L3b:
            r0 = r0 | r5
        L3c:
            r5 = r19 & 4
            if (r5 == 0) goto L43
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L56
        L43:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L56
            r6 = r16
            boolean r7 = r12.z(r6)
            if (r1 == r7) goto L52
            r7 = 128(0x80, float:1.8E-43)
            goto L54
        L52:
            r7 = 256(0x100, float:3.59E-43)
        L54:
            r0 = r0 | r7
            goto L58
        L56:
            r6 = r16
        L58:
            r7 = r0 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 == r8) goto L60
            r7 = r1
            goto L61
        L60:
            r7 = 0
        L61:
            r8 = r0 & 1
            boolean r7 = r12.I(r7, r8)
            if (r7 == 0) goto L9d
            if (r2 == 0) goto L6f
            cfv r2 = defpackage.cfy.e
            r6 = r2
            goto L70
        L6f:
            r6 = r15
        L70:
            if (r5 == 0) goto L76
            r2 = 1117782016(0x42a00000, float:80.0)
            r11 = r2
            goto L78
        L76:
            r11 = r16
        L78:
            bol r2 = new bol
            r3 = 6
            r2.<init>(r14, r3)
            r5 = 45901941(0x2bc6875, float:2.7684073E-37)
            cct r5 = defpackage.bxc.i(r5, r1, r2, r12)
            java.util.List r7 = r14.c
            java.util.List r8 = r14.d
            boolean r9 = r14.f
            fyy r10 = r14.e
            r1 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            int r0 = r0 << 12
            r2 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r2
            r13 = r1 | r0
            defpackage.fwn.d(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r6
            r3 = r11
            goto La3
        L9d:
            r12.s()
            r2 = r15
            r3 = r16
        La3:
            bxf r7 = r12.J()
            if (r7 == 0) goto Lb4
            fzb r0 = new fzb
            r6 = 1
            r1 = r14
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.c = r0
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyz.a(fza, cfy, float, bux, int, int):void");
    }

    public static final hjw b(fwd fwdVar) {
        return new hjw(cjn.i(fwdVar.a), cjn.i(fwdVar.b));
    }

    public static final List c(List list, geu geuVar, fwd fwdVar) {
        fwd fwdVar2 = fwdVar;
        ArrayList<fvu> arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fvu fvuVarD = (fvu) it.next();
            fwb fwbVar = fvuVarD.b;
            if (fwbVar instanceof fvz) {
                fvuVarD = fvu.d(fvuVarD, null, fvz.h((fvz) fwbVar, fwdVar2 != null ? CarColor.createCustom(fwdVar2.b, fwdVar2.a) : null, 1), null, 125);
            }
            arrayList.add(fvuVarD);
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        for (fvu fvuVar : arrayList) {
            fxr fxrVar = fwh.a;
            hls hlsVar = new hls(false, true, true);
            fvv fvvVar = fvuVar.a;
            arrayList2.add(fvr.h(fvuVar, geuVar, fwx.d, false, fxrVar, hlsVar, (fvvVar == null || fvvVar.c != 65539) ? new fwe(null, fwdVar2, null, null, null, null, null, null) : null, false, 0, 196));
            fwdVar2 = fwdVar;
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.aqf r36, defpackage.cfy r37, boolean r38, defpackage.afeh r39, defpackage.afeh r40, defpackage.bux r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyz.d(aqf, cfy, boolean, afeh, afeh, bux, int, int):void");
    }

    public static final boolean e(aqf aqfVar) {
        return aqfVar.g() || aqfVar.h();
    }

    public static /* synthetic */ cfy f(cfy cfyVar, final aqf aqfVar, gci gciVar, int i) {
        final float f;
        final float f2;
        final gci gciVar2;
        int i2 = i & 2;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (i2 != 0) {
            afeg afegVar = gcm.a;
            f = 4.0f;
        } else {
            f = 0.0f;
        }
        final float f4 = (i & 4) != 0 ? 8.0f : 0.0f;
        final float f5 = (i & 8) != 0 ? 8.0f : 0.0f;
        final long jN = (i & 16) != 0 ? cjn.n() : 0L;
        final float f6 = (i & 32) != 0 ? f : 0.0f;
        if ((i & 64) != 0) {
            afeg afegVar2 = gcm.a;
            f2 = 48.0f;
        } else {
            f2 = 0.0f;
        }
        if ((i & 128) != 0) {
            afeg afegVar3 = gcm.a;
            f3 = 128.0f;
        }
        final float f7 = f3;
        if ((i & 256) != 0) {
            afeg afegVar4 = gcm.a;
            gciVar2 = gcm.b;
        } else {
            gciVar2 = gciVar;
        }
        cfyVar.getClass();
        aqfVar.getClass();
        gciVar2.getClass();
        return cfyVar.a(new cfu(new afeh() { // from class: gce
            @Override // defpackage.afeh
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                cfy cfyVar2 = (cfy) obj;
                bux buxVar = (bux) obj2;
                ((Integer) obj3).intValue();
                cfyVar2.getClass();
                buxVar.v(1265493696);
                buxVar.v(663698096);
                long j = jN;
                if (j == 16) {
                    afeg afegVar5 = gcm.a;
                    j = ((cjv) gcm.a.invoke(buxVar, 6)).a;
                }
                final long j2 = j;
                final float f8 = f7;
                final float f9 = f2;
                final float f10 = f6;
                final float f11 = f5;
                final float f12 = f;
                final float f13 = f4;
                final aqf aqfVar2 = aqfVar;
                gci gciVar3 = gciVar2;
                buxVar.o();
                final float fA = gciVar3.a(aqfVar2, buxVar);
                boolean z = buxVar.z(f13) | buxVar.z(f12) | buxVar.z(f11) | buxVar.z(f10) | buxVar.z(fA) | buxVar.E(aqfVar2) | buxVar.B(j2) | buxVar.z(f9) | buxVar.z(f8);
                Object objG = buxVar.g();
                if (z || objG == buw.a) {
                    afec afecVar = new afec() { // from class: gcf
                        @Override // defpackage.afec
                        public final Object invoke(Object obj4) throws Throwable {
                            float f14;
                            float f15;
                            float f16;
                            float f17;
                            float f18;
                            float f19;
                            float f20;
                            long jAA;
                            float f21;
                            cxd cxdVar = (cxd) obj4;
                            cxdVar.getClass();
                            cxdVar.q();
                            float f22 = f13;
                            float f23 = f22 + f12 + BitmapDescriptorFactory.HUE_RED;
                            float fEA = cxdVar.eA(f23);
                            float f24 = f10;
                            float f25 = f11;
                            float fEA2 = cxdVar.eA(f25 + f25 + BitmapDescriptorFactory.HUE_RED + f24 + f24 + BitmapDescriptorFactory.HUE_RED + BitmapDescriptorFactory.HUE_RED);
                            float f26 = fA;
                            aqf aqfVar3 = aqfVar2;
                            long j3 = j2;
                            float f27 = f9;
                            float f28 = f8;
                            if (f26 != BitmapDescriptorFactory.HUE_RED && Float.intBitsToFloat((int) (cxdVar.o() >> 32)) >= fEA && Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L)) >= fEA2) {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (cxdVar.o() >> 32)) - cxdVar.eA(f23);
                                float fEA3 = cxdVar.eA(f25);
                                float f29 = -fEA3;
                                float fEA4 = cxdVar.eA(f22);
                                float f30 = -fEA4;
                                float fEA5 = cxdVar.eA(f25);
                                float f31 = -fEA5;
                                cxdVar.r().c.i(fIntBitsToFloat, fEA3, fEA4, fEA5);
                                float f32 = -fIntBitsToFloat;
                                try {
                                    float fEA6 = cxdVar.eA(f24);
                                    cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, fEA6, BitmapDescriptorFactory.HUE_RED, fEA6);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (aqfVar3 instanceof alh) {
                                                        float fD = ((alh) aqfVar3).d();
                                                        jAA = roc.aA(fD / afpt.b(r11.b() + fD, 1.0E-4f), r11.c() / afpt.e(r11.b(), 1));
                                                        f19 = fEA6;
                                                        f20 = f24;
                                                    } else {
                                                        try {
                                                            if (aqfVar3 instanceof axr) {
                                                                try {
                                                                    axr axrVar = (axr) aqfVar3;
                                                                    float fB = afpt.b((int) (axrVar.l().d() & 4294967295L), 1.0f);
                                                                    int i3 = axrVar.l().m;
                                                                    axk axkVar = (axk) woy.bF(axrVar.l().j);
                                                                    f19 = fEA6;
                                                                    f20 = f24;
                                                                    float f33 = i3;
                                                                    float f34 = (axkVar.a + ((-axkVar.h) / axkVar.i)) / f33;
                                                                    axk axkVar2 = (axk) woy.bK(axrVar.l().j);
                                                                    float fA2 = ((axkVar2.a + ((((fB - axrVar.l().o) - axrVar.l().a()) - axkVar2.h) / axkVar2.i)) / f33) - f34;
                                                                    jAA = roc.aA(fA2, f34 / (1.0f - fA2));
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    f19 = fEA6;
                                                                    f14 = f29;
                                                                    f15 = f30;
                                                                    f16 = f31;
                                                                    f17 = f32;
                                                                    f18 = f19;
                                                                    try {
                                                                        float f35 = -f18;
                                                                        cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f35, BitmapDescriptorFactory.HUE_RED, f35);
                                                                        throw th;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        cxdVar.r().c.i(f17, f14, f15, f16);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } else {
                                                                f19 = fEA6;
                                                                f20 = f24;
                                                                if (!(aqfVar3 instanceof axz)) {
                                                                    f14 = f29;
                                                                    f15 = f30;
                                                                    f16 = f31;
                                                                    f17 = f32;
                                                                    f18 = f19;
                                                                    try {
                                                                        throw new IllegalArgumentException("Unsupported ScrollableState type: ".concat(String.valueOf(aqfVar3.getClass().getCanonicalName())));
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        float f352 = -f18;
                                                                        cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f352, BitmapDescriptorFactory.HUE_RED, f352);
                                                                        throw th;
                                                                    }
                                                                }
                                                                axz axzVar = (axz) aqfVar3;
                                                                axzVar.d();
                                                                float fB2 = afpt.b(BitmapDescriptorFactory.HUE_RED, 1.0f);
                                                                axzVar.d();
                                                                axt axtVar = (axt) woy.bF(axzVar.d().b);
                                                                f21 = f30;
                                                                try {
                                                                    float fA3 = (axtVar.a() + ((-dlo.b(axtVar.b())) / ((int) (axtVar.c() & 4294967295L)))) / BitmapDescriptorFactory.HUE_RED;
                                                                    axt axtVar2 = (axt) woy.bK(axzVar.d().b);
                                                                    axzVar.d();
                                                                    float f36 = fB2 + BitmapDescriptorFactory.HUE_RED;
                                                                    axzVar.d();
                                                                    float fA4 = ((axtVar2.a() + (((f36 + BitmapDescriptorFactory.HUE_RED) - dlo.b(axtVar2.b())) / ((int) (axtVar2.c() & 4294967295L)))) / BitmapDescriptorFactory.HUE_RED) - fA3;
                                                                    jAA = roc.aA(fA4, fA3 / (1.0f - fA4));
                                                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jAA & 4294967295L)) * (Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L)) - afpt.d(Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L)) * Float.intBitsToFloat((int) (jAA >> 32)), cxdVar.eA(f27), cxdVar.eA(f28)));
                                                                    long jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32;
                                                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L;
                                                                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(cxdVar.eA(r3)) << 32;
                                                                    long jFloatToRawIntBits4 = Float.floatToRawIntBits(r0) & 4294967295L;
                                                                    float fEA7 = cxdVar.eA(f20);
                                                                    cxdVar = cxdVar;
                                                                    f18 = f19;
                                                                    f16 = f31;
                                                                    f15 = f21;
                                                                    f14 = f29;
                                                                    czz.H(cxdVar, j3, jFloatToRawIntBits2 | jFloatToRawIntBits, jFloatToRawIntBits3 | jFloatToRawIntBits4, (Float.floatToRawIntBits(fEA7) << 32) | (Float.floatToRawIntBits(fEA7) & 4294967295L), f26, 208);
                                                                    float f37 = -f18;
                                                                    cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f37, BitmapDescriptorFactory.HUE_RED, f37);
                                                                    cxdVar.r().c.i(f32, f14, f15, f16);
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    f15 = f21;
                                                                    f14 = f29;
                                                                    f16 = f31;
                                                                    f17 = f32;
                                                                    f18 = f19;
                                                                    float f3522 = -f18;
                                                                    cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f3522, BitmapDescriptorFactory.HUE_RED, f3522);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                        }
                                                    }
                                                    float f372 = -f18;
                                                    cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f372, BitmapDescriptorFactory.HUE_RED, f372);
                                                    cxdVar.r().c.i(f32, f14, f15, f16);
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    f17 = f32;
                                                    cxdVar.r().c.i(f17, f14, f15, f16);
                                                    throw th;
                                                }
                                                czz.H(cxdVar, j3, jFloatToRawIntBits2 | jFloatToRawIntBits, jFloatToRawIntBits3 | jFloatToRawIntBits4, (Float.floatToRawIntBits(fEA7) << 32) | (Float.floatToRawIntBits(fEA7) & 4294967295L), f26, 208);
                                            } catch (Throwable th7) {
                                                th = th7;
                                                f17 = f32;
                                                float f35222 = -f18;
                                                cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f35222, BitmapDescriptorFactory.HUE_RED, f35222);
                                                throw th;
                                            }
                                            cxdVar = cxdVar;
                                            f18 = f19;
                                            f16 = f31;
                                            f15 = f21;
                                            f14 = f29;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            f15 = f21;
                                            f14 = f29;
                                            f17 = f32;
                                            cxdVar = cxdVar;
                                            f18 = f19;
                                            f16 = f31;
                                            float f352222 = -f18;
                                            cxdVar.r().c.i(BitmapDescriptorFactory.HUE_RED, f352222, BitmapDescriptorFactory.HUE_RED, f352222);
                                            throw th;
                                        }
                                        f21 = f30;
                                        float fIntBitsToFloat22 = Float.intBitsToFloat((int) (jAA & 4294967295L)) * (Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L)) - afpt.d(Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L)) * Float.intBitsToFloat((int) (jAA >> 32)), cxdVar.eA(f27), cxdVar.eA(f28)));
                                        long jFloatToRawIntBits5 = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32;
                                        long jFloatToRawIntBits22 = Float.floatToRawIntBits(fIntBitsToFloat22) & 4294967295L;
                                        long jFloatToRawIntBits32 = Float.floatToRawIntBits(cxdVar.eA(r3)) << 32;
                                        long jFloatToRawIntBits42 = Float.floatToRawIntBits(r0) & 4294967295L;
                                        float fEA72 = cxdVar.eA(f20);
                                    } catch (Throwable th9) {
                                        th = th9;
                                        f18 = fEA6;
                                        f17 = f32;
                                        f14 = f29;
                                        f15 = f30;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    f14 = f29;
                                    f15 = f30;
                                    f16 = f31;
                                    f17 = f32;
                                }
                            }
                            return afak.a;
                        }
                    };
                    buxVar.x(afecVar);
                    objG = afecVar;
                }
                cfy cfyVarR = bxc.r(cfyVar2, (afec) objG);
                buxVar.o();
                return cfyVarR;
            }
        }));
    }

    public static final void g(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().clear().apply();
    }

    public static int h(xpv xpvVar) {
        if (xpvVar == null) {
            return 1;
        }
        switch (xpvVar.ordinal()) {
        }
        return 1;
    }

    public static /* synthetic */ int i(long j, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.bp(i, "0 > "));
        }
        return (int) Math.min(i, Math.max(j, 0L));
    }

    public static /* synthetic */ afak j(oct octVar) {
        octVar.getClass();
        octVar.p(true);
        return afak.a;
    }

    public static final void k(oct octVar, xgj[] xgjVarArr, afeg afegVar) {
        for (xgj xgjVar : xgjVarArr) {
            abnp abnpVar = (abnp) octVar.a;
            DesugarCollections.unmodifiableList(((xgk) abnpVar.b).f).getClass();
            xgjVar.getClass();
            abnpVar.t();
            xgk xgkVar = (xgk) abnpVar.b;
            aboh abohVar = xgkVar.f;
            if (!abohVar.c()) {
                xgkVar.f = abnv.I(abohVar);
            }
            xgkVar.f.add(xgjVar);
            DesugarCollections.unmodifiableList(((xgk) abnpVar.b).i).getClass();
            abnp abnpVarN = xfz.a.n();
            abnpVarN.getClass();
            oct octVar2 = new oct(abnpVarN);
            xgjVar.getClass();
            abnp abnpVar2 = (abnp) octVar2.a;
            abnpVar2.t();
            xfz xfzVar = (xfz) abnpVar2.b;
            xfzVar.c = xgjVar;
            xfzVar.b |= 1;
            afegVar.invoke(octVar2, xgjVar);
            abnv abnvVarQ = abnpVar2.q();
            abnvVarQ.getClass();
            abnpVar.t();
            xgk xgkVar2 = (xgk) abnpVar.b;
            xgkVar2.b();
            xgkVar2.i.add((xfz) abnvVarQ);
        }
    }
}
