package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adnu {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.adnu.class.getName());
    private static defpackage.adnu b;
    private java.lang.String c = "unknown";
    private final java.util.LinkedHashSet d = new java.util.LinkedHashSet();
    private defpackage.yhe e = defpackage.ync.a;

    public static synchronized defpackage.adnu b() {
        if (b == null) {
            defpackage.adnt.class.getClassLoader();
            java.util.List<defpackage.adnt> listR = defpackage.adrq.r(defpackage.adnt.class, java.util.Collections.singletonList(defpackage.aduo.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new defpackage.typ(20), new defpackage.adms(2));
            if (listR.isEmpty()) {
                a.logp(java.util.logging.Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            b = new defpackage.adnu();
            for (defpackage.adnt adntVar : listR) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(java.lang.String.valueOf(java.lang.String.valueOf(adntVar))));
                b.f(adntVar);
            }
            b.g();
        }
        return b;
    }

    private final synchronized void f(defpackage.adnt adntVar) {
        adntVar.f();
        this.d.add(adntVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032 A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x0010, B:6:0x0016, B:8:0x0028, B:11:0x0035, B:13:0x003b, B:10:0x0032, B:14:0x0044), top: B:20:0x0001 }] */
    private final synchronized void g() {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String strC = "unknown";
        int iD = Integer.MIN_VALUE;
        for (defpackage.adnt adntVar : this.d) {
            java.lang.String strC2 = adntVar.c();
            defpackage.adnt adntVar2 = (defpackage.adnt) map.get(strC2);
            if (adntVar2 != null) {
                if (adntVar2.d() < adntVar.d()) {
                    map.put(strC2, adntVar);
                }
            } else {
                map.put(strC2, adntVar);
            }
            if (iD < adntVar.d()) {
                iD = adntVar.d();
                strC = adntVar.c();
            }
        }
        this.e = defpackage.yhe.j(map);
        this.c = strC;
    }

    public final defpackage.adnt a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return (defpackage.adnt) d().get(str.toLowerCase(java.util.Locale.US));
    }

    public final synchronized java.lang.String c() {
        return this.c;
    }

    final synchronized java.util.Map d() {
        return this.e;
    }

    public final synchronized void e(defpackage.adnt adntVar) {
        f(adntVar);
        g();
    }
}
