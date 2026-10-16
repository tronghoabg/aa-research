package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bmj {
    private static final dnu a = new dnu(true, true, 1002, 1536);

    public static final void a(final boolean z, final afdr afdrVar, cfy cfyVar, long j, alh alhVar, dnu dnuVar, final ckv ckvVar, long j2, float f, final afeh afehVar, bux buxVar, final int i, final int i2) {
        int i3;
        afdr afdrVar2;
        ckv ckvVar2;
        afeh afehVar2;
        final cfy cfyVar2;
        final long j3;
        final dnu dnuVar2;
        final long j4;
        final float f2;
        bux buxVar2;
        final alh alhVar2;
        int i4;
        alh alhVarAX;
        dnu dnuVar3;
        boolean z2;
        float f3;
        long j5;
        long jF;
        final cfy cfyVar3;
        long j6;
        final long j7;
        final alh alhVar3;
        final float f4;
        dnu dnuVar4;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(1725609375);
        if (i5 == 0) {
            i3 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            afdrVar2 = afdrVar;
            i3 |= true != buxVarC.E(afdrVar2) ? 16 : 32;
        } else {
            afdrVar2 = afdrVar;
        }
        int i6 = i3 | 3456;
        if ((i & 24576) == 0) {
            i6 = i3 | 11648;
        }
        int i7 = 196608 | i6;
        if ((1572864 & i) == 0) {
            ckvVar2 = ckvVar;
            i7 |= true != buxVarC.C(ckvVar2) ? 524288 : 1048576;
        } else {
            ckvVar2 = ckvVar;
        }
        if ((12582912 & i) == 0) {
            i7 |= 4194304;
        }
        int i8 = i2 | 6;
        if ((i2 & 48) == 0) {
            afehVar2 = afehVar;
            i8 |= true == buxVarC.E(afehVar2) ? 32 : 16;
        } else {
            afehVar2 = afehVar;
        }
        int i9 = 905969664 | i7;
        if (buxVarC.I(((306783379 & i9) == 306783378 && (i8 & 19) == 18) ? false : true, i9 & 1)) {
            int i10 = (-29417473) & i9;
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfv cfvVar = cfy.e;
                long jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
                i4 = i10;
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
                alhVarAX = ca.aX(buxVarC);
                dnuVar3 = a;
                avp avpVar = boj.a;
                z2 = false;
                f3 = 3.0f;
                j5 = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
                jF = bnh.f(37, buxVarC);
                cfyVar3 = cfvVar;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                j5 = j;
                alhVarAX = alhVar;
                dnuVar3 = dnuVar;
                i4 = i10;
                z2 = false;
                jF = j2;
                f3 = f;
            }
            buxVarC.l();
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new afm(Boolean.valueOf(z2));
                bvvVar.ad(objS);
            }
            final afm afmVar = (afm) objS;
            afmVar.d(Boolean.valueOf(z));
            if (((Boolean) afmVar.a()).booleanValue() || ((Boolean) afmVar.b()).booleanValue()) {
                buxVarC.v(1165885407);
                dlg dlgVar = (dlg) buxVarC.f(dbc.d);
                long j8 = jF;
                boolean zC = ((i9 & 7168) == 2048) | buxVarC.C(dlgVar);
                Object objS2 = bvvVar.S();
                if (zC || objS2 == obj) {
                    boi boiVar = boi.a;
                    float f5 = bon.a;
                    objS2 = new bsu(j5, dlgVar, boiVar, dlgVar.eF(48.0f), new bni(7));
                    j6 = j5;
                    bvvVar.ad(objS2);
                } else {
                    j6 = j5;
                }
                final bsu bsuVar = (bsu) objS2;
                j7 = j8;
                alhVar3 = alhVarAX;
                final ckv ckvVar3 = ckvVar2;
                f4 = f3;
                final afeh afehVar3 = afehVar2;
                cct cctVarI = bxc.i(-917492520, true, new afeg() { // from class: bmh
                    @Override // defpackage.afeg
                    public final Object invoke(Object obj2, Object obj3) {
                        bux buxVar3 = (bux) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        int i11 = iIntValue & 3;
                        if (buxVar3.I(i11 != 2, iIntValue & 1)) {
                            bsu bsuVar2 = bsuVar;
                            boolean zC2 = buxVar3.C(bsuVar2);
                            Object objG = buxVar3.g();
                            if (zC2 || objG == buw.a) {
                                objG = new ahp(bsuVar2, 3);
                                buxVar3.x(objG);
                            }
                            afeh afehVar4 = afehVar3;
                            float f6 = f4;
                            long j9 = j7;
                            ckv ckvVar4 = ckvVar3;
                            bon.b(cfyVar3, afmVar, (afdr) objG, alhVar3, ckvVar4, j9, f6, afehVar4, buxVar3, 0);
                        } else {
                            buxVar3.s();
                        }
                        return afak.a;
                    }
                }, buxVarC);
                int i11 = (i9 & 112) | 3072 | ((i4 >> 9) & 896);
                dnuVar4 = dnuVar3;
                dnb.b(bsuVar, afdrVar2, dnuVar4, cctVarI, buxVarC, i11, 0);
                bvvVar.Y(false);
            } else {
                buxVarC.v(1166904067);
                bvvVar.Y(z2);
                j7 = jF;
                f4 = f3;
                dnuVar4 = dnuVar3;
                j6 = j5;
                alhVar3 = alhVarAX;
            }
            dnuVar2 = dnuVar4;
            cfyVar2 = cfyVar3;
            j4 = j7;
            f2 = f4;
            j3 = j6;
            buxVar2 = buxVarC;
            alhVar2 = alhVar3;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            j3 = j;
            dnuVar2 = dnuVar;
            j4 = j2;
            f2 = f;
            buxVar2 = buxVarC;
            alhVar2 = alhVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bmi
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    boolean z3 = z;
                    afdr afdrVar3 = afdrVar;
                    cfy cfyVar4 = cfyVar2;
                    long j9 = j3;
                    alh alhVar4 = alhVar2;
                    dnu dnuVar5 = dnuVar2;
                    int i12 = i;
                    ckv ckvVar4 = ckvVar;
                    int i13 = i2;
                    int i14 = i12 | 1;
                    int i15 = i13 & 306783378;
                    int i16 = 306783378 & i14;
                    int i17 = i16 + i16;
                    float f6 = f2;
                    int i18 = i13 & 613566756;
                    int i19 = i14 & 613566756;
                    afeh afehVar4 = afehVar;
                    bmj.a(z3, afdrVar3, cfyVar4, j9, alhVar4, dnuVar5, ckvVar4, j4, f6, afehVar4, (bux) obj2, (i14 & (-920350135)) | i16 | (i19 >> 1) | (i17 & i19), (i13 & (-920350135)) | i15 | (i18 >> 1) | ((i15 + i15) & i18));
                    return afak.a;
                }
            };
        }
    }

    public static final void b(afeg afegVar, afdr afdrVar, cfy cfyVar, boolean z, bok bokVar, avp avpVar, bux buxVar, int i) {
        afeg afegVar2;
        int i2;
        cfy cfyVar2;
        boolean z2;
        bok bokVar2;
        avp avpVar2;
        bok bokVar3;
        boolean z3;
        cfy cfyVar3;
        avp avpVar3;
        bok bokVar4;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-532959117);
        if (i3 == 0) {
            afegVar2 = afegVar;
            i2 = i | (true != buxVarC.E(afegVar2) ? 2 : 4);
        } else {
            afegVar2 = afegVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        int i4 = 224640 | i2;
        if ((i & 1572864) == 0) {
            i4 = i2 | 748928;
        }
        int i5 = 113246208 | i4;
        if (buxVarC.I((38347923 & i5) != 38347922, i5 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfv cfvVar = cfy.e;
                avp avpVar4 = boj.a;
                bng bngVarAt = czz.at(buxVarC);
                bok bokVar5 = bngVarAt.ac;
                if (bokVar5 == null) {
                    bokVar3 = new bok(bnh.e(bngVarAt, 18), bnh.e(bngVarAt, 19), bnh.e(bngVarAt, 19), cjv.h(bnh.e(bngVarAt, 18), 0.38f), cjv.h(bnh.e(bngVarAt, 18), 0.38f), cjv.h(bnh.e(bngVarAt, 18), 0.38f));
                    bngVarAt.ac = bokVar3;
                } else {
                    bokVar3 = bokVar5;
                }
                z3 = true;
                cfyVar3 = cfvVar;
                avpVar3 = boj.a;
                bokVar4 = bokVar3;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                z3 = z;
                bokVar4 = bokVar;
                avpVar3 = avpVar;
            }
            buxVarC.l();
            bon.a(afegVar2, afdrVar, cfyVar3, z3, bokVar4, avpVar3, buxVarC, i5 & 264765438);
            cfyVar2 = cfyVar3;
            z2 = z3;
            bokVar2 = bokVar4;
            avpVar2 = avpVar3;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            z2 = z;
            bokVar2 = bokVar;
            avpVar2 = avpVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(afegVar, afdrVar, cfyVar2, z2, bokVar2, avpVar2, i, 1);
        }
    }
}
