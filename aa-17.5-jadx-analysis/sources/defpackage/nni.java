package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class nni {
    public static final /* synthetic */ int a = 0;
    private static final aes b = new aen(0.18f, 0.89f, 0.32f, 1.28f);
    private static final aes c = new aen(0.48f, BitmapDescriptorFactory.HUE_RED, 0.48f, 0.99f);

    public static /* synthetic */ afak a(nnl nnlVar, boolean z, cil cilVar, cie cieVar) {
        cieVar.getClass();
        cieVar.a(nnlVar.j);
        if (z) {
            cieVar.e(cilVar);
            cieVar.i(cilVar);
        } else {
            cieVar.h(cilVar);
            cieVar.d(cilVar);
        }
        return afak.a;
    }

    public static final void b(nnl nnlVar, cfy cfyVar, boolean z, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        boolean z2;
        boolean z3;
        int i3;
        bvv bvvVar;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-328629227);
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(nnlVar) : buxVarC.E(nnlVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            cfy cfyVarI = asl.I(cfyVar, 4.0f, BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarA = atp.a(atd.e, z ? cfl.l : cfl.j, buxVarC, 6);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            int i5 = true != z ? 1 : 3;
            CharSequence charSequence = nnlVar.l;
            if (charSequence == null || afyh.v(charSequence)) {
                z2 = true;
                z3 = false;
                i3 = i5;
                buxVar2 = buxVarC;
                bvvVar = bvvVar2;
                buxVar2.v(-555791881);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-556042888);
                String string = charSequence.toString();
                long j = ksp.j(krr.s, buxVarC);
                dfw dfwVarV = dfw.v(czz.av(buxVarC).k, 0L, 0L, null, null, null, null, 0L, null, 0, i5, 0L, null, null, 16711679);
                i3 = i5;
                z2 = true;
                bvvVar = bvvVar2;
                z3 = false;
                brp.b(string, null, j, 0L, null, 0L, null, 0L, 2, false, 1, 0, dfwVarV, buxVarC, 0, 24960, 110586);
                buxVar2 = buxVarC;
                bvvVar.Y(false);
            }
            CharSequence charSequence2 = nnlVar.m;
            if (charSequence2 == null || afyh.v(charSequence2)) {
                buxVar2.v(-555428809);
                bvvVar.Y(z3);
            } else {
                buxVar2.v(-555686543);
                bux buxVar3 = buxVar2;
                brp.b(charSequence2.toString(), null, ksp.j(krr.w, buxVar2), 0L, null, 0L, null, 0L, 2, false, 1, 0, dfw.v(czz.av(buxVar2).l, 0L, 0L, null, null, null, null, 0L, null, 0, i3, 0L, null, null, 16711679), buxVar3, 0, 24960, 110586);
                buxVar2 = buxVar3;
                bvvVar.Y(z3);
            }
            bvvVar.Y(z2);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo((Object) nnlVar, cfyVar, z, i, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.cfy r21, defpackage.nnk r22, defpackage.cil r23, defpackage.cil r24, defpackage.cil r25, defpackage.bwq r26, defpackage.nmr r27, java.lang.String r28, defpackage.bux r29, int r30) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nni.c(cfy, nnk, cil, cil, cil, bwq, nmr, java.lang.String, bux, int):void");
    }

    public static final void d(final nnl nnlVar, bwq bwqVar, cil cilVar, cil cilVar2, cil cilVar3, cil cilVar4, cil cilVar5, cil cilVar6, cil cilVar7, cil cilVar8, cil cilVar9, bux buxVar, int i, int i2) {
        int i3;
        bwq bwqVar2;
        cil cilVar10;
        cil cilVar11;
        final cil cilVar12;
        cil cilVar13;
        cil cilVar14;
        cil cilVar15;
        cil cilVar16;
        cil cilVar17;
        cil cilVar18;
        int i4;
        bux buxVarC = buxVar.c(-416995450);
        if ((i & 6) == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(nnlVar) : buxVarC.E(nnlVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            bwqVar2 = bwqVar;
            i3 |= true != buxVarC.C(bwqVar2) ? 16 : 32;
        } else {
            bwqVar2 = bwqVar;
        }
        if ((i & 384) == 0) {
            cilVar10 = cilVar;
            i3 |= true != buxVarC.C(cilVar10) ? 128 : 256;
        } else {
            cilVar10 = cilVar;
        }
        if ((i & 3072) == 0) {
            cilVar11 = cilVar2;
            i3 |= true != buxVarC.C(cilVar11) ? 1024 : 2048;
        } else {
            cilVar11 = cilVar2;
        }
        if ((i & 24576) == 0) {
            cilVar12 = cilVar3;
            i3 |= true != buxVarC.C(cilVar12) ? 8192 : 16384;
        } else {
            cilVar12 = cilVar3;
        }
        if ((196608 & i) == 0) {
            cilVar13 = cilVar4;
            i3 |= true != buxVarC.C(cilVar13) ? 65536 : 131072;
        } else {
            cilVar13 = cilVar4;
        }
        if ((1572864 & i) == 0) {
            cilVar14 = cilVar5;
            i3 |= true != buxVarC.C(cilVar14) ? 524288 : 1048576;
        } else {
            cilVar14 = cilVar5;
        }
        if ((12582912 & i) == 0) {
            cilVar15 = cilVar6;
            i3 |= true != buxVarC.C(cilVar15) ? 4194304 : 8388608;
        } else {
            cilVar15 = cilVar6;
        }
        if ((100663296 & i) == 0) {
            cilVar16 = cilVar7;
            i3 |= true != buxVarC.C(cilVar16) ? 33554432 : 67108864;
        } else {
            cilVar16 = cilVar7;
        }
        if ((805306368 & i) == 0) {
            cilVar17 = cilVar8;
            i3 |= true != buxVarC.C(cilVar17) ? 268435456 : 536870912;
        } else {
            cilVar17 = cilVar8;
        }
        if ((i2 & 6) == 0) {
            cilVar18 = cilVar9;
            i4 = i2 | (true != buxVarC.C(cilVar18) ? 2 : 4);
        } else {
            cilVar18 = cilVar9;
            i4 = i2;
        }
        int i5 = i3;
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.D(true) ? 16 : 32;
        }
        if (buxVarC.I(((i5 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true, i5 & 1)) {
            final cil cilVar19 = cilVar13;
            final cil cilVar20 = cilVar17;
            final cil cilVar21 = cilVar18;
            final bwq bwqVar3 = bwqVar2;
            final cil cilVar22 = cilVar14;
            final cil cilVar23 = cilVar11;
            final cil cilVar24 = cilVar16;
            final cil cilVar25 = cilVar10;
            final cil cilVar26 = cilVar15;
            czz.am(dbc.i.b(dlr.a), bxc.i(-784217402, true, new afeg() { // from class: nmw
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    nnl nnlVar2;
                    avy avyVar;
                    boolean z;
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i6 = iIntValue & 3;
                    int i7 = iIntValue & 1;
                    int i8 = nni.a;
                    if (buxVar2.I(i6 != 2, i7)) {
                        cfv cfvVar = cfy.e;
                        cfy cfyVarI = asl.I(cfvVar, 4.0f, BitmapDescriptorFactory.HUE_RED);
                        ctp ctpVarA = avv.a(atd.g(4.0f), cfl.m, buxVar2, 6);
                        int iG = a.g(buxVar2.b());
                        ccx ccxVarN = buxVar2.N();
                        cfy cfyVarJ = bzi.j(buxVar2, cfyVarI);
                        afdr afdrVar = cwb.a;
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        final cil cilVar27 = cilVar21;
                        final cil cilVar28 = cilVar20;
                        final cil cilVar29 = cilVar12;
                        final cil cilVar30 = cilVar24;
                        final cil cilVar31 = cilVar26;
                        final cil cilVar32 = cilVar23;
                        final bwq bwqVar4 = bwqVar3;
                        final cil cilVar33 = cilVar22;
                        final cil cilVar34 = cilVar19;
                        final cil cilVar35 = cilVar25;
                        nnl nnlVar3 = nnlVar;
                        byq.c(buxVar2, ctpVarA, cwb.e);
                        byq.c(buxVar2, ccxVarN, cwb.d);
                        byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
                        byq.b(buxVar2, cwb.g);
                        byq.c(buxVar2, cfyVarJ, cwb.c);
                        avy avyVar2 = avy.a;
                        acp acpVarB = acl.B(ca.F(300, 0, null, 6), 2);
                        acq acqVarC = acl.C(ca.F(300, 0, null, 6), 2);
                        final cfy cfyVarV = awd.v(cfvVar, true, 1);
                        cfy cfyVarB = avyVar2.b(cfvVar, 1.0f, false);
                        if (nnlVar3.o != null) {
                            nnlVar2 = nnlVar3;
                            avyVar = avyVar2;
                            z = true;
                        } else {
                            nnlVar2 = nnlVar3;
                            avyVar = avyVar2;
                            z = false;
                        }
                        final int i9 = 1;
                        final nnl nnlVar4 = nnlVar2;
                        ca.N(avyVar, z, cfyVarB, acpVarB, acqVarC, null, bxc.i(369887754, true, new afeh() { // from class: nmz
                            @Override // defpackage.afeh
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i10 = i9;
                                if (i10 == 0) {
                                    bux buxVar3 = (bux) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    int i11 = nni.a;
                                    ((abu) obj3).getClass();
                                    int i12 = iIntValue2 & 17;
                                    if (buxVar3.I(i12 != 16, iIntValue2 & 1)) {
                                        nnk nnkVar = nnlVar4.p;
                                        if (nnkVar == null) {
                                            buxVar3.v(269279462);
                                            buxVar3.o();
                                        } else {
                                            bwq bwqVar5 = bwqVar4;
                                            cil cilVar36 = cilVar33;
                                            cil cilVar37 = cilVar34;
                                            cil cilVar38 = cilVar35;
                                            cfy cfyVar = cfyVarV;
                                            buxVar3.v(269279463);
                                            nni.c(cfyVar, nnkVar, cilVar38, cilVar37, cilVar36, bwqVar5, nmr.d, "centerAction", buxVar3, 14155782);
                                            buxVar3.o();
                                        }
                                    } else {
                                        buxVar3.s();
                                    }
                                    return afak.a;
                                }
                                if (i10 != 1) {
                                    bux buxVar4 = (bux) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    int i13 = nni.a;
                                    ((abu) obj3).getClass();
                                    if (buxVar4.I((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                        nnk nnkVar2 = nnlVar4.q;
                                        if (nnkVar2 == null) {
                                            buxVar4.v(-967579732);
                                            buxVar4.o();
                                        } else {
                                            bwq bwqVar6 = bwqVar4;
                                            cil cilVar39 = cilVar33;
                                            cil cilVar40 = cilVar34;
                                            cil cilVar41 = cilVar35;
                                            cfy cfyVar2 = cfyVarV;
                                            buxVar4.v(-967579731);
                                            nni.c(cfyVar2, nnkVar2, cilVar41, cilVar40, cilVar39, bwqVar6, nmr.e, "rightAction", buxVar4, 14155782);
                                            buxVar4.o();
                                        }
                                    } else {
                                        buxVar4.s();
                                    }
                                    return afak.a;
                                }
                                bux buxVar5 = (bux) obj4;
                                int iIntValue4 = ((Integer) obj5).intValue();
                                int i14 = nni.a;
                                ((abu) obj3).getClass();
                                if (buxVar5.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                    nnk nnkVar3 = nnlVar4.o;
                                    if (nnkVar3 == null) {
                                        buxVar5.v(-1559956551);
                                        buxVar5.o();
                                    } else {
                                        bwq bwqVar7 = bwqVar4;
                                        cil cilVar42 = cilVar33;
                                        cil cilVar43 = cilVar34;
                                        cil cilVar44 = cilVar35;
                                        cfy cfyVar3 = cfyVarV;
                                        buxVar5.v(-1559956550);
                                        nni.c(cfyVar3, nnkVar3, cilVar44, cilVar43, cilVar42, bwqVar7, nmr.c, "leftAction", buxVar5, 14155782);
                                        buxVar5.o();
                                    }
                                } else {
                                    buxVar5.s();
                                }
                                return afak.a;
                            }
                        }, buxVar2), buxVar2, 1600518, 16);
                        cfy cfyVarB2 = avyVar.b(cfvVar, 1.0f, false);
                        boolean z2 = nnlVar4.p != null;
                        final int i10 = 0;
                        ca.N(avyVar, z2, cfyVarB2, acpVarB, acqVarC, null, bxc.i(-1710855885, true, new afeh() { // from class: nmz
                            @Override // defpackage.afeh
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i102 = i10;
                                if (i102 == 0) {
                                    bux buxVar3 = (bux) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    int i11 = nni.a;
                                    ((abu) obj3).getClass();
                                    int i12 = iIntValue2 & 17;
                                    if (buxVar3.I(i12 != 16, iIntValue2 & 1)) {
                                        nnk nnkVar = nnlVar4.p;
                                        if (nnkVar == null) {
                                            buxVar3.v(269279462);
                                            buxVar3.o();
                                        } else {
                                            bwq bwqVar5 = bwqVar4;
                                            cil cilVar36 = cilVar30;
                                            cil cilVar37 = cilVar31;
                                            cil cilVar38 = cilVar32;
                                            cfy cfyVar = cfyVarV;
                                            buxVar3.v(269279463);
                                            nni.c(cfyVar, nnkVar, cilVar38, cilVar37, cilVar36, bwqVar5, nmr.d, "centerAction", buxVar3, 14155782);
                                            buxVar3.o();
                                        }
                                    } else {
                                        buxVar3.s();
                                    }
                                    return afak.a;
                                }
                                if (i102 != 1) {
                                    bux buxVar4 = (bux) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    int i13 = nni.a;
                                    ((abu) obj3).getClass();
                                    if (buxVar4.I((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                        nnk nnkVar2 = nnlVar4.q;
                                        if (nnkVar2 == null) {
                                            buxVar4.v(-967579732);
                                            buxVar4.o();
                                        } else {
                                            bwq bwqVar6 = bwqVar4;
                                            cil cilVar39 = cilVar30;
                                            cil cilVar40 = cilVar31;
                                            cil cilVar41 = cilVar32;
                                            cfy cfyVar2 = cfyVarV;
                                            buxVar4.v(-967579731);
                                            nni.c(cfyVar2, nnkVar2, cilVar41, cilVar40, cilVar39, bwqVar6, nmr.e, "rightAction", buxVar4, 14155782);
                                            buxVar4.o();
                                        }
                                    } else {
                                        buxVar4.s();
                                    }
                                    return afak.a;
                                }
                                bux buxVar5 = (bux) obj4;
                                int iIntValue4 = ((Integer) obj5).intValue();
                                int i14 = nni.a;
                                ((abu) obj3).getClass();
                                if (buxVar5.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                    nnk nnkVar3 = nnlVar4.o;
                                    if (nnkVar3 == null) {
                                        buxVar5.v(-1559956551);
                                        buxVar5.o();
                                    } else {
                                        bwq bwqVar7 = bwqVar4;
                                        cil cilVar42 = cilVar30;
                                        cil cilVar43 = cilVar31;
                                        cil cilVar44 = cilVar32;
                                        cfy cfyVar3 = cfyVarV;
                                        buxVar5.v(-1559956550);
                                        nni.c(cfyVar3, nnkVar3, cilVar44, cilVar43, cilVar42, bwqVar7, nmr.c, "leftAction", buxVar5, 14155782);
                                        buxVar5.o();
                                    }
                                } else {
                                    buxVar5.s();
                                }
                                return afak.a;
                            }
                        }, buxVar2), buxVar2, 1600518, 16);
                        final int i11 = 2;
                        ca.N(avyVar, nnlVar4.q != null, avyVar.b(cfvVar, 1.0f, false), acpVarB, acqVarC, null, bxc.i(1893207442, true, new afeh() { // from class: nmz
                            @Override // defpackage.afeh
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i102 = i11;
                                if (i102 == 0) {
                                    bux buxVar3 = (bux) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    int i112 = nni.a;
                                    ((abu) obj3).getClass();
                                    int i12 = iIntValue2 & 17;
                                    if (buxVar3.I(i12 != 16, iIntValue2 & 1)) {
                                        nnk nnkVar = nnlVar4.p;
                                        if (nnkVar == null) {
                                            buxVar3.v(269279462);
                                            buxVar3.o();
                                        } else {
                                            bwq bwqVar5 = bwqVar4;
                                            cil cilVar36 = cilVar27;
                                            cil cilVar37 = cilVar28;
                                            cil cilVar38 = cilVar29;
                                            cfy cfyVar = cfyVarV;
                                            buxVar3.v(269279463);
                                            nni.c(cfyVar, nnkVar, cilVar38, cilVar37, cilVar36, bwqVar5, nmr.d, "centerAction", buxVar3, 14155782);
                                            buxVar3.o();
                                        }
                                    } else {
                                        buxVar3.s();
                                    }
                                    return afak.a;
                                }
                                if (i102 != 1) {
                                    bux buxVar4 = (bux) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    int i13 = nni.a;
                                    ((abu) obj3).getClass();
                                    if (buxVar4.I((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                        nnk nnkVar2 = nnlVar4.q;
                                        if (nnkVar2 == null) {
                                            buxVar4.v(-967579732);
                                            buxVar4.o();
                                        } else {
                                            bwq bwqVar6 = bwqVar4;
                                            cil cilVar39 = cilVar27;
                                            cil cilVar40 = cilVar28;
                                            cil cilVar41 = cilVar29;
                                            cfy cfyVar2 = cfyVarV;
                                            buxVar4.v(-967579731);
                                            nni.c(cfyVar2, nnkVar2, cilVar41, cilVar40, cilVar39, bwqVar6, nmr.e, "rightAction", buxVar4, 14155782);
                                            buxVar4.o();
                                        }
                                    } else {
                                        buxVar4.s();
                                    }
                                    return afak.a;
                                }
                                bux buxVar5 = (bux) obj4;
                                int iIntValue4 = ((Integer) obj5).intValue();
                                int i14 = nni.a;
                                ((abu) obj3).getClass();
                                if (buxVar5.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                    nnk nnkVar3 = nnlVar4.o;
                                    if (nnkVar3 == null) {
                                        buxVar5.v(-1559956551);
                                        buxVar5.o();
                                    } else {
                                        bwq bwqVar7 = bwqVar4;
                                        cil cilVar42 = cilVar27;
                                        cil cilVar43 = cilVar28;
                                        cil cilVar44 = cilVar29;
                                        cfy cfyVar3 = cfyVarV;
                                        buxVar5.v(-1559956550);
                                        nni.c(cfyVar3, nnkVar3, cilVar44, cilVar43, cilVar42, bwqVar7, nmr.c, "leftAction", buxVar5, 14155782);
                                        buxVar5.o();
                                    }
                                } else {
                                    buxVar5.s();
                                }
                                return afak.a;
                            }
                        }, buxVar2), buxVar2, 1600518, 16);
                        buxVar2.n();
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nmx(nnlVar, bwqVar, cilVar, cilVar2, cilVar3, cilVar4, cilVar5, cilVar6, cilVar7, cilVar8, cilVar9, i, i2, 0);
        }
    }

    public static final void e(final abg abgVar, final nnl nnlVar, final bwq bwqVar, final cil cilVar, final cil cilVar2, final cil cilVar3, final boolean z, final boolean z2, bux buxVar, final int i) {
        int i2;
        bwq bwqVar2;
        cil cilVar4;
        cil cilVar5;
        final boolean z3;
        char c2;
        bux buxVarC = buxVar.c(490277810);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(abgVar) : buxVarC.E(abgVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(nnlVar) : buxVarC.E(nnlVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            bwqVar2 = bwqVar;
            i2 |= true != buxVarC.C(bwqVar2) ? 128 : 256;
        } else {
            bwqVar2 = bwqVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            cilVar4 = cilVar2;
            i2 |= true != buxVarC.C(cilVar4) ? 8192 : 16384;
        } else {
            cilVar4 = cilVar2;
        }
        if ((196608 & i) == 0) {
            cilVar5 = cilVar3;
            i2 |= true != buxVarC.C(cilVar5) ? 65536 : 131072;
        } else {
            cilVar5 = cilVar3;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            z3 = z2;
            c2 = ' ';
            i2 |= true != buxVarC.D(z3) ? 4194304 : 8388608;
        } else {
            z3 = z2;
            c2 = ' ';
        }
        if ((100663296 & i) == 0) {
            i2 |= true != buxVarC.D(true) ? 33554432 : 67108864;
        }
        if (buxVarC.I((38347923 & i2) != 38347922, i2 & 1)) {
            cfy cfyVarA = abgVar.a(cfy.e, acl.B(ca.F(450, 0, null, 6), 2).a(acl.q(ca.F(450, 0, b, 2), 0.5f, 0L, 4)), acl.C(ca.F(300, 100, null, 4), 2).a(acl.r(new agl(300, 100, c), 0.5f, 0L, 4)));
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> c2);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new nna(0);
                bvvVar.ad(objS);
            }
            afec afecVar = (afec) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new nna(2);
                bvvVar.ad(objS2);
            }
            final bwq bwqVar3 = bwqVar2;
            final cil cilVar6 = cilVar4;
            final cil cilVar7 = cilVar5;
            ca.V(nnlVar, null, afecVar, null, null, (afec) objS2, bxc.i(281558874, true, new afei() { // from class: nnb
                @Override // defpackage.afei
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    nnk nnkVar;
                    GhIcon ghIcon;
                    final nnl nnlVar2 = (nnl) obj3;
                    bux buxVar2 = (bux) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    int i3 = nni.a;
                    ((abg) obj2).getClass();
                    nnlVar2.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= true != ((iIntValue & 64) == 0 ? buxVar2.C(nnlVar2) : buxVar2.E(nnlVar2)) ? 16 : 32;
                    }
                    if (buxVar2.I((iIntValue & 145) != 144, iIntValue & 1)) {
                        boolean z4 = z;
                        final cil cilVar8 = cilVar7;
                        final cil cilVar9 = cilVar6;
                        final bwq bwqVar4 = bwqVar3;
                        final cil cilVar10 = cilVar;
                        final boolean z5 = z3;
                        if (nnlVar2.c == null && (ghIcon = (nnkVar = nnlVar2.b).a) != null && ghIcon.b == 6 && nnlVar2.d == null) {
                            buxVar2.v(-150455832);
                            nmj nmjVar = new nmj(ghIcon, nnlVar2.r, null, null, false, nnkVar.b);
                            avl avlVar = new avl(6.0f, 6.0f, 6.0f, 6.0f);
                            boolean zD = ((iIntValue & 112) == 32 || ((iIntValue & 64) != 0 && buxVar2.E(nnlVar2))) | buxVar2.D(z5) | buxVar2.C(cilVar10);
                            Object objG = buxVar2.g();
                            if (zD || objG == buw.a) {
                                objG = new hei(nnlVar2, z5, cilVar10, 3);
                                buxVar2.x(objG);
                            }
                            cfy cfyVarK = bxc.k(avlVar, (afec) objG);
                            boolean zC = buxVar2.C(bwqVar4);
                            Object objG2 = buxVar2.g();
                            if (zC || objG2 == buw.a) {
                                objG2 = new njm(bwqVar4, 6);
                                buxVar2.x(objG2);
                            }
                            cfy cfyVarA2 = cfyVarK.a(new chp((afec) objG2));
                            boolean z6 = nnlVar2.j;
                            if (z6 && cilVar9 != null) {
                                cfyVarA2 = cfyVarA2.a(new cim(cilVar9));
                            }
                            if (z6 && cilVar8 != null) {
                                cfyVarA2 = cfyVarA2.a(new cim(cilVar8));
                            }
                            kgq.m(cfyVarA2.a(new dca("appAction")), nmjVar, z4, true, buxVar2, 64, 0);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-149099954);
                            kfl.m(bxc.i(951425367, true, new cuz(nnlVar2, 16), buxVar2), z4 ? new avl(6.0f, 6.0f, 6.0f, 6.0f) : cfy.e, BitmapDescriptorFactory.HUE_RED, 0L, 0L, null, 0L, bxc.i(-1671476898, true, new afeg() { // from class: nmv
                                @Override // defpackage.afeg
                                public final Object invoke(Object obj6, Object obj7) {
                                    cil cilVar11;
                                    cil cilVar12;
                                    bux buxVar3 = (bux) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    int i4 = iIntValue2 & 3;
                                    int i5 = iIntValue2 & 1;
                                    int i6 = nni.a;
                                    if (buxVar3.I(i4 != 2, i5)) {
                                        Object obj8 = cilVar10;
                                        boolean z7 = z5;
                                        nnl nnlVar3 = nnlVar2;
                                        boolean z8 = nnlVar3.f;
                                        float f = true != z8 ? 20.0f : 32.0f;
                                        bcm bcmVar = bcr.a;
                                        bco bcoVar = new bco(f);
                                        bcm bcmVar2 = new bcm(bcoVar, bcoVar, bcoVar, bcoVar);
                                        bco bcoVar2 = new bco(true != z8 ? 16.0f : 28.0f);
                                        bcm bcmVar3 = new bcm(bcoVar2, bcoVar2, bcoVar2, bcoVar2);
                                        aezr aezrVar = ktf.a;
                                        ktf ktfVarI = kgq.i(buxVar3);
                                        ksy ksyVar = ksy.f;
                                        cfv cfvVar = cfy.e;
                                        boolean zE = buxVar3.E(nnlVar3) | buxVar3.D(z7) | buxVar3.C(obj8);
                                        Object objG3 = buxVar3.g();
                                        if (zE || objG3 == buw.a) {
                                            objG3 = new bbb(nnlVar3, z7, obj8, 3);
                                            buxVar3.x(objG3);
                                        }
                                        Object obj9 = bwqVar4;
                                        cfy cfyVarK2 = bxc.k(cfvVar, (afec) objG3);
                                        boolean zC2 = buxVar3.C(obj9);
                                        Object objG4 = buxVar3.g();
                                        if (zC2 || objG4 == buw.a) {
                                            objG4 = new njq(obj9, 2);
                                            buxVar3.x(objG4);
                                        }
                                        cfy cfyVarA3 = cfyVarK2.a(new chp((afec) objG4));
                                        boolean z9 = nnlVar3.j;
                                        if (z9 && (cilVar12 = cilVar9) != null) {
                                            cfyVarA3 = cfyVarA3.a(new cim(cilVar12));
                                        }
                                        if (z9 && (cilVar11 = cilVar8) != null) {
                                            cfyVarA3 = cfyVarA3.a(new cim(cilVar11));
                                        }
                                        cfy cfyVarA4 = cfyVarA3.a(new dca("appAction"));
                                        boolean zE2 = buxVar3.E(nnlVar3);
                                        Object objG5 = buxVar3.g();
                                        if (zE2 || objG5 == buw.a) {
                                            objG5 = new ngz(nnlVar3, 10);
                                            buxVar3.x(objG5);
                                        }
                                        khc.j((afdr) objG5, cfyVarA4, ksyVar, true, false, bcmVar2, null, ktfVarI, null, null, null, null, false, bxc.i(761773894, true, new alt(nnlVar3, bcmVar3, 4), buxVar3), buxVar3, 0, 24576, 16208);
                                    } else {
                                        buxVar3.s();
                                    }
                                    return afak.a;
                                }
                            }, buxVar2), buxVar2, 12607494, 108);
                            buxVar2.o();
                        }
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, ((i2 >> 3) & 14) | 1769864, 26);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nnc
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar2 = (bux) obj2;
                    ((Integer) obj3).intValue();
                    abg abgVar2 = abgVar;
                    nnl nnlVar2 = nnlVar;
                    bwq bwqVar4 = bwqVar;
                    cil cilVar8 = cilVar;
                    int i3 = i | 1;
                    int i4 = 306783378 & i3;
                    int i5 = 613566756 & i3;
                    nni.e(abgVar2, nnlVar2, bwqVar4, cilVar8, cilVar2, cilVar3, z, z2, buxVar2, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0183  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.abg r50, final defpackage.nnl r51, final defpackage.cfy r52, final defpackage.cil r53, defpackage.cil r54, final boolean r55, final defpackage.cil r56, final defpackage.cil r57, boolean r58, defpackage.bux r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nni.f(abg, nnl, cfy, cil, cil, boolean, cil, cil, boolean, bux, int):void");
    }

    private static final boolean g(nmr nmrVar, nnl nnlVar) {
        if (!nnlVar.j) {
            return nmrVar == nmr.b;
        }
        int iOrdinal = nmrVar.ordinal();
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal == 4 && nnlVar.q != null) {
                    return true;
                }
            } else if (nnlVar.p != null) {
                return true;
            }
        } else if (nnlVar.o != null) {
            return true;
        }
        return false;
    }
}
