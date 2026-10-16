package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class admm {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.admm.class.getName());
    private static defpackage.admm b;
    private final java.util.LinkedHashSet c = new java.util.LinkedHashSet();
    private final java.util.LinkedHashMap d = new java.util.LinkedHashMap();

    public static synchronized defpackage.admm b() {
        if (b == null) {
            defpackage.adml.class.getClassLoader();
            java.util.List<defpackage.adml> listR = defpackage.adrq.r(defpackage.adml.class, java.util.Collections.singletonList(defpackage.adyi.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new defpackage.typ(18), new defpackage.adms(1));
            b = new defpackage.admm();
            for (defpackage.adml admlVar : listR) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(java.lang.String.valueOf(java.lang.String.valueOf(admlVar))));
                b.c(admlVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(defpackage.adml admlVar) {
        admlVar.d();
        this.c.add(admlVar);
    }

    private final synchronized void d() {
        java.util.LinkedHashMap linkedHashMap = this.d;
        linkedHashMap.clear();
        for (defpackage.adml admlVar : this.c) {
            java.lang.String strC = admlVar.c();
            if (((defpackage.adml) linkedHashMap.get(strC)) != null) {
                admlVar.e();
            } else {
                linkedHashMap.put(strC, admlVar);
            }
        }
    }

    public final synchronized defpackage.adml a(java.lang.String str) {
        return (defpackage.adml) this.d.get(str);
    }
}
