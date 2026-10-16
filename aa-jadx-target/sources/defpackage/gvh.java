package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gvh {
    public static final void a(gvk gvkVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        long j;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(622542438);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(gvkVar) : bveVarC.E(gvkVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                cgfVar = defpackage.cgf.e;
            }
            defpackage.ckd ckdVar = gvkVar.b;
            if (ckdVar == null) {
                bveVarC.v(1262833997);
                j = defpackage.bxi.n(bveVarC).p;
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(1262832168);
                ((defpackage.bwc) bveVarC).Y(false);
                j = ckdVar.a;
            }
            defpackage.dai.aA(ggl.a.b(new defpackage.ckd(j)), defpackage.dai.as(1893724582, true, new guq(gvkVar, cgfVar, 4, (byte[]) null), bveVarC), bveVarC, 56);
        } else {
            bveVarC.s();
        }
        defpackage.cgf cgfVar2 = cgfVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.fxi(gvkVar, cgfVar2, i, i2, 5);
        }
    }

    public static final void b(defpackage.cgf cgfVar, hcv hcvVar, boolean z, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(284861088);
        if (i3 == 0) {
            i2 = i | (true != bveVarC.C(cgfVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(hcvVar) : bveVarC.E(hcvVar)) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            hcg.b(hcvVar, defpackage.ats.a.a(defpackage.awj.u(defpackage.cgf.e, null, 3), defpackage.cfs.e), (defpackage.axx) null, (defpackage.avv) null, bveVarC, ((i2 >> 3) & 14) | 8, 12);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gvy(cgfVar, hcvVar, z, i, 0);
        }
    }

    public static final void c(hkd hkdVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-854535418);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(hkdVar) : bveVarC.E(hkdVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgcVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            if (hkdVar == null) {
                bveVarC.v(-619666725);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-619666724);
                defpackage.xi.a(null, 0.0f, 0L, bveVarC, 0, 7);
                gwa.f(hkdVar, cgfVar, bveVarC, i2 & 112, 0);
                bwcVar.Y(false);
            }
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new guv(hkdVar, cgfVar, i, 9, (byte[]) null);
        }
    }

    public static final void d(defpackage.cit citVar, gwb gwbVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1235293290);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(citVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(gwbVar) : bveVarC.E(gwbVar)) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i4 = i2 & 14;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (i4 == 4 || objS == defpackage.bvd.a) {
                objS = new gjf(citVar, (defpackage.afdk) null, 2, (byte[]) null);
                bwcVar.ad(objS);
            }
            defpackage.bvx.g(gwbVar, (defpackage.affg) objS, bveVarC);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new guv(citVar, gwbVar, i, 10);
        }
    }

    public static final void e(gwb gwbVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1647778746);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(gwbVar) : bveVarC.E(gwbVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.cit();
                bwcVar.ad(objS);
            }
            defpackage.cit citVar = (defpackage.cit) objS;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new defpackage.cit();
                bwcVar.ad(objS2);
            }
            defpackage.cit citVar2 = (defpackage.cit) objS2;
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                objS3 = new defpackage.cit();
                bwcVar.ad(objS3);
            }
            defpackage.cit citVar3 = (defpackage.cit) objS3;
            defpackage.cit citVar4 = true != gwbVar.a() ? citVar2 : citVar3;
            defpackage.dai.aA(gfr.a.b(gfr.a(gwbVar.a != null, bveVarC)), defpackage.dai.as(1722548346, true, new gvz(gwbVar, citVar, citVar2, citVar3, 0), bveVarC), bveVarC, 56);
            d(citVar4, gwbVar, bveVarC, ((i2 << 3) & 112) | 64);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new guv(gwbVar, cgfVar, i, 11, (byte[]) null);
        }
    }

    public static final long f() {
        defpackage.wog wogVar = defpackage.hjj.a;
        return defpackage.cjv.j(defpackage.hjj.c.a(70));
    }

    public static final long g() {
        defpackage.wog wogVar = defpackage.hjj.a;
        return defpackage.cjv.j(defpackage.hjj.b.a(70));
    }

    public static final long h() {
        defpackage.wog wogVar = defpackage.hjj.a;
        return defpackage.cjv.j(defpackage.hjj.a.a(70));
    }

    public static final long i() {
        defpackage.wog wogVar = defpackage.hjj.a;
        return defpackage.cjv.j(defpackage.hjj.d.a(70));
    }

    public static final defpackage.hjb j(int i) {
        defpackage.woe woeVar = new defpackage.woe(i);
        double d = woeVar.a;
        double d2 = woeVar.b;
        defpackage.wog wogVarB = defpackage.wog.b(d, d2);
        defpackage.wog wogVarB2 = defpackage.wog.b(d, d2 / 3.0d);
        defpackage.wog wogVarB3 = defpackage.wog.b(60.0d + d, d2 / 2.0d);
        defpackage.wog wogVarB4 = defpackage.wog.b(d, java.lang.Math.min(d2 / 12.0d, 4.0d));
        defpackage.wog wogVarB5 = defpackage.wog.b(d, java.lang.Math.min(d2 / 6.0d, 8.0d));
        defpackage.wog.b(25.0d, 84.0d);
        return new defpackage.hjb(wogVarB, wogVarB2, wogVarB3, wogVarB4, wogVarB5);
    }
}
