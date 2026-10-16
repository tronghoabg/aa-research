package E4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import m9.S;

/* loaded from: classes.dex */
public final class s implements Z4.b {

    /* renamed from: v, reason: collision with root package name */
    public static final S f2955v = new S(16);

    /* renamed from: a, reason: collision with root package name */
    public final r f2956a;

    /* renamed from: b, reason: collision with root package name */
    public final Z4.e f2957b;

    /* renamed from: c, reason: collision with root package name */
    public final o f2958c;

    /* renamed from: d, reason: collision with root package name */
    public final Dd.c f2959d;

    /* renamed from: e, reason: collision with root package name */
    public final S f2960e;

    /* renamed from: f, reason: collision with root package name */
    public final o f2961f;

    /* renamed from: g, reason: collision with root package name */
    public final H4.c f2962g;

    /* renamed from: h, reason: collision with root package name */
    public final H4.c f2963h;

    /* renamed from: i, reason: collision with root package name */
    public final H4.c f2964i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f2965j;
    public t k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2966l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2967m;

    /* renamed from: n, reason: collision with root package name */
    public B f2968n;

    /* renamed from: o, reason: collision with root package name */
    public int f2969o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2970p;

    /* renamed from: q, reason: collision with root package name */
    public w f2971q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2972r;

    /* renamed from: s, reason: collision with root package name */
    public u f2973s;

    /* renamed from: t, reason: collision with root package name */
    public k f2974t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f2975u;

    public s(H4.c cVar, H4.c cVar2, H4.c cVar3, H4.c cVar4, o oVar, o oVar2, Dd.c cVar5) {
        S s10 = f2955v;
        this.f2956a = new r(new ArrayList(2));
        this.f2957b = new Z4.e();
        this.f2965j = new AtomicInteger();
        this.f2962g = cVar;
        this.f2963h = cVar2;
        this.f2964i = cVar4;
        this.f2961f = oVar;
        this.f2958c = oVar2;
        this.f2959d = cVar5;
        this.f2960e = s10;
    }

    public final synchronized void a(U4.d dVar, Y4.g gVar) {
        try {
            this.f2957b.a();
            r rVar = this.f2956a;
            rVar.getClass();
            rVar.f2954a.add(new q(dVar, gVar));
            if (this.f2970p) {
                e(1);
                gVar.execute(new p(this, dVar, 1));
            } else if (this.f2972r) {
                e(1);
                gVar.execute(new p(this, dVar, 0));
            } else {
                gc.b.i("Cannot add callbacks to a cancelled EngineJob", !this.f2975u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.f2975u = true;
        k kVar = this.f2974t;
        kVar.f2899A = true;
        h hVar = kVar.f2926y;
        if (hVar != null) {
            hVar.cancel();
        }
        o oVar = this.f2961f;
        t tVar = this.k;
        synchronized (oVar) {
            y yVar = oVar.f2942a;
            yVar.getClass();
            HashMap map = yVar.f3001a;
            if (equals(map.get(tVar))) {
                map.remove(tVar);
            }
        }
    }

    @Override // Z4.b
    public final Z4.e c() {
        return this.f2957b;
    }

    public final void d() {
        u uVar;
        synchronized (this) {
            try {
                this.f2957b.a();
                gc.b.i("Not yet complete!", f());
                int iDecrementAndGet = this.f2965j.decrementAndGet();
                gc.b.i("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    uVar = this.f2973s;
                    i();
                } else {
                    uVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (uVar != null) {
            uVar.d();
        }
    }

    public final synchronized void e(int i5) {
        u uVar;
        gc.b.i("Not yet complete!", f());
        if (this.f2965j.getAndAdd(i5) == 0 && (uVar = this.f2973s) != null) {
            uVar.c();
        }
    }

    public final boolean f() {
        return this.f2972r || this.f2970p || this.f2975u;
    }

    public final void g() {
        synchronized (this) {
            try {
                this.f2957b.a();
                if (this.f2975u) {
                    i();
                    return;
                }
                if (this.f2956a.f2954a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f2972r) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f2972r = true;
                t tVar = this.k;
                r rVar = this.f2956a;
                rVar.getClass();
                ArrayList arrayList = new ArrayList(rVar.f2954a);
                e(arrayList.size() + 1);
                this.f2961f.e(this, tVar, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    qVar.f2953b.execute(new p(this, qVar.f2952a, 0));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this) {
            try {
                this.f2957b.a();
                if (this.f2975u) {
                    this.f2968n.a();
                    i();
                    return;
                }
                if (this.f2956a.f2954a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f2970p) {
                    throw new IllegalStateException("Already have resource");
                }
                S s10 = this.f2960e;
                B b5 = this.f2968n;
                boolean z2 = this.f2966l;
                t tVar = this.k;
                o oVar = this.f2958c;
                s10.getClass();
                this.f2973s = new u(b5, z2, true, tVar, oVar);
                this.f2970p = true;
                r rVar = this.f2956a;
                rVar.getClass();
                ArrayList arrayList = new ArrayList(rVar.f2954a);
                e(arrayList.size() + 1);
                this.f2961f.e(this, this.k, this.f2973s);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    qVar.f2953b.execute(new p(this, qVar.f2952a, 1));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (this.k == null) {
            throw new IllegalArgumentException();
        }
        this.f2956a.f2954a.clear();
        this.k = null;
        this.f2973s = null;
        this.f2968n = null;
        this.f2972r = false;
        this.f2975u = false;
        this.f2970p = false;
        this.f2974t.m();
        this.f2974t = null;
        this.f2971q = null;
        this.f2969o = 0;
        this.f2959d.O(this);
    }

    public final synchronized void j(U4.d dVar) {
        try {
            this.f2957b.a();
            r rVar = this.f2956a;
            rVar.getClass();
            rVar.f2954a.remove(new q(dVar, Y4.h.f16692b));
            if (this.f2956a.f2954a.isEmpty()) {
                b();
                if (this.f2970p || this.f2972r) {
                    if (this.f2965j.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(k kVar) {
        this.f2974t = kVar;
        int iH = kVar.h(1);
        ((iH == 2 || iH == 3) ? this.f2962g : this.f2967m ? this.f2964i : this.f2963h).execute(kVar);
    }
}
