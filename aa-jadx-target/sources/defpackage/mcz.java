package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mcz implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ mcz(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = 12;
        int i2 = 15;
        int i3 = 0;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj;
                defpackage.mdb mdbVar = defpackage.mdc.a;
                resolveInfo.getClass();
                return defpackage.tna.av(resolveInfo);
            case 1:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                defpackage.mdb mdbVar2 = defpackage.mdc.a;
                return java.lang.Boolean.valueOf(componentName != null);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.content.ComponentName componentName2 = (android.content.ComponentName) obj;
                defpackage.mdb mdbVar3 = defpackage.mdc.a;
                componentName2.getClass();
                return new defpackage.mqj(componentName2, defpackage.mqg.OEM, false, 28);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                obj.getClass();
                if (obj instanceof mez) {
                    return new mfa();
                }
                if (obj instanceof mfi) {
                    return new mfk();
                }
                if (obj instanceof mer) {
                    return (acwa.c() || defpackage.kzi.k()) ? new mes() : new meu();
                }
                if (obj instanceof mfc) {
                    return new lkz(7);
                }
                defpackage.afie afieVarB = defpackage.afgw.b(obj.getClass());
                java.util.Objects.toString(afieVarB);
                throw new java.lang.IllegalStateException("Unknown model type ".concat(java.lang.String.valueOf(afieVarB)));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yhe yheVar = (defpackage.yhe) obj;
                defpackage.yqm yqmVar = miq.a;
                java.util.HashMap map = new java.util.HashMap();
                j$.util.Collection.-EL.stream(yheVar.entrySet()).filter(new defpackage.lyk(8)).map(new defpackage.lvg(i2)).flatMap(new defpackage.lvg(16)).forEach(new kcx(map, 9));
                min minVar = min.b;
                if (yheVar.containsKey(minVar)) {
                    j$.lang.Iterable.-EL.forEach((defpackage.ygw) yheVar.get(minVar), new kcx(map, 10));
                }
                return defpackage.yhe.j(map);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar2 = miq.a;
                return (defpackage.yhe) j$.util.Collection.-EL.stream(((defpackage.yhe) obj).entrySet()).collect(defpackage.yds.a(new defpackage.lvg(i), new defpackage.lvg(13)));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ygw ygwVar = (defpackage.ygw) obj;
                defpackage.yqm yqmVar3 = miq.a;
                defpackage.yha yhaVar = new defpackage.yha(4);
                min minVar2 = min.b;
                yhaVar.f(minVar2.a(), minVar2);
                while (i3 < ygwVar.size()) {
                    com.google.android.gms.car.RadioConfiguration.RadioBandGroup radioBandGroup = (com.google.android.gms.car.RadioConfiguration.RadioBandGroup) ygwVar.get(i3);
                    i3++;
                    min minVar3 = new min(radioBandGroup, i3);
                    yhaVar.f(minVar3.a(), minVar3);
                }
                return yhaVar.d(true);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(((mit) obj).b);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream((defpackage.ygw) obj).filter(new defpackage.lyk(i));
                int i4 = defpackage.ygw.d;
                return (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
            case 9:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    defpackage.mqj mqjVar = ((mre) obj2).a.c;
                    mqjVar.getClass();
                    if (mqo.a(mqjVar)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 10:
                java.util.List list2 = (java.util.List) obj;
                list2.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : list2) {
                    defpackage.mqj mqjVar2 = ((mre) obj3).a.c;
                    mqjVar2.getClass();
                    if (!mqo.a(mqjVar2)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 11:
                mqu mquVar = (mqu) obj;
                int i5 = mqo.f;
                if (mquVar != null) {
                    return new mre(mquVar, false);
                }
                throw new java.lang.IllegalStateException("Required value was null.");
            case 12:
                j$.util.stream.Stream streamFilter2 = j$.util.Collection.-EL.stream((java.util.List) obj).filter(new mrx(0));
                int i6 = defpackage.ygw.d;
                return (defpackage.ygw) streamFilter2.collect(defpackage.yds.a);
            case 13:
                ((java.lang.Float) obj).floatValue();
                return defpackage.afbk.a;
            case 14:
                defpackage.cla claVar = (defpackage.cla) obj;
                claVar.getClass();
                claVar.z(1.0f);
                claVar.A(1.0f);
                return defpackage.afbk.a;
            case 15:
                defpackage.chw chwVar = (defpackage.chw) obj;
                chwVar.getClass();
                chwVar.a();
                return defpackage.afbk.a;
            case 16:
                defpackage.cim cimVar = (defpackage.cim) obj;
                cimVar.getClass();
                cimVar.f(new defpackage.mcz(i2));
                return defpackage.afbk.a;
            case 17:
                return java.lang.Integer.valueOf(-((java.lang.Integer) obj).intValue());
            case 18:
                return java.lang.Integer.valueOf(-((java.lang.Integer) obj).intValue());
            case 19:
                return java.lang.Integer.valueOf(-((java.lang.Integer) obj).intValue());
            default:
                return java.lang.Integer.valueOf(-((java.lang.Integer) obj).intValue());
        }
    }
}
