package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nkg extends defpackage.eqr {
    public android.content.ComponentName a;
    public android.content.ComponentName h;
    public android.content.ComponentName i;
    final /* synthetic */ defpackage.nkj j;
    private final defpackage.eqp k;

    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    public nkg(defpackage.nkj nkjVar) {
        java.util.List arrayList;
        android.content.ComponentName componentNameUnflattenFromString;
        this.j = nkjVar;
        defpackage.afdo afdoVar = defpackage.tcu.a;
        defpackage.eqp eqpVarV = defpackage.tcu.v(nkjVar.m, new defpackage.njy(10));
        defpackage.afgv afgvVar = new defpackage.afgv();
        defpackage.eqr eqrVar = new defpackage.eqr();
        eqrVar.r(eqpVarV, new defpackage.kku(new defpackage.nkb(eqrVar, afgvVar, 14), 11));
        this.k = defpackage.tcu.v(defpackage.tcu.t(eqrVar), new defpackage.njy(11));
        if (defpackage.kit.b().r()) {
            if (defpackage.acyc.V()) {
                android.content.SharedPreferences sharedPreferences = nkjVar.d;
                java.lang.String string = sharedPreferences.getString("RailHotseat_Recent_Apps_Key", null);
                if (string != null) {
                    java.util.List listL = afzh.L(string, new java.lang.String[]{","}, 0);
                    arrayList = new java.util.ArrayList();
                    java.util.Iterator it = listL.iterator();
                    while (it.hasNext()) {
                        android.content.ComponentName componentNameUnflattenFromString2 = android.content.ComponentName.unflattenFromString((java.lang.String) it.next());
                        if (componentNameUnflattenFromString2 != null) {
                            arrayList.add(componentNameUnflattenFromString2);
                        }
                    }
                } else {
                    java.lang.String string2 = sharedPreferences.getString("RailHotseat_Previous_App_Component_Name_Key", null);
                    if (string2 == null || (componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(string2)) == null) {
                        arrayList = defpackage.afce.a;
                    } else {
                        java.util.List listAa = defpackage.afga.aa(componentNameUnflattenFromString);
                        nkjVar.l(listAa);
                        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.getClass();
                        editorEdit.remove("RailHotseat_Previous_App_Component_Name_Key");
                        editorEdit.apply();
                        arrayList = listAa;
                    }
                }
                defpackage.nkj.b.l().y("Loaded recent apps from prefs: %s", arrayList);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    android.content.ComponentName componentName = (android.content.ComponentName) obj;
                    defpackage.qsh qshVarE = defpackage.kit.b().e();
                    qshVarE.getClass();
                    if (defpackage.nkj.m(componentName, qshVarE) && !v(componentName)) {
                        arrayList2.add(obj);
                    }
                }
                u(arrayList2);
            } else {
                java.lang.String string3 = nkjVar.d.getString("RailHotseat_Previous_App_Component_Name_Key", null);
                android.content.ComponentName componentNameUnflattenFromString3 = string3 == null ? null : android.content.ComponentName.unflattenFromString(string3);
                if (componentNameUnflattenFromString3 != null) {
                    defpackage.qsh qshVarE2 = defpackage.kit.b().e();
                    qshVarE2.getClass();
                    componentNameUnflattenFromString3 = true != defpackage.nkj.m(componentNameUnflattenFromString3, qshVarE2) ? null : componentNameUnflattenFromString3;
                    if (componentNameUnflattenFromString3 == null) {
                        componentNameUnflattenFromString3 = defpackage.mkt.v;
                        componentNameUnflattenFromString3.getClass();
                    }
                } else {
                    componentNameUnflattenFromString3 = defpackage.mkt.v;
                    componentNameUnflattenFromString3.getClass();
                }
                u(defpackage.afga.aa(componentNameUnflattenFromString3));
            }
            r(this.k, new defpackage.nol(new defpackage.eyx(this, 19, (byte[]) null, (byte[]) null), 1));
            r(defpackage.tcu.t(defpackage.tcu.E(this.j.e())), new defpackage.nol(new defpackage.njt(this, 11), 1));
            r(defpackage.tcu.t(defpackage.tcu.E(this.j.f())), new defpackage.nol(new defpackage.njt(this, 12), 1));
            r(defpackage.tcu.t(defpackage.tcu.E(this.j.g())), new defpackage.nol(new defpackage.njt(this, 13), 1));
        }
    }

    public static final boolean v(android.content.ComponentName componentName) {
        if (defpackage.acyc.V()) {
            if (defpackage.afga.f(componentName, defpackage.mkt.b) || defpackage.afga.f(componentName, defpackage.mkt.c)) {
                defpackage.nkj.b.l().y("Recent app denied: %s (reason: telecom)", componentName);
                return true;
            }
            if (defpackage.afga.f(componentName, defpackage.mkt.s) || defpackage.afga.f(componentName, defpackage.mkt.H)) {
                defpackage.nkj.b.l().y("Recent app denied: %s (reason: launcher)", componentName);
                return true;
            }
            if (defpackage.afga.f(componentName, defpackage.mkt.B)) {
                defpackage.nkj.b.l().y("Recent app denied: %s (reason: nav fallback)", componentName);
                return true;
            }
        }
        if (defpackage.afga.f(componentName, defpackage.mkt.v) || defpackage.kmv.c(acxw.b(), componentName.flattenToString())) {
            return false;
        }
        defpackage.nkj.b.l().y("Recent app denied: %s (reason: denied list flag)", componentName);
        return true;
    }

    public final void a(android.content.ComponentName componentName, android.content.ComponentName componentName2) {
        if (defpackage.acyc.V()) {
            java.util.Collection collection = (java.util.List) e();
            if (collection == null) {
                collection = defpackage.afce.a;
            }
            java.util.List listBb = defpackage.afga.bb(collection);
            if (componentName2 != null && !defpackage.afga.f(componentName2, componentName)) {
                listBb.remove(componentName2);
                listBb.add(0, componentName2);
            }
            u(listBb);
            return;
        }
        java.util.List list = (java.util.List) e();
        android.content.ComponentName componentName3 = list != null ? (android.content.ComponentName) defpackage.afga.aB(list) : null;
        if (componentName2 != null) {
            if (defpackage.afga.f(componentName2, componentName)) {
            }
            if (componentName2 != null || defpackage.afga.f(componentName2, componentName3)) {
            }
            u(defpackage.afga.aa(componentName2));
            return;
        }
        componentName2 = null;
        if ((componentName2 == null || defpackage.afga.f(componentName2, componentName)) && defpackage.afga.f(componentName, componentName3)) {
            android.content.ComponentName componentName4 = this.i;
            componentName2 = defpackage.mkt.b;
            if (defpackage.afga.f(componentName4, componentName2)) {
                componentName2 = defpackage.mkt.v;
            }
        } else {
            componentName2 = componentName3;
        }
        if (componentName2 != null) {
        }
    }

    @Override // defpackage.eqp
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void m(java.util.List list) {
        java.util.List list2 = list == null ? defpackage.afce.a : list;
        if (!defpackage.acyc.V()) {
            android.content.ComponentName componentName = (android.content.ComponentName) defpackage.afga.aB(list2);
            defpackage.nkj.b.l().S("Setting recent app to %s. Nav: %s, Media: %s, Phone: %s", componentName, this.a, this.h, this.i);
            if (componentName != null) {
                this.j.n(componentName);
            }
            this.j.l(list2);
            super.m(list);
            return;
        }
        defpackage.nkj.b.l().S("Setting recent apps to %s. Nav: %s, Media: %s, Phone: %s", list, this.a, this.h, this.i);
        defpackage.nkj nkjVar = this.j;
        nkjVar.l(list2);
        android.content.ComponentName componentName2 = (android.content.ComponentName) defpackage.afga.aB(list2);
        if (componentName2 != null) {
            nkjVar.n(componentName2);
        }
        super.m(list);
    }

    public final void u(java.util.List list) {
        if (!defpackage.acyc.V()) {
            defpackage.nkj.b.l().y("Updating recent apps (legacy). newList=%s", list);
            android.content.ComponentName componentName = (android.content.ComponentName) defpackage.afga.aB(list);
            if (componentName == null || defpackage.afga.f(componentName, this.a) || defpackage.afga.f(componentName, this.h) || defpackage.afga.f(componentName, this.i) || v(componentName)) {
                componentName = null;
            }
            if (componentName == null) {
                componentName = defpackage.mkt.v;
                componentName.getClass();
            }
            m(defpackage.afga.aa(componentName));
            return;
        }
        defpackage.yqm yqmVar = defpackage.nkj.b;
        yqmVar.l().y("Updating recent apps. newList=%s", list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            android.content.ComponentName componentName2 = (android.content.ComponentName) obj;
            if (!defpackage.afga.f(componentName2, this.a) && !defpackage.afga.f(componentName2, this.h) && !defpackage.afga.f(componentName2, this.i) && !v(componentName2)) {
                arrayList.add(obj);
            }
        }
        java.util.List listAK = defpackage.afga.aK(arrayList);
        yqmVar.l().y("Filtered recent apps. filteredList=%s", listAK);
        java.util.List listBb = defpackage.afga.bb(listAK);
        if (listBb.isEmpty()) {
            android.content.ComponentName componentName3 = defpackage.mkt.v;
            componentName3.getClass();
            listBb.add(componentName3);
        }
        java.util.List listAX = defpackage.afga.aX(listBb, 3);
        yqmVar.l().y("Final recent apps to be assigned: %s", listAX);
        m(listAX);
    }
}
