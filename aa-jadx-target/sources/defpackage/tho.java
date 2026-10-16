package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class tho {
    private final java.util.concurrent.ConcurrentMap a = new j$.util.concurrent.ConcurrentHashMap();

    @java.lang.Deprecated
    public void e(java.lang.Class cls, defpackage.afak afakVar) {
        this.a.put(cls, new defpackage.thp(true, new defpackage.qez(afakVar, 4)));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final java.lang.Object i(java.lang.Class cls) {
        java.lang.Object objCast = cls.cast(l(cls, false, null));
        objCast.getClass();
        return objCast;
    }

    public final java.lang.Object j(java.lang.Class cls) {
        defpackage.thl thlVar = (defpackage.thl) this.a.get(cls);
        if (thlVar == null || !thlVar.b()) {
            return null;
        }
        return cls.cast(thlVar.a());
    }

    public final java.lang.Object k(java.lang.Class cls) {
        return cls.cast(l(cls, true, null));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: thm */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final java.lang.Object l(java.lang.Class cls, boolean z, defpackage.thn thnVar) throws thm {
        java.util.concurrent.ConcurrentMap concurrentMap = this.a;
        defpackage.thl thlVar = (defpackage.thl) concurrentMap.get(cls);
        if (thlVar != null && thlVar.b()) {
            return thlVar.a();
        }
        try {
            defpackage.thl thlVar2 = thnVar == null ? (defpackage.thl) concurrentMap.get(cls) : (defpackage.thl) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(concurrentMap, cls, new defpackage.kpc(thnVar, 6));
            if (thlVar2 != null) {
                return thlVar2.a();
            }
            if (z) {
                return null;
            }
            throw new java.lang.IllegalArgumentException("No such class registered: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(cls))));
        } catch (java.lang.RuntimeException e) {
            throw new thm(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: thm */
    public final void m() throws thm {
        for (java.util.Map.Entry entry : this.a.entrySet()) {
            if (((defpackage.thl) entry.getValue()).c()) {
                l((java.lang.Class) entry.getKey(), false, null);
            }
        }
    }

    protected final void n(java.lang.Class cls, defpackage.thn thnVar) {
        this.a.put(cls, new defpackage.thp(false, thnVar));
    }
}
