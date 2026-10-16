package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bmf {
    public static final avp a = asl.L(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16.0f, 7);
    public static final avp b = asl.L(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16.0f, 7);
    private static final bvf c = new bvo(bxp.c, new blz(0));

    public static final void a(afdr afdrVar, cfy cfyVar, dnk dnkVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(24925658);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afdrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(dnkVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            ((bnn) buxVarC.f(c)).a(new fgp(afdrVar, cfyVar, dnkVar, afegVar), buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(afdrVar, cfyVar, dnkVar, afegVar, i, 1);
        }
    }

    public static final void b(final afeg afegVar, cfy cfyVar, final afeg afegVar2, final afeg afegVar3, final afeg afegVar4, final ckv ckvVar, final long j, final long j2, final long j3, final long j4, final long j5, bux buxVar, final int i, final int i2) {
        int i3;
        final afeg afegVar5;
        afeg afegVar6;
        long j6;
        int i4;
        final cfy cfyVar2;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(1378716401);
        if (i5 == 0) {
            i3 = (true != buxVarC.E(afegVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            afegVar5 = afegVar2;
            i6 |= true != buxVarC.E(afegVar5) ? 128 : 256;
        } else {
            afegVar5 = afegVar2;
        }
        if ((i & 3072) == 0) {
            i6 |= true != buxVarC.E(afegVar3) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            afegVar6 = afegVar4;
            i6 |= true != buxVarC.E(afegVar6) ? 8192 : 16384;
        } else {
            afegVar6 = afegVar4;
        }
        if ((196608 & i) == 0) {
            i6 |= true != buxVarC.C(ckvVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i6 |= true != buxVarC.B(j) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i6 |= true != buxVarC.z(BitmapDescriptorFactory.HUE_RED) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            j6 = j2;
            i6 |= true != buxVarC.B(j6) ? 33554432 : 67108864;
        } else {
            j6 = j2;
        }
        if ((805306368 & i) == 0) {
            i6 |= true != buxVarC.B(j3) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.B(j4) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.B(j5) ? 16 : 32;
        }
        if (buxVarC.I(((306783379 & i6) == 306783378 && (i4 & 19) == 18) ? false : true, i6 & 1)) {
            cfv cfvVar = cfy.e;
            final afeg afegVar7 = afegVar6;
            final long j7 = j6;
            bqp.b(cfvVar, ckvVar, j, 0L, BitmapDescriptorFactory.HUE_RED, null, bxc.i(-652798794, true, new afeg() { // from class: bma
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    dfw dfwVarAp;
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i7 = iIntValue & 3;
                    int i8 = iIntValue & 1;
                    avp avpVar = bmf.a;
                    if (buxVar2.I(i7 != 2, i8)) {
                        cfv cfvVar2 = cfy.e;
                        bwq bwqVar = bos.a;
                        float f = true != ((Boolean) bwqVar.a()).booleanValue() ? 24.0f : 20.0f;
                        cfy cfyVarG = asl.G(cfvVar2, new avr(f, f, f, f));
                        ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar2, 0);
                        int iG = a.g(buxVar2.b());
                        ccx ccxVarN = buxVar2.N();
                        cfy cfyVarJ = bzi.j(buxVar2, cfyVarG);
                        afdr afdrVar = cwb.a;
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        long j8 = j3;
                        afeg afegVar8 = afegVar5;
                        afeg afegVar9 = cwb.e;
                        byq.c(buxVar2, ctpVarA, afegVar9);
                        afeg afegVar10 = cwb.d;
                        byq.c(buxVar2, ccxVarN, afegVar10);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar11 = cwb.f;
                        byq.c(buxVar2, numValueOf, afegVar11);
                        afec afecVar = cwb.g;
                        byq.b(buxVar2, afecVar);
                        afeg afegVar12 = cwb.c;
                        byq.c(buxVar2, cfyVarJ, afegVar12);
                        buxVar2.v(346092327);
                        czz.am(bnm.a.b(new cjv(j8)), bxc.i(-1128150638, true, new bly(afegVar8, 2), buxVar2), buxVar2, 56);
                        buxVar2.o();
                        buxVar2.v(346408310);
                        if (((Boolean) bwqVar.a()).booleanValue()) {
                            buxVar2.v(1812109189);
                            dfwVarAp = dfw.v(czz.av(buxVar2).f, 0L, dln.f(20), null, null, null, null, 0L, null, 0, 0, dln.f(26), null, null, 16646141);
                            buxVar2.o();
                        } else {
                            buxVar2.v(1812321322);
                            dfwVarAp = czz.ap(9, buxVar2);
                            buxVar2.o();
                        }
                        long j9 = j5;
                        dfw dfwVar = dfwVarAp;
                        long j10 = j4;
                        afeg afegVar13 = afegVar7;
                        czz.ao(j10, dfwVar, bxc.i(71284337, true, new bly(afegVar3, 1), buxVar2), buxVar2, 384);
                        buxVar2.o();
                        buxVar2.v(347551590);
                        czz.ao(j9, czz.ap(2, buxVar2), bxc.i(705583346, true, new bly(afegVar13, 0), buxVar2), buxVar2, 384);
                        buxVar2.o();
                        cfy cfyVarA = ats.a(cfvVar2, cfl.l);
                        ctp ctpVarB = atk.b(cfl.a, false);
                        int iG2 = a.g(buxVar2.b());
                        ccx ccxVarN2 = buxVar2.N();
                        cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarA);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        afeg afegVar14 = afegVar;
                        long j11 = j7;
                        byq.c(buxVar2, ctpVarB, afegVar9);
                        byq.c(buxVar2, ccxVarN2, afegVar10);
                        byq.c(buxVar2, Integer.valueOf(iG2), afegVar11);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ2, afegVar12);
                        czz.ao(j11, czz.ap(10, buxVar2), afegVar14, buxVar2, 0);
                        buxVar2.n();
                        buxVar2.n();
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 104);
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bmb
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    afeg afegVar8 = afegVar;
                    cfy cfyVar3 = cfyVar2;
                    afeg afegVar9 = afegVar2;
                    afeg afegVar10 = afegVar3;
                    afeg afegVar11 = afegVar4;
                    ckv ckvVar2 = ckvVar;
                    long j8 = j;
                    int i7 = i;
                    long j9 = j2;
                    int i8 = i2;
                    int i9 = i7 | 1;
                    int i10 = i8 & 306783378;
                    int i11 = 306783378 & i9;
                    int i12 = i11 + i11;
                    long j10 = j4;
                    int i13 = i8 & 613566756;
                    int i14 = i9 & 613566756;
                    long j11 = j5;
                    bmf.b(afegVar8, cfyVar3, afegVar9, afegVar10, afegVar11, ckvVar2, j8, j9, j3, j10, j11, (bux) obj, (i9 & (-920350135)) | i11 | (i14 >> 1) | (i12 & i14), (i8 & (-920350135)) | i10 | (i13 >> 1) | ((i10 + i10) & i13));
                    return afak.a;
                }
            };
        }
    }

    public static final void c(float f, afeg afegVar, bux buxVar, int i) {
        int i2;
        dlr dlrVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-917637668);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.z(8.0f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.z(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bvf bvfVar = dbc.i;
            dlr dlrVar2 = (dlr) buxVarC.f(bvfVar);
            int iOrdinal = dlrVar2.ordinal();
            if (iOrdinal == 0) {
                dlrVar = dlr.b;
            } else {
                if (iOrdinal != 1) {
                    throw new aezs();
                }
                dlrVar = dlr.a;
            }
            czz.am(bvfVar.b(dlrVar), bxc.i(-1986402020, true, new mum(f, dlrVar2, afegVar, i4), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grm(f, afegVar, i, i4);
        }
    }

    public static final void d(final afdr afdrVar, final afeg afegVar, final cfy cfyVar, final afeg afegVar2, final afeg afegVar3, final afeg afegVar4, final afeg afegVar5, final ckv ckvVar, final long j, final long j2, final long j3, final long j4, final dnk dnkVar, bux buxVar, final int i, final int i2) {
        int i3;
        afeg afegVar6;
        afeg afegVar7;
        afeg afegVar8;
        ckv ckvVar2;
        int i4;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(-867616355);
        if (i5 == 0) {
            i3 = (true != buxVarC.E(afdrVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            afegVar6 = afegVar;
            i3 |= true != buxVarC.E(afegVar6) ? 16 : 32;
        } else {
            afegVar6 = afegVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.E(afegVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.E(afegVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            afegVar7 = afegVar4;
            i3 |= true != buxVarC.E(afegVar7) ? 65536 : 131072;
        } else {
            afegVar7 = afegVar4;
        }
        if ((1572864 & i) == 0) {
            afegVar8 = afegVar5;
            i3 |= true != buxVarC.E(afegVar8) ? 524288 : 1048576;
        } else {
            afegVar8 = afegVar5;
        }
        if ((12582912 & i) == 0) {
            ckvVar2 = ckvVar;
            i3 |= true != buxVarC.C(ckvVar2) ? 4194304 : 8388608;
        } else {
            ckvVar2 = ckvVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != buxVarC.B(j) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != buxVarC.B(j2) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.B(j3) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.B(j4) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != buxVarC.z(BitmapDescriptorFactory.HUE_RED) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != buxVarC.C(dnkVar) ? 1024 : 2048;
        }
        int i6 = i4;
        if (buxVarC.I(((306783379 & i3) == 306783378 && (i6 & 1171) == 1170) ? false : true, i3 & 1)) {
            final afeg afegVar9 = afegVar6;
            final ckv ckvVar3 = ckvVar2;
            final afeg afegVar10 = afegVar7;
            final afeg afegVar11 = afegVar8;
            a(afdrVar, cfyVar, dnkVar, bxc.i(527420759, true, new afeg() { // from class: bmd
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i7 = iIntValue & 3;
                    int i8 = iIntValue & 1;
                    avp avpVar = bmf.a;
                    if (buxVar2.I(i7 != 2, i8)) {
                        afeg afegVar12 = afegVar2;
                        afeg afegVar13 = afegVar9;
                        long j5 = j4;
                        long j6 = j3;
                        long j7 = j2;
                        long j8 = j;
                        ckv ckvVar4 = ckvVar3;
                        afeg afegVar14 = afegVar11;
                        bmf.b(bxc.i(1367541877, true, new bmc(afegVar13, afegVar12, 1), buxVar2), null, afegVar3, afegVar10, afegVar14, ckvVar4, j8, bnh.f(26, buxVar2), j7, j6, j5, buxVar2, 6, 0);
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i6 >> 3) & 896));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bme
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    afdr afdrVar2 = afdrVar;
                    afeg afegVar12 = afegVar;
                    cfy cfyVar2 = cfyVar;
                    afeg afegVar13 = afegVar2;
                    afeg afegVar14 = afegVar3;
                    afeg afegVar15 = afegVar4;
                    afeg afegVar16 = afegVar5;
                    ckv ckvVar4 = ckvVar;
                    long j5 = j;
                    int i7 = i;
                    long j6 = j2;
                    int i8 = i2;
                    int i9 = i7 | 1;
                    int i10 = i8 & 306783378;
                    int i11 = i9 & 306783378;
                    int i12 = i11 + i11;
                    long j7 = j4;
                    int i13 = i8 & 613566756;
                    int i14 = i9 & 613566756;
                    dnk dnkVar2 = dnkVar;
                    bmf.d(afdrVar2, afegVar12, cfyVar2, afegVar13, afegVar14, afegVar15, afegVar16, ckvVar4, j5, j6, j3, j7, dnkVar2, (bux) obj, (i9 & (-920350135)) | i11 | (i14 >> 1) | (i12 & i14), (i8 & (-920350135)) | i10 | (i13 >> 1) | ((i10 + i10) & i13));
                    return afak.a;
                }
            };
        }
    }
}
