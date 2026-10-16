package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class aps implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aps(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [apw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [azo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [azz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [bgb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [cyu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [cty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [avv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v50, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v59, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [azm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.bve bveVar;
        defpackage.dgc dgcVar;
        int i = 12;
        defpackage.bll bllVar = 0;
        bllVar = null;
        defpackage.bll bllVar2 = null;
        int i2 = 3;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                ((java.lang.Float) obj2).floatValue();
                afgs afgsVar = (afgs) this.a;
                float f = afgsVar.a;
                afgsVar.a = f + this.b.a(fFloatValue - f);
                return defpackage.afbk.a;
            case 1:
                float fFloatValue2 = ((java.lang.Float) obj).floatValue();
                ((defpackage.amz) this.b).a(fFloatValue2, ((java.lang.Float) obj2).floatValue());
                ((afgs) this.a).a = fFloatValue2;
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.cvm cvmVar = (defpackage.cvm) obj;
                long j = ((defpackage.dlm) obj2).a;
                return this.b.e(cvmVar, cvmVar.r(defpackage.afbk.a, new defpackage.ccz(-431986394, true, new defpackage.aps(this.a, new defpackage.att(cvmVar, j), i2))), j);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar2.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    this.a.invoke(this.b, bveVar2, 0);
                } else {
                    bveVar2.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.bve bveVar3 = (defpackage.bve) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (bveVar3.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    java.lang.Object obj3 = this.b;
                    defpackage.ngb ngbVar = (defpackage.ngb) this.a;
                    ?? Invoke = ngbVar.c.invoke();
                    defpackage.azk azkVar = (defpackage.azk) obj3;
                    int iA = azkVar.c;
                    if ((iA >= Invoke.b() || !defpackage.afga.f(Invoke.d(iA), azkVar.a)) && (iA = Invoke.a(azkVar.a)) != -1) {
                        azkVar.c = iA;
                    }
                    if (iA != -1) {
                        bveVar3.v(-1664741271);
                        bveVar = bveVar3;
                        defpackage.axd.p(Invoke, ngbVar.b, iA, azkVar.a, bveVar, 0);
                        bveVar.o();
                    } else {
                        bveVar = bveVar3;
                        bveVar.v(-1664505826);
                        bveVar.o();
                    }
                    java.lang.Object obj4 = azkVar.a;
                    boolean zE = bveVar.E(obj3);
                    java.lang.Object objG = bveVar.g();
                    if (zE || objG == defpackage.bvd.a) {
                        objG = new defpackage.aun(obj3, 15);
                        bveVar.x(objG);
                    }
                    defpackage.bvx.c(obj4, (defpackage.affc) objG, bveVar);
                } else {
                    bveVar3.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return this.a.a(new defpackage.azp((defpackage.ngb) this.b, (defpackage.cvm) obj), ((defpackage.dlm) obj2).a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.bve bveVar4 = (defpackage.bve) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (bveVar4.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    this.a.invoke(this.b, bveVar4, 0);
                } else {
                    bveVar4.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                ((java.lang.Float) obj2).floatValue();
                defpackage.bbz bbzVar = defpackage.bca.a;
                afgs afgsVar2 = (afgs) this.a;
                afgsVar2.a += this.b.a(fFloatValue3 - afgsVar2.a);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bve bveVar5 = (defpackage.bve) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                int i3 = iIntValue4 & 3;
                int i4 = iIntValue4 & 1;
                int i5 = defpackage.bgq.a;
                if (bveVar5.I(i3 != 2, i4)) {
                    java.lang.Object obj5 = this.a;
                    boolean zC = bveVar5.C(obj5);
                    java.lang.Object objG2 = bveVar5.g();
                    if (zC || objG2 == defpackage.bvd.a) {
                        defpackage.bgp bgpVar = new defpackage.bgp(obj5, 0);
                        defpackage.lam lamVar = defpackage.byp.a;
                        objG2 = new defpackage.bvr(bgpVar, null);
                        bveVar5.x(objG2);
                    }
                    defpackage.bgq.a(this.b, (defpackage.bfx) ((defpackage.bys) objG2).a(), bveVar5, 0);
                } else {
                    bveVar5.s();
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.bil bilVar = (defpackage.bil) obj;
                android.content.Context context = (android.content.Context) obj2;
                java.lang.Object obj6 = this.b;
                defpackage.blw blwVar = (defpackage.blw) obj6;
                boolean zU = blwVar.u();
                defpackage.dfb dfbVarE = blwVar.e();
                java.lang.String str = dfbVarE != null ? dfbVarE.b : null;
                defpackage.dgc dgcVar2 = blwVar.o;
                if (dgcVar2 != null) {
                    defpackage.djv djvVar = blwVar.b;
                    long j2 = dgcVar2.b;
                    dgcVar = new defpackage.dgc(defpackage.dax.g(djvVar.a(defpackage.dgc.e(j2)), djvVar.a(defpackage.dgc.a(j2))));
                } else {
                    dgcVar = null;
                }
                java.lang.Object obj7 = this.a;
                defpackage.bki bkiVar = blwVar.t;
                defpackage.acn acnVar = new defpackage.acn(obj6, obj7, (java.lang.Object) context, 10, (byte[]) null);
                defpackage.affi affiVar = defpackage.bkk.a;
                if (str == null || dgcVar == null || bkiVar == null) {
                    java.lang.String str2 = str;
                    acnVar.invoke(bilVar);
                    if (str2 != null && dgcVar != null) {
                        defpackage.asq.U(bilVar, context, zU, str2, dgcVar.b);
                    }
                } else {
                    long j3 = dgcVar.b;
                    ajey ajeyVar = bkiVar.e;
                    if (ajeyVar.c()) {
                        defpackage.bll bllVarC = bkiVar.c();
                        if (bllVarC != null && defpackage.bkk.a(bllVarC, str, j3)) {
                            bllVar2 = bllVarC;
                        }
                        ajeyVar.d();
                        bllVar = bllVar2;
                    }
                    if (bllVar == 0) {
                        acnVar.invoke(bilVar);
                    } else {
                        android.view.textclassifier.TextClassification textClassification = bllVar.c;
                        if (!hh$.ExternalSyntheticApiModelOutline0.m(textClassification).isEmpty()) {
                            defpackage.asq.T(bilVar, bkiVar.d, textClassification, 0, (android.graphics.drawable.Drawable) bllVar.d.get(0));
                        } else if ((a$.ExternalSyntheticApiModelOutline1.m(textClassification) != null || !android.text.TextUtils.isEmpty(a$.ExternalSyntheticApiModelOutline1.m(textClassification))) && (a$.ExternalSyntheticApiModelOutline1.m(textClassification) != null || a$.ExternalSyntheticApiModelOutline1.m(textClassification) != null)) {
                            defpackage.asq.T(bilVar, bkiVar.d, textClassification, -1, a$.ExternalSyntheticApiModelOutline1.m(textClassification));
                        }
                        acnVar.invoke(bilVar);
                        java.util.List listM = hh$.ExternalSyntheticApiModelOutline0.m(textClassification);
                        int size = listM.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            a$.ExternalSyntheticApiModelOutline1.m(listM.get(i6));
                            if (i6 > 0) {
                                defpackage.asq.T(bilVar, bkiVar.d, textClassification, i6, (android.graphics.drawable.Drawable) bllVar.d.get(i6));
                            }
                        }
                    }
                    defpackage.asq.U(bilVar, context, zU, str, j3);
                }
                return defpackage.afbk.a;
            case 10:
                defpackage.bve bveVar6 = (defpackage.bve) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (bveVar6.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    ?? r1 = this.b;
                    defpackage.avv avvVar = defpackage.bms.a;
                    defpackage.cgf cgfVarA = new defpackage.awp(defpackage.bms.b, defpackage.bms.c()).a(new defpackage.avw(r1));
                    defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.e, defpackage.cfs.n, bveVar6, 54);
                    long jB = bveVar6.b();
                    long j4 = jB ^ (jB >>> 32);
                    defpackage.cdd cddVarN = bveVar6.N();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar6, cgfVarA);
                    defpackage.afer aferVar = defpackage.cwl.a;
                    bveVar6.M();
                    bveVar6.w();
                    if (bveVar6.G()) {
                        bveVar6.j(aferVar);
                    } else {
                        bveVar6.y();
                    }
                    ?? r0 = this.a;
                    defpackage.byw.c(bveVar6, ctyVarA, defpackage.cwl.e);
                    defpackage.byw.c(bveVar6, cddVarN, defpackage.cwl.d);
                    defpackage.byw.c(bveVar6, java.lang.Integer.valueOf((int) j4), defpackage.cwl.f);
                    bveVar6.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVar6, cgfVarN, defpackage.cwl.c);
                    r0.invoke(defpackage.awe.a, bveVar6, 6);
                    bveVar6.n();
                } else {
                    bveVar6.s();
                }
                return defpackage.afbk.a;
            case 11:
                defpackage.bve bveVar7 = (defpackage.bve) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                int i7 = iIntValue6 & 3;
                int i8 = iIntValue6 & 1;
                defpackage.bvm bvmVar = defpackage.bom.a;
                if (bveVar7.I(i7 != 2, i8)) {
                    defpackage.boy.a(defpackage.dai.as(-241536773, true, new defpackage.aps(this.b, this.a, i, bllVar), bveVar7), bveVar7, 6);
                } else {
                    bveVar7.s();
                }
                return defpackage.afbk.a;
            case 12:
                defpackage.bve bveVar8 = (defpackage.bve) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                int i9 = iIntValue7 & 3;
                int i10 = iIntValue7 & 1;
                defpackage.bvm bvmVar2 = defpackage.bom.a;
                if (bveVar8.I(i9 != 2, i10)) {
                    defpackage.brv.a(((defpackage.bse) this.b).j, this.a, bveVar8, 0);
                } else {
                    bveVar8.s();
                }
                return defpackage.afbk.a;
            case 13:
                int iIntValue8 = ((java.lang.Integer) obj).intValue();
                java.lang.Object obj8 = this.a;
                if (obj2 instanceof defpackage.buy) {
                    ((defpackage.cdg) obj8).f((defpackage.buy) obj2);
                } else if (!(obj2 instanceof defpackage.bya)) {
                    java.lang.Object obj9 = this.b;
                    if (obj2 instanceof defpackage.bxx) {
                        defpackage.bwd.g((defpackage.bzp) obj9, iIntValue8, obj2);
                        ((defpackage.cdg) obj8).e((defpackage.bxx) obj2);
                    } else if (obj2 instanceof defpackage.bxl) {
                        defpackage.bwd.g((defpackage.bzp) obj9, iIntValue8, obj2);
                        ((defpackage.bxl) obj2).b();
                    }
                }
                return defpackage.afbk.a;
            case 14:
                defpackage.ckc ckcVar = (defpackage.ckc) obj;
                defpackage.cmq cmqVar = (defpackage.cmq) obj2;
                java.lang.Object obj10 = this.b;
                defpackage.cyl cylVar = (defpackage.cyl) obj10;
                if (cylVar.t.an()) {
                    ?? r2 = this.a;
                    cylVar.G = ckcVar;
                    cylVar.F = cmqVar;
                    ((defpackage.cez) cylVar.ag().a).b(obj10, defpackage.cyl.p, r2);
                    cylVar.H = false;
                } else {
                    cylVar.H = true;
                }
                return defpackage.afbk.a;
            case 15:
                defpackage.bve bveVar9 = (defpackage.bve) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (bveVar9.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    ?? r3 = this.a;
                    ?? r4 = this.b;
                    bveVar9.v(1759209312);
                    defpackage.dbl.a(r4, r3, bveVar9, 0);
                    bveVar9.o();
                } else {
                    bveVar9.s();
                }
                return defpackage.afbk.a;
            default:
                defpackage.bve bveVar10 = (defpackage.bve) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                int i11 = iIntValue10 & 3;
                int i12 = iIntValue10 & 1;
                defpackage.bpi bpiVar = defpackage.ksz.a;
                if (bveVar10.I(i11 != 2, i12)) {
                    java.lang.Object obj11 = this.a;
                    java.lang.Object obj12 = this.b;
                    defpackage.dai.aB(new defpackage.bxk[]{defpackage.ksx.b.b(obj12), defpackage.bpk.b.b(defpackage.ksz.a), defpackage.bnq.a.b(new defpackage.ckd(((defpackage.ksw) obj12).R()))}, defpackage.dai.as(-1249433100, true, new defpackage.cvi(obj11, i), bveVar10), bveVar10, 48);
                } else {
                    bveVar10.s();
                }
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ aps(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
