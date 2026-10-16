package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ndo implements defpackage.affh {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ndo(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v63, types: [affk, java.lang.Object] */
    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.bve bveVar;
        int i = 14;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                int iIntValue = ((java.lang.Integer) obj3).intValue();
                defpackage.afar afarVar = ndz.a;
                ((defpackage.atr) obj).getClass();
                if (bveVar2.I((iIntValue & 17) != 16, iIntValue & 1)) {
                    ?? r0 = this.a;
                    defpackage.cgc cgcVar = defpackage.cgf.e;
                    r0.invoke(defpackage.awj.c(cgcVar, 1.0f), bveVar2, 6);
                    defpackage.atp.c(defpackage.awj.c(cgcVar, 1.0f).a(new defpackage.ajc(-7410063877007736832L, defpackage.cky.a)), bveVar2, 6);
                } else {
                    bveVar2.s();
                }
                return defpackage.afbk.a;
            case 1:
                defpackage.cgf cgfVar = (defpackage.cgf) obj;
                defpackage.bve bveVar3 = (defpackage.bve) obj2;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                defpackage.afar afarVar2 = ndz.a;
                cgfVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true != bveVar3.C(cgfVar) ? 2 : 4;
                }
                if (bveVar3.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    android.graphics.Bitmap bitmapA = ndz.a((defpackage.bys) this.a);
                    if (bitmapA == null) {
                        bveVar3.v(-200649876);
                        bveVar3.o();
                    } else {
                        bveVar3.v(-200649875);
                        defpackage.ca.bc(new defpackage.cjr(bitmapA), cgfVar, defpackage.csq.a, bveVar3, ((iIntValue2 << 6) & 896) | 24624, 232);
                        bveVar3.o();
                    }
                } else {
                    bveVar3.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                nuo nuoVar = (nuo) obj;
                long jLongValue = ((java.lang.Long) obj2).longValue();
                nuoVar.getClass();
                ((defpackage.afbk) obj3).getClass();
                int iOrdinal = nuoVar.ordinal();
                if (iOrdinal == 0) {
                    return null;
                }
                if (iOrdinal == 1) {
                    java.lang.Object obj4 = this.a;
                    defpackage.ooa.b();
                    java.lang.String strA = defpackage.ooa.a(((neg) obj4).c, jLongValue);
                    strA.getClass();
                    return strA;
                }
                if (iOrdinal != 2) {
                    throw new defpackage.afas();
                }
                defpackage.ooa.b();
                defpackage.ojm.a();
                long epochMilli = j$.time.Instant.now().toEpochMilli() - jLongValue;
                if (epochMilli < 0) {
                    epochMilli = 0;
                }
                return android.text.format.DateUtils.formatElapsedTime(epochMilli / 1000);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.nne nneVar = (defpackage.nne) obj;
                defpackage.mqj mqjVar = (defpackage.mqj) obj2;
                boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
                if ((nneVar != null ? nneVar.b : null) == null) {
                    return null;
                }
                if (!zBooleanValue) {
                    if (!defpackage.afga.f(nneVar.b, mqjVar != null ? mqjVar.a() : null)) {
                        return nneVar;
                    }
                }
                return ((defpackage.nkj) this.a).j(nneVar.b, mqjVar != null ? mqjVar.a() : null, defpackage.nkf.c, true, true);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int iIntValue3 = ((java.lang.Integer) obj).intValue();
                java.lang.Integer num = (java.lang.Integer) obj3;
                int iIntValue4 = num.intValue();
                defpackage.yqm yqmVar = defpackage.nkp.a;
                boolean zF = defpackage.afga.f((java.lang.Boolean) obj2, java.lang.Boolean.TRUE);
                defpackage.ypu ypuVarL = defpackage.nkp.a.l();
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zF);
                boolean z = iIntValue3 != 0;
                ypuVarL.R("etcSensorEnabled=%s, resizeEnabled=%s, statusBarRows=%s", boolValueOf, java.lang.Boolean.valueOf(z), num);
                java.lang.Object obj5 = this.a;
                if (zF && z && iIntValue4 < 2) {
                    return new nko((android.content.res.Resources) obj5, 2131493217, 2131034128, 2131034120);
                }
                if (zF && z) {
                    return new nko((android.content.res.Resources) obj5, 2131493213, 2131034124, 2131034116);
                }
                if (z && iIntValue4 < 2) {
                    return new nko((android.content.res.Resources) obj5, 2131493218, 2131034129, 2131034121);
                }
                if (z) {
                    return new nko((android.content.res.Resources) obj5, 2131493214, 2131034125, 2131034117);
                }
                if (zF && iIntValue4 < 2) {
                    return new nko((android.content.res.Resources) obj5, 2131493216, 2131034127, 2131034119);
                }
                if (zF) {
                    return new nko((android.content.res.Resources) obj5, 2131493212, 2131034123, 2131034115);
                }
                return iIntValue4 < 2 ? new nko((android.content.res.Resources) obj5, 2131493215, 2131034126, 2131034118) : new nko((android.content.res.Resources) obj5, 2131493211, 2131034122, 2131034114);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bve bveVar4 = (defpackage.bve) obj2;
                int iIntValue5 = ((java.lang.Integer) obj3).intValue();
                ((defpackage.atx) obj).getClass();
                if (bveVar4.I((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    defpackage.cgc cgcVar2 = defpackage.cgf.e;
                    defpackage.ktf ktfVar = nmt.a;
                    defpackage.cgf cgfVarD = defpackage.awj.d(cgcVar2, 37.0f);
                    defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.h, false);
                    int iF = defpackage.a.f(bveVar4.b());
                    defpackage.cdd cddVarN = bveVar4.N();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar4, cgfVarD);
                    defpackage.afer aferVar = defpackage.cwl.a;
                    bveVar4.M();
                    bveVar4.w();
                    if (bveVar4.G()) {
                        bveVar4.j(aferVar);
                    } else {
                        bveVar4.y();
                    }
                    java.lang.Object obj6 = this.a;
                    defpackage.byw.c(bveVar4, ctyVarB, defpackage.cwl.e);
                    defpackage.byw.c(bveVar4, cddVarN, defpackage.cwl.d);
                    defpackage.byw.c(bveVar4, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                    defpackage.byw.b(bveVar4, defpackage.cwl.g);
                    defpackage.byw.c(bveVar4, cgfVarN, defpackage.cwl.c);
                    long j = ((defpackage.ckd) bveVar4.f(defpackage.bnq.a)).a;
                    long j2 = nms.a;
                    defpackage.brv.b((java.lang.String) obj6, null, j, nms.a, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar4, 0, 0, 262122);
                    bveVar4.n();
                } else {
                    bveVar4.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.atx atxVar = (defpackage.atx) obj;
                defpackage.bve bveVar5 = (defpackage.bve) obj2;
                int iIntValue6 = ((java.lang.Integer) obj3).intValue();
                atxVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= true != bveVar5.C(atxVar) ? 2 : 4;
                }
                if (bveVar5.I((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    defpackage.brv.b(((android.content.Context) this.a).getText(2132085405).toString(), defpackage.atx.a(defpackage.cgf.e, defpackage.cfs.k), defpackage.kfp.i(bveVar5).R(), 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVar5).e, bveVar5, 0, 0, 131064);
                } else {
                    bveVar5.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bve bveVar6 = (defpackage.bve) obj2;
                int iIntValue7 = ((java.lang.Integer) obj3).intValue();
                ((defpackage.atx) obj).getClass();
                if (bveVar6.I((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    defpackage.brv.b(((android.content.Context) this.a).getText(true != defpackage.acqh.m() ? 2132085404 : 2132085403).toString(), null, defpackage.kfp.i(bveVar6).S(), 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVar6).l, bveVar6, 0, 0, 131066);
                } else {
                    bveVar6.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bve bveVar7 = (defpackage.bve) obj2;
                int iIntValue8 = ((java.lang.Integer) obj3).intValue();
                ((defpackage.acb) obj).getClass();
                if (bveVar7.I((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    defpackage.atp.c(defpackage.afw.E(defpackage.awj.c(this.a, 1.0f), nri.a, defpackage.bcw.c(0.0f, 0.0f, defpackage.vm.g(bveVar7), defpackage.vm.g(bveVar7))), bveVar7, 0);
                } else {
                    bveVar7.s();
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.cgf cgfVar2 = (defpackage.cgf) obj;
                defpackage.bve bveVar8 = (defpackage.bve) obj2;
                int iIntValue9 = ((java.lang.Integer) obj3).intValue();
                cgfVar2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= true != bveVar8.C(cgfVar2) ? 2 : 4;
                }
                if (bveVar8.I((iIntValue9 & 19) != 18, iIntValue9 & 1)) {
                    defpackage.ca.bb(defpackage.kzi.x((androidx.car.app.model.CarIcon) this.a, bveVar8), null, cgfVar2, null, null, 0.0f, null, bveVar8, ((iIntValue9 << 6) & 896) | 56, 120);
                } else {
                    bveVar8.s();
                }
                return defpackage.afbk.a;
            case 10:
                defpackage.cgf cgfVar3 = (defpackage.cgf) obj;
                defpackage.bve bveVar9 = (defpackage.bve) obj2;
                int iIntValue10 = ((java.lang.Integer) obj3).intValue();
                cgfVar3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= true != bveVar9.C(cgfVar3) ? 2 : 4;
                }
                if (bveVar9.I((iIntValue10 & 19) != 18, iIntValue10 & 1)) {
                    com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = ((defpackage.nxh) this.a).k;
                    ghIcon.getClass();
                    defpackage.ca.bb(defpackage.lgo.f(ghIcon, 0.0f, bveVar9, 3), null, cgfVar3, null, null, 0.0f, null, bveVar9, ((iIntValue10 << 6) & 896) | 56, 120);
                } else {
                    bveVar9.s();
                }
                return defpackage.afbk.a;
            case 11:
                defpackage.bve bveVar10 = (defpackage.bve) obj2;
                int iIntValue11 = ((java.lang.Integer) obj3).intValue();
                defpackage.yqm yqmVar2 = nyc.a;
                ((defpackage.atr) obj).getClass();
                if (bveVar10.I((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    nyc.d((java.util.List) this.a, (defpackage.cgf) null, bveVar10, 0);
                } else {
                    bveVar10.s();
                }
                return defpackage.afbk.a;
            case 12:
                defpackage.att attVar = (defpackage.att) obj;
                defpackage.bve bveVar11 = (defpackage.bve) obj2;
                int iIntValue12 = ((java.lang.Integer) obj3).intValue();
                defpackage.yqm yqmVar3 = nyc.a;
                attVar.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= true != bveVar11.C(attVar) ? 2 : 4;
                }
                if (bveVar11.I((iIntValue12 & 19) != 18, iIntValue12 & 1)) {
                    java.lang.Object obj7 = this.a;
                    int iA = defpackage.dlr.a(attVar.d(), nyc.b);
                    nym nymVar = (nym) obj7;
                    defpackage.cow cowVarP = defpackage.dai.P(nymVar.a, bveVar11);
                    java.lang.Integer num2 = nymVar.b;
                    if (iA < 0 || num2 == null) {
                        bveVar11.v(116772449);
                        defpackage.afer aferVar2 = nymVar.e;
                        defpackage.cgf cgfVarR = defpackage.awj.r(defpackage.cgf.e);
                        defpackage.ktf ktfVar2 = nyc.f;
                        boolean z2 = nymVar.c;
                        defpackage.bcr bcrVar = num2 == null ? nyc.g : nyc.h;
                        defpackage.bcr bcrVar2 = num2 == null ? nyc.g : nyc.i;
                        defpackage.afar afarVar3 = defpackage.ktl.a;
                        defpackage.ktl ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar11, 255);
                        defpackage.ktl ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar11, 255);
                        defpackage.ktf ktfVar3 = defpackage.ktf.a;
                        defpackage.khg.s(cowVarP, aferVar2, cgfVarR, ktfVar2, true, z2, bcrVar, bcrVar2, ktlVarJ, null, null, ktlVarF, bveVar11, 392, 0, 3584);
                        bveVar11.o();
                    } else {
                        bveVar11.v(115702391);
                        defpackage.afer aferVar3 = nymVar.e;
                        defpackage.cgf cgfVarR2 = defpackage.awj.r(defpackage.cgf.e);
                        defpackage.ktf ktfVar4 = nyc.f;
                        boolean z3 = nymVar.c;
                        defpackage.bcr bcrVar3 = nyc.h;
                        defpackage.bcr bcrVar4 = nyc.i;
                        defpackage.afar afarVar4 = defpackage.ktl.a;
                        defpackage.ktl ktlVarJ2 = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar11, 255);
                        defpackage.avv avvVarL = defpackage.asq.L(nyc.c, 0.0f, nyc.d, 0.0f, 10);
                        defpackage.ktl ktlVarF2 = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar11, 255);
                        defpackage.ccz cczVarAs = defpackage.dai.as(-1910494771, true, new nre(cowVarP, num2, 3, (byte[]) null), bveVar11);
                        defpackage.ktf ktfVar5 = defpackage.ktf.a;
                        defpackage.khg.k(aferVar3, cgfVarR2, ktfVar4, true, z3, bcrVar3, bcrVar4, ktlVarJ2, null, null, avvVarL, null, false, ktlVarF2, cczVarAs, bveVar11, 1769520, 196614, 15104);
                        bveVar11.o();
                    }
                } else {
                    bveVar11.s();
                }
                return defpackage.afbk.a;
            case 13:
                defpackage.mcl mclVar = (defpackage.mcl) obj;
                defpackage.bve bveVar12 = (defpackage.bve) obj2;
                int iIntValue13 = ((java.lang.Integer) obj3).intValue();
                mclVar.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= true != ((iIntValue13 & 8) == 0 ? bveVar12.C(mclVar) : bveVar12.E(mclVar)) ? 2 : 4;
                }
                if (bveVar12.I((iIntValue13 & 19) != 18, iIntValue13 & 1)) {
                    mclVar.c((java.lang.String) this.a, null, null, 0L, bveVar12, (iIntValue13 << 12) & 57344, 14);
                } else {
                    bveVar12.s();
                }
                return defpackage.afbk.a;
            case 14:
                defpackage.affg affgVar = (defpackage.affg) obj;
                defpackage.bve bveVar13 = (defpackage.bve) obj2;
                int iIntValue14 = ((java.lang.Integer) obj3).intValue();
                affgVar.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= true != bveVar13.E(affgVar) ? 2 : 4;
                }
                if (bveVar13.I((iIntValue14 & 19) != 18, iIntValue14 & 1)) {
                    if (this.a.length() == 0) {
                        bveVar13.v(1573429788);
                        defpackage.brv.b(defpackage.vm.e(2132084985, bveVar13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVar13).j, defpackage.bxi.n(bveVar13).s, 0L, null, null, defpackage.dax.k(defpackage.dax.j(2131296304)), null, 0L, null, 0, 0, 0L, null, null, 16777182), bveVar13, 0, 0, 131070);
                        bveVar = bveVar13;
                        bveVar.o();
                    } else {
                        bveVar = bveVar13;
                        bveVar.v(1573770943);
                        bveVar.o();
                    }
                    affgVar.invoke(bveVar, java.lang.Integer.valueOf(14 & iIntValue14));
                } else {
                    bveVar13.s();
                }
                return defpackage.afbk.a;
            case 15:
                defpackage.att attVar2 = (defpackage.att) obj;
                defpackage.bve bveVar14 = (defpackage.bve) obj2;
                int iIntValue15 = ((java.lang.Integer) obj3).intValue();
                attVar2.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= true == bveVar14.C(attVar2) ? 4 : 2;
                }
                if (bveVar14.I((iIntValue15 & 19) != 18, iIntValue15 & 1)) {
                    float fD = (attVar2.d() * 3.0f) + 0.0f;
                    defpackage.cgf cgfVarI = defpackage.awj.i(defpackage.awj.o(defpackage.cgf.e, defpackage.cfs.a, true), fD);
                    java.lang.Object objG = bveVar14.g();
                    java.lang.Object obj8 = defpackage.bvd.a;
                    if (objG == obj8) {
                        objG = new defpackage.oat(i);
                        bveVar14.x(objG);
                    }
                    java.lang.Object obj9 = this.a;
                    defpackage.cgf cgfVarG = defpackage.cjv.g(cgfVarI, (defpackage.affc) objG);
                    boolean zE = bveVar14.E(obj9) | bveVar14.z(fD);
                    java.lang.Object objG2 = bveVar14.g();
                    if (zE || objG2 == obj8) {
                        objG2 = new mte(obj9, fD, 3);
                        bveVar14.x(objG2);
                    }
                    defpackage.affc affcVar = (defpackage.affc) objG2;
                    boolean zE2 = bveVar14.E(obj9) | bveVar14.z(fD);
                    java.lang.Object objG3 = bveVar14.g();
                    if (zE2 || objG3 == obj8) {
                        objG3 = new mte(obj9, fD, 4);
                        bveVar14.x(objG3);
                    }
                    dmr.b(affcVar, cgfVarG, (defpackage.affc) objG3, bveVar14, 0, 0);
                } else {
                    bveVar14.s();
                }
                return defpackage.afbk.a;
            case 16:
                defpackage.att attVar3 = (defpackage.att) obj;
                defpackage.bve bveVar15 = (defpackage.bve) obj2;
                int iIntValue16 = ((java.lang.Integer) obj3).intValue();
                attVar3.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= true == bveVar15.C(attVar3) ? 4 : 2;
                }
                if (bveVar15.I((iIntValue16 & 19) != 18, iIntValue16 & 1)) {
                    java.lang.Object obj10 = this.a;
                    android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = ((oqa) obj10).b;
                    float fD2 = attVar3.d();
                    float fA = ((defpackage.dlo) bveVar15.f(defpackage.dbl.d)).a();
                    float f = fD2 / 4.0f;
                    defpackage.afau afauVar = new defpackage.afau(new defpackage.dlr(((java.lang.Math.min(4, java.lang.Math.max(a$.ExternalSyntheticApiModelOutline0.m$1(appWidgetProviderInfo), java.lang.Math.max((int) java.lang.Math.ceil((appWidgetProviderInfo.minWidth / fA) / f), 1))) / 4.0f) * fD2) + 0.0f), new defpackage.dlr((fD2 * (java.lang.Math.min(4, java.lang.Math.max(a$.ExternalSyntheticApiModelOutline0.m$2(appWidgetProviderInfo), java.lang.Math.max((int) java.lang.Math.ceil((appWidgetProviderInfo.minHeight / fA) / f), 1))) / 4.0f)) + 0.0f));
                    float f2 = ((defpackage.dlr) afauVar.a).a;
                    float f3 = ((defpackage.dlr) afauVar.b).a;
                    defpackage.cgf cgfVarK = defpackage.awj.k(defpackage.cgf.e, f2, f3);
                    boolean zE3 = bveVar15.E(obj10) | bveVar15.z(f2) | bveVar15.z(f3);
                    java.lang.Object objG4 = bveVar15.g();
                    if (zE3 || objG4 == defpackage.bvd.a) {
                        objG4 = new oqq((defpackage.mvm) obj10, f2, f3, 1);
                        bveVar15.x(objG4);
                    }
                    defpackage.affc affcVar2 = (defpackage.affc) objG4;
                    boolean zE4 = bveVar15.E(obj10) | bveVar15.z(f2) | bveVar15.z(f3);
                    java.lang.Object objG5 = bveVar15.g();
                    if (zE4 || objG5 == defpackage.bvd.a) {
                        objG5 = new oqq((defpackage.mvm) obj10, f2, f3, 0);
                        bveVar15.x(objG5);
                    }
                    dmr.b(affcVar2, cgfVarK, (defpackage.affc) objG5, bveVar15, 0, 0);
                } else {
                    bveVar15.s();
                }
                return defpackage.afbk.a;
            case 17:
                defpackage.dzp dzpVar = (defpackage.dzp) obj;
                defpackage.dzp dzpVar2 = (defpackage.dzp) obj2;
                defpackage.dzp dzpVar3 = (defpackage.dzp) obj3;
                defpackage.afdo afdoVar = defpackage.tcu.a;
                dzpVar.getClass();
                dzpVar2.getClass();
                dzpVar3.getClass();
                return this.a.invoke(dzpVar.a, dzpVar.b, dzpVar2.a, dzpVar2.b, dzpVar3.a, dzpVar3.b);
            case 18:
                this.a.invoke((java.lang.Throwable) obj);
                return defpackage.afbk.a;
            default:
                boolean z4 = aiuy.a;
                ajey ajeyVar = (ajey) this.a;
                ajeyVar.a.c((java.lang.Object) null);
                ajeyVar.d();
                return defpackage.afbk.a;
        }
    }
}
