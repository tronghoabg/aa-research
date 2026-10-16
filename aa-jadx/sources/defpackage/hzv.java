package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hzv {
    private static final defpackage.hzq a = new defpackage.hzu(0);
    private final java.util.List b = new java.util.ArrayList();
    private final java.util.Set c = new java.util.HashSet();
    private final defpackage.dzr d;

    public hzv(defpackage.dzr dzrVar) {
        this.d = dzrVar;
    }

    private final void f(java.lang.Class cls, java.lang.Class cls2, defpackage.hzr hzrVar, boolean z) {
        this.b.add(z ? this.b.size() : 0, new defpackage.ndd(cls, cls2, (java.lang.Object) hzrVar));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hzr, java.lang.Object] */
    private final defpackage.hzq g(defpackage.ndd nddVar) {
        return nddVar.c.b(this);
    }

    public final synchronized defpackage.hzq a(java.lang.Class cls, java.lang.Class cls2) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z = false;
            for (defpackage.ndd nddVar : this.b) {
                java.util.Set set = this.c;
                if (set.contains(nddVar)) {
                    z = true;
                } else if (nddVar.x(cls) && ((java.lang.Class) nddVar.a).isAssignableFrom(cls2)) {
                    set.add(nddVar);
                    arrayList.add(g(nddVar));
                    set.remove(nddVar);
                }
            }
            if (arrayList.size() > 1) {
                return new defpackage.hzt(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (defpackage.hzq) arrayList.get(0);
            }
            if (!z) {
                throw new defpackage.hst(cls, cls2);
            }
            return a;
        } catch (java.lang.Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized java.util.List b(java.lang.Class cls) {
        java.util.ArrayList arrayList;
        try {
            arrayList = new java.util.ArrayList();
            for (defpackage.ndd nddVar : this.b) {
                java.util.Set set = this.c;
                if (!set.contains(nddVar) && nddVar.x(cls)) {
                    set.add(nddVar);
                    arrayList.add(g(nddVar));
                    set.remove(nddVar);
                }
            }
        } catch (java.lang.Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized java.util.List c(java.lang.Class cls) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        for (defpackage.ndd nddVar : this.b) {
            java.lang.Object obj = nddVar.a;
            if (!arrayList.contains(obj) && nddVar.x(cls)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final synchronized void d(java.lang.Class cls, java.lang.Class cls2, defpackage.hzr hzrVar) {
        f(cls, cls2, hzrVar, true);
    }

    public final synchronized void e(java.lang.Class cls, java.lang.Class cls2, defpackage.hzr hzrVar) {
        f(cls, cls2, hzrVar, false);
    }
}
