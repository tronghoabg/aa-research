package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ljg {
    static final long b;
    private final java.util.List a = new java.util.concurrent.CopyOnWriteArrayList();
    protected defpackage.tew c;
    private defpackage.tew d;

    static {
        defpackage.yqm.c("GH.BaseSpeedProvider");
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        b = 5000000000L;
    }

    public ljg() {
        defpackage.lbm.a();
        this.d = new defpackage.tew(null);
        defpackage.lbm.a();
        this.c = new defpackage.tew(defpackage.liy.c);
    }

    protected static final long k(long j) {
        return (j - defpackage.tnb.a()) + b;
    }

    public abstract float a();

    final defpackage.liy d() {
        return this.c.b() ? (defpackage.liy) this.c.a : defpackage.liy.c;
    }

    protected defpackage.tew e(java.lang.Object obj, java.lang.Object obj2, long j) {
        long jK = k(j);
        if (jK > 0) {
            defpackage.lbm.a();
            return new defpackage.tew(obj, java.lang.Long.valueOf(jK));
        }
        defpackage.lbm.a();
        return new defpackage.tew(obj2);
    }

    final java.lang.Float f() {
        if (this.d.b()) {
            return (java.lang.Float) this.d.a;
        }
        return null;
    }

    final void g(java.lang.Float f, long j) {
        defpackage.liy liyVar;
        this.d = e(f, null, j);
        java.util.List list = this.a;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((defpackage.liz) it.next()).b((java.lang.Float) this.d.a);
        }
        java.lang.Float f2 = (java.lang.Float) this.d.a;
        if (f2 == null) {
            liyVar = defpackage.liy.c;
        } else {
            liyVar = java.lang.Math.abs(f2.floatValue()) > a() ? defpackage.liy.a : defpackage.liy.b;
        }
        defpackage.tew tewVarE = e(liyVar, defpackage.liy.c, j);
        boolean zEquals = j$.util.Objects.equals(this.c.a, tewVarE.a);
        this.c = tewVarE;
        if (zEquals) {
            return;
        }
        list.size();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((defpackage.liz) it2.next()).a(d());
        }
    }

    final void h(defpackage.liz lizVar) {
        this.a.add(lizVar);
        lizVar.b(f());
        lizVar.a(d());
    }

    public void i() {
        this.a.clear();
    }

    final void j(defpackage.liz lizVar) {
        this.a.remove(lizVar);
    }
}
