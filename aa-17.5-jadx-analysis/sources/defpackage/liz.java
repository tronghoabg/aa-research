package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class liz {
    static final long b;
    private final List a = new CopyOnWriteArrayList();
    protected tdz c;
    private tdz d;

    static {
        yph.c("GH.BaseSpeedProvider");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = 5000000000L;
    }

    public liz() {
        lbh.a();
        this.d = new tdz(null);
        lbh.a();
        this.c = new tdz(lir.c);
    }

    protected static final long k(long j) {
        return (j - tmd.a()) + b;
    }

    public abstract float a();

    final lir d() {
        return this.c.b() ? (lir) this.c.a : lir.c;
    }

    protected tdz e(Object obj, Object obj2, long j) {
        long jK = k(j);
        if (jK > 0) {
            lbh.a();
            return new tdz(obj, Long.valueOf(jK));
        }
        lbh.a();
        return new tdz(obj2);
    }

    final Float f() {
        if (this.d.b()) {
            return (Float) this.d.a;
        }
        return null;
    }

    final void g(Float f, long j) {
        lir lirVar;
        this.d = e(f, null, j);
        List list = this.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((lis) it.next()).b((Float) this.d.a);
        }
        Float f2 = (Float) this.d.a;
        if (f2 == null) {
            lirVar = lir.c;
        } else {
            lirVar = Math.abs(f2.floatValue()) > a() ? lir.a : lir.b;
        }
        tdz tdzVarE = e(lirVar, lir.c, j);
        boolean zEquals = Objects.equals(this.c.a, tdzVarE.a);
        this.c = tdzVarE;
        if (zEquals) {
            return;
        }
        list.size();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((lis) it2.next()).a(d());
        }
    }

    final void h(lis lisVar) {
        this.a.add(lisVar);
        lisVar.b(f());
        lisVar.a(d());
    }

    public void i() {
        this.a.clear();
    }

    final void j(lis lisVar) {
        this.a.remove(lisVar);
    }
}
