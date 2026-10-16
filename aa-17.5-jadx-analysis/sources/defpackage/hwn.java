package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class hwn implements igd {
    public final hwq b;
    public final hwo c;
    public hui d;
    public boolean e;
    public hwx f;
    public boolean g;
    hwt h;
    public boolean i;
    hwr j;
    public volatile boolean k;
    int l;
    private final dzk n;
    private final hye o;
    private final hye p;
    private final hye q;
    private boolean s;
    private hvy t;
    final hwm a = new hwm(new ArrayList(2));
    public final sro m = new sro();
    private final AtomicInteger r = new AtomicInteger();

    public hwn(hye hyeVar, hye hyeVar2, hye hyeVar3, hwo hwoVar, hwq hwqVar, dzk dzkVar) {
        this.o = hyeVar;
        this.p = hyeVar2;
        this.q = hyeVar3;
        this.c = hwoVar;
        this.b = hwqVar;
        this.n = dzkVar;
    }

    private final boolean j() {
        return this.i || this.g || this.k;
    }

    public final hye a() {
        return this.s ? this.q : this.p;
    }

    public final synchronized void b(iel ielVar, Executor executor) {
        this.m.a();
        this.a.a.add(new hwl(ielVar, executor));
        if (this.g) {
            d(1);
            executor.execute(new hwk(this, ielVar, 0));
        } else if (!this.i) {
            fxy.g(!this.k, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            d(1);
            executor.execute(new hwk(this, ielVar, 1));
        }
    }

    final void c() {
        hwr hwrVar;
        synchronized (this) {
            this.m.a();
            fxy.g(j(), "Not yet complete!");
            int iDecrementAndGet = this.r.decrementAndGet();
            fxy.g(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                hwrVar = this.j;
                e();
            } else {
                hwrVar = null;
            }
        }
        if (hwrVar != null) {
            hwrVar.f();
        }
    }

    final synchronized void d(int i) {
        hwr hwrVar;
        fxy.g(j(), "Not yet complete!");
        if (this.r.getAndAdd(i) != 0 || (hwrVar = this.j) == null) {
            return;
        }
        hwrVar.d();
    }

    public final synchronized void e() {
        if (this.d == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.d = null;
        this.j = null;
        this.f = null;
        this.i = false;
        this.k = false;
        this.g = false;
        hvy hvyVar = this.t;
        if (hvyVar.t.d()) {
            hvyVar.a();
        }
        this.t = null;
        this.h = null;
        this.l = 0;
        this.n.b(this);
    }

    @Override // defpackage.igd
    public final sro f() {
        return this.m;
    }

    public final synchronized void g(iel ielVar) {
        this.m.a();
        hwl hwlVar = new hwl(ielVar, ifq.b);
        hwm hwmVar = this.a;
        hwmVar.a.remove(hwlVar);
        if (hwmVar.d()) {
            if (!j()) {
                this.k = true;
                hvy hvyVar = this.t;
                hvyVar.o = true;
                hvw hvwVar = hvyVar.n;
                if (hvwVar != null) {
                    hvwVar.a();
                }
                this.c.b(this, this.d);
            }
            if ((this.g || this.i) && this.r.get() == 0) {
                e();
            }
        }
    }

    public final synchronized void h(hvy hvyVar) {
        this.t = hvyVar;
        int iB = hvyVar.b(1);
        ((iB == 2 || iB == 3) ? this.o : a()).execute(hvyVar);
    }

    public final synchronized void i(hui huiVar, boolean z, boolean z2) {
        this.d = huiVar;
        this.e = z;
        this.s = z2;
    }
}
