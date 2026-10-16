package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class amb {
    public static final defpackage.alu a;

    static {
        new doc(true, true, 1002, 1536);
        a = new defpackage.alu(defpackage.ckd.h(-72057594037927936L, 0.38f), defpackage.ckd.h(-72057594037927936L, 0.38f));
    }

    public static final void a(defpackage.alu aluVar, defpackage.cgf cgfVar, defpackage.affh affhVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-527864079);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(aluVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affhVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            long j = defpackage.alx.a;
            defpackage.cgf cgfVarT = defpackage.bzd.t(cgfVar, 3.0f, defpackage.bcw.b(4.0f));
            long j2 = aluVar.a;
            defpackage.cgf cgfVarAY = defpackage.ca.aY(defpackage.asq.I(defpackage.ca.an(cgfVarT.a(new defpackage.ajc(-4294967296L, defpackage.cky.a))), 0.0f, 8.0f), defpackage.ca.aX(bveVarC));
            int i4 = (i2 << 3) & 7168;
            defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, 0);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarAY);
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
            affhVar.invoke(defpackage.atx.a, bveVarC, java.lang.Integer.valueOf(((i4 >> 6) & 112) | 6));
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.alz(aluVar, cgfVar, affhVar, i, 1, null);
        }
    }

    public static final void b(final java.lang.String str, final boolean z, final defpackage.alu aluVar, final defpackage.cgf cgfVar, final defpackage.affh affhVar, final defpackage.afer aferVar, defpackage.bve bveVar, final int i) {
        int i2;
        long j;
        long j2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-2001167027);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != bveVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(aluVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.E(affhVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i2) != 74898, i2 & 1)) {
            long j3 = defpackage.alx.a;
            int i5 = i2 & 112;
            defpackage.cfy cfyVar = defpackage.alx.e;
            defpackage.atc atcVarG = defpackage.ati.g(12.0f);
            boolean z2 = i5 == 32;
            boolean z3 = (458752 & i2) == 131072;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if ((z2 | z3) || objS == defpackage.bvd.a) {
                objS = new defpackage.bcp(z, aferVar, i4);
                bwcVar.ad(objS);
            }
            defpackage.cgf cgfVarI = defpackage.asq.I(defpackage.awj.l(defpackage.awj.r(defpackage.afw.x(cgfVar, z, str, null, (defpackage.afer) objS)), 112.0f, 48.0f, 280.0f, 48.0f), 12.0f, 0.0f);
            defpackage.cty ctyVarA = defpackage.awb.a(atcVarG, cfyVar, bveVarC, 54);
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarI);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar2);
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
            defpackage.awe aweVar = defpackage.awe.a;
            if (affhVar == null) {
                bveVarC.v(-1597947094);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-1597947093);
                defpackage.cgf cgfVarS = defpackage.awj.s(defpackage.cgf.e, 24.0f, 0.0f, 24.0f, 24.0f, 2);
                defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                int iF2 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh2 = bwcVar.ah();
                defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarS);
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB, affgVar);
                defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
                defpackage.byw.b(bveVarC, affcVar);
                defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
                if (z) {
                    long j4 = aluVar.c;
                    j = -72057594037927936L;
                } else {
                    j = aluVar.e;
                }
                affhVar.invoke(new defpackage.ckd(j), bveVarC, 0);
                bwcVar.Y(true);
                bwcVar.Y(false);
            }
            if (z) {
                long j5 = aluVar.b;
                j2 = -72057594037927936L;
            } else {
                j2 = aluVar.d;
            }
            defpackage.afw.J(str, aweVar.b(defpackage.cgf.e, 1.0f, true), new defpackage.dgd(j2, defpackage.alx.a, defpackage.alx.b, null, defpackage.alx.d, 5, defpackage.alx.c, 16613240), 0, false, 1, 0, bveVarC, (i2 & 14) | 1572864, 952);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: ama
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    java.lang.String str2 = str;
                    boolean z4 = z;
                    int i6 = i | 1;
                    int i7 = 306783378 & i6;
                    int i8 = 613566756 & i6;
                    defpackage.amb.b(str2, z4, aluVar, cgfVar, affhVar, aferVar, bveVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void c(defpackage.cgf cgfVar, defpackage.alu aluVar, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2 = i & 384;
        int i3 = i | 54;
        defpackage.bve bveVarC = bveVar.c(-625529233);
        if (i2 == 0) {
            i3 |= true != bveVarC.E(affcVar) ? 128 : 256;
        }
        int i4 = 0;
        if (bveVarC.I((i3 & 147) != 146, i3 & 1)) {
            cgfVar = defpackage.cgf.e;
            aluVar = a;
            a(aluVar, cgfVar, defpackage.dai.as(-250345048, true, new defpackage.aly(affcVar, aluVar, i4), bveVarC), bveVarC, ((i3 << 3) & 112) | ((i3 >> 3) & 14) | 384);
        } else {
            bveVarC.s();
        }
        defpackage.cgf cgfVar2 = cgfVar;
        defpackage.alu aluVar2 = aluVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.alz(cgfVar2, aluVar2, affcVar, i, 0);
        }
    }
}
