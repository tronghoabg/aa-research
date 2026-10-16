package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lra implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lra(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, pu] */
    /* JADX WARN: Type inference failed for: r11v50, types: [java.lang.Object, lun] */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.lang.Object, lun] */
    /* JADX WARN: Type inference failed for: r11v58, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v60, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v66, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object next;
        java.lang.String str;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return ((lny) obj).b((java.lang.String) this.a);
            case 1:
                return ((defpackage.lpg) this.a).b((android.content.ComponentName) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                j$.time.Duration duration = defpackage.lrz.a;
                return new lry(((lok) this.a).c.a, (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.lpg) this.a).b((android.content.ComponentName) obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.lpg) this.a).f((android.content.ComponentName) obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                lok lokVar = (lok) obj;
                return defpackage.tcu.v((defpackage.eqp) this.a.a(lokVar), new defpackage.lra(lokVar, 6));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new lsp(((lok) this.a).c.a, j$.util.Optional.ofNullable(obj));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.afau(this.a, obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.util.List list = (java.util.List) obj;
                j$.time.Duration duration2 = defpackage.ltu.a;
                list.getClass();
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.lang.Object obj2 = this.a;
                        next = it.next();
                        android.content.ComponentName componentName = ((lph) next).a;
                        if (defpackage.afga.f(componentName.getPackageName(), obj2)) {
                            java.lang.String className = componentName.getClassName();
                            className.getClass();
                            if (className.length() == 0) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                lph lphVar = (lph) next;
                if (lphVar != null) {
                    return defpackage.lpg.j().e(lphVar);
                }
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return new defpackage.eqs(null);
            case 9:
                j$.time.Duration duration3 = defpackage.ltu.a;
                defpackage.eqp eqpVarF = defpackage.lpg.j().f((android.content.ComponentName) this.a);
                eqpVarF.getClass();
                return eqpVarF;
            case 10:
                return new defpackage.afau((android.graphics.Bitmap) obj, this.a);
            case 11:
                krg krgVar = (krg) obj;
                defpackage.ypg ypgVar = lyc.a;
                krgVar.getClass();
                java.lang.Long l = krgVar.c;
                defpackage.oej oejVarR = defpackage.mkc.R();
                l.getClass();
                java.lang.String str2 = krgVar.d;
                long jLongValue = l.longValue();
                defpackage.zbe zbeVar = defpackage.zbe.MESSAGING_APP;
                str2.getClass();
                oejVarR.o((android.content.Context) this.a, jLongValue, zbeVar, str2);
                return defpackage.afbk.a;
            case 12:
                java.util.List<ajer> list2 = (java.util.List) obj;
                if (list2 == null) {
                    return new com.android.car.libraries.apphost.internal.model.GoogleListTemplate(true, (androidx.car.app.model.ItemList) null, (java.util.List) null, (java.util.List) null, (androidx.car.app.model.Header) null, 30, (defpackage.affu) null);
                }
                qs qsVar = ((rb) this.a).a;
                qsVar.getClass();
                ul ulVar = new ul();
                for (ajer ajerVar : list2) {
                    vk vkVar = new vk();
                    vkVar.i((java.lang.CharSequence) ajerVar.d);
                    vkVar.d((java.lang.CharSequence) ajerVar.a);
                    vkVar.e(new androidx.car.app.model.CarIcon(new defpackage.to((androidx.core.graphics.drawable.IconCompat) ajerVar.e)), 2);
                    vkVar.g(new khi(ajerVar.b, 14));
                    java.lang.Object obj3 = ajerVar.c;
                    if (obj3 != null) {
                        tb tbVar = new tb();
                        tbVar.d(new khi(obj3, 15));
                        tbVar.c(new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.m(qsVar, 2131233095))));
                        vkVar.b(tbVar.a());
                    }
                    ulVar.b(vkVar.a());
                }
                return new com.android.car.libraries.apphost.internal.model.GoogleListTemplate(false, ulVar.a(), (java.util.List) null, (java.util.List) null, (androidx.car.app.model.Header) null, 29, (defpackage.affu) null);
            case 13:
                java.util.List list3 = (java.util.List) obj;
                if (list3 == null) {
                    vw vwVar = new vw();
                    vwVar.c();
                    return vwVar.a();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list3, 10));
                java.util.Iterator it2 = list3.iterator();
                while (true) {
                    java.lang.Object obj4 = this.a;
                    if (!it2.hasNext()) {
                        vw vwVar2 = new vw();
                        vl vlVar = new vl();
                        ((vu) vlVar).d = arrayList;
                        vwVar2.a.add(vlVar.a());
                        uf ufVar = new uf();
                        ufVar.c(androidx.car.app.model.Action.BACK);
                        ufVar.e(((rb) obj4).a.getString(2132084433));
                        vwVar2.c = ufVar.a();
                        vwVar2.d();
                        vwVar2.b();
                        return vwVar2.a();
                    }
                    ajer ajerVar2 = (ajer) it2.next();
                    vk vkVar2 = new vk();
                    vkVar2.i((java.lang.CharSequence) ajerVar2.d);
                    vkVar2.d((java.lang.CharSequence) ajerVar2.a);
                    vkVar2.e(new androidx.car.app.model.CarIcon(new defpackage.to((androidx.core.graphics.drawable.IconCompat) ajerVar2.e)), 2);
                    vkVar2.g(new khi(ajerVar2.b, 12));
                    java.lang.Object obj5 = ajerVar2.c;
                    if (obj5 != null) {
                        tb tbVar2 = new tb();
                        tbVar2.d(new khi(obj5, 13));
                        tbVar2.c(new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.m(((rb) obj4).a, 2131233095))));
                        vkVar2.b(tbVar2.a());
                    }
                    arrayList.add(vkVar2.a());
                }
                break;
            case 14:
                defpackage.ygw ygwVar = (defpackage.ygw) obj;
                ygwVar.getClass();
                defpackage.you youVarListIterator = ygwVar.listIterator(0);
                youVarListIterator.getClass();
                while (true) {
                    java.lang.Object obj6 = this.a;
                    if (!youVarListIterator.hasNext()) {
                        return defpackage.afga.X(((lyf) obj6).c);
                    }
                    E next2 = youVarListIterator.next();
                    next2.getClass();
                    lyf lyfVar = (lyf) obj6;
                    java.util.Map map = lyfVar.c;
                    lum lumVar = (lum) next2;
                    java.lang.String str3 = lumVar.a;
                    if (!map.containsKey(str3)) {
                        defpackage.you youVarListIterator2 = lumVar.d.listIterator(0);
                        youVarListIterator2.getClass();
                        while (true) {
                            krg krgVar2 = null;
                            while (true) {
                                if (youVarListIterator2.hasNext()) {
                                    E next3 = youVarListIterator2.next();
                                    next3.getClass();
                                    dur durVar = ((mesquite.messaging.model.Message) next3).e;
                                    if (!defpackage.afga.f(durVar, lumVar.c) && (str = durVar.c) != null) {
                                        java.lang.String string = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.toString();
                                        string.getClass();
                                        if (afzh.g(str, string, false)) {
                                            kra kraVarD = jvb.d().d(android.net.Uri.parse(str), new krh(lyfVar.b, false));
                                            if (kraVarD != null) {
                                                krg krgVar3 = kraVarD.d;
                                                if (lyfVar.a(krgVar3)) {
                                                    krgVar2 = krgVar3;
                                                } else {
                                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                    defpackage.you youVarListIterator3 = kraVarD.b.listIterator(0);
                                                    youVarListIterator3.getClass();
                                                    while (youVarListIterator3.hasNext()) {
                                                        E next4 = youVarListIterator3.next();
                                                        next4.getClass();
                                                        krg krgVar4 = (krg) next4;
                                                        if (lyfVar.a(krgVar4)) {
                                                            arrayList2.add(krgVar4);
                                                        }
                                                    }
                                                    if (!arrayList2.isEmpty() && arrayList2.size() == 1) {
                                                        krgVar2 = (krg) arrayList2.get(0);
                                                    }
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                } else {
                                    map.put(str3, krgVar2);
                                }
                            }
                        }
                    }
                }
                break;
            case 15:
                obj.getClass();
                if (obj instanceof lyf) {
                    return new lyg(this.a.e(), 0);
                }
                if (obj instanceof lyc) {
                    return defpackage.kzi.k() ? new lkz(5) : new lkz(4);
                }
                throw new java.lang.IllegalStateException("Not known model type");
            case 16:
                ((tie) obj).getClass();
                defpackage.lyd.c();
                return new odn(defpackage.lyd.a(this.a), (byte[]) null);
            case 17:
                lzo lzoVar = (lzo) obj;
                return lzoVar != null ? lzoVar.b() : ((defpackage.lzw) this.a).g;
            case 18:
                defpackage.cja cjaVar = (defpackage.cja) obj;
                cjaVar.getClass();
                this.a.b(java.lang.Boolean.valueOf(cjaVar.a()));
                return defpackage.afbk.a;
            case 19:
                defpackage.cim cimVar = (defpackage.cim) obj;
                cimVar.getClass();
                defpackage.cit citVarD = defpackage.mcl.d(this.a);
                if (citVarD == null) {
                    citVarD = defpackage.cit.a;
                }
                cimVar.b(citVarD);
                return defpackage.afbk.a;
            default:
                defpackage.cja cjaVar2 = (defpackage.cja) obj;
                cjaVar2.getClass();
                if (cjaVar2.b()) {
                    this.a.invoke();
                }
                return defpackage.afbk.a;
        }
    }
}
