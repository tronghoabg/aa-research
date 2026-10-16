package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fcp {
    public static volatile defpackage.fcp a;
    public static final java.lang.Object b = new java.lang.Object();
    public final android.content.Context e;
    public final java.util.Set d = new java.util.HashSet();
    final java.util.Map c = new java.util.HashMap();

    public fcp(android.content.Context context) {
        this.e = context.getApplicationContext();
    }

    public final void a(java.lang.Class cls, java.util.Set set) {
        if (defpackage.fdp.b()) {
            cls.getSimpleName();
        }
        if (set.contains(cls)) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        java.util.Map map = this.c;
        if (map.containsKey(cls)) {
            this.c.get(cls);
            return;
        }
        set.add(cls);
        try {
            defpackage.fcq fcqVar = (defpackage.fcq) cls.getDeclaredConstructor(null).newInstance(null);
            java.util.List<java.lang.Class> listB = fcqVar.b();
            if (!listB.isEmpty()) {
                for (java.lang.Class cls2 : listB) {
                    if (!map.containsKey(cls2)) {
                        a(cls2, set);
                    }
                }
            }
            java.lang.Object objA = fcqVar.a(this.e);
            set.remove(cls);
            map.put(cls, objA);
        } catch (java.lang.Throwable th) {
            throw new defpackage.fcr(th);
        }
    }
}
