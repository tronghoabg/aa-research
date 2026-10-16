package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class cvi implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cvi(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:154:0x03f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x03fb  */
    /* JADX WARN: Type inference failed for: r0v29, types: [dfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [affc, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = 10;
        aiwg aiwgVarH = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.cxl cxlVar = (defpackage.cxl) obj;
                defpackage.ctu ctuVar = cxlVar.x;
                java.lang.Object obj3 = this.a;
                if (ctuVar == null) {
                    defpackage.ctu ctuVar2 = new defpackage.ctu(cxlVar, ((defpackage.cvl) obj3).a);
                    cxlVar.x = ctuVar2;
                    ctuVar = ctuVar2;
                }
                defpackage.cvl cvlVar = (defpackage.cvl) obj3;
                cvlVar.b = ctuVar;
                cvlVar.a().k();
                defpackage.ctu ctuVarA = cvlVar.a();
                defpackage.cvo cvoVar = cvlVar.a;
                if (ctuVarA.c != cvoVar) {
                    ctuVarA.c = cvoVar;
                    ctuVarA.l(false);
                    ctuVarA.a.X(false, true, true);
                }
                return defpackage.afbk.a;
            case 1:
                return java.lang.Float.valueOf(defpackage.ty.c((defpackage.cuw) obj, true, (defpackage.cvd[]) this.a, ((java.lang.Float) obj2).floatValue()));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.cvl) this.a).a().b = (defpackage.bvi) obj2;
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ctu ctuVarA2 = ((defpackage.cvl) this.a).a();
                ((defpackage.cxl) obj).ad(new defpackage.ctq(ctuVarA2, (defpackage.affg) obj2, ctuVarA2.k));
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Float.valueOf(defpackage.ty.c((defpackage.cuw) obj, false, (defpackage.cvd[]) this.a, ((java.lang.Float) obj2).floatValue()));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Float.valueOf(defpackage.ty.c((defpackage.cuw) obj, true, (defpackage.cvd[]) this.a, ((java.lang.Float) obj2).floatValue()));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    ((defpackage.czl) this.a).b(bveVar, 0);
                } else {
                    bveVar.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(this.a.a(defpackage.ckn.e((android.graphics.RectF) obj), defpackage.ckn.e((android.graphics.RectF) obj2)));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (bveVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    ((defpackage.kmi) this.a).q(bveVar2, 0);
                } else {
                    bveVar2.s();
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.bve bveVar3 = (defpackage.bve) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (bveVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    java.lang.Object obj4 = this.a;
                    defpackage.cgc cgcVar = defpackage.cgf.e;
                    boolean zE = bveVar3.E(obj4);
                    java.lang.Object objG = bveVar3.g();
                    if (zE || objG == defpackage.bvd.a) {
                        objG = new defpackage.dbj(obj4, 12);
                        bveVar3.x(objG);
                    }
                    defpackage.cgf cgfVarA = defpackage.bzd.r(cgcVar, (defpackage.affc) objG).a(defpackage.ajw.a);
                    defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                    long jB = bveVar3.b();
                    long j = jB ^ (jB >>> 32);
                    defpackage.cdd cddVarN = bveVar3.N();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar3, cgfVarA);
                    defpackage.afer aferVar = defpackage.cwl.a;
                    bveVar3.M();
                    bveVar3.w();
                    if (bveVar3.G()) {
                        bveVar3.j(aferVar);
                    } else {
                        bveVar3.y();
                    }
                    defpackage.byw.c(bveVar3, ctyVarB, defpackage.cwl.e);
                    defpackage.byw.c(bveVar3, cddVarN, defpackage.cwl.d);
                    defpackage.byw.c(bveVar3, java.lang.Integer.valueOf((int) j), defpackage.cwl.f);
                    bveVar3.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVar3, cgfVarN, defpackage.cwl.c);
                    defpackage.affg affgVar = (defpackage.affg) ((defpackage.kmm) obj4).b.a();
                    if (affgVar == null) {
                        bveVar3.v(57824944);
                    } else {
                        bveVar3.v(278959985);
                        affgVar.invoke(bveVar3, 0);
                    }
                    bveVar3.o();
                    bveVar3.n();
                } else {
                    bveVar3.s();
                }
                return defpackage.afbk.a;
            case 10:
                defpackage.bve bveVar4 = (defpackage.bve) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (bveVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    ((defpackage.kmn) this.a).a(bveVar4, 0);
                } else {
                    bveVar4.s();
                }
                return defpackage.afbk.a;
            case 11:
                defpackage.bve bveVar5 = (defpackage.bve) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (bveVar5.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    java.lang.Object obj5 = this.a;
                    defpackage.dai.aA(defpackage.kmo.a.b(obj5), defpackage.dai.as(316376156, true, new defpackage.cvi(obj5, i), bveVar5), bveVar5, 48);
                } else {
                    bveVar5.s();
                }
                return defpackage.afbk.a;
            case 12:
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                ?? r0 = this.a;
                defpackage.bpi bpiVar = defpackage.ksz.a;
                return defpackage.tna.aN(r0, (defpackage.bve) obj, iIntValue6);
            case 13:
                return defpackage.tna.aN(this.a, (defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 14:
                defpackage.bve bveVar6 = (defpackage.bve) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (bveVar6.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    java.lang.Object obj6 = this.a;
                    com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton carButton = (com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton) obj6;
                    defpackage.kwd kwdVar = ((defpackage.kwh) carButton.b.a()).f;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(carButton.g.e());
                    if (numValueOf.intValue() <= 0) {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        bveVar6.v(-1684764028);
                    } else {
                        bveVar6.v(-1684764027);
                        aiwgVarH = defpackage.day.h(numValueOf.intValue(), bveVar6, 0);
                    }
                    bveVar6.o();
                    aiwg aiwgVar = aiwgVarH;
                    java.lang.String str = (java.lang.String) carButton.d.a();
                    defpackage.ktf ktfVar = (defpackage.ktf) carButton.c.a();
                    long j2 = ((defpackage.ckd) carButton.e.a()).a;
                    long j3 = ((defpackage.ckd) carButton.f.a()).a;
                    boolean zE2 = bveVar6.E(obj6);
                    java.lang.Object objG2 = bveVar6.g();
                    if (zE2 || objG2 == defpackage.bvd.a) {
                        objG2 = new defpackage.djm(obj6, i);
                        bveVar6.x(objG2);
                    }
                    defpackage.ktf ktfVar2 = defpackage.ktf.a;
                    kwdVar.a(aiwgVar, str, ktfVar, j2, j3, (defpackage.afer) objG2, bveVar6, 8);
                } else {
                    bveVar6.s();
                }
                return defpackage.afbk.a;
            case 15:
                defpackage.bve bveVar7 = (defpackage.bve) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                int i2 = iIntValue8 & 3;
                int i3 = iIntValue8 & 1;
                if (bveVar7.I(i2 != 2, i3)) {
                    com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = ((defpackage.nne) this.a).c;
                    if (ghIcon != null) {
                        bveVar7.v(-2133633113);
                        defpackage.ca.bb(defpackage.lgo.f(ghIcon, 0.0f, bveVar7, 3), null, null, null, null, 0.0f, null, bveVar7, 56, 124);
                        bveVar7.o();
                    } else {
                        bveVar7.v(-2133553350);
                        bveVar7.o();
                    }
                } else {
                    bveVar7.s();
                }
                return defpackage.afbk.a;
            case 16:
                defpackage.bve bveVar8 = (defpackage.bve) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                int i4 = iIntValue9 & 3;
                int i5 = iIntValue9 & 1;
                int i6 = defpackage.nob.a;
                if (bveVar8.I(i4 != 2, i5)) {
                    com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2 = ((defpackage.nod) this.a).d;
                    if (ghIcon2 != null) {
                        bveVar8.v(1424007276);
                        defpackage.ca.bb(defpackage.lgo.f(ghIcon2, 0.0f, bveVar8, 3), null, null, null, null, 0.0f, null, bveVar8, 56, 124);
                        bveVar8.o();
                    } else {
                        bveVar8.v(1424098571);
                        bveVar8.o();
                    }
                } else {
                    bveVar8.s();
                }
                return defpackage.afbk.a;
            case 17:
                defpackage.afdo afdoVar = defpackage.tcu.a;
                if (((java.lang.Boolean) this.a.invoke(obj)).booleanValue()) {
                    return obj2;
                }
                return null;
            default:
                int iIntValue10 = ((java.lang.Integer) obj).intValue();
                aiwg aiwgVar2 = (defpackage.afdm) obj2;
                defpackage.afdn<?> key = aiwgVar2.getKey();
                aiwg aiwgVar3 = ((ajcc) this.a).b.get(key);
                if (key == aiwg.d) {
                    aiwg aiwgVar4 = aiwgVar3;
                    aiwgVar2.getClass();
                    for (aiwg aiwgVarHa = aiwgVar2; aiwgVarHa != null; aiwgVarHa = ((ajdw) aiwgVarHa).ha()) {
                        if (aiwgVarHa == aiwgVar4 || !(aiwgVarHa instanceof ajdw)) {
                            aiwgVarH = aiwgVarHa;
                            if (aiwgVarH == aiwgVar4) {
                                throw new java.lang.IllegalStateException(defpackage.a.bv(aiwgVar4, aiwgVarH, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ", ", expected child of ", ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"));
                            }
                            if (aiwgVar4 != null) {
                                iIntValue10++;
                            }
                        }
                    }
                    if (aiwgVarH == aiwgVar4) {
                        throw new java.lang.IllegalStateException(defpackage.a.bv(aiwgVar4, aiwgVarH, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ", ", expected child of ", ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"));
                    }
                    if (aiwgVar4 != null) {
                        iIntValue10++;
                    }
                } else if (aiwgVar2 != aiwgVar3) {
                    iIntValue10 = Integer.MIN_VALUE;
                } else {
                    iIntValue10++;
                }
                return java.lang.Integer.valueOf(iIntValue10);
        }
    }
}
