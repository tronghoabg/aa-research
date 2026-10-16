package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mjl implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mjl(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v80, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, lqa] */
    /* JADX WARN: Type inference failed for: r0v86, types: [atr, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction;
        int i = 9;
        int i2 = 8;
        int i3 = 4;
        int i4 = 6;
        int i5 = 2;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                mix mixVar = (mix) obj;
                boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
                java.lang.Object obj3 = this.a;
                if (zBooleanValue) {
                    java.lang.String string = ((mjn) obj3).e.getString(2132084928);
                    if (android.text.TextUtils.isEmpty(string)) {
                        throw new java.lang.IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    customAction = new android.support.v4.media.session.PlaybackStateCompat.CustomAction("aap.radio.action.favorite.remove", string, 2131231665, (android.os.Bundle) null);
                } else {
                    java.lang.String string2 = ((mjn) obj3).e.getString(2132084861);
                    if (android.text.TextUtils.isEmpty(string2)) {
                        throw new java.lang.IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    customAction = new android.support.v4.media.session.PlaybackStateCompat.CustomAction("aap.radio.action.favorite.add", string2, 2131231666, (android.os.Bundle) null);
                }
                defpackage.eb ebVar = new defpackage.eb();
                ebVar.c = 1077L;
                ebVar.b = -1L;
                ebVar.d(mixVar.a, -1L, 0.0f);
                ebVar.a.add(customAction);
                java.lang.Integer num = mixVar.b;
                java.lang.String str = mixVar.c;
                if (num != null && str != null) {
                    num.intValue();
                    ebVar.b(2, str);
                }
                return ebVar.a();
            case 1:
                defpackage.ygw ygwVar = (defpackage.ygw) obj;
                defpackage.yhe yheVar = (defpackage.yhe) obj2;
                defpackage.yqm yqmVar = miq.a;
                if (ygwVar == null || yheVar == null) {
                    return defpackage.ync.a;
                }
                defpackage.yha yhaVar = new defpackage.yha(4);
                defpackage.yot it = yheVar.values().iterator();
                while (it.hasNext()) {
                    min minVar = (min) it.next();
                    com.google.android.gms.car.RadioConfiguration.RadioBandGroup radioBandGroup = minVar.c;
                    if (radioBandGroup != null) {
                        java.util.Iterator it2 = radioBandGroup.a.iterator();
                        while (it2.hasNext()) {
                            yhaVar.f((java.lang.Integer) it2.next(), minVar);
                        }
                    }
                }
                defpackage.yhe yheVarD = yhaVar.d(false);
                defpackage.ygx ygxVar = new defpackage.ygx();
                int size = ygwVar.size();
                for (int i6 = 0; i6 < size; i6++) {
                    com.google.android.gms.car.RadioProgramInfo radioProgramInfo = (com.google.android.gms.car.RadioProgramInfo) ygwVar.get(i6);
                    j$.util.Optional optionalB = miw.b(radioProgramInfo.a);
                    ozq ozqVar = new ozq(yheVarD, ygxVar, radioProgramInfo, 1);
                    if (true == optionalB.isPresent()) {
                        java.lang.Object obj4 = optionalB.get();
                        java.lang.Object obj5 = ozqVar.b;
                        java.lang.Object obj6 = ozqVar.a;
                        java.lang.Object obj7 = ozqVar.c;
                        min minVar2 = (min) ((defpackage.yhe) obj5).get(obj4);
                        if (minVar2 != null) {
                            ((defpackage.ygx) obj6).b(minVar2, obj7);
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) miq.a.h()).ai(4982)).y("Band configuration for %s not found, dropping station.", ((com.google.android.gms.car.RadioProgramInfo) obj7).a);
                        }
                    }
                }
                defpackage.ygy ygyVarA = ygxVar.a();
                defpackage.yha yhaVar2 = new defpackage.yha(4);
                defpackage.yot it3 = yheVar.values().iterator();
                while (it3.hasNext()) {
                    min minVar3 = (min) it3.next();
                    if (!minVar3.c() && (ygyVarA.s(minVar3) || !minVar3.b())) {
                        defpackage.ygw ygwVarC = ygyVarA.s(minVar3) ? ygyVarA.c(minVar3) : defpackage.ymx.a;
                        com.google.android.gms.car.RadioConfiguration.RadioBandGroup radioBandGroup2 = minVar3.c;
                        if (radioBandGroup2 == null || !radioBandGroup2.d) {
                            ygwVarC = defpackage.ygw.z(miq.b, ygwVarC);
                        }
                        yhaVar2.f(minVar3, (defpackage.ygw) j$.util.Collection.-EL.stream(ygwVarC).map(new defpackage.lpk(this.a, i)).collect(defpackage.yds.a));
                    }
                }
                return yhaVar2.d(true);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    java.lang.Object obj8 = this.a;
                    defpackage.lyd.j(((defpackage.mso) obj8).a(), ((defpackage.mtc) obj8).b(), null, false, null, bveVar, 64, 28);
                } else {
                    bveVar.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (bveVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    defpackage.ksz.a(null, null, false, null, defpackage.dai.as(270777899, true, new defpackage.mjl(this.a, i3), bveVar2), bveVar2, 24576, 15);
                } else {
                    bveVar2.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.bve bveVar3 = (defpackage.bve) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (bveVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    java.lang.Object obj9 = this.a;
                    if (defpackage.leh.a.a().f()) {
                        bveVar3.v(795865503);
                        juu.x(defpackage.dai.as(-1137126680, true, new defpackage.mjl(obj9, i5), bveVar3), bveVar3, 6);
                        bveVar3.o();
                    } else {
                        bveVar3.v(795958007);
                        defpackage.lyd.j(((defpackage.mso) obj9).a(), ((defpackage.mtc) obj9).b(), null, false, null, bveVar3, 64, 28);
                        bveVar3.o();
                    }
                } else {
                    bveVar3.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bve bveVar4 = (defpackage.bve) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (bveVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    java.lang.Object obj10 = this.a;
                    defpackage.dai.aA(defpackage.kmo.a.b(obj10), defpackage.dai.as(237296339, true, new defpackage.mjl(obj10, 3), bveVar4), bveVar4, 48);
                } else {
                    bveVar4.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.bve bveVar5 = (defpackage.bve) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (bveVar5.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    defpackage.ksz.a(null, null, false, null, defpackage.dai.as(-1338489713, true, new defpackage.mjl(this.a, i2), bveVar5), bveVar5, 24576, 15);
                } else {
                    bveVar5.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bve bveVar6 = (defpackage.bve) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (bveVar6.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    java.lang.Object obj11 = this.a;
                    defpackage.dai.aA(defpackage.kmo.a.b(obj11), defpackage.dai.as(1326138167, true, new defpackage.mjl(obj11, i4), bveVar6), bveVar6, 48);
                } else {
                    bveVar6.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bve bveVar7 = (defpackage.bve) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (bveVar7.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    juu.x(defpackage.dai.as(-305552143, true, new defpackage.mjl(this.a, i), bveVar7), bveVar7, 6);
                } else {
                    bveVar7.s();
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.bve bveVar8 = (defpackage.bve) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (bveVar8.I((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    defpackage.mvm.f((mva) ((mur) this.a).a.a(), bveVar8, 8);
                } else {
                    bveVar8.s();
                }
                return defpackage.afbk.a;
            case 10:
                defpackage.bve bveVar9 = (defpackage.bve) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (bveVar9.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    java.lang.Object obj12 = this.a;
                    mvb mvbVar = (mvb) obj12;
                    defpackage.afar afarVar = mvbVar.a;
                    defpackage.muf mufVarB = mvbVar.b();
                    oqw oqwVar = (oqw) afarVar.a();
                    boolean z = !((defpackage.mso) obj12).a();
                    int i7 = oqw.c;
                    defpackage.mvm.e(mufVarB, oqwVar, z, null, bveVar9, 72);
                } else {
                    bveVar9.s();
                }
                return defpackage.afbk.a;
            case 11:
                defpackage.bve bveVar10 = (defpackage.bve) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                if (bveVar10.I((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    defpackage.ksz.a(null, null, false, null, defpackage.dai.as(147694635, true, new defpackage.mjl(this.a, 10), bveVar10), bveVar10, 24576, 15);
                } else {
                    bveVar10.s();
                }
                return defpackage.afbk.a;
            case 12:
                defpackage.bve bveVar11 = (defpackage.bve) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                if (bveVar11.I((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    java.lang.Object obj13 = this.a;
                    defpackage.dai.aA(defpackage.kmo.a.b(obj13), defpackage.dai.as(1054578899, true, new defpackage.mjl(obj13, 11), bveVar11), bveVar11, 48);
                } else {
                    bveVar11.s();
                }
                return defpackage.afbk.a;
            case 13:
                defpackage.bve bveVar12 = (defpackage.bve) obj;
                int iIntValue12 = ((java.lang.Integer) obj2).intValue();
                if (bveVar12.I((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    defpackage.ksz.a(null, null, false, null, defpackage.dai.as(-2090573839, true, new defpackage.mjl(this.a, 14), bveVar12), bveVar12, 24576, 15);
                } else {
                    bveVar12.s();
                }
                return defpackage.afbk.a;
            case 14:
                defpackage.bve bveVar13 = (defpackage.bve) obj;
                int iIntValue13 = ((java.lang.Integer) obj2).intValue();
                if (bveVar13.I((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    java.lang.Object obj14 = this.a;
                    oqw oqwVar2 = (oqw) ((mvn) obj14).a.a();
                    defpackage.oqk oqkVarA = defpackage.oqk.a.a();
                    android.os.Bundle arguments = ((android.support.v4.app.Fragment) obj14).getArguments();
                    int i8 = arguments != null ? arguments.getInt("column_number", 0) : 0;
                    defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.cgf.e.a(new defpackage.ajc(defpackage.cjv.j(0), defpackage.cky.a)), 1.0f);
                    int i9 = oqw.c;
                    mvv.e(oqwVar2, oqkVarA, i8, cgfVarC, (defpackage.affi) null, bveVar13, 3144);
                } else {
                    bveVar13.s();
                }
                return defpackage.afbk.a;
            case 15:
                defpackage.bve bveVar14 = (defpackage.bve) obj;
                int iIntValue14 = ((java.lang.Integer) obj2).intValue();
                if (bveVar14.I((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    java.lang.Object obj15 = this.a;
                    defpackage.dai.aA(defpackage.kmo.a.b(obj15), defpackage.dai.as(1276854937, true, new defpackage.mjl(obj15, 13), bveVar14), bveVar14, 48);
                } else {
                    bveVar14.s();
                }
                return defpackage.afbk.a;
            case 16:
                defpackage.bve bveVar15 = (defpackage.bve) obj;
                int iIntValue15 = ((java.lang.Integer) obj2).intValue();
                int i10 = iIntValue15 & 3;
                int i11 = iIntValue15 & 1;
                defpackage.yqm yqmVar2 = mvv.a;
                if (bveVar15.I(i10 != 2, i11)) {
                    mvv.d((oqw) this.a, bveVar15, 8);
                } else {
                    bveVar15.s();
                }
                return defpackage.afbk.a;
            case 17:
                defpackage.bve bveVar16 = (defpackage.bve) obj;
                int iIntValue16 = ((java.lang.Integer) obj2).intValue();
                if (bveVar16.I((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    defpackage.brv.b((java.lang.String) this.a, defpackage.asq.I(defpackage.cgf.e, 8.0f, 4.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVar16).l, -59604181744353280L, 0L, defpackage.dil.n, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777210), bveVar16, 48, 0, 131068);
                } else {
                    bveVar16.s();
                }
                return defpackage.afbk.a;
            case 18:
                defpackage.bve bveVar17 = (defpackage.bve) obj;
                int iIntValue17 = ((java.lang.Integer) obj2).intValue();
                int i12 = iIntValue17 & 3;
                int i13 = iIntValue17 & 1;
                defpackage.bvm bvmVar = mwn.a;
                if (bveVar17.I(i12 != 2, i13)) {
                    this.a.invoke(bveVar17, 6);
                } else {
                    bveVar17.s();
                }
                return defpackage.afbk.a;
            case 19:
                defpackage.bve bveVar18 = (defpackage.bve) obj;
                int iIntValue18 = ((java.lang.Integer) obj2).intValue();
                if (bveVar18.I((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    defpackage.brv.b(java.lang.String.valueOf(this.a.f((android.content.Context) bveVar18.f(defpackage.daj.b))), null, 0L, 0L, null, 0L, null, 0L, 0, false, 2, 0, defpackage.bxi.p(bveVar18).l, bveVar18, 0, 24576, 114686);
                } else {
                    bveVar18.s();
                }
                return defpackage.afbk.a;
            default:
                return defpackage.mkc.o(this.a, (defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
        }
    }
}
