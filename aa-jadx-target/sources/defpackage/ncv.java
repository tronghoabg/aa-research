package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ncv implements defpackage.affg {
    private final /* synthetic */ int a;

    public /* synthetic */ ncv(int i) {
        this.a = i;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean zQ;
        boolean z = false;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                java.lang.Iterable iterable = (java.util.List) obj2;
                defpackage.ncw ncwVar = defpackage.ncx.a;
                if (iterable == null) {
                    iterable = defpackage.afce.a;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : iterable) {
                    if (defpackage.afga.f(((mok) obj3).b, componentName)) {
                        arrayList.add(obj3);
                    }
                }
                return new defpackage.afau(componentName, arrayList);
            case 1:
                defpackage.lzp lzpVar = (defpackage.lzp) obj;
                defpackage.ygw ygwVar = (defpackage.ygw) obj2;
                defpackage.ncw ncwVar2 = defpackage.ncx.a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                ygwVar.getClass();
                java.util.ArrayList<com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj4 : ygwVar) {
                    com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion navigationSuggestion = (com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion) obj4;
                    if (navigationSuggestion.b == null) {
                        java.util.Objects.toString(navigationSuggestion);
                        arrayList2.add(java.lang.String.valueOf(navigationSuggestion).concat("'s name is null"));
                    } else if (navigationSuggestion.a == null) {
                        java.util.Objects.toString(navigationSuggestion);
                        arrayList2.add(java.lang.String.valueOf(navigationSuggestion).concat("'s navigationIntent is null"));
                    } else {
                        arrayList3.add(obj4);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ncx.c.f()).l(1, java.util.concurrent.TimeUnit.MINUTES)).D("Ignored %d suggestions: %s", arrayList2.size(), arrayList2);
                }
                java.lang.String packageName = lzpVar.a.getPackageName();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.afga.aj(arrayList3, 10));
                for (com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion navigationSuggestion2 : arrayList3) {
                    navigationSuggestion2.getClass();
                    arrayList4.add(new ncs(navigationSuggestion2));
                }
                return new ncu(packageName, arrayList4);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.nod nodVar = (defpackage.nod) obj;
                defpackage.nod nodVar2 = (defpackage.nod) obj2;
                defpackage.afja[] afjaVarArr = njv.a;
                nodVar.getClass();
                if (nodVar2 != null && !defpackage.afga.f(defpackage.nod.a, nodVar) && (zQ = defpackage.lxy.q(nodVar.r, nodVar2)) != nodVar.e) {
                    njv.b.l().y("appActionShouldAnimate: %s", java.lang.Boolean.valueOf(zQ));
                    nodVar.e = zQ;
                }
                return nodVar;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.util.List list = (java.util.List) obj;
                android.content.ComponentName componentName2 = (android.content.ComponentName) obj2;
                defpackage.nke nkeVar = defpackage.nkj.a;
                list.getClass();
                android.content.ComponentName componentName3 = (android.content.ComponentName) defpackage.afga.aB(list);
                if (componentName3 != null) {
                    return componentName3;
                }
                if (componentName2 != null) {
                    return componentName2;
                }
                android.content.ComponentName componentName4 = defpackage.mkt.b;
                componentName4.getClass();
                return componentName4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.List list2 = (java.util.List) obj;
                android.content.ComponentName componentName5 = (android.content.ComponentName) obj2;
                defpackage.nke nkeVar2 = defpackage.nkj.a;
                list2.getClass();
                android.content.ComponentName componentName6 = (android.content.ComponentName) defpackage.afga.aB(list2);
                return componentName6 == null ? componentName5 : componentName6;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.mqj mqjVar = (defpackage.mqj) obj;
                defpackage.nne nneVar = (defpackage.nne) obj2;
                defpackage.nke nkeVar3 = defpackage.nkj.a;
                return java.lang.Boolean.valueOf(mqjVar != null ? defpackage.afga.f(nneVar != null ? nneVar.b : null, mqjVar.a()) : false);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.nne nneVar2 = (defpackage.nne) obj;
                defpackage.nne nneVar3 = (defpackage.nne) obj2;
                defpackage.nke nkeVar4 = defpackage.nkj.a;
                nneVar2.getClass();
                return nneVar3 == null ? nneVar2 : nneVar3;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                ((java.lang.Integer) obj2).intValue();
                nlh nlhVar = nlh.a;
                bveVar.v(-309348113);
                java.lang.String strE = defpackage.vm.e(2132083809, bveVar);
                bveVar.o();
                return strE;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                ((java.lang.Integer) obj2).intValue();
                nlh nlhVar2 = nlh.a;
                bveVar2.v(1665635991);
                java.lang.String strE2 = defpackage.vm.e(2132083808, bveVar2);
                bveVar2.o();
                return strE2;
            case 9:
                defpackage.bve bveVar3 = (defpackage.bve) obj;
                ((java.lang.Integer) obj2).intValue();
                nlh nlhVar3 = nlh.a;
                bveVar3.v(-1021312946);
                java.lang.String strE3 = defpackage.vm.e(2132083814, bveVar3);
                bveVar3.o();
                return strE3;
            case 10:
                defpackage.bve bveVar4 = (defpackage.bve) obj;
                ((java.lang.Integer) obj2).intValue();
                nlh nlhVar4 = nlh.a;
                bveVar4.v(-1491000646);
                java.lang.String strE4 = defpackage.vm.e(2132083810, bveVar4);
                bveVar4.o();
                return strE4;
            case 11:
                defpackage.bve bveVar5 = (defpackage.bve) obj;
                ((java.lang.Integer) obj2).intValue();
                nlh nlhVar5 = nlh.a;
                bveVar5.v(174442843);
                java.lang.String strE5 = defpackage.vm.e(2132083813, bveVar5);
                bveVar5.o();
                return strE5;
            case 12:
                defpackage.bve bveVar6 = (defpackage.bve) obj;
                ((java.lang.Integer) obj2).intValue();
                nlh nlhVar6 = nlh.a;
                bveVar6.v(-598199876);
                java.lang.String strE6 = defpackage.vm.e(2132083813, bveVar6);
                bveVar6.o();
                return strE6;
            case 13:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 14:
                defpackage.nti ntiVar = (defpackage.nti) obj;
                java.lang.Boolean bool = (java.lang.Boolean) obj2;
                defpackage.nqs nqsVar = defpackage.nqw.a;
                ntiVar.getClass();
                if (ntiVar == defpackage.nti.f || (bool.booleanValue() && ntiVar == defpackage.nti.g)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 15:
                ((defpackage.crd) obj).getClass();
                return defpackage.afbk.a;
            case 16:
                ((java.lang.Integer) obj).intValue();
                nuv nuvVar = (nuv) obj2;
                defpackage.yqm yqmVar = nyc.a;
                nuvVar.getClass();
                return nuvVar.d;
            case 17:
                defpackage.bve bveVar7 = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar7.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    java.lang.String str = android.os.Build.MANUFACTURER;
                    str.getClass();
                    boolean zU = afzh.u(str, "samsung", true);
                    defpackage.bvm bvmVar = defpackage.esn.a;
                    defpackage.esa esaVarA = defpackage.esn.a(bveVar7);
                    if (esaVarA == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    defpackage.obg obgVar = (defpackage.obg) defpackage.ebl.l(defpackage.afgw.b(defpackage.obg.class), esaVarA, null, null, defpackage.edd.f(esaVarA));
                    java.lang.Object objG = bveVar7.g();
                    if (objG == defpackage.bvd.a) {
                        objG = java.lang.Boolean.valueOf(defpackage.lee.a.a().b());
                        bveVar7.x(objG);
                    }
                    boolean zBooleanValue = ((java.lang.Boolean) objG).booleanValue();
                    defpackage.yhx yhxVar = defpackage.obg.a;
                    defpackage.nzs.d(zU, obgVar, zBooleanValue, bveVar7, 448);
                } else {
                    bveVar7.s();
                }
                return defpackage.afbk.a;
            case 18:
                return ooz.a((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 19:
                defpackage.bve bveVar8 = (defpackage.bve) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (bveVar8.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    defpackage.brv.b(defpackage.vm.e(2132084959, bveVar8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.dgd.w(defpackage.bxi.p(bveVar8).f, 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744447), bveVar8, 0, 0, 131070);
                } else {
                    bveVar8.s();
                }
                return defpackage.afbk.a;
            default:
                defpackage.bve bveVar9 = (defpackage.bve) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (bveVar9.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    defpackage.brv.b(defpackage.vm.e(2132084957, bveVar9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, defpackage.bxi.p(bveVar9).k, bveVar9, 0, 0, 131070);
                } else {
                    bveVar9.s();
                }
                return defpackage.afbk.a;
        }
    }
}
