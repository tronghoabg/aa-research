package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class luv extends defpackage.nzc implements defpackage.lhn, defpackage.lur {
    public static final /* synthetic */ int d = 0;
    private static final defpackage.yqm e = defpackage.yqm.c("GH.MsgAppProvider");
    public defpackage.yhe a;
    public final defpackage.luw b;
    public final defpackage.luw c;
    private final defpackage.luu f;
    private final defpackage.luw g;
    private final defpackage.luw h;

    public luv() {
        super("Messaging");
        this.f = new defpackage.luu();
        this.b = new defpackage.luy();
        this.c = new defpackage.lux();
        this.g = new defpackage.luz();
        this.h = new defpackage.lus(defpackage.mkp.a.c);
    }

    public static defpackage.luv e() {
        return (defpackage.luv) defpackage.mkp.a.b(defpackage.luv.class, new defpackage.lga(3));
    }

    static void f(java.util.Map map, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.content.ComponentName componentName = (android.content.ComponentName) it.next();
            if (!map.containsKey(componentName.getPackageName())) {
                map.put(componentName.getPackageName(), componentName);
            }
        }
    }

    public static final boolean k(android.content.ComponentName componentName) {
        return defpackage.kmv.c(defpackage.acui.b(), componentName.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final defpackage.yhe o(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        defpackage.yhe yheVar;
        java.util.HashMap map = new java.util.HashMap();
        if (nzeVar.equals(defpackage.nze.a()) && (yheVar = this.a) != null) {
            return yheVar;
        }
        if (defpackage.acul.k()) {
            f(map, this.b.b(qshVar, nzeVar).d());
            ((defpackage.yqj) e.l().ai((char) 4277)).w("Added messaging apps with service intent filter; have a total of %d", map.size());
        }
        defpackage.luw luwVar = this.c;
        f(map, luwVar.b(qshVar, nzeVar).d());
        defpackage.yqm yqmVar = e;
        ((defpackage.yqj) yqmVar.l().ai(4273)).K("Added notification messaging apps (%s); have a total of %d", luwVar.getClass().getSimpleName(), map.size());
        f(map, this.g.b(qshVar, defpackage.nze.b()).d());
        ((defpackage.yqj) yqmVar.l().ai(4274)).w("Added SMS apps; have a total of %d", map.size());
        if (!map.isEmpty() && defpackage.acul.u()) {
            defpackage.mkj mkjVarB = defpackage.mkc.b();
            android.content.Intent intent = new android.content.Intent("androidx.car.app.CarAppService");
            defpackage.qqe qqeVar = defpackage.qqe.h;
            defpackage.nzd nzdVar = defpackage.nzd.b;
            defpackage.ygw ygwVarN = n(mkjVarB.c(qshVar, new defpackage.nzf(intent, qqeVar, nzeVar.c(new defpackage.ynu(nzdVar)))));
            defpackage.ygw ygwVarN2 = n(defpackage.mkc.b().c(qshVar, new defpackage.nzf(new android.content.Intent("androidx.car.app.CarAppService").addCategory("androidx.car.app.category.SETTINGS"), qqeVar, nzeVar.c(new defpackage.ynu(nzdVar)))));
            defpackage.ygw ygwVarN3 = n(defpackage.mkc.b().c(qshVar, new defpackage.nzf(new android.content.Intent("android.media.browse.MediaBrowserService"), defpackage.qqe.c, nzeVar.c(new defpackage.ynu(nzdVar)))));
            java.util.HashSet hashSet = new java.util.HashSet();
            int i = ((defpackage.ymx) ygwVarN).c;
            for (int i2 = 0; i2 < i; i2++) {
                android.content.ComponentName componentName = (android.content.ComponentName) ygwVarN.get(i2);
                if (!ygwVarN2.contains(componentName)) {
                    hashSet.add(componentName.getPackageName());
                }
            }
            java.util.HashSet hashSet2 = new java.util.HashSet();
            int i3 = ((defpackage.ymx) ygwVarN3).c;
            for (int i4 = 0; i4 < i3; i4++) {
                hashSet2.add(((android.content.ComponentName) ygwVarN3.get(i4)).getPackageName());
            }
            java.util.HashMap map2 = new java.util.HashMap();
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (hashSet.contains(str)) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4276)).y("Suppressing Messaging app %s because CAL app is present", entry.getValue());
                } else if (hashSet2.contains(str)) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4275)).y("Suppressing Messaging app %s because MBS app is present", entry.getValue());
                } else {
                    map2.put(str, (android.content.ComponentName) entry.getValue());
                }
            }
            map = map2;
        }
        if (!nzeVar.equals(defpackage.nze.a())) {
            return defpackage.yhe.j(map);
        }
        defpackage.yhe yheVarJ = defpackage.yhe.j(map);
        this.a = yheVarJ;
        return yheVarJ;
    }

    public final android.content.ComponentName a(java.lang.String str) {
        defpackage.yhe yheVarO = o(defpackage.kit.b().e(), defpackage.nze.a());
        if (yheVarO.containsKey(str)) {
            return (android.content.ComponentName) yheVarO.get(str);
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "Package ", " not found."));
    }

    @Override // defpackage.nzc
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(o(qshVar, nzeVar).values()).map(new lkg(20));
        int i = defpackage.ygw.d;
        return (defpackage.ygw) map.collect(defpackage.yds.a);
    }

    @Override // defpackage.lhn
    public final void d() {
        this.b.c();
        defpackage.mni.a().d(defpackage.mnh.m);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.a = null;
        this.b.c();
        defpackage.mni.a().b(defpackage.mnh.m, this.f);
    }

    public final boolean g(android.content.ComponentName componentName) {
        j$.util.stream.Stream streamDistinct = j$.util.Collection.-EL.stream(this.h.b(defpackage.kit.b().e(), defpackage.nze.b())).map(new lkg(19)).distinct();
        int i = defpackage.ygw.d;
        return ((defpackage.ygw) streamDistinct.collect(defpackage.yds.a)).contains(componentName.getPackageName());
    }

    public final boolean i(java.lang.String str) {
        return o(defpackage.kit.b().e(), defpackage.nze.a()).containsKey(str);
    }

    public final boolean j(defpackage.qsh qshVar, android.content.ComponentName componentName) {
        return this.g.b(qshVar, defpackage.nze.b()).contains(componentName);
    }
}
