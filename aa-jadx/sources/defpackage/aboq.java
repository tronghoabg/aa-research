package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class aboq {
    static defpackage.abol b(java.lang.Class cls) {
        java.lang.ClassLoader classLoader = defpackage.aboq.class.getClassLoader();
        if (cls.equals(defpackage.abol.class)) {
            try {
                try {
                    return (defpackage.abol) cls.cast(((defpackage.aboq) java.lang.Class.forName("abnl", true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (java.lang.ReflectiveOperationException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        java.util.Iterator it = java.util.Collections.singletonList(defpackage.abrj.class.getDeclaredConstructor(null).newInstance(null)).iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((defpackage.abol) cls.cast(((defpackage.aboq) it.next()).a()));
            } catch (java.util.ServiceConfigurationError e2) {
                java.util.logging.Logger.getLogger(defpackage.abof.class.getName()).logp(java.util.logging.Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(java.lang.String.valueOf(cls.getSimpleName())), (java.lang.Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (defpackage.abol) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (defpackage.abol) cls.getMethod("combine", java.util.Collection.class).invoke(null, arrayList);
        } catch (java.lang.ReflectiveOperationException e3) {
            throw new java.lang.IllegalStateException(e3);
        }
    }

    protected abstract defpackage.abol a();
}
