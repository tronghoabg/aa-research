package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qlx {
    public final defpackage.qma a;
    public boolean b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public final java.util.Map g;
    public final java.util.List h;
    private long i;
    private long j;
    private final defpackage.sqi k;

    public qlx(defpackage.qlx qlxVar) {
        this.a = qlxVar.a;
        this.k = qlxVar.k;
        this.c = qlxVar.c;
        this.d = qlxVar.d;
        this.e = qlxVar.e;
        this.i = qlxVar.i;
        this.j = qlxVar.j;
        this.h = new java.util.ArrayList(qlxVar.h);
        this.g = new java.util.HashMap(qlxVar.g.size());
        for (java.util.Map.Entry entry : qlxVar.g.entrySet()) {
            defpackage.qlz qlzVarD = d((java.lang.Class) entry.getKey());
            ((defpackage.qlz) entry.getValue()).b(qlzVarD);
            this.g.put((java.lang.Class) entry.getKey(), qlzVarD);
        }
    }

    private static defpackage.qlz d(java.lang.Class cls) {
        try {
            return (defpackage.qlz) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Exception e) {
            if (e instanceof java.lang.InstantiationException) {
                throw new java.lang.IllegalArgumentException("dataType doesn't have default constructor", e);
            }
            if (e instanceof java.lang.IllegalAccessException) {
                throw new java.lang.IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            if (e instanceof java.lang.ReflectiveOperationException) {
                throw new java.lang.IllegalArgumentException("Linkage exception", e);
            }
            throw new java.lang.RuntimeException(e);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.qlz a(java.lang.Class cls) {
        java.util.Map map = this.g;
        defpackage.qlz qlzVar = (defpackage.qlz) map.get(cls);
        if (qlzVar != null) {
            return qlzVar;
        }
        defpackage.qlz qlzVarD = d(cls);
        map.put(cls, qlzVarD);
        return qlzVarD;
    }

    public final defpackage.qlz b(java.lang.Class cls) {
        return (defpackage.qlz) this.g.get(cls);
    }

    public final void c(defpackage.qlz qlzVar) {
        defpackage.sqs.aA(qlzVar);
        java.lang.Class<?> cls = qlzVar.getClass();
        if (cls.getSuperclass() != defpackage.qlz.class) {
            throw new java.lang.IllegalArgumentException();
        }
        qlzVar.b(a(cls));
    }

    public qlx(defpackage.qma qmaVar, defpackage.sqi sqiVar) {
        this.a = qmaVar;
        this.k = sqiVar;
        this.i = 1800000L;
        this.j = 3024000000L;
        this.g = new java.util.HashMap();
        this.h = new java.util.ArrayList();
    }
}
