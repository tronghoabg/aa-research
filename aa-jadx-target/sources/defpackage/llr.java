package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class llr implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ llr(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x03bc  */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, vt] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z;
        int i = 3;
        char c = 1;
        int i2 = 12;
        int i3 = 13;
        int i4 = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                componentName.getClass();
                boolean zF = defpackage.afga.f(componentName, defpackage.mkt.G);
                java.lang.Object obj2 = this.a;
                return zF ? new lty((defpackage.eqp) obj2) : new llq((defpackage.eqp) obj2);
            case 1:
                if (defpackage.afga.f((java.lang.Boolean) obj, java.lang.Boolean.TRUE)) {
                    java.lang.Object obj3 = this.a;
                    ((defpackage.ype) lll.a.e().ai(3997)).u("Switching to browse to hide Nothing Playing playback view");
                    defpackage.oim oimVarU = defpackage.omf.u();
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.gO);
                    lll lllVar = (lll) obj3;
                    rrvVarH.p(lllVar.c.a);
                    oimVarU.F(rrvVarH.l());
                    lllVar.e.invoke();
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                lok lokVar = (lok) obj;
                lokVar.getClass();
                return defpackage.tcu.d(lokVar.g, lokVar.e, new kva(this.a, 12));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                lon lonVar = (lop) obj;
                lonVar.getClass();
                int iA = lonVar.a() - 1;
                java.lang.Object obj4 = this.a;
                if (iA != 1) {
                    if (iA != 2 && iA != 3) {
                        return null;
                    }
                    ((lli) obj4).j();
                    return defpackage.afce.a;
                }
                if (!(lonVar instanceof lon)) {
                    throw new java.lang.IllegalStateException("LOADED subscription must be Loaded type");
                }
                lli lliVar = (lli) obj4;
                if (lliVar.j) {
                    lliVar.i(lonVar.a, defpackage.zbd.iU);
                }
                return lliVar.g(lonVar.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                com.android.car.libraries.apphost.external.model.MenuTemplate menuTemplate = (wi) obj;
                menuTemplate.getClass();
                if (!(menuTemplate instanceof com.android.car.libraries.apphost.external.model.MenuTemplate)) {
                    throw new java.lang.IllegalStateException("Template returned by ItemsTemplateConverter must be menu template");
                }
                vs vsVar = new vs((vt) this.a);
                vsVar.a(androidx.car.app.model.Action.BACK);
                com.android.car.libraries.apphost.external.model.MenuTemplate menuTemplate2 = menuTemplate;
                if (!menuTemplate2.getSections().isEmpty()) {
                    ul ulVar = new ul();
                    java.util.List sections = menuTemplate2.getSections();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = sections.iterator();
                    while (it.hasNext()) {
                        defpackage.afga.bk(arrayList, ((com.android.car.libraries.apphost.external.model.MenuSection) it.next()).getItems());
                    }
                    java.util.Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ulVar.b((uk) it2.next());
                    }
                    androidx.car.app.model.ItemList itemListA = ulVar.a();
                    wr.c.a(itemListA);
                    vsVar.e = itemListA;
                }
                return new androidx.car.app.model.SearchTemplate(vsVar);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.lpg) this.a).b((android.content.ComponentName) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                lok lokVar2 = (los) obj;
                boolean z2 = lokVar2 instanceof lok;
                defpackage.lol lolVar = defpackage.lom.a;
                lok lokVar3 = z2 ? lokVar2 : null;
                if (lokVar3 != null) {
                    return defpackage.tcu.d(lokVar3.e, lokVar3.f, new kva(this.a, 13));
                }
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return new defpackage.eqs(null);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.Map map = (java.util.Map) obj;
                defpackage.lou louVar = defpackage.lov.a;
                map.getClass();
                return (android.graphics.drawable.Icon) map.get(this.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                lnp lnpVar = (lnp) obj;
                j$.util.Optional optional = lnpVar.b;
                defpackage.yqm yqmVar = defpackage.lpg.a;
                boolean zIsPresent = optional.isPresent();
                java.lang.Object obj5 = this.a;
                if (!zIsPresent) {
                    return new lpd(lnpVar.a, (defpackage.lke) obj5);
                }
                defpackage.lor lorVar = lnpVar.a;
                defpackage.lma lmaVar = (defpackage.lma) optional.get();
                return lmaVar.n().getBoolean("android.media.browse.SEARCH_SUPPORTED", false) ? new lob(lorVar, (defpackage.lke) obj5, lmaVar) : new lny(lorVar, (defpackage.lke) obj5, lmaVar);
            case 9:
                lnp lnpVar2 = (lnp) obj;
                j$.util.Optional optional2 = lnpVar2.c;
                defpackage.yqm yqmVar2 = defpackage.lpg.a;
                boolean zIsPresent2 = optional2.isPresent();
                java.lang.Object obj6 = this.a;
                if (zIsPresent2) {
                    return new lok(lnpVar2.a, (defpackage.lke) obj6, (lmi) optional2.get());
                }
                return new lpe(lnpVar2.a, (defpackage.lke) obj6);
            case 10:
                defpackage.yqm yqmVar3 = defpackage.lpx.a;
                j$.util.stream.Stream streamDistinct = j$.util.Collection.-EL.stream((java.util.List) obj).map(new defpackage.lpk(this.a, c == true ? 1 : 0)).filter(new defpackage.kqi(11)).distinct();
                int i5 = defpackage.ygw.d;
                return (defpackage.ygw) streamDistinct.collect(defpackage.yds.a);
            case 11:
                return defpackage.tcu.w(defpackage.ebo.e(((defpackage.lpx) this.a).b), new defpackage.llr((defpackage.qsh) obj, i2));
            case 12:
                defpackage.yqm yqmVar4 = defpackage.lpx.a;
                android.content.ComponentName componentName2 = ((lph) obj).a;
                if (defpackage.loo.c((defpackage.qsh) this.a, componentName2.getPackageName()).contains(componentName2)) {
                    return componentName2;
                }
                return null;
            case 13:
                defpackage.yqm yqmVar5 = defpackage.lqf.a;
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj7 = this.a;
                if (zBooleanValue) {
                    ((defpackage.yqj) defpackage.lqf.a.l().ai((char) 4181)).u("Use Assistant media suggestions");
                    defpackage.eqp eqpVarC = defpackage.tcu.C(defpackage.kja.a(), new defpackage.llr(obj7, 18));
                    int i6 = defpackage.ygw.d;
                    return defpackage.ebo.g(defpackage.tcu.F(defpackage.ebo.e(defpackage.tcu.c(eqpVarC, defpackage.ymx.a)), new kcx(obj7, 6)), new defpackage.llr(obj7, 17));
                }
                if (obj7 != null) {
                    ((defpackage.yqj) defpackage.lqf.a.l().ai((char) 4180)).u("Use Gearhead media browse suggestions");
                    return defpackage.lqf.a((android.content.ComponentName) obj7);
                }
                ((defpackage.yqj) ((defpackage.yqj) defpackage.lqf.a.h()).ai((char) 4179)).y("Did not attempt to use either Assistant or App browser suggestions for %s", null);
                int i7 = defpackage.ygw.d;
                defpackage.ygw ygwVar = defpackage.ymx.a;
                defpackage.afdo afdoVar2 = defpackage.tcu.a;
                return new defpackage.eqs(ygwVar);
            case 14:
                tbf tbfVar = (tbf) obj;
                defpackage.yqm yqmVar6 = defpackage.lqf.a;
                if (tbfVar == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.lqf.a.h()).ai(4185)).y("Assistant media suggestion request failed for %s", this.a);
                    int i8 = defpackage.ygw.d;
                    return defpackage.ymx.a;
                }
                j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(tbfVar.b).map(new lkg(13)).filter(new defpackage.kqi(i3));
                int i9 = defpackage.ygw.d;
                return (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
            case 15:
                defpackage.yqm yqmVar7 = defpackage.lqf.a;
                java.lang.Object obj8 = this.a;
                android.content.ComponentName componentNameA = defpackage.ljw.d().a((android.content.ComponentName) obj8, (defpackage.qsh) obj);
                if (componentNameA != null) {
                    obj8 = componentNameA;
                }
                return defpackage.tcu.C(defpackage.tcu.v(defpackage.lpg.j().b((android.content.ComponentName) obj8), new defpackage.lnc(i2)), new defpackage.lnc(i3));
            case 16:
                defpackage.yqm yqmVar8 = defpackage.lqf.a;
                j$.util.stream.Stream map2 = j$.util.Collection.-EL.stream((defpackage.ygw) obj).map(new defpackage.lpk(this.a, i));
                int i10 = defpackage.ygw.d;
                return (defpackage.ygw) map2.collect(defpackage.yds.a);
            case 17:
                defpackage.ygw ygwVar2 = (defpackage.ygw) obj;
                ((defpackage.yqj) defpackage.lqf.a.l().ai(4182)).D("Returning %s Assistant media suggestions, componentName: %s", ygwVar2.size(), this.a);
                defpackage.afdo afdoVar3 = defpackage.tcu.a;
                return new defpackage.eqs(ygwVar2);
            case 18:
                defpackage.yqm yqmVar9 = defpackage.lqf.a;
                return defpackage.tcu.v(defpackage.ebo.n().b(), new defpackage.llr(this.a, 14));
            case 19:
                java.util.HashSet hashSet = new java.util.HashSet();
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((defpackage.ygw) obj);
                java.lang.Object obj9 = this.a;
                j$.util.stream.Stream streamPeek = stream.filter(new defpackage.lqd(obj9, hashSet, i4)).peek(new kqh(obj9, hashSet, 3));
                int i11 = defpackage.ygw.d;
                return (defpackage.ygw) streamPeek.collect(defpackage.yds.a);
            default:
                lph lphVar = (lph) obj;
                defpackage.yqm yqmVar10 = defpackage.lqz.a;
                if (lphVar != null) {
                    z = lphVar.a.equals(this.a) ? false : true;
                }
                return java.lang.Boolean.valueOf(z);
        }
    }
}
