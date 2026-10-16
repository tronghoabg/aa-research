package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class eqj<T> {
    public static final Object b = new Object();
    public final Object c;
    int d;
    public boolean e;
    public volatile Object f;
    public int g;
    private volatile Object h;
    private boolean i;
    private boolean j;
    private final Runnable k;
    private final pq sw;

    public eqj() {
        this.c = new Object();
        this.sw = new pq();
        this.d = 0;
        Object obj = b;
        this.f = obj;
        this.k = new ne(this, 13);
        this.h = obj;
        this.g = -1;
    }

    private final void a(eqi eqiVar) {
        if (eqiVar.d) {
            if (!eqiVar.eR()) {
                eqiVar.d(false);
                return;
            }
            int i = eqiVar.e;
            int i2 = this.g;
            if (i < i2) {
                eqiVar.e = i2;
                eqiVar.c.eS(this.h);
            }
        }
    }

    static void f(String str) {
        if (!pk.bn().bo()) {
            throw new IllegalStateException(a.bq(str, "Cannot invoke ", " on a background thread"));
        }
    }

    public final Object e() {
        Object obj = this.h;
        if (obj != b) {
            return obj;
        }
        return null;
    }

    public final void fE(eqa eqaVar, eqn eqnVar) {
        f("observe");
        if (eqaVar.getLifecycle().a() == eps.a) {
            return;
        }
        eqh eqhVar = new eqh(this, eqaVar, eqnVar);
        eqi eqiVar = (eqi) this.sw.b(eqnVar, eqhVar);
        if (eqiVar != null && !eqiVar.c(eqaVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (eqiVar == null) {
            eqaVar.getLifecycle().c(eqhVar);
        }
    }

    final void g(eqi eqiVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (eqiVar != null) {
                a(eqiVar);
            } else {
                pq pqVar = this.sw;
                pn pnVar = new pn(pqVar);
                pqVar.b.put(pnVar, false);
                while (pnVar.hasNext()) {
                    a((eqi) ((pm) pnVar.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            eqiVar = null;
        }
    }

    public final void i(eqn eqnVar) {
        f("observeForever");
        eqg eqgVar = new eqg(this, eqnVar);
        eqi eqiVar = (eqi) this.sw.b(eqnVar, eqgVar);
        if (eqiVar instanceof eqh) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (eqiVar != null) {
            return;
        }
        eqgVar.d(true);
    }

    public final void j(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.c) {
            obj2 = this.f;
            obj3 = b;
            this.f = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        Runnable runnable = this.k;
        ca caVar = pk.bn().d;
        pl plVar = (pl) caVar;
        if (plVar.e == null) {
            synchronized (plVar.c) {
                if (((pl) caVar).e == null) {
                    ((pl) caVar).e = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        plVar.e.post(runnable);
    }

    public void k(eqn eqnVar) {
        f("removeObserver");
        eqi eqiVar = (eqi) this.sw.c(eqnVar);
        if (eqiVar == null) {
            return;
        }
        eqiVar.b();
        eqiVar.d(false);
    }

    public final void l(eqa eqaVar) {
        f("removeObservers");
        Iterator it = this.sw.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((eqi) entry.getValue()).c(eqaVar)) {
                k((eqn) entry.getKey());
            }
        }
    }

    public void m(Object obj) {
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
        m(Optional.empty());
    }

    public void q(Object obj) {
        j(Optional.ofNullable(obj));
    }

    protected void c() {
    }

    protected void d() {
    }

    public eqj(Object obj) {
        this.c = new Object();
        this.sw = new pq();
        this.d = 0;
        this.f = b;
        this.k = new ne(this, 13);
        this.h = obj;
        this.g = 0;
    }
}
