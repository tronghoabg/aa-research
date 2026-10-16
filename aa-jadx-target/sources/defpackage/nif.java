package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nif {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CompHoriRailFrag");

    public static final defpackage.cgf a(defpackage.cgf cgfVar, defpackage.cit citVar, defpackage.cit citVar2, boolean z) {
        return defpackage.bzd.r(defpackage.bzd.q(cgfVar, citVar), new defpackage.glo(z, citVar2, 7));
    }

    public static final void b(defpackage.cgf cgfVar, defpackage.nkp nkpVar, boolean z, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1166531879);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.cgf cgfVarI = z ? defpackage.asq.I(cgfVar, defpackage.gjr.P0.k, 0.0f) : cgfVar;
            defpackage.yqm yqmVar = defpackage.nkp.a;
            defpackage.lvs.Q(nkpVar, cgfVarI, bveVarC, ((i2 >> 3) & 14) | 8);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gvy(cgfVar, nkpVar, z, i, 3);
        }
    }

    public static final void c(defpackage.bve bveVar, int i) {
        defpackage.bve bveVarC = bveVar.c(1901099176);
        int i2 = 1;
        if (bveVarC.I(i != 0, i & 1)) {
            defpackage.cne cneVarH = defpackage.day.h(2131231968, bveVarC, 0);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.niq(i2);
                bwcVar.ad(objS);
            }
            defpackage.khg.m(cneVarH, (defpackage.afer) objS, null, null, false, null, null, null, null, bveVarC, 56, 0, 4092);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gur(i, 9);
        }
    }

    public static final void d(defpackage.atr atrVar, defpackage.nkp nkpVar, boolean z, defpackage.cld cldVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cgf cgfVarH;
        defpackage.cgf cgfVarB;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1742597981);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(atrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(cldVar) ? 1024 : 2048;
        }
        if (bveVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            if (z && nkpVar.q()) {
                cgfVarB = defpackage.awj.c(defpackage.cgf.e, 1.0f);
            } else {
                if (nkpVar.o) {
                    cgfVarB = atrVar.b(defpackage.cgf.e);
                } else {
                    defpackage.aug augVar = defpackage.awj.a;
                    cgfVarH = z ? defpackage.cjv.h(augVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar, true, 0, 1042431) : augVar;
                }
                defpackage.jvo.a(cgfVarH, nkpVar.e, nkpVar.e(), bveVarC, 0);
            }
            cgfVarH = cgfVarB;
            defpackage.jvo.a(cgfVarH, nkpVar.e, nkpVar.e(), bveVarC, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new hdd(atrVar, nkpVar, z, cldVar, i, 7);
        }
    }

    public static final void e(defpackage.cgf cgfVar, defpackage.nkp nkpVar, boolean z, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-232394501);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i4 = i2 & 896;
            int i5 = (i2 & 14) | 64 | (i2 & 112);
            if (((java.lang.Boolean) defpackage.bxi.m(nkpVar.j(), java.lang.Boolean.FALSE, bveVarC).a()).booleanValue()) {
                bveVarC.v(222942640);
                b(cgfVar, nkpVar, z, bveVarC, i5 | i4);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(223003121);
                defpackage.ebq.l(cgfVar, nkpVar, z, bveVarC, i5 | i4);
                ((defpackage.bwc) bveVarC).Y(false);
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nhv(cgfVar, nkpVar, z, i, 0);
        }
    }

    public static final void f(defpackage.cgf cgfVar, boolean z, boolean z2, final defpackage.nkp nkpVar, final defpackage.nkj nkjVar, final boolean z3, boolean z4, defpackage.affc affcVar, final defpackage.nod nodVar, defpackage.cit citVar, final defpackage.cit citVar2, final defpackage.cit citVar3, final java.util.Map map, defpackage.bwx bwxVar, final defpackage.afer aferVar, final boolean z5, final boolean z6, final boolean z7, defpackage.bve bveVar, int i, int i2) {
        int i3;
        boolean z8;
        int i4;
        boolean z9;
        defpackage.affc affcVar2;
        defpackage.cit citVar4;
        int i5;
        boolean z10;
        final defpackage.bwx bwxVar2;
        boolean z11;
        defpackage.bve bveVar2;
        int i6 = i & 6;
        defpackage.bve bveVarC = bveVar.c(2001643110);
        if (i6 == 0) {
            i3 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z8 = z;
            i3 |= true != bveVarC.D(z8) ? 16 : 32;
        } else {
            z8 = z;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != ((32768 & i) == 0 ? bveVarC.C(nkjVar) : bveVarC.E(nkjVar)) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != bveVarC.D(z3) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i4 = 32;
            z9 = z4;
            i3 |= true != bveVarC.D(z9) ? 524288 : 1048576;
        } else {
            i4 = 32;
            z9 = z4;
        }
        if ((i & 12582912) == 0) {
            affcVar2 = affcVar;
            i3 |= true != bveVarC.E(affcVar2) ? 4194304 : 8388608;
        } else {
            affcVar2 = affcVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != ((134217728 & i) == 0 ? bveVarC.C(nodVar) : bveVarC.E(nodVar)) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            citVar4 = citVar;
            i3 |= true != bveVarC.C(citVar4) ? 268435456 : 536870912;
        } else {
            citVar4 = citVar;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != bveVarC.C(citVar2) ? 2 : 4);
        } else {
            i5 = i2;
        }
        int i7 = i5;
        if ((i2 & 48) == 0) {
            i5 = i7 | (true != bveVarC.C(citVar3) ? 16 : i4);
        }
        if ((i2 & 384) == 0) {
            z10 = true;
            i5 |= true == ((i2 & 512) == 0 ? bveVarC.C(map) : bveVarC.E(map)) ? 256 : 128;
        } else {
            z10 = true;
        }
        if ((i2 & 3072) == 0) {
            bwxVar2 = bwxVar;
            i5 |= z10 == bveVarC.C(bwxVar2) ? 2048 : 1024;
        } else {
            bwxVar2 = bwxVar;
        }
        if ((i2 & 24576) == 0) {
            z11 = true;
            i5 |= true != bveVarC.E(aferVar) ? 8192 : 16384;
        } else {
            z11 = true;
        }
        if ((i2 & 196608) == 0) {
            i5 |= z11 == bveVarC.D(z5) ? 131072 : 65536;
        }
        int i8 = i5;
        if ((i2 & 1572864) == 0) {
            i5 = i8 | (z11 == bveVarC.D(z6) ? 1048576 : 524288);
        }
        if ((i2 & 12582912) == 0) {
            i5 |= z11 != bveVarC.D(z7) ? 4194304 : 8388608;
        }
        if (bveVarC.I(((306783379 & i3) == 306783378 && (4793491 & i5) == 4793490) ? false : true, i3 & 1)) {
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.e, defpackage.cfs.m, bveVarC, 6);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            long j = bwcVar.u;
            long j2 = j ^ (j >>> i4);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            final boolean z12 = z9;
            final boolean z13 = z8;
            final defpackage.cit citVar5 = citVar4;
            final defpackage.affc affcVar3 = affcVar2;
            bveVar2 = bveVarC;
            defpackage.ca.V(java.lang.Boolean.valueOf(z2 && !defpackage.lxy.s(nodVar)), null, null, null, "RailWidget vs Hotseat", null, defpackage.dai.as(-26520243, true, new defpackage.affi() { // from class: nhy
                @Override // defpackage.affi
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    int i9;
                    java.lang.Object obj5;
                    defpackage.bve bveVar3;
                    final defpackage.abn abnVar = (defpackage.abn) obj;
                    final boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
                    defpackage.bve bveVar4 = (defpackage.bve) obj3;
                    int iIntValue = ((java.lang.Integer) obj4).intValue();
                    defpackage.yqm yqmVar = defpackage.nif.a;
                    abnVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        i9 = (true != ((iIntValue & 8) == 0 ? bveVar4.C(abnVar) : bveVar4.E(abnVar)) ? 2 : 4) | iIntValue;
                    } else {
                        i9 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i9 |= true != bveVar4.D(zBooleanValue) ? 16 : 32;
                    }
                    if (bveVar4.I((i9 & 147) != 146, i9 & 1)) {
                        final boolean z14 = z13;
                        final boolean z15 = z7;
                        final boolean z16 = z6;
                        final boolean z17 = z5;
                        final defpackage.afer aferVar3 = aferVar;
                        final defpackage.bwx bwxVar3 = bwxVar2;
                        final java.util.Map map2 = map;
                        final defpackage.affc affcVar4 = affcVar3;
                        final boolean z18 = z12;
                        int i10 = i9;
                        final boolean z19 = z3;
                        final defpackage.nkj nkjVar2 = nkjVar;
                        final defpackage.nkp nkpVar2 = nkpVar;
                        boolean zE = bveVar4.E(nkpVar2) | bveVar4.E(nkjVar2) | bveVar4.D(z19) | bveVar4.D(z18) | bveVar4.C(affcVar4) | bveVar4.E(map2) | bveVar4.C(bwxVar3) | bveVar4.C(aferVar3) | bveVar4.D(z17) | bveVar4.D(z16) | bveVar4.D(z15) | bveVar4.D(z14);
                        boolean z20 = (i10 & 14) == 4 || ((i10 & 8) != 0 && bveVar4.E(abnVar));
                        final defpackage.cit citVar6 = citVar3;
                        boolean z21 = z20;
                        final defpackage.cit citVar7 = citVar2;
                        final defpackage.cit citVar8 = citVar5;
                        final defpackage.nod nodVar2 = nodVar;
                        boolean zE2 = zE | z21 | bveVar4.E(nodVar2) | bveVar4.C(citVar8) | bveVar4.C(citVar7) | bveVar4.C(citVar6);
                        boolean z22 = (i10 & 112) == 32;
                        java.lang.Object objG = bveVar4.g();
                        if ((zE2 || z22) || objG == defpackage.bvd.a) {
                            obj5 = new defpackage.affg() { // from class: nhu
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                    defpackage.cvm cvmVar = (defpackage.cvm) obj6;
                                    final defpackage.dlm dlmVar = (defpackage.dlm) obj7;
                                    defpackage.yqm yqmVar2 = defpackage.nif.a;
                                    cvmVar.getClass();
                                    defpackage.nkt nktVar = defpackage.nkt.a;
                                    defpackage.nkp nkpVar3 = nkpVar2;
                                    defpackage.nkj nkjVar3 = nkjVar2;
                                    boolean z23 = z19;
                                    boolean z24 = z18;
                                    defpackage.affc affcVar5 = affcVar4;
                                    final java.util.Map map3 = map2;
                                    final defpackage.bwx bwxVar4 = bwxVar3;
                                    defpackage.ctx ctxVar = (defpackage.ctx) defpackage.afga.az(cvmVar.r(nktVar, new defpackage.ccz(-433002860, true, new defpackage.nht(nkpVar3, nkjVar3, z23, z24, affcVar5, map3, bwxVar4, aferVar3, z17, z16, z15, 1))));
                                    long j3 = dlmVar.a;
                                    final defpackage.cux cuxVarV = ctxVar.v(j3);
                                    final int i11 = cuxVarV.a;
                                    int i12 = cuxVarV.b;
                                    final defpackage.abn abnVar2 = abnVar;
                                    final defpackage.nod nodVar3 = nodVar2;
                                    final defpackage.cit citVar9 = citVar8;
                                    final defpackage.cit citVar10 = citVar7;
                                    defpackage.nkt nktVar2 = defpackage.nkt.b;
                                    final boolean z25 = z14;
                                    final defpackage.cit citVar11 = citVar6;
                                    final defpackage.cux cuxVarV2 = ((defpackage.ctx) defpackage.afga.az(cvmVar.r(nktVar2, new defpackage.ccz(-30945492, true, new defpackage.affg() { // from class: nhj
                                        @Override // defpackage.affg
                                        public final java.lang.Object invoke(java.lang.Object obj8, java.lang.Object obj9) {
                                            defpackage.bve bveVar5 = (defpackage.bve) obj8;
                                            int iIntValue2 = ((java.lang.Integer) obj9).intValue();
                                            int i13 = iIntValue2 & 3;
                                            int i14 = iIntValue2 & 1;
                                            defpackage.yqm yqmVar3 = defpackage.nif.a;
                                            if (bveVar5.I(i13 != 2, i14)) {
                                                defpackage.cfu cfuVar = defpackage.cfs.e;
                                                defpackage.cgc cgcVar = defpackage.cgf.e;
                                                defpackage.cty ctyVarB = defpackage.atp.b(cfuVar, false);
                                                long jB = bveVar5.b();
                                                long j4 = jB ^ (jB >>> 32);
                                                defpackage.cdd cddVarN = bveVar5.N();
                                                defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVar5, cgcVar);
                                                defpackage.afer aferVar4 = defpackage.cwl.a;
                                                bveVar5.M();
                                                bveVar5.w();
                                                if (bveVar5.G()) {
                                                    bveVar5.j(aferVar4);
                                                } else {
                                                    bveVar5.y();
                                                }
                                                boolean z26 = z25;
                                                defpackage.byw.c(bveVar5, ctyVarB, defpackage.cwl.e);
                                                defpackage.byw.c(bveVar5, cddVarN, defpackage.cwl.d);
                                                defpackage.byw.c(bveVar5, java.lang.Integer.valueOf((int) j4), defpackage.cwl.f);
                                                bveVar5.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                                                defpackage.byw.c(bveVar5, cgfVarN2, defpackage.cwl.c);
                                                defpackage.cgf cgfVarV = z26 ? defpackage.awj.v(cgcVar, false, 3) : defpackage.awj.a;
                                                defpackage.bwx bwxVar5 = bwxVar4;
                                                java.util.Map map4 = map3;
                                                defpackage.cgf cgfVarA = cgfVarV.a(new defpackage.dci("railWidget"));
                                                java.lang.Object obj10 = map4.get(defpackage.nje.d);
                                                obj10.getClass();
                                                defpackage.cgf cgfVarA2 = cgfVarA.a(new defpackage.ciu((defpackage.cit) obj10));
                                                boolean zC = bveVar5.C(bwxVar5);
                                                java.lang.Object objG2 = bveVar5.g();
                                                if (zC || objG2 == defpackage.bvd.a) {
                                                    objG2 = new defpackage.lto(bwxVar5, 16);
                                                    bveVar5.x(objG2);
                                                }
                                                defpackage.cit citVar12 = citVar11;
                                                defpackage.cit citVar13 = citVar10;
                                                defpackage.cit citVar14 = citVar9;
                                                java.lang.Object obj11 = objG2;
                                                defpackage.nod nodVar4 = nodVar3;
                                                defpackage.abn abnVar3 = abnVar2;
                                                defpackage.cgf cgfVarA3 = cgfVarA2.a(new defpackage.chx((defpackage.affc) obj11));
                                                defpackage.nod nodVar5 = defpackage.nod.a;
                                                defpackage.nob.f(abnVar3, nodVar4, cgfVarA3, citVar14, null, z26, citVar13, citVar12, false, bveVar5, 64);
                                                bveVar5.n();
                                            } else {
                                                bveVar5.s();
                                            }
                                            return defpackage.afbk.a;
                                        }
                                    })))).v(defpackage.dlm.l(i11, z25 ? i11 : defpackage.dlm.b(j3), i12, i12));
                                    int iB = z25 ? i11 : defpackage.dlm.b(j3);
                                    final boolean z26 = zBooleanValue;
                                    return cvmVar.dS(iB, i12, defpackage.afcf.a, new defpackage.affc() { // from class: nhl
                                        @Override // defpackage.affc
                                        public final java.lang.Object invoke(java.lang.Object obj8) {
                                            int iB2;
                                            defpackage.cuw cuwVar = (defpackage.cuw) obj8;
                                            defpackage.yqm yqmVar3 = defpackage.nif.a;
                                            cuwVar.getClass();
                                            boolean z27 = z26;
                                            if (z25 || z27) {
                                                iB2 = 0;
                                            } else {
                                                iB2 = (defpackage.dlm.b(dlmVar.a) >> 1) - (i11 / 2);
                                            }
                                            defpackage.cux cuxVar = cuxVarV;
                                            defpackage.cux cuxVar2 = cuxVarV2;
                                            if (true == z27) {
                                                cuxVar = cuxVar2;
                                            }
                                            cuwVar.x(cuxVar, iB2, 0);
                                            return defpackage.afbk.a;
                                        }
                                    });
                                }
                            };
                            bveVar3 = bveVar4;
                            bveVar3.x(obj5);
                        } else {
                            obj5 = objG;
                            bveVar3 = bveVar4;
                        }
                        defpackage.cvh.a(null, (defpackage.affg) obj5, bveVar3, 0, 1);
                    } else {
                        bveVar4.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVarC), bveVar2, 1597440, 46);
            bwcVar.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nhz(cgfVar, z, z2, nkpVar, nkjVar, z3, z4, affcVar, nodVar, citVar, citVar2, citVar3, map, bwxVar, aferVar, z5, z6, z7, i, i2);
        }
    }

    public static final void g(java.util.List list, defpackage.cft cftVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(28755062);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(list) : bveVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cftVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.cgf cgfVarR = defpackage.awj.r(defpackage.awj.b(cgfVar, 1.0f));
            defpackage.ktf ktfVar = nmt.a;
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ata.a(15.0f, cftVar), defpackage.cfs.n, bveVarC, 48);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarR);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            bveVarC.v(-491785000);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                kjo kjoVar = (kjr) it.next();
                if (kjoVar instanceof kjq) {
                    bveVarC.v(1934686489);
                    kjq kjqVar = (kjq) kjoVar;
                    int i4 = kjqVar.a.a.a;
                    if (defpackage.a.X(i4, 320865540)) {
                        bveVarC.v(-491778072);
                        kjoVar.getClass();
                        defpackage.lvs.N(kjqVar, null, bveVarC, 0);
                        bwcVar.Y(false);
                    } else if (defpackage.a.X(i4, 356517120)) {
                        bveVarC.v(-491774043);
                        kjoVar.getClass();
                        defpackage.lvs.I(kjqVar, false, bveVarC, 0, 2);
                        bwcVar.Y(false);
                    } else if (defpackage.a.X(i4, 354419976)) {
                        bveVarC.v(-491770105);
                        kjoVar.getClass();
                        defpackage.lwz.C(kjqVar, null, bveVarC, 0);
                        bwcVar.Y(false);
                    } else if (defpackage.a.X(i4, 356517131)) {
                        bveVarC.v(-491765876);
                        kjoVar.getClass();
                        defpackage.lwz.v(kjqVar, null, false, bveVarC, 0, 6);
                        bwcVar.Y(false);
                    } else if (defpackage.a.X(i4, 289408269)) {
                        bveVarC.v(-491761387);
                        kjoVar.getClass();
                        defpackage.lwz.r(kjqVar, null, false, bveVarC, 0, 6);
                        bwcVar.Y(false);
                    } else if (defpackage.a.X(i4, 358614275) || defpackage.a.X(i4, 627081341)) {
                        bveVarC.v(-491754422);
                        kjoVar.getClass();
                        defpackage.lwz.l(kjqVar, null, false, bveVarC, 0, 6);
                        bwcVar.Y(false);
                    } else if (defpackage.a.X(i4, 356517121)) {
                        bveVarC.v(-491750199);
                        kjoVar.getClass();
                        nlf.d(kjqVar, bveVarC, 0);
                        bwcVar.Y(false);
                    } else if (defpackage.a.X(i4, 624984185)) {
                        bveVarC.v(-491745808);
                        kjoVar.getClass();
                        nls.d(kjqVar, false, bveVarC, 0, 2);
                        bwcVar.Y(false);
                    } else if (defpackage.a.X(i4, 354419973)) {
                        bveVarC.v(-491741659);
                        kjoVar.getClass();
                        defpackage.lvs.P(kjqVar, null, bveVarC, 0);
                        bwcVar.Y(false);
                    } else if (defpackage.a.X(i4, 354419977)) {
                        bveVarC.v(-491737787);
                        kjoVar.getClass();
                        defpackage.lwz.q(kjqVar, null, bveVarC, 0);
                        bwcVar.Y(false);
                    } else {
                        bveVarC.v(-491735521);
                        c(bveVarC, 0);
                        bwcVar.Y(false);
                    }
                    bwcVar.Y(false);
                } else if (kjoVar instanceof kjo) {
                    bveVarC.v(1936147302);
                    defpackage.lvs.O(kjoVar, 1, bveVarC, 48);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(-491730113);
                    c(bveVarC, 0);
                    bwcVar.Y(false);
                }
            }
            bwcVar.Y(false);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kld(list, cftVar, cgfVar, i, 12);
        }
    }

    public static final void h(final defpackage.cgf cgfVar, final defpackage.atb atbVar, final defpackage.nkp nkpVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final defpackage.cit citVar, final defpackage.cit citVar2, final defpackage.affc affcVar, final defpackage.ask askVar, final defpackage.affc affcVar2, final java.util.Map map, final defpackage.bwx bwxVar, final boolean z5, defpackage.bve bveVar, final int i, final int i2) {
        int i3;
        boolean z6;
        boolean z7;
        defpackage.cit citVar3;
        int i4;
        final defpackage.cit citVar4;
        defpackage.affc affcVar3;
        int i5;
        boolean z8;
        defpackage.bwx bwxVar2;
        defpackage.bve bveVar2;
        int i6 = i & 6;
        defpackage.bve bveVarC = bveVar.c(879638391);
        if (i6 == 0) {
            i3 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(atbVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & 512) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            z6 = z3;
            i3 |= true != bveVarC.D(z6) ? 65536 : 131072;
        } else {
            z6 = z3;
        }
        if ((1572864 & i) == 0) {
            z7 = z4;
            i3 |= true != bveVarC.D(z7) ? 524288 : 1048576;
        } else {
            z7 = z4;
        }
        if ((12582912 & i) == 0) {
            citVar3 = citVar;
            i4 = 32;
            i3 |= true != bveVarC.C(citVar3) ? 4194304 : 8388608;
        } else {
            citVar3 = citVar;
            i4 = 32;
        }
        if ((100663296 & i) == 0) {
            citVar4 = citVar2;
            i3 |= true != bveVarC.C(citVar4) ? 33554432 : 67108864;
        } else {
            citVar4 = citVar2;
        }
        if ((805306368 & i) == 0) {
            affcVar3 = affcVar;
            i3 |= true != bveVarC.E(affcVar3) ? 268435456 : 536870912;
        } else {
            affcVar3 = affcVar;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != bveVarC.C(askVar) ? 2 : 4);
        } else {
            i5 = i2;
        }
        int i7 = i5;
        if ((i2 & 48) == 0) {
            i5 = i7 | (true != bveVarC.E(affcVar2) ? 16 : i4);
        }
        if ((i2 & 384) == 0) {
            z8 = true;
            i5 |= true == ((i2 & 512) == 0 ? bveVarC.C(map) : bveVarC.E(map)) ? 256 : 128;
        } else {
            z8 = true;
        }
        if ((i2 & 3072) == 0) {
            bwxVar2 = bwxVar;
            i5 |= z8 == bveVarC.C(bwxVar2) ? 2048 : 1024;
        } else {
            bwxVar2 = bwxVar;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true == bveVarC.D(z5) ? 16384 : 8192;
        }
        boolean z9 = false;
        if (bveVarC.I(((i3 & 306783379) == 306783378 && (i5 & 9363) == 9362) ? false : true, i3 & 1)) {
            defpackage.bys bysVarM = defpackage.bxi.m(nkpVar.j(), java.lang.Boolean.FALSE, bveVarC);
            int iIntValue = ((java.lang.Number) defpackage.bxi.m(nkpVar.e(), 0, bveVarC).a()).intValue();
            if (((java.lang.Boolean) bysVarM.a()).booleanValue() || (iIntValue != 3 && z2)) {
                z9 = true;
            }
            defpackage.cty ctyVarA = defpackage.awb.a(atbVar, defpackage.cfs.m, bveVarC, ((i3 & 126) >> 3) & 14);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            long j = bwcVar.u;
            long j2 = j ^ (j >>> i4);
            defpackage.cdd cddVarAh = bwcVar.ah();
            final boolean z10 = z9;
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            bveVar2 = bveVarC;
            final defpackage.bwx bwxVar3 = bwxVar2;
            final boolean z11 = z6;
            final defpackage.affc affcVar4 = affcVar3;
            final boolean z12 = z7;
            final defpackage.cit citVar5 = citVar3;
            defpackage.ccz cczVarAs = defpackage.dai.as(1924129094, true, new defpackage.affg() { // from class: nhp
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.cgf cgfVarA;
                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                    int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                    int i8 = iIntValue2 & 3;
                    int i9 = iIntValue2 & 1;
                    defpackage.yqm yqmVar = defpackage.nif.a;
                    if (bveVar3.I(i8 != 2, i9)) {
                        java.util.Map map2 = map;
                        boolean z13 = z10;
                        boolean z14 = z;
                        defpackage.cgf cgfVarI = defpackage.ebq.i(new defpackage.dci("home"), z14);
                        if (z13 || !z11) {
                            java.lang.Object obj3 = map2.get(defpackage.nje.b);
                            obj3.getClass();
                            cgfVarA = cgfVarI.a(new defpackage.ciu((defpackage.cit) obj3));
                        } else {
                            defpackage.cit citVar6 = citVar4;
                            defpackage.cit citVar7 = citVar5;
                            java.lang.Object obj4 = map2.get(defpackage.nje.b);
                            obj4.getClass();
                            cgfVarA = defpackage.nif.a(new defpackage.ciu((defpackage.cit) obj4), citVar7, citVar6, z14);
                        }
                        defpackage.bwx bwxVar4 = bwxVar3;
                        boolean zC = bveVar3.C(bwxVar4);
                        java.lang.Object objG = bveVar3.g();
                        if (zC || objG == defpackage.bvd.a) {
                            objG = new defpackage.lto(bwxVar4, 13);
                            bveVar3.x(objG);
                        }
                        boolean z15 = z5;
                        boolean z16 = z12;
                        java.lang.Object obj5 = objG;
                        defpackage.nkp nkpVar2 = nkpVar;
                        defpackage.cgf cgfVarX = defpackage.omf.x(cgfVarA.a(new defpackage.chx((defpackage.affc) obj5)), (defpackage.lhe) affcVar4.invoke(defpackage.nmu.a), askVar);
                        defpackage.yqm yqmVar2 = defpackage.nkp.a;
                        defpackage.ebq.m(cgfVarX, nkpVar2, z16, false, z15, bveVar3, 3136);
                    } else {
                        bveVar3.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVar2);
            defpackage.ccz cczVarAs2 = defpackage.dai.as(-1811288926, true, new defpackage.affg() { // from class: nhq
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                    int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                    int i8 = iIntValue2 & 3;
                    int i9 = iIntValue2 & 1;
                    defpackage.yqm yqmVar = defpackage.nif.a;
                    if (bveVar3.I(i8 != 2, i9)) {
                        defpackage.affc affcVar5 = affcVar2;
                        boolean zC = bveVar3.C(affcVar5);
                        java.lang.Object objG = bveVar3.g();
                        if (zC || objG == defpackage.bvd.a) {
                            objG = new defpackage.lto(affcVar5, 17);
                            bveVar3.x(objG);
                        }
                        boolean z13 = z3;
                        defpackage.afbk afbkVar = defpackage.afbk.a;
                        defpackage.bax baxVar = new defpackage.bax((defpackage.affc) objG, 8);
                        defpackage.cqu cquVar = defpackage.crq.a;
                        defpackage.cgf crpVar = new defpackage.crp(afbkVar, null, baxVar);
                        if (z13 && z10) {
                            crpVar = defpackage.nif.a(crpVar, citVar, citVar2, z);
                        }
                        defpackage.bwx bwxVar4 = bwxVar;
                        java.lang.Object obj3 = map.get(defpackage.nje.c);
                        obj3.getClass();
                        defpackage.cgf cgfVarA = crpVar.a(new defpackage.ciu((defpackage.cit) obj3));
                        boolean zC2 = bveVar3.C(bwxVar4);
                        java.lang.Object objG2 = bveVar3.g();
                        if (zC2 || objG2 == defpackage.bvd.a) {
                            objG2 = new defpackage.lto(bwxVar4, 18);
                            bveVar3.x(objG2);
                        }
                        boolean z14 = z4;
                        defpackage.nkp nkpVar2 = nkpVar;
                        defpackage.cgf cgfVarX = defpackage.omf.x(cgfVarA.a(new defpackage.chx((defpackage.affc) objG2)), (defpackage.lhe) affcVar.invoke(defpackage.nmu.c), askVar);
                        defpackage.yqm yqmVar2 = defpackage.nkp.a;
                        defpackage.nif.e(cgfVarX, nkpVar2, z14, bveVar3, 64);
                    } else {
                        bveVar3.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVar2);
            if (z) {
                bveVar2.v(-379590641);
                cczVarAs2.invoke(bveVar2, 6);
                cczVarAs.invoke(bveVar2, 6);
                bwcVar.Y(false);
            } else {
                bveVar2.v(-379529137);
                cczVarAs.invoke(bveVar2, 6);
                cczVarAs2.invoke(bveVar2, 6);
                bwcVar.Y(false);
            }
            bwcVar.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: nhr
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.cgf cgfVar2 = cgfVar;
                    defpackage.atb atbVar2 = atbVar;
                    defpackage.nkp nkpVar2 = nkpVar;
                    boolean z13 = z;
                    boolean z14 = z2;
                    boolean z15 = z3;
                    boolean z16 = z4;
                    defpackage.cit citVar6 = citVar;
                    defpackage.cit citVar7 = citVar2;
                    defpackage.affc affcVar5 = affcVar;
                    defpackage.ask askVar2 = askVar;
                    int i8 = i;
                    defpackage.affc affcVar6 = affcVar2;
                    int i9 = i2;
                    int i10 = i8 | 1;
                    int i11 = i9 & 306783378;
                    int i12 = i10 & 306783378;
                    defpackage.bwx bwxVar4 = bwxVar;
                    int i13 = i9 & 613566756;
                    int i14 = i10 & 613566756;
                    boolean z17 = z5;
                    defpackage.nif.h(cgfVar2, atbVar2, nkpVar2, z13, z14, z15, z16, citVar6, citVar7, affcVar5, askVar2, affcVar6, map, bwxVar4, z17, (defpackage.bve) obj, (i10 & (-920350135)) | i12 | (i14 >> 1) | ((i12 + i12) & i14), (i9 & (-920350135)) | i11 | (i13 >> 1) | ((i11 + i11) & i13));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(final defpackage.cgf cgfVar, final defpackage.nkp nkpVar, final defpackage.obg obgVar, final boolean z, final boolean z2, defpackage.bve bveVar, final int i) {
        int i2;
        defpackage.bve bveVar2;
        int i3;
        java.lang.Object obj;
        defpackage.bwc bwcVar;
        boolean z3;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(44933458);
        if (i4 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? bveVarC.C(obgVar) : bveVarC.E(obgVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.D(z2) ? 8192 : 16384;
        }
        if (bveVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            android.content.ComponentName componentName = defpackage.nye.a;
            defpackage.eqp eqpVar = ((defpackage.nye) defpackage.mkp.a.i(defpackage.nye.class)).d;
            defpackage.bys bysVarM = defpackage.bxi.m(eqpVar, eqpVar.e(), bveVarC);
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar2.S();
            java.lang.Object obj2 = defpackage.bvd.a;
            if (objS == obj2) {
                defpackage.djm djmVar = new defpackage.djm(bysVarM, 18);
                defpackage.lam lamVar = defpackage.byp.a;
                java.lang.Object bvrVar = new defpackage.bvr(djmVar, null);
                bwcVar2.ad(bvrVar);
                objS = bvrVar;
            }
            defpackage.bys bysVar = (defpackage.bys) objS;
            java.lang.Object objS2 = bwcVar2.S();
            if (objS2 == obj2) {
                i3 = 0;
                defpackage.djm djmVar2 = new defpackage.djm(bysVarM, 19);
                defpackage.lam lamVar2 = defpackage.byp.a;
                java.lang.Object bvrVar2 = new defpackage.bvr(djmVar2, null);
                bwcVar2.ad(bvrVar2);
                objS2 = bvrVar2;
            } else {
                i3 = 0;
            }
            defpackage.bys bysVar2 = (defpackage.bys) objS2;
            defpackage.bys bysVarM2 = defpackage.bxi.m(nkpVar.e(), java.lang.Integer.valueOf(i3), bveVarC);
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            java.lang.Object objS3 = bwcVar2.S();
            if (objS3 == obj2) {
                obj = null;
                objS3 = new defpackage.nng(new defpackage.bxn(nkpVar, bysVarM2, 16, null), new defpackage.bxn(nkpVar, context, 17, null), null, null);
                bwcVar2.ad(objS3);
            } else {
                obj = null;
            }
            defpackage.gja gjaVarA = ((defpackage.nng) objS3).a(obj, obj, bveVarC, 3);
            if (nkpVar.q) {
                int i5 = i2 & 7168;
                int i6 = (i2 >> 6) & 896;
                int i7 = i2 << 3;
                bveVarC.v(-1416168015);
                defpackage.nyi nyiVar = (defpackage.nyi) bysVarM.a();
                int i8 = i7 & 112;
                if (nyiVar == null || !nyiVar.c) {
                    int i9 = i3;
                    defpackage.bwc bwcVar3 = bwcVar2;
                    bveVarC.v(-1415758753);
                    int i10 = i8 | i6 | i5;
                    boolean z4 = i9;
                    defpackage.obb.a.k(((java.lang.Boolean) bysVar2.a()).booleanValue(), cgfVar, z2, z, null, defpackage.kfn.l(z, bveVarC, i9), gjaVarA.e, ((java.lang.Number) bysVar.a()).intValue(), false, 0, bveVarC, i10, 6, 784);
                    bveVar2 = bveVarC;
                    bwcVar3.Y(z4);
                    z3 = z4;
                    bwcVar = bwcVar3;
                } else {
                    bveVarC.v(-1416073062);
                    boolean z5 = i3;
                    bveVar2 = bveVarC;
                    defpackage.bwc bwcVar4 = bwcVar2;
                    defpackage.obb.a.b(((java.lang.Boolean) bysVar2.a()).booleanValue(), cgfVar, z2, z, null, defpackage.kfn.l(z, bveVar2, z5 ? 1 : 0), gjaVarA.e, bveVar2, i8 | 12582912 | i6 | i5, 16);
                    bwcVar4.Y(z5);
                    z3 = z5 ? 1 : 0;
                    bwcVar = bwcVar4;
                }
                bwcVar.Y(z3);
            } else {
                bveVar2 = bveVarC;
                bveVar2.v(-1415416265);
                defpackage.ask askVar = gjaVarA.e;
                boolean zBooleanValue = ((java.lang.Boolean) bysVar2.a()).booleanValue();
                defpackage.yhx yhxVar = defpackage.obg.a;
                int i11 = (i2 & 14) | 512;
                int i12 = i2 & 896;
                int i13 = i2 << 6;
                defpackage.nzs.e(cgfVar, askVar, obgVar, zBooleanValue, false, z, z2, bveVarC, i11 | i12 | (458752 & i13) | (i13 & 3670016));
                bwcVar2.Y(i3);
            }
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: nia
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj3;
                    ((java.lang.Integer) obj4).intValue();
                    defpackage.cgf cgfVar2 = cgfVar;
                    int i14 = i | 1;
                    int i15 = 306783378 & i14;
                    int i16 = 613566756 & i14;
                    defpackage.nif.i(cgfVar2, nkpVar, obgVar, z, z2, bveVar3, (i14 & (-920350135)) | i15 | (i16 >> 1) | ((i15 + i15) & i16));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void j(defpackage.cgf cgfVar, boolean z, boolean z2, boolean z3, boolean z4, defpackage.cit citVar, defpackage.cit citVar2, defpackage.affc affcVar, defpackage.ask askVar, defpackage.nkp nkpVar, java.util.Map map, defpackage.bwx bwxVar, defpackage.obg obgVar, boolean z5, defpackage.bve bveVar, int i, int i2) {
        int i3;
        int i4;
        boolean z6;
        boolean z7;
        int i5;
        boolean z8;
        int i6 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1162059523);
        if (i6 == 0) {
            i3 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i4 = 32;
            i3 |= true != bveVarC.D(z) ? 16 : 32;
        } else {
            i4 = 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z6 = true;
            i3 |= true != bveVarC.D(z3) ? 1024 : 2048;
        } else {
            z6 = true;
        }
        if ((i & 24576) == 0) {
            i3 |= z6 != bveVarC.D(z4) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != bveVarC.C(citVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != bveVarC.C(citVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != bveVarC.E(affcVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != bveVarC.C(askVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != ((1073741824 & i) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            z7 = true;
            i5 = i2 | (true != ((i2 & 8) == 0 ? bveVarC.C(map) : bveVarC.E(map)) ? 2 : 4);
        } else {
            z7 = true;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= z7 != bveVarC.C(bwxVar) ? 16 : i4;
        }
        if ((i2 & 384) == 0) {
            z8 = true;
            i5 |= true != ((i2 & 512) == 0 ? bveVarC.C(obgVar) : bveVarC.E(obgVar)) ? 128 : 256;
        } else {
            z8 = true;
        }
        if ((i2 & 3072) == 0) {
            i5 |= z8 != bveVarC.D(z5) ? 1024 : 2048;
        }
        if (bveVarC.I(((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true, i3 & 1)) {
            defpackage.atb atbVar = (z || z2) ? defpackage.ati.a : defpackage.ati.b;
            defpackage.cty ctyVarA = defpackage.awb.a(atbVar, defpackage.cfs.m, bveVarC, 0);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            long j = bwcVar.u;
            long j2 = j ^ (j >>> i4);
            defpackage.cdd cddVarAh = bwcVar.ah();
            int i7 = i3;
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.cgf dciVar = new defpackage.dci("notificationCenter");
            if (z3) {
                dciVar = a(dciVar, citVar, citVar2, !z2);
            }
            java.lang.Object obj = map.get(defpackage.nje.i);
            obj.getClass();
            defpackage.cgf cgfVarA = dciVar.a(new defpackage.ciu((defpackage.cit) obj));
            int i8 = i5 & 112;
            java.lang.Object objS = bwcVar.S();
            if (i8 == i4 || objS == defpackage.bvd.a) {
                objS = new defpackage.lto(bwxVar, 15);
                bwcVar.ad(objS);
            }
            defpackage.cgf cgfVarX = defpackage.omf.x(cgfVarA.a(new defpackage.chx((defpackage.affc) objS)), (defpackage.lhe) affcVar.invoke(defpackage.nmu.b), askVar);
            defpackage.yqm yqmVar = defpackage.nkp.a;
            defpackage.yhx yhxVar = defpackage.obg.a;
            i(cgfVarX, nkpVar, obgVar, z4, z5, bveVarC, ((i7 >> 24) & 112) | 576 | (i5 & 896) | ((i7 >> 3) & 7168) | (57344 & (i5 << 3)));
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nhw(cgfVar, z, z2, z3, z4, citVar, citVar2, affcVar, askVar, nkpVar, map, bwxVar, obgVar, z5, i, i2);
        }
    }

    public static final void k(final defpackage.nkj nkjVar, final defpackage.qsh qshVar, defpackage.nkp nkpVar, defpackage.nkl nklVar, defpackage.non nonVar, defpackage.obg obgVar, final defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        defpackage.nkp nkpVar2;
        defpackage.nkl nklVar2;
        defpackage.non nonVar2;
        defpackage.obg obgVar2;
        defpackage.nkp nkpVar3;
        defpackage.nkl nklVar3;
        final defpackage.non nonVar3;
        final defpackage.obg obgVar3;
        int i3;
        nkjVar.getClass();
        qshVar.getClass();
        affcVar.getClass();
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-710141606);
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(nkjVar) : bveVarC.E(nkjVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(qshVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 524288 : 1048576;
        }
        if (bveVarC.I((599187 & i2) != 599186, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.nkq nkqVar = new defpackage.nkq(qshVar, 0);
                defpackage.bvm bvmVar = defpackage.esn.a;
                defpackage.bvm bvmVar2 = defpackage.esn.a;
                defpackage.esa esaVar = (defpackage.esa) bveVarC.f(bvmVar2);
                if (esaVar == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                defpackage.esi esiVarF = defpackage.edd.f(esaVar);
                defpackage.afgx afgxVar = defpackage.afgw.a;
                nkpVar3 = (defpackage.nkp) defpackage.ebl.l(afgxVar.getOrCreateKotlinClass(defpackage.nkp.class), esaVar, null, nkqVar, esiVarF);
                defpackage.nkq nkqVar2 = new defpackage.nkq(qshVar, 1);
                defpackage.esa esaVar2 = (defpackage.esa) bveVarC.f(bvmVar2);
                if (esaVar2 == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                nklVar3 = (defpackage.nkl) defpackage.ebl.l(afgxVar.getOrCreateKotlinClass(defpackage.nkl.class), esaVar2, null, nkqVar2, defpackage.edd.f(esaVar2));
                defpackage.nkq nkqVar3 = new defpackage.nkq(nkpVar3.l, 2);
                defpackage.esa esaVar3 = (defpackage.esa) bveVarC.f(bvmVar2);
                if (esaVar3 == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                defpackage.non nonVar4 = (defpackage.non) defpackage.ebl.l(afgxVar.getOrCreateKotlinClass(defpackage.non.class), esaVar3, null, nkqVar3, defpackage.edd.f(esaVar3));
                defpackage.obh obhVar = new defpackage.obh(qshVar);
                defpackage.esa esaVar4 = (defpackage.esa) bveVarC.f(bvmVar2);
                if (esaVar4 == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                nonVar3 = nonVar4;
                obgVar3 = (defpackage.obg) defpackage.ebl.l(afgxVar.getOrCreateKotlinClass(defpackage.obg.class), esaVar4, null, obhVar, defpackage.edd.f(esaVar4));
            } else {
                bveVarC.s();
                nkpVar3 = nkpVar;
                nklVar3 = nklVar;
                nonVar3 = nonVar;
                obgVar3 = obgVar;
            }
            bveVarC.l();
            ((defpackage.yqj) a.f()).u("Compose Horizontal Rail showing");
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            final defpackage.bwx bwxVar = (defpackage.bwx) objS;
            final defpackage.bys bysVarM = defpackage.bxi.m(nkpVar3.c, java.lang.Boolean.TRUE, bveVarC);
            defpackage.eqp eqpVarH = nkpVar3.h();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            final defpackage.bys bysVarM2 = defpackage.bxi.m(eqpVarH, bool, bveVarC);
            final defpackage.bys bysVarM3 = defpackage.bxi.m(nkpVar3.f, bool, bveVarC);
            defpackage.yqm yqmVar = defpackage.nte.a;
            final boolean zJ = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().J();
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new defpackage.asl();
                bwcVar.ad(objS2);
            }
            final defpackage.ask askVar = (defpackage.ask) objS2;
            defpackage.bys bysVarM4 = defpackage.bxi.m(nkpVar3.e, bool, bveVarC);
            defpackage.bxi.m(nkpVar3.i(), bool, bveVarC);
            defpackage.bys bysVarM5 = defpackage.bxi.m(nkpVar3.e(), java.lang.Integer.valueOf((int) r11), bveVarC);
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                defpackage.djm djmVar = new defpackage.djm(bysVarM5, 17);
                defpackage.lam lamVar = defpackage.byp.a;
                defpackage.bvr bvrVar = new defpackage.bvr(djmVar, null);
                bwcVar.ad(bvrVar);
                objS3 = bvrVar;
            }
            final boolean z = nkpVar3.o;
            final defpackage.bys bysVar = (defpackage.bys) objS3;
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object objS4 = bwcVar.S();
            if (objS4 == obj) {
                objS4 = new defpackage.lfu(20);
                bwcVar.ad(objS4);
            }
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, 0);
            defpackage.cdz cdzVar = defpackage.cea.a;
            final defpackage.nkl nklVar4 = nklVar3;
            final java.util.Map map = (java.util.Map) defpackage.bxi.j(objArrCopyOf, cdzVar, (defpackage.afer) objS4, bveVarC, 3456);
            java.lang.Object[] objArr2 = new java.lang.Object[0];
            java.lang.Object objS5 = bwcVar.S();
            if (objS5 == obj) {
                objS5 = new defpackage.nhn(1);
                bwcVar.ad(objS5);
            }
            final defpackage.bwx bwxVar2 = (defpackage.bwx) defpackage.bxi.j(java.util.Arrays.copyOf(objArr2, 0), cdzVar, (defpackage.afer) objS5, bveVarC, 3456);
            java.lang.Object[] objArr3 = new java.lang.Object[0];
            java.lang.Object objS6 = bwcVar.S();
            if (objS6 == obj) {
                i3 = 0;
                objS6 = new defpackage.nhn(0);
                bwcVar.ad(objS6);
            } else {
                i3 = 0;
            }
            final defpackage.bwx bwxVar3 = (defpackage.bwx) defpackage.bxi.j(java.util.Arrays.copyOf(objArr3, i3), cdzVar, (defpackage.afer) objS6, bveVarC, 3456);
            java.lang.Object objS7 = bwcVar.S();
            if (objS7 == obj) {
                objS7 = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(4);
                bwcVar.ad(objS7);
            }
            final defpackage.byj byjVar = (defpackage.byj) objS7;
            final boolean zC = ((defpackage.nrr) ((defpackage.msh) defpackage.mkp.a.i(defpackage.msh.class)).i().i(defpackage.nrr.class)).c();
            java.lang.Boolean bool2 = (java.lang.Boolean) bysVarM4.a();
            bool2.booleanValue();
            boolean zC2 = bveVarC.C(bysVarM4);
            java.lang.Object objS8 = bwcVar.S();
            if (zC2 || objS8 == obj) {
                objS8 = new defpackage.lto(bysVarM4, 12);
                bwcVar.ad(objS8);
            }
            defpackage.epv.g(bool2, null, (defpackage.affc) objS8, bveVarC, 0);
            if (zC) {
                bveVarC.v(1182697544);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(byjVar.e());
                boolean zE = bveVarC.E(map) | bveVarC.C(bwxVar3);
                java.lang.Object objS9 = bwcVar.S();
                if (zE || objS9 == obj) {
                    objS9 = new defpackage.nib(byjVar, map, bwxVar3, null);
                    bwcVar.ad(objS9);
                }
                defpackage.bvx.g(numValueOf, (defpackage.affg) objS9, bveVarC);
                bwcVar.Y(false);
            } else {
                bveVarC.v(1183220328);
                bwcVar.Y(false);
            }
            final defpackage.nkp nkpVar4 = nkpVar3;
            defpackage.affg affgVar = new defpackage.affg() { // from class: nho
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    int i5 = iIntValue & 3;
                    int i6 = iIntValue & 1;
                    defpackage.yqm yqmVar2 = defpackage.nif.a;
                    if (bveVar3.I(i5 != 2, i6)) {
                        final defpackage.obg obgVar4 = obgVar3;
                        final defpackage.bwx bwxVar4 = bwxVar3;
                        final defpackage.nkj nkjVar2 = nkjVar;
                        final defpackage.ask askVar2 = askVar;
                        final defpackage.affc affcVar2 = affcVar;
                        final defpackage.bys bysVar2 = bysVarM;
                        final defpackage.non nonVar5 = nonVar3;
                        final boolean z2 = zJ;
                        final defpackage.bwx bwxVar5 = bwxVar;
                        final defpackage.bys bysVar3 = bysVar;
                        final defpackage.bys bysVar4 = bysVarM2;
                        final defpackage.bys bysVar5 = bysVarM3;
                        final defpackage.nkp nkpVar5 = nkpVar4;
                        final java.util.Map map2 = map;
                        final defpackage.bwx bwxVar6 = bwxVar2;
                        final defpackage.qsh qshVar2 = qshVar;
                        final defpackage.byj byjVar2 = byjVar;
                        final defpackage.nkl nklVar5 = nklVar4;
                        final boolean z3 = zC;
                        final boolean z4 = z;
                        defpackage.ca.at(defpackage.awj.c(defpackage.cgf.e, 1.0f), defpackage.cfs.e, defpackage.dai.as(1707082604, true, new defpackage.affh() { // from class: nhk
                            /* JADX WARN: Code duplicated, block: B:21:0x004c  */
                            /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
                            @Override // defpackage.affh
                            public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                                final boolean z5;
                                boolean z6;
                                float f;
                                defpackage.cgf cgfVarF;
                                defpackage.cgf cgfVarA;
                                float f2;
                                defpackage.nkl nklVar6;
                                defpackage.att attVar = (defpackage.att) obj4;
                                defpackage.bve bveVar4 = (defpackage.bve) obj5;
                                int iIntValue2 = ((java.lang.Integer) obj6).intValue();
                                defpackage.yqm yqmVar3 = defpackage.nif.a;
                                attVar.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= true != bveVar4.C(attVar) ? 2 : 4;
                                }
                                if (bveVar4.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                                    final boolean z7 = z4;
                                    if (z7) {
                                        float fD = attVar.d();
                                        defpackage.ksk kskVar = defpackage.nmr.a;
                                        if (defpackage.dlr.a(fD, 1600.0f) >= 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                    } else {
                                        z5 = true;
                                    }
                                    final defpackage.byj byjVar3 = byjVar2;
                                    if (z3) {
                                        bveVar4.v(-1009676876);
                                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z5);
                                        boolean zD = bveVar4.D(z5);
                                        java.lang.Object objG = bveVar4.g();
                                        if (zD || objG == defpackage.bvd.a) {
                                            objG = new defpackage.nic(z5, byjVar3, (defpackage.afdk) null, 0);
                                            bveVar4.x(objG);
                                        }
                                        defpackage.bvx.g(boolValueOf, (defpackage.affg) objG, bveVar4);
                                        bveVar4.o();
                                    } else {
                                        bveVar4.v(-1009521194);
                                        bveVar4.o();
                                    }
                                    defpackage.nkl nklVar7 = nklVar5;
                                    defpackage.bys bysVarM6 = defpackage.bxi.m(nklVar7.b, null, bveVar4);
                                    defpackage.bys bysVarM7 = defpackage.bxi.m(nklVar7.c, null, bveVar4);
                                    java.util.List list = (java.util.List) bysVarM6.a();
                                    if (list == null) {
                                        list = defpackage.afce.a;
                                    }
                                    if (list.isEmpty()) {
                                        java.util.List list2 = (java.util.List) bysVarM7.a();
                                        if (list2 == null) {
                                            list2 = defpackage.afce.a;
                                        }
                                        if (list2.isEmpty()) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                    } else {
                                        z6 = false;
                                    }
                                    java.lang.Object objG2 = bveVar4.g();
                                    java.lang.Object obj7 = defpackage.bvd.a;
                                    if (objG2 == obj7) {
                                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                                        bveVar4.x(parcelableSnapshotMutableState2);
                                        objG2 = parcelableSnapshotMutableState2;
                                    }
                                    defpackage.bwx bwxVar7 = (defpackage.bwx) objG2;
                                    java.lang.Object objG3 = bveVar4.g();
                                    if (objG3 == obj7) {
                                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                                        bveVar4.x(parcelableSnapshotMutableState3);
                                        objG3 = parcelableSnapshotMutableState3;
                                    }
                                    defpackage.bwx bwxVar8 = (defpackage.bwx) objG3;
                                    java.lang.Object objG4 = bveVar4.g();
                                    if (objG4 == obj7) {
                                        defpackage.bxn bxnVar = new defpackage.bxn(bwxVar7, bwxVar8, 15);
                                        defpackage.lam lamVar2 = defpackage.byp.a;
                                        defpackage.bvr bvrVar2 = new defpackage.bvr(bxnVar, null);
                                        bveVar4.x(bvrVar2);
                                        objG4 = bvrVar2;
                                    }
                                    defpackage.bys bysVar6 = (defpackage.bys) objG4;
                                    if (z7) {
                                        bveVar4.v(-1008905131);
                                        java.lang.Boolean bool3 = (java.lang.Boolean) bysVar6.a();
                                        bool3.booleanValue();
                                        java.lang.Object objG5 = bveVar4.g();
                                        if (objG5 == obj7) {
                                            objG5 = new defpackage.oqn(bysVar6, (defpackage.afdk) null, 1);
                                            bveVar4.x(objG5);
                                        }
                                        defpackage.bvx.g(bool3, (defpackage.affg) objG5, bveVar4);
                                        bveVar4.o();
                                    } else {
                                        z5 = z5;
                                        bveVar4.v(-1008750410);
                                        bveVar4.o();
                                    }
                                    defpackage.dlz dlzVar = defpackage.dlz.a;
                                    defpackage.bcr bcrVar = defpackage.bcw.a;
                                    defpackage.bct bctVar = new defpackage.bct(80.0f);
                                    final defpackage.bcr bcrVar2 = new defpackage.bcr(bctVar, bctVar, bctVar, bctVar);
                                    java.lang.Object objG6 = bveVar4.g();
                                    if (objG6 == obj7) {
                                        objG6 = java.lang.Boolean.valueOf(defpackage.lee.a.a().c(qshVar2));
                                        bveVar4.x(objG6);
                                    }
                                    final boolean zBooleanValue = ((java.lang.Boolean) objG6).booleanValue();
                                    if (z7) {
                                        defpackage.ktf ktfVar = nmt.a;
                                        f = 27.0f;
                                    } else {
                                        defpackage.ksk kskVar2 = defpackage.nmr.a;
                                        f = defpackage.nmr.c;
                                    }
                                    defpackage.cfu cfuVar = defpackage.cfs.e;
                                    defpackage.cgc cgcVar = defpackage.cgf.e;
                                    defpackage.cty ctyVarB = defpackage.atp.b(cfuVar, false);
                                    long jB = bveVar4.b();
                                    long j = jB ^ (jB >>> 32);
                                    defpackage.cdd cddVarN = bveVar4.N();
                                    final boolean z8 = z6;
                                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar4, cgcVar);
                                    defpackage.afer aferVar = defpackage.cwl.a;
                                    bveVar4.M();
                                    bveVar4.w();
                                    if (bveVar4.G()) {
                                        bveVar4.j(aferVar);
                                    } else {
                                        bveVar4.y();
                                    }
                                    defpackage.affg affgVar2 = defpackage.cwl.e;
                                    defpackage.byw.c(bveVar4, ctyVarB, affgVar2);
                                    defpackage.affg affgVar3 = defpackage.cwl.d;
                                    defpackage.byw.c(bveVar4, cddVarN, affgVar3);
                                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf((int) j);
                                    defpackage.affg affgVar4 = defpackage.cwl.f;
                                    defpackage.byw.c(bveVar4, numValueOf2, affgVar4);
                                    defpackage.affc affcVar3 = defpackage.cwl.g;
                                    defpackage.afbk afbkVar = defpackage.afbk.a;
                                    bveVar4.i(afbkVar, new defpackage.amc(affcVar3, 16));
                                    defpackage.affg affgVar5 = defpackage.cwl.c;
                                    defpackage.byw.c(bveVar4, cgfVarN, affgVar5);
                                    defpackage.ats atsVar = defpackage.ats.a;
                                    if (zBooleanValue) {
                                        bveVar4.v(-669693771);
                                        float f3 = defpackage.gjr.P1.k;
                                        cgfVarF = defpackage.awj.f(defpackage.kfp.j(new defpackage.avr(f3, f3, f3, f3), defpackage.nmr.a, bcrVar2), 80.0f).a(new defpackage.ajc(defpackage.kfp.i(bveVar4).a(), bcrVar2)).a(new defpackage.ajk(1.0f, new defpackage.clf(defpackage.kfp.i(bveVar4).z()), bcrVar2));
                                        bveVar4.o();
                                    } else {
                                        bveVar4.v(-669217952);
                                        bveVar4.o();
                                        cgfVarF = defpackage.awj.f(cgcVar, 80.0f);
                                    }
                                    if (zBooleanValue) {
                                        defpackage.ksk kskVar3 = defpackage.nmr.a;
                                        cgfVarA = defpackage.awj.n(cgfVarF, Float.NaN, 960.0f);
                                    } else {
                                        cgfVarA = cgfVarF.a(defpackage.awj.a);
                                    }
                                    final java.util.Map map3 = map2;
                                    final defpackage.bwx bwxVar9 = bwxVar6;
                                    boolean zC3 = bveVar4.C(bwxVar9) | bveVar4.E(map3);
                                    java.lang.Object objG7 = bveVar4.g();
                                    if (zC3 || objG7 == obj7) {
                                        objG7 = new defpackage.err(bwxVar9, map3, 11, (byte[]) null);
                                        bveVar4.x(objG7);
                                    }
                                    defpackage.cgf cgfVarA2 = defpackage.bzd.r(cgfVarA, (defpackage.affc) objG7).a(defpackage.ajw.a);
                                    defpackage.cty ctyVarA = defpackage.awb.a(z8 ? defpackage.ati.e : defpackage.ati.f, defpackage.cfs.n, bveVar4, 48);
                                    long jB2 = bveVar4.b();
                                    long j2 = jB2 ^ (jB2 >>> 32);
                                    defpackage.cdd cddVarN2 = bveVar4.N();
                                    defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVar4, cgfVarA2);
                                    bveVar4.M();
                                    bveVar4.w();
                                    if (bveVar4.G()) {
                                        bveVar4.j(aferVar);
                                    } else {
                                        bveVar4.y();
                                    }
                                    defpackage.byw.c(bveVar4, ctyVarA, affgVar2);
                                    defpackage.byw.c(bveVar4, cddVarN2, affgVar3);
                                    defpackage.byw.c(bveVar4, java.lang.Integer.valueOf((int) j2), affgVar4);
                                    bveVar4.i(afbkVar, new defpackage.amc(affcVar3, 16));
                                    defpackage.byw.c(bveVar4, cgfVarN2, affgVar5);
                                    final defpackage.awe aweVar = defpackage.awe.a;
                                    if (z8) {
                                        map3 = map3;
                                        f2 = f;
                                        nklVar6 = nklVar7;
                                        bveVar4.v(1886430048);
                                        bveVar4.o();
                                    } else {
                                        bveVar4.v(1885977417);
                                        java.util.List list3 = (java.util.List) bysVarM6.a();
                                        if (list3 == null) {
                                            list3 = defpackage.afce.a;
                                        }
                                        defpackage.cft cftVar = defpackage.cfs.j;
                                        f2 = f;
                                        defpackage.cgf cgfVarA3 = aweVar.b(cgcVar, 1.0f, true).a(new defpackage.avr(f2, 0.0f, 0.0f, 0.0f)).a(new defpackage.dci("leftControls"));
                                        nklVar6 = nklVar7;
                                        long j3 = nklVar6.f;
                                        boolean zC4 = bveVar4.C(bysVarM6);
                                        java.lang.Object objG8 = bveVar4.g();
                                        if (zC4 || objG8 == obj7) {
                                            objG8 = new defpackage.lyi(bysVarM6, bwxVar7, 18);
                                            bveVar4.x(objG8);
                                        }
                                        defpackage.nif.g(list3, cftVar, cgfVarA3.a(new defpackage.cur(j3, (defpackage.affc) objG8)), bveVar4, 48);
                                        bveVar4.o();
                                    }
                                    final defpackage.obg obgVar5 = obgVar4;
                                    final defpackage.bwx bwxVar10 = bwxVar4;
                                    final defpackage.nkj nkjVar3 = nkjVar2;
                                    final defpackage.ask askVar3 = askVar2;
                                    final defpackage.affc affcVar4 = affcVar2;
                                    final defpackage.bys bysVar7 = bysVar2;
                                    final defpackage.non nonVar6 = nonVar5;
                                    final boolean z9 = z2;
                                    final defpackage.bwx bwxVar11 = bwxVar5;
                                    final defpackage.bys bysVar8 = bysVar3;
                                    final defpackage.bys bysVar9 = bysVar4;
                                    final float f4 = f2;
                                    final defpackage.bys bysVar10 = bysVar5;
                                    final defpackage.nkp nkpVar6 = nkpVar5;
                                    defpackage.bxk bxkVarB = defpackage.dbl.i.b(dlzVar);
                                    defpackage.nkl nklVar8 = nklVar6;
                                    defpackage.dai.aA(bxkVarB, defpackage.dai.as(-653785726, true, new defpackage.affg() { // from class: nhx
                                        @Override // defpackage.affg
                                        public final java.lang.Object invoke(java.lang.Object obj8, java.lang.Object obj9) {
                                            defpackage.avr avrVar;
                                            defpackage.ate ateVar;
                                            defpackage.bve bveVar5;
                                            boolean z10;
                                            final boolean z11;
                                            defpackage.nkp nkpVar7;
                                            boolean z12;
                                            defpackage.bve bveVar6 = (defpackage.bve) obj8;
                                            int iIntValue3 = ((java.lang.Integer) obj9).intValue();
                                            int i7 = iIntValue3 & 3;
                                            int i8 = iIntValue3 & 1;
                                            defpackage.yqm yqmVar4 = defpackage.nif.a;
                                            if (bveVar6.I(i7 != 2, i8)) {
                                                final boolean z13 = z7;
                                                defpackage.cgf cgfVarU = z13 ? defpackage.awj.u(defpackage.cgf.e, null, 3) : defpackage.awj.a;
                                                final defpackage.bys bysVar11 = bysVar9;
                                                defpackage.bys bysVar12 = bysVar10;
                                                if (((java.lang.Boolean) bysVar12.a()).booleanValue() || !((java.lang.Boolean) bysVar11.a()).booleanValue()) {
                                                    cgfVarU = aweVar.b(cgfVarU, 1.0f, true);
                                                }
                                                defpackage.cty ctyVarB2 = defpackage.atp.b(defpackage.cfs.a, false);
                                                long jB3 = bveVar6.b();
                                                long j4 = jB3 ^ (jB3 >>> 32);
                                                defpackage.cdd cddVarN3 = bveVar6.N();
                                                defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVar6, cgfVarU);
                                                defpackage.afer aferVar2 = defpackage.cwl.a;
                                                bveVar6.M();
                                                bveVar6.w();
                                                if (bveVar6.G()) {
                                                    bveVar6.j(aferVar2);
                                                } else {
                                                    bveVar6.y();
                                                }
                                                float f5 = f4;
                                                boolean z14 = z8;
                                                defpackage.affg affgVar6 = defpackage.cwl.e;
                                                defpackage.byw.c(bveVar6, ctyVarB2, affgVar6);
                                                defpackage.affg affgVar7 = defpackage.cwl.d;
                                                defpackage.byw.c(bveVar6, cddVarN3, affgVar7);
                                                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf((int) j4);
                                                defpackage.affg affgVar8 = defpackage.cwl.f;
                                                defpackage.byw.c(bveVar6, numValueOf3, affgVar8);
                                                defpackage.affc affcVar5 = defpackage.cwl.g;
                                                defpackage.afbk afbkVar2 = defpackage.afbk.a;
                                                bveVar6.i(afbkVar2, new defpackage.amc(affcVar5, 16));
                                                defpackage.affg affgVar9 = defpackage.cwl.c;
                                                defpackage.byw.c(bveVar6, cgfVarN3, affgVar9);
                                                defpackage.ats atsVar2 = defpackage.ats.a;
                                                if (z14) {
                                                    avrVar = new defpackage.avr(f5, 0.0f, f5, 0.0f);
                                                } else {
                                                    float f6 = (f5 / 3.0f) + 0.0f;
                                                    avrVar = new defpackage.avr(f6, 0.0f, f6, 0.0f);
                                                }
                                                defpackage.cgf cgfVarAn = defpackage.dai.an(avrVar, true != ((java.lang.Boolean) bysVar11.a()).booleanValue() ? 0.0f : 1.0f);
                                                boolean zC5 = bveVar6.C(bysVar11);
                                                java.lang.Object objG9 = bveVar6.g();
                                                if (zC5 || objG9 == defpackage.bvd.a) {
                                                    objG9 = new defpackage.err(bysVar11, bysVar8, 9, (byte[]) null);
                                                    bveVar6.x(objG9);
                                                }
                                                final defpackage.bwx bwxVar12 = bwxVar11;
                                                defpackage.cgf cgfVarR = defpackage.bzd.r(cgfVarAn, (defpackage.affc) objG9);
                                                boolean zC6 = bveVar6.C(bysVar11);
                                                java.lang.Object objG10 = bveVar6.g();
                                                if (zC6 || objG10 == defpackage.bvd.a) {
                                                    objG10 = new defpackage.nid(bysVar11, bwxVar12, 0);
                                                    bveVar6.x(objG10);
                                                }
                                                defpackage.cqu cquVar = defpackage.crq.a;
                                                defpackage.cgf cgfVarA4 = cgfVarR.a(new defpackage.crp(afbkVar2, null, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objG10));
                                                defpackage.cfy cfyVar = defpackage.cfs.n;
                                                if (z13) {
                                                    defpackage.ktf ktfVar2 = nmt.a;
                                                    ateVar = new defpackage.ate(16.0f, true, new defpackage.asy());
                                                } else {
                                                    defpackage.ksk kskVar4 = defpackage.nmr.a;
                                                    ateVar = new defpackage.ate(10.0f, true, new defpackage.asy());
                                                }
                                                defpackage.cty ctyVarA2 = defpackage.awb.a(ateVar, cfyVar, bveVar6, 48);
                                                long jB4 = bveVar6.b();
                                                long j5 = jB4 ^ (jB4 >>> 32);
                                                defpackage.cdd cddVarN4 = bveVar6.N();
                                                defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVar6, cgfVarA4);
                                                bveVar6.M();
                                                bveVar6.w();
                                                if (bveVar6.G()) {
                                                    bveVar6.j(aferVar2);
                                                } else {
                                                    bveVar6.y();
                                                }
                                                final defpackage.bys bysVar13 = bysVar7;
                                                final boolean z15 = z9;
                                                final boolean z16 = zBooleanValue;
                                                final defpackage.nkp nkpVar8 = nkpVar6;
                                                defpackage.byw.c(bveVar6, ctyVarA2, affgVar6);
                                                defpackage.byw.c(bveVar6, cddVarN4, affgVar7);
                                                defpackage.byw.c(bveVar6, java.lang.Integer.valueOf((int) j5), affgVar8);
                                                bveVar6.i(afbkVar2, new defpackage.amc(affcVar5, 16));
                                                defpackage.byw.c(bveVar6, cgfVarN4, affgVar9);
                                                final defpackage.awe aweVar2 = defpackage.awe.a;
                                                if (((java.lang.Boolean) bysVar12.a()).booleanValue()) {
                                                    bveVar6.v(-1423376689);
                                                    boolean zBooleanValue2 = ((java.lang.Boolean) bysVar13.a()).booleanValue();
                                                    defpackage.yqm yqmVar5 = defpackage.nkp.a;
                                                    bveVar5 = bveVar6;
                                                    z10 = false;
                                                    defpackage.ebq.j(nkpVar8, true, z16, null, z15, zBooleanValue2, bveVar5, 440, 8);
                                                    z11 = z16;
                                                    bveVar5.o();
                                                    nkpVar7 = nkpVar8;
                                                } else {
                                                    bveVar5 = bveVar6;
                                                    z10 = false;
                                                    defpackage.non nonVar7 = nonVar6;
                                                    bveVar5.v(-1422903195);
                                                    final defpackage.bys bysVarM8 = defpackage.bxi.m(nonVar7.k, defpackage.nod.a, bveVar5);
                                                    java.lang.Object objG11 = bveVar5.g();
                                                    java.lang.Object obj10 = defpackage.bvd.a;
                                                    if (objG11 == obj10) {
                                                        defpackage.djm djmVar2 = new defpackage.djm(bysVarM8, 15);
                                                        defpackage.lam lamVar3 = defpackage.byp.a;
                                                        defpackage.bvr bvrVar3 = new defpackage.bvr(djmVar2, null);
                                                        bveVar5.x(bvrVar3);
                                                        objG11 = bvrVar3;
                                                    }
                                                    final defpackage.bys bysVar14 = (defpackage.bys) objG11;
                                                    java.lang.Object objG12 = bveVar5.g();
                                                    if (objG12 == obj10) {
                                                        objG12 = new defpackage.cit();
                                                        bveVar5.x(objG12);
                                                    }
                                                    final defpackage.cit citVar = (defpackage.cit) objG12;
                                                    java.lang.Object objG13 = bveVar5.g();
                                                    if (objG13 == obj10) {
                                                        objG13 = new defpackage.cit();
                                                        bveVar5.x(objG13);
                                                    }
                                                    final defpackage.cit citVar2 = (defpackage.cit) objG13;
                                                    java.lang.Object objG14 = bveVar5.g();
                                                    if (objG14 == obj10) {
                                                        objG14 = new defpackage.cit();
                                                        bveVar5.x(objG14);
                                                    }
                                                    final defpackage.cit citVar3 = (defpackage.cit) objG14;
                                                    java.lang.Object objG15 = bveVar5.g();
                                                    if (objG15 == obj10) {
                                                        objG15 = new defpackage.cit();
                                                        bveVar5.x(objG15);
                                                    }
                                                    final defpackage.obg obgVar6 = obgVar5;
                                                    final defpackage.bwx bwxVar13 = bwxVar10;
                                                    final defpackage.byj byjVar4 = byjVar3;
                                                    final boolean z17 = z5;
                                                    final defpackage.nkj nkjVar4 = nkjVar3;
                                                    final defpackage.bwx bwxVar14 = bwxVar9;
                                                    final java.util.Map map4 = map3;
                                                    final defpackage.ask askVar4 = askVar3;
                                                    final defpackage.affc affcVar6 = affcVar4;
                                                    final defpackage.cit citVar4 = (defpackage.cit) objG15;
                                                    final defpackage.bys bysVarM9 = defpackage.bxi.m(nkpVar8.d, java.lang.Boolean.TRUE, bveVar5);
                                                    defpackage.ccz cczVarAs = defpackage.dai.as(633949153, true, new defpackage.affg() { // from class: nhf
                                                        @Override // defpackage.affg
                                                        public final java.lang.Object invoke(java.lang.Object obj11, java.lang.Object obj12) {
                                                            defpackage.atb ateVar2;
                                                            defpackage.bve bveVar7 = (defpackage.bve) obj11;
                                                            int iIntValue4 = ((java.lang.Integer) obj12).intValue();
                                                            int i9 = iIntValue4 & 3;
                                                            int i10 = iIntValue4 & 1;
                                                            defpackage.yqm yqmVar6 = defpackage.nif.a;
                                                            if (bveVar7.I(i9 != 2, i10)) {
                                                                boolean z18 = z13;
                                                                defpackage.cgf cgfVarB = z18 ? defpackage.cgf.e : aweVar2.b(defpackage.cgf.e, 0.5f, true);
                                                                boolean z19 = z15;
                                                                if (z18) {
                                                                    defpackage.ktf ktfVar3 = nmt.a;
                                                                    ateVar2 = new defpackage.ate(16.0f, true, new defpackage.asy());
                                                                } else {
                                                                    ateVar2 = z19 ? defpackage.ati.b : defpackage.ati.a;
                                                                }
                                                                defpackage.bys bysVar15 = bysVar14;
                                                                boolean zBooleanValue3 = ((java.lang.Boolean) bysVarM9.a()).booleanValue();
                                                                boolean zBooleanValue4 = ((java.lang.Boolean) bysVar15.a()).booleanValue();
                                                                java.lang.Object objG16 = bveVar7.g();
                                                                if (objG16 == defpackage.bvd.a) {
                                                                    defpackage.lto ltoVar = new defpackage.lto(bwxVar12, 14);
                                                                    bveVar7.x(ltoVar);
                                                                    objG16 = ltoVar;
                                                                }
                                                                defpackage.bys bysVar16 = bysVar13;
                                                                defpackage.bwx bwxVar15 = bwxVar14;
                                                                java.util.Map map5 = map4;
                                                                defpackage.ask askVar5 = askVar4;
                                                                defpackage.affc affcVar7 = affcVar6;
                                                                defpackage.cit citVar5 = citVar;
                                                                defpackage.cit citVar6 = citVar3;
                                                                java.lang.Object obj13 = objG16;
                                                                boolean z20 = z16;
                                                                boolean zBooleanValue5 = ((java.lang.Boolean) bysVar16.a()).booleanValue();
                                                                defpackage.yqm yqmVar7 = defpackage.nkp.a;
                                                                defpackage.nif.h(cgfVarB, ateVar2, nkpVar8, z19, zBooleanValue3, zBooleanValue4, z20, citVar6, citVar5, affcVar7, askVar5, (defpackage.affc) obj13, map5, bwxVar15, zBooleanValue5, bveVar7, 114819584, 54);
                                                            } else {
                                                                bveVar7.s();
                                                            }
                                                            return defpackage.afbk.a;
                                                        }
                                                    }, bveVar5);
                                                    defpackage.ccz cczVarAs2 = defpackage.dai.as(814592403, true, new defpackage.affg() { // from class: nhg
                                                        @Override // defpackage.affg
                                                        public final java.lang.Object invoke(java.lang.Object obj11, java.lang.Object obj12) {
                                                            defpackage.bve bveVar7 = (defpackage.bve) obj11;
                                                            int iIntValue4 = ((java.lang.Integer) obj12).intValue();
                                                            int i9 = iIntValue4 & 3;
                                                            int i10 = iIntValue4 & 1;
                                                            defpackage.yqm yqmVar6 = defpackage.nif.a;
                                                            if (bveVar7.I(i9 != 2, i10)) {
                                                                boolean z18 = z13;
                                                                defpackage.cgf cgfVarB = z18 ? defpackage.cgf.e : aweVar2.b(defpackage.cgf.e, 1.0f, false);
                                                                defpackage.bys bysVar15 = bysVarM8;
                                                                defpackage.bys bysVar16 = bysVar11;
                                                                boolean zBooleanValue3 = ((java.lang.Boolean) bysVar14.a()).booleanValue();
                                                                boolean zBooleanValue4 = ((java.lang.Boolean) bysVar16.a()).booleanValue();
                                                                defpackage.nod nodVar = (defpackage.nod) bysVar15.a();
                                                                java.lang.Object objG16 = bveVar7.g();
                                                                if (objG16 == defpackage.bvd.a) {
                                                                    defpackage.djm djmVar3 = new defpackage.djm(byjVar4, 16);
                                                                    bveVar7.x(djmVar3);
                                                                    objG16 = djmVar3;
                                                                }
                                                                defpackage.bys bysVar17 = bysVar13;
                                                                defpackage.bwx bwxVar15 = bwxVar13;
                                                                boolean z19 = z15;
                                                                defpackage.bwx bwxVar16 = bwxVar14;
                                                                java.util.Map map5 = map4;
                                                                defpackage.cit citVar5 = citVar2;
                                                                defpackage.cit citVar6 = citVar;
                                                                defpackage.cit citVar7 = citVar3;
                                                                defpackage.affc affcVar7 = affcVar6;
                                                                boolean z20 = z17;
                                                                defpackage.nkj nkjVar5 = nkjVar4;
                                                                boolean z21 = !((java.lang.Boolean) bwxVar15.a()).booleanValue();
                                                                boolean zBooleanValue5 = ((java.lang.Boolean) bysVar17.a()).booleanValue();
                                                                defpackage.yqm yqmVar7 = defpackage.nkp.a;
                                                                defpackage.nod nodVar2 = defpackage.nod.a;
                                                                defpackage.nif.f(cgfVarB, z18, zBooleanValue3, nkpVar8, nkjVar5, zBooleanValue4, z20, affcVar7, nodVar, citVar7, citVar6, citVar5, map5, bwxVar16, (defpackage.afer) objG16, z21, z19, zBooleanValue5, bveVar7, 939560960, 24630);
                                                            } else {
                                                                bveVar7.s();
                                                            }
                                                            return defpackage.afbk.a;
                                                        }
                                                    }, bveVar5);
                                                    z11 = z16;
                                                    nkpVar7 = nkpVar8;
                                                    defpackage.ccz cczVarAs3 = defpackage.dai.as(-1617432546, true, new defpackage.affg() { // from class: nhh
                                                        @Override // defpackage.affg
                                                        public final java.lang.Object invoke(java.lang.Object obj11, java.lang.Object obj12) {
                                                            defpackage.bve bveVar7 = (defpackage.bve) obj11;
                                                            int iIntValue4 = ((java.lang.Integer) obj12).intValue();
                                                            int i9 = iIntValue4 & 3;
                                                            int i10 = iIntValue4 & 1;
                                                            defpackage.yqm yqmVar6 = defpackage.nif.a;
                                                            if (bveVar7.I(i9 != 2, i10)) {
                                                                boolean z18 = z13;
                                                                defpackage.cgf cgfVarB = z18 ? defpackage.cgf.e : aweVar2.b(defpackage.cgf.e, 0.5f, true);
                                                                defpackage.bys bysVar15 = bysVar13;
                                                                defpackage.bys bysVar16 = bysVar14;
                                                                defpackage.obg obgVar7 = obgVar6;
                                                                defpackage.bwx bwxVar15 = bwxVar14;
                                                                java.util.Map map5 = map4;
                                                                defpackage.nkp nkpVar9 = nkpVar8;
                                                                defpackage.ask askVar5 = askVar4;
                                                                defpackage.affc affcVar7 = affcVar6;
                                                                defpackage.cit citVar5 = citVar2;
                                                                defpackage.cit citVar6 = citVar4;
                                                                boolean z19 = z11;
                                                                boolean z20 = z15;
                                                                boolean zBooleanValue3 = ((java.lang.Boolean) bysVar16.a()).booleanValue();
                                                                boolean zBooleanValue4 = ((java.lang.Boolean) bysVar15.a()).booleanValue();
                                                                defpackage.yqm yqmVar7 = defpackage.nkp.a;
                                                                defpackage.yhx yhxVar = defpackage.obg.a;
                                                                defpackage.nif.j(cgfVarB, z18, z20, zBooleanValue3, z19, citVar6, citVar5, affcVar7, askVar5, nkpVar9, map5, bwxVar15, obgVar7, zBooleanValue4, bveVar7, 1176199168, 512);
                                                            } else {
                                                                bveVar7.s();
                                                            }
                                                            return defpackage.afbk.a;
                                                        }
                                                    }, bveVar5);
                                                    if (z15) {
                                                        bveVar5.v(-1418045867);
                                                        cczVarAs3.invoke(bveVar5, 6);
                                                        cczVarAs2.invoke(bveVar5, 6);
                                                        cczVarAs.invoke(bveVar5, 6);
                                                        bveVar5.o();
                                                    } else {
                                                        bveVar5.v(-1417923851);
                                                        cczVarAs.invoke(bveVar5, 6);
                                                        cczVarAs2.invoke(bveVar5, 6);
                                                        cczVarAs3.invoke(bveVar5, 6);
                                                        bveVar5.o();
                                                    }
                                                    bveVar5.o();
                                                }
                                                bveVar5.n();
                                                if (nkpVar7.q()) {
                                                    if (z14 || z11) {
                                                        bveVar5.v(1580663558);
                                                        bveVar5.o();
                                                    } else {
                                                        z12 = z10;
                                                    }
                                                    bveVar5.n();
                                                } else {
                                                    z12 = z11;
                                                }
                                                defpackage.bcr bcrVar3 = bcrVar2;
                                                bveVar5.v(1580472319);
                                                defpackage.nif.d(atsVar2, nkpVar7, z12, bcrVar3, bveVar5, 454);
                                                bveVar5.o();
                                                bveVar5.n();
                                            } else {
                                                bveVar6.s();
                                            }
                                            return defpackage.afbk.a;
                                        }
                                    }, bveVar4), bveVar4, 56);
                                    if (z8) {
                                        bveVar4.v(1895747904);
                                        bveVar4.o();
                                    } else {
                                        bveVar4.v(1895295273);
                                        java.util.List list4 = (java.util.List) bysVarM7.a();
                                        if (list4 == null) {
                                            list4 = defpackage.afce.a;
                                        }
                                        defpackage.cft cftVar2 = defpackage.cfs.l;
                                        defpackage.cgf cgfVarA4 = aweVar.b(cgcVar, 1.0f, true).a(new defpackage.avr(0.0f, 0.0f, f4, 0.0f)).a(new defpackage.dci("rightControls"));
                                        long j4 = nklVar8.f;
                                        boolean zC5 = bveVar4.C(bysVarM7);
                                        java.lang.Object objG9 = bveVar4.g();
                                        if (zC5 || objG9 == obj7) {
                                            objG9 = new defpackage.lyi(bysVarM7, bwxVar8, 19);
                                            bveVar4.x(objG9);
                                        }
                                        defpackage.nif.g(list4, cftVar2, cgfVarA4.a(new defpackage.cur(j4, (defpackage.affc) objG9)), bveVar4, 48);
                                        bveVar4.o();
                                    }
                                    bveVar4.n();
                                    if (nkpVar6.q() && (z8 || zBooleanValue)) {
                                        bveVar4.v(-658129159);
                                        defpackage.nif.d(atsVar, nkpVar6, zBooleanValue, bcrVar2, bveVar4, 454);
                                        bveVar4.o();
                                    } else {
                                        bveVar4.v(-657972516);
                                        bveVar4.o();
                                    }
                                    bveVar4.n();
                                } else {
                                    bveVar4.s();
                                }
                                return defpackage.afbk.a;
                            }
                        }, bveVar3), bveVar3, 3126, 4);
                    } else {
                        bveVar3.s();
                    }
                    return defpackage.afbk.a;
                }
            };
            bveVar2 = bveVarC;
            defpackage.ksz.a(null, null, false, null, defpackage.dai.as(-617664254, true, affgVar, bveVar2), bveVar2, 24576, 15);
            nklVar2 = nklVar4;
            nonVar2 = nonVar3;
            obgVar2 = obgVar3;
            nkpVar2 = nkpVar3;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            nkpVar2 = nkpVar;
            nklVar2 = nklVar;
            nonVar2 = nonVar;
            obgVar2 = obgVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.ccy(nkjVar, qshVar, nkpVar2, nklVar2, nonVar2, obgVar2, affcVar, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x0330 A[LOOP:0: B:167:0x027d->B:196:0x0330, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0340 A[EDGE_INSN: B:206:0x0340->B:198:0x0340 BREAK  A[LOOP:0: B:167:0x027d->B:196:0x0330], SYNTHETIC] */
    public static final void l(defpackage.nkp nkpVar, defpackage.nkj nkjVar, boolean z, boolean z2, defpackage.lhe lheVar, defpackage.cgf cgfVar, java.util.Map map, defpackage.bwx bwxVar, defpackage.afer aferVar, boolean z3, boolean z4, boolean z5, defpackage.bve bveVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        defpackage.bve bveVar2;
        float f;
        boolean z6;
        int i6;
        boolean z7;
        boolean z8;
        defpackage.ask askVar;
        int i7 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1471642612);
        if (i7 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i4 = 32;
            i3 |= true != ((i & 64) == 0 ? bveVarC.C(nkjVar) : bveVarC.E(nkjVar)) ? 16 : 32;
        } else {
            i4 = 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.D(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != ((32768 & i) == 0 ? bveVarC.C(lheVar) : bveVarC.E(lheVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != ((2097152 & i) == 0 ? bveVarC.C(map) : bveVarC.E(map)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != bveVarC.C(bwxVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != bveVarC.E(aferVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != bveVarC.D(z3) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != bveVarC.D(z4) ? 2 : 4);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != bveVarC.D(z5) ? 16 : i4;
        }
        if (bveVarC.I(((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i3 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.asl();
                bwcVar.ad(objS);
            }
            boolean z9 = nkpVar.o;
            int i8 = i3 & 896;
            defpackage.ask askVar2 = (defpackage.ask) objS;
            int i9 = i3;
            java.lang.Object objS2 = bwcVar.S();
            if (i8 == 256 || objS2 == obj) {
                objS2 = new defpackage.nmx(z, 1);
                bwcVar.ad(objS2);
            }
            defpackage.cgf cgfVarA = cgfVar.a(new defpackage.cjy((defpackage.affc) objS2));
            defpackage.cfy cfyVar = defpackage.cfs.n;
            if (z9) {
                defpackage.ktf ktfVar = nmt.a;
                f = 16.0f;
            } else {
                defpackage.ksk kskVar = defpackage.nmr.a;
                f = 10.0f;
            }
            defpackage.cty ctyVarA = defpackage.awb.a(new defpackage.ate(f, true, new defpackage.asy()), cfyVar, bveVarC, 48);
            long j = bwcVar.u;
            long j2 = j ^ (j >>> i4);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarA);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            if (z) {
                bveVarC.v(-2098515832);
                int i10 = true != z2 ? 3 : 4;
                boolean zA = ((i9 & 14) == 4 || ((i9 & 8) != 0 && bveVarC.C(nkpVar))) | ((i9 & 112) == i4 || ((i9 & 64) != 0 && bveVarC.C(nkjVar))) | bveVarC.A(i10);
                java.lang.Object objS3 = bwcVar.S();
                if (zA || objS3 == obj) {
                    i6 = 0;
                    objS3 = nkpVar.f(false, i10, nkjVar);
                    bwcVar.ad(objS3);
                } else {
                    i6 = 0;
                }
                defpackage.bys bysVarM = defpackage.bxi.m((defpackage.eqp) objS3, defpackage.afce.a, bveVarC);
                defpackage.nje[] njeVarArr = new defpackage.nje[4];
                njeVarArr[i6] = defpackage.nje.e;
                njeVarArr[1] = defpackage.nje.f;
                njeVarArr[2] = defpackage.nje.g;
                njeVarArr[3] = defpackage.nje.h;
                java.util.List listAc = defpackage.afga.ac(njeVarArr);
                defpackage.afhy afiaVar = new defpackage.afia(i6, i10 - 1);
                if (z4) {
                    afiaVar = new defpackage.afhy(afiaVar.b, afiaVar.a, -afiaVar.c);
                }
                int i11 = afiaVar.b;
                int i12 = afiaVar.a;
                int i13 = afiaVar.c;
                if ((i13 > 0 && i12 <= i11) || (i13 < 0 && i11 <= i12)) {
                    while (true) {
                        defpackage.nne nneVar = (defpackage.nne) defpackage.afga.aC((java.util.List) bysVarM.a(), i12);
                        defpackage.nje njeVar = (defpackage.nje) defpackage.afga.aC(listAc, i12);
                        if (njeVar == null) {
                            njeVar = defpackage.nje.a;
                        }
                        defpackage.nje njeVar2 = njeVar;
                        java.lang.Object obj2 = map.get(njeVar2);
                        obj2.getClass();
                        defpackage.cgf ciuVar = new defpackage.ciu((defpackage.cit) obj2);
                        boolean zA2 = bveVarC.A(i12) | ((i9 & 29360128) == 8388608) | bveVarC.A(njeVar2.ordinal());
                        java.lang.Object objS4 = bwcVar.S();
                        if (zA2 || objS4 == obj) {
                            objS4 = new defpackage.fom(i12, bwxVar, njeVar2, 3);
                            bwcVar.ad(objS4);
                        }
                        defpackage.chx chxVar = new defpackage.chx((defpackage.affc) objS4);
                        if (chxVar != defpackage.cgf.e) {
                            ciuVar = new defpackage.cga(ciuVar, chxVar);
                        }
                        if (i12 == 3) {
                            ciuVar = defpackage.omf.x(ciuVar, lheVar, askVar2);
                            i12 = 3;
                        }
                        if (z5) {
                            if (nneVar != null) {
                                z7 = true;
                                if (nneVar.e) {
                                }
                                defpackage.cgf cgfVar2 = ciuVar;
                                z6 = z7;
                                askVar = askVar2;
                                defpackage.bve bveVar3 = bveVarC;
                                boolean z10 = z9;
                                defpackage.kfn.j(cgfVar2, nneVar, z10, false, aferVar, false, z3, null, z8, bveVar3, ((i9 >> 12) & 57344) | 3136 | ((i9 >> 9) & 3670016), 160);
                                z9 = z10;
                                bveVar2 = bveVar3;
                                if (i12 == i11) {
                                    break;
                                }
                                i12 += i13;
                                askVar2 = askVar;
                                bveVarC = bveVar2;
                            } else {
                                z7 = true;
                            }
                            z8 = z7;
                            defpackage.cgf cgfVar3 = ciuVar;
                            z6 = z7;
                            askVar = askVar2;
                            defpackage.bve bveVar4 = bveVarC;
                            boolean z11 = z9;
                            defpackage.kfn.j(cgfVar3, nneVar, z11, false, aferVar, false, z3, null, z8, bveVar4, ((i9 >> 12) & 57344) | 3136 | ((i9 >> 9) & 3670016), 160);
                            z9 = z11;
                            bveVar2 = bveVar4;
                            if (i12 == i11) {
                                break;
                                break;
                            } else {
                                i12 += i13;
                                askVar2 = askVar;
                                bveVarC = bveVar2;
                            }
                        } else {
                            z7 = true;
                        }
                        z8 = false;
                        defpackage.cgf cgfVar4 = ciuVar;
                        z6 = z7;
                        askVar = askVar2;
                        defpackage.bve bveVar5 = bveVarC;
                        boolean z12 = z9;
                        defpackage.kfn.j(cgfVar4, nneVar, z12, false, aferVar, false, z3, null, z8, bveVar5, ((i9 >> 12) & 57344) | 3136 | ((i9 >> 9) & 3670016), 160);
                        z9 = z12;
                        bveVar2 = bveVar5;
                        if (i12 == i11) {
                            break;
                            break;
                        } else {
                            i12 += i13;
                            askVar2 = askVar;
                            bveVarC = bveVar2;
                        }
                    }
                } else {
                    bveVar2 = bveVarC;
                    z6 = true;
                }
                bwcVar.Y(false);
            } else {
                bveVar2 = bveVarC;
                z6 = true;
                bveVar2.v(-2096837926);
                bwcVar.Y(false);
            }
            bwcVar.Y(z6);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nhm(nkpVar, nkjVar, z, z2, lheVar, cgfVar, map, bwxVar, aferVar, z3, z4, z5, i, i2, 0);
        }
    }

    public static final void m(final defpackage.nkp nkpVar, final defpackage.nkj nkjVar, boolean z, boolean z2, final defpackage.lhe lheVar, defpackage.cgf cgfVar, final java.util.Map map, defpackage.bwx bwxVar, defpackage.afer aferVar, boolean z3, final boolean z4, final boolean z5, defpackage.bve bveVar, int i, int i2) {
        int i3;
        boolean z6;
        boolean z7;
        defpackage.bwx bwxVar2;
        defpackage.afer aferVar2;
        final boolean z8;
        int i4;
        int i5;
        int i6 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1076495896);
        if (i6 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? bveVarC.C(nkjVar) : bveVarC.E(nkjVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z6 = z;
            i3 |= true != bveVarC.D(z6) ? 128 : 256;
        } else {
            z6 = z;
        }
        if ((i & 3072) == 0) {
            z7 = z2;
            i3 |= true != bveVarC.D(z7) ? 1024 : 2048;
        } else {
            z7 = z2;
        }
        if ((i & 24576) == 0) {
            i3 |= true != ((i & 32768) == 0 ? bveVarC.C(lheVar) : bveVarC.E(lheVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != ((i & 2097152) == 0 ? bveVarC.C(map) : bveVarC.E(map)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            bwxVar2 = bwxVar;
            i3 |= true != bveVarC.C(bwxVar2) ? 4194304 : 8388608;
        } else {
            bwxVar2 = bwxVar;
        }
        if ((100663296 & i) == 0) {
            aferVar2 = aferVar;
            i3 |= true != bveVarC.E(aferVar2) ? 33554432 : 67108864;
        } else {
            aferVar2 = aferVar;
        }
        if ((805306368 & i) == 0) {
            z8 = z3;
            i3 |= true != bveVarC.D(z8) ? 268435456 : 536870912;
        } else {
            z8 = z3;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != bveVarC.D(z4) ? 2 : 4);
        } else {
            i4 = i2;
        }
        int i7 = i4;
        if ((i2 & 48) == 0) {
            i5 = i7 | (true != bveVarC.D(z5) ? 16 : 32);
        } else {
            i5 = i7;
        }
        if (bveVarC.I(((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i3 & 1)) {
            final boolean z9 = nkpVar.o;
            boolean zD = ((i3 & 7168) == 2048) | bveVarC.D(z9) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && bveVarC.E(nkpVar))) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && bveVarC.E(nkjVar)));
            boolean z10 = (i3 & 896) == 256;
            int i8 = i3;
            boolean z11 = (57344 & i3) == 16384 || ((i8 & 32768) != 0 && bveVarC.E(lheVar));
            boolean z12 = zD | z10;
            boolean z13 = (i8 & 3670016) == 1048576 || ((i8 & 2097152) != 0 && bveVarC.E(map));
            boolean z14 = z11 | z12;
            boolean z15 = (i8 & 29360128) == 8388608;
            boolean z16 = (i8 & 234881024) == 67108864;
            boolean z17 = (i8 & 1879048192) == 536870912;
            boolean z18 = (i5 & 14) == 4;
            boolean z19 = (i5 & 112) == 32;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            boolean z20 = z18;
            java.lang.Object objS = bwcVar.S();
            if ((z15 | z14 | z13 | z16 | z17 | z20 | z19) || objS == defpackage.bvd.a) {
                final boolean z21 = z6;
                final defpackage.bwx bwxVar3 = bwxVar2;
                final defpackage.afer aferVar3 = aferVar2;
                final boolean z22 = z7;
                objS = new defpackage.affg() { // from class: nhi
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.cvm cvmVar = (defpackage.cvm) obj;
                        defpackage.yqm yqmVar = defpackage.nif.a;
                        cvmVar.getClass();
                        defpackage.nku nkuVar = defpackage.nku.a;
                        final boolean z23 = z9;
                        final boolean z24 = z22;
                        defpackage.ctx ctxVar = (defpackage.ctx) defpackage.afga.az(cvmVar.r(nkuVar, new defpackage.ccz(453697755, true, new defpackage.affg() { // from class: nhs
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                                float f;
                                defpackage.bve bveVar2 = (defpackage.bve) obj3;
                                int iIntValue = ((java.lang.Integer) obj4).intValue();
                                int i9 = iIntValue & 3;
                                int i10 = iIntValue & 1;
                                defpackage.yqm yqmVar2 = defpackage.nif.a;
                                if (bveVar2.I(i9 != 2, i10)) {
                                    boolean z25 = z23;
                                    defpackage.cfy cfyVar = defpackage.cfs.n;
                                    if (z25) {
                                        defpackage.ktf ktfVar = nmt.a;
                                        f = 16.0f;
                                    } else {
                                        defpackage.ksk kskVar = defpackage.nmr.a;
                                        f = 10.0f;
                                    }
                                    defpackage.ate ateVar = new defpackage.ate(f, true, new defpackage.asy());
                                    defpackage.cgc cgcVar = defpackage.cgf.e;
                                    defpackage.cty ctyVarA = defpackage.awb.a(ateVar, cfyVar, bveVar2, 48);
                                    long jB = bveVar2.b();
                                    long j = jB ^ (jB >>> 32);
                                    defpackage.cdd cddVarN = bveVar2.N();
                                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgcVar);
                                    defpackage.afer aferVar4 = defpackage.cwl.a;
                                    bveVar2.M();
                                    bveVar2.w();
                                    if (bveVar2.G()) {
                                        bveVar2.j(aferVar4);
                                    } else {
                                        bveVar2.y();
                                    }
                                    boolean z26 = z24;
                                    defpackage.byw.c(bveVar2, ctyVarA, defpackage.cwl.e);
                                    defpackage.byw.c(bveVar2, cddVarN, defpackage.cwl.d);
                                    defpackage.byw.c(bveVar2, java.lang.Integer.valueOf((int) j), defpackage.cwl.f);
                                    bveVar2.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                                    defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                                    int i11 = true != z26 ? 3 : 4;
                                    bveVar2.v(-484896947);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        defpackage.nne nneVarH = defpackage.kfn.h();
                                        java.lang.Object objG = bveVar2.g();
                                        if (objG == defpackage.bvd.a) {
                                            objG = new defpackage.nhn(2);
                                            bveVar2.x(objG);
                                        }
                                        defpackage.kfn.j(null, nneVarH, z25, true, (defpackage.afer) objG, false, false, null, false, bveVar2, 1600576, 417);
                                    }
                                    bveVar2.o();
                                    bveVar2.n();
                                } else {
                                    bveVar2.s();
                                }
                                return defpackage.afbk.a;
                            }
                        })));
                        long j = ((defpackage.dlm) obj2).a;
                        defpackage.cux cuxVarV = ctxVar.v(j);
                        int i9 = cuxVarV.a;
                        int i10 = cuxVarV.b;
                        defpackage.lhe lheVar2 = lheVar;
                        java.util.Map map2 = map;
                        defpackage.bwx bwxVar4 = bwxVar3;
                        defpackage.afer aferVar4 = aferVar3;
                        boolean z25 = z8;
                        defpackage.nku nkuVar2 = defpackage.nku.b;
                        defpackage.nkp nkpVar2 = nkpVar;
                        boolean z26 = z4;
                        return cvmVar.dS(i9, i10, defpackage.afcf.a, new defpackage.avb(i9, ((defpackage.ctx) defpackage.afga.az(cvmVar.r(nkuVar2, new defpackage.ccz(1768866904, true, new defpackage.nht(nkpVar2, nkjVar, z21, z24, lheVar2, map2, bwxVar4, aferVar4, z25, z26, z5, 0))))).v(j), i10, 5));
                    }
                };
                bwcVar.ad(objS);
            }
            defpackage.cvh.a(cgfVar, (defpackage.affg) objS, bveVarC, (i8 >> 15) & 14, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nhm(nkpVar, nkjVar, z, z2, lheVar, cgfVar, map, bwxVar, aferVar, z3, z4, z5, i, i2, 1);
        }
    }
}
