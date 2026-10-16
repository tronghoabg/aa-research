package com.bumptech.glide.load.a;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak implements com.bumptech.glide.g.a.f {

    /* renamed from: b, reason: collision with root package name */
    aq f3009b;

    /* renamed from: c, reason: collision with root package name */
    ao f3010c;

    /* renamed from: d, reason: collision with root package name */
    int f3011d;

    /* renamed from: f, reason: collision with root package name */
    private final an f3013f;

    /* renamed from: g, reason: collision with root package name */
    private final Pools.Pool f3014g;

    /* renamed from: h, reason: collision with root package name */
    private final al f3015h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.a.c.f f3016i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.a.c.f f3017j;

    /* renamed from: k, reason: collision with root package name */
    private final com.bumptech.glide.load.a.c.f f3018k;
    private com.bumptech.glide.load.o m;
    private boolean n;
    private boolean o;
    private aw p;
    private boolean q;
    private boolean r;
    private r s;
    private volatile boolean t;

    /* renamed from: a, reason: collision with root package name */
    final aj f3008a = new aj(new ArrayList(2));

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.g.a.i f3012e = com.bumptech.glide.g.a.i.a();

    /* renamed from: l, reason: collision with root package name */
    private final AtomicInteger f3019l = new AtomicInteger();

    ak(com.bumptech.glide.load.a.c.f fVar, com.bumptech.glide.load.a.c.f fVar2, com.bumptech.glide.load.a.c.f fVar3, al alVar, an anVar, Pools.Pool pool) {
        this.f3016i = fVar;
        this.f3017j = fVar2;
        this.f3018k = fVar3;
        this.f3015h = alVar;
        this.f3013f = anVar;
        this.f3014g = pool;
    }

    private final com.bumptech.glide.load.a.c.f k() {
        return this.o ? this.f3018k : this.f3017j;
    }

    private final synchronized void l() {
        if (this.m == null) {
            throw new IllegalArgumentException();
        }
        this.f3008a.d();
        this.m = null;
        this.f3010c = null;
        this.p = null;
        this.r = false;
        this.t = false;
        this.q = false;
        this.s.i();
        this.s = null;
        this.f3009b = null;
        this.f3011d = 0;
        this.f3014g.release(this);
    }

    private final boolean m() {
        return this.r || this.q || this.t;
    }

    final synchronized void b(com.bumptech.glide.e.j jVar, Executor executor) {
        this.f3012e.c();
        this.f3008a.c(jVar, executor);
        if (this.q) {
            d(1);
            executor.execute(new ah(this, jVar));
        } else if (!this.r) {
            com.bumptech.glide.g.p.b(!this.t, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            d(1);
            executor.execute(new ag(this, jVar));
        }
    }

    @Override // com.bumptech.glide.g.a.f
    public final com.bumptech.glide.g.a.i bl() {
        return this.f3012e;
    }

    final void c() {
        ao aoVar;
        synchronized (this) {
            this.f3012e.c();
            com.bumptech.glide.g.p.b(m(), "Not yet complete!");
            int iDecrementAndGet = this.f3019l.decrementAndGet();
            com.bumptech.glide.g.p.b(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                aoVar = this.f3010c;
                l();
            } else {
                aoVar = null;
            }
        }
        if (aoVar != null) {
            aoVar.f();
        }
    }

    final synchronized void d(int i2) {
        ao aoVar;
        com.bumptech.glide.g.p.b(m(), "Not yet complete!");
        if (this.f3019l.getAndAdd(i2) != 0 || (aoVar = this.f3010c) == null) {
            return;
        }
        aoVar.d();
    }

    final void e() {
        synchronized (this) {
            this.f3012e.c();
            if (this.t) {
                l();
                return;
            }
            aj ajVar = this.f3008a;
            if (ajVar.g()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.r) {
                throw new IllegalStateException("Already failed once");
            }
            this.r = true;
            com.bumptech.glide.load.o oVar = this.m;
            aj ajVarB = ajVar.b();
            d(ajVarB.a() + 1);
            this.f3015h.b(this, oVar, null);
            Iterator<ai> it = ajVarB.iterator();
            while (it.hasNext()) {
                ai next = it.next();
                next.f3006b.execute(new ag(this, next.f3005a));
            }
            c();
        }
    }

    final synchronized void f(com.bumptech.glide.e.j jVar) {
        this.f3012e.c();
        aj ajVar = this.f3008a;
        ajVar.e(jVar);
        if (ajVar.g()) {
            if (!m()) {
                this.t = true;
                this.s.c();
                this.f3015h.a(this, this.m);
            }
            if ((this.q || this.r) && this.f3019l.get() == 0) {
                l();
            }
        }
    }

    public final void g(r rVar) {
        k().execute(rVar);
    }

    public final synchronized void h(r rVar) {
        this.s = rVar;
        (rVar.f() ? this.f3016i : k()).execute(rVar);
    }

    final synchronized void i(com.bumptech.glide.load.o oVar, boolean z, boolean z2) {
        this.m = oVar;
        this.n = z;
        this.o = z2;
    }

    public final void j(aw awVar, int i2) {
        synchronized (this) {
            this.p = awVar;
            this.f3011d = i2;
        }
        synchronized (this) {
            this.f3012e.c();
            if (this.t) {
                this.p.e();
                l();
                return;
            }
            aj ajVar = this.f3008a;
            if (ajVar.g()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.q) {
                throw new IllegalStateException("Already have resource");
            }
            this.f3010c = new ao(this.p, this.n, this.m, this.f3013f);
            this.q = true;
            aj ajVarB = ajVar.b();
            d(ajVarB.a() + 1);
            this.f3015h.b(this, this.m, this.f3010c);
            Iterator<ai> it = ajVarB.iterator();
            while (it.hasNext()) {
                ai next = it.next();
                next.f3006b.execute(new ah(this, next.f3005a));
            }
            c();
        }
    }
}
