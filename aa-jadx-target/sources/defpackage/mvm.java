package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class mvm {
    public static android.view.View A(android.view.View view) {
        android.view.View view2 = null;
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.getVisibility() != 0 || (view.willNotDraw() && view.getForeground() == null && view.getBackground() == null)) {
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    android.view.View viewA = A(viewGroup.getChildAt(i));
                    if (viewA != null) {
                        if (view2 == null) {
                            view2 = viewA;
                        }
                    }
                }
            }
            return view2;
        }
        return view;
    }

    public static void B(android.view.View view, java.util.List list) {
        if (view.getId() == 16908288) {
            list.add(view);
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                B(viewGroup.getChildAt(i), list);
            }
        }
    }

    public static oqc C(defpackage.bwx bwxVar) {
        return (oqc) bwxVar.a();
    }

    public static java.lang.String D(defpackage.bwx bwxVar) {
        return (java.lang.String) bwxVar.a();
    }

    public static void E(oqf oqfVar, boolean z, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        defpackage.cno cnoVar;
        defpackage.cno cnoVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(182374259);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(oqfVar) : bveVarC.E(oqfVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.cne cneVarC = ijt.c(oqfVar.b, bveVarC);
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarX = defpackage.afw.x(defpackage.awj.r(cgcVar), true, null, null, aferVar);
            float f = defpackage.gjr.P3.k;
            defpackage.cgf cgfVarH = defpackage.asq.H(cgfVarX, f);
            defpackage.cfy cfyVar = defpackage.cfs.n;
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.g, cfyVar, bveVarC, 54);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarH);
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
            defpackage.cty ctyVarA2 = defpackage.awb.a(defpackage.ati.a, cfyVar, bveVarC, 48);
            int iF2 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh2 = bwcVar.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgcVar);
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA2, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
            defpackage.ca.bb(cneVarC, null, defpackage.awj.i(cgcVar, 48.0f), null, null, 0.0f, null, bveVarC, 56, 120);
            defpackage.asq.A(defpackage.awj.m(cgcVar, f), bveVarC);
            defpackage.cty ctyVarA3 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, 0);
            int iF3 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh3 = bwcVar.ah();
            defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgcVar);
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA3, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh3, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN3, affgVar4);
            bveVar2 = bveVarC;
            defpackage.brv.b(oqfVar.a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVarC).h, 0L, 0L, defpackage.dil.l, null, defpackage.dax.k(defpackage.dax.j(2131296319)), null, 0L, null, 0, 0, 0L, null, null, 16777179), bveVar2, 0, 0, 131070);
            java.util.List list = oqfVar.c;
            defpackage.brv.b(((android.content.res.Resources) bveVar2.f(defpackage.daj.c)).getQuantityString(2131951650, list.size(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(list.size())}, 1)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVar2).k, defpackage.bxi.n(bveVar2).s, 0L, null, null, defpackage.dax.k(defpackage.dax.j(2131296319)), null, 0L, null, 0, 0, 0L, null, null, 16777182), bveVar2, 0, 0, 131070);
            bwcVar.Y(true);
            bwcVar.Y(true);
            if (z) {
                cnoVar2 = defpackage.vm.a;
                if (cnoVar2 == null) {
                    float f2 = 24.0f;
                    defpackage.cnn cnnVar = new defpackage.cnn("Filled.KeyboardArrowUp", f2, f2, f2, f2, 0L, 0, false, 96);
                    defpackage.clf clfVar = new defpackage.clf(-72057594037927936L);
                    java.util.ArrayList arrayList = new java.util.ArrayList(32);
                    defpackage.rq.l(7.41f, 15.41f, arrayList);
                    defpackage.rq.j(12.0f, 10.83f, arrayList);
                    defpackage.rq.k(4.59f, 4.58f, arrayList);
                    defpackage.rq.j(18.0f, 14.0f, arrayList);
                    defpackage.rq.k(-6.0f, -6.0f, arrayList);
                    defpackage.rq.k(-6.0f, 6.0f, arrayList);
                    defpackage.rq.g(arrayList);
                    cnnVar.c(arrayList, 0, "", clfVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                    defpackage.vm.a = cnnVar.a();
                    cnoVar2 = defpackage.vm.a;
                    cnoVar2.getClass();
                }
            } else {
                defpackage.cno cnoVar3 = defpackage.ud.a;
                if (cnoVar3 == null) {
                    float f3 = 24.0f;
                    defpackage.cnn cnnVar2 = new defpackage.cnn("Filled.KeyboardArrowDown", f3, f3, f3, f3, 0L, 0, false, 96);
                    defpackage.clf clfVar2 = new defpackage.clf(-72057594037927936L);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(32);
                    defpackage.rq.l(7.41f, 8.59f, arrayList2);
                    defpackage.rq.j(12.0f, 13.17f, arrayList2);
                    defpackage.rq.k(4.59f, -4.58f, arrayList2);
                    defpackage.rq.j(18.0f, 10.0f, arrayList2);
                    defpackage.rq.k(-6.0f, 6.0f, arrayList2);
                    defpackage.rq.k(-6.0f, -6.0f, arrayList2);
                    defpackage.rq.k(1.41f, -1.41f, arrayList2);
                    defpackage.rq.g(arrayList2);
                    cnnVar2.c(arrayList2, 0, "", clfVar2, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                    defpackage.ud.a = cnnVar2.a();
                    cnoVar2 = defpackage.ud.a;
                    cnoVar2.getClass();
                } else {
                    cnoVar = cnoVar3;
                }
                defpackage.boh.b(cnoVar, null, 0L, bveVar2, 48);
                bwcVar.Y(true);
            }
            cnoVar = cnoVar2;
            defpackage.boh.b(cnoVar, null, 0L, bveVar2, 48);
            bwcVar.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gvy(oqfVar, z, aferVar, i, 11);
        }
    }

    public static void F(java.util.List list, java.util.Set set, defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.axx axxVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.affc affcVar3;
        defpackage.affc affcVar4;
        defpackage.bve bveVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1722364161);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(list) : bveVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(set) : bveVarC.E(set)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            affcVar3 = affcVar;
            i2 |= true != bveVarC.E(affcVar3) ? 128 : 256;
        } else {
            affcVar3 = affcVar;
        }
        if ((i & 3072) == 0) {
            affcVar4 = affcVar2;
            i2 |= true != bveVarC.E(affcVar4) ? 1024 : 2048;
        } else {
            affcVar4 = affcVar2;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.C(axxVar) ? 8192 : 16384;
        }
        int i4 = i2;
        if (bveVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            defpackage.kwv kwvVar = (defpackage.kwv) bveVarC.f(defpackage.dbl.g);
            defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.cgf.e, 1.0f);
            int i5 = i4 & 14;
            defpackage.atc atcVarG = defpackage.ati.g(2.0f);
            boolean zE = (i5 == 4 || ((i4 & 8) != 0 && bveVarC.E(list))) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && bveVarC.E(set))) | bveVarC.E(kwvVar);
            boolean z = (i4 & 896) == 256;
            boolean z2 = (i4 & 7168) == 2048;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if ((zE | z | z2) || objS == defpackage.bvd.a) {
                nzz nzzVar = new nzz(list, set, kwvVar, affcVar3, affcVar4, 5);
                bwcVar.ad(nzzVar);
                objS = nzzVar;
            }
            bveVar2 = bveVarC;
            defpackage.axd.c(cgfVarC, axxVar, null, atcVarG, null, null, false, null, (defpackage.affc) objS, bveVar2, ((i4 >> 9) & 112) | 24582, 492);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gbt(list, set, affcVar, affcVar2, axxVar, i, 6);
        }
    }

    public static void G(defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1310257943);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarR = defpackage.awj.r(cgcVar);
            float f = defpackage.gjr.P4.k;
            float f2 = defpackage.gjr.P1.k;
            defpackage.cgf cgfVarJ = defpackage.asq.J(cgfVarR, f, f2, defpackage.gjr.P3.k, f2);
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarJ);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.rq.c(aferVar, defpackage.afw.E(defpackage.awj.i(cgcVar, 40.0f), defpackage.bxi.n(bveVarC).H, defpackage.bcw.a), false, null, null, opa.a, bveVarC, (i2 & 14) | 1572864, 60);
            defpackage.asq.A(defpackage.awj.m(cgcVar, 20.0f), bveVarC);
            defpackage.brv.b(defpackage.vm.e(2132083087, bveVarC), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVarC).g, 0L, 0L, defpackage.dil.l, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211), bveVarC, 0, 0, 131070);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nlu(aferVar, i, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0239  */
    /* JADX WARN: Code duplicated, block: B:95:0x0241  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [ask, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [ask, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v22 */
    public static void H(oqm oqmVar, boolean z, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        boolean z2;
        defpackage.cgf cgfVarX;
        defpackage.cgf cgfVarX2;
        ?? r12;
        defpackage.cgf cgfVarX3;
        boolean z3;
        boolean z4;
        boolean z5;
        oqm oqmVar2;
        boolean z6;
        boolean z7;
        java.lang.Object objS;
        ?? r1;
        oqm oqmVar3 = oqmVar;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1831196627);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(oqmVar3) : bveVarC.E(oqmVar3)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS2 = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS2 = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS2;
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Float.valueOf(0.0f), defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState2);
                objS3 = parcelableSnapshotMutableState2;
            }
            defpackage.bwx bwxVar2 = (defpackage.bwx) objS3;
            defpackage.kwv kwvVar = (defpackage.kwv) bveVarC.f(defpackage.dbl.g);
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarH = defpackage.asq.H(defpackage.awj.r(cgcVar), defpackage.gjr.P3.k);
            if (((java.lang.Boolean) bwxVar.a()).booleanValue()) {
                bveVarC.v(1156646413);
                java.lang.Object objS4 = bwcVar.S();
                if (objS4 == obj) {
                    objS4 = new defpackage.oph(bwxVar, 13);
                    bwcVar.ad(objS4);
                }
                cgfVarX = defpackage.afw.x(cgcVar, true, null, null, (defpackage.afer) objS4);
                bwcVar.Y(false);
            } else {
                bveVarC.v(1156647605);
                bwcVar.Y(false);
                cgfVarX = cgcVar;
            }
            defpackage.cgf cgfVarAn = defpackage.dai.an(cgfVarH.a(cgfVarX), z ? 0.6f : ((java.lang.Number) bwxVar2.a()).floatValue());
            defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, 0);
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarAn);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
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
            defpackage.affc affcVar2 = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar2);
            defpackage.affg affgVar4 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN, affgVar4);
            android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = oqmVar3.c;
            defpackage.cgf cgfVarR = defpackage.awj.r(cgcVar);
            if (((java.lang.Boolean) bwxVar.a()).booleanValue() || z) {
                bveVarC.v(-2144736283);
                bwcVar.Y(false);
                cgfVarX2 = cgcVar;
            } else {
                bveVarC.v(-2144911588);
                boolean zE = bveVarC.E(kwvVar);
                java.lang.Object objS5 = bwcVar.S();
                if (zE || objS5 == obj) {
                    r1 = 0;
                    objS5 = new opl(kwvVar, bwxVar, 8, (byte[]) null);
                    bwcVar.ad(objS5);
                } else {
                    r1 = 0;
                }
                cgfVarX2 = defpackage.afw.x(cgcVar, true, r1, r1, (defpackage.afer) objS5);
                bwcVar.Y(false);
            }
            defpackage.cgf cgfVarA = cgfVarR.a(cgfVarX2);
            java.lang.Object objS6 = bwcVar.S();
            if (objS6 == obj) {
                objS6 = new defpackage.oph(bwxVar2, 14);
                bwcVar.ad(objS6);
            }
            ag(appWidgetProviderInfo, cgfVarA, null, false, (defpackage.afer) objS6, bveVarC, 24576, 12);
            float f = defpackage.gjr.P2.k;
            defpackage.asq.A(defpackage.awj.d(cgcVar, f), bveVarC);
            if (((java.lang.Boolean) bwxVar.a()).booleanValue()) {
                bveVarC.v(-2144583546);
                defpackage.cgf cgfVarR2 = defpackage.awj.r(cgcVar);
                defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
                int iF2 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh2 = bwcVar.ah();
                defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarR2);
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB, affgVar);
                defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
                defpackage.byw.b(bveVarC, affcVar2);
                defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
                boolean z8 = (i2 & 896) == 256;
                if ((i2 & 14) != 4) {
                    if ((i2 & 8) != 0) {
                        oqmVar2 = oqmVar;
                        if (bveVarC.E(oqmVar2)) {
                        }
                        z7 = z6 | z8;
                        objS = bwcVar.S();
                        if (z7 || objS == obj) {
                            objS = new opl(affcVar, oqmVar2, 9, (byte[]) null);
                            bwcVar.ad(objS);
                        }
                        defpackage.bxi.q((defpackage.afer) objS, null, false, defpackage.bcw.b(100.0f), null, null, null, null, null, opa.c, bveVarC, 805306368, 502);
                        bveVarC = bveVarC;
                        bwcVar.Y(true);
                        bwcVar.Y(false);
                        z3 = true;
                        oqmVar3 = oqmVar2;
                        z5 = z;
                    } else {
                        oqmVar2 = oqmVar;
                    }
                    z6 = false;
                    z7 = z6 | z8;
                    objS = bwcVar.S();
                    if (z7) {
                        objS = new opl(affcVar, oqmVar2, 9, (byte[]) null);
                        bwcVar.ad(objS);
                    } else {
                        objS = new opl(affcVar, oqmVar2, 9, (byte[]) null);
                        bwcVar.ad(objS);
                    }
                    defpackage.bxi.q((defpackage.afer) objS, null, false, defpackage.bcw.b(100.0f), null, null, null, null, null, opa.c, bveVarC, 805306368, 502);
                    bveVarC = bveVarC;
                    bwcVar.Y(true);
                    bwcVar.Y(false);
                    z3 = true;
                    oqmVar3 = oqmVar2;
                    z5 = z;
                } else {
                    oqmVar2 = oqmVar;
                }
                z6 = true;
                z7 = z6 | z8;
                objS = bwcVar.S();
                if (z7) {
                    objS = new opl(affcVar, oqmVar2, 9, (byte[]) null);
                    bwcVar.ad(objS);
                } else {
                    objS = new opl(affcVar, oqmVar2, 9, (byte[]) null);
                    bwcVar.ad(objS);
                }
                defpackage.bxi.q((defpackage.afer) objS, null, false, defpackage.bcw.b(100.0f), null, null, null, null, null, opa.c, bveVarC, 805306368, 502);
                bveVarC = bveVarC;
                bwcVar.Y(true);
                bwcVar.Y(false);
                z3 = true;
                oqmVar3 = oqmVar2;
                z5 = z;
            } else {
                bveVarC.v(-2144098117);
                defpackage.cgf cgfVarR3 = defpackage.awj.r(cgcVar);
                defpackage.cty ctyVarB2 = defpackage.atp.b(defpackage.cfs.e, false);
                int iF3 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh3 = bwcVar.ah();
                defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarR3);
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarB2, affgVar);
                defpackage.byw.c(bveVarC, cddVarAh3, affgVar2);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), affgVar3);
                defpackage.byw.b(bveVarC, affcVar2);
                defpackage.byw.c(bveVarC, cgfVarN3, affgVar4);
                if (z) {
                    bveVarC.v(1933666229);
                    bwcVar.Y(false);
                    cgfVarX3 = cgcVar;
                } else {
                    bveVarC.v(1933668193);
                    boolean zE2 = bveVarC.E(kwvVar);
                    java.lang.Object objS7 = bwcVar.S();
                    if (zE2 || objS7 == obj) {
                        r12 = 0;
                        objS7 = new opl(kwvVar, bwxVar, 5, (byte[]) null);
                        bwcVar.ad(objS7);
                    } else {
                        r12 = 0;
                    }
                    cgfVarX3 = defpackage.afw.x(cgcVar, true, r12, r12, (defpackage.afer) objS7);
                    bwcVar.Y(false);
                }
                defpackage.cgf cgfVarH2 = defpackage.asq.H(cgfVarX3, f);
                defpackage.cfy cfyVar = defpackage.cfs.n;
                defpackage.atc atcVar = defpackage.ati.e;
                defpackage.cty ctyVarA2 = defpackage.awb.a(atcVar, cfyVar, bveVarC, 54);
                int iF4 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh4 = bwcVar.ah();
                defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarH2);
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA2, affgVar);
                defpackage.byw.c(bveVarC, cddVarAh4, affgVar2);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF4), affgVar3);
                defpackage.byw.b(bveVarC, affcVar2);
                defpackage.byw.c(bveVarC, cgfVarN4, affgVar4);
                oqmVar3 = oqmVar;
                z3 = true;
                defpackage.ca.bb(ijt.c(oqmVar3.d, bveVarC), null, defpackage.awj.i(cgcVar, 24.0f), null, null, 0.0f, null, bveVarC, 440, 120);
                float f2 = defpackage.gjr.P1.k;
                defpackage.asq.A(defpackage.awj.m(cgcVar, f2), bveVarC);
                defpackage.brv.b(oqmVar3.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVarC).k, 0L, 0L, defpackage.dil.l, null, defpackage.dax.k(defpackage.dax.j(2131296319)), null, 0L, null, 3, 0, 0L, null, null, 16744411), bveVarC, 0, 0, 131070);
                bveVarC = bveVarC;
                bwcVar.Y(true);
                bwcVar.Y(true);
                if (z) {
                    bveVarC.v(-2142945103);
                    defpackage.asq.A(defpackage.awj.d(cgcVar, f2), bveVarC);
                    z4 = false;
                    y(defpackage.awj.r(cgcVar), atcVar, bveVarC, 54, 0);
                    bwcVar.Y(false);
                    z5 = true;
                } else {
                    z4 = false;
                    bveVarC.v(-2142735605);
                    bwcVar.Y(false);
                    z5 = false;
                }
                bwcVar.Y(z4);
            }
            bwcVar.Y(z3);
            z2 = z5;
        } else {
            bveVarC.s();
            z2 = z;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gvy(oqmVar3, z2, affcVar, i, 9);
        }
    }

    public static void I(java.util.List list, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1977709685);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(list) : bveVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.wf.a(defpackage.asq.I(defpackage.awj.t(defpackage.awj.r(defpackage.cgf.e), null, 3), defpackage.gjr.P4.k, 0.0f), defpackage.bcw.b(24.0f), defpackage.vz.d(defpackage.bxi.n(bveVarC).D, 0L, bveVarC, 14), defpackage.vz.e(62), null, defpackage.dai.as(-1290265639, true, new nre(list, affcVar, 5, (byte[]) null), bveVarC), bveVarC, 196608, 16);
            bveVarC = bveVarC;
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nxu(list, affcVar, i, 6, (byte[]) null);
        }
    }

    public static void J(oqm oqmVar, boolean z, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVarX;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(343039041);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(oqmVar) : bveVarC.E(oqmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarR = defpackage.awj.r(cgcVar);
            if (z) {
                bveVarC.v(-1051955639);
                ((defpackage.bwc) bveVarC).Y(false);
                cgfVarX = cgcVar;
            } else {
                bveVarC.v(-1051954536);
                boolean z2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && bveVarC.E(oqmVar))) | ((i2 & 896) == 256);
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS = bwcVar.S();
                if (z2 || objS == defpackage.bvd.a) {
                    objS = new opl(affcVar, oqmVar, 7, (byte[]) null);
                    bwcVar.ad(objS);
                }
                cgfVarX = defpackage.afw.x(cgcVar, true, null, null, (defpackage.afer) objS);
                bwcVar.Y(false);
            }
            defpackage.cgf cgfVarAn = defpackage.dai.an(defpackage.asq.H(cgfVarR.a(cgfVarX), defpackage.gjr.P3.k), true != z ? 1.0f : 0.6f);
            defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.k, bveVarC, 48);
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh = bwcVar2.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarAn);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            ag(oqmVar.c, cgcVar, null, false, null, bveVarC, 48, 28);
            defpackage.asq.A(defpackage.awj.d(cgcVar, defpackage.gjr.P1.k), bveVarC);
            defpackage.brv.b(oqmVar.a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVarC).h, 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744447), bveVarC, 0, 0, 131070);
            if (z) {
                bveVarC.v(1325088809);
                y(defpackage.awj.r(cgcVar), defpackage.ati.e, bveVarC, 54, 0);
                bwcVar2.Y(false);
            } else {
                bveVarC.v(1325225271);
                bwcVar2.Y(false);
            }
            java.lang.String str = oqmVar.e;
            if (str == null) {
                bveVarC.v(1325260920);
                bwcVar2.Y(false);
                bveVar2 = bveVarC;
            } else {
                bveVarC.v(1325260921);
                bveVar2 = bveVarC;
                defpackage.brv.b(str, null, defpackage.bxi.n(bveVarC).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVarC).o, 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744447), bveVar2, 0, 0, 131066);
                bwcVar2.Y(false);
            }
            bwcVar2.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gvy(oqmVar, z, affcVar, i, 10);
        }
    }

    public static void K(java.util.List list, java.util.List list2, android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo, defpackage.affc affcVar, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        list.getClass();
        list2.getClass();
        affcVar.getClass();
        aferVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-395609585);
        int i4 = i3 == 0 ? (true != ((i & 8) == 0 ? bveVarC.C(list) : bveVarC.E(list)) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i4 |= true != ((i & 64) == 0 ? bveVarC.C(list2) : bveVarC.E(list2)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.E(appWidgetProviderInfo) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != bveVarC.E(affcVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 8192 : 16384;
        }
        if (bveVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(oqc.a, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.afcg.a, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState2);
                objS2 = parcelableSnapshotMutableState2;
            }
            defpackage.bwx bwxVar2 = (defpackage.bwx) objS2;
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState("", defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState3);
                objS3 = parcelableSnapshotMutableState3;
            }
            defpackage.bwx bwxVar3 = (defpackage.bwx) objS3;
            defpackage.axx axxVarA = defpackage.axy.a(bveVarC);
            defpackage.kwv kwvVar = (defpackage.kwv) bveVarC.f(defpackage.dbl.g);
            boolean zC = ((i4 & 14) == 4 || ((i4 & 8) != 0 && bveVarC.C(list))) | bveVarC.C(D(bwxVar3));
            java.lang.Object objS4 = bwcVar.S();
            if (zC || objS4 == obj) {
                if (D(bwxVar3).length() == 0) {
                    objS4 = list;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        oqf oqfVar = (oqf) it.next();
                        java.util.List list3 = oqfVar.c;
                        int i5 = i4;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            java.lang.Object next = it2.next();
                            java.util.Iterator it3 = it2;
                            java.util.Iterator it4 = it;
                            if (afzh.u(((oqm) next).a, D(bwxVar3), true) || afzh.u(oqfVar.a, D(bwxVar3), true)) {
                                arrayList2.add(next);
                            }
                            it2 = it3;
                            it = it4;
                        }
                        java.util.Iterator it5 = it;
                        oqf oqfVar2 = !arrayList2.isEmpty() ? new oqf(oqfVar.a, oqfVar.b, arrayList2) : null;
                        if (oqfVar2 != null) {
                            arrayList.add(oqfVar2);
                        }
                        i4 = i5;
                        it = it5;
                    }
                    objS4 = arrayList;
                }
                i2 = i4;
                bwcVar.ad(objS4);
            } else {
                i2 = i4;
            }
            java.util.List list4 = (java.util.List) objS4;
            boolean zC2 = bveVarC.C(D(bwxVar3)) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && bveVarC.C(list2)));
            java.lang.Object objS5 = bwcVar.S();
            if (zC2 || objS5 == obj) {
                if (D(bwxVar3).length() == 0) {
                    objS5 = list2;
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list2) {
                        oqm oqmVar = (oqm) obj2;
                        if (afzh.u(oqmVar.a, D(bwxVar3), true) || afzh.u(oqmVar.b, D(bwxVar3), true)) {
                            arrayList3.add(obj2);
                        }
                    }
                    objS5 = arrayList3;
                }
                bwcVar.ad(objS5);
            }
            z(defpackage.dai.as(-1188121911, true, new ops(aferVar, appWidgetProviderInfo, affcVar, bwxVar3, bwxVar, list4, axxVarA, (java.util.List) objS5, bwxVar2, kwvVar, 0), bveVarC), bveVarC, 6);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gbt(list, list2, appWidgetProviderInfo, affcVar, aferVar, i, 5);
        }
    }

    public static void L(boolean z, int i, java.lang.String str, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i2) {
        int i3;
        boolean z2;
        long j;
        defpackage.bwc bwcVar;
        boolean z3;
        long j2;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(1073836601);
        if (i4 == 0) {
            i3 = (true != bveVarC.D(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != bveVarC.C(str) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != bveVarC.E(aferVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 8192 : 16384;
        }
        if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
            defpackage.bys bysVarB = defpackage.aef.b(true != z ? 1.0f : 1.1f, new defpackage.aga(0.5f, 1500.0f, null), null, null, bveVarC, 48, 28);
            defpackage.cgf cgfVarI = defpackage.asq.I(defpackage.awj.b(cgfVar, 1.0f), 0.0f, defpackage.gjr.P1.k);
            if (z) {
                bveVarC.v(1164838891);
                j = defpackage.bxi.n(bveVarC).h;
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(1164839844);
                ((defpackage.bwc) bveVarC).Y(false);
                j = defpackage.cjv.j(0);
            }
            defpackage.bcr bcrVar = defpackage.bcw.a;
            defpackage.cgf cgfVarH = defpackage.cjv.h(defpackage.afw.E(cgfVarI, j, bcrVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, bcrVar, true, 0, 1042431);
            int i5 = i3 & 7168;
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar2.S();
            if (i5 == 2048 || objS == defpackage.bvd.a) {
                objS = new defpackage.oph(aferVar, 12);
                bwcVar2.ad(objS);
            }
            defpackage.cgf cgfVarX = defpackage.afw.x(cgfVarH, true, null, null, (defpackage.afer) objS);
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
            int iF = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh = bwcVar2.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarX);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.affg affgVar = defpackage.cwl.e;
            defpackage.byw.c(bveVarC, ctyVarB, affgVar);
            defpackage.affg affgVar2 = defpackage.cwl.d;
            defpackage.byw.c(bveVarC, cddVarAh, affgVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF);
            defpackage.affg affgVar3 = defpackage.cwl.f;
            defpackage.byw.c(bveVarC, numValueOf, affgVar3);
            defpackage.affc affcVar = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.affg affgVar4 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN, affgVar4);
            defpackage.cfy cfyVar = defpackage.cfs.n;
            int i6 = i3;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            float fFloatValue = ((java.lang.Number) bysVarB.a()).floatValue();
            defpackage.cgf cgfVarI2 = defpackage.asq.I(defpackage.bzd.u(cgcVar, fFloatValue, fFloatValue), defpackage.gjr.P4.k, 0.0f);
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, cfyVar, bveVarC, 48);
            int iF2 = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh2 = bwcVar2.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarI2);
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
            if (z) {
                bveVarC.v(-1218252398);
                bwcVar = bwcVar2;
                z3 = false;
                defpackage.boh.a(defpackage.day.h(i, bveVarC, (i6 >> 3) & 14), null, defpackage.awj.i(cgcVar, 20.0f), defpackage.bxi.n(bveVarC).i, bveVarC, 440, 0);
                bveVarC = bveVarC;
                defpackage.asq.A(defpackage.awj.m(cgcVar, defpackage.gjr.P0.k), bveVarC);
                bwcVar.Y(false);
            } else {
                bwcVar = bwcVar2;
                z3 = false;
                bveVarC.v(-1217974669);
                bwcVar.Y(false);
            }
            defpackage.dgd dgdVarW = defpackage.dgd.w(defpackage.bxi.p(bveVarC).m, 0L, 0L, z ? defpackage.dil.m : defpackage.dil.k, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744443);
            if (z) {
                bveVarC.v(-1217697653);
                j2 = defpackage.bxi.n(bveVarC).i;
                bwcVar.Y(z3);
                z3 = true;
            } else {
                bveVarC.v(-1217620401);
                j2 = defpackage.bxi.n(bveVarC).s;
                bwcVar.Y(z3);
            }
            defpackage.bve bveVar2 = bveVarC;
            defpackage.brv.b(str, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, dgdVarW, bveVar2, (i6 >> 6) & 14, 0, 131066);
            bveVarC = bveVar2;
            bwcVar.Y(true);
            bwcVar.Y(true);
            z2 = z3;
        } else {
            bveVarC.s();
            z2 = z;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mtg(z2, i, str, aferVar, cgfVar, i2, 3);
        }
    }

    public static void M(java.lang.String str, defpackage.affc affcVar, defpackage.afer aferVar, boolean z, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        boolean z2;
        boolean z3;
        long j;
        long j2;
        int i3;
        defpackage.bcr bcrVar;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(444249054);
        if (i4 == 0) {
            i2 = (true != bveVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.D(z) ? 1024 : 2048;
        }
        int i5 = i2 | 24576;
        if (bveVarC.I((i5 & 9363) != 9362, i5 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarR = defpackage.awj.r(cgcVar);
            float f = defpackage.gjr.P4.k;
            float f2 = defpackage.gjr.P3.k;
            defpackage.cgf cgfVarI = defpackage.asq.I(cgfVarR, f, f2);
            defpackage.cfy cfyVar = defpackage.cfs.n;
            defpackage.atb atbVar = defpackage.ati.a;
            defpackage.cty ctyVarA = defpackage.awb.a(atbVar, cfyVar, bveVarC, 48);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
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
            defpackage.affc affcVar2 = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar2);
            defpackage.affg affgVar4 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN, affgVar4);
            defpackage.awe aweVar = defpackage.awe.a;
            defpackage.cgf cgfVarD = defpackage.awj.d(aweVar.b(cgcVar, 1.0f, true), 56.0f);
            long j3 = defpackage.bxi.n(bveVarC).D;
            defpackage.bcr bcrVar2 = defpackage.bcw.a;
            defpackage.cgf cgfVarI2 = defpackage.asq.I(defpackage.afw.E(cgfVarD, j3, bcrVar2), f2, 0.0f);
            defpackage.cty ctyVarA2 = defpackage.awb.a(atbVar, cfyVar, bveVarC, 48);
            int iF2 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh2 = bwcVar.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarI2);
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA2, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
            defpackage.byw.b(bveVarC, affcVar2);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
            defpackage.boh.a(defpackage.day.h(2131231771, bveVarC, 0), null, null, defpackage.bxi.n(bveVarC).s, bveVarC, 56, 4);
            float f3 = defpackage.gjr.P2.k;
            defpackage.asq.A(defpackage.awj.m(cgcVar, f3), bveVarC);
            defpackage.afw.M(str, affcVar, aweVar.b(cgcVar, 1.0f, true), false, defpackage.dgd.w(defpackage.bxi.p(bveVarC).j, 0L, 0L, null, null, defpackage.dax.k(defpackage.dax.j(2131296304)), null, 0L, null, 0, 0, 0L, null, null, 16777183), null, null, 0, 0, null, null, null, defpackage.dai.as(579327715, true, new defpackage.ndo(str, 14), bveVarC), bveVarC, i5 & 126, 196608);
            bwcVar.Y(true);
            if (z) {
                bveVarC.v(-1613335813);
                defpackage.asq.A(defpackage.awj.m(cgcVar, f3), bveVarC);
                boolean zX = defpackage.lyd.x();
                if (zX) {
                    bveVarC.v(1887625773);
                    z3 = false;
                    bwcVar.Y(false);
                    j = defpackage.cjv.j(0);
                } else {
                    z3 = false;
                    bveVarC.v(1887627115);
                    j = defpackage.ksx.j(defpackage.kry.O, bveVarC);
                    bwcVar.Y(false);
                }
                if (zX) {
                    bveVarC.v(-1613026681);
                    j2 = defpackage.kfp.i(bveVarC).m();
                    bwcVar.Y(z3);
                } else {
                    bveVarC.v(-1612964154);
                    j2 = defpackage.ksx.j(defpackage.kry.P, bveVarC);
                    bwcVar.Y(z3);
                }
                defpackage.cgf cgfVarD2 = defpackage.awj.d(cgcVar, 56.0f);
                cgfVarD2.getClass();
                bcrVar2.getClass();
                bveVarC.v(1490956545);
                if (defpackage.lyd.x()) {
                    java.lang.Object objS = bwcVar.S();
                    java.lang.Object obj = defpackage.bvd.a;
                    if (objS == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dly(0L), defpackage.bxv.c);
                        bwcVar.ad(parcelableSnapshotMutableState);
                        objS = parcelableSnapshotMutableState;
                    }
                    defpackage.bwx bwxVar = (defpackage.bwx) objS;
                    java.lang.Object objS2 = bwcVar.S();
                    if (objS2 == obj) {
                        i3 = 14;
                        objS2 = new noh(bwxVar, 14);
                        bwcVar.ad(objS2);
                    } else {
                        i3 = 14;
                    }
                    defpackage.cgf cgfVarD3 = defpackage.ty.d(cgfVarD2, (defpackage.affc) objS2);
                    z2 = true;
                    cgfVar = cgcVar;
                    if (defpackage.a.i(defpackage.lyd.w(bwxVar), 0L)) {
                        bwcVar.Y(z3);
                        bcrVar = bcrVar2;
                        cgfVarD2 = cgfVarD3;
                    } else {
                        defpackage.dlo dloVar = (defpackage.dlo) bveVarC.f(defpackage.dbl.d);
                        float fDG = dloVar.dG((int) (defpackage.lyd.w(bwxVar) >> 32));
                        float fDG2 = dloVar.dG((int) (defpackage.lyd.w(bwxVar) & 4294967295L));
                        boolean z4 = z3;
                        bcrVar = bcrVar2;
                        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits((int) (defpackage.lyd.w(bwxVar) & 4294967295L))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits((int) (defpackage.lyd.w(bwxVar) >> 32))) << 32);
                        float[] fArrF = xue.f(dloVar.dF(bcrVar.c.a(jFloatToRawIntBits, dloVar)), dloVar.dF(bcrVar.b.a(jFloatToRawIntBits, dloVar)), dloVar.dF(bcrVar.d.a(jFloatToRawIntBits, dloVar)), dloVar.dF(bcrVar.a.a(jFloatToRawIntBits, dloVar)));
                        int i6 = defpackage.cjv.i(defpackage.kfp.i(bveVarC).A());
                        xug xugVar = new xug(i6, i6, i6);
                        boolean z5 = bveVarC.z(fDG) | bveVarC.z(fDG2) | bveVarC.C(fArrF) | bveVarC.A(i6);
                        java.lang.Object objS3 = bwcVar.S();
                        if (z5 || objS3 == obj) {
                            objS3 = new npd(fDG, fDG2, fArrF, java.lang.Integer.valueOf(i6), xugVar);
                            bwcVar.ad(objS3);
                        }
                        npd npdVar = (npd) objS3;
                        java.lang.Object objS4 = bwcVar.S();
                        if (objS4 == obj) {
                            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(xrq.c, defpackage.bxv.c);
                            bwcVar.ad(parcelableSnapshotMutableState2);
                            objS4 = parcelableSnapshotMutableState2;
                        }
                        defpackage.bwx bwxVar2 = (defpackage.bwx) objS4;
                        boolean zC = bveVarC.C(npdVar);
                        java.lang.Object objS5 = bwcVar.S();
                        if (zC || objS5 == obj) {
                            objS5 = npdVar.j();
                            bwcVar.ad(objS5);
                        }
                        java.util.Map map = (java.util.Map) objS5;
                        xrr[] xrrVarArr = new xrr[5];
                        xrrVarArr[z4 ? 1 : 0] = npdVar.b();
                        xrrVarArr[1] = npdVar.d();
                        xrrVarArr[2] = npdVar.d();
                        xrrVarArr[3] = npdVar.d();
                        xrrVarArr[4] = npdVar.d();
                        xrr xrrVarV = defpackage.wva.v(defpackage.afga.ac(xrrVarArr));
                        xrq xrqVar = (xrq) bwxVar2.a();
                        java.lang.Object objS6 = bwcVar.S();
                        if (objS6 == obj) {
                            objS6 = new nee(bwxVar2, 9);
                            bwcVar.ad(objS6);
                        }
                        cgfVarD2 = defpackage.wpu.M(cgfVarD3, xrrVarV, xrqVar, map, (defpackage.affg) objS6, hh$.ExternalSyntheticApiModelOutline0.m((android.content.Context) bveVarC.f(defpackage.daj.b)), null, 992);
                        bwcVar.Y(z4);
                    }
                } else {
                    bwcVar.Y(z3);
                    z2 = true;
                    cgfVar = cgcVar;
                    bcrVar = bcrVar2;
                    i3 = 14;
                }
                defpackage.avv avvVar = defpackage.bms.a;
                defpackage.bxi.q(aferVar, cgfVarD2, false, bcrVar, defpackage.bms.f(j, j2, 0L, 0L, bveVarC, 12), null, null, null, null, opa.b, bveVarC, ((i5 >> 6) & i3) | 805306368, 484);
                bveVarC = bveVarC;
                bwcVar.Y(false);
            } else {
                z2 = true;
                cgfVar = cgcVar;
                bveVarC.v(-1612316192);
                bwcVar.Y(false);
            }
            bwcVar.Y(z2);
        } else {
            bveVarC.s();
        }
        defpackage.cgf cgfVar2 = cgfVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mco(str, affcVar, aferVar, z, cgfVar2, i, 4);
        }
    }

    public static void N(oqc oqcVar, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cgf cgfVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1540099297);
        if (i3 == 0) {
            i2 = i | (true != bveVarC.A(oqcVar.ordinal()) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (bveVarC.I((i4 & 147) != 146, i4 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarH = defpackage.asq.H(defpackage.afw.E(defpackage.awj.v(defpackage.awj.d(cgcVar, 64.0f), false, 3), defpackage.bxi.n(bveVarC).D, defpackage.bcw.a), defpackage.gjr.P0.k);
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarH);
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
            boolean z = oqcVar == oqc.a;
            java.lang.String strE = defpackage.vm.e(2132084046, bveVarC);
            int i5 = i4 & 112;
            java.lang.Object objS = bwcVar.S();
            if (i5 == 32 || objS == defpackage.bvd.a) {
                objS = new defpackage.oph(affcVar, 10);
                bwcVar.ad(objS);
            }
            float f = defpackage.gjr.P2.k;
            L(z, 2131231804, strE, (defpackage.afer) objS, defpackage.asq.J(cgcVar, f, 0.0f, 0.0f, 0.0f), bveVarC, 0);
            boolean z2 = oqcVar == oqc.b;
            java.lang.String strE2 = defpackage.vm.e(2132083234, bveVarC);
            java.lang.Object objS2 = bwcVar.S();
            if (i5 == 32 || objS2 == defpackage.bvd.a) {
                objS2 = new defpackage.oph(affcVar, 11);
                bwcVar.ad(objS2);
            }
            L(z2, 2131231702, strE2, (defpackage.afer) objS2, defpackage.asq.J(cgcVar, 0.0f, 0.0f, f, 0.0f), bveVarC, 0);
            bwcVar.Y(true);
            cgfVar2 = cgcVar;
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kld(oqcVar, affcVar, cgfVar2, i, 19);
        }
    }

    public static defpackage.affc O(defpackage.bys bysVar) {
        return (defpackage.affc) bysVar.a();
    }

    public static defpackage.affc P(defpackage.bys bysVar) {
        return (defpackage.affc) bysVar.a();
    }

    public static defpackage.affc Q(defpackage.bys bysVar) {
        return (defpackage.affc) bysVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Code duplicated, block: B:81:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x0159  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static void R(defpackage.afer aferVar, defpackage.cgf cgfVar, long j, long j2, defpackage.atb atbVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        long j3;
        int i4;
        defpackage.atb atbVar2;
        int i5;
        boolean z;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar3;
        defpackage.atb atbVar3;
        long j4;
        long j5;
        defpackage.bxl bxlVarJ;
        int i6;
        int i7;
        defpackage.bwc bwcVar;
        long j6;
        defpackage.atb atbVar4;
        long j7;
        long j8;
        defpackage.kwv kwvVar;
        defpackage.afer aferVar2;
        int i8;
        boolean z2;
        boolean z3;
        java.lang.Object objS;
        int i9;
        int i10;
        aferVar.getClass();
        int i11 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-2100856098);
        if (i11 == 0) {
            i3 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                i10 = 128;
                j3 = j;
                if ((i2 & 4) == 0 && bveVarC.B(j3)) {
                    i10 = 256;
                }
                i3 |= i10;
            } else {
                j3 = j;
            }
            if ((i & 3072) == 0) {
                i9 = 1024;
                if ((i2 & 8) == 0 && bveVarC.B(j2)) {
                    i9 = 2048;
                }
                i3 |= i9;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    atbVar2 = atbVar;
                    if (true != bveVarC.C(atbVar2)) {
                        i5 = 8192;
                    } else {
                        i5 = 16384;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bveVarC.I(z, i3 & 1)) {
                    i6 = i2 & 8;
                    i7 = i2 & 4;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        if (i12 != 0) {
                            cgfVar2 = defpackage.cgf.e;
                        }
                        if (i7 != 0) {
                            i3 &= -897;
                            j3 = defpackage.bxi.n(bveVarC).D;
                        }
                        if (i6 != 0) {
                            j6 = defpackage.bxi.n(bveVarC).a;
                            i3 &= -7169;
                        } else {
                            j6 = j2;
                        }
                        if (i4 != 0) {
                            atbVar4 = defpackage.ati.a;
                        } else {
                            atbVar4 = atbVar2;
                        }
                        j7 = j3;
                        j8 = j6;
                    } else {
                        bveVarC.s();
                        if (i7 != 0) {
                            i3 &= -897;
                        }
                        if (i6 != 0) {
                            i3 &= -7169;
                        }
                        atbVar4 = atbVar2;
                        j7 = j3;
                        j8 = j2;
                    }
                    bveVarC.l();
                    kwvVar = (defpackage.kwv) bveVarC.f(defpackage.dbl.g);
                    defpackage.cgf cgfVarI = defpackage.asq.I(defpackage.awj.r(cgfVar2), defpackage.gjr.P3.k, 0.0f);
                    defpackage.cty ctyVarA = defpackage.awb.a(atbVar4, defpackage.cfs.m, bveVarC, (((i3 >> 9) & 112) >> 3) & 14);
                    int iF = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh = bwcVar.ah();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarI);
                    aferVar2 = defpackage.cwl.a;
                    bveVarC.w();
                    i8 = i3;
                    if (bwcVar.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                    boolean zE = bveVarC.E(kwvVar);
                    if ((i8 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zE | z2;
                    objS = bwcVar.S();
                    if (z3 || objS == defpackage.bvd.a) {
                        objS = new defpackage.nma(kwvVar, aferVar, 19);
                        bwcVar.ad(objS);
                    }
                    defpackage.cgf cgfVarD = defpackage.awj.d(defpackage.cgf.e, 56.0f);
                    defpackage.bcr bcrVarB = defpackage.bcw.b(38.0f);
                    defpackage.avv avvVar = defpackage.bms.a;
                    defpackage.bxi.q((defpackage.afer) objS, cgfVarD, false, bcrVarB, defpackage.bms.f(j7, j8, 0L, 0L, bveVarC, 12), null, null, null, null, ooz.a, bveVarC, 805306416, 484);
                    bveVar2 = bveVarC;
                    bwcVar.Y(true);
                    atbVar3 = atbVar4;
                    cgfVar3 = cgfVar2;
                    j5 = j8;
                    j4 = j7;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    cgfVar3 = cgfVar2;
                    atbVar3 = atbVar2;
                    j4 = j3;
                    j5 = j2;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new opj(aferVar, cgfVar3, j4, j5, atbVar3, i, i2);
                }
            }
            i3 |= 24576;
            atbVar2 = atbVar;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                i6 = i2 & 8;
                i7 = i2 & 4;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i7 != 0) {
                        i3 &= -897;
                        j3 = defpackage.bxi.n(bveVarC).D;
                    }
                    if (i6 != 0) {
                        j6 = defpackage.bxi.n(bveVarC).a;
                        i3 &= -7169;
                    } else {
                        j6 = j2;
                    }
                    if (i4 != 0) {
                        atbVar4 = defpackage.ati.a;
                    } else {
                        atbVar4 = atbVar2;
                    }
                    j7 = j3;
                    j8 = j6;
                } else {
                    if (i12 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i7 != 0) {
                        i3 &= -897;
                        j3 = defpackage.bxi.n(bveVarC).D;
                    }
                    if (i6 != 0) {
                        j6 = defpackage.bxi.n(bveVarC).a;
                        i3 &= -7169;
                    } else {
                        j6 = j2;
                    }
                    if (i4 != 0) {
                        atbVar4 = defpackage.ati.a;
                    } else {
                        atbVar4 = atbVar2;
                    }
                    j7 = j3;
                    j8 = j6;
                }
                bveVarC.l();
                kwvVar = (defpackage.kwv) bveVarC.f(defpackage.dbl.g);
                defpackage.cgf cgfVarI2 = defpackage.asq.I(defpackage.awj.r(cgfVar2), defpackage.gjr.P3.k, 0.0f);
                defpackage.cty ctyVarA2 = defpackage.awb.a(atbVar4, defpackage.cfs.m, bveVarC, (((i3 >> 9) & 112) >> 3) & 14);
                int iF2 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh2 = bwcVar.ah();
                defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarI2);
                aferVar2 = defpackage.cwl.a;
                bveVarC.w();
                i8 = i3;
                if (bwcVar.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA2, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh2, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN2, defpackage.cwl.c);
                boolean zE2 = bveVarC.E(kwvVar);
                if ((i8 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zE2 | z2;
                objS = bwcVar.S();
                if (z3) {
                    objS = new defpackage.nma(kwvVar, aferVar, 19);
                    bwcVar.ad(objS);
                } else {
                    objS = new defpackage.nma(kwvVar, aferVar, 19);
                    bwcVar.ad(objS);
                }
                defpackage.cgf cgfVarD2 = defpackage.awj.d(defpackage.cgf.e, 56.0f);
                defpackage.bcr bcrVarB2 = defpackage.bcw.b(38.0f);
                defpackage.avv avvVar2 = defpackage.bms.a;
                defpackage.bxi.q((defpackage.afer) objS, cgfVarD2, false, bcrVarB2, defpackage.bms.f(j7, j8, 0L, 0L, bveVarC, 12), null, null, null, null, ooz.a, bveVarC, 805306416, 484);
                bveVar2 = bveVarC;
                bwcVar.Y(true);
                atbVar3 = atbVar4;
                cgfVar3 = cgfVar2;
                j5 = j8;
                j4 = j7;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar3 = cgfVar2;
                atbVar3 = atbVar2;
                j4 = j3;
                j5 = j2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new opj(aferVar, cgfVar3, j4, j5, atbVar3, i, i2);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        if ((i & 384) == 0) {
            i10 = 128;
            j3 = j;
            if ((i2 & 4) == 0) {
                i10 = 256;
            }
            i3 |= i10;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            i9 = 1024;
            if ((i2 & 8) == 0) {
                i9 = 2048;
            }
            i3 |= i9;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                atbVar2 = atbVar;
                if (true != bveVarC.C(atbVar2)) {
                    i5 = 8192;
                } else {
                    i5 = 16384;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                i6 = i2 & 8;
                i7 = i2 & 4;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i7 != 0) {
                        i3 &= -897;
                        j3 = defpackage.bxi.n(bveVarC).D;
                    }
                    if (i6 != 0) {
                        j6 = defpackage.bxi.n(bveVarC).a;
                        i3 &= -7169;
                    } else {
                        j6 = j2;
                    }
                    if (i4 != 0) {
                        atbVar4 = defpackage.ati.a;
                    } else {
                        atbVar4 = atbVar2;
                    }
                    j7 = j3;
                    j8 = j6;
                } else {
                    if (i12 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i7 != 0) {
                        i3 &= -897;
                        j3 = defpackage.bxi.n(bveVarC).D;
                    }
                    if (i6 != 0) {
                        j6 = defpackage.bxi.n(bveVarC).a;
                        i3 &= -7169;
                    } else {
                        j6 = j2;
                    }
                    if (i4 != 0) {
                        atbVar4 = defpackage.ati.a;
                    } else {
                        atbVar4 = atbVar2;
                    }
                    j7 = j3;
                    j8 = j6;
                }
                bveVarC.l();
                kwvVar = (defpackage.kwv) bveVarC.f(defpackage.dbl.g);
                defpackage.cgf cgfVarI3 = defpackage.asq.I(defpackage.awj.r(cgfVar2), defpackage.gjr.P3.k, 0.0f);
                defpackage.cty ctyVarA3 = defpackage.awb.a(atbVar4, defpackage.cfs.m, bveVarC, (((i3 >> 9) & 112) >> 3) & 14);
                int iF3 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh3 = bwcVar.ah();
                defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarI3);
                aferVar2 = defpackage.cwl.a;
                bveVarC.w();
                i8 = i3;
                if (bwcVar.t) {
                    bveVarC.j(aferVar2);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVarA3, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh3, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), defpackage.cwl.f);
                defpackage.byw.b(bveVarC, defpackage.cwl.g);
                defpackage.byw.c(bveVarC, cgfVarN3, defpackage.cwl.c);
                boolean zE3 = bveVarC.E(kwvVar);
                if ((i8 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zE3 | z2;
                objS = bwcVar.S();
                if (z3) {
                    objS = new defpackage.nma(kwvVar, aferVar, 19);
                    bwcVar.ad(objS);
                } else {
                    objS = new defpackage.nma(kwvVar, aferVar, 19);
                    bwcVar.ad(objS);
                }
                defpackage.cgf cgfVarD3 = defpackage.awj.d(defpackage.cgf.e, 56.0f);
                defpackage.bcr bcrVarB3 = defpackage.bcw.b(38.0f);
                defpackage.avv avvVar3 = defpackage.bms.a;
                defpackage.bxi.q((defpackage.afer) objS, cgfVarD3, false, bcrVarB3, defpackage.bms.f(j7, j8, 0L, 0L, bveVarC, 12), null, null, null, null, ooz.a, bveVarC, 805306416, 484);
                bveVar2 = bveVarC;
                bwcVar.Y(true);
                atbVar3 = atbVar4;
                cgfVar3 = cgfVar2;
                j5 = j8;
                j4 = j7;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar3 = cgfVar2;
                atbVar3 = atbVar2;
                j4 = j3;
                j5 = j2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new opj(aferVar, cgfVar3, j4, j5, atbVar3, i, i2);
            }
        }
        i3 |= 24576;
        atbVar2 = atbVar;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            i6 = i2 & 8;
            i7 = i2 & 4;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i7 != 0) {
                    i3 &= -897;
                    j3 = defpackage.bxi.n(bveVarC).D;
                }
                if (i6 != 0) {
                    j6 = defpackage.bxi.n(bveVarC).a;
                    i3 &= -7169;
                } else {
                    j6 = j2;
                }
                if (i4 != 0) {
                    atbVar4 = defpackage.ati.a;
                } else {
                    atbVar4 = atbVar2;
                }
                j7 = j3;
                j8 = j6;
            } else {
                if (i12 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i7 != 0) {
                    i3 &= -897;
                    j3 = defpackage.bxi.n(bveVarC).D;
                }
                if (i6 != 0) {
                    j6 = defpackage.bxi.n(bveVarC).a;
                    i3 &= -7169;
                } else {
                    j6 = j2;
                }
                if (i4 != 0) {
                    atbVar4 = defpackage.ati.a;
                } else {
                    atbVar4 = atbVar2;
                }
                j7 = j3;
                j8 = j6;
            }
            bveVarC.l();
            kwvVar = (defpackage.kwv) bveVarC.f(defpackage.dbl.g);
            defpackage.cgf cgfVarI4 = defpackage.asq.I(defpackage.awj.r(cgfVar2), defpackage.gjr.P3.k, 0.0f);
            defpackage.cty ctyVarA4 = defpackage.awb.a(atbVar4, defpackage.cfs.m, bveVarC, (((i3 >> 9) & 112) >> 3) & 14);
            int iF4 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh4 = bwcVar.ah();
            defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarI4);
            aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            i8 = i3;
            if (bwcVar.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA4, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh4, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF4), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN4, defpackage.cwl.c);
            boolean zE4 = bveVarC.E(kwvVar);
            if ((i8 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = zE4 | z2;
            objS = bwcVar.S();
            if (z3) {
                objS = new defpackage.nma(kwvVar, aferVar, 19);
                bwcVar.ad(objS);
            } else {
                objS = new defpackage.nma(kwvVar, aferVar, 19);
                bwcVar.ad(objS);
            }
            defpackage.cgf cgfVarD4 = defpackage.awj.d(defpackage.cgf.e, 56.0f);
            defpackage.bcr bcrVarB4 = defpackage.bcw.b(38.0f);
            defpackage.avv avvVar4 = defpackage.bms.a;
            defpackage.bxi.q((defpackage.afer) objS, cgfVarD4, false, bcrVarB4, defpackage.bms.f(j7, j8, 0L, 0L, bveVarC, 12), null, null, null, null, ooz.a, bveVarC, 805306416, 484);
            bveVar2 = bveVarC;
            bwcVar.Y(true);
            atbVar3 = atbVar4;
            cgfVar3 = cgfVar2;
            j5 = j8;
            j4 = j7;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar3 = cgfVar2;
            atbVar3 = atbVar2;
            j4 = j3;
            j5 = j2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new opj(aferVar, cgfVar3, j4, j5, atbVar3, i, i2);
        }
    }

    public static void S(defpackage.bve bveVar, int i) {
        defpackage.bve bveVar2;
        defpackage.bve bveVarC = bveVar.c(-1846415309);
        if (bveVarC.I(i != 0, i & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarR = defpackage.awj.r(cgcVar);
            float f = defpackage.gjr.P4.k;
            float f2 = defpackage.gjr.P1.k;
            defpackage.cgf cgfVarJ = defpackage.asq.J(cgfVarR, f, f2, defpackage.gjr.P3.k, f2);
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarJ);
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
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            boolean zE = bveVarC.E(context);
            java.lang.Object objS = bwcVar.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new defpackage.oph(context, 5);
                bwcVar.ad(objS);
            }
            defpackage.rq.c((defpackage.afer) objS, defpackage.afw.E(defpackage.awj.i(cgcVar, 40.0f), defpackage.bxi.n(bveVarC).H, defpackage.bcw.a), false, null, null, ooz.b, bveVarC, 1572864, 60);
            defpackage.asq.A(defpackage.awj.m(cgcVar, f2 + defpackage.gjr.P2.k + 0.0f), bveVarC);
            bveVar2 = bveVarC;
            defpackage.brv.b(defpackage.vm.e(2132083428, bveVarC), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVarC).g, 0L, 0L, defpackage.dil.l, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211), bveVar2, 0, 0, 131070);
            bwcVar.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gur(i, 11);
        }
    }

    public static void T(defpackage.affg affgVar, int i, defpackage.afer aferVar, defpackage.bwx bwxVar, int i2, int i3, defpackage.bve bveVar, int i4) {
        boolean z = true;
        defpackage.ccz cczVarAs = defpackage.dai.as(-798070717, true, new gur(i2, 10), bveVar);
        boolean zC = bveVar.C(affgVar) | bveVar.A(i);
        if ((((i4 & 112) ^ 48) <= 32 || !bveVar.A(i3)) && (i4 & 48) != 32) {
            z = false;
        }
        boolean zC2 = zC | z | bveVar.C(aferVar);
        java.lang.Object objG = bveVar.g();
        if (zC2 || objG == defpackage.bvd.a) {
            opg opgVar = new opg(affgVar, i, i3, aferVar, bwxVar);
            bveVar.x(opgVar);
            objG = opgVar;
        }
        bmn.b(cczVarAs, (defpackage.afer) objG, (defpackage.cgf) null, false, (bop) null, (defpackage.avv) null, bveVar, 6);
    }

    public static void U(defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        aferVar.getClass();
        aferVar2.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1852058496);
        if (i3 == 0) {
            i2 = i | (true != bveVarC.E(aferVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(aferVar2) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            bveVar2 = bveVarC;
            defpackage.vx.a(aferVar, defpackage.dai.as(-94466360, true, new nee(aferVar2, 18), bveVarC), null, defpackage.dai.as(291396042, true, new nee(aferVar, 19), bveVarC), ooz.g, ooz.h, ooz.i, null, 0L, 0L, 0L, 0L, null, bveVar2, (i2 & 14) | 1797168, 0, 16260);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nxu(aferVar, aferVar2, i, 4, (byte[]) null);
        }
    }

    public static void V(defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        aferVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(554483079);
        if (i3 == 0) {
            i2 = i | (true != bveVarC.E(aferVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            bveVar2 = bveVarC;
            defpackage.vx.a(aferVar, defpackage.dai.as(-1667769393, true, new nee(aferVar, 17), bveVarC), null, null, ooz.k, ooz.l, ooz.m, null, 0L, 0L, 0L, 0L, null, bveVar2, (i2 & 14) | 1794096, 0, 16268);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nlu(aferVar, i, 6);
        }
    }

    public static void W(defpackage.axx axxVar, int i, int i2, defpackage.affg affgVar) {
        if (i == axxVar.b() || i2 == axxVar.b()) {
            axxVar.j(axxVar.b(), axxVar.c());
        }
        affgVar.invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
    }

    public static void X(defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3;
        defpackage.afer aferVar2 = aferVar;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-489337900);
        if (i4 == 0) {
            i2 = (true != bveVarC.E(aferVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.cgf cgfVarC = defpackage.awj.c(cgfVar, 1.0f);
            defpackage.atc atcVar = defpackage.ati.e;
            defpackage.cty ctyVarA = defpackage.atu.a(atcVar, defpackage.cfs.k, bveVarC, 54);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarC);
            defpackage.afer aferVar3 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar3);
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
            defpackage.cfu cfuVar = defpackage.cfs.e;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cty ctyVarB = defpackage.atp.b(cfuVar, false);
            int iF2 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh2 = bwcVar.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgcVar);
            bveVarC.w();
            int i5 = i2;
            if (bwcVar.t) {
                bveVarC.j(aferVar3);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
            defpackage.ca.bb(defpackage.day.h(2131233721, bveVarC, 0), null, defpackage.awj.k(cgcVar, 144.0f, 160.0f), null, null, 0.0f, new defpackage.cjx(defpackage.bxi.n(bveVarC).D, 5), bveVarC, 440, 56);
            defpackage.boh.a(defpackage.day.h(2131231826, bveVarC, 0), null, defpackage.awj.i(cgcVar, 64.0f), defpackage.bxi.n(bveVarC).s, bveVarC, 440, 0);
            bwcVar.Y(true);
            float f = defpackage.gjr.P4.k;
            defpackage.asq.A(defpackage.awj.d(cgcVar, f), bveVarC);
            defpackage.brv.b(defpackage.vm.e(2132084614, bveVarC), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVarC).h, 0L, 0L, defpackage.dil.m, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744443), bveVarC, 0, 0, 131070);
            defpackage.asq.A(defpackage.awj.d(cgcVar, defpackage.gjr.P1.k), bveVarC);
            defpackage.brv.b(defpackage.vm.e(2132084613, bveVarC), defpackage.asq.I(cgcVar, f, 0.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVarC).k, defpackage.bxi.n(bveVarC).s, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744446), bveVarC, 0, 0, 131068);
            defpackage.asq.A(defpackage.awj.d(cgcVar, f), bveVarC);
            i3 = 5;
            aferVar2 = aferVar;
            R(aferVar2, null, defpackage.bxi.n(bveVarC).a, defpackage.bxi.n(bveVarC).b, atcVar, bveVarC, (i5 & 14) | 24576, 2);
            bwcVar.Y(true);
        } else {
            i3 = 5;
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nxu(aferVar2, cgfVar, i, i3);
        }
    }

    public static void Y(oqw oqwVar, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.affc affcVar2;
        defpackage.bve bveVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1935852483);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(oqwVar) : bveVarC.E(oqwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            affcVar2 = affcVar;
            i2 |= true != bveVarC.E(affcVar2) ? 16 : 32;
        } else {
            affcVar2 = affcVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        int i4 = i2;
        if (bveVarC.I((i4 & 147) != 146, i4 & 1)) {
            defpackage.bys bysVarM = defpackage.bxi.m(oqwVar.a, defpackage.afce.a, bveVarC);
            defpackage.bys bysVarM2 = defpackage.bxi.m(oqwVar.b, -1, bveVarC);
            defpackage.axx axxVarA = defpackage.axy.a(bveVarC);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((java.lang.Number) bysVarM2.a()).intValue());
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(defpackage.tna.aq(bysVarM).size());
            boolean zC = bveVarC.C(bysVarM2) | bveVarC.C(bysVarM) | bveVarC.C(axxVarA);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                defpackage.bqo bqoVar = new defpackage.bqo(axxVarA, bysVarM2, bysVarM, (defpackage.afdk) null, 14);
                bwcVar.ad(bqoVar);
                objS = bqoVar;
            }
            defpackage.bvx.f(numValueOf, numValueOf2, (defpackage.affg) objS, bveVarC);
            defpackage.atc atcVarG = defpackage.ati.g(2.0f);
            boolean zC2 = bveVarC.C(bysVarM) | bveVarC.C(bysVarM2) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && bveVarC.E(oqwVar))) | bveVarC.C(axxVarA);
            boolean z = (i4 & 112) == 32;
            java.lang.Object objS2 = bwcVar.S();
            if ((zC2 | z) || objS2 == defpackage.bvd.a) {
                nzz nzzVar = new nzz(bysVarM, oqwVar, axxVarA, affcVar2, bysVarM2, 3);
                bwcVar.ad(nzzVar);
                objS2 = nzzVar;
            }
            bveVar2 = bveVarC;
            defpackage.axd.c(cgfVar, axxVarA, null, atcVarG, null, null, false, null, (defpackage.affc) objS2, bveVar2, ((i4 >> 6) & 14) | 24576, 492);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kld(oqwVar, affcVar, cgfVar, i, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    public static void Z(oqu oquVar, boolean z, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.awe aweVar;
        defpackage.affg affgVar;
        defpackage.afer aferVar;
        ?? r5;
        defpackage.bwc bwcVar;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(173242205);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(oquVar) : bveVarC.E(oquVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh = bwcVar2.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.affg affgVar2 = defpackage.cwl.e;
            defpackage.byw.c(bveVarC, ctyVarA, affgVar2);
            defpackage.affg affgVar3 = defpackage.cwl.d;
            defpackage.byw.c(bveVarC, cddVarAh, affgVar3);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF);
            defpackage.affg affgVar4 = defpackage.cwl.f;
            defpackage.byw.c(bveVarC, numValueOf, affgVar4);
            defpackage.affc affcVar = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.affg affgVar5 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN, affgVar5);
            android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = oquVar.b;
            defpackage.awe aweVar2 = defpackage.awe.a;
            if (appWidgetProviderInfo == null) {
                bveVarC.v(447245847);
                bwcVar2.Y(false);
                aferVar = aferVar2;
                aweVar = aweVar2;
                r5 = 0;
                affgVar = affgVar2;
            } else {
                bveVarC.v(447245848);
                oqb oqbVar = oquVar.a() ? new oqb(oquVar.a, appWidgetProviderInfo) : null;
                defpackage.cgc cgcVar = defpackage.cgf.e;
                oqb oqbVar2 = oqbVar;
                aweVar = aweVar2;
                affgVar = affgVar2;
                aferVar = aferVar2;
                ag(appWidgetProviderInfo, defpackage.awj.i(cgcVar, 80.0f), oqbVar2, false, null, bveVarC, 3632, 16);
                defpackage.asq.A(defpackage.awj.m(cgcVar, defpackage.gjr.P2.k), bveVarC);
                r5 = 0;
                bwcVar2.Y(false);
            }
            defpackage.cgf cgfVarB = aweVar.b(defpackage.cgf.e, 1.0f, r5);
            defpackage.cty ctyVarA2 = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, r5);
            int iF2 = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh2 = bwcVar2.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarB);
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA2, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar3);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar4);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar5);
            if (oquVar.a()) {
                bveVarC.v(-1871778279);
                defpackage.bwc bwcVar3 = bwcVar2;
                defpackage.brv.b(defpackage.vm.e(2132083897, bveVarC), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVarC).h, bveVarC, 0, 0, 131070);
                bveVarC = bveVarC;
                bwcVar3.Y(r5);
                bwcVar = bwcVar3;
            } else {
                defpackage.bwc bwcVar4 = bwcVar2;
                bveVarC.v(-1871621388);
                defpackage.brv.b(oquVar.d, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVarC).h, bveVarC, 0, 0, 131070);
                defpackage.brv.b(oquVar.c, null, defpackage.bxi.n(bveVarC).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVarC).k, bveVarC, 0, 0, 131066);
                if (z) {
                    bveVarC = bveVarC;
                    bveVarC.v(-1871344868);
                    y(null, null, bveVarC, r5, 3);
                    bwcVar4.Y(r5);
                } else {
                    bveVarC = bveVarC;
                    bveVarC.v(-1871299701);
                    bwcVar4.Y(r5);
                }
                bwcVar4.Y(r5);
                bwcVar = bwcVar4;
            }
            bwcVar.Y(true);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gvy(oquVar, z, cgfVar, i, 8);
        }
    }

    public static defpackage.msw a(defpackage.bys bysVar) {
        return (defpackage.msw) bysVar.a();
    }

    public static void aa(oqu oquVar, int i, int i2, defpackage.axx axxVar, defpackage.affg affgVar, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.cgf cgfVar, defpackage.bve bveVar, int i3) {
        int i4;
        defpackage.bcr bcrVarC;
        boolean zJ;
        defpackage.byj byjVar;
        java.lang.Object opoVar;
        defpackage.afbk afbkVar;
        boolean z;
        defpackage.bwx bwxVar;
        boolean z2;
        defpackage.bys bysVar;
        defpackage.byj byjVar2;
        defpackage.byh byhVar;
        defpackage.byj byjVar3;
        axxVar.getClass();
        affgVar.getClass();
        aferVar.getClass();
        aferVar2.getClass();
        int i5 = i3 & 6;
        defpackage.bve bveVarC = bveVar.c(-1052506797);
        if (i5 == 0) {
            i4 = (true != ((i3 & 8) == 0 ? bveVarC.C(oquVar) : bveVarC.E(oquVar)) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != bveVarC.A(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != bveVarC.A(i2) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != bveVarC.C(axxVar) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != bveVarC.E(affgVar) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i4 |= true != bveVarC.E(aferVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            i4 |= true != bveVarC.C(cgfVar) ? 4194304 : 8388608;
        }
        if (bveVarC.I((4793491 & i4) != 4793490, i4 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
                bwcVar.ad(objS);
            }
            defpackage.byh byhVar2 = (defpackage.byh) objS;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
                bwcVar.ad(objS2);
            }
            defpackage.byj byjVar4 = (defpackage.byj) objS2;
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                objS3 = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i);
                bwcVar.ad(objS3);
            }
            defpackage.byj byjVar5 = (defpackage.byj) objS3;
            java.lang.Object objS4 = bwcVar.S();
            if (objS4 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS4 = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar2 = (defpackage.bwx) objS4;
            defpackage.bys bysVarC = defpackage.bzd.c(java.lang.Integer.valueOf(i), bveVarC);
            defpackage.kwv kwvVar = (defpackage.kwv) bveVarC.f(defpackage.dbl.g);
            defpackage.bys bysVarB = defpackage.aef.b(true != ((java.lang.Boolean) bwxVar2.a()).booleanValue() ? 1.0f : 1.03f, new defpackage.aga(1.0f, 1500.0f, null), null, null, bveVarC, 48, 28);
            float fE = (!((java.lang.Boolean) bwxVar2.a()).booleanValue() || byjVar4.e() <= 0) ? 0.0f : byhVar2.e() - ((((java.lang.Number) bysVarC.a()).intValue() - byjVar5.e()) * byjVar4.e());
            float f = true != ((java.lang.Boolean) bwxVar2.a()).booleanValue() ? 0.0f : 1.0f;
            if (i2 == 1) {
                bcrVarC = defpackage.bcw.b(20.0f);
            } else if (i == 0) {
                bcrVarC = defpackage.bcw.c(20.0f, 20.0f, 4.0f, 4.0f);
            } else {
                bcrVarC = i == i2 + (-1) ? defpackage.bcw.c(4.0f, 4.0f, 20.0f, 20.0f) : defpackage.bcw.b(4.0f);
            }
            defpackage.bcr bcrVar = bcrVarC;
            android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = oquVar.b;
            if (appWidgetProviderInfo != null) {
                defpackage.oqk oqkVarA = defpackage.oqk.a.a();
                android.content.ComponentName componentName = appWidgetProviderInfo.provider;
                componentName.getClass();
                zJ = oqkVarA.j(componentName);
            } else {
                zJ = false;
            }
            defpackage.cgf cgfVarB = defpackage.vx.b(defpackage.awj.r(cgfVar), f);
            boolean z3 = bveVarC.z(fE) | bveVarC.C(bysVarB) | bveVarC.D(zJ);
            java.lang.Object objS5 = bwcVar.S();
            if (z3 || objS5 == obj) {
                objS5 = new opc(fE, zJ, bwxVar2, bysVarB);
                bwcVar.ad(objS5);
            }
            defpackage.cgf cgfVarI = defpackage.asq.I(defpackage.cjv.g(cgfVarB, (defpackage.affc) objS5), defpackage.gjr.P3.k, 0.0f);
            java.lang.Object objS6 = bwcVar.S();
            if (objS6 == obj) {
                byjVar = byjVar4;
                objS6 = new defpackage.opb(byjVar, 2);
                bwcVar.ad(objS6);
            } else {
                byjVar = byjVar4;
            }
            defpackage.cgf cgfVarE = defpackage.ty.e(cgfVarI, (defpackage.affc) objS6);
            defpackage.afbk afbkVar2 = defpackage.afbk.a;
            boolean zD = bveVarC.D(zJ) | bveVarC.E(kwvVar) | bveVarC.C(bysVarC);
            boolean z4 = (i4 & 896) == 256;
            boolean z5 = (i4 & 7168) == 2048;
            boolean z6 = (i4 & 57344) == 16384;
            java.lang.Object objS7 = bwcVar.S();
            if (((z5 | zD | z4) || z6) || objS7 == obj) {
                afbkVar = afbkVar2;
                defpackage.byj byjVar6 = byjVar;
                boolean z7 = zJ;
                z = true;
                bwxVar = bwxVar2;
                opoVar = new opo(z7, kwvVar, bysVarC, byjVar5, byhVar2, bwxVar, i2, axxVar, affgVar, byjVar6);
                z2 = z7;
                bysVar = bysVarC;
                byjVar2 = byjVar5;
                byhVar = byhVar2;
                byjVar3 = byjVar6;
                bwcVar.ad(opoVar);
            } else {
                opoVar = objS7;
                afbkVar = afbkVar2;
                byjVar3 = byjVar;
                z2 = zJ;
                bysVar = bysVarC;
                byhVar = byhVar2;
                z = true;
                bwxVar = bwxVar2;
                byjVar2 = byjVar5;
            }
            defpackage.wf.a(defpackage.crq.a(cgfVarE, afbkVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) opoVar), bcrVar, defpackage.vz.d(defpackage.bxi.n(r8).D, 0L, bveVarC, 14), null, null, defpackage.dai.as(-1357076959, z, new opd(i2, axxVar, affgVar, oquVar, aferVar2, i, aferVar, bysVar, byjVar2, byjVar3, byhVar, bwxVar, z2), bveVarC), bveVarC, 196608, 24);
            bveVarC = bveVarC;
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new ope(oquVar, i, i2, axxVar, affgVar, aferVar, aferVar2, cgfVar, i3, 0);
        }
    }

    public static void ab(int i, int i2, int i3, int i4, float f, defpackage.axx axxVar, defpackage.affg affgVar, defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.affc affcVar3, defpackage.cgf cgfVar, defpackage.bve bveVar, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        defpackage.axx axxVar2;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar2;
        defpackage.bve bveVar3;
        affcVar.getClass();
        affcVar2.getClass();
        affcVar3.getClass();
        int i11 = i5 & 6;
        defpackage.bve bveVarC = bveVar.c(-1090074665);
        if (i11 == 0) {
            i7 = (true != bveVarC.A(i) ? 2 : 4) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 = i2;
            i7 |= true != bveVarC.A(i8) ? 16 : 32;
        } else {
            i8 = i2;
        }
        if ((i5 & 384) == 0) {
            i9 = i3;
            i7 |= true != bveVarC.A(i9) ? 128 : 256;
        } else {
            i9 = i3;
        }
        if ((i5 & 3072) == 0) {
            i10 = i4;
            i7 |= true != bveVarC.A(i10) ? 1024 : 2048;
        } else {
            i10 = i4;
        }
        if ((i5 & 24576) == 0) {
            f2 = f;
            i7 |= true != bveVarC.z(f2) ? 8192 : 16384;
        } else {
            f2 = f;
        }
        if ((196608 & i5) == 0) {
            axxVar2 = axxVar;
            i7 |= true != bveVarC.C(axxVar2) ? 65536 : 131072;
        } else {
            axxVar2 = axxVar;
        }
        if ((1572864 & i5) == 0) {
            i7 |= true != bveVarC.E(affgVar) ? 524288 : 1048576;
        }
        if ((12582912 & i5) == 0) {
            i7 |= true != bveVarC.E(affcVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i5) == 0) {
            i7 |= true != bveVarC.E(affcVar2) ? 33554432 : 67108864;
        }
        if ((805306368 & i5) == 0) {
            i7 |= true != bveVarC.E(affcVar3) ? 268435456 : 536870912;
        }
        if (bveVarC.I(((i7 & 306783379) == 306783378 && ((i6 | 6) & 3) == 2) ? false : true, i7 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.bys bysVarC = defpackage.bzd.c(java.lang.Integer.valueOf(i), bveVarC);
            defpackage.bys bysVarC2 = defpackage.bzd.c(java.lang.Integer.valueOf(i8), bveVarC);
            defpackage.bys bysVarC3 = defpackage.bzd.c(java.lang.Integer.valueOf(i9), bveVarC);
            int i12 = i7;
            defpackage.bys bysVarC4 = defpackage.bzd.c(java.lang.Integer.valueOf(i10), bveVarC);
            defpackage.bys bysVarC5 = defpackage.bzd.c(java.lang.Float.valueOf(f2), bveVarC);
            defpackage.bys bysVarC6 = defpackage.bzd.c(affgVar, bveVarC);
            defpackage.bys bysVarC7 = defpackage.bzd.c(affcVar, bveVarC);
            defpackage.bys bysVarC8 = defpackage.bzd.c(affcVar2, bveVarC);
            defpackage.bys bysVarC9 = defpackage.bzd.c(affcVar3, bveVarC);
            defpackage.kwv kwvVar = (defpackage.kwv) bveVarC.f(defpackage.dbl.g);
            defpackage.cne cneVarH = defpackage.day.h(2131231655, bveVarC, 0);
            defpackage.cgf cgfVarJ = defpackage.asq.J(cgcVar, 0.0f, 0.0f, defpackage.gjr.P1.k, 0.0f);
            defpackage.afbk afbkVar = defpackage.afbk.a;
            boolean zC = bveVarC.C(bysVarC6) | bveVarC.E(kwvVar) | bveVarC.C(bysVarC9) | bveVarC.C(bysVarC) | bveVarC.C(bysVarC8) | bveVarC.C(bysVarC7) | bveVarC.C(bysVarC5) | bveVarC.C(bysVarC4) | bveVarC.C(bysVarC2) | bveVarC.C(bysVarC3) | ((i12 & 458752) == 131072);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC) {
                bveVar3 = bveVarC;
            } else {
                bveVar3 = bveVarC;
                if (objS == defpackage.bvd.a) {
                }
                bveVar2 = bveVar3;
                defpackage.boh.a(cneVarH, null, defpackage.crq.a(cgfVarJ, afbkVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objS), 0L, bveVar2, 56, 8);
                cgfVar2 = cgcVar;
            }
            objS = new opm(kwvVar, bysVarC9, bysVarC, bysVarC8, bysVarC7, axxVar2, bysVarC5, bysVarC4, bysVarC2, bysVarC3, bysVarC6);
            bwcVar.ad(objS);
            bveVar2 = bveVar3;
            defpackage.boh.a(cneVarH, null, defpackage.crq.a(cgfVarJ, afbkVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objS), 0L, bveVar2, 56, 8);
            cgfVar2 = cgcVar;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar2 = cgfVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new opi(i, i2, i3, i4, f, axxVar, affgVar, affcVar, affcVar2, affcVar3, cgfVar2, i5, i6);
        }
    }

    public static void ac(int i, boolean z, defpackage.affg affgVar, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.cgf cgfVar, defpackage.bve bveVar, int i2) {
        int i3;
        defpackage.affg affgVar2;
        int i4;
        affgVar.getClass();
        aferVar2.getClass();
        int i5 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-1221063693);
        if (i5 == 0) {
            i3 = (true != bveVarC.A(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            affgVar2 = affgVar;
            i3 |= true != bveVarC.E(affgVar2) ? 128 : 256;
        } else {
            affgVar2 = affgVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != bveVarC.E(aferVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != bveVarC.E(aferVar2) ? 8192 : 16384;
        }
        int i6 = i3 | 196608;
        if (bveVarC.I((74899 & i6) != 74898, i6 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState2);
                objS2 = parcelableSnapshotMutableState2;
            }
            defpackage.bwx bwxVar2 = (defpackage.bwx) objS2;
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgcVar);
            defpackage.afer aferVar3 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar3);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                i4 = 0;
                objS3 = new defpackage.oph(bwxVar, i4);
                bwcVar.ad(objS3);
            } else {
                i4 = 0;
            }
            cgfVar = cgcVar;
            defpackage.rq.c((defpackage.afer) objS3, null, false, null, null, ooz.c, bveVarC, 1572870, 62);
            boolean zBooleanValue = ((java.lang.Boolean) bwxVar.a()).booleanValue();
            java.lang.Object objS4 = bwcVar.S();
            if (objS4 == obj) {
                objS4 = new defpackage.oph(bwxVar, 4);
                bwcVar.ad(objS4);
            }
            bmn.a(zBooleanValue, (defpackage.afer) objS4, (defpackage.cgf) null, 0L, (defpackage.all) null, (doc) null, defpackage.bcw.b(8.0f), 0L, 0.0f, defpackage.dai.as(313963048, true, new opk(i, z, affgVar2, aferVar2, bwxVar, bwxVar2), bveVarC), bveVarC, 48, 48);
            bveVarC = bveVarC;
            bwcVar.Y(true);
            if (((java.lang.Boolean) bwxVar2.a()).booleanValue()) {
                bveVarC.v(1665942603);
                java.lang.Object objS5 = bwcVar.S();
                int i7 = 6;
                if (objS5 == obj) {
                    objS5 = new defpackage.oph(bwxVar2, i7);
                    bwcVar.ad(objS5);
                }
                int i8 = i6 & 7168;
                defpackage.afer aferVar4 = (defpackage.afer) objS5;
                java.lang.Object objS6 = bwcVar.S();
                if (i8 == 2048 || objS6 == obj) {
                    objS6 = new opl(aferVar, bwxVar2, 1, (byte[]) null);
                    bwcVar.ad(objS6);
                }
                U(aferVar4, (defpackage.afer) objS6, bveVarC, 6);
                bwcVar.Y(false);
            } else {
                bveVarC.v(1666100207);
                bwcVar.Y(false);
            }
        } else {
            bveVarC.s();
        }
        defpackage.cgf cgfVar2 = cgfVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gwe(i, z, affgVar, aferVar, aferVar2, cgfVar2, i2, 6);
        }
    }

    public static void ad(oqw oqwVar, defpackage.cgf cgfVar, defpackage.afer aferVar, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.afer aferVar2;
        defpackage.cgf cgfVar2;
        oqwVar.getClass();
        aferVar.getClass();
        affcVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1331141200);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(oqwVar) : bveVarC.E(oqwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            aferVar2 = aferVar;
            i4 |= true != bveVarC.E(aferVar2) ? 128 : 256;
        } else {
            aferVar2 = aferVar;
        }
        if ((i & 3072) == 0) {
            i4 |= true != bveVarC.E(affcVar) ? 1024 : 2048;
        }
        if (bveVarC.I((i4 & 1171) != 1170, i4 & 1)) {
            defpackage.eqp eqpVar = oqwVar.a;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.bys bysVarM = defpackage.bxi.m(eqpVar, defpackage.afce.a, bveVarC);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            z(defpackage.dai.as(992829142, true, new hjo(cgcVar, aferVar2, oqwVar, affcVar, bysVarM, bwxVar, 3), bveVarC), bveVarC, 6);
            if (((java.lang.Boolean) bwxVar.a()).booleanValue()) {
                bveVarC.v(596037735);
                java.lang.Object objS2 = bwcVar.S();
                if (objS2 == obj) {
                    objS2 = new defpackage.oph(bwxVar, 7);
                    bwcVar.ad(objS2);
                }
                V((defpackage.afer) objS2, bveVarC, 6);
                bwcVar.Y(false);
            } else {
                bveVarC.v(596109810);
                bwcVar.Y(false);
            }
            cgfVar2 = cgcVar;
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new dmp(oqwVar, cgfVar2, aferVar, affcVar, i, 14);
        }
    }

    public static /* synthetic */ defpackage.afbk ae(defpackage.bve bveVar, int i) {
        if (bveVar.I((i & 3) != 2, i & 1)) {
            defpackage.boh.a(defpackage.day.h(2131231580, bveVar, 0), null, null, defpackage.bxi.n(bveVar).s, bveVar, 56, 4);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static defpackage.mvm af(defpackage.bys bysVar) {
        return (defpackage.mvm) bysVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x014e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0178  */
    /* JADX WARN: Code duplicated, block: B:112:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0187  */
    /* JADX WARN: Code duplicated, block: B:118:0x019b  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    public static void ag(android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo, defpackage.cgf cgfVar, defpackage.mvm mvmVar, boolean z, defpackage.afer aferVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        boolean zE;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        defpackage.afer aferVar2;
        int i9;
        int i10;
        boolean z3;
        boolean z4;
        defpackage.mvm mvmVar2;
        boolean z5;
        defpackage.cgf cgfVar3;
        defpackage.afer aferVar3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        boolean z6;
        boolean z7;
        boolean zE2;
        boolean z8;
        defpackage.bwc bwcVar;
        java.lang.Object oqsVar;
        boolean z9;
        defpackage.mvm mvmVar3;
        defpackage.affg affgVar;
        java.lang.Object objS;
        java.lang.Object obj;
        defpackage.bwx bwxVar;
        boolean zE3;
        java.lang.Object objS2;
        boolean z10;
        java.lang.Object objS3;
        boolean z11;
        defpackage.mvm mvmVarAf;
        defpackage.bwc bwcVar2;
        java.lang.Object objS4;
        android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo2 = appWidgetProviderInfo;
        defpackage.mvm mvmVar4 = mvmVar;
        int i11 = i & 6;
        defpackage.bve bveVarC = bveVar.c(951096807);
        if (i11 == 0) {
            i3 = (true != bveVarC.E(appWidgetProviderInfo2) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if ((i & 512) == 0) {
                    zE = bveVarC.C(mvmVar4);
                } else {
                    zE = bveVarC.E(mvmVar4);
                }
                if (true != zE) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i6 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (true != bveVarC.D(z)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    aferVar2 = aferVar;
                    if (true != bveVarC.E(aferVar2)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                z3 = true;
                if ((i10 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bveVarC.I(z4, i10 & 1)) {
                    if (i12 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        mvmVar4 = null;
                    }
                    z6 = z | (!z2);
                    if (i8 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS4 = bwcVar2.S();
                        if (objS4 == defpackage.bvd.a) {
                            objS4 = new defpackage.nyn(12);
                            bwcVar2.ad(objS4);
                        }
                        aferVar2 = (defpackage.afer) objS4;
                    }
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
                    if ((i10 & 896) != 256 || ((i10 & 512) != 0 && bveVarC.E(mvmVar4))) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zE2 = z7 | bveVarC.E(appWidgetProviderInfo2);
                    if ((i10 & 7168) == 2048) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    java.lang.Object objS5 = bwcVar.S();
                    if ((!zE2 && !z8) || objS5 == defpackage.bvd.a) {
                        defpackage.mvm mvmVar5 = mvmVar4;
                        z9 = z6;
                        oqsVar = new oqs(mvmVar5, appWidgetProviderInfo, z9, (defpackage.afdk) null, 0);
                        mvmVar3 = mvmVar5;
                        appWidgetProviderInfo2 = appWidgetProviderInfo;
                        bwcVar.ad(oqsVar);
                    } else {
                        mvmVar3 = mvmVar4;
                        oqsVar = objS5;
                        z9 = z6;
                    }
                    affgVar = (defpackage.affg) oqsVar;
                    objS = bwcVar.S();
                    obj = defpackage.bvd.a;
                    if (objS == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(mvmVar3, defpackage.bxv.c);
                        bwcVar.ad(parcelableSnapshotMutableState);
                        objS = parcelableSnapshotMutableState;
                    }
                    bwxVar = (defpackage.bwx) objS;
                    zE3 = bveVarC.E(affgVar);
                    objS2 = bwcVar.S();
                    if (zE3 || objS2 == obj) {
                        objS2 = new defpackage.amx(affgVar, bwxVar, (defpackage.afdk) null, 9, (short[]) null);
                        bwcVar.ad(objS2);
                    }
                    defpackage.bvx.e(appWidgetProviderInfo2, mvmVar3, boolValueOf, (defpackage.affg) objS2, bveVarC);
                    defpackage.mvm mvmVarAf2 = af(bwxVar);
                    boolean zC = bveVarC.C(bwxVar);
                    if ((57344 & i10) != 16384) {
                        z3 = false;
                    }
                    z10 = zC | z3;
                    objS3 = bwcVar.S();
                    if (!z10 || objS3 == obj) {
                        z11 = false;
                        objS3 = new oqr(aferVar2, bwxVar, (defpackage.afdk) 0, 0);
                        bwcVar.ad(objS3);
                    } else {
                        z11 = false;
                    }
                    defpackage.bvx.g(mvmVarAf2, (defpackage.affg) objS3, bveVarC);
                    mvmVarAf = af(bwxVar);
                    if (mvmVarAf == null) {
                        bveVarC.v(226353283);
                    } else {
                        bveVarC.v(226353284);
                        ah(mvmVarAf, cgfVar4, bveVarC, i10 & 112);
                    }
                    bwcVar.Y(z11);
                    z5 = z9;
                    mvmVar2 = mvmVar3;
                    cgfVar3 = cgfVar4;
                } else {
                    bveVarC.s();
                    mvmVar2 = mvmVar4;
                    z5 = z;
                    cgfVar3 = cgfVar2;
                }
                aferVar3 = aferVar2;
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new gwe(appWidgetProviderInfo2, cgfVar3, mvmVar2, z5, aferVar3, i, i2, 7);
                }
            }
            i3 |= 24576;
            aferVar2 = aferVar;
            i10 = i3;
            z3 = true;
            if ((i10 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bveVarC.I(z4, i10 & 1)) {
                if (i12 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    mvmVar4 = null;
                }
                z6 = z | (!z2);
                if (i8 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS4 = bwcVar2.S();
                    if (objS4 == defpackage.bvd.a) {
                        objS4 = new defpackage.nyn(12);
                        bwcVar2.ad(objS4);
                    }
                    aferVar2 = (defpackage.afer) objS4;
                }
                java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z6);
                if ((i10 & 896) != 256) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                zE2 = z7 | bveVarC.E(appWidgetProviderInfo2);
                if ((i10 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS6 = bwcVar.S();
                if (!zE2 && !z8) {
                    defpackage.mvm mvmVar6 = mvmVar4;
                    z9 = z6;
                    oqsVar = new oqs(mvmVar6, appWidgetProviderInfo, z9, (defpackage.afdk) null, 0);
                    mvmVar3 = mvmVar6;
                    appWidgetProviderInfo2 = appWidgetProviderInfo;
                    bwcVar.ad(oqsVar);
                } else {
                    defpackage.mvm mvmVar7 = mvmVar4;
                    z9 = z6;
                    oqsVar = new oqs(mvmVar7, appWidgetProviderInfo, z9, (defpackage.afdk) null, 0);
                    mvmVar3 = mvmVar7;
                    appWidgetProviderInfo2 = appWidgetProviderInfo;
                    bwcVar.ad(oqsVar);
                }
                affgVar = (defpackage.affg) oqsVar;
                objS = bwcVar.S();
                obj = defpackage.bvd.a;
                if (objS == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(mvmVar3, defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState2);
                    objS = parcelableSnapshotMutableState2;
                }
                bwxVar = (defpackage.bwx) objS;
                zE3 = bveVarC.E(affgVar);
                objS2 = bwcVar.S();
                if (zE3) {
                    objS2 = new defpackage.amx(affgVar, bwxVar, (defpackage.afdk) null, 9, (short[]) null);
                    bwcVar.ad(objS2);
                } else {
                    objS2 = new defpackage.amx(affgVar, bwxVar, (defpackage.afdk) null, 9, (short[]) null);
                    bwcVar.ad(objS2);
                }
                defpackage.bvx.e(appWidgetProviderInfo2, mvmVar3, boolValueOf2, (defpackage.affg) objS2, bveVarC);
                defpackage.mvm mvmVarAf3 = af(bwxVar);
                boolean zC2 = bveVarC.C(bwxVar);
                if ((57344 & i10) != 16384) {
                    z3 = false;
                }
                z10 = zC2 | z3;
                objS3 = bwcVar.S();
                if (z10) {
                    z11 = false;
                    objS3 = new oqr(aferVar2, bwxVar, (defpackage.afdk) 0, 0);
                    bwcVar.ad(objS3);
                } else {
                    z11 = false;
                    objS3 = new oqr(aferVar2, bwxVar, (defpackage.afdk) 0, 0);
                    bwcVar.ad(objS3);
                }
                defpackage.bvx.g(mvmVarAf3, (defpackage.affg) objS3, bveVarC);
                mvmVarAf = af(bwxVar);
                if (mvmVarAf == null) {
                    bveVarC.v(226353283);
                } else {
                    bveVarC.v(226353284);
                    ah(mvmVarAf, cgfVar4, bveVarC, i10 & 112);
                }
                bwcVar.Y(z11);
                z5 = z9;
                mvmVar2 = mvmVar3;
                cgfVar3 = cgfVar4;
            } else {
                bveVarC.s();
                mvmVar2 = mvmVar4;
                z5 = z;
                cgfVar3 = cgfVar2;
            }
            aferVar3 = aferVar2;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new gwe(appWidgetProviderInfo2, cgfVar3, mvmVar2, z5, aferVar3, i, i2, 7);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zE = bveVarC.C(mvmVar4);
            } else {
                zE = bveVarC.E(mvmVar4);
            }
            if (true != zE) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        i6 = i2 & 8;
        if (i6 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (true != bveVarC.D(z)) {
                i7 = 1024;
            } else {
                i7 = 2048;
            }
            i3 |= i7;
        }
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                aferVar2 = aferVar;
                if (true != bveVarC.E(aferVar2)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            i10 = i3;
            z3 = true;
            if ((i10 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bveVarC.I(z4, i10 & 1)) {
                if (i12 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    mvmVar4 = null;
                }
                z6 = z | (!z2);
                if (i8 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS4 = bwcVar2.S();
                    if (objS4 == defpackage.bvd.a) {
                        objS4 = new defpackage.nyn(12);
                        bwcVar2.ad(objS4);
                    }
                    aferVar2 = (defpackage.afer) objS4;
                }
                java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(z6);
                if ((i10 & 896) != 256) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                zE2 = z7 | bveVarC.E(appWidgetProviderInfo2);
                if ((i10 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS7 = bwcVar.S();
                if (!zE2 && !z8) {
                    defpackage.mvm mvmVar8 = mvmVar4;
                    z9 = z6;
                    oqsVar = new oqs(mvmVar8, appWidgetProviderInfo, z9, (defpackage.afdk) null, 0);
                    mvmVar3 = mvmVar8;
                    appWidgetProviderInfo2 = appWidgetProviderInfo;
                    bwcVar.ad(oqsVar);
                } else {
                    defpackage.mvm mvmVar9 = mvmVar4;
                    z9 = z6;
                    oqsVar = new oqs(mvmVar9, appWidgetProviderInfo, z9, (defpackage.afdk) null, 0);
                    mvmVar3 = mvmVar9;
                    appWidgetProviderInfo2 = appWidgetProviderInfo;
                    bwcVar.ad(oqsVar);
                }
                affgVar = (defpackage.affg) oqsVar;
                objS = bwcVar.S();
                obj = defpackage.bvd.a;
                if (objS == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState(mvmVar3, defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState3);
                    objS = parcelableSnapshotMutableState3;
                }
                bwxVar = (defpackage.bwx) objS;
                zE3 = bveVarC.E(affgVar);
                objS2 = bwcVar.S();
                if (zE3) {
                    objS2 = new defpackage.amx(affgVar, bwxVar, (defpackage.afdk) null, 9, (short[]) null);
                    bwcVar.ad(objS2);
                } else {
                    objS2 = new defpackage.amx(affgVar, bwxVar, (defpackage.afdk) null, 9, (short[]) null);
                    bwcVar.ad(objS2);
                }
                defpackage.bvx.e(appWidgetProviderInfo2, mvmVar3, boolValueOf3, (defpackage.affg) objS2, bveVarC);
                defpackage.mvm mvmVarAf4 = af(bwxVar);
                boolean zC3 = bveVarC.C(bwxVar);
                if ((57344 & i10) != 16384) {
                    z3 = false;
                }
                z10 = zC3 | z3;
                objS3 = bwcVar.S();
                if (z10) {
                    z11 = false;
                    objS3 = new oqr(aferVar2, bwxVar, (defpackage.afdk) 0, 0);
                    bwcVar.ad(objS3);
                } else {
                    z11 = false;
                    objS3 = new oqr(aferVar2, bwxVar, (defpackage.afdk) 0, 0);
                    bwcVar.ad(objS3);
                }
                defpackage.bvx.g(mvmVarAf4, (defpackage.affg) objS3, bveVarC);
                mvmVarAf = af(bwxVar);
                if (mvmVarAf == null) {
                    bveVarC.v(226353283);
                } else {
                    bveVarC.v(226353284);
                    ah(mvmVarAf, cgfVar4, bveVarC, i10 & 112);
                }
                bwcVar.Y(z11);
                z5 = z9;
                mvmVar2 = mvmVar3;
                cgfVar3 = cgfVar4;
            } else {
                bveVarC.s();
                mvmVar2 = mvmVar4;
                z5 = z;
                cgfVar3 = cgfVar2;
            }
            aferVar3 = aferVar2;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new gwe(appWidgetProviderInfo2, cgfVar3, mvmVar2, z5, aferVar3, i, i2, 7);
            }
        }
        i3 |= 24576;
        aferVar2 = aferVar;
        i10 = i3;
        z3 = true;
        if ((i10 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bveVarC.I(z4, i10 & 1)) {
            if (i12 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            if (i4 != 0) {
                mvmVar4 = null;
            }
            z6 = z | (!z2);
            if (i8 != 0) {
                bwcVar2 = (defpackage.bwc) bveVarC;
                objS4 = bwcVar2.S();
                if (objS4 == defpackage.bvd.a) {
                    objS4 = new defpackage.nyn(12);
                    bwcVar2.ad(objS4);
                }
                aferVar2 = (defpackage.afer) objS4;
            }
            java.lang.Boolean boolValueOf4 = java.lang.Boolean.valueOf(z6);
            if ((i10 & 896) != 256) {
                z7 = true;
            } else {
                z7 = true;
            }
            zE2 = z7 | bveVarC.E(appWidgetProviderInfo2);
            if ((i10 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS8 = bwcVar.S();
            if (!zE2 && !z8) {
                defpackage.mvm mvmVar10 = mvmVar4;
                z9 = z6;
                oqsVar = new oqs(mvmVar10, appWidgetProviderInfo, z9, (defpackage.afdk) null, 0);
                mvmVar3 = mvmVar10;
                appWidgetProviderInfo2 = appWidgetProviderInfo;
                bwcVar.ad(oqsVar);
            } else {
                defpackage.mvm mvmVar11 = mvmVar4;
                z9 = z6;
                oqsVar = new oqs(mvmVar11, appWidgetProviderInfo, z9, (defpackage.afdk) null, 0);
                mvmVar3 = mvmVar11;
                appWidgetProviderInfo2 = appWidgetProviderInfo;
                bwcVar.ad(oqsVar);
            }
            affgVar = (defpackage.affg) oqsVar;
            objS = bwcVar.S();
            obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = new androidx.compose.runtime.ParcelableSnapshotMutableState(mvmVar3, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState4);
                objS = parcelableSnapshotMutableState4;
            }
            bwxVar = (defpackage.bwx) objS;
            zE3 = bveVarC.E(affgVar);
            objS2 = bwcVar.S();
            if (zE3) {
                objS2 = new defpackage.amx(affgVar, bwxVar, (defpackage.afdk) null, 9, (short[]) null);
                bwcVar.ad(objS2);
            } else {
                objS2 = new defpackage.amx(affgVar, bwxVar, (defpackage.afdk) null, 9, (short[]) null);
                bwcVar.ad(objS2);
            }
            defpackage.bvx.e(appWidgetProviderInfo2, mvmVar3, boolValueOf4, (defpackage.affg) objS2, bveVarC);
            defpackage.mvm mvmVarAf5 = af(bwxVar);
            boolean zC4 = bveVarC.C(bwxVar);
            if ((57344 & i10) != 16384) {
                z3 = false;
            }
            z10 = zC4 | z3;
            objS3 = bwcVar.S();
            if (z10) {
                z11 = false;
                objS3 = new oqr(aferVar2, bwxVar, (defpackage.afdk) 0, 0);
                bwcVar.ad(objS3);
            } else {
                z11 = false;
                objS3 = new oqr(aferVar2, bwxVar, (defpackage.afdk) 0, 0);
                bwcVar.ad(objS3);
            }
            defpackage.bvx.g(mvmVarAf5, (defpackage.affg) objS3, bveVarC);
            mvmVarAf = af(bwxVar);
            if (mvmVarAf == null) {
                bveVarC.v(226353283);
            } else {
                bveVarC.v(226353284);
                ah(mvmVarAf, cgfVar4, bveVarC, i10 & 112);
            }
            bwcVar.Y(z11);
            z5 = z9;
            mvmVar2 = mvmVar3;
            cgfVar3 = cgfVar4;
        } else {
            bveVarC.s();
            mvmVar2 = mvmVar4;
            z5 = z;
            cgfVar3 = cgfVar2;
        }
        aferVar3 = aferVar2;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gwe(appWidgetProviderInfo2, cgfVar3, mvmVar2, z5, aferVar3, i, i2, 7);
        }
    }

    public static void ah(defpackage.mvm mvmVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1246251005);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(mvmVar) : bveVarC.E(mvmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (!bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            bveVarC.s();
        } else if (mvmVar instanceof oqb) {
            bveVarC.v(1366531544);
            defpackage.ca.at(cgfVar, null, defpackage.dai.as(1631427275, true, new defpackage.ndo(mvmVar, 15), bveVarC), bveVarC, ((i2 >> 3) & 14) | 3072, 6);
            ((defpackage.bwc) bveVarC).Y(false);
        } else if (mvmVar instanceof oqa) {
            bveVarC.v(1367516879);
            defpackage.ca.at(cgfVar, defpackage.cfs.e, defpackage.dai.as(-1345530060, true, new defpackage.ndo(mvmVar, i4), bveVarC), bveVarC, ((i2 >> 3) & 14) | 3120, 4);
            ((defpackage.bwc) bveVarC).Y(false);
        } else {
            boolean z = mvmVar instanceof oqd;
            if (!z && !(mvmVar instanceof oot)) {
                bveVarC.v(-648655072);
                ((defpackage.bwc) bveVarC).Y(false);
                throw new defpackage.afas();
            }
            bveVarC.v(1368294483);
            defpackage.ca.bb(ijt.c(z ? ((oqd) mvmVar).a : ((oot) mvmVar).a, bveVarC), null, cgfVar, null, null, 0.0f, null, bveVarC, ((i2 << 3) & 896) | 56, 120);
            bveVarC = bveVarC;
            ((defpackage.bwc) bveVarC).Y(false);
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nxu(mvmVar, cgfVar, i, 7);
        }
    }

    private static int ai(android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo, int i, int i2, int i3) {
        if ((appWidgetProviderInfo.resizeMode & i3) == 0 || i2 <= 0) {
            return i;
        }
        return i <= 0 ? i2 : java.lang.Math.min(i2, i);
    }

    public static java.util.List b(defpackage.bwx bwxVar) {
        return (java.util.List) bwxVar.a();
    }

    public static void c(defpackage.msx msxVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-539560728);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(msxVar) : bveVarC.E(msxVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (!bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            bveVarC.s();
        } else if (defpackage.afga.f(msxVar.a, defpackage.msr.a)) {
            bveVarC.v(2009051659);
            d(msxVar.b, msxVar.f, bveVarC, 0);
            ((defpackage.bwc) bveVarC).Y(false);
        } else {
            bveVarC.v(2009134429);
            defpackage.lyd.i(msxVar, bveVarC, (i2 & 14) | 8);
            ((defpackage.bwc) bveVarC).Y(false);
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jty(msxVar, i, 12);
        }
    }

    public static void d(defpackage.cgf cgfVar, boolean z, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cgf cgfVar2;
        defpackage.bve bveVarC = bveVar.c(1497755415);
        if ((i & 6) == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            if (z) {
                bveVarC.v(-783548171);
                ((defpackage.bwc) bveVarC).Y(false);
                cgfVar2 = cgfVar;
            } else {
                bveVarC.v(-783518969);
                defpackage.cgf cgfVarK = defpackage.kfp.k(defpackage.asq.H(cgfVar, defpackage.gjr.P1.k), null, bveVarC, 1);
                ((defpackage.bwc) bveVarC).Y(false);
                cgfVar2 = cgfVarK;
            }
            defpackage.ca.at(cgfVar2, null, defpackage.dai.as(787760257, true, new mvd(z), bveVarC), bveVarC, 3072, 6);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gqf(cgfVar, z, i, 6);
        }
    }

    public static void e(defpackage.muf mufVar, oqw oqwVar, boolean z, defpackage.affi affiVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        defpackage.affi affiVar2;
        mufVar.getClass();
        oqwVar.getClass();
        defpackage.bve bveVarC = bveVar.c(2093556309);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(mufVar) : bveVarC.E(mufVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(oqwVar) : bveVarC.E(oqwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        int i3 = i2 | 3072;
        if (bveVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            defpackage.eqp eqpVar = oqwVar.a;
            affiVar2 = msz.a;
            defpackage.bys bysVarM = defpackage.bxi.m(eqpVar, defpackage.afce.a, bveVarC);
            boolean zG = defpackage.leh.a.a().g();
            defpackage.bys bysVarL = defpackage.bxi.l(mufVar.g, bveVarC);
            float fZ = juu.z(0, bveVarC, 1);
            float f = defpackage.mwo.a;
            float f2 = defpackage.mwo.c / fZ;
            float f3 = defpackage.mwo.b / fZ;
            defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.cgf.e, 1.0f);
            float f4 = f3 + 0.0f;
            defpackage.ccz cczVarAs = defpackage.dai.as(1530613419, true, new mve(f2 + 0.0f + f4 + 0.0f, f4, zG, bysVarM, bysVarL, z, mufVar, affiVar2), bveVarC);
            bveVar2 = bveVarC;
            defpackage.ca.at(cgfVarC, null, cczVarAs, bveVar2, 3078, 6);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            affiVar2 = affiVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new hdd(mufVar, oqwVar, z, affiVar2, i, 5);
        }
    }

    public static void f(mva mvaVar, defpackage.bve bveVar, int i) {
        int i2;
        mva mvaVar2;
        android.os.Bundle bundleM;
        mvaVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(2140587246);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(mvaVar) : bveVarC.E(mvaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.nth nthVarL = defpackage.nte.c().b().l();
            if (nthVarL == null) {
                throw new java.lang.IllegalArgumentException("can't construct widget shade without valid state");
            }
            int i4 = (i2 & 14) | 8;
            if (!defpackage.leh.a.a().e() || nthVarL.a()) {
                bundleM = defpackage.lyd.m(nthVarL.a());
            } else {
                boolean zA = nthVarL.a();
                bundleM = new android.os.Bundle();
                bundleM.putBoolean("IS_HORIZONTAL", zA);
            }
            android.os.Bundle bundle = bundleM;
            if (nthVarL.a()) {
                bveVarC.v(-1439181690);
                mvaVar2 = mvaVar;
                i(mvaVar2, nthVarL.b, nthVarL.c, bundle, bveVarC, i4);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                mvaVar2 = mvaVar;
                bveVarC.v(-1439032611);
                h(mvaVar2, nthVarL.a, nthVarL.b, nthVarL.c, nthVarL.d, bundle, bveVarC, i4);
                bveVarC = bveVarC;
                ((defpackage.bwc) bveVarC).Y(false);
            }
        } else {
            mvaVar2 = mvaVar;
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jty(mvaVar2, i, 11);
        }
    }

    public static void g(mva mvaVar, boolean z, boolean z2, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.bve bveVar2;
        boolean z3;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1990694077);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(mvaVar) : bveVarC.E(mvaVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.D(z) ? 16 : 32;
        }
        int i5 = i2 & 4;
        boolean z4 = i5 == 0;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        if (bveVarC.I((i3 & 147) != 146, i3 & 1)) {
            boolean z5 = z4 & z2;
            defpackage.bys bysVarM = defpackage.bxi.m(mvaVar.b, java.lang.Boolean.TRUE, bveVarC);
            defpackage.bys bysVarM2 = defpackage.bxi.m(mvaVar.a, muz.a, bveVarC);
            defpackage.cgf cgfVarD = z ? defpackage.awj.d(defpackage.awj.r(defpackage.cgf.e), 48.0f) : defpackage.awj.m(defpackage.awj.b(defpackage.cgf.e, 1.0f), 48.0f);
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarD);
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
            defpackage.afau afauVar = z ? new defpackage.afau(new defpackage.dlr(80.0f), new defpackage.dlr(24.0f)) : new defpackage.afau(new defpackage.dlr(24.0f), new defpackage.dlr(80.0f));
            bveVar2 = bveVarC;
            defpackage.ca.M(((java.lang.Boolean) bysVarM.a()).booleanValue(), null, defpackage.acs.z(null, 3).a(defpackage.acs.q(null, 0.33f, defpackage.tna.aK(0.5f, 0.5f), 1)), defpackage.acs.A(null, 3).a(defpackage.acs.r(null, 0.33f, defpackage.tna.aK(0.5f, 0.5f), 1)), null, defpackage.dai.as(-1210688223, true, new mut(((defpackage.dlr) afauVar.a).a, ((defpackage.dlr) afauVar.b).a, defpackage.bcw.b(104.0f), z, z5, bysVarM2), bveVarC), bveVar2, 196608, 18);
            bwcVar.Y(true);
            z3 = z5;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            z3 = z2;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new muu(mvaVar, z, z3, i, i2);
        }
    }

    public static void h(mva mvaVar, int i, float f, float f2, boolean z, android.os.Bundle bundle, defpackage.bve bveVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-785572375);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? bveVarC.C(mvaVar) : bveVarC.E(mvaVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != bveVarC.z(f) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != bveVarC.z(f2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != bveVarC.D(z) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != bveVarC.E(bundle) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i3) != 74898, i3 & 1)) {
            int i5 = i3 & 14;
            defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.cgf.e.a(new defpackage.ajc(defpackage.cjv.j(0), defpackage.cky.a)), 1.0f);
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.m, bveVarC, 0);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarC);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            int i6 = i5 | 440;
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.awe aweVar = defpackage.awe.a;
            defpackage.ccz cczVarAs = defpackage.dai.as(-1152299671, true, new muw(aweVar, f, bundle, 0), bveVarC);
            defpackage.ccz cczVarAs2 = defpackage.dai.as(129532292, true, new grv(i, aweVar, f2, 2), bveVarC);
            if (z) {
                bveVarC.v(136953984);
                g(mvaVar, false, true, bveVarC, i6, 0);
                cczVarAs.invoke(bveVarC, 6);
                cczVarAs2.invoke(bveVarC, 6);
                bwcVar.Y(false);
            } else {
                bveVarC.v(137076031);
                cczVarAs2.invoke(bveVarC, 6);
                cczVarAs.invoke(bveVarC, 6);
                g(mvaVar, false, false, bveVarC, i6, 0);
                bwcVar.Y(false);
            }
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mux(mvaVar, i, f, f2, z, bundle, i2);
        }
    }

    public static void i(mva mvaVar, float f, float f2, android.os.Bundle bundle, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1175972106);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(mvaVar) : bveVarC.E(mvaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.z(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.z(f2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(bundle) ? 1024 : 2048;
        }
        int i4 = i2;
        if (bveVarC.I((i4 & 1171) != 1170, i4 & 1)) {
            long j = defpackage.cjv.j(0);
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarC = defpackage.awj.c(cgcVar.a(new defpackage.ajc(j, defpackage.cky.a)), 1.0f);
            defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVarC, 0);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarC);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
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
            g(mvaVar, true, false, bveVarC, (i4 & 14) | 56, 4);
            defpackage.cgf cgfVarR = defpackage.awj.r(defpackage.atx.b(cgcVar, f, true));
            int i5 = i4 >> 3;
            vv vvVarF = duf.f(bveVarC);
            defpackage.bvm bvmVar = defpackage.esf.a;
            defpackage.epx epxVar = (defpackage.epx) defpackage.ebn.c(((defpackage.eqg) bveVarC.f(bvmVar)).getLifecycle(), bveVarC).a();
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = defpackage.muy.e;
                bwcVar.ad(objS);
            }
            bveVarC = bveVarC;
            duf.g(defpackage.mtc.class, cgfVarR, vvVarF, bundle, epxVar, (defpackage.affc) objS, bveVarC, ((i5 & 896) << 3) & 7168);
            defpackage.cgf cgfVarR2 = defpackage.awj.r(defpackage.atx.b(cgcVar, f2, true));
            defpackage.cty ctyVarA2 = defpackage.awb.a(defpackage.ati.g(8.0f), defpackage.cfs.m, bveVarC, 6);
            int iF2 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh2 = bwcVar.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarR2);
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA2, affgVar);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
            defpackage.awe aweVar = defpackage.awe.a;
            defpackage.cgf cgfVarC2 = defpackage.awj.c(aweVar.b(cgcVar, 0.5f, true), 1.0f);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("column_number", 0);
            vv vvVarF2 = duf.f(bveVarC);
            defpackage.epx epxVar2 = (defpackage.epx) defpackage.ebn.c(((defpackage.eqg) bveVarC.f(bvmVar)).getLifecycle(), bveVarC).a();
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = defpackage.muy.f;
                bwcVar.ad(objS2);
            }
            duf.g(mvn.class, cgfVarC2, vvVarF2, bundle2, epxVar2, (defpackage.affc) objS2, bveVarC, 0);
            defpackage.cgf cgfVarC3 = defpackage.awj.c(aweVar.b(cgcVar, 0.5f, true), 1.0f);
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("column_number", 1);
            vv vvVarF3 = duf.f(bveVarC);
            defpackage.epx epxVar3 = (defpackage.epx) defpackage.ebn.c(((defpackage.eqg) bveVarC.f(bvmVar)).getLifecycle(), bveVarC).a();
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                objS3 = defpackage.muy.g;
                bwcVar.ad(objS3);
            }
            duf.g(mvn.class, cgfVarC3, vvVarF3, bundle3, epxVar3, (defpackage.affc) objS3, bveVarC, 0);
            bwcVar.Y(true);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new muv(mvaVar, f, f2, bundle, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    public static void j(muz muzVar, boolean z, boolean z2, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        boolean z3;
        float f;
        defpackage.cgf cgfVarH;
        boolean z4 = z2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(370236302);
        boolean z5 = true;
        if (i3 == 0) {
            i2 = (true != bveVarC.A(muzVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z4) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 1024 : 2048;
        }
        if (bveVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = muzVar == muz.b ? 2131231994 : 2131231993;
            int iOrdinal = muzVar.ordinal();
            float f2 = 180.0f;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    if (z) {
                        f = 90.0f;
                    } else {
                        z5 = false;
                    }
                    defpackage.cne cneVarH = defpackage.day.h(i4, bveVarC, 0);
                    long j = defpackage.ksx.j(defpackage.kry.s, bveVarC);
                    if (f == 0.0f) {
                        cgfVarH = cgfVar;
                    } else {
                        cgfVarH = defpackage.cjv.h(cgfVar, 0.0f, 0.0f, 0.0f, 0.0f, f, null, false, 0, 1048319);
                    }
                    defpackage.boh.a(cneVarH, null, cgfVarH, j, bveVarC, 56, 0);
                    z3 = z5;
                } else {
                    if (iOrdinal != 2) {
                        throw new defpackage.afas();
                    }
                    if (z) {
                        f2 = 270.0f;
                    } else if (z4) {
                        z4 = true;
                        z5 = false;
                    } else {
                        z4 = false;
                        z5 = false;
                    }
                    f = f2;
                    defpackage.cne cneVarH2 = defpackage.day.h(i4, bveVarC, 0);
                    long j2 = defpackage.ksx.j(defpackage.kry.s, bveVarC);
                    if (f == 0.0f) {
                        cgfVarH = cgfVar;
                    } else {
                        cgfVarH = defpackage.cjv.h(cgfVar, 0.0f, 0.0f, 0.0f, 0.0f, f, null, false, 0, 1048319);
                    }
                    defpackage.boh.a(cneVarH2, null, cgfVarH, j2, bveVarC, 56, 0);
                    z3 = z5;
                }
                f = 0.0f;
                defpackage.cne cneVarH3 = defpackage.day.h(i4, bveVarC, 0);
                long j3 = defpackage.ksx.j(defpackage.kry.s, bveVarC);
                if (f == 0.0f) {
                    cgfVarH = cgfVar;
                } else {
                    cgfVarH = defpackage.cjv.h(cgfVar, 0.0f, 0.0f, 0.0f, 0.0f, f, null, false, 0, 1048319);
                }
                defpackage.boh.a(cneVarH3, null, cgfVarH, j3, bveVarC, 56, 0);
                z3 = z5;
            } else {
                if (z) {
                    f = 90.0f;
                } else if (z4) {
                    z4 = true;
                    z5 = false;
                    f = 0.0f;
                } else {
                    z4 = false;
                    z5 = false;
                    f = f2;
                }
                defpackage.cne cneVarH4 = defpackage.day.h(i4, bveVarC, 0);
                long j4 = defpackage.ksx.j(defpackage.kry.s, bveVarC);
                if (f == 0.0f) {
                    cgfVarH = cgfVar;
                } else {
                    cgfVarH = defpackage.cjv.h(cgfVar, 0.0f, 0.0f, 0.0f, 0.0f, f, null, false, 0, 1048319);
                }
                defpackage.boh.a(cneVarH4, null, cgfVarH, j4, bveVarC, 56, 0);
                z3 = z5;
            }
        } else {
            bveVarC.s();
            z3 = z;
        }
        boolean z6 = z4;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bqz(muzVar, z3, z6, cgfVar, i, 2);
        }
    }

    public static boolean k(nuv nuvVar, j$.time.Duration duration) {
        return j$.time.Duration.ofMillis(j$.time.Instant.now().toEpochMilli() - nuvVar.c.i).compareTo(duration) <= 0;
    }

    public static j$.time.Duration l() {
        return defpackage.ysr.cF(defpackage.acqe.e());
    }

    public static j$.time.Duration m() {
        return defpackage.ysr.cF(defpackage.acqe.i());
    }

    public static j$.time.Duration n() {
        return defpackage.ysr.cF(defpackage.acqe.j());
    }

    public static j$.time.Duration o() {
        return defpackage.ysr.cF(defpackage.acqe.b());
    }

    public static j$.time.Duration p() {
        return defpackage.ysr.cC(defpackage.acqe.c());
    }

    public static j$.time.Duration q() {
        return defpackage.ysr.cC(defpackage.acqe.d());
    }

    public static com.google.android.gms.car.CarSensorEvent r(int i, long j, float[] fArr, byte[] bArr) {
        int length = fArr.length;
        int length2 = bArr.length;
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(i, j, length, length2);
        java.lang.System.arraycopy(fArr, 0, carSensorEvent.d, 0, length);
        java.lang.System.arraycopy(bArr, 0, carSensorEvent.e, 0, length2);
        return carSensorEvent;
    }

    public static java.lang.Boolean s(defpackage.bys bysVar) {
        return (java.lang.Boolean) bysVar.a();
    }

    public static void t(defpackage.cgf cgfVar, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-42245119);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.bvm bvmVar = defpackage.esn.a;
            defpackage.esa esaVarA = defpackage.esn.a(bveVarC);
            if (esaVarA == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            nfd nfdVarL = defpackage.ebl.l(defpackage.afgw.b(nfd.class), esaVarA, null, null, defpackage.edd.f(esaVarA));
            int i4 = i2 & 14;
            int i5 = i2 << 6;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.asl();
                bwcVar.ad(objS);
            }
            defpackage.ca.at(cgfVar, null, defpackage.dai.as(-343067436, true, new nem(affcVar, nfdVarL, 2, (byte[]) null), bveVarC), bveVarC, (((i5 & 7168) | i4) & 14) | 3072, 6);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nau(cgfVar, affcVar, i, 4, null);
        }
    }

    public static void u(android.content.Intent intent) {
        intent.putExtra("EXTRA_STARTED_BY_DASHBOARD", true);
        defpackage.mpk.a().i(intent);
    }

    public static defpackage.eqp v(android.content.Context context, android.net.Uri uri, nex nexVar, java.lang.Object obj, boolean z) {
        j$.time.Duration duration;
        if (nexVar != null) {
            duration = nexVar.a;
        } else {
            duration = j$.time.Duration.ZERO;
            duration.getClass();
        }
        return new neu(context, uri, obj, duration, nexVar != null ? nexVar.b : null, new.a, z);
    }

    public static int w(android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo) {
        return ai(appWidgetProviderInfo, appWidgetProviderInfo.minHeight, appWidgetProviderInfo.minResizeHeight, 2);
    }

    public static int x(android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo) {
        return ai(appWidgetProviderInfo, appWidgetProviderInfo.minWidth, appWidgetProviderInfo.minResizeWidth, 1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x0121  */
    /* JADX WARN: Code duplicated, block: B:44:0x012e  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static void y(defpackage.cgf cgfVar, defpackage.atb atbVar, defpackage.bve bveVar, int i, int i2) {
        defpackage.cgf cgfVar2;
        int i3;
        defpackage.atb atbVar2;
        boolean z;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar3;
        defpackage.atb atbVar3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        defpackage.atb atbVar4;
        defpackage.bwc bwcVar;
        defpackage.afer aferVar;
        defpackage.bve bveVarC = bveVar.c(1324231694);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            cgfVar2 = cgfVar;
        } else if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i3 = i | (true != bveVarC.C(cgfVar2) ? 2 : 4);
        } else {
            cgfVar2 = cgfVar;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                atbVar2 = atbVar;
                i3 |= true != bveVarC.C(atbVar2) ? 16 : 32;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                if (i4 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i5 != 0) {
                    atbVar4 = defpackage.ati.a;
                } else {
                    atbVar4 = atbVar2;
                }
                defpackage.cty ctyVarA = defpackage.awb.a(atbVar4, defpackage.cfs.n, bveVarC, (((((i3 & 14) | 384) | (i3 & 112)) >> 3) & 14) | 48);
                bwcVar = (defpackage.bwc) bveVarC;
                int iF = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh = bwcVar.ah();
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar4);
                aferVar = defpackage.cwl.a;
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
                defpackage.cne cneVarH = defpackage.day.h(2131231825, bveVarC, 0);
                long j = defpackage.bxi.n(bveVarC).w;
                defpackage.cgc cgcVar = defpackage.cgf.e;
                defpackage.boh.a(cneVarH, "Warning", defpackage.awj.i(cgcVar, 16.0f), j, bveVarC, 440, 0);
                defpackage.asq.A(defpackage.awj.m(cgcVar, 4.0f), bveVarC);
                bveVar2 = bveVarC;
                defpackage.brv.b("Too large for car screen", null, defpackage.bxi.n(bveVarC).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVarC).o, bveVar2, 6, 0, 131066);
                bwcVar.Y(true);
                cgfVar3 = cgfVar4;
                atbVar3 = atbVar4;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar3 = cgfVar2;
                atbVar3 = atbVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.fxi(cgfVar3, atbVar3, i, i2, 14);
            }
        }
        i3 |= 48;
        atbVar2 = atbVar;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            if (i4 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            if (i5 != 0) {
                atbVar4 = defpackage.ati.a;
            } else {
                atbVar4 = atbVar2;
            }
            defpackage.cty ctyVarA2 = defpackage.awb.a(atbVar4, defpackage.cfs.n, bveVarC, (((((i3 & 14) | 384) | (i3 & 112)) >> 3) & 14) | 48);
            bwcVar = (defpackage.bwc) bveVarC;
            int iF2 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh2 = bwcVar.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVar4);
            aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA2, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh2, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN2, defpackage.cwl.c);
            defpackage.cne cneVarH2 = defpackage.day.h(2131231825, bveVarC, 0);
            long j2 = defpackage.bxi.n(bveVarC).w;
            defpackage.cgc cgcVar2 = defpackage.cgf.e;
            defpackage.boh.a(cneVarH2, "Warning", defpackage.awj.i(cgcVar2, 16.0f), j2, bveVarC, 440, 0);
            defpackage.asq.A(defpackage.awj.m(cgcVar2, 4.0f), bveVarC);
            bveVar2 = bveVarC;
            defpackage.brv.b("Too large for car screen", null, defpackage.bxi.n(bveVarC).w, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVarC).o, bveVar2, 6, 0, 131066);
            bwcVar.Y(true);
            cgfVar3 = cgfVar4;
            atbVar3 = atbVar4;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar3 = cgfVar2;
            atbVar3 = atbVar2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.fxi(cgfVar3, atbVar3, i, i2, 14);
        }
    }

    public static void z(defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bnk bnkVar;
        affgVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-66260317);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(affgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            if (defpackage.ca.bl(bveVarC)) {
                int i4 = defpackage.bnl.a;
                long j = bug.z;
                bnkVar = new defpackage.bnk(j, bug.j, bug.A, bug.k, bug.e, bug.E, bug.n, bug.F, bug.o, bug.R, bug.t, bug.S, bug.u, bug.a, bug.g, bug.I, bug.r, bug.Q, bug.s, j, bug.f, bug.d, bug.b, bug.h, bug.c, bug.i, bug.x, bug.y, bug.D, bug.J, bug.P, bug.K, bug.L, bug.M, bug.N, bug.O, bug.B, bug.C, bug.l, bug.m, bug.G, bug.H, bug.p, bug.q, bug.T, bug.U, bug.v, bug.w);
            } else {
                int i5 = defpackage.bnl.a;
                long j2 = defpackage.buh.z;
                bnkVar = new defpackage.bnk(j2, defpackage.buh.j, defpackage.buh.A, defpackage.buh.k, defpackage.buh.e, defpackage.buh.E, defpackage.buh.n, defpackage.buh.F, defpackage.buh.o, defpackage.buh.R, defpackage.buh.t, defpackage.buh.S, defpackage.buh.u, defpackage.buh.a, defpackage.buh.g, defpackage.buh.I, defpackage.buh.r, defpackage.buh.Q, defpackage.buh.s, j2, defpackage.buh.f, defpackage.buh.d, defpackage.buh.b, defpackage.buh.h, defpackage.buh.c, defpackage.buh.i, defpackage.buh.x, defpackage.buh.y, defpackage.buh.D, defpackage.buh.J, defpackage.buh.P, defpackage.buh.K, defpackage.buh.L, defpackage.buh.M, defpackage.buh.N, defpackage.buh.O, defpackage.buh.B, defpackage.buh.C, defpackage.buh.l, defpackage.buh.m, defpackage.buh.G, defpackage.buh.H, defpackage.buh.p, defpackage.buh.q, defpackage.buh.T, defpackage.buh.U, defpackage.buh.v, defpackage.buh.w);
            }
            defpackage.bom.a(bnkVar, null, oql.a, affgVar, bveVarC, (i2 << 9) & 7168, 2);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nlu(affgVar, i, 8);
        }
    }
}
