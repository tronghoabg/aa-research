package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ooy implements defpackage.affg {
    private final /* synthetic */ int a;

    public /* synthetic */ ooy(int i) {
        this.a = i;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.ComponentName componentName;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    defpackage.brv.b(defpackage.vm.e(2132085472, bveVar), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVar).f, 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744447), bveVar, 0, 0, 131070);
                } else {
                    bveVar.s();
                }
                return defpackage.afbk.a;
            case 1:
                return ooz.a((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (bveVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    defpackage.brv.b(defpackage.vm.f(2132085470, new java.lang.Object[]{java.lang.Integer.valueOf(defpackage.leh.a.a().a())}, bveVar2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVar2).k, bveVar2, 0, 0, 131070);
                } else {
                    bveVar2.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.mvm.ae((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.bve bveVar3 = (defpackage.bve) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (bveVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    defpackage.boh.a(defpackage.day.h(2131231715, bveVar3, 0), null, null, 0L, bveVar3, 56, 12);
                } else {
                    bveVar3.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bve bveVar4 = (defpackage.bve) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (bveVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    defpackage.brv.b(defpackage.vm.e(2132084955, bveVar4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar4, 0, 0, 262142);
                } else {
                    bveVar4.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.mvm.ae((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.lang.Integer) obj).intValue();
                oqu oquVar = (oqu) obj2;
                oquVar.getClass();
                return java.lang.Integer.valueOf(oquVar.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ygw ygwVar = (defpackage.ygw) obj;
                java.util.Set set = (java.util.Set) obj2;
                int i = oqw.c;
                ygwVar.getClass();
                set.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : ygwVar) {
                    oqu oquVar2 = (oqu) obj3;
                    android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = oquVar2.b;
                    if (appWidgetProviderInfo == null || (componentName = appWidgetProviderInfo.provider) == null) {
                        componentName = oquVar2.e;
                    }
                    if (!defpackage.afga.bh(set, componentName)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 9:
                java.lang.Integer num = (java.lang.Integer) obj;
                java.util.Map map = (java.util.Map) obj2;
                defpackage.yqm yqmVar = defpackage.oyp.a;
                boolean zContainsKey = map.containsKey(defpackage.oyp.g(defpackage.nta.w));
                if (defpackage.nte.c().b().m() != defpackage.nti.f) {
                    zContainsKey |= map.containsKey(defpackage.oyp.g(defpackage.nta.x));
                }
                return java.lang.Boolean.valueOf(num.intValue() == 2 || (zContainsKey || map.containsKey(defpackage.oyp.g(defpackage.nta.c)) || (defpackage.acnf.s() && map.containsKey(defpackage.oyp.g(defpackage.nta.b)))));
            case 10:
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return new defpackage.afau(obj, obj2);
            case 11:
                java.util.Set set2 = (java.util.Set) obj;
                java.lang.Iterable iterable = (java.lang.Iterable) obj2;
                defpackage.afdo afdoVar2 = defpackage.tcu.a;
                set2.getClass();
                iterable.getClass();
                return defpackage.afga.M(set2, iterable);
            case 12:
                defpackage.afdo afdoVar3 = defpackage.tcu.a;
                return java.lang.Boolean.TRUE;
            case 13:
                defpackage.afdo afdoVar4 = defpackage.tcu.a;
                return java.lang.Boolean.TRUE;
            case 14:
                tjo tjoVar = (tjo) obj;
                tjoVar.getClass();
                tjoVar.b = (defpackage.affc) obj2;
                return defpackage.afbk.a;
            case 15:
                java.lang.String str = (java.lang.String) obj;
                defpackage.afdm afdmVar = (defpackage.afdm) obj2;
                str.getClass();
                afdmVar.getClass();
                if (str.length() == 0) {
                    return afdmVar.toString();
                }
                return str + ", " + afdmVar;
            case 16:
                defpackage.afdo afdoVar5 = (defpackage.afdo) obj;
                aiuq aiuqVar = (defpackage.afdm) obj2;
                return aiuqVar instanceof aiuq ? afdoVar5.plus(aiuqVar.a()) : afdoVar5.plus(aiuqVar);
            default:
                return java.lang.Boolean.valueOf(defpackage.afga.f(obj, obj2));
        }
    }
}
