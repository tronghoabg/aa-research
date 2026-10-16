package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class eqp<T> {
    public static final java.lang.Object b = new java.lang.Object();
    public final java.lang.Object c;
    int d;
    public boolean e;
    public volatile java.lang.Object f;
    public int g;
    private volatile java.lang.Object h;
    private boolean i;
    private boolean j;
    private final java.lang.Runnable k;
    private final defpackage.pt sw;

    public eqp() {
        this.c = new java.lang.Object();
        this.sw = new defpackage.pt();
        this.d = 0;
        java.lang.Object obj = b;
        this.f = obj;
        this.k = new defpackage.bgf(this, 8, null);
        this.h = obj;
        this.g = -1;
    }

    private final void a(defpackage.eqo eqoVar) {
        if (eqoVar.d) {
            if (!eqoVar.dZ()) {
                eqoVar.d(false);
                return;
            }
            int i = eqoVar.e;
            int i2 = this.g;
            if (i < i2) {
                eqoVar.e = i2;
                eqoVar.c.ea(this.h);
            }
        }
    }

    static void f(java.lang.String str) {
        if (!defpackage.pn.bn().bo()) {
            throw new java.lang.IllegalStateException(defpackage.a.bp(str, "Cannot invoke ", " on a background thread"));
        }
    }

    public final java.lang.Object e() {
        java.lang.Object obj = this.h;
        if (obj != b) {
            return obj;
        }
        return null;
    }

    public final void eM(defpackage.eqg eqgVar, defpackage.eqt eqtVar) {
        f("observe");
        if (eqgVar.getLifecycle().a() == defpackage.epx.a) {
            return;
        }
        defpackage.eqn eqnVar = new defpackage.eqn(this, eqgVar, eqtVar);
        defpackage.eqo eqoVar = (defpackage.eqo) this.sw.b(eqtVar, eqnVar);
        if (eqoVar != null && !eqoVar.c(eqgVar)) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (eqoVar == null) {
            eqgVar.getLifecycle().c(eqnVar);
        }
    }

    final void g(defpackage.eqo eqoVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (eqoVar != null) {
                a(eqoVar);
            } else {
                defpackage.pt ptVar = this.sw;
                defpackage.pq pqVar = new defpackage.pq(ptVar);
                ptVar.b.put(pqVar, java.lang.Boolean.FALSE);
                while (pqVar.hasNext()) {
                    a((defpackage.eqo) ((defpackage.pp) pqVar.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            eqoVar = null;
        }
    }

    public final void i(defpackage.eqt eqtVar) {
        f("observeForever");
        defpackage.eqm eqmVar = new defpackage.eqm(this, eqtVar);
        defpackage.eqo eqoVar = (defpackage.eqo) this.sw.b(eqtVar, eqmVar);
        if (eqoVar instanceof defpackage.eqn) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (eqoVar != null) {
            return;
        }
        eqmVar.d(true);
    }

    public final void j(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        synchronized (this.c) {
            obj2 = this.f;
            obj3 = b;
            this.f = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        java.lang.Runnable runnable = this.k;
        defpackage.ca caVar = defpackage.pn.bn().d;
        defpackage.po poVar = (defpackage.po) caVar;
        if (poVar.e == null) {
            synchronized (poVar.c) {
                if (((defpackage.po) caVar).e == null) {
                    ((defpackage.po) caVar).e = hh$.ExternalSyntheticApiModelOutline0.m(android.os.Looper.getMainLooper());
                }
            }
        }
        poVar.e.post(runnable);
    }

    public void k(defpackage.eqt eqtVar) {
        f("removeObserver");
        defpackage.eqo eqoVar = (defpackage.eqo) this.sw.c(eqtVar);
        if (eqoVar == null) {
            return;
        }
        eqoVar.b();
        eqoVar.d(false);
    }

    public final void l(defpackage.eqg eqgVar) {
        f("removeObservers");
        for (java.util.Map.Entry entry : this.sw) {
            if (((defpackage.eqo) entry.getValue()).c(eqgVar)) {
                k((defpackage.eqt) entry.getKey());
            }
        }
    }

    public void m(java.lang.Object obj) {
        f("setValue");
        this.g++;
        this.h = obj;
        g(null);
    }

    public final boolean n() {
        return this.d > 0;
    }

    public final boolean o() {
        return this.h != b;
    }

    public void p() {
        m(j$.util.Optional.empty());
    }

    public void q(java.lang.Object obj) {
        j(j$.util.Optional.ofNullable(obj));
    }

    protected void c() {
    }

    protected void d() {
    }

    public eqp(java.lang.Object obj) {
        this.c = new java.lang.Object();
        this.sw = new defpackage.pt();
        this.d = 0;
        this.f = b;
        this.k = new defpackage.bgf(this, 8, null);
        this.h = obj;
        this.g = 0;
    }
}
