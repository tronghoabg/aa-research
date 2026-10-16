package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mjm implements defpackage.affg {
    private final /* synthetic */ int a;

    public /* synthetic */ mjm(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:268:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:99:0x021f  */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean zHasNext;
        boolean z;
        int i = 4;
        boolean z2 = true;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                android.support.v4.media.session.PlaybackStateCompat playbackStateCompat = (android.support.v4.media.session.PlaybackStateCompat) obj;
                android.support.v4.media.session.PlaybackStateCompat playbackStateCompat2 = (android.support.v4.media.session.PlaybackStateCompat) obj2;
                int i2 = mjn.f;
                if (playbackStateCompat != playbackStateCompat2) {
                    if (playbackStateCompat == null || playbackStateCompat2 == null) {
                        z2 = false;
                    } else if (playbackStateCompat.a == playbackStateCompat2.a && playbackStateCompat.e == playbackStateCompat2.e && playbackStateCompat.b == playbackStateCompat2.b && playbackStateCompat.d == playbackStateCompat2.d && playbackStateCompat.f == playbackStateCompat2.f && android.text.TextUtils.equals(playbackStateCompat.g, playbackStateCompat2.g)) {
                        java.util.List list = playbackStateCompat.i;
                        java.util.List list2 = playbackStateCompat2.i;
                        if (!j$.util.Objects.equals(list, list2)) {
                            if (list == null || list2 == null || list.size() != list2.size()) {
                                z2 = false;
                            } else {
                                for (int i3 = 0; i3 < list.size(); i3++) {
                                    android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction = (android.support.v4.media.session.PlaybackStateCompat.CustomAction) list.get(i3);
                                    android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction2 = (android.support.v4.media.session.PlaybackStateCompat.CustomAction) list2.get(i3);
                                    if (customAction != customAction2) {
                                        if (customAction != null && customAction2 != null) {
                                            if (!j$.util.Objects.equals(customAction.a, customAction2.a) || !android.text.TextUtils.equals(customAction.b, customAction2.b) || customAction.c != customAction2.c) {
                                            }
                                        }
                                        z2 = false;
                                    }
                                }
                            }
                        }
                    } else {
                        z2 = false;
                    }
                }
                return java.lang.Boolean.valueOf(z2);
            case 1:
                defpackage.yhe yheVar = (defpackage.yhe) obj;
                defpackage.ygw ygwVar = (defpackage.ygw) obj2;
                defpackage.yqm yqmVar = miq.a;
                defpackage.yha yhaVar = new defpackage.yha(4);
                if (yheVar != null) {
                    yhaVar.h(yheVar);
                }
                if (ygwVar != null) {
                    yhaVar.f(min.b, ygwVar);
                }
                return yhaVar.d(true);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                mit mitVar = (mit) obj;
                mit mitVar2 = (mit) obj2;
                int i4 = mjn.f;
                if (mitVar == null || mitVar2 == null) {
                    return java.lang.Boolean.TRUE;
                }
                com.google.android.gms.car.RadioProgramInfo radioProgramInfo = mitVar2.a;
                com.google.android.gms.car.RadioProgramInfo radioProgramInfo2 = mitVar.a;
                com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = radioProgramInfo2.a.a;
                com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier2 = radioProgramInfo.a.a;
                if (!j$.util.Objects.equals(radioProgramIdentifier, radioProgramIdentifier2)) {
                    return java.lang.Boolean.FALSE;
                }
                com.google.android.gms.car.RadioMetadata radioMetadataA = radioProgramInfo2.b;
                com.google.android.gms.car.RadioMetadata radioMetadataA2 = radioProgramInfo.b;
                if (radioMetadataA == null) {
                    radioMetadataA = new rcc().a();
                }
                if (radioMetadataA2 == null) {
                    radioMetadataA2 = new rcc().a();
                }
                boolean z3 = android.text.TextUtils.isEmpty(radioMetadataA.a) && android.text.TextUtils.isEmpty(radioMetadataA.h);
                if (android.text.TextUtils.isEmpty(radioMetadataA2.a) && android.text.TextUtils.isEmpty(radioMetadataA2.h)) {
                    z2 = false;
                }
                if (defpackage.mkc.h(radioProgramIdentifier2.a) && z3 && z2) {
                    return java.lang.Boolean.FALSE;
                }
                if (radioMetadataA.l != radioMetadataA2.l) {
                    return java.lang.Boolean.FALSE;
                }
                if (radioMetadataA.k != radioMetadataA2.k) {
                    return java.lang.Boolean.FALSE;
                }
                return radioMetadataA.j != radioMetadataA2.j ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                mit mitVar3 = (mit) obj;
                android.support.v4.media.session.PlaybackStateCompat playbackStateCompat3 = (android.support.v4.media.session.PlaybackStateCompat) obj2;
                defpackage.yqm yqmVar2 = mjt.a;
                return java.lang.Boolean.valueOf((playbackStateCompat3 == null || mitVar3 != null || playbackStateCompat3.a == 0) ? false : true);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream((defpackage.ygw) obj).map(new defpackage.mjc((defpackage.yhx) obj2, i));
                int i5 = defpackage.ygw.d;
                return (defpackage.ygw) map.collect(defpackage.yds.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                mre mreVar = (mre) obj;
                mre mreVar2 = (mre) obj2;
                int i6 = mqo.f;
                mreVar.getClass();
                mreVar2.getClass();
                mrd mrdVar = mreVar.a;
                mrd mrdVar2 = mreVar2.a;
                java.lang.String strI = mrdVar.i();
                java.lang.String strI2 = mrdVar2.i();
                strI2.getClass();
                return java.lang.Integer.valueOf(strI.compareTo(strI2));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.dlo dloVar = (defpackage.dlo) obj;
                dloVar.getClass();
                int iDN = dloVar.dN(defpackage.lyd.g(400.0f));
                int iDN2 = dloVar.dN(defpackage.lyd.g(584.0f));
                int iA = defpackage.dlm.a(((defpackage.dlm) obj2).a);
                if (iDN > iA || iA >= iDN2) {
                    return null;
                }
                return new defpackage.dlr(defpackage.lyd.g(190.0f));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.List list3 = (java.util.List) obj;
                java.util.List list4 = (java.util.List) obj2;
                list4.getClass();
                return java.lang.Boolean.valueOf((list3 == null || defpackage.afga.f(defpackage.afga.aB(list3), defpackage.afga.aB(list4)) || !defpackage.afga.bh(list4, defpackage.afga.aB(list3))) ? false : true);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
                if (zBooleanValue) {
                    return msu.a;
                }
                return zBooleanValue2 ? defpackage.msq.a : defpackage.msr.a;
            case 9:
                java.util.List list5 = (java.util.List) obj;
                boolean zBooleanValue3 = ((java.lang.Boolean) obj2).booleanValue();
                list5.getClass();
                if (list5.isEmpty()) {
                    return zBooleanValue3 ? defpackage.msq.a : defpackage.msr.a;
                }
                java.util.Iterator it = list5.iterator();
                if (!it.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object next = it.next();
                if (it.hasNext()) {
                    java.lang.Comparable comparable = ((nuv) next).c.a;
                    do {
                        java.lang.Object next2 = it.next();
                        java.lang.Comparable comparable2 = ((nuv) next2).c.a;
                        int iCompareTo = comparable.compareTo(comparable2);
                        if (iCompareTo < 0) {
                            next = next2;
                        }
                        zHasNext = it.hasNext();
                        if (iCompareTo < 0) {
                            comparable = comparable2;
                        }
                    } while (zHasNext);
                }
                return new mst(((nuv) next).d);
            case 10:
                return java.lang.Boolean.valueOf(!((java.lang.Boolean) obj2).booleanValue());
            case 11:
                defpackage.ygw ygwVar2 = (defpackage.ygw) obj;
                java.util.Set set = (java.util.Set) obj2;
                ygwVar2.getClass();
                set.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : ygwVar2) {
                    nuv nuvVar = (nuv) obj3;
                    nvh nvhVar = nuvVar.c;
                    defpackage.nve nveVar = nvhVar.x;
                    int iOrdinal = nveVar.ordinal();
                    if (iOrdinal == 5 || iOrdinal == 6 || (iOrdinal == 7 ? !(nvhVar.u == null || !nuvVar.f) : iOrdinal == 9)) {
                        z = true;
                    } else {
                        nuvVar.getClass();
                        if (defpackage.acqe.s() && nveVar == defpackage.nve.i && nvhVar.b()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (!set.contains(nuvVar.d) && z) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 12:
                defpackage.mui muiVar = (defpackage.mui) obj;
                java.util.Map map2 = (java.util.Map) obj2;
                int i7 = defpackage.mun.e;
                muiVar.getClass();
                map2.getClass();
                defpackage.mqj mqjVar = (defpackage.mqj) map2.get(com.google.android.gms.car.display.CarRegionId.a);
                defpackage.mqg mqgVar = mqjVar != null ? mqjVar.b : null;
                if (muiVar != defpackage.mui.b || (mqgVar != null && mqgVar != defpackage.mqg.NAVIGATION)) {
                    z2 = false;
                }
                return java.lang.Boolean.valueOf(z2);
            case 13:
                defpackage.mui muiVar2 = (defpackage.mui) obj;
                boolean zBooleanValue4 = ((java.lang.Boolean) obj2).booleanValue();
                muiVar2.getClass();
                if (muiVar2 != defpackage.mui.a) {
                    return muz.a;
                }
                return zBooleanValue4 ? muz.c : muz.b;
            case 14:
                java.util.Map map3 = (java.util.Map) obj;
                defpackage.nti ntiVar = (defpackage.nti) obj2;
                map3.getClass();
                ntiVar.getClass();
                if (ntiVar != defpackage.nti.f) {
                    defpackage.mmi.c();
                    if ((defpackage.mmi.h() || !mva.a().F()) && map3.containsKey(mva.a().r(defpackage.nta.x))) {
                        z2 = false;
                    }
                }
                return java.lang.Boolean.valueOf(z2);
            case 15:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 16:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    defpackage.cgf cgfVarH = defpackage.asq.H(defpackage.awj.c(defpackage.cgf.e, 1.0f), defpackage.gjr.P0.k);
                    defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
                    int iF = defpackage.a.f(bveVar.b());
                    defpackage.cdd cddVarN = bveVar.N();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar, cgfVarH);
                    defpackage.afer aferVar = defpackage.cwl.a;
                    bveVar.M();
                    bveVar.w();
                    if (bveVar.G()) {
                        bveVar.j(aferVar);
                    } else {
                        bveVar.y();
                    }
                    defpackage.byw.c(bveVar, ctyVarB, defpackage.cwl.e);
                    defpackage.byw.c(bveVar, cddVarN, defpackage.cwl.d);
                    defpackage.byw.c(bveVar, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                    defpackage.byw.b(bveVar, defpackage.cwl.g);
                    defpackage.byw.c(bveVar, cgfVarN, defpackage.cwl.c);
                    defpackage.brv.b(defpackage.vm.e(2132084597, bveVar), null, 0L, 0L, null, 0L, new defpackage.dlb(3), 0L, 2, false, 2, 0, defpackage.bxi.p(bveVar).i, bveVar, 0, 24960, 109566);
                    bveVar.n();
                } else {
                    bveVar.s();
                }
                return defpackage.afbk.a;
            case 17:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 18:
                defpackage.afau afauVar = (defpackage.afau) obj;
                return afauVar == null ? new defpackage.afau(null, (defpackage.acbb) obj2) : afauVar;
            case 19:
                java.util.List list6 = (java.util.List) obj;
                java.lang.Integer num = (java.lang.Integer) obj2;
                list6.getClass();
                num.getClass();
                int iIntValue2 = num.intValue();
                if (list6.size() > iIntValue2) {
                    return list6.subList(0, iIntValue2);
                }
                defpackage.afct afctVar = new defpackage.afct(10);
                afctVar.addAll(list6);
                int size = iIntValue2 - list6.size();
                for (int i8 = 0; i8 < size; i8++) {
                    afctVar.add(null);
                }
                return afctVar.f();
            default:
                java.util.List list7 = (java.util.List) obj;
                boolean zBooleanValue5 = ((java.lang.Boolean) obj2).booleanValue();
                list7.getClass();
                return java.lang.Boolean.valueOf((list7.isEmpty() || zBooleanValue5) ? false : true);
        }
    }
}
