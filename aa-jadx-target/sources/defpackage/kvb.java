package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kvb implements defpackage.affh {
    private final /* synthetic */ int a;

    public /* synthetic */ kvb(int i) {
        this.a = i;
    }

    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = 3;
        int i2 = 14;
        int i3 = 4;
        int i4 = 2;
        boolean z = true;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.bve bveVar = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                kvc kvcVar = kvc.a;
                ((android.content.Context) obj).getClass();
                bveVar.v(1830246084);
                defpackage.eqp eqpVarA = defpackage.lhe.b().a(defpackage.mqg.MEDIA);
                eqpVarA.getClass();
                java.lang.Object objG = bveVar.g();
                java.lang.Object obj4 = defpackage.bvd.a;
                if (objG == obj4) {
                    objG = new defpackage.kmu(i);
                    bveVar.x(objG);
                }
                defpackage.eqp eqpVarG = defpackage.ebo.g(eqpVarA, (defpackage.affc) objG);
                java.lang.Object objG2 = bveVar.g();
                if (objG2 == obj4) {
                    objG2 = new defpackage.kmu(i3);
                    bveVar.x(objG2);
                }
                defpackage.bys bysVarL = defpackage.bxi.l(defpackage.tcu.v(eqpVarG, (defpackage.affc) objG2), bveVar);
                java.lang.Object objG3 = bveVar.g();
                if (objG3 == obj4) {
                    defpackage.kuz kuzVar = new defpackage.kuz(bysVarL, i2);
                    defpackage.lam lamVar = defpackage.byp.a;
                    defpackage.bvr bvrVar = new defpackage.bvr(kuzVar, null);
                    bveVar.x(bvrVar);
                    objG3 = bvrVar;
                }
                defpackage.bys bysVar = (defpackage.bys) objG3;
                bveVar.o();
                return bysVar;
            case 1:
                android.content.Context context = (android.content.Context) obj;
                defpackage.bve bveVar2 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                kvc kvcVar2 = kvc.a;
                context.getClass();
                bveVar2.v(1251328287);
                java.lang.Object objG4 = bveVar2.g();
                if (objG4 == defpackage.bvd.a) {
                    android.graphics.drawable.Drawable drawable = context.getDrawable(2131231002);
                    drawable.getClass();
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(com.google.android.apps.auto.components.graphics.icon.GhIcon.l(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap()), defpackage.bxv.c);
                    bveVar2.x(parcelableSnapshotMutableState);
                    objG4 = parcelableSnapshotMutableState;
                }
                defpackage.bwx bwxVar = (defpackage.bwx) objG4;
                bveVar2.o();
                return bwxVar;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.bve bveVar3 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                kvc kvcVar3 = kvc.a;
                ((android.content.Context) obj).getClass();
                bveVar3.v(-1048309810);
                java.lang.Object objG5 = bveVar3.g();
                if (objG5 == defpackage.bvd.a) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(new com.google.android.apps.auto.components.graphics.icon.GhIcon(8), defpackage.bxv.c);
                    bveVar3.x(parcelableSnapshotMutableState2);
                    objG5 = parcelableSnapshotMutableState2;
                }
                defpackage.bwx bwxVar2 = (defpackage.bwx) objG5;
                bveVar3.o();
                return bwxVar2;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.tna.aM((defpackage.atr) obj, (defpackage.bve) obj2, ((java.lang.Integer) obj3).intValue());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.tna.aM((defpackage.atr) obj, (defpackage.bve) obj2, ((java.lang.Integer) obj3).intValue());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bve bveVar4 = (defpackage.bve) obj2;
                ((java.lang.Integer) obj3).intValue();
                ((defpackage.bil) obj).getClass();
                bveVar4.v(-772443394);
                defpackage.cgc cgcVar = defpackage.cgf.e;
                bveVar4.o();
                return cgcVar;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.lzp lzpVar = (defpackage.lzp) obj;
                java.lang.Integer num = (java.lang.Integer) obj2;
                com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition = (com.google.android.gms.car.navigation.NavigationCurrentPosition) obj3;
                defpackage.yqm yqmVar = laf.a;
                defpackage.abor aborVarN = otf.a.n();
                if (lzpVar != null) {
                    osz oszVarA = laf.a(lzpVar.a);
                    aborVarN.t();
                    otf otfVar = aborVarN.b;
                    oszVarA.getClass();
                    otfVar.f = oszVarA;
                    otfVar.b |= 2;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue == 1) {
                        i = 2;
                    } else if (iIntValue != 2) {
                        i = iIntValue != 5 ? 1 : 4;
                    }
                    aborVarN.t();
                    otf otfVar2 = aborVarN.b;
                    otfVar2.c = i - 1;
                    otfVar2.b |= 1;
                }
                if (navigationCurrentPosition != null) {
                    defpackage.ygw ygwVarA = navigationCurrentPosition.a();
                    int size = ygwVarA.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        com.google.android.gms.car.navigation.DestinationDistance destinationDistance = (com.google.android.gms.car.navigation.DestinationDistance) ygwVarA.get(i5);
                        defpackage.abor aborVarN2 = ote.a.n();
                        long j = destinationDistance.c;
                        aborVarN2.t();
                        ote oteVar = aborVarN2.b;
                        oteVar.b |= 1;
                        oteVar.c = j;
                        java.lang.String str = destinationDistance.b;
                        if (str != null) {
                            aborVarN2.t();
                            ote oteVar2 = aborVarN2.b;
                            oteVar2.b |= 2;
                            oteVar2.d = str;
                        }
                        aborVarN.t();
                        otf otfVar3 = aborVarN.b;
                        ote oteVarQ = aborVarN2.q();
                        oteVarQ.getClass();
                        defpackage.abpj abpjVar = otfVar3.e;
                        if (!abpjVar.c()) {
                            otfVar3.e = defpackage.abox.I(abpjVar);
                        }
                        otfVar3.e.add(oteVarQ);
                    }
                }
                return aborVarN.q();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new lqy(((java.lang.Boolean) obj).booleanValue(), (lqx) obj2, (lqw) obj3);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.lqr((com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj, ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Integer) obj3).intValue());
            case 9:
                return new lqw(((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue());
            case 10:
                return new defpackage.lrg((android.content.ComponentName) obj, ((los) obj2) != null ? (defpackage.lmk) obj3 : null);
            case 11:
                return new lrt((lok) obj, (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj2, (defpackage.lmk) obj3);
            case 12:
                defpackage.yhx yhxVar = (defpackage.yhx) obj;
                java.util.List list = (java.util.List) obj2;
                java.util.List list2 = (java.util.List) obj3;
                defpackage.yqm yqmVar2 = mqt.a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (yhxVar != null) {
                    arrayList.addAll(yhxVar);
                }
                if (list != null) {
                    arrayList.addAll(list);
                }
                if (list2 != null) {
                    arrayList.addAll(list2);
                }
                return arrayList;
            case 13:
                defpackage.msx msxVar = (defpackage.msx) obj;
                defpackage.bve bveVar5 = (defpackage.bve) obj2;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                msxVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true != ((iIntValue2 & 8) == 0 ? bveVar5.C(msxVar) : bveVar5.E(msxVar)) ? 2 : 4;
                }
                if (bveVar5.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    defpackage.lyd.i(msxVar, bveVar5, (iIntValue2 & 14) | 8);
                } else {
                    bveVar5.s();
                }
                return defpackage.afbk.a;
            case 14:
                return msz.a((defpackage.msx) obj, (defpackage.bve) obj2, ((java.lang.Integer) obj3).intValue());
            case 15:
                return msz.a((defpackage.msx) obj, (defpackage.bve) obj2, ((java.lang.Integer) obj3).intValue());
            case 16:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.util.List list3 = (java.util.List) obj2;
                java.lang.Boolean bool = (java.lang.Boolean) obj3;
                list3.getClass();
                defpackage.afct afctVar = new defpackage.afct(10);
                if (zBooleanValue) {
                    afctVar.add(mss.a);
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(list3, 10));
                java.util.Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new mst(((nuv) it.next()).d));
                }
                afctVar.addAll(arrayList2);
                defpackage.leq.a.a();
                if (!defpackage.acyc.aD() && !bool.booleanValue()) {
                    afctVar.add(msv.a);
                }
                return afctVar.f();
            case 17:
                defpackage.bve bveVar6 = (defpackage.bve) obj2;
                int iIntValue3 = ((java.lang.Integer) obj3).intValue();
                ((defpackage.acb) obj).getClass();
                if (bveVar6.I((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    defpackage.boh.a(defpackage.day.h(2131231890, bveVar6, 0), null, defpackage.awj.i(defpackage.asq.J(defpackage.cgf.e, 0.0f, 0.0f, defpackage.gjr.P3.k, 0.0f), 32.0f), 0L, bveVar6, 56, 8);
                } else {
                    bveVar6.s();
                }
                return defpackage.afbk.a;
            case 18:
                defpackage.bve bveVar7 = (defpackage.bve) obj2;
                int iIntValue4 = ((java.lang.Integer) obj3).intValue();
                ((defpackage.acb) obj).getClass();
                if (bveVar7.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    defpackage.boh.a(defpackage.day.h(2131233087, bveVar7, 0), null, defpackage.awj.i(defpackage.asq.J(defpackage.cgf.e, defpackage.gjr.P5.k, 0.0f, 0.0f, 0.0f), 24.0f), 0L, bveVar7, 56, 8);
                } else {
                    bveVar7.s();
                }
                return defpackage.afbk.a;
            case 19:
                int iIntValue5 = ((java.lang.Integer) obj).intValue();
                defpackage.bve bveVar8 = (defpackage.bve) obj2;
                int iIntValue6 = ((java.lang.Integer) obj3).intValue();
                defpackage.yqm yqmVar3 = defpackage.mzk.a;
                bveVar8.v(-464823504);
                if ((((iIntValue6 & 14) ^ 6) <= 4 || !bveVar8.A(iIntValue5)) && (iIntValue6 & 6) != 4) {
                    z = false;
                }
                java.lang.Object objG6 = bveVar8.g();
                if (z || objG6 == defpackage.bvd.a) {
                    objG6 = new defpackage.kmr(iIntValue5, i4);
                    bveVar8.x(objG6);
                }
                defpackage.bby bbyVarB = defpackage.bca.b(0, (defpackage.afer) objG6, bveVar8, 3);
                bveVar8.o();
                return bbyVarB;
            default:
                java.lang.Object objEvaluate = nbp.b.evaluate(((java.lang.Float) obj).floatValue(), (java.lang.Integer) obj2, (java.lang.Integer) obj3);
                objEvaluate.getClass();
                java.lang.Integer num2 = (java.lang.Integer) objEvaluate;
                num2.intValue();
                return num2;
        }
    }
}
