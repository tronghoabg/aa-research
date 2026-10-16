package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class gwo implements defpackage.affi {
    private final /* synthetic */ int a;

    @Override // defpackage.affi
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z = false;
        final int i9 = 1;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                grs grsVar = (grs) obj;
                defpackage.cgf cgfVar = (defpackage.cgf) obj2;
                defpackage.bve bveVar = (defpackage.bve) obj3;
                int iIntValue = ((java.lang.Integer) obj4).intValue();
                grsVar.getClass();
                cgfVar.getClass();
                if ((iIntValue & 6) == 0) {
                    i = (true != ((iIntValue & 8) == 0 ? bveVar.C(grsVar) : bveVar.E(grsVar)) ? 2 : 4) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= true == bveVar.C(cgfVar) ? 32 : 16;
                }
                if (bveVar.I((i & 147) != 146, i & 1)) {
                    grx.d(grsVar, cgfVar, bveVar, i & 126);
                } else {
                    bveVar.s();
                }
                return defpackage.afbk.a;
            case 1:
                defpackage.dai.N((defpackage.cou) obj, (java.util.Map) obj2, (defpackage.bve) obj3, ((java.lang.Integer) obj4).intValue() & 126);
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                gpv gpvVar = (gpv) obj;
                defpackage.cgf cgfVar2 = (defpackage.cgf) obj2;
                defpackage.bve bveVar2 = (defpackage.bve) obj3;
                int iIntValue2 = ((java.lang.Integer) obj4).intValue();
                gpvVar.getClass();
                cgfVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = (true != ((iIntValue2 & 8) == 0 ? bveVar2.C(gpvVar) : bveVar2.E(gpvVar)) ? 2 : 4) | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= true == bveVar2.C(cgfVar2) ? 32 : 16;
                }
                if (bveVar2.I((i2 & 147) != 146, i2 & 1)) {
                    gkh.h(gpvVar, cgfVar2, bveVar2, (i2 & 14) | 8 | (i2 & 112));
                } else {
                    bveVar2.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                gqm gqmVar = (gqm) obj;
                defpackage.cgf cgfVar3 = (defpackage.cgf) obj2;
                defpackage.bve bveVar3 = (defpackage.bve) obj3;
                int iIntValue3 = ((java.lang.Integer) obj4).intValue();
                gqmVar.getClass();
                cgfVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i3 = (true != ((iIntValue3 & 8) == 0 ? bveVar3.C(gqmVar) : bveVar3.E(gqmVar)) ? 2 : 4) | iIntValue3;
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= true == bveVar3.C(cgfVar3) ? 32 : 16;
                }
                if (bveVar3.I((i3 & 147) != 146, i3 & 1)) {
                    gpw.c(gqmVar, cgfVar3, bveVar3, i3 & 126);
                } else {
                    bveVar3.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                guh guhVar = (guh) obj;
                defpackage.bve bveVar4 = (defpackage.bve) obj3;
                int iIntValue4 = ((java.lang.Integer) obj4).intValue();
                guhVar.getClass();
                ((defpackage.cgf) obj2).getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= true != ((iIntValue4 & 8) == 0 ? bveVar4.C(guhVar) : bveVar4.E(guhVar)) ? 2 : 4;
                }
                if (bveVar4.I((iIntValue4 & 131) != 130, iIntValue4 & 1)) {
                    guj.m(guhVar, (defpackage.cgf) null, bveVar4, (iIntValue4 & 14) | guh.a);
                } else {
                    bveVar4.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                hcv hcvVar = (hcv) obj;
                defpackage.cgf cgfVar4 = (defpackage.cgf) obj2;
                defpackage.bve bveVar5 = (defpackage.bve) obj3;
                int iIntValue5 = ((java.lang.Integer) obj4).intValue();
                hcvVar.getClass();
                cgfVar4.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i4 = (true != ((iIntValue5 & 8) == 0 ? bveVar5.C(hcvVar) : bveVar5.E(hcvVar)) ? 2 : 4) | iIntValue5;
                } else {
                    i4 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i4 |= true == bveVar5.C(cgfVar4) ? 32 : 16;
                }
                if (bveVar5.I((i4 & 147) != 146, i4 & 1)) {
                    hcg.b(hcvVar, cgfVar4, (defpackage.axx) null, (defpackage.avv) null, bveVar5, (i4 & 14) | 8 | (i4 & 112), 12);
                } else {
                    bveVar5.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                fzh fzhVar = (fzh) obj;
                defpackage.cgf cgfVar5 = (defpackage.cgf) obj2;
                defpackage.bve bveVar6 = (defpackage.bve) obj3;
                int iIntValue6 = ((java.lang.Integer) obj4).intValue();
                fzhVar.getClass();
                cgfVar5.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i5 = (true != ((iIntValue6 & 8) == 0 ? bveVar6.C(fzhVar) : bveVar6.E(fzhVar)) ? 2 : 4) | iIntValue6;
                } else {
                    i5 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i5 |= true == bveVar6.C(cgfVar5) ? 32 : 16;
                }
                if (bveVar6.I((i5 & 147) != 146, i5 & 1)) {
                    fww.c(fzhVar, cgfVar5, 0.0f, bveVar6, i5 & 126);
                } else {
                    bveVar6.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                hdb hdbVar = (hdb) obj;
                defpackage.cgf cgfVar6 = (defpackage.cgf) obj2;
                defpackage.bve bveVar7 = (defpackage.bve) obj3;
                int iIntValue7 = ((java.lang.Integer) obj4).intValue();
                hdbVar.getClass();
                cgfVar6.getClass();
                if ((iIntValue7 & 6) == 0) {
                    i6 = iIntValue7 | (true != ((iIntValue7 & 8) == 0 ? bveVar7.C(hdbVar) : bveVar7.E(hdbVar)) ? 2 : 4);
                } else {
                    i6 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i6 |= true == bveVar7.C(cgfVar6) ? 32 : 16;
                }
                if (bveVar7.I((i6 & 147) != 146, i6 & 1)) {
                    throw null;
                }
                bveVar7.s();
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                tjt tjtVar = (tjt) obj;
                defpackage.bve bveVar8 = (defpackage.bve) obj3;
                int iIntValue8 = ((java.lang.Integer) obj4).intValue();
                tjtVar.getClass();
                obj2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i7 = (true != ((iIntValue8 & 8) == 0 ? bveVar8.C(tjtVar) : bveVar8.E(tjtVar)) ? 2 : 4) | iIntValue8;
                } else {
                    i7 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i7 |= true == ((iIntValue8 & 64) == 0 ? bveVar8.C(obj2) : bveVar8.E(obj2)) ? 32 : 16;
                }
                if (bveVar8.I((i7 & 147) != 146, i7 & 1)) {
                    sub.j(tjtVar, obj2 instanceof java.lang.Object[] ? defpackage.afga.cs((java.lang.Object[]) obj2, ", ", null, null, null, 62) : obj2.toString(), (tkd) null, false, (defpackage.affh) null, bveVar8, i7 & 14, 62);
                } else {
                    bveVar8.s();
                }
                return defpackage.afbk.a;
            case 9:
                oqu oquVar = (oqu) obj;
                defpackage.cgf cgfVar7 = (defpackage.cgf) obj2;
                defpackage.bve bveVar9 = (defpackage.bve) obj3;
                int iIntValue9 = ((java.lang.Integer) obj4).intValue();
                oquVar.getClass();
                cgfVar7.getClass();
                if ((iIntValue9 & 6) == 0) {
                    i8 = iIntValue9 | (true == ((iIntValue9 & 8) == 0 ? bveVar9.C(oquVar) : bveVar9.E(oquVar)) ? 4 : 2);
                } else {
                    i8 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i8 |= true == bveVar9.C(cgfVar7) ? 32 : 16;
                }
                if (bveVar9.I((i8 & 147) != 146, i8 & 1)) {
                    opz.a(oquVar, defpackage.oqk.a.a(), cgfVar7, (defpackage.cfu) null, bveVar9, (i8 & 14) | 72 | ((i8 << 3) & 896), 8);
                } else {
                    bveVar9.s();
                }
                return defpackage.afbk.a;
            default:
                ((java.lang.Integer) obj).intValue();
                defpackage.bve bveVar10 = (defpackage.bve) obj3;
                ((java.lang.Integer) obj4).intValue();
                obj2.getClass();
                final long jH = defpackage.ckd.h(defpackage.kfp.i(bveVar10).R(), 0.15f);
                defpackage.ccz cczVarAs = defpackage.dai.as(821495276, true, new defpackage.myi(jH, i9), bveVar10);
                defpackage.ccz cczVarAs2 = defpackage.dai.as(-99587966, true, new defpackage.affg() { // from class: mxl
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                        if (i9 != 0) {
                            defpackage.bve bveVar11 = (defpackage.bve) obj5;
                            int iIntValue10 = ((java.lang.Integer) obj6).intValue();
                            if (bveVar11.I((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                                defpackage.cnd cndVar = new defpackage.cnd(jH);
                                defpackage.cgc cgcVar = defpackage.cgf.e;
                                float f = defpackage.nay.a;
                                defpackage.ca.bb(cndVar, null, defpackage.cjv.h(defpackage.awj.r(defpackage.awj.d(cgcVar, 20.0f)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.nay.c, true, 0, 1042431), null, null, 0.0f, null, bveVar11, 440, 120);
                            } else {
                                bveVar11.s();
                            }
                            return defpackage.afbk.a;
                        }
                        defpackage.bve bveVar12 = (defpackage.bve) obj5;
                        int iIntValue11 = ((java.lang.Integer) obj6).intValue();
                        int i10 = iIntValue11 & 3;
                        if (bveVar12.I(i10 != 2, iIntValue11 & 1)) {
                            defpackage.cnd cndVar2 = new defpackage.cnd(jH);
                            defpackage.cgc cgcVar2 = defpackage.cgf.e;
                            float f2 = defpackage.nay.a;
                            defpackage.ca.bb(cndVar2, null, defpackage.cjv.h(defpackage.asq.J(defpackage.awj.r(defpackage.awj.d(cgcVar2, 20.0f)), 0.0f, 0.0f, defpackage.nay.a, 0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.nay.c, true, 0, 1042431), null, null, 0.0f, null, bveVar12, 440, 120);
                        } else {
                            bveVar12.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVar10);
                final int i10 = z ? 1 : 0;
                defpackage.mkc.n(cczVarAs, cczVarAs2, null, defpackage.dai.as(-1552974656, true, new defpackage.affg() { // from class: mxl
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                        if (i10 != 0) {
                            defpackage.bve bveVar11 = (defpackage.bve) obj5;
                            int iIntValue10 = ((java.lang.Integer) obj6).intValue();
                            if (bveVar11.I((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                                defpackage.cnd cndVar = new defpackage.cnd(jH);
                                defpackage.cgc cgcVar = defpackage.cgf.e;
                                float f = defpackage.nay.a;
                                defpackage.ca.bb(cndVar, null, defpackage.cjv.h(defpackage.awj.r(defpackage.awj.d(cgcVar, 20.0f)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.nay.c, true, 0, 1042431), null, null, 0.0f, null, bveVar11, 440, 120);
                            } else {
                                bveVar11.s();
                            }
                            return defpackage.afbk.a;
                        }
                        defpackage.bve bveVar12 = (defpackage.bve) obj5;
                        int iIntValue11 = ((java.lang.Integer) obj6).intValue();
                        int i11 = iIntValue11 & 3;
                        if (bveVar12.I(i11 != 2, iIntValue11 & 1)) {
                            defpackage.cnd cndVar2 = new defpackage.cnd(jH);
                            defpackage.cgc cgcVar2 = defpackage.cgf.e;
                            float f2 = defpackage.nay.a;
                            defpackage.ca.bb(cndVar2, null, defpackage.cjv.h(defpackage.asq.J(defpackage.awj.r(defpackage.awj.d(cgcVar2, 20.0f)), 0.0f, 0.0f, defpackage.nay.a, 0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.nay.c, true, 0, 1042431), null, null, 0.0f, null, bveVar12, 440, 120);
                        } else {
                            bveVar12.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVar10), null, bveVar10, 3126, 20);
                return defpackage.afbk.a;
        }
    }
}
