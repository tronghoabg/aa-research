package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bmg implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bmg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [gbm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [affg] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v76, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v96, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [avv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v69, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [awd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v54, types: [cgf, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float f;
        float f2;
        java.lang.Object obj3;
        byte[] bArr = null;
        float fH = 0.0f;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                int i = iIntValue & 3;
                int i2 = iIntValue & 1;
                defpackage.avv avvVar = bmj.a;
                if (bveVar.I(i != 2, i2)) {
                    ?? r2 = this.b;
                    this.a.invoke(bveVar, 0);
                    if (r2 == 0) {
                        bveVar.v(-1102003461);
                    } else {
                        bveVar.v(795735494);
                        r2.invoke(bveVar, 0);
                    }
                    bveVar.o();
                } else {
                    bveVar.s();
                }
                break;
            case 1:
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                int i3 = iIntValue2 & 3;
                int i4 = iIntValue2 & 1;
                defpackage.avv avvVar2 = bmj.a;
                if (bveVar2.I(i3 != 2, i4)) {
                    java.lang.Object obj4 = this.b;
                    java.lang.Object obj5 = this.a;
                    float f3 = ((defpackage.dlr) bveVar2.f(defpackage.bok.c)).a;
                    if (true == java.lang.Float.isNaN(f3)) {
                        f3 = 0.0f;
                    }
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    bmj.c(((defpackage.dlr) defpackage.afqt.k(new defpackage.dlr(8.0f - (f3 - defpackage.bms.c())), new defpackage.dlr(0.0f), new defpackage.dlr(8.0f))).a, defpackage.dai.as(-459506658, true, new defpackage.bmg(obj5, obj4, false ? 1 : 0), bveVar2), bveVar2, 390);
                } else {
                    bveVar2.s();
                }
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.bve bveVar3 = (defpackage.bve) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (bveVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    this.b.invoke(this.a, bveVar3, 0);
                } else {
                    bveVar3.s();
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bve bveVar4 = (defpackage.bve) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                int i5 = iIntValue4 & 3;
                int i6 = iIntValue4 & 1;
                float f4 = bos.a;
                if (bveVar4.I(i5 != 2, i6)) {
                    defpackage.cgf cgfVarJ = defpackage.asq.J(this.a.b(defpackage.cgf.e, 1.0f, true), 0.0f, 0.0f, 0.0f, 0.0f);
                    defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                    int iF = defpackage.a.f(bveVar4.b());
                    defpackage.cdd cddVarN = bveVar4.N();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar4, cgfVarJ);
                    defpackage.afer aferVar = defpackage.cwl.a;
                    bveVar4.M();
                    bveVar4.w();
                    if (bveVar4.G()) {
                        bveVar4.j(aferVar);
                    } else {
                        bveVar4.y();
                    }
                    ?? r0 = this.b;
                    defpackage.byw.c(bveVar4, ctyVarB, defpackage.cwl.e);
                    defpackage.byw.c(bveVar4, cddVarN, defpackage.cwl.d);
                    defpackage.byw.c(bveVar4, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                    defpackage.byw.b(bveVar4, defpackage.cwl.g);
                    defpackage.byw.c(bveVar4, cgfVarN, defpackage.cwl.c);
                    r0.invoke(bveVar4, 0);
                    bveVar4.n();
                } else {
                    bveVar4.s();
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.bve bveVar5 = (defpackage.bve) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (bveVar5.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    this.b.invoke(this.a, bveVar5, 6);
                } else {
                    bveVar5.s();
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bve bveVar6 = (defpackage.bve) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (bveVar6.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    this.b.invoke(this.a, bveVar6, 6);
                } else {
                    bveVar6.s();
                }
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.bve bveVar7 = (defpackage.bve) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (bveVar7.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    this.b.invoke(this.a, bveVar7, 0);
                } else {
                    bveVar7.s();
                }
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bve bveVar8 = (defpackage.bve) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (bveVar8.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    ?? r3 = this.a;
                    defpackage.cgc cgcVar = defpackage.cgf.e;
                    int i7 = defpackage.bsb.a;
                    defpackage.cgf cgfVarG = defpackage.asq.G(defpackage.awj.q(cgcVar, 0.0f, 40.0f, 1), r3);
                    defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.e, defpackage.cfs.n, bveVar8, 54);
                    int iF2 = defpackage.a.f(bveVar8.b());
                    defpackage.cdd cddVarN2 = bveVar8.N();
                    defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVar8, cgfVarG);
                    defpackage.afer aferVar2 = defpackage.cwl.a;
                    bveVar8.M();
                    bveVar8.w();
                    if (bveVar8.G()) {
                        bveVar8.j(aferVar2);
                    } else {
                        bveVar8.y();
                    }
                    ?? r1 = this.b;
                    defpackage.byw.c(bveVar8, ctyVarA, defpackage.cwl.e);
                    defpackage.byw.c(bveVar8, cddVarN2, defpackage.cwl.d);
                    defpackage.byw.c(bveVar8, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                    defpackage.byw.b(bveVar8, defpackage.cwl.g);
                    defpackage.byw.c(bveVar8, cgfVarN2, defpackage.cwl.c);
                    r1.invoke(defpackage.awe.a, bveVar8, 6);
                    bveVar8.n();
                } else {
                    bveVar8.s();
                }
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int iIntValue9 = ((java.lang.Integer) obj).intValue();
                defpackage.dec decVar = (defpackage.dec) obj2;
                if (!((defpackage.zq) ((defpackage.bil) this.b).b).a(decVar.c)) {
                    defpackage.cgx cgxVar = (defpackage.cgx) this.a;
                    cgxVar.m(iIntValue9, decVar);
                    cgxVar.k();
                }
                break;
            case 9:
                defpackage.bve bveVar9 = (defpackage.bve) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                if (bveVar9.I((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    defpackage.dai.N((defpackage.cou) this.a, this.b, bveVar9, 0);
                } else {
                    bveVar9.s();
                }
                break;
            case 10:
                defpackage.bve bveVar10 = (defpackage.bve) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                if (bveVar10.I((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    boolean zA = ((defpackage.ctl) this.a).a();
                    bveVar10.L(java.lang.Boolean.valueOf(zA));
                    boolean zD = bveVar10.D(zA);
                    if (zA) {
                        this.b.invoke(bveVar10, 0);
                    } else {
                        bveVar10.k(zD);
                    }
                    bveVar10.q();
                } else {
                    bveVar10.s();
                }
                break;
            case 11:
                defpackage.bve bveVar11 = (defpackage.bve) obj;
                int iIntValue12 = ((java.lang.Integer) obj2).intValue();
                if (bveVar11.I((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    java.lang.Object obj6 = this.b;
                    boolean zE = bveVar11.E(obj6);
                    java.lang.Object objG = bveVar11.g();
                    if (zE || objG == defpackage.bvd.a) {
                        objG = new defpackage.bso(this.a, obj6, 10, bArr);
                        bveVar11.x(objG);
                    }
                    defpackage.rj.e((defpackage.afer) objG, null, null, 0L, 0L, null, dlk.a, bveVar11, 12582912);
                } else {
                    bveVar11.s();
                }
                break;
            case 12:
                defpackage.bve bveVar12 = (defpackage.bve) obj;
                int iIntValue13 = ((java.lang.Integer) obj2).intValue();
                if (bveVar12.I((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    dlj.a((java.lang.String) this.a, (java.lang.String) this.b, bveVar12, new java.lang.Object[0]);
                } else {
                    bveVar12.s();
                }
                break;
            case 13:
                defpackage.bve bveVar13 = (defpackage.bve) obj;
                int iIntValue14 = ((java.lang.Integer) obj2).intValue();
                int i8 = iIntValue14 & 3;
                int i9 = iIntValue14 & 1;
                defpackage.bvm bvmVar = dnj.a;
                if (bveVar13.I(i8 != 2, i9)) {
                    defpackage.cgc cgcVar2 = defpackage.cgf.e;
                    java.lang.Object objG2 = bveVar13.g();
                    java.lang.Object obj7 = defpackage.bvd.a;
                    if (objG2 == obj7) {
                        objG2 = new dne(1);
                        bveVar13.x(objG2);
                    }
                    java.lang.Object obj8 = this.b;
                    defpackage.cgf cgfVarA = defpackage.dea.a(cgcVar2, false, (defpackage.affc) objG2);
                    boolean zE2 = bveVar13.E(obj8);
                    java.lang.Object objG3 = bveVar13.g();
                    if (zE2 || objG3 == obj7) {
                        objG3 = new defpackage.deh(obj8, 11);
                        bveVar13.x(objG3);
                    }
                    ?? r4 = this.a;
                    defpackage.cgf cgfVarAn = defpackage.dai.an(defpackage.ty.d(cgfVarA, (defpackage.affc) objG3), true != ((java.lang.Boolean) ((dny) obj8).h.a()).booleanValue() ? 0.0f : 1.0f);
                    defpackage.affg affgVar = (defpackage.affg) r4.a();
                    java.lang.Object objG4 = bveVar13.g();
                    if (objG4 == obj7) {
                        objG4 = dni.a;
                        bveVar13.x(objG4);
                    }
                    defpackage.cty ctyVar = (defpackage.cty) objG4;
                    int iF3 = defpackage.a.f(bveVar13.b());
                    defpackage.cdd cddVarN3 = bveVar13.N();
                    defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVar13, cgfVarAn);
                    defpackage.afer aferVar3 = defpackage.cwl.a;
                    bveVar13.M();
                    bveVar13.w();
                    if (bveVar13.G()) {
                        bveVar13.j(aferVar3);
                    } else {
                        bveVar13.y();
                    }
                    defpackage.byw.c(bveVar13, ctyVar, defpackage.cwl.e);
                    defpackage.byw.c(bveVar13, cddVarN3, defpackage.cwl.d);
                    defpackage.byw.c(bveVar13, java.lang.Integer.valueOf(iF3), defpackage.cwl.f);
                    defpackage.byw.b(bveVar13, defpackage.cwl.g);
                    defpackage.byw.c(bveVar13, cgfVarN3, defpackage.cwl.c);
                    affgVar.invoke(bveVar13, 0);
                    bveVar13.n();
                } else {
                    bveVar13.s();
                }
                break;
            case 14:
                defpackage.bve bveVar14 = (defpackage.bve) obj;
                int iIntValue15 = ((java.lang.Integer) obj2).intValue();
                int i10 = iIntValue15 & 3;
                int i11 = iIntValue15 & 1;
                defpackage.bvm bvmVar2 = dnj.a;
                if (bveVar14.I(i10 != 2, i11)) {
                    defpackage.dai.aA(dnj.a.b(java.lang.Boolean.TRUE), defpackage.dai.as(1022273628, true, new defpackage.bmg(this.b, this.a, 13, bArr), bveVar14), bveVar14, 56);
                } else {
                    bveVar14.s();
                }
                break;
            case 15:
                defpackage.bve bveVar15 = (defpackage.bve) obj;
                int iIntValue16 = ((java.lang.Integer) obj2).intValue();
                if (bveVar15.I((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    gdd.d(defpackage.bzd.q(defpackage.awj.c(defpackage.cgf.e, 1.0f), (defpackage.cit) this.a), (gdf) this.b, bveVar15, 64);
                } else {
                    bveVar15.s();
                }
                break;
            case 16:
                defpackage.bve bveVar16 = (defpackage.bve) obj;
                int iIntValue17 = ((java.lang.Integer) obj2).intValue();
                if (bveVar16.I((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    ?? r5 = this.b;
                    this.a.invoke(bveVar16, 6);
                    r5.invoke(bveVar16, 6);
                } else {
                    bveVar16.s();
                }
                break;
            case 17:
                defpackage.bve bveVar17 = (defpackage.bve) obj;
                int iIntValue18 = ((java.lang.Integer) obj2).intValue();
                if (bveVar17.I((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    goi.f((defpackage.cgf) null, (gbm) this.a, (defpackage.afer) this.b, bveVar17, 0);
                } else {
                    bveVar17.s();
                }
                break;
            case 18:
                defpackage.bve bveVar18 = (defpackage.bve) obj;
                int iIntValue19 = ((java.lang.Integer) obj2).intValue();
                if (bveVar18.I((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    boolean z = bveVar18.f(defpackage.dbl.i) == defpackage.dlz.a && ((hjw) bveVar18.f(hjx.a)).a(hjv.b, hju.b);
                    gpk gpkVar = (gpk) this.b;
                    gpj gpjVar = gpkVar.b;
                    boolean z2 = gpjVar.b;
                    boolean z3 = z2 || gpjVar.d;
                    if (z && z3) {
                        bveVar18.v(-1402572446);
                        float fH2 = fxf.h(bveVar18);
                        bveVar18.o();
                        f = fH2;
                    } else {
                        bveVar18.v(-1402530255);
                        bveVar18.o();
                        f = fH;
                    }
                    defpackage.bys bysVarA = defpackage.aef.a(f, null, "surfaceAreaStartAnchor", null, bveVar18, 384, 10);
                    if (z || !z2) {
                        bveVar18.v(-1402227695);
                        bveVar18.o();
                        f2 = fH;
                    } else {
                        bveVar18.v(-1402269886);
                        float fH3 = fxf.h(bveVar18);
                        bveVar18.o();
                        f2 = fH3;
                    }
                    defpackage.bys bysVarA2 = defpackage.aef.a(f2, null, "surfaceAreaTopAnchor", null, bveVar18, 384, 10);
                    if (z || !gpjVar.d) {
                        bveVar18.v(-1401928111);
                        bveVar18.o();
                    } else {
                        bveVar18.v(-1401970302);
                        fH = fxf.h(bveVar18);
                        bveVar18.o();
                    }
                    ?? r6 = this.a;
                    hgm hgmVar = new hgm(new hgl(new defpackage.dlr(((defpackage.dlr) bysVarA.a()).a), new defpackage.dlr(((defpackage.dlr) defpackage.aef.a(fH, null, "surfaceAreaEndAnchor", null, bveVar18, 384, 10).a()).a), new defpackage.dlr(((defpackage.dlr) bysVarA2.a()).a)), false, 29);
                    if (gpkVar.d) {
                        bveVar18.v(-1401490112);
                        goi.e(gpkVar.c, hgmVar, gpkVar.a, (defpackage.cgf) r6, gpkVar.e, gpkVar.f, gpkVar.g, gpjVar.e, bveVar18, 2097152);
                        bveVar18.o();
                    } else {
                        bveVar18.v(-1401094583);
                        goi.c(gpkVar.c, hgmVar, gpkVar.h, gpkVar.a, z, (defpackage.cgf) r6, gpkVar.g, gpjVar.a, gpjVar.c, bveVar18, 2097152);
                        bveVar18.o();
                    }
                } else {
                    bveVar18.s();
                }
                break;
            case 19:
                defpackage.bve bveVar19 = (defpackage.bve) obj;
                int iIntValue20 = ((java.lang.Integer) obj2).intValue();
                if (bveVar19.I((iIntValue20 & 3) != 2, iIntValue20 & 1)) {
                    java.lang.Object obj9 = this.b;
                    java.lang.Object obj10 = this.a;
                    defpackage.ccz cczVarAs = defpackage.dai.as(1992073171, true, new goh(obj9, 4), bveVar19);
                    if (obj10 == null) {
                        obj3 = obj10;
                        obj3 = guc.a;
                    }
                    obj3 = obj10;
                    hkz.d((defpackage.cgf) null, cczVarAs, obj3, bveVar19, 48, 1);
                } else {
                    bveVar19.s();
                }
                break;
            default:
                defpackage.bve bveVar20 = (defpackage.bve) obj;
                int iIntValue21 = ((java.lang.Integer) obj2).intValue();
                if (bveVar20.I((iIntValue21 & 3) != 2, iIntValue21 & 1)) {
                    ?? r7 = this.a;
                    if (r7 == 0) {
                        bveVar20.v(-371891563);
                    } else {
                        bveVar20.v(-2090206484);
                        r7.invoke(bveVar20, 0);
                    }
                    bveVar20.o();
                    ?? r8 = this.b;
                    if (r8 == 0) {
                        bveVar20.v(-371852875);
                    } else {
                        bveVar20.v(-2090205236);
                        r8.invoke(bveVar20, 0);
                    }
                    bveVar20.o();
                } else {
                    bveVar20.s();
                }
                break;
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bmg(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
