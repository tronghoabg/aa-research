package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jzb {
    public static final void a(defpackage.bve bveVar, int i) {
        defpackage.bve bveVarC = bveVar.c(1016448282);
        if (bveVarC.I(i != 0, i & 1)) {
            defpackage.boh.a(defpackage.day.h(2131231645, bveVarC, 0), "default card icon", defpackage.awj.i(defpackage.cgf.e, 64.0f), defpackage.kfp.i(bveVarC).s(), bveVarC, 440, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gur(i, 3);
        }
    }

    public static final void b(gwi gwiVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-388880910);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(gwiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.wf.b(defpackage.awj.r(defpackage.cgf.e), null, null, null, defpackage.afw.B(1.0f, defpackage.bxi.n(bveVarC).A), defpackage.dai.as(1330610686, true, new hkb(gwiVar, 6), bveVarC), bveVarC, 196614);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jtw(gwiVar, cgfVar, i, 19);
        }
    }

    public static /* synthetic */ java.util.List c(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.CharSequence charSequenceG = hlc.g((androidx.car.app.model.CarText) it.next());
            if (charSequenceG != null) {
                arrayList.add(androidx.car.app.model.CarText.create(charSequenceG));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void d(gfa gfaVar, uv uvVar) {
        ghk ghkVarE = defpackage.jxh.e(gfaVar);
        if (ghkVarE != null) {
            ghkVarE.g(gsv.c);
        }
        gdd.i(gfaVar, uvVar);
    }

    public static final void e(defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.affh affhVar, defpackage.affh affhVar2, defpackage.affh affhVar3, float f, float f2, long j, defpackage.affh affhVar4, defpackage.bve bveVar, int i) {
        int i2;
        java.lang.Object obj;
        java.lang.Object obj2;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar2;
        float f3;
        float f4;
        long j2;
        boolean z;
        defpackage.bna bnaVarE;
        aferVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-612207662);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            obj = affhVar;
            i4 |= true != bveVarC.E(obj) ? 128 : 256;
        } else {
            obj = affhVar;
        }
        if ((i & 3072) == 0) {
            i4 |= true != bveVarC.E(affhVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != bveVarC.E(affhVar3) ? 8192 : 16384;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            obj2 = affhVar4;
            i5 |= true != bveVarC.E(obj2) ? 33554432 : 67108864;
        } else {
            obj2 = affhVar4;
        }
        if (bveVarC.I((38347923 & i5) != 38347922, i5 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarC = defpackage.awj.c(cgcVar, 1.0f);
            int i6 = i5 & 14;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (i6 == 4 || objS == defpackage.bvd.a) {
                objS = new defpackage.kuz(aferVar, 15);
                bwcVar.ad(objS);
            }
            j2 = defpackage.cjv.j(1291845632);
            defpackage.cgf cgfVarA = defpackage.afw.x(cgfVarC, true, null, null, (defpackage.afer) objS).a(new defpackage.ajc(j2, defpackage.cky.a));
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarA);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            bveVarC.v(1840896132);
            if (defpackage.lee.a.a().b()) {
                bveVarC.v(-300645147);
                float f5 = defpackage.ksk.L3.g;
                bnaVarE = new defpackage.bna(f5, f5, f5, f5, defpackage.ksk.L0.g);
                z = false;
                bwcVar.Y(false);
            } else {
                z = false;
                bveVarC.v(-300282850);
                bwcVar.Y(false);
                bnaVarE = defpackage.vz.e(63);
            }
            bwcVar.Y(z);
            bveVar2 = bveVarC;
            defpackage.wf.a(defpackage.awj.m(cgcVar, 625.0f), null, null, bnaVarE, null, defpackage.dai.as(-2074213174, true, new fuw(obj, affhVar2, affhVar3, obj2, 9), bveVarC), bveVar2, 196608, 22);
            bwcVar.Y(true);
            f4 = 16.0f;
            cgfVar2 = cgcVar;
            f3 = 625.0f;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar2 = cgfVar;
            f3 = f;
            f4 = f2;
            j2 = j;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kvd(aferVar, cgfVar2, affhVar, affhVar2, affhVar3, f3, f4, j2, affhVar4, i);
        }
    }

    public static final void f(defpackage.bve bveVar, int i) {
        defpackage.bwc bwcVar;
        defpackage.afer aferVar;
        defpackage.bwc bwcVar2;
        defpackage.bwc bwcVar3;
        defpackage.afer aferVar2;
        defpackage.bwc bwcVar4;
        defpackage.bwc bwcVar5;
        defpackage.afer aferVar3;
        defpackage.bwc bwcVar6;
        defpackage.bwc bwcVar7;
        defpackage.bwc bwcVar8;
        defpackage.bwc bwcVar9;
        defpackage.bve bveVarC = bveVar.c(-1902271234);
        if (bveVarC.I(i != 0, i & 1)) {
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            defpackage.all allVarAX = defpackage.ca.aX(bveVarC);
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarR = defpackage.awj.r(defpackage.asq.H(defpackage.jya.i(defpackage.ca.aY(cgcVar, allVarAX), allVarAX), 8.0f));
            defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, 0);
            defpackage.bwc bwcVar10 = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar10.u);
            defpackage.cdd cddVarAh = bwcVar10.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarR);
            defpackage.afer aferVar4 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar10.t) {
                bveVarC.j(aferVar4);
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
            defpackage.brv.b("Icon", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVarC).h, bveVarC, 6, 0, 131070);
            defpackage.cne cneVarH = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zE = bveVarC.E(context);
            java.lang.Object objS = bwcVar10.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new kux(context, 17);
                bwcVar = bwcVar10;
                bwcVar.ad(objS);
            } else {
                bwcVar = bwcVar10;
            }
            defpackage.bwc bwcVar11 = bwcVar;
            defpackage.khg.m(cneVarH, (defpackage.afer) objS, null, null, false, null, null, null, null, bveVarC, 8, 0, 4092);
            defpackage.brv.b("Outlined", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVarC, 6, 0, 262142);
            defpackage.atb atbVar = defpackage.ati.a;
            defpackage.cfy cfyVar = defpackage.cfs.m;
            defpackage.cty ctyVarA2 = defpackage.awb.a(atbVar, cfyVar, bveVarC, 0);
            int iF2 = defpackage.a.f(bwcVar11.u);
            defpackage.cdd cddVarAh2 = bwcVar11.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgcVar);
            bveVarC.w();
            if (bwcVar11.t) {
                aferVar = aferVar4;
                bveVarC.j(aferVar);
            } else {
                aferVar = aferVar4;
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA2, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
            defpackage.cne cneVarH2 = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zE2 = bveVarC.E(context);
            java.lang.Object objS2 = bwcVar11.S();
            if (zE2 || objS2 == defpackage.bvd.a) {
                objS2 = new kux(context, 18);
                bwcVar11.ad(objS2);
            }
            defpackage.afer aferVar5 = aferVar;
            defpackage.khg.p(cneVarH2, (defpackage.afer) objS2, null, null, false, null, null, null, null, null, bveVarC, 8, 0, 4092);
            defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
            defpackage.cne cneVarH3 = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zE3 = bveVarC.E(context);
            java.lang.Object objS3 = bwcVar11.S();
            if (zE3 || objS3 == defpackage.bvd.a) {
                objS3 = new kux(context, 19);
                bwcVar2 = bwcVar11;
                bwcVar2.ad(objS3);
            } else {
                bwcVar2 = bwcVar11;
            }
            defpackage.bwc bwcVar12 = bwcVar2;
            defpackage.khg.o(cneVarH3, "Label", (defpackage.afer) objS3, null, null, false, null, null, null, null, null, bveVarC, 56, 0, 8184);
            defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
            boolean zE4 = bveVarC.E(context);
            java.lang.Object objS4 = bwcVar12.S();
            if (zE4 || objS4 == defpackage.bvd.a) {
                objS4 = new kux(context, 20);
                bwcVar3 = bwcVar12;
                bwcVar3.ad(objS4);
            } else {
                bwcVar3 = bwcVar12;
            }
            defpackage.bwc bwcVar13 = bwcVar3;
            defpackage.khg.o(null, "Label", (defpackage.afer) objS4, null, null, false, null, null, null, null, null, bveVarC, 54, 0, 8184);
            bwcVar13.Y(true);
            defpackage.brv.b("Tonal", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVarC, 6, 0, 262142);
            defpackage.cty ctyVarA3 = defpackage.awb.a(atbVar, cfyVar, bveVarC, 0);
            int iF3 = defpackage.a.f(bwcVar13.u);
            defpackage.cdd cddVarAh3 = bwcVar13.ah();
            defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgcVar);
            bveVarC.w();
            if (bwcVar13.t) {
                aferVar2 = aferVar5;
                bveVarC.j(aferVar2);
            } else {
                aferVar2 = aferVar5;
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA3, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh3, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN3, affgVar4);
            defpackage.cne cneVarH4 = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zE5 = bveVarC.E(context);
            java.lang.Object objS5 = bwcVar13.S();
            if (zE5 || objS5 == defpackage.bvd.a) {
                objS5 = new defpackage.kuz(context, 1);
                bwcVar13.ad(objS5);
            }
            defpackage.afer aferVar6 = aferVar2;
            defpackage.khg.s(cneVarH4, (defpackage.afer) objS5, null, null, false, false, null, null, null, null, null, null, bveVarC, 8, 0, 8188);
            defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
            int i2 = 0;
            defpackage.cne cneVarH5 = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zE6 = bveVarC.E(context);
            java.lang.Object objS6 = bwcVar13.S();
            if (zE6 || objS6 == defpackage.bvd.a) {
                objS6 = new defpackage.kuz(context, i2);
                bwcVar4 = bwcVar13;
                bwcVar4.ad(objS6);
            } else {
                bwcVar4 = bwcVar13;
            }
            defpackage.bwc bwcVar14 = bwcVar4;
            defpackage.khg.r(cneVarH5, "Label", (defpackage.afer) objS6, null, null, false, false, null, null, null, null, null, bveVarC, 56, 0, 8184);
            defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
            boolean zE7 = bveVarC.E(context);
            java.lang.Object objS7 = bwcVar14.S();
            if (zE7 || objS7 == defpackage.bvd.a) {
                objS7 = new defpackage.kuz(context, 2);
                bwcVar5 = bwcVar14;
                bwcVar5.ad(objS7);
            } else {
                bwcVar5 = bwcVar14;
            }
            defpackage.bwc bwcVar15 = bwcVar5;
            defpackage.khg.r(null, "Label", (defpackage.afer) objS7, null, null, false, false, null, null, null, null, null, bveVarC, 54, 0, 8184);
            bwcVar15.Y(true);
            defpackage.brv.b("Filled", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVarC, 6, 0, 262142);
            defpackage.cty ctyVarA4 = defpackage.awb.a(atbVar, cfyVar, bveVarC, 0);
            int iF4 = defpackage.a.f(bwcVar15.u);
            defpackage.cdd cddVarAh4 = bwcVar15.ah();
            defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgcVar);
            bveVarC.w();
            if (bwcVar15.t) {
                aferVar3 = aferVar6;
                bveVarC.j(aferVar3);
            } else {
                aferVar3 = aferVar6;
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA4, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh4, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF4), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN4, affgVar4);
            defpackage.cne cneVarH6 = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zE8 = bveVarC.E(context);
            java.lang.Object objS8 = bwcVar15.S();
            if (zE8 || objS8 == defpackage.bvd.a) {
                objS8 = new kux(context, 11);
                bwcVar15.ad(objS8);
            }
            defpackage.afer aferVar7 = aferVar3;
            defpackage.khg.j(cneVarH6, (defpackage.afer) objS8, null, null, false, false, null, null, null, null, null, null, bveVarC, 8, 0, 4092);
            defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
            defpackage.cne cneVarH7 = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zE9 = bveVarC.E(context);
            java.lang.Object objS9 = bwcVar15.S();
            if (zE9 || objS9 == defpackage.bvd.a) {
                objS9 = new kux(context, 12);
                bwcVar6 = bwcVar15;
                bwcVar6.ad(objS9);
            } else {
                bwcVar6 = bwcVar15;
            }
            defpackage.bwc bwcVar16 = bwcVar6;
            defpackage.khg.l(cneVarH7, "Label", (defpackage.afer) objS9, null, null, false, null, null, null, null, bveVarC, 56, 0, 8184);
            defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
            boolean zE10 = bveVarC.E(context);
            java.lang.Object objS10 = bwcVar16.S();
            if (zE10 || objS10 == defpackage.bvd.a) {
                objS10 = new kux(context, 13);
                bwcVar7 = bwcVar16;
                bwcVar7.ad(objS10);
            } else {
                bwcVar7 = bwcVar16;
            }
            defpackage.bwc bwcVar17 = bwcVar7;
            defpackage.khg.l(null, "Label", (defpackage.afer) objS10, null, null, false, null, null, null, null, bveVarC, 54, 0, 8184);
            bwcVar17.Y(true);
            defpackage.brv.b("Colored", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVarC, 6, 0, 262142);
            defpackage.cty ctyVarA5 = defpackage.awb.a(atbVar, cfyVar, bveVarC, 0);
            int iF5 = defpackage.a.f(bwcVar17.u);
            defpackage.cdd cddVarAh5 = bwcVar17.ah();
            defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVarC, cgcVar);
            bveVarC.w();
            if (bwcVar17.t) {
                bveVarC.j(aferVar7);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA5, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh5, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF5), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN5, affgVar4);
            defpackage.cne cneVarH8 = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zE11 = bveVarC.E(context);
            java.lang.Object objS11 = bwcVar17.S();
            if (zE11 || objS11 == defpackage.bvd.a) {
                objS11 = new kux(context, 14);
                bwcVar17.ad(objS11);
            }
            defpackage.afar afarVar = defpackage.ktl.a;
            defpackage.khg.j(cneVarH8, (defpackage.afer) objS11, null, null, false, false, null, null, defpackage.kgu.e(defpackage.kfp.i(bveVarC).C(), 0L, 0L, 0L, 0L, 0L, 0L, bveVarC, 254), null, null, null, bveVarC, 8, 0, 3836);
            defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
            defpackage.cne cneVarH9 = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zE12 = bveVarC.E(context);
            java.lang.Object objS12 = bwcVar17.S();
            if (zE12 || objS12 == defpackage.bvd.a) {
                objS12 = new kux(context, 15);
                bwcVar8 = bwcVar17;
                bwcVar8.ad(objS12);
            } else {
                bwcVar8 = bwcVar17;
            }
            defpackage.bwc bwcVar18 = bwcVar8;
            defpackage.khg.l(cneVarH9, "Label", (defpackage.afer) objS12, null, null, false, null, defpackage.kgu.e(defpackage.kfp.i(bveVarC).C(), 0L, 0L, 0L, 0L, 0L, 0L, bveVarC, 254), null, null, bveVarC, 56, 0, 7672);
            defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
            boolean zE13 = bveVarC.E(context);
            java.lang.Object objS13 = bwcVar18.S();
            if (zE13 || objS13 == defpackage.bvd.a) {
                objS13 = new kux(context, 16);
                bwcVar9 = bwcVar18;
                bwcVar9.ad(objS13);
            } else {
                bwcVar9 = bwcVar18;
            }
            defpackage.khg.l(null, "Label", (defpackage.afer) objS13, null, null, false, null, defpackage.kgu.e(defpackage.kfp.i(bveVarC).C(), 0L, 0L, 0L, 0L, 0L, 0L, bveVarC, 254), null, null, bveVarC, 54, 0, 7672);
            bveVarC = bveVarC;
            bwcVar9.Y(true);
            bwcVar9.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gur(i, 6);
        }
    }

    public static final void g(defpackage.bve bveVar, int i) {
        defpackage.bve bveVarC = bveVar.c(1373392074);
        if (bveVarC.I(i != 0, i & 1)) {
            defpackage.all allVarAX = defpackage.ca.aX(bveVarC);
            defpackage.ca.ao(defpackage.awj.r(defpackage.asq.H(defpackage.jya.i(defpackage.ca.aY(defpackage.cgf.e, allVarAX), allVarAX), 8.0f)), defpackage.ata.a(4.0f, defpackage.cfs.j), new defpackage.ate(4.0f, false, new defpackage.asx(defpackage.cfs.m, 2)), null, 0, 0, kut.f, bveVarC, 1573296, 56);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gur(i, 4);
        }
    }

    public static final void h(defpackage.bve bveVar, int i) {
        defpackage.affg affgVar;
        defpackage.affg affgVar2;
        defpackage.bve bveVar2;
        defpackage.affg affgVar3;
        defpackage.afer aferVar;
        boolean z;
        defpackage.bwc bwcVar;
        defpackage.bwc bwcVar2;
        defpackage.bwc bwcVar3;
        defpackage.bwc bwcVar4;
        defpackage.bwc bwcVar5;
        defpackage.bwc bwcVar6;
        defpackage.bwc bwcVar7;
        defpackage.bwc bwcVar8;
        defpackage.bwc bwcVar9;
        defpackage.bwc bwcVar10;
        defpackage.bwc bwcVar11;
        defpackage.bwc bwcVar12;
        defpackage.bve bveVarC = bveVar.c(1602054583);
        if (bveVarC.I(i != 0, i & 1)) {
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.m, bveVarC, 0);
            defpackage.bwc bwcVar13 = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar13.u);
            defpackage.cdd cddVarAh = bwcVar13.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgcVar);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar13.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.affg affgVar4 = defpackage.cwl.e;
            defpackage.byw.c(bveVarC, ctyVarA, affgVar4);
            defpackage.affg affgVar5 = defpackage.cwl.d;
            defpackage.byw.c(bveVarC, cddVarAh, affgVar5);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF);
            defpackage.affg affgVar6 = defpackage.cwl.f;
            defpackage.byw.c(bveVarC, numValueOf, affgVar6);
            defpackage.affc affcVar = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.affg affgVar7 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN, affgVar7);
            defpackage.all allVarAX = defpackage.ca.aX(bveVarC);
            if (allVarAX.h() || allVarAX.g()) {
                bveVarC.v(-1439304153);
                affgVar = affgVar7;
                affgVar2 = affgVar6;
                bveVar2 = bveVarC;
                affgVar3 = affgVar5;
                aferVar = aferVar2;
                defpackage.jya.h(allVarAX, defpackage.asq.J(defpackage.awj.b(cgcVar, 1.0f), 4.0f, 0.0f, 8.0f, 0.0f), false, null, null, bveVar2, 48, 28);
                z = false;
                bwcVar13.Y(false);
            } else {
                bveVarC.v(-1439173457);
                bwcVar13.Y(false);
                affgVar2 = affgVar6;
                affgVar = affgVar7;
                bveVar2 = bveVarC;
                z = false;
                affgVar3 = affgVar5;
                aferVar = aferVar2;
            }
            defpackage.cgf cgfVarR = defpackage.awj.r(defpackage.asq.H(defpackage.jya.i(defpackage.ca.aY(cgcVar, allVarAX), allVarAX), 8.0f));
            defpackage.cty ctyVarA2 = defpackage.atu.a(new defpackage.ate(8.0f, z, null), defpackage.cfs.k, bveVar2, 54);
            int iF2 = defpackage.a.f(bwcVar13.u);
            defpackage.cdd cddVarAh2 = bwcVar13.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVar2, cgfVarR);
            bveVar2.w();
            if (bwcVar13.t) {
                bveVar2.j(aferVar);
            } else {
                bveVar2.y();
            }
            defpackage.byw.c(bveVar2, ctyVarA2, affgVar4);
            defpackage.byw.c(bveVar2, cddVarAh2, affgVar3);
            defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF2), affgVar2);
            defpackage.byw.b(bveVar2, affcVar);
            defpackage.byw.c(bveVar2, cgfVarN2, affgVar);
            defpackage.bve bveVar3 = bveVar2;
            defpackage.brv.b("Simple Inline Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs = defpackage.dai.as(-226347867, true, new kva(context, 7), bveVar3);
            boolean zE = bveVar3.E(context);
            java.lang.Object objS = bwcVar13.S();
            int i2 = 11;
            if (zE || objS == defpackage.bvd.a) {
                objS = new defpackage.kuz(context, i2);
                bwcVar = bwcVar13;
                bwcVar.ad(objS);
            } else {
                bwcVar = bwcVar13;
            }
            defpackage.bwc bwcVar14 = bwcVar;
            defpackage.mcl.g(cczVarAs, (defpackage.afer) objS, null, 0, false, 0L, null, null, null, null, null, null, bveVar3, 6, 0, 4092);
            defpackage.brv.b("Simple Inline Notification no Subtitle", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs2 = defpackage.dai.as(1652863822, true, new kva(context, 8), bveVar3);
            boolean zE2 = bveVar3.E(context);
            java.lang.Object objS2 = bwcVar14.S();
            if (zE2 || objS2 == defpackage.bvd.a) {
                objS2 = new defpackage.kuz(context, 12);
                bwcVar2 = bwcVar14;
                bwcVar2.ad(objS2);
            } else {
                bwcVar2 = bwcVar14;
            }
            defpackage.bwc bwcVar15 = bwcVar2;
            defpackage.mcl.g(cczVarAs2, (defpackage.afer) objS2, null, 0, false, 0L, null, null, null, null, null, null, bveVar3, 6, 0, 4092);
            defpackage.brv.b("Simple Inline Notification no Icon", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs3 = defpackage.dai.as(-4244435, true, new jtz(context, 14), bveVar3);
            boolean zE3 = bveVar3.E(context);
            java.lang.Object objS3 = bwcVar15.S();
            if (zE3 || objS3 == defpackage.bvd.a) {
                objS3 = new kjt(context, 10);
                bwcVar3 = bwcVar15;
                bwcVar3.ad(objS3);
            } else {
                bwcVar3 = bwcVar15;
            }
            defpackage.bwc bwcVar16 = bwcVar3;
            defpackage.mcl.g(cczVarAs3, (defpackage.afer) objS3, null, 0, false, 0L, null, null, null, null, null, null, bveVar3, 6, 0, 4092);
            defpackage.brv.b("Simple Inline Notification with Icon in Subtitle", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs4 = defpackage.dai.as(-1661352692, true, new jtz(context, 15), bveVar3);
            boolean zE4 = bveVar3.E(context);
            java.lang.Object objS4 = bwcVar16.S();
            if (zE4 || objS4 == defpackage.bvd.a) {
                objS4 = new kjt(context, 11);
                bwcVar4 = bwcVar16;
                bwcVar4.ad(objS4);
            } else {
                bwcVar4 = bwcVar16;
            }
            defpackage.bwc bwcVar17 = bwcVar4;
            defpackage.mcl.g(cczVarAs4, (defpackage.afer) objS4, null, 0, false, 0L, null, null, null, null, null, null, bveVar3, 6, 0, 4092);
            defpackage.brv.b("Simple Inline Notification with Badged Icon", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs5 = defpackage.dai.as(976506347, true, new jtz(context, 20), bveVar3);
            boolean zE5 = bveVar3.E(context);
            java.lang.Object objS5 = bwcVar17.S();
            int i3 = 3;
            if (zE5 || objS5 == defpackage.bvd.a) {
                objS5 = new defpackage.kuz(context, i3);
                bwcVar5 = bwcVar17;
                bwcVar5.ad(objS5);
            } else {
                bwcVar5 = bwcVar17;
            }
            defpackage.bwc bwcVar18 = bwcVar5;
            defpackage.mcl.g(cczVarAs5, (defpackage.afer) objS5, null, 0, false, 0L, null, null, null, null, null, null, bveVar3, 6, 0, 4092);
            defpackage.brv.b("Simple Inline Work Profile Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs6 = defpackage.dai.as(-680601910, true, new kva(context, 1), bveVar3);
            boolean zE6 = bveVar3.E(context);
            java.lang.Object objS6 = bwcVar18.S();
            int i4 = 4;
            if (zE6 || objS6 == defpackage.bvd.a) {
                objS6 = new defpackage.kuz(context, i4);
                bwcVar6 = bwcVar18;
                bwcVar6.ad(objS6);
            } else {
                bwcVar6 = bwcVar18;
            }
            defpackage.bwc bwcVar19 = bwcVar6;
            defpackage.mcl.g(cczVarAs6, (defpackage.afer) objS6, null, 0, false, 0L, null, null, null, null, null, null, bveVar3, 6, 0, 4092);
            defpackage.brv.b("Simple Inline Notification with Message Count", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs7 = defpackage.dai.as(1957257129, true, new kva(context, 0), bveVar3);
            boolean zE7 = bveVar3.E(context);
            java.lang.Object objS7 = bwcVar19.S();
            int i5 = 5;
            if (zE7 || objS7 == defpackage.bvd.a) {
                objS7 = new defpackage.kuz(context, i5);
                bwcVar7 = bwcVar19;
                bwcVar7.ad(objS7);
            } else {
                bwcVar7 = bwcVar19;
            }
            defpackage.bwc bwcVar20 = bwcVar7;
            defpackage.mcl.g(cczVarAs7, (defpackage.afer) objS7, null, 0, false, 0L, null, null, null, null, null, null, bveVar3, 6, 0, 4092);
            defpackage.brv.b("Simple Inline Notification with Message Count over 9", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs8 = defpackage.dai.as(300148872, true, new kva(context, 2), bveVar3);
            boolean zE8 = bveVar3.E(context);
            java.lang.Object objS8 = bwcVar20.S();
            int i6 = 6;
            if (zE8 || objS8 == defpackage.bvd.a) {
                objS8 = new defpackage.kuz(context, i6);
                bwcVar8 = bwcVar20;
                bwcVar8.ad(objS8);
            } else {
                bwcVar8 = bwcVar20;
            }
            defpackage.bwc bwcVar21 = bwcVar8;
            defpackage.mcl.g(cczVarAs8, (defpackage.afer) objS8, null, 0, false, 0L, null, null, null, null, null, null, bveVar3, 6, 0, 4092);
            defpackage.brv.b("Single Action Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs9 = defpackage.dai.as(-1356959385, true, new kva(context, 3), bveVar3);
            boolean zE9 = bveVar3.E(context);
            java.lang.Object objS9 = bwcVar21.S();
            if (zE9 || objS9 == defpackage.bvd.a) {
                objS9 = new defpackage.kuz(context, 7);
                bwcVar9 = bwcVar21;
                bwcVar9.ad(objS9);
            } else {
                bwcVar9 = bwcVar21;
            }
            defpackage.afer aferVar3 = (defpackage.afer) objS9;
            boolean zE10 = bveVar3.E(context);
            java.lang.Object objS10 = bwcVar9.S();
            if (zE10 || objS10 == defpackage.bvd.a) {
                objS10 = new defpackage.kgo(context, 17);
                bwcVar9.ad(objS10);
            }
            defpackage.bwc bwcVar22 = bwcVar9;
            defpackage.mcl.g(cczVarAs9, aferVar3, null, 0, false, 0L, null, null, null, null, null, (defpackage.affc) objS10, bveVar3, 6, 0, 2044);
            defpackage.brv.b("Two Action Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs10 = defpackage.dai.as(1280899654, true, new kva(context, 4), bveVar3);
            boolean zE11 = bveVar3.E(context);
            java.lang.Object objS11 = bwcVar22.S();
            if (zE11 || objS11 == defpackage.bvd.a) {
                objS11 = new defpackage.kuz(context, 8);
                bwcVar10 = bwcVar22;
                bwcVar10.ad(objS11);
            } else {
                bwcVar10 = bwcVar22;
            }
            defpackage.afer aferVar4 = (defpackage.afer) objS11;
            boolean zE12 = bveVar3.E(context);
            java.lang.Object objS12 = bwcVar10.S();
            if (zE12 || objS12 == defpackage.bvd.a) {
                objS12 = new defpackage.kgo(context, 18);
                bwcVar10.ad(objS12);
            }
            defpackage.bwc bwcVar23 = bwcVar10;
            defpackage.mcl.g(cczVarAs10, aferVar4, null, 0, false, 0L, null, null, null, null, null, (defpackage.affc) objS12, bveVar3, 6, 0, 2044);
            defpackage.brv.b("Message Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            defpackage.ccz cczVarAs11 = defpackage.dai.as(1983823066, true, new kva(context, 5), bveVar3);
            boolean zE13 = bveVar3.E(context);
            java.lang.Object objS13 = bwcVar23.S();
            if (zE13 || objS13 == defpackage.bvd.a) {
                objS13 = new defpackage.kuz(context, 9);
                bwcVar11 = bwcVar23;
                bwcVar11.ad(objS13);
            } else {
                bwcVar11 = bwcVar23;
            }
            defpackage.afer aferVar5 = (defpackage.afer) objS13;
            defpackage.cgf cgfVarK = defpackage.awj.k(cgcVar, 650.0f, 200.0f);
            boolean zE14 = bveVar3.E(context);
            java.lang.Object objS14 = bwcVar11.S();
            if (zE14 || objS14 == defpackage.bvd.a) {
                objS14 = new defpackage.kgo(context, 19);
                bwcVar11.ad(objS14);
            }
            defpackage.bwc bwcVar24 = bwcVar11;
            defpackage.mcl.g(cczVarAs11, aferVar5, cgfVarK, 0, false, 0L, null, null, null, null, null, (defpackage.affc) objS14, bveVar3, 390, 0, 2040);
            defpackage.brv.b("Incoming Call Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar3, 6, 0, 262142);
            bveVarC = bveVar3;
            defpackage.ccz cczVarAs12 = defpackage.dai.as(326714809, true, new kva(context, 6), bveVarC);
            boolean zE15 = bveVarC.E(context);
            java.lang.Object objS15 = bwcVar24.S();
            if (zE15 || objS15 == defpackage.bvd.a) {
                objS15 = new defpackage.kuz(context, 10);
                bwcVar12 = bwcVar24;
                bwcVar12.ad(objS15);
            } else {
                bwcVar12 = bwcVar24;
            }
            defpackage.afer aferVar6 = (defpackage.afer) objS15;
            defpackage.cgf cgfVarK2 = defpackage.awj.k(cgcVar, 650.0f, 200.0f);
            boolean zE16 = bveVarC.E(context);
            java.lang.Object objS16 = bwcVar12.S();
            if (zE16 || objS16 == defpackage.bvd.a) {
                objS16 = new defpackage.kgo(context, 20);
                bwcVar12.ad(objS16);
            }
            defpackage.bwc bwcVar25 = bwcVar12;
            defpackage.mcl.g(cczVarAs12, aferVar6, cgfVarK2, 0, false, 0L, null, null, null, null, null, (defpackage.affc) objS16, bveVarC, 390, 0, 2040);
            bwcVar25.Y(true);
            bwcVar25.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gur(i, 7);
        }
    }

    public static final void i(android.content.Context context, java.lang.String str) {
        l(context, str.concat(" clicked"));
    }

    public static final void j(android.content.Context context, java.lang.String str) {
        l(context, str.concat(" closed"));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0187  */
    /* JADX WARN: Code duplicated, block: B:26:0x018d  */
    /* JADX WARN: Code duplicated, block: B:29:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:33:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x0224  */
    /* JADX WARN: Code duplicated, block: B:43:0x0263  */
    /* JADX WARN: Code duplicated, block: B:47:0x026b  */
    public static final void k(defpackage.bve bveVar, int i) {
        java.lang.Object obj;
        defpackage.bwx bwxVar;
        defpackage.bwc bwcVar;
        java.lang.Object obj2;
        defpackage.bwc bwcVar2;
        defpackage.bwx bwxVar2;
        boolean zE;
        java.lang.Object objS;
        java.lang.Object obj3;
        defpackage.bwx bwxVar3;
        defpackage.bwx bwxVar4;
        boolean zE2;
        java.lang.Object objS2;
        defpackage.bwx bwxVar5;
        defpackage.bwc bwcVar3;
        defpackage.bwc bwcVar4;
        defpackage.bwx bwxVar6;
        boolean zE3;
        java.lang.Object objS3;
        defpackage.bwc bwcVar5;
        defpackage.bve bveVarC = bveVar.c(-382390030);
        if (bveVarC.I(i != 0, i & 1)) {
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            defpackage.all allVarAX = defpackage.ca.aX(bveVarC);
            defpackage.bwc bwcVar6 = (defpackage.bwc) bveVarC;
            java.lang.Object objS4 = bwcVar6.S();
            java.lang.Object obj4 = defpackage.bvd.a;
            if (objS4 == obj4) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar6.ad(parcelableSnapshotMutableState);
                objS4 = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar7 = (defpackage.bwx) objS4;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarR = defpackage.awj.r(defpackage.asq.H(defpackage.jya.i(defpackage.ca.aY(cgcVar, allVarAX), allVarAX), 8.0f));
            defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, 0);
            int iF = defpackage.a.f(bwcVar6.u);
            defpackage.cdd cddVarAh = bwcVar6.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarR);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar6.t) {
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
            defpackage.brv.b("Icon", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVarC).h, bveVarC, 6, 0, 131070);
            defpackage.cne cneVarH = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zBooleanValue = ((java.lang.Boolean) bwxVar7.a()).booleanValue();
            boolean zE4 = bveVarC.E(context);
            java.lang.Object objS5 = bwcVar6.S();
            if (zE4) {
                obj = obj4;
            } else {
                obj = obj4;
                if (objS5 != obj) {
                    bwxVar = bwxVar7;
                    bwcVar = bwcVar6;
                }
                obj2 = obj;
                bwcVar2 = bwcVar;
                bwxVar2 = bwxVar;
                defpackage.jxs.d(cneVarH, zBooleanValue, (defpackage.affc) objS5, null, null, false, null, null, null, null, bveVarC, 8, 0, 2040);
                defpackage.brv.b("Filled", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVarC, 6, 0, 262142);
                bveVarC = bveVarC;
                defpackage.cty ctyVarA2 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.m, bveVarC, 0);
                int iF2 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh2 = bwcVar2.ah();
                defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgcVar);
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
                defpackage.cne cneVarH2 = defpackage.day.h(2131232637, bveVarC, 0);
                boolean zBooleanValue2 = ((java.lang.Boolean) bwxVar2.a()).booleanValue();
                zE = bveVarC.E(context);
                objS = bwcVar2.S();
                if (zE) {
                    obj3 = obj2;
                } else {
                    obj3 = obj2;
                    if (objS == obj3) {
                        bwxVar3 = bwxVar2;
                    }
                    java.lang.Object obj5 = obj3;
                    bwxVar4 = bwxVar3;
                    defpackage.jxs.g(cneVarH2, zBooleanValue2, (defpackage.affc) objS, null, null, false, null, null, null, null, bveVarC, 8, 0);
                    defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
                    defpackage.cne cneVarH3 = defpackage.day.h(2131232637, bveVarC, 0);
                    boolean zBooleanValue3 = ((java.lang.Boolean) bwxVar4.a()).booleanValue();
                    zE2 = bveVarC.E(context);
                    objS2 = bwcVar2.S();
                    if (!zE2 || objS2 == obj5) {
                        bwxVar5 = bwxVar4;
                        objS2 = new defpackage.jxq(context, bwxVar5, 10);
                        bwcVar3 = bwcVar2;
                        bwcVar3.ad(objS2);
                    } else {
                        bwcVar3 = bwcVar2;
                        bwxVar5 = bwxVar4;
                    }
                    bwcVar4 = bwcVar3;
                    bwxVar6 = bwxVar5;
                    defpackage.jxs.h(cneVarH3, zBooleanValue3, (defpackage.affc) objS2, null, null, false, null, null, null, null, bveVarC, 56, 0);
                    defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
                    boolean zBooleanValue4 = ((java.lang.Boolean) bwxVar6.a()).booleanValue();
                    zE3 = bveVarC.E(context);
                    objS3 = bwcVar4.S();
                    if (!zE3 || objS3 == obj5) {
                        objS3 = new defpackage.jxq(context, bwxVar6, 11);
                        bwcVar5 = bwcVar4;
                        bwcVar5.ad(objS3);
                    } else {
                        bwcVar5 = bwcVar4;
                    }
                    defpackage.jxs.h(null, zBooleanValue4, (defpackage.affc) objS3, null, null, false, null, null, null, null, bveVarC, 54, 0);
                    bwcVar5.Y(true);
                    bwcVar5.Y(true);
                }
                bwxVar3 = bwxVar2;
                objS = new defpackage.jxq(context, bwxVar3, 9);
                bwcVar2.ad(objS);
                java.lang.Object obj6 = obj3;
                bwxVar4 = bwxVar3;
                defpackage.jxs.g(cneVarH2, zBooleanValue2, (defpackage.affc) objS, null, null, false, null, null, null, null, bveVarC, 8, 0);
                defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
                defpackage.cne cneVarH4 = defpackage.day.h(2131232637, bveVarC, 0);
                boolean zBooleanValue5 = ((java.lang.Boolean) bwxVar4.a()).booleanValue();
                zE2 = bveVarC.E(context);
                objS2 = bwcVar2.S();
                if (zE2) {
                    bwxVar5 = bwxVar4;
                    objS2 = new defpackage.jxq(context, bwxVar5, 10);
                    bwcVar3 = bwcVar2;
                    bwcVar3.ad(objS2);
                } else {
                    bwxVar5 = bwxVar4;
                    objS2 = new defpackage.jxq(context, bwxVar5, 10);
                    bwcVar3 = bwcVar2;
                    bwcVar3.ad(objS2);
                }
                bwcVar4 = bwcVar3;
                bwxVar6 = bwxVar5;
                defpackage.jxs.h(cneVarH4, zBooleanValue5, (defpackage.affc) objS2, null, null, false, null, null, null, null, bveVarC, 56, 0);
                defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
                boolean zBooleanValue6 = ((java.lang.Boolean) bwxVar6.a()).booleanValue();
                zE3 = bveVarC.E(context);
                objS3 = bwcVar4.S();
                if (zE3) {
                    objS3 = new defpackage.jxq(context, bwxVar6, 11);
                    bwcVar5 = bwcVar4;
                    bwcVar5.ad(objS3);
                } else {
                    objS3 = new defpackage.jxq(context, bwxVar6, 11);
                    bwcVar5 = bwcVar4;
                    bwcVar5.ad(objS3);
                }
                defpackage.jxs.h(null, zBooleanValue6, (defpackage.affc) objS3, null, null, false, null, null, null, null, bveVarC, 54, 0);
                bwcVar5.Y(true);
                bwcVar5.Y(true);
            }
            bwxVar = bwxVar7;
            objS5 = new defpackage.jxq(context, bwxVar, 8);
            bwcVar = bwcVar6;
            bwcVar.ad(objS5);
            obj2 = obj;
            bwcVar2 = bwcVar;
            bwxVar2 = bwxVar;
            defpackage.jxs.d(cneVarH, zBooleanValue, (defpackage.affc) objS5, null, null, false, null, null, null, null, bveVarC, 8, 0, 2040);
            defpackage.brv.b("Filled", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVarC, 6, 0, 262142);
            bveVarC = bveVarC;
            defpackage.cty ctyVarA3 = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.m, bveVarC, 0);
            int iF3 = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh3 = bwcVar2.ah();
            defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgcVar);
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
            defpackage.cne cneVarH5 = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zBooleanValue7 = ((java.lang.Boolean) bwxVar2.a()).booleanValue();
            zE = bveVarC.E(context);
            objS = bwcVar2.S();
            if (zE) {
                obj3 = obj2;
                if (objS == obj3) {
                    bwxVar3 = bwxVar2;
                }
                java.lang.Object obj7 = obj3;
                bwxVar4 = bwxVar3;
                defpackage.jxs.g(cneVarH5, zBooleanValue7, (defpackage.affc) objS, null, null, false, null, null, null, null, bveVarC, 8, 0);
                defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
                defpackage.cne cneVarH6 = defpackage.day.h(2131232637, bveVarC, 0);
                boolean zBooleanValue8 = ((java.lang.Boolean) bwxVar4.a()).booleanValue();
                zE2 = bveVarC.E(context);
                objS2 = bwcVar2.S();
                if (zE2) {
                    bwxVar5 = bwxVar4;
                    objS2 = new defpackage.jxq(context, bwxVar5, 10);
                    bwcVar3 = bwcVar2;
                    bwcVar3.ad(objS2);
                } else {
                    bwxVar5 = bwxVar4;
                    objS2 = new defpackage.jxq(context, bwxVar5, 10);
                    bwcVar3 = bwcVar2;
                    bwcVar3.ad(objS2);
                }
                bwcVar4 = bwcVar3;
                bwxVar6 = bwxVar5;
                defpackage.jxs.h(cneVarH6, zBooleanValue8, (defpackage.affc) objS2, null, null, false, null, null, null, null, bveVarC, 56, 0);
                defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
                boolean zBooleanValue9 = ((java.lang.Boolean) bwxVar6.a()).booleanValue();
                zE3 = bveVarC.E(context);
                objS3 = bwcVar4.S();
                if (zE3) {
                    objS3 = new defpackage.jxq(context, bwxVar6, 11);
                    bwcVar5 = bwcVar4;
                    bwcVar5.ad(objS3);
                } else {
                    objS3 = new defpackage.jxq(context, bwxVar6, 11);
                    bwcVar5 = bwcVar4;
                    bwcVar5.ad(objS3);
                }
                defpackage.jxs.h(null, zBooleanValue9, (defpackage.affc) objS3, null, null, false, null, null, null, null, bveVarC, 54, 0);
                bwcVar5.Y(true);
                bwcVar5.Y(true);
            } else {
                obj3 = obj2;
            }
            bwxVar3 = bwxVar2;
            objS = new defpackage.jxq(context, bwxVar3, 9);
            bwcVar2.ad(objS);
            java.lang.Object obj8 = obj3;
            bwxVar4 = bwxVar3;
            defpackage.jxs.g(cneVarH5, zBooleanValue7, (defpackage.affc) objS, null, null, false, null, null, null, null, bveVarC, 8, 0);
            defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
            defpackage.cne cneVarH7 = defpackage.day.h(2131232637, bveVarC, 0);
            boolean zBooleanValue10 = ((java.lang.Boolean) bwxVar4.a()).booleanValue();
            zE2 = bveVarC.E(context);
            objS2 = bwcVar2.S();
            if (zE2) {
                bwxVar5 = bwxVar4;
                objS2 = new defpackage.jxq(context, bwxVar5, 10);
                bwcVar3 = bwcVar2;
                bwcVar3.ad(objS2);
            } else {
                bwxVar5 = bwxVar4;
                objS2 = new defpackage.jxq(context, bwxVar5, 10);
                bwcVar3 = bwcVar2;
                bwcVar3.ad(objS2);
            }
            bwcVar4 = bwcVar3;
            bwxVar6 = bwxVar5;
            defpackage.jxs.h(cneVarH7, zBooleanValue10, (defpackage.affc) objS2, null, null, false, null, null, null, null, bveVarC, 56, 0);
            defpackage.asq.A(defpackage.awj.i(cgcVar, 8.0f), bveVarC);
            boolean zBooleanValue11 = ((java.lang.Boolean) bwxVar6.a()).booleanValue();
            zE3 = bveVarC.E(context);
            objS3 = bwcVar4.S();
            if (zE3) {
                objS3 = new defpackage.jxq(context, bwxVar6, 11);
                bwcVar5 = bwcVar4;
                bwcVar5.ad(objS3);
            } else {
                objS3 = new defpackage.jxq(context, bwxVar6, 11);
                bwcVar5 = bwcVar4;
                bwcVar5.ad(objS3);
            }
            defpackage.jxs.h(null, zBooleanValue11, (defpackage.affc) objS3, null, null, false, null, null, null, null, bveVarC, 54, 0);
            bwcVar5.Y(true);
            bwcVar5.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gur(i, 5);
        }
    }

    public static final void l(android.content.Context context, java.lang.String str) {
        defpackage.ocn.a().g(context, new android.content.ComponentName(context, (java.lang.Class<?>) defpackage.kuv.class), str, 0);
    }

    public static /* synthetic */ defpackage.afbk m(defpackage.bve bveVar, int i) {
        if (bveVar.I((i & 3) != 2, i & 1)) {
            defpackage.boh.a(defpackage.day.h(2131231574, bveVar, 0), null, defpackage.awj.i(defpackage.cgf.e, 40.0f), defpackage.ksx.j(defpackage.kry.h, bveVar), bveVar, 440, 0);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static final void n(defpackage.bve bveVar) {
        defpackage.brv.b("Subtitle", null, defpackage.ksx.j(defpackage.kry.D, bveVar), 0L, null, 0L, null, 0L, 2, false, 1, 0, defpackage.bxi.p(bveVar).e, bveVar, 6, 24960, 110586);
    }

    public static final void o(defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        defpackage.brv.b("Title", i != 0 ? defpackage.cgf.e : cgfVar, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, defpackage.bxi.p(bveVar).d, bveVar, 6, 24960, 110588);
    }

    public static /* synthetic */ defpackage.afbk p(defpackage.mcl mclVar, defpackage.bve bveVar, int i) {
        mclVar.getClass();
        if (bveVar.I((i & 17) != 16, i & 1)) {
            n(bveVar);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static /* synthetic */ defpackage.afbk q(defpackage.lyd lydVar, defpackage.bve bveVar, int i) {
        lydVar.getClass();
        if (bveVar.I((i & 17) != 16, i & 1)) {
            o(null, bveVar, 1);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static defpackage.lbr r() {
        return (defpackage.lbr) defpackage.mkp.a.i(defpackage.lbr.class);
    }

    public static defpackage.lbq s() {
        return (defpackage.lbq) defpackage.mkp.a.i(defpackage.lbq.class);
    }

    public static int t(android.content.Intent intent) {
        if (defpackage.maw.a.contains(intent.getPackage())) {
            return 2;
        }
        if (defpackage.jrk.d(intent)) {
            return 3;
        }
        if (defpackage.jrk.e(intent)) {
            return 5;
        }
        return (intent == null || !"android.intent.action.CALL".equals(intent.getAction())) ? 1 : 4;
    }

    public static java.lang.CharSequence u(android.content.Context context, oth othVar) {
        java.util.List listG;
        defpackage.gjt gjtVar = new defpackage.gjt(context, 16);
        if (othVar.d) {
            listG = othVar.b;
        } else {
            int i = defpackage.ygw.d;
            defpackage.ygr ygrVar = new defpackage.ygr(4);
            ygrVar.i("");
            ygrVar.k(othVar.b);
            listG = ygrVar.g();
        }
        defpackage.abpj abpjVar = othVar.c;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i2 = 0;
        int length = 0;
        while (i2 < java.lang.Math.max(listG.size(), abpjVar.size())) {
            java.lang.String str = i2 < listG.size() ? (java.lang.String) listG.get(i2) : "";
            spannableStringBuilder.append((java.lang.CharSequence) str);
            length += str.length();
            if (i2 < abpjVar.size()) {
                spannableStringBuilder.append((java.lang.CharSequence) "  ");
                spannableStringBuilder.setSpan(a$.ExternalSyntheticApiModelOutline2.m(gjtVar, (ota) abpjVar.get(i2)), length, length + 1, 0);
                length += 2;
            }
            i2++;
        }
        return spannableStringBuilder;
    }
}
