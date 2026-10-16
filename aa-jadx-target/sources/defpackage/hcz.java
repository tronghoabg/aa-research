package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class hcz implements defpackage.affh {
    public final /* synthetic */ float a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hcz(float f, defpackage.cne cneVar, int i) {
        this.c = i;
        this.a = f;
        this.b = cneVar;
    }

    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        final defpackage.bys bysVar;
        int i = this.c;
        if (i == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            ((defpackage.bil) obj).getClass();
            int i2 = iIntValue & 17;
            if (bveVar.I(i2 != 16, iIntValue & 1)) {
                float f = this.a;
                hda hdaVar = (hda) this.b;
                guj.q(hdaVar.e, hdaVar.c, f, defpackage.awj.r(defpackage.cgf.e), bveVar, 3072);
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.bve bveVar2 = (defpackage.bve) obj2;
            int iIntValue2 = ((java.lang.Integer) obj3).intValue();
            ((defpackage.atx) obj).getClass();
            int i3 = iIntValue2 & 17;
            if (bveVar2.I(i3 != 16, iIntValue2 & 1)) {
                defpackage.cgc cgcVar = defpackage.cgf.e;
                float f2 = defpackage.gjr.P3.k;
                defpackage.cgf cgfVarI = defpackage.asq.I(cgcVar, f2, defpackage.gjr.P2.k);
                defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.c, defpackage.cfs.j, bveVar2, 0);
                int iF = defpackage.a.f(bveVar2.b());
                defpackage.cdd cddVarN = bveVar2.N();
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarI);
                defpackage.afer aferVar = defpackage.cwl.a;
                bveVar2.M();
                bveVar2.w();
                if (bveVar2.G()) {
                    bveVar2.j(aferVar);
                } else {
                    bveVar2.y();
                }
                float f3 = this.a;
                java.lang.Object obj4 = this.b;
                defpackage.byw.c(bveVar2, ctyVarA, defpackage.cwl.e);
                defpackage.byw.c(bveVar2, cddVarN, defpackage.cwl.d);
                defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                defpackage.byw.b(bveVar2, defpackage.cwl.g);
                defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                gun gunVar = (gun) obj4;
                gah gahVar = gunVar.h;
                if (defpackage.dlr.a(f3, gahVar != null ? 160.0f : 136.0f) < 0 || gunVar.j) {
                    bveVar2.v(1825666543);
                    bveVar2.o();
                } else {
                    bveVar2.v(1825263884);
                    gcw gcwVar = gunVar.g;
                    gum.e((defpackage.cgf) null, gcwVar, gahVar, bveVar2, 576);
                    if (gcwVar == null || !gcwVar.b()) {
                        bveVar2.v(1825654639);
                        bveVar2.o();
                    } else {
                        bveVar2.v(1825400935);
                        defpackage.xi.a(defpackage.dai.H(defpackage.asq.I(cgcVar, 0.0f, defpackage.gjr.P1.k), new gup(f2, 0)), 0.0f, defpackage.gvt.e(bveVar2).B(), bveVar2, 0, 2);
                        bveVar2.o();
                    }
                    bveVar2.o();
                }
                gum.d(gunVar, (defpackage.cgf) null, bveVar2, gun.a);
                bveVar2.n();
            } else {
                bveVar2.s();
            }
            return defpackage.afbk.a;
        }
        if (i != 2) {
            defpackage.bve bveVar3 = (defpackage.bve) obj2;
            int iIntValue3 = ((java.lang.Integer) obj3).intValue();
            ((defpackage.atx) obj).getClass();
            if (bveVar3.I((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                java.lang.Object obj5 = this.b;
                float f4 = this.a;
                long j = ((defpackage.ckd) bveVar3.f(defpackage.bnq.a)).a;
                defpackage.cgc cgcVar2 = defpackage.cgf.e;
                defpackage.ktf ktfVar = nmt.a;
                defpackage.boh.a((defpackage.cne) obj5, null, defpackage.awj.i(defpackage.asq.I(cgcVar2, 0.0f, 2.5f), f4), j, bveVar3, 56, 0);
            } else {
                bveVar3.s();
            }
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar4 = (defpackage.bve) obj2;
        int iIntValue4 = ((java.lang.Integer) obj3).intValue();
        ((defpackage.atx) obj).getClass();
        if (bveVar4.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
            android.content.Context context = (android.content.Context) bveVar4.f(defpackage.daj.b);
            java.lang.Object objG = bveVar4.g();
            java.lang.Object obj6 = defpackage.bvd.a;
            if (objG == obj6) {
                objG = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(-1);
                bveVar4.x(objG);
            }
            java.lang.Object obj7 = this.b;
            final defpackage.nbg nbgVar = (defpackage.nbg) obj7;
            final defpackage.byj byjVar = (defpackage.byj) objG;
            defpackage.bys bysVarM = defpackage.bxi.m(nbgVar.e, defpackage.afce.a, bveVar4);
            defpackage.eqp eqpVar = nbgVar.j;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            defpackage.bys bysVarM2 = defpackage.bxi.m(eqpVar, bool, bveVar4);
            defpackage.bys bysVarM3 = defpackage.bxi.m(nbgVar.i, bool, bveVar4);
            java.lang.Object objG2 = bveVar4.g();
            if (objG2 == obj6) {
                defpackage.mtd mtdVar = new defpackage.mtd(bysVarM3, bysVarM, 10);
                defpackage.lam lamVar = defpackage.byp.a;
                defpackage.bvr bvrVar = new defpackage.bvr(mtdVar, null);
                bveVar4.x(bvrVar);
                objG2 = bvrVar;
            }
            defpackage.bys bysVar2 = (defpackage.bys) objG2;
            java.lang.Object objG3 = bveVar4.g();
            if (objG3 == obj6) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, defpackage.bxv.c);
                bveVar4.x(parcelableSnapshotMutableState);
                objG3 = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objG3;
            java.lang.Object objG4 = bveVar4.g();
            if (objG4 == obj6) {
                defpackage.mtd mtdVar2 = new defpackage.mtd((java.lang.Object) bysVarM2, (java.lang.Object) bwxVar, 11);
                defpackage.lam lamVar2 = defpackage.byp.a;
                defpackage.bvr bvrVar2 = new defpackage.bvr(mtdVar2, null);
                bveVar4.x(bvrVar2);
                objG4 = bvrVar2;
            }
            if (((java.lang.Boolean) ((defpackage.bys) objG4).a()).booleanValue()) {
                bveVar4.v(501458648);
                java.lang.Object objG5 = bveVar4.g();
                if (objG5 == obj6) {
                    objG5 = new defpackage.mus(13);
                    bveVar4.x(objG5);
                }
                bveVar4.r((defpackage.afer) objG5);
                bveVar4.o();
            } else {
                bveVar4.v(501689288);
                bveVar4.o();
            }
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) bysVarM2.a()).booleanValue());
            boolean zC = bveVar4.C(bysVarM2);
            java.lang.Object objG6 = bveVar4.g();
            if (zC || objG6 == obj6) {
                objG6 = new defpackage.dxh(bysVarM2, bwxVar, (defpackage.afdk) null, 16);
                bveVar4.x(objG6);
            }
            defpackage.bvx.g(boolValueOf, (defpackage.affg) objG6, bveVar4);
            boolean zBooleanValue = ((java.lang.Boolean) bysVarM2.a()).booleanValue();
            boolean zBooleanValue2 = ((java.lang.Boolean) bysVar2.a()).booleanValue();
            boolean zE = bveVar4.E(obj7) | bveVar4.E(context) | bveVar4.C(bysVarM);
            java.lang.Object objG7 = bveVar4.g();
            if (zE || objG7 == obj6) {
                defpackage.fpk fpkVar = new defpackage.fpk(nbgVar, context, bysVarM, byjVar, 5);
                bysVar = bysVarM;
                bveVar4.x(fpkVar);
                objG7 = fpkVar;
            } else {
                bysVar = bysVarM;
            }
            defpackage.mkc.s(zBooleanValue, zBooleanValue2, null, this.a, (defpackage.afer) objG7, bveVar4, 0);
            defpackage.bys bysVarM4 = defpackage.bxi.m(nbgVar.g, defpackage.nbf.a, bveVar4);
            defpackage.nbf nbfVarL = defpackage.mkc.l(bysVarM4);
            boolean zC2 = bveVar4.C(bysVarM4);
            java.lang.Object objG8 = bveVar4.g();
            if (zC2 || objG8 == obj6) {
                objG8 = new defpackage.dxp(bysVarM4, (defpackage.afdk) null, 19);
                bveVar4.x(objG8);
            }
            defpackage.bvx.g(nbfVarL, (defpackage.affg) objG8, bveVar4);
            defpackage.ca.I(defpackage.mkc.l(bysVarM4), null, null, "MediaSuggestionsState", defpackage.dai.as(-1166362850, true, new defpackage.affh() { // from class: naw
                @Override // defpackage.affh
                public final java.lang.Object invoke(java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
                    defpackage.nbf nbfVar = (defpackage.nbf) obj8;
                    defpackage.bve bveVar5 = (defpackage.bve) obj9;
                    int iIntValue5 = ((java.lang.Integer) obj10).intValue();
                    nbfVar.getClass();
                    if ((iIntValue5 & 6) == 0) {
                        iIntValue5 |= true != bveVar5.A(nbfVar.ordinal()) ? 2 : 4;
                    }
                    if (bveVar5.I((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                        defpackage.byj byjVar2 = byjVar;
                        defpackage.nbg nbgVar2 = nbgVar;
                        int iOrdinal = nbfVar.ordinal();
                        if (iOrdinal == 0) {
                            bveVar5.v(-829594443);
                            defpackage.afct afctVar = new defpackage.afct(10);
                            for (int i4 = 0; i4 < 10; i4++) {
                                afctVar.add(defpackage.afbk.a);
                            }
                            java.util.List listF = afctVar.f();
                            java.lang.Object objG9 = bveVar5.g();
                            if (objG9 == defpackage.bvd.a) {
                                objG9 = new defpackage.mzv(byjVar2, 12);
                                bveVar5.x(objG9);
                            }
                            defpackage.mkc.m(listF, null, 0, (defpackage.affc) objG9, null, defpackage.mxm.a, bveVar5, 199680, 22);
                            bveVar5.o();
                        } else if (iOrdinal == 1) {
                            defpackage.bys bysVar3 = bysVar;
                            bveVar5.v(-828184532);
                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(byjVar2.e());
                            java.util.List listAq = defpackage.tna.aq(bysVar3);
                            boolean zE2 = bveVar5.E(nbgVar2) | bveVar5.C(bysVar3);
                            java.lang.Object objG10 = bveVar5.g();
                            if (zE2 || objG10 == defpackage.bvd.a) {
                                gqt gqtVar = new gqt(nbgVar2, byjVar2, bysVar3, (defpackage.afdk) null, 2);
                                bveVar5.x(gqtVar);
                                objG10 = gqtVar;
                            }
                            defpackage.bvx.f(numValueOf, listAq, (defpackage.affg) objG10, bveVar5);
                            java.util.List listAq2 = defpackage.tna.aq(bysVar3);
                            java.lang.Object objG11 = bveVar5.g();
                            if (objG11 == defpackage.bvd.a) {
                                objG11 = new defpackage.mzv(byjVar2, 13);
                                bveVar5.x(objG11);
                            }
                            defpackage.mkc.m(listAq2, null, 0, (defpackage.affc) objG11, defpackage.mxm.b, defpackage.dai.as(859401831, true, new dxt(nbgVar2, 10), bveVar5), bveVar5, 224256, 6);
                            bveVar5.o();
                        } else {
                            if (iOrdinal != 2) {
                                bveVar5.v(111772779);
                                bveVar5.o();
                                throw new defpackage.afas();
                            }
                            bveVar5.v(-830141562);
                            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(byjVar2.e());
                            boolean zE3 = bveVar5.E(nbgVar2);
                            java.lang.Object objG12 = bveVar5.g();
                            if (zE3 || objG12 == defpackage.bvd.a) {
                                objG12 = new defpackage.dxh(nbgVar2, byjVar2, (defpackage.afdk) null, 17);
                                bveVar5.x(objG12);
                            }
                            defpackage.bvx.g(numValueOf2, (defpackage.affg) objG12, bveVar5);
                            defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.cgf.e, 1.0f);
                            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
                            int iF2 = defpackage.a.f(bveVar5.b());
                            defpackage.cdd cddVarN2 = bveVar5.N();
                            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVar5, cgfVarC);
                            defpackage.afer aferVar2 = defpackage.cwl.a;
                            bveVar5.M();
                            bveVar5.w();
                            if (bveVar5.G()) {
                                bveVar5.j(aferVar2);
                            } else {
                                bveVar5.y();
                            }
                            defpackage.byw.c(bveVar5, ctyVarB, defpackage.cwl.e);
                            defpackage.byw.c(bveVar5, cddVarN2, defpackage.cwl.d);
                            defpackage.byw.c(bveVar5, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                            defpackage.byw.b(bveVar5, defpackage.cwl.g);
                            defpackage.byw.c(bveVar5, cgfVarN2, defpackage.cwl.c);
                            defpackage.brv.b(defpackage.vm.e(2132084423, bveVar5), null, defpackage.kfp.i(bveVar5).t(), 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVar5).i, bveVar5, 0, 0, 131066);
                            bveVar5.n();
                            bveVar5.o();
                        }
                    } else {
                        bveVar5.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVar4), bveVar4, 27648, 6);
        } else {
            bveVar4.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ hcz(java.lang.Object obj, float f, int i) {
        this.c = i;
        this.b = obj;
        this.a = f;
    }
}
