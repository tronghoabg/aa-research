package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nzs {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.ComposeStatusBar");

    public static final defpackage.nyi a(defpackage.bys bysVar) {
        return (defpackage.nyi) bysVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:307:0x088e  */
    /* JADX WARN: Code duplicated, block: B:317:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:318:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:321:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:322:0x0902  */
    /* JADX WARN: Code duplicated, block: B:325:0x096f  */
    /* JADX WARN: Code duplicated, block: B:326:0x0971  */
    /* JADX WARN: Code duplicated, block: B:327:0x0973  */
    /* JADX WARN: Code duplicated, block: B:331:0x097d  */
    public static final void b(defpackage.cgf cgfVar, defpackage.ask askVar, defpackage.obg obgVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, defpackage.bve bveVar, int i, int i2) {
        defpackage.cgf cgfVar2;
        int i3;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zU;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        defpackage.bcr bcrVarB;
        float f;
        boolean z21;
        defpackage.cgf cgfVarI;
        boolean z22;
        defpackage.bys bysVar;
        defpackage.obb obbVar;
        defpackage.bwc bwcVar;
        boolean z23;
        boolean z24;
        defpackage.obg obgVar2;
        boolean z25;
        boolean z26;
        java.lang.Boolean bool;
        boolean z27;
        boolean z28;
        defpackage.obb obbVar2;
        boolean z29;
        float f2;
        boolean z30;
        float f3;
        float f4;
        boolean z31;
        defpackage.obb obbVar3;
        defpackage.bys bysVar2;
        boolean z32;
        boolean z33;
        boolean z34;
        askVar.getClass();
        obgVar.getClass();
        defpackage.bve bveVarC = bveVar.c(-1973058584);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            cgfVar2 = cgfVar;
        } else if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i3 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(askVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & 512) == 0 ? bveVarC.C(obgVar) : bveVarC.E(obgVar)) ? 128 : 256;
        }
        int i5 = i2 & 8;
        boolean z35 = i5 == 0;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != bveVarC.D(z) ? 1024 : 2048;
        }
        int i6 = i2 & 16;
        boolean z36 = i6 == 0;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= true != bveVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                z8 = z3;
                int i7 = bveVarC.D(z8) ? 131072 : 65536;
                i3 |= i7;
            } else {
                z8 = z3;
            }
            i3 |= i7;
        } else {
            z8 = z3;
        }
        int i8 = i2 & 64;
        boolean z37 = i8 == 0;
        if (i8 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= true != bveVarC.D(z4) ? 524288 : 1048576;
        }
        int i9 = i2 & 128;
        boolean z38 = i9 == 0;
        if (i9 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= true != bveVarC.D(z5) ? 4194304 : 8388608;
        }
        int i10 = i2 & 256;
        boolean z39 = i10 == 0;
        if (i10 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= true != bveVarC.D(z6) ? 33554432 : 67108864;
        }
        int i11 = i2 & 512;
        if (i11 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= true != bveVarC.D(z7) ? 268435456 : 536870912;
        }
        if (bveVarC.I((306783379 & i3) != 306783378, i3 & 1)) {
            int i12 = i2 & 32;
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            bwcVar2.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                if (i4 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                z15 = z35 & z;
                boolean z40 = z36 & z2;
                if (i12 != 0) {
                    i3 &= -458753;
                    java.lang.String str = android.os.Build.MANUFACTURER;
                    str.getClass();
                    zU = afzh.u(str, "samsung", true);
                } else {
                    zU = z8;
                }
                z16 = z37 & z4;
                z17 = z38 & z5;
                boolean z41 = (!z39) | z6;
                z18 = i11 != 0 ? false : z7;
                z19 = z41;
                z20 = z40;
            } else {
                bveVarC.s();
                if (i12 != 0) {
                    i3 &= -458753;
                }
                z15 = z;
                z20 = z2;
                z18 = z7;
                z17 = z5;
                z19 = z6;
                zU = z8;
                cgfVar2 = cgfVar2;
                z16 = z4;
            }
            bveVarC.l();
            if (z16) {
                bveVarC.v(1534630603);
                bwcVar2.Y(false);
                bcrVarB = defpackage.bcw.b(100.0f);
            } else {
                bveVarC.v(1534682962);
                bcrVarB = defpackage.bxi.o(bveVarC).b;
                bwcVar2.Y(false);
            }
            defpackage.bcr bcrVar = bcrVarB;
            defpackage.eqp eqpVar = obgVar.i;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            defpackage.bys bysVarM = defpackage.bxi.m(eqpVar, bool2, bveVarC);
            boolean z42 = z15;
            defpackage.cgf cgfVarU = defpackage.awj.u(cgfVar2, null, 3);
            defpackage.cft cftVar = defpackage.cfs.k;
            defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, cftVar, bveVarC, 54);
            int iF = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh = bwcVar2.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarU);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            defpackage.cgf cgfVar4 = cgfVar2;
            if (bwcVar2.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.affg affgVar = defpackage.cwl.e;
            defpackage.byw.c(bveVarC, ctyVarA, affgVar);
            defpackage.affg affgVar2 = defpackage.cwl.d;
            defpackage.byw.c(bveVarC, cddVarAh, affgVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF);
            boolean z43 = z16;
            defpackage.affg affgVar3 = defpackage.cwl.f;
            defpackage.byw.c(bveVarC, numValueOf, affgVar3);
            defpackage.affc affcVar = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar);
            int i13 = i3;
            defpackage.affg affgVar4 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN, affgVar4);
            defpackage.bys bysVarM2 = defpackage.bxi.m(obgVar.r, 0, bveVarC);
            defpackage.obb obbVar4 = defpackage.obb.a;
            obbVar4.n(null, ((java.lang.Number) bysVarM2.a()).intValue(), defpackage.oaz.Horizontal, bveVarC, 24960);
            if (((java.lang.Number) bysVarM2.a()).intValue() != 0) {
                bveVarC.v(1708843935);
                defpackage.asq.A(defpackage.awj.i(defpackage.cgf.e, defpackage.gjr.P1.k), bveVarC);
                bwcVar2.Y(false);
            } else {
                bveVarC.v(1708910244);
                bwcVar2.Y(false);
            }
            if (((java.lang.Boolean) bysVarM.a()).booleanValue()) {
                bveVarC.v(1708981110);
                bwcVar2.Y(false);
                defpackage.cgf cgfVarT = defpackage.awj.t(defpackage.cgf.e, null, 3);
                defpackage.ksk kskVar = defpackage.nmr.a;
                cgfVarI = defpackage.asq.I(defpackage.awj.m(cgfVarT, 64.0f), 0.0f, (z43 ? defpackage.gjr.P2 : defpackage.gjr.P1).k);
                z20 = z20;
            } else {
                bveVarC.v(1709261877);
                bveVarC.v(1302093297);
                bveVarC.v(1302071476);
                defpackage.cgf cgfVarT2 = defpackage.awj.t(defpackage.cgf.e, null, 3);
                if (z43) {
                    defpackage.ksk kskVar2 = defpackage.nmr.a;
                    f = 64.0f;
                } else {
                    defpackage.ksk kskVar3 = defpackage.nmr.a;
                    f = 60.0f;
                }
                defpackage.cgf cgfVarM = defpackage.awj.m(cgfVarT2, f);
                defpackage.cgf cgfVarA = z43 ? defpackage.kvi.a(cgfVarM, bcrVar, 0L, 0L, new defpackage.kvk(4.0f, 4.0f, 4.0f), null, null, true, true, bveVarC, 113246208, 54) : defpackage.kvi.a(cgfVarM, bcrVar, 0L, 0L, null, null, null, true, true, bveVarC, 113246208, 62);
                bwcVar2.Y(false);
                boolean z44 = (i13 & 234881024) == 67108864;
                boolean z45 = (i13 & 57344) == 16384;
                java.lang.Object objS = bwcVar2.S();
                if ((z44 || z45) || objS == defpackage.bvd.a) {
                    z21 = false;
                    objS = new nzl(z19, z20, 0);
                    bwcVar2.ad(objS);
                } else {
                    z21 = false;
                }
                defpackage.cgf cgfVarA2 = defpackage.dea.a(cgfVarA, z21, (defpackage.affc) objS);
                if (z19) {
                    java.lang.Object objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.nyn(2);
                        bwcVar2.ad(objS2);
                    }
                    cgfVarA2 = defpackage.afw.x(cgfVarA2, true, null, askVar, (defpackage.afer) objS2);
                }
                bwcVar2.Y(false);
                if (z20 != 0) {
                    cgfVarA2 = defpackage.afw.E(cgfVarA2, defpackage.ckd.h(defpackage.kfp.i(bveVarC).A(), 0.08f), bcrVar);
                }
                cgfVarI = defpackage.asq.I(cgfVarA2, 0.0f, z43 ? defpackage.gjr.P2.k : defpackage.gjr.P1.k);
                bwcVar2.Y(false);
            }
            defpackage.atc atcVar = defpackage.ati.e;
            defpackage.cty ctyVarA2 = defpackage.atu.a(atcVar, cftVar, bveVarC, 54);
            boolean z46 = z19;
            int iF2 = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh2 = bwcVar2.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarI);
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA2, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
            defpackage.eqp eqpVar2 = obgVar.g;
            java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
            defpackage.bys bysVarM3 = defpackage.bxi.m(eqpVar2, bool3, bveVarC);
            defpackage.bys bysVarM4 = defpackage.bxi.m(obgVar.j, bool3, bveVarC);
            defpackage.bys bysVarM5 = defpackage.bxi.m(obgVar.k, bool3, bveVarC);
            defpackage.bys bysVarM6 = defpackage.bxi.m(obgVar.q, null, bveVarC);
            defpackage.bys bysVarM7 = defpackage.bxi.m(obgVar.c, bool2, bveVarC);
            defpackage.bys bysVarM8 = defpackage.bxi.m(obgVar.a(), bool2, bveVarC);
            defpackage.bys bysVarM9 = defpackage.bxi.m(obgVar.e, bool2, bveVarC);
            defpackage.eqp eqpVar3 = obgVar.p;
            defpackage.nxm nxmVar = new defpackage.nxm();
            nxmVar.c(false);
            nxmVar.b(0);
            nxmVar.d(0);
            defpackage.bys bysVarM10 = defpackage.bxi.m(eqpVar3, nxmVar.a(), bveVarC);
            int i14 = z18 ? 0 : a(bysVarM10).b;
            boolean zA = bveVarC.A(i14);
            java.lang.Object objS3 = bwcVar2.S();
            if (zA || objS3 == defpackage.bvd.a) {
                objS3 = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool2, defpackage.bxv.c);
                bwcVar2.ad(objS3);
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS3;
            java.lang.Object objS4 = bwcVar2.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS4 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z42), defpackage.bxv.c);
                bwcVar2.ad(parcelableSnapshotMutableState);
                objS4 = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar2 = (defpackage.bwx) objS4;
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i14);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(a(bysVarM10).c);
            java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(((java.lang.Boolean) bysVarM.a()).booleanValue());
            boolean zC = bveVarC.C(bysVarM) | bveVarC.C(bysVarM10) | bveVarC.C(bwxVar) | ((i13 & 7168) == 2048) | bveVarC.A(i14) | bveVarC.C(bysVarM7);
            java.lang.Object objS5 = bwcVar2.S();
            if (zC || objS5 == obj) {
                objS5 = new nzr(z42, i14, bysVarM, bwxVar2, bysVarM10, bwxVar, bysVarM7, (defpackage.afdk) null);
                z22 = z42;
                bysVar = bysVarM7;
                bwcVar2.ad(objS5);
            } else {
                z22 = z42;
                bysVar = bysVarM7;
            }
            defpackage.bvx.e(numValueOf2, boolValueOf, boolValueOf2, (defpackage.affg) objS5, bveVarC);
            if (z17 && defpackage.afga.f(f(bysVarM6), bool3)) {
                bveVarC.v(-1028499010);
                obbVar = obbVar4;
                obbVar.e(defpackage.awj.d(defpackage.cgf.e, 32.0f), bveVarC, 48);
                bwcVar2.Y(false);
            } else {
                obbVar = r0;
                bveVarC.v(-1028360626);
                bwcVar2.Y(false);
            }
            if (((java.lang.Boolean) bysVarM.a()).booleanValue()) {
                int i15 = (i13 >> 9) & 7168;
                int i16 = i13 >> 12;
                bveVarC.v(-1028285110);
                int i17 = i16 & 14;
                int i18 = (i13 >> 18) & 896;
                int i19 = (i13 << 15) & 3670016;
                if (!a(r21).c || ((java.lang.Boolean) bysVar.a()).booleanValue()) {
                    obbVar3 = obbVar;
                    bysVar2 = bysVar;
                    z28 = z43;
                    z32 = z46;
                    bveVarC.v(-1027938654);
                    int i20 = i19 | i15 | i18 | i17 | 805306368;
                    bwcVar = bwcVar2;
                    boolean z47 = z20;
                    obbVar3.k(z47, null, z32, z28, null, defpackage.kfn.l(z28, bveVarC, 0), askVar, a(bysVarM10).b, ((java.lang.Boolean) bysVar2.a()).booleanValue(), 2, bveVarC, i20, 6, 18);
                    z33 = z47;
                    bveVarC = bveVarC;
                    z34 = false;
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(-1028231790);
                    obbVar3 = obbVar;
                    z28 = z43;
                    bysVar2 = bysVar;
                    z32 = z46;
                    obbVar3.b(z20, null, z32, z28, null, defpackage.kfn.l(z43, bveVarC, 0), askVar, bveVarC, i15 | i18 | i17 | 12582912 | i19, 18);
                    bwcVar2.Y(false);
                    bwcVar = bwcVar2;
                    z34 = false;
                    z33 = z20;
                }
                if (!((java.lang.Boolean) bysVar2.a()).booleanValue() || ((java.lang.Boolean) bysVarM.a()).booleanValue()) {
                    bveVarC.v(-1026997618);
                    bwcVar.Y(z34);
                } else {
                    bveVarC.v(-1027259971);
                    defpackage.asq.A(defpackage.awj.i(defpackage.cgf.e, defpackage.gjr.P1.k), bveVarC);
                    obbVar3.m(24.0f, z28, 0L, bveVarC, (i16 & 896) | 24576, 8);
                    bwcVar.Y(z34);
                }
                bwcVar.Y(z34);
                z24 = z32;
                z23 = z33;
                z29 = z34;
                obbVar2 = obbVar3;
                z26 = zU;
            } else {
                bool3 = bool3;
                defpackage.obb obbVar5 = obbVar;
                defpackage.bys bysVar3 = bysVar;
                boolean z48 = z20;
                bwcVar = bwcVar2;
                int i21 = i13 >> 3;
                bveVarC.v(-1026661764);
                defpackage.cgf cgfVarT3 = z43 ? defpackage.awj.t(defpackage.awj.m(defpackage.cgf.e, 60.0f), null, 3) : defpackage.awj.u(defpackage.cgf.e, null, 3);
                defpackage.cty ctyVarA3 = defpackage.atu.a(atcVar, cftVar, bveVarC, 54);
                int iF3 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh3 = bwcVar.ah();
                defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarT3);
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA3, affgVar);
                defpackage.byw.c(bveVarC, cddVarAh3, affgVar2);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), affgVar3);
                defpackage.byw.b(bveVarC, affcVar);
                defpackage.byw.c(bveVarC, cgfVarN3, affgVar4);
                defpackage.atx atxVar = defpackage.atx.a;
                z23 = z48;
                defpackage.cgc cgcVar = defpackage.cgf.e;
                int i22 = i14;
                z24 = z46;
                defpackage.cgf cgfVarV = defpackage.awj.v(cgcVar, false, 3);
                defpackage.cgf cgfVarJ = z43 ? defpackage.asq.J(defpackage.awj.d(cgfVarV, 24.0f), 0.0f, 0.0f, 0.0f, 2.0f) : defpackage.awj.t(cgfVarV, null, 3);
                defpackage.cty ctyVarA4 = defpackage.awb.a(defpackage.ati.h(6.0f, cftVar), z43 ? defpackage.cfs.o : defpackage.cfs.n, bveVarC, 0);
                int iF4 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh4 = bwcVar.ah();
                defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarJ);
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA4, affgVar);
                defpackage.byw.c(bveVarC, cddVarAh4, affgVar2);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF4), affgVar3);
                defpackage.byw.b(bveVarC, affcVar);
                defpackage.byw.c(bveVarC, cgfVarN4, affgVar4);
                if (((java.lang.Boolean) bysVarM4.a()).booleanValue()) {
                    bveVarC.v(-1134082901);
                    obgVar2 = obgVar;
                    bool = bool2;
                    z25 = z43;
                    int i23 = i13 << 9;
                    boolean z49 = zU;
                    obbVar5.l(24.0f, defpackage.cfs.a, true != z25 ? 32.0f : 20.0f, (java.lang.Integer) defpackage.bxi.m(obgVar2.o, 0, bveVarC).a(), (defpackage.nue) defpackage.bxi.l(obgVar2.n, bveVarC).a(), ((java.lang.Boolean) defpackage.bxi.m(obgVar2.l, bool, bveVarC).a()).booleanValue(), ((java.lang.Boolean) defpackage.bxi.m(obgVar2.m, bool, bveVarC).a()).booleanValue(), z49, z25, bveVarC, (i23 & 234881024) | 384 | (i23 & 1879048192), 6, 0);
                    z26 = z49;
                    bwcVar.Y(false);
                } else {
                    obgVar2 = obgVar;
                    z25 = z43;
                    z26 = zU;
                    bool = bool2;
                    bveVarC.v(-1132808615);
                    bwcVar.Y(false);
                }
                int i24 = i21 & 458752;
                if (((java.lang.Boolean) bysVarM5.a()).booleanValue()) {
                    bveVarC.v(-1132747669);
                    defpackage.bys bysVarL = defpackage.bxi.l(obgVar2.b, bveVarC);
                    boolean z50 = z25;
                    defpackage.bys bysVarM11 = defpackage.bxi.m(obgVar2.f, bool, bveVarC);
                    defpackage.nfh nfhVar = (defpackage.nfh) bysVarL.a();
                    if (nfhVar == null) {
                        bveVarC.v(-1132502088);
                        bwcVar.Y(false);
                        z31 = false;
                        z27 = z50;
                    } else {
                        bveVarC.v(-1132502087);
                        obbVar5.c(defpackage.asq.I(defpackage.awj.m(cgcVar, 12.0f), 0.0f, 2.0f), nfhVar, ((java.lang.Boolean) bysVarM11.a()).booleanValue(), z26, ((java.lang.Boolean) bysVarM8.a()).booleanValue(), z50, false, bveVarC, ((i13 >> 6) & 7168) | 12582912 | i24, 64);
                        z27 = z50;
                        z31 = false;
                        bwcVar.Y(false);
                    }
                    bwcVar.Y(z31);
                } else {
                    z27 = z25;
                    obbVar5 = obbVar5;
                    z26 = z26;
                    bveVarC.v(-1131965415);
                    bwcVar.Y(false);
                }
                bwcVar.Y(true);
                if (!z22 || ((java.lang.Boolean) bysVar3.a()).booleanValue()) {
                    boolean z51 = z27;
                    defpackage.obb obbVar6 = obbVar5;
                    bveVarC.v(-985740236);
                    if (((java.lang.Boolean) bysVarM3.a()).booleanValue()) {
                        int i25 = i13 >> 6;
                        bveVarC.v(-985597140);
                        defpackage.cgf cgfVarJ2 = defpackage.asq.J(defpackage.awj.v(cgcVar, false, 3), 0.0f, z51 ? 2.0f : defpackage.gjr.P0.k, 0.0f, 0.0f);
                        defpackage.cgf cgfVarD = z51 ? defpackage.awj.d(cgfVarJ2, 24.0f) : defpackage.awj.t(cgfVarJ2, null, 3);
                        defpackage.cty ctyVarA5 = defpackage.awb.a(atcVar, defpackage.cfs.n, bveVarC, 54);
                        int iF5 = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh5 = bwcVar.ah();
                        defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVarC, cgfVarD);
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarA5, affgVar);
                        defpackage.byw.c(bveVarC, cddVarAh5, affgVar2);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF5), affgVar3);
                        defpackage.byw.b(bveVarC, affcVar);
                        defpackage.byw.c(bveVarC, cgfVarN5, affgVar4);
                        z28 = z51;
                        obbVar6.d(defpackage.dai.y(defpackage.awj.d(cgcVar, 24.0f), "clock"), defpackage.bxi.p(bveVarC).f, ((java.lang.Boolean) bysVarM9.a()).booleanValue(), true, z28, false, bveVarC, (57344 & i25) | 1575936, 32);
                        bwcVar.Y(true);
                        bwcVar.Y(false);
                    } else {
                        z28 = z51;
                        bveVarC.v(-984398339);
                        bwcVar.Y(false);
                    }
                    if (defpackage.edd.v(((java.lang.Boolean) bysVar3.a()).booleanValue(), i22, a(r21).c, ((java.lang.Boolean) bysVarM.a()).booleanValue())) {
                        bveVarC.v(-984054456);
                        defpackage.asq.A(defpackage.awj.i(cgcVar, defpackage.gjr.P1.k), bveVarC);
                        bwcVar.Y(false);
                    } else {
                        bveVarC.v(-983972771);
                        bwcVar.Y(false);
                    }
                    obbVar6.g(null, ((java.lang.Boolean) bysVar3.a()).booleanValue(), i22, false, false, z28, a(r21).c, ((java.lang.Boolean) bysVarM.a()).booleanValue(), bveVarC, i24 | 100663296, 25);
                    obbVar2 = obbVar6;
                    z29 = false;
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(-990149986);
                    boolean z52 = ((java.lang.Boolean) bysVarM3.a()).booleanValue() && ((java.lang.Boolean) bwxVar2.a()).booleanValue();
                    if (((java.lang.Boolean) bysVarM.a()).booleanValue() || (i22 <= 0 && !a(r21).c)) {
                        if (z52) {
                            if (((java.lang.Boolean) bysVar3.a()).booleanValue()) {
                                f2 = 52.0f;
                            } else {
                                f2 = 32.0f;
                            }
                            z30 = true;
                            defpackage.bys bysVarA = defpackage.aef.a(f2, null, "boxHeight", null, bveVarC, 384, 10);
                            defpackage.cgf cgfVarV2 = defpackage.awj.v(cgcVar, false, 3);
                            if (z27) {
                                f3 = 2.0f;
                            } else {
                                f3 = defpackage.gjr.P0.k;
                            }
                            defpackage.cgf cgfVarD2 = defpackage.awj.d(defpackage.asq.J(cgfVarV2, 0.0f, f3, 0.0f, 0.0f), ((defpackage.dlr) bysVarA.a()).a);
                            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
                            defpackage.obb obbVar7 = obbVar5;
                            int iF6 = defpackage.a.f(bwcVar.u);
                            defpackage.cdd cddVarAh6 = bwcVar.ah();
                            defpackage.cgf cgfVarN6 = defpackage.bzo.n(bveVarC, cgfVarD2);
                            bveVarC.w();
                            if (bwcVar.t) {
                                bveVarC.j(aferVar);
                            } else {
                                bveVarC.y();
                            }
                            defpackage.byw.c(bveVarC, ctyVarB, affgVar);
                            defpackage.byw.c(bveVarC, cddVarAh6, affgVar2);
                            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF6), affgVar3);
                            defpackage.byw.b(bveVarC, affcVar);
                            defpackage.byw.c(bveVarC, cgfVarN6, affgVar4);
                            defpackage.ats atsVar = defpackage.ats.a;
                            ((defpackage.yqj) b.f()).R("clockVisible: %s, showClock: %s, notificationBadgeMinimized: %s", java.lang.Boolean.valueOf(z30), java.lang.Boolean.valueOf(((java.lang.Boolean) bysVarM3.a()).booleanValue()), java.lang.Boolean.valueOf(((java.lang.Boolean) bwxVar2.a()).booleanValue()));
                            defpackage.ca.P(atxVar, z30, atsVar.a(cgcVar, defpackage.cfs.b), defpackage.acs.z(null, 3), defpackage.acs.A(null, 3), null, defpackage.dai.as(-1227900770, true, new nzm(z27, bysVarM9, 0), bveVarC), bveVarC, 1600518, 16);
                            if (!((java.lang.Boolean) bwxVar2.a()).booleanValue()) {
                                f4 = 0.0f;
                            } else if (!z30 || ((java.lang.Boolean) bysVar3.a()).booleanValue()) {
                                f4 = 1.0f;
                            } else {
                                f4 = -1.0f;
                            }
                            boolean z53 = z27;
                            obbVar7.g(atsVar.a(cgcVar, new defpackage.cfz(0.0f, ((java.lang.Number) defpackage.aef.b(f4, null, null, null, bveVarC, 0, 30).a()).floatValue())), ((java.lang.Boolean) bysVar3.a()).booleanValue(), i22, true, ((java.lang.Boolean) bwxVar2.a()).booleanValue(), z53, a(r21).c, ((java.lang.Boolean) bysVarM.a()).booleanValue(), bveVarC, i24 | 100666368, 0);
                            bwcVar.Y(true);
                            z29 = false;
                            bwcVar.Y(false);
                            obbVar2 = obbVar7;
                            z28 = z53;
                        } else {
                            f2 = ((java.lang.Boolean) bysVar3.a()).booleanValue() ? 8.0f : 24.0f;
                            z30 = false;
                            defpackage.bys bysVarA2 = defpackage.aef.a(f2, null, "boxHeight", null, bveVarC, 384, 10);
                            defpackage.cgf cgfVarV3 = defpackage.awj.v(cgcVar, false, 3);
                            if (z27) {
                                f3 = 2.0f;
                            } else {
                                f3 = defpackage.gjr.P0.k;
                            }
                            defpackage.cgf cgfVarD3 = defpackage.awj.d(defpackage.asq.J(cgfVarV3, 0.0f, f3, 0.0f, 0.0f), ((defpackage.dlr) bysVarA2.a()).a);
                            defpackage.cty ctyVarB2 = defpackage.atp.b(defpackage.cfs.e, false);
                            defpackage.obb obbVar8 = obbVar5;
                            int iF7 = defpackage.a.f(bwcVar.u);
                            defpackage.cdd cddVarAh7 = bwcVar.ah();
                            defpackage.cgf cgfVarN7 = defpackage.bzo.n(bveVarC, cgfVarD3);
                            bveVarC.w();
                            if (bwcVar.t) {
                                bveVarC.j(aferVar);
                            } else {
                                bveVarC.y();
                            }
                            defpackage.byw.c(bveVarC, ctyVarB2, affgVar);
                            defpackage.byw.c(bveVarC, cddVarAh7, affgVar2);
                            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF7), affgVar3);
                            defpackage.byw.b(bveVarC, affcVar);
                            defpackage.byw.c(bveVarC, cgfVarN7, affgVar4);
                            defpackage.ats atsVar2 = defpackage.ats.a;
                            ((defpackage.yqj) b.f()).R("clockVisible: %s, showClock: %s, notificationBadgeMinimized: %s", java.lang.Boolean.valueOf(z30), java.lang.Boolean.valueOf(((java.lang.Boolean) bysVarM3.a()).booleanValue()), java.lang.Boolean.valueOf(((java.lang.Boolean) bwxVar2.a()).booleanValue()));
                            defpackage.ca.P(atxVar, z30, atsVar2.a(cgcVar, defpackage.cfs.b), defpackage.acs.z(null, 3), defpackage.acs.A(null, 3), null, defpackage.dai.as(-1227900770, true, new nzm(z27, bysVarM9, 0), bveVarC), bveVarC, 1600518, 16);
                            if (!((java.lang.Boolean) bwxVar2.a()).booleanValue()) {
                                f4 = 0.0f;
                            } else if (z30) {
                                f4 = 1.0f;
                            } else {
                                f4 = 1.0f;
                            }
                            boolean z54 = z27;
                            obbVar8.g(atsVar2.a(cgcVar, new defpackage.cfz(0.0f, ((java.lang.Number) defpackage.aef.b(f4, null, null, null, bveVarC, 0, 30).a()).floatValue())), ((java.lang.Boolean) bysVar3.a()).booleanValue(), i22, true, ((java.lang.Boolean) bwxVar2.a()).booleanValue(), z54, a(r21).c, ((java.lang.Boolean) bysVarM.a()).booleanValue(), bveVarC, i24 | 100666368, 0);
                            bwcVar.Y(true);
                            z29 = false;
                            bwcVar.Y(false);
                            obbVar2 = obbVar8;
                            z28 = z54;
                        }
                    } else if (z52) {
                        if (((java.lang.Boolean) bysVar3.a()).booleanValue()) {
                            f2 = 52.0f;
                        } else {
                            f2 = 36.0f;
                        }
                        z30 = true;
                        defpackage.bys bysVarA3 = defpackage.aef.a(f2, null, "boxHeight", null, bveVarC, 384, 10);
                        defpackage.cgf cgfVarV4 = defpackage.awj.v(cgcVar, false, 3);
                        if (z27) {
                            f3 = 2.0f;
                        } else {
                            f3 = defpackage.gjr.P0.k;
                        }
                        defpackage.cgf cgfVarD4 = defpackage.awj.d(defpackage.asq.J(cgfVarV4, 0.0f, f3, 0.0f, 0.0f), ((defpackage.dlr) bysVarA3.a()).a);
                        defpackage.cty ctyVarB3 = defpackage.atp.b(defpackage.cfs.e, false);
                        defpackage.obb obbVar9 = obbVar5;
                        int iF8 = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh8 = bwcVar.ah();
                        defpackage.cgf cgfVarN8 = defpackage.bzo.n(bveVarC, cgfVarD4);
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarB3, affgVar);
                        defpackage.byw.c(bveVarC, cddVarAh8, affgVar2);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF8), affgVar3);
                        defpackage.byw.b(bveVarC, affcVar);
                        defpackage.byw.c(bveVarC, cgfVarN8, affgVar4);
                        defpackage.ats atsVar3 = defpackage.ats.a;
                        ((defpackage.yqj) b.f()).R("clockVisible: %s, showClock: %s, notificationBadgeMinimized: %s", java.lang.Boolean.valueOf(z30), java.lang.Boolean.valueOf(((java.lang.Boolean) bysVarM3.a()).booleanValue()), java.lang.Boolean.valueOf(((java.lang.Boolean) bwxVar2.a()).booleanValue()));
                        defpackage.ca.P(atxVar, z30, atsVar3.a(cgcVar, defpackage.cfs.b), defpackage.acs.z(null, 3), defpackage.acs.A(null, 3), null, defpackage.dai.as(-1227900770, true, new nzm(z27, bysVarM9, 0), bveVarC), bveVarC, 1600518, 16);
                        if (!((java.lang.Boolean) bwxVar2.a()).booleanValue()) {
                            f4 = 0.0f;
                        } else if (z30) {
                            f4 = 1.0f;
                        } else {
                            f4 = 1.0f;
                        }
                        boolean z55 = z27;
                        obbVar9.g(atsVar3.a(cgcVar, new defpackage.cfz(0.0f, ((java.lang.Number) defpackage.aef.b(f4, null, null, null, bveVarC, 0, 30).a()).floatValue())), ((java.lang.Boolean) bysVar3.a()).booleanValue(), i22, true, ((java.lang.Boolean) bwxVar2.a()).booleanValue(), z55, a(r21).c, ((java.lang.Boolean) bysVarM.a()).booleanValue(), bveVarC, i24 | 100666368, 0);
                        bwcVar.Y(true);
                        z29 = false;
                        bwcVar.Y(false);
                        obbVar2 = obbVar9;
                        z28 = z55;
                    } else {
                        f2 = 32.0f;
                        z30 = false;
                        defpackage.bys bysVarA4 = defpackage.aef.a(f2, null, "boxHeight", null, bveVarC, 384, 10);
                        defpackage.cgf cgfVarV5 = defpackage.awj.v(cgcVar, false, 3);
                        if (z27) {
                            f3 = 2.0f;
                        } else {
                            f3 = defpackage.gjr.P0.k;
                        }
                        defpackage.cgf cgfVarD5 = defpackage.awj.d(defpackage.asq.J(cgfVarV5, 0.0f, f3, 0.0f, 0.0f), ((defpackage.dlr) bysVarA4.a()).a);
                        defpackage.cty ctyVarB4 = defpackage.atp.b(defpackage.cfs.e, false);
                        defpackage.obb obbVar10 = obbVar5;
                        int iF9 = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh9 = bwcVar.ah();
                        defpackage.cgf cgfVarN9 = defpackage.bzo.n(bveVarC, cgfVarD5);
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarB4, affgVar);
                        defpackage.byw.c(bveVarC, cddVarAh9, affgVar2);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF9), affgVar3);
                        defpackage.byw.b(bveVarC, affcVar);
                        defpackage.byw.c(bveVarC, cgfVarN9, affgVar4);
                        defpackage.ats atsVar4 = defpackage.ats.a;
                        ((defpackage.yqj) b.f()).R("clockVisible: %s, showClock: %s, notificationBadgeMinimized: %s", java.lang.Boolean.valueOf(z30), java.lang.Boolean.valueOf(((java.lang.Boolean) bysVarM3.a()).booleanValue()), java.lang.Boolean.valueOf(((java.lang.Boolean) bwxVar2.a()).booleanValue()));
                        defpackage.ca.P(atxVar, z30, atsVar4.a(cgcVar, defpackage.cfs.b), defpackage.acs.z(null, 3), defpackage.acs.A(null, 3), null, defpackage.dai.as(-1227900770, true, new nzm(z27, bysVarM9, 0), bveVarC), bveVarC, 1600518, 16);
                        if (!((java.lang.Boolean) bwxVar2.a()).booleanValue()) {
                            f4 = 0.0f;
                        } else if (z30) {
                            f4 = 1.0f;
                        } else {
                            f4 = 1.0f;
                        }
                        boolean z56 = z27;
                        obbVar10.g(atsVar4.a(cgcVar, new defpackage.cfz(0.0f, ((java.lang.Number) defpackage.aef.b(f4, null, null, null, bveVarC, 0, 30).a()).floatValue())), ((java.lang.Boolean) bysVar3.a()).booleanValue(), i22, true, ((java.lang.Boolean) bwxVar2.a()).booleanValue(), z56, a(r21).c, ((java.lang.Boolean) bysVarM.a()).booleanValue(), bveVarC, i24 | 100666368, 0);
                        bwcVar.Y(true);
                        z29 = false;
                        bwcVar.Y(false);
                        obbVar2 = obbVar10;
                        z28 = z56;
                    }
                }
                bwcVar.Y(true);
                bwcVar.Y(z29);
            }
            if (z17 || !defpackage.afga.f(f(bysVarM6), bool3)) {
                bveVarC.v(-1016455634);
                bwcVar.Y(z29);
            } else {
                bveVarC.v(-1016594018);
                obbVar2.e(defpackage.awj.d(defpackage.cgf.e, 32.0f), bveVarC, 48);
                bwcVar.Y(z29);
            }
            bwcVar.Y(true);
            bwcVar.Y(true);
            z10 = z28;
            bveVar2 = bveVarC;
            z8 = z26;
            z12 = z17;
            z11 = z18;
            cgfVar3 = cgfVar4;
            z9 = z23;
            z13 = z24;
            z14 = z22;
        } else {
            bveVarC.s();
            z9 = z2;
            z10 = z4;
            z11 = z7;
            bveVar2 = bveVarC;
            cgfVar3 = cgfVar2;
            z12 = z5;
            z13 = z6;
            z14 = z;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nzn(cgfVar3, askVar, obgVar, z14, z9, z8, z10, z12, z13, z11, i, i2);
        }
    }

    public static /* synthetic */ defpackage.afbk c(boolean z, boolean z2, defpackage.dek dekVar) {
        dekVar.getClass();
        if (z) {
            dekVar.a(defpackage.def.A, new defpackage.ddw(0));
            dekVar.a(defpackage.def.M, z2 ? defpackage.det.a : defpackage.det.b);
        }
        return defpackage.afbk.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final void d(boolean z, defpackage.obg obgVar, boolean z2, defpackage.bve bveVar, int i) {
        defpackage.cgc cgcVar;
        ?? r1;
        defpackage.bwc bwcVar;
        float f;
        boolean z3;
        obgVar.getClass();
        int i2 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1648178610);
        int i3 = i2 == 0 ? (true != bveVarC.D(z) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? bveVarC.C(obgVar) : bveVarC.E(obgVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        int i4 = i3;
        if (bveVarC.I((i4 & 147) != 146, i4 & 1)) {
            defpackage.bys bysVarM = defpackage.bxi.m((defpackage.eqp) ((oae) defpackage.mkp.a.b(oae.class, new defpackage.oad(0))).c, defpackage.afce.a, bveVarC);
            defpackage.cgc cgcVar2 = defpackage.cgf.e;
            defpackage.cgf cgfVarJ = defpackage.asq.J(defpackage.awj.b(defpackage.awj.r(cgcVar2), 1.0f), 17.0f, 0.0f, 24.0f, 0.0f);
            defpackage.cfy cfyVar = defpackage.cfs.o;
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.g, cfyVar, bveVarC, 54);
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh = bwcVar2.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarJ);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.affg affgVar = defpackage.cwl.e;
            defpackage.byw.c(bveVarC, ctyVarA, affgVar);
            defpackage.affg affgVar2 = defpackage.cwl.d;
            defpackage.byw.c(bveVarC, cddVarAh, affgVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF);
            defpackage.affg affgVar3 = defpackage.cwl.f;
            defpackage.byw.c(bveVarC, numValueOf, affgVar3);
            defpackage.affc affcVar = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.affg affgVar4 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN, affgVar4);
            defpackage.cgf cgfVarV = defpackage.awj.v(cgcVar2, false, 3);
            defpackage.cty ctyVarA2 = defpackage.awb.a(defpackage.ati.h(24.0f, defpackage.cfs.j), cfyVar, bveVarC, 54);
            int iF2 = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh2 = bwcVar2.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarV);
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA2, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
            bveVarC.v(525031427);
            for (kjo kjoVar : defpackage.tna.aq(bysVarM)) {
                if (kjoVar instanceof kjq) {
                    bveVarC.v(-903765644);
                    kjq kjqVar = (kjq) kjoVar;
                    if (defpackage.a.X(kjqVar.a.a.a, 34908672)) {
                        bveVarC.v(525039186);
                        kjoVar.getClass();
                        nky.a(kjqVar, (defpackage.cgf) null, bveVarC, 48);
                        z3 = false;
                        bwcVar2.Y(false);
                    } else {
                        z3 = false;
                        bveVarC.v(-903496998);
                        bwcVar2.Y(false);
                    }
                    bwcVar2.Y(z3);
                } else if (kjoVar instanceof kjo) {
                    bveVarC.v(-903422040);
                    defpackage.lvs.O(kjoVar, 2, bveVarC, 48);
                    bwcVar2.Y(false);
                } else {
                    bveVarC.v(-903317942);
                    bwcVar2.Y(false);
                    ((defpackage.yqj) b.h()).y("Unsupported control %s cannot be rendered in status bar", kjoVar);
                }
            }
            bwcVar2.Y(false);
            bwcVar2.Y(true);
            defpackage.cty ctyVarA3 = defpackage.awb.a(defpackage.ati.h(8.0f, defpackage.cfs.l), cfyVar, bveVarC, 54);
            int iF3 = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh3 = bwcVar2.ah();
            defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgcVar2);
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA3, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh3, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN3, affgVar4);
            defpackage.eqp eqpVar = obgVar.g;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            defpackage.bys bysVarM2 = defpackage.bxi.m(eqpVar, bool, bveVarC);
            defpackage.bys bysVarM3 = defpackage.bxi.m(obgVar.j, bool, bveVarC);
            defpackage.bys bysVarM4 = defpackage.bxi.m(obgVar.k, bool, bveVarC);
            defpackage.bys bysVarM5 = defpackage.bxi.m(obgVar.q, null, bveVarC);
            defpackage.eqp eqpVar2 = obgVar.c;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            defpackage.bys bysVarM6 = defpackage.bxi.m(eqpVar2, bool2, bveVarC);
            defpackage.bys bysVarM7 = defpackage.bxi.m(obgVar.e, bool2, bveVarC);
            defpackage.bys bysVarM8 = defpackage.bxi.m(obgVar.a(), bool2, bveVarC);
            if (((java.lang.Boolean) bysVarM2.a()).booleanValue()) {
                bveVarC.v(-474804812);
                defpackage.bwc bwcVar3 = bwcVar2;
                r1 = 0;
                cgcVar = cgcVar2;
                defpackage.obb.a.d(defpackage.awj.t(cgcVar2, null, 3), defpackage.bxi.p(bveVarC).i, ((java.lang.Boolean) bysVarM7.a()).booleanValue(), false, z2, true, bveVarC, 1769478 | ((i4 << 6) & 57344), 8);
                bwcVar3.Y(false);
                bwcVar = bwcVar3;
            } else {
                cgcVar = cgcVar2;
                defpackage.bwc bwcVar4 = bwcVar2;
                r1 = 0;
                bveVarC.v(-474529005);
                bwcVar4.Y(false);
                bwcVar = bwcVar4;
            }
            if (((java.lang.Boolean) bysVarM3.a()).booleanValue()) {
                bveVarC.v(-474473391);
                defpackage.bys bysVarM9 = defpackage.bxi.m(obgVar.o, java.lang.Integer.valueOf((int) r1), bveVarC);
                defpackage.bys bysVarL = defpackage.bxi.l(obgVar.n, bveVarC);
                defpackage.bys bysVarM10 = defpackage.bxi.m(obgVar.l, bool2, bveVarC);
                defpackage.bys bysVarM11 = defpackage.bxi.m(obgVar.m, bool2, bveVarC);
                defpackage.obb obbVar = defpackage.obb.a;
                defpackage.ksk kskVar = defpackage.nmr.a;
                obbVar.l(32.0f, defpackage.cfs.d, 0.0f, (java.lang.Integer) bysVarM9.a(), (defpackage.nue) bysVarL.a(), ((java.lang.Boolean) bysVarM10.a()).booleanValue(), ((java.lang.Boolean) bysVarM11.a()).booleanValue(), z, false, bveVarC, ((i4 << 24) & 234881024) | 384, 6, 520);
                bveVarC = bveVarC;
                bwcVar.Y(r1);
            } else {
                bveVarC.v(-473610413);
                bwcVar.Y(r1);
            }
            if (((java.lang.Boolean) bysVarM4.a()).booleanValue()) {
                bveVarC.v(-473558922);
                defpackage.bys bysVarL2 = defpackage.bxi.l(obgVar.b, bveVarC);
                defpackage.bys bysVarM12 = defpackage.bxi.m(obgVar.f, bool2, bveVarC);
                defpackage.nfh nfhVar = (defpackage.nfh) bysVarL2.a();
                if (nfhVar == null) {
                    bveVarC.v(-473336219);
                    bwcVar.Y(r1);
                    f = 32.0f;
                } else {
                    bveVarC.v(-473336218);
                    defpackage.obb obbVar2 = defpackage.obb.a;
                    defpackage.ksk kskVar2 = defpackage.nmr.a;
                    int i5 = i4 << 9;
                    defpackage.bve bveVar2 = bveVarC;
                    f = 32.0f;
                    obbVar2.c(defpackage.awj.d(cgcVar, 32.0f), nfhVar, ((java.lang.Boolean) bysVarM12.a()).booleanValue(), z, ((java.lang.Boolean) bysVarM8.a()).booleanValue(), z2, true, bveVar2, (i5 & 7168) | 14155776 | (i5 & 458752), 0);
                    bveVarC = bveVar2;
                    bwcVar.Y(r1);
                }
                bwcVar.Y(r1);
            } else {
                f = 32.0f;
                bveVarC.v(-472916013);
                bwcVar.Y(r1);
            }
            if (((java.lang.Boolean) bysVarM6.a()).booleanValue()) {
                bveVarC.v(-472880859);
                defpackage.obb obbVar3 = defpackage.obb.a;
                defpackage.ksk kskVar3 = defpackage.nmr.a;
                defpackage.bve bveVar3 = bveVarC;
                obbVar3.m(32.0f, false, 0L, bveVar3, 24576, 12);
                bveVarC = bveVar3;
                bwcVar.Y(r1);
            } else {
                bveVarC.v(-472713645);
                bwcVar.Y(r1);
            }
            if (defpackage.afga.f((java.lang.Boolean) bysVarM5.a(), bool)) {
                bveVarC.v(-472678429);
                defpackage.obb obbVar4 = defpackage.obb.a;
                defpackage.ksk kskVar4 = defpackage.nmr.a;
                obbVar4.e(defpackage.awj.d(cgcVar, f), bveVarC, 48);
                bwcVar.Y(r1);
            } else {
                bveVarC.v(-472540045);
                bwcVar.Y(r1);
            }
            bwcVar.Y(true);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nzo(z, obgVar, z2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v104 */
    /* JADX WARN: Type inference failed for: r10v65, types: [int] */
    /* JADX WARN: Type inference failed for: r10v71 */
    public static final void e(final defpackage.cgf cgfVar, final defpackage.ask askVar, defpackage.obg obgVar, final boolean z, boolean z2, boolean z3, final boolean z4, defpackage.bve bveVar, final int i) {
        int i2;
        defpackage.obg obgVar2;
        final boolean z5;
        final boolean z6;
        boolean zU;
        defpackage.bcr bcrVar;
        defpackage.affg affgVar;
        float f;
        boolean z7;
        defpackage.affg affgVar2;
        defpackage.afer aferVar;
        defpackage.atb atbVar;
        defpackage.afbk afbkVar;
        defpackage.affg affgVar3;
        int i3;
        defpackage.cfy cfyVar;
        defpackage.bcr bcrVar2;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVarA;
        defpackage.bve bveVar3;
        defpackage.cgf cgfVarA2;
        defpackage.cfy cfyVar2;
        defpackage.atb atbVar2;
        char c;
        defpackage.afer aferVar2;
        int i4;
        defpackage.cgf cgfVarU;
        defpackage.obb obbVar;
        defpackage.affg affgVar4;
        defpackage.cgc cgcVar;
        boolean z8;
        java.lang.Boolean bool;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r10;
        defpackage.bwc bwcVar;
        defpackage.bwc bwcVar2;
        obgVar.getClass();
        defpackage.bve bveVarC = bveVar.c(-111690994);
        if ((i & 6) == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(askVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? bveVarC.C(obgVar) : bveVarC.E(obgVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.D(z3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.D(z4) ? 524288 : 1048576;
        }
        if (bveVarC.I((599187 & i2) != 599186, i2 & 1)) {
            int i5 = i2 >> 6;
            int i6 = i2 >> 12;
            int i7 = i2 >> 9;
            int i8 = i2 >> 3;
            int i9 = i2 & (-57345);
            defpackage.bwc bwcVar3 = (defpackage.bwc) bveVarC;
            bwcVar3.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                java.lang.String str = android.os.Build.MANUFACTURER;
                str.getClass();
                zU = afzh.u(str, "samsung", true);
            } else {
                bveVarC.s();
                zU = z2;
            }
            bveVarC.l();
            if (z3) {
                bveVarC.v(1213627372);
                bcrVar = ((defpackage.bol) bveVarC.f(defpackage.bom.a)).c.d;
                bwcVar3.Y(false);
            } else {
                bveVarC.v(1213673004);
                bcrVar = ((defpackage.bol) bveVarC.f(defpackage.bom.a)).c.b;
                bwcVar3.Y(false);
            }
            defpackage.eqp eqpVar = obgVar.i;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            defpackage.bys bysVarM = defpackage.bxi.m(eqpVar, bool2, bveVarC);
            defpackage.cgf cgfVarU2 = defpackage.awj.u(cgfVar, null, 3);
            defpackage.cfy cfyVar3 = defpackage.cfs.n;
            java.lang.Boolean bool3 = bool2;
            defpackage.atb atbVar3 = defpackage.ati.b;
            defpackage.cty ctyVarA = defpackage.awb.a(atbVar3, cfyVar3, bveVarC, 54);
            long j = bwcVar3.u;
            long j2 = j ^ (j >>> 32);
            defpackage.cdd cddVarAh = bwcVar3.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarU2);
            defpackage.afer aferVar3 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar3.t) {
                bveVarC.j(aferVar3);
            } else {
                bveVarC.y();
            }
            int i10 = (int) j2;
            defpackage.affg affgVar5 = defpackage.cwl.e;
            defpackage.byw.c(bveVarC, ctyVarA, affgVar5);
            defpackage.affg affgVar6 = defpackage.cwl.d;
            defpackage.byw.c(bveVarC, cddVarAh, affgVar6);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i10);
            defpackage.affg affgVar7 = defpackage.cwl.f;
            defpackage.byw.c(bveVarC, numValueOf, affgVar7);
            defpackage.affc affcVar = defpackage.cwl.g;
            defpackage.afbk afbkVar2 = defpackage.afbk.a;
            defpackage.bcr bcrVar3 = bcrVar;
            int i11 = i5;
            bveVarC.i(afbkVar2, new defpackage.amc(affcVar, 16));
            defpackage.affg affgVar8 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN, affgVar8);
            if (((java.lang.Boolean) bysVarM.a()).booleanValue()) {
                bveVarC.v(-528550172);
                bwcVar3.Y(false);
                defpackage.cgf cgfVarV = defpackage.awj.v(defpackage.cgf.e, false, 3);
                defpackage.ksk kskVar = defpackage.nmr.a;
                defpackage.cgf cgfVarD = defpackage.awj.d(cgfVarV, 64.0f);
                float f2 = (z3 ? defpackage.gjr.P1 : defpackage.gjr.P0).k;
                cgfVarA2 = cgfVarD.a(new defpackage.avr(f2, 0.0f, f2, 0.0f));
                bool3 = bool3;
                affgVar2 = affgVar6;
                aferVar = aferVar3;
                atbVar2 = atbVar3;
                afbkVar = afbkVar2;
                affgVar3 = affgVar5;
                i3 = i6;
                cfyVar2 = cfyVar3;
                affgVar = affgVar8;
                bveVar3 = bveVarC;
                i11 = i11;
            } else {
                affgVar = affgVar8;
                bveVarC.v(-528204460);
                bveVarC.v(-432651131);
                bveVarC.v(-432672952);
                defpackage.cgf cgfVarV2 = defpackage.awj.v(defpackage.cgf.e, false, 3);
                if (z3) {
                    defpackage.ksk kskVar2 = defpackage.nmr.a;
                    f = 56.0f;
                } else {
                    defpackage.ksk kskVar3 = defpackage.nmr.a;
                    f = 60.0f;
                }
                defpackage.cgf cgfVarD2 = defpackage.awj.d(cgfVarV2, f);
                if (z3) {
                    afbkVar = afbkVar2;
                    z7 = false;
                    cfyVar = cfyVar3;
                    bcrVar2 = bcrVar3;
                    affgVar2 = affgVar6;
                    atbVar = atbVar3;
                    aferVar = aferVar3;
                    affgVar3 = affgVar5;
                    i3 = i6;
                    bveVar2 = bveVarC;
                    cgfVarA = defpackage.kvi.a(cgfVarD2, bcrVar2, 0L, 0L, new defpackage.kvk(4.0f, 4.0f, 4.0f), null, null, true, true, bveVar2, 113246208, 54);
                } else {
                    z7 = false;
                    affgVar2 = affgVar6;
                    aferVar = aferVar3;
                    atbVar = atbVar3;
                    afbkVar = afbkVar2;
                    affgVar3 = affgVar5;
                    i3 = i6;
                    cfyVar = cfyVar3;
                    bcrVar2 = bcrVar3;
                    bveVar2 = bveVarC;
                    cgfVarA = defpackage.kvi.a(cgfVarD2, bcrVar2, 0L, 0L, null, null, null, true, true, bveVar2, 113246208, 62);
                }
                bveVar3 = bveVar2;
                bwcVar3.Y(z7);
                boolean z14 = (i2 & 3670016) == 1048576 ? true : z7;
                boolean z15 = (i2 & 7168) == 2048 ? true : z7;
                java.lang.Object objS = bwcVar3.S();
                if ((z15 | z14) || objS == defpackage.bvd.a) {
                    objS = new defpackage.affc() { // from class: nzp
                        @Override // defpackage.affc
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return defpackage.nzs.c(z4, z, (defpackage.dek) obj);
                        }
                    };
                    bwcVar3.ad(objS);
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dea.a;
                defpackage.cgf cgfVarA3 = cgfVarA.a(new defpackage.ddo(z7, (defpackage.affc) objS));
                if (z4) {
                    java.lang.Object objS2 = bwcVar3.S();
                    if (objS2 == defpackage.bvd.a) {
                        c = '\f';
                        objS2 = new defpackage.nhn(12);
                        bwcVar3.ad(objS2);
                    } else {
                        c = '\f';
                    }
                    cgfVarA3 = cgfVarA3.a(new defpackage.ajm(askVar, null, true, true, null, null, (defpackage.afer) objS2));
                }
                bwcVar3.Y(z7);
                if (z) {
                    long jA = defpackage.kfp.i(bveVar3).A();
                    float fD = defpackage.ckd.d(jA);
                    float fC = defpackage.ckd.c(jA);
                    float fB = defpackage.ckd.b(jA);
                    float[] fArr = defpackage.clr.a;
                    cgfVarA3 = cgfVarA3.a(new defpackage.ajc(defpackage.cjv.k(fD, fC, fB, 0.08f, defpackage.clr.y[(int) (jA & 63)]), bcrVar2));
                }
                float f3 = z3 ? defpackage.gjr.P1.k : defpackage.gjr.P0.k;
                float f4 = z3 ? defpackage.gjr.P0.k : 0.0f;
                cgfVarA2 = cgfVarA3.a(new defpackage.avr(f3, f4, f3, f4));
                bwcVar3.Y(false);
                cfyVar2 = cfyVar;
                atbVar2 = atbVar;
            }
            defpackage.cty ctyVarA2 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, 54);
            long j3 = bwcVar3.u;
            long j4 = j3 ^ (j3 >>> 32);
            defpackage.cdd cddVarAh2 = bwcVar3.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVar3, cgfVarA2);
            bveVar3.w();
            if (bwcVar3.t) {
                aferVar2 = aferVar;
                bveVar3.j(aferVar2);
            } else {
                aferVar2 = aferVar;
                bveVar3.y();
            }
            defpackage.affg affgVar9 = affgVar3;
            defpackage.byw.c(bveVar3, ctyVarA2, affgVar9);
            defpackage.affg affgVar10 = affgVar2;
            defpackage.byw.c(bveVar3, cddVarAh2, affgVar10);
            defpackage.byw.c(bveVar3, java.lang.Integer.valueOf((int) j4), affgVar7);
            defpackage.afbk afbkVar3 = afbkVar;
            bveVar3.i(afbkVar3, new defpackage.amc(affcVar, 16));
            defpackage.affg affgVar11 = affgVar;
            defpackage.byw.c(bveVar3, cgfVarN2, affgVar11);
            defpackage.eqp eqpVar2 = obgVar.g;
            java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
            defpackage.bys bysVarM2 = defpackage.bxi.m(eqpVar2, bool4, bveVar3);
            defpackage.bys bysVarM3 = defpackage.bxi.m(obgVar.j, bool4, bveVar3);
            defpackage.bys bysVarM4 = defpackage.bxi.m(obgVar.k, bool4, bveVar3);
            defpackage.atb atbVar4 = atbVar2;
            defpackage.bys bysVarM5 = defpackage.bxi.m(obgVar.q, null, bveVar3);
            defpackage.afer aferVar4 = aferVar2;
            java.lang.Boolean bool5 = bool3;
            defpackage.bys bysVarM6 = defpackage.bxi.m(obgVar.c, bool5, bveVar3);
            defpackage.bys bysVarM7 = defpackage.bxi.m(obgVar.e, bool5, bveVar3);
            defpackage.bys bysVarM8 = defpackage.bxi.m(obgVar.a(), bool5, bveVar3);
            defpackage.eqp eqpVar3 = obgVar.p;
            defpackage.nxm nxmVar = new defpackage.nxm();
            int i12 = i2;
            nxmVar.c(false);
            nxmVar.b(0);
            nxmVar.d(0);
            defpackage.bys bysVarM9 = defpackage.bxi.m(eqpVar3, nxmVar.a(), bveVar3);
            if (defpackage.afga.f((java.lang.Boolean) bysVarM5.a(), bool4)) {
                bveVar3.v(1344129756);
                defpackage.obb.a.e(defpackage.awj.d(defpackage.cgf.e, 32.0f), bveVar3, 48);
                float f5 = defpackage.gjr.P0.k;
                defpackage.asq.A(new defpackage.awi(f5, f5, f5, f5, true), bveVar3);
                bwcVar3.Y(false);
            } else {
                bveVar3.v(1344329644);
                bwcVar3.Y(false);
            }
            defpackage.obb obbVar2 = defpackage.obb.a;
            int i13 = i12 & 458752;
            defpackage.bve bveVar4 = bveVar3;
            obbVar2.g(null, ((java.lang.Boolean) bysVarM6.a()).booleanValue(), ((defpackage.nyi) bysVarM9.a()).b, false, false, z3, ((defpackage.nyi) bysVarM9.a()).c, ((java.lang.Boolean) bysVarM.a()).booleanValue(), bveVar4, i13 | 100663296, 25);
            bveVarC = bveVar4;
            if (defpackage.edd.v(((java.lang.Boolean) bysVarM6.a()).booleanValue(), ((defpackage.nyi) bysVarM9.a()).b, ((defpackage.nyi) bysVarM9.a()).c, ((java.lang.Boolean) bysVarM.a()).booleanValue())) {
                bveVarC.v(1344976707);
                float f6 = defpackage.gjr.P0.k;
                defpackage.asq.A(new defpackage.awi(f6, f6, f6, f6, true), bveVarC);
                bwcVar3.Y(false);
            } else {
                bveVarC.v(1345046860);
                bwcVar3.Y(false);
            }
            if (((java.lang.Boolean) bysVarM.a()).booleanValue()) {
                int i14 = (i9 << 15) & 3670016;
                int i15 = i11 & 7168;
                int i16 = i3 & 896;
                int i17 = i7 & 14;
                bveVarC.v(1345106845);
                if (!((defpackage.nyi) bysVarM9.a()).c || ((java.lang.Boolean) bysVarM6.a()).booleanValue()) {
                    obbVar = obbVar2;
                    bveVarC.v(1345468894);
                    int i18 = i15 | i16 | i17 | 805306368 | i14;
                    defpackage.bwc bwcVar4 = bwcVar3;
                    obbVar.k(z, null, z4, z3, null, defpackage.kfn.l(z3, bveVarC, 0), askVar, ((defpackage.nyi) bysVarM9.a()).b, ((java.lang.Boolean) bysVarM6.a()).booleanValue(), 1, bveVarC, i18, 6, 18);
                    bveVarC = bveVarC;
                    bwcVar4.Y(false);
                    bwcVar2 = bwcVar4;
                } else {
                    bveVarC.v(1345175696);
                    obbVar = obbVar2;
                    obbVar.b(z, null, z4, z3, null, defpackage.kfn.l(z3, bveVarC, 0), askVar, bveVarC, i15 | i16 | i17 | 12582912 | i14, 18);
                    bwcVar3.Y(false);
                    bwcVar2 = bwcVar3;
                }
                bwcVar2.Y(false);
                r10 = 0;
                z11 = z3;
                z8 = zU;
                z9 = true;
                obgVar2 = obgVar;
                bwcVar = bwcVar2;
            } else {
                defpackage.bwc bwcVar5 = bwcVar3;
                bveVarC.v(1346084740);
                if (z3) {
                    cgfVarU = defpackage.awj.m(defpackage.awj.d(defpackage.cgf.e, 48.0f), 72.0f);
                    i4 = 3;
                } else {
                    i4 = 3;
                    cgfVarU = defpackage.awj.u(defpackage.cgf.e, null, 3);
                }
                defpackage.cty ctyVarA3 = defpackage.atu.a(z3 ? defpackage.ati.e : defpackage.ati.d, z3 ? defpackage.cfs.k : defpackage.cfs.l, bveVarC, 0);
                long j5 = bwcVar5.u;
                long j6 = j5 ^ (j5 >>> 32);
                defpackage.cdd cddVarAh3 = bwcVar5.ah();
                defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarU);
                bveVarC.w();
                if (bwcVar5.t) {
                    bveVarC.j(aferVar4);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA3, affgVar9);
                defpackage.byw.c(bveVarC, cddVarAh3, affgVar10);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j6), affgVar7);
                bveVarC.i(afbkVar3, new defpackage.amc(affcVar, 16));
                defpackage.byw.c(bveVarC, cgfVarN3, affgVar11);
                defpackage.cgc cgcVar2 = defpackage.cgf.e;
                defpackage.cgf cgfVarV3 = defpackage.awj.v(cgcVar2, false, i4);
                defpackage.cgf cgfVarA4 = z3 ? defpackage.awj.d(cgfVarV3, 24.0f).a(new defpackage.avr(0.0f, 0.0f, 0.0f, defpackage.gjr.P0.k)) : defpackage.awj.t(cgfVarV3, null, i4);
                defpackage.cfy cfyVar4 = defpackage.cfs.o;
                defpackage.cty ctyVarA4 = defpackage.awb.a(new defpackage.ate(6.0f, true, new defpackage.asx(defpackage.cfs.l, 1)), cfyVar4, bveVarC, 48);
                long j7 = bwcVar5.u;
                long j8 = j7 ^ (j7 >>> 32);
                defpackage.cdd cddVarAh4 = bwcVar5.ah();
                defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarA4);
                bveVarC.w();
                if (bwcVar5.t) {
                    bveVarC.j(aferVar4);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA4, affgVar9);
                defpackage.byw.c(bveVarC, cddVarAh4, affgVar10);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j8), affgVar7);
                bveVarC.i(afbkVar3, new defpackage.amc(affcVar, 16));
                defpackage.byw.c(bveVarC, cgfVarN4, affgVar11);
                if (((java.lang.Boolean) bysVarM3.a()).booleanValue()) {
                    bveVarC.v(1854125879);
                    obgVar2 = obgVar;
                    defpackage.bys bysVarM10 = defpackage.bxi.m(obgVar2.o, 0, bveVarC);
                    defpackage.eqp eqpVar4 = obgVar2.n;
                    defpackage.bys bysVarM11 = defpackage.bxi.m(eqpVar4, eqpVar4.e(), bveVarC);
                    defpackage.bys bysVarM12 = defpackage.bxi.m(obgVar2.l, bool5, bveVarC);
                    defpackage.bys bysVarM13 = defpackage.bxi.m(obgVar2.m, bool5, bveVarC);
                    obbVar = obbVar2;
                    bool = bool5;
                    cgcVar = cgcVar2;
                    affgVar4 = affgVar10;
                    boolean z16 = zU;
                    obbVar.l(24.0f, defpackage.cfs.a, true != z3 ? 36.0f : 22.0f, (java.lang.Integer) bysVarM10.a(), (defpackage.nue) bysVarM11.a(), ((java.lang.Boolean) bysVarM12.a()).booleanValue(), ((java.lang.Boolean) bysVarM13.a()).booleanValue(), z16, z3, bveVarC, 384 | ((i9 << 12) & 1879048192), 6, 0);
                    z8 = z16;
                    bveVarC = bveVarC;
                    bwcVar5.Y(false);
                } else {
                    obgVar2 = obgVar;
                    obbVar = obbVar2;
                    affgVar4 = affgVar10;
                    cgcVar = cgcVar2;
                    z8 = zU;
                    bool = bool5;
                    bveVarC.v(1855385750);
                    bwcVar5.Y(false);
                }
                if (((java.lang.Boolean) bysVarM4.a()).booleanValue()) {
                    bveVarC.v(1855446696);
                    defpackage.eqp eqpVar5 = obgVar2.b;
                    defpackage.bys bysVarM14 = defpackage.bxi.m(eqpVar5, eqpVar5.e(), bveVarC);
                    defpackage.bys bysVarM15 = defpackage.bxi.m(obgVar2.f, bool, bveVarC);
                    defpackage.nfh nfhVar = (defpackage.nfh) bysVarM14.a();
                    if (nfhVar == null) {
                        bveVarC.v(1855692277);
                        z13 = false;
                        bwcVar5.Y(false);
                    } else {
                        bveVarC.v(1855692278);
                        obbVar.c(defpackage.awj.m(cgcVar, 12.0f).a(new defpackage.avr(0.0f, 2.0f, 0.0f, 2.0f)), nfhVar, ((java.lang.Boolean) bysVarM15.a()).booleanValue(), z8, ((java.lang.Boolean) bysVarM8.a()).booleanValue(), z3, false, bveVarC, i13 | 12582912, 64);
                        z13 = false;
                        bwcVar5.Y(false);
                    }
                    bwcVar5.Y(z13);
                } else {
                    z8 = z8;
                    bveVarC.v(1856228950);
                    bwcVar5.Y(false);
                }
                z9 = true;
                bwcVar5.Y(true);
                if (((java.lang.Boolean) bysVarM2.a()).booleanValue() && !z3) {
                    bveVarC.v(-113581839);
                    defpackage.asq.A(defpackage.awj.d(cgcVar, 2.0f), bveVarC);
                    z10 = false;
                    bwcVar5.Y(false);
                } else if (((java.lang.Boolean) bysVarM2.a()).booleanValue() || !z3) {
                    z10 = false;
                    bveVarC.v(-113009734);
                    bwcVar5.Y(false);
                } else {
                    bveVarC.v(-113425258);
                    defpackage.asq.A(defpackage.awj.d(cgcVar, 7.0f), bveVarC);
                    z10 = false;
                    bwcVar5.Y(false);
                }
                if (((java.lang.Boolean) bysVarM2.a()).booleanValue()) {
                    bveVarC.v(-112945316);
                    defpackage.cgf cgfVarD3 = defpackage.awj.d(defpackage.awj.v(cgcVar, z10, 3), 24.0f);
                    defpackage.cty ctyVarA5 = defpackage.awb.a(atbVar4, cfyVar4, bveVarC, 54);
                    long j9 = bwcVar5.u;
                    long j10 = j9 ^ (j9 >>> 32);
                    defpackage.cdd cddVarAh5 = bwcVar5.ah();
                    defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVarC, cgfVarD3);
                    bveVarC.w();
                    if (bwcVar5.t) {
                        bveVarC.j(aferVar4);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarA5, affgVar9);
                    defpackage.byw.c(bveVarC, cddVarAh5, affgVar4);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j10), affgVar7);
                    bveVarC.i(afbkVar3, new defpackage.amc(affcVar, 16));
                    defpackage.byw.c(bveVarC, cgfVarN5, affgVar11);
                    defpackage.cgf cgfVarD4 = defpackage.awj.d(cgcVar, 32.0f);
                    if (z3) {
                        z11 = true;
                    } else {
                        cgfVarD4 = cgfVarD4.a(new defpackage.avr(0.0f, 1.0f, 0.0f, 0.0f));
                        z11 = false;
                    }
                    defpackage.bve bveVar5 = bveVarC;
                    obbVar.d(cgfVarD4.a(new defpackage.dci("clock")), ((defpackage.bol) bveVarC.f(defpackage.bom.a)).b.f, ((java.lang.Boolean) bysVarM7.a()).booleanValue(), true, z3, false, bveVar5, (i8 & 57344) | 1575936, 32);
                    bveVarC = bveVar5;
                    bwcVar5.Y(true);
                    z12 = false;
                    bwcVar5.Y(false);
                } else {
                    bveVarC.v(-112166534);
                    bwcVar5.Y(z10);
                    z11 = z3;
                    z12 = z10;
                }
                bwcVar5.Y(true);
                bwcVar5.Y(z12);
                bwcVar = bwcVar5;
                r10 = z12;
            }
            bwcVar.Y(z9);
            defpackage.bys bysVarM16 = defpackage.bxi.m(obgVar2.r, java.lang.Integer.valueOf((int) r10), bveVarC);
            if (((java.lang.Number) bysVarM16.a()).intValue() != 0) {
                bveVarC.v(-518518293);
                float f7 = defpackage.gjr.P1.k;
                defpackage.asq.A(new defpackage.awi(f7, f7, f7, f7, true), bveVarC);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-518451984);
                bwcVar.Y(false);
            }
            obbVar.n(null, ((java.lang.Number) bysVarM16.a()).intValue(), defpackage.oaz.Vertical, bveVarC, 24960);
            bwcVar.Y(z9);
            z5 = z8;
            z6 = z11;
        } else {
            obgVar2 = obgVar;
            bveVarC.s();
            z5 = z2;
            z6 = z3;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            final defpackage.obg obgVar3 = obgVar2;
            bxlVarJ.c = new defpackage.affg() { // from class: nzq
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar6 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.cgf cgfVar2 = cgfVar;
                    defpackage.ask askVar2 = askVar;
                    defpackage.obg obgVar4 = obgVar3;
                    int i19 = i | 1;
                    int i20 = 306783378 & i19;
                    int i21 = 613566756 & i19;
                    defpackage.nzs.e(cgfVar2, askVar2, obgVar4, z, z5, z6, z4, bveVar6, (i19 & (-920350135)) | i20 | (i21 >> 1) | ((i20 + i20) & i21));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    private static final java.lang.Boolean f(defpackage.bys bysVar) {
        return (java.lang.Boolean) bysVar.a();
    }
}
