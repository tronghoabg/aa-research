package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ltq implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ ltq(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        defpackage.mqj mqjVar = null;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                ltv ltvVar = (ltv) obj;
                ltvVar.getClass();
                return ltvVar.c();
            case 1:
                ltv ltvVar2 = (ltv) obj;
                ltvVar2.getClass();
                return ltvVar2.a();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ltv ltvVar3 = (ltv) obj;
                ltvVar3.getClass();
                return ltvVar3.d();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ltv ltvVar4 = (ltv) obj;
                ltvVar4.getClass();
                return ltvVar4.f();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ltv ltvVar5 = (ltv) obj;
                ltvVar5.getClass();
                return ltvVar5.e();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ltv ltvVar6 = (ltv) obj;
                ltvVar6.getClass();
                return ltvVar6.b();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                aaPlaybackState.getClass();
                return java.lang.Boolean.valueOf(defpackage.lhc.b(aaPlaybackState, 2L));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState2 = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                aaPlaybackState2.getClass();
                return java.lang.Integer.valueOf(aaPlaybackState2.Q());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.qts qtsVar = (defpackage.qts) obj;
                defpackage.msj msjVar = defpackage.msl.a;
                qtsVar.getClass();
                qtsVar.l = true;
                qtsVar.m = 192;
                qtsVar.e();
                return defpackage.afbk.a;
            case 9:
                defpackage.nti ntiVar = (defpackage.nti) obj;
                ntiVar.getClass();
                if (ntiVar != defpackage.nti.e) {
                    return defpackage.mps.e();
                }
                defpackage.eqp eqpVarA = defpackage.muj.h.a().a();
                defpackage.mui muiVar = defpackage.mui.a;
                defpackage.afdo afdoVar = defpackage.tcu.a;
                eqpVarA.getClass();
                return defpackage.ebo.f(eqpVarA, new defpackage.nnp(muiVar, 12));
            case 10:
                java.util.Map map = (java.util.Map) obj;
                map.getClass();
                defpackage.mqj mqjVar2 = (defpackage.mqj) map.get(com.google.android.gms.car.display.CarRegionId.a);
                if (mqjVar2 != null && mqjVar2.b != defpackage.mqg.NAVIGATION) {
                    mqjVar = mqjVar2;
                }
                return java.lang.Boolean.valueOf(mqjVar == null);
            case 11:
                defpackage.muj mujVar = (defpackage.muj) obj;
                int i = defpackage.muq.d;
                mujVar.getClass();
                return mujVar.a();
            case 12:
                defpackage.muq muqVar = (defpackage.muq) obj;
                int i2 = defpackage.muq.d;
                muqVar.getClass();
                return defpackage.leh.a.a().f() ? muqVar.b : muqVar.c;
            case 13:
                java.util.Map map2 = (java.util.Map) obj;
                defpackage.nke nkeVar = defpackage.nkj.a;
                map2.getClass();
                defpackage.mqj mqjVar3 = (defpackage.mqj) map2.get(defpackage.nte.c().b().r(defpackage.nta.s));
                if (mqjVar3 != null) {
                    return mqjVar3.b;
                }
                return null;
            case 14:
                defpackage.mqj mqjVar4 = (defpackage.mqj) obj;
                defpackage.nke nkeVar2 = defpackage.nkj.a;
                return java.lang.Boolean.valueOf((mqjVar4 == null || mqjVar4.b == defpackage.mqg.NAVIGATION) ? false : true);
            case 15:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                defpackage.nke nkeVar3 = defpackage.nkj.a;
                return java.lang.Boolean.valueOf(componentName != null ? defpackage.ler.a().i(defpackage.mpr.b(componentName)) : false);
            case 16:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                defpackage.nkj.b.l().y("Main content covering maps: %s", bool);
                return obj;
            case 17:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (!((kjr) obj2).b().contains(2)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 18:
                java.util.List list2 = (java.util.List) obj;
                list2.getClass();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.lang.Object obj3 : list2) {
                    int iA = ((kjr) obj3).a();
                    defpackage.nkk nkkVar = iA != 2 ? iA != 3 ? defpackage.nkk.c : defpackage.nkk.b : defpackage.nkk.a;
                    java.lang.Object arrayList2 = linkedHashMap.get(nkkVar);
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                        linkedHashMap.put(nkkVar, arrayList2);
                    }
                    ((java.util.List) arrayList2).add(obj3);
                }
                return linkedHashMap;
            case 19:
                defpackage.afau afauVar = (defpackage.afau) obj;
                afauVar.getClass();
                return (java.util.List) afauVar.a;
            default:
                defpackage.afau afauVar2 = (defpackage.afau) obj;
                afauVar2.getClass();
                return (java.util.List) afauVar2.b;
        }
    }
}
