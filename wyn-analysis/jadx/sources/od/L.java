package od;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import md.C3551t;
import md.InterfaceC3543k;
import td.C4157a;

/* loaded from: classes5.dex */
public class L implements r {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f41621a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3724t f41622b;

    /* renamed from: c, reason: collision with root package name */
    public r f41623c;

    /* renamed from: d, reason: collision with root package name */
    public md.k0 f41624d;

    /* renamed from: f, reason: collision with root package name */
    public K f41626f;

    /* renamed from: g, reason: collision with root package name */
    public long f41627g;

    /* renamed from: h, reason: collision with root package name */
    public long f41628h;

    /* renamed from: e, reason: collision with root package name */
    public List f41625e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f41629i = new ArrayList();

    @Override // od.X1
    public final void a(InterfaceC3543k interfaceC3543k) {
        Fe.e.w("May only be called before start", this.f41622b == null);
        this.f41629i.add(new RunnableC3666A(6, this, interfaceC3543k));
    }

    @Override // od.r
    public final void b(int i5) {
        Fe.e.w("May only be called before start", this.f41622b == null);
        this.f41629i.add(new I(this, i5, 2));
    }

    @Override // od.X1
    public final void c(C4157a c4157a) {
        Fe.e.w("May only be called after start", this.f41622b != null);
        if (this.f41621a) {
            this.f41623c.c(c4157a);
        } else {
            m(new RunnableC3666A(9, this, c4157a));
        }
    }

    @Override // od.X1
    public final void d(int i5) {
        Fe.e.w("May only be called after start", this.f41622b != null);
        if (this.f41621a) {
            this.f41623c.d(i5);
        } else {
            m(new I(this, i5, 0));
        }
    }

    @Override // od.r
    public final void e(int i5) {
        Fe.e.w("May only be called before start", this.f41622b == null);
        this.f41629i.add(new I(this, i5, 1));
    }

    @Override // od.r
    public final void f(md.r rVar) {
        Fe.e.w("May only be called before start", this.f41622b == null);
        this.f41629i.add(new RunnableC3666A(8, this, rVar));
    }

    @Override // od.X1
    public final void flush() {
        Fe.e.w("May only be called after start", this.f41622b != null);
        if (this.f41621a) {
            this.f41623c.flush();
        } else {
            m(new J(this, 2));
        }
    }

    @Override // od.r
    public void g(md.k0 k0Var) {
        boolean z2 = false;
        boolean z10 = true;
        Fe.e.w("May only be called after start", this.f41622b != null);
        Fe.e.t(k0Var, "reason");
        synchronized (this) {
            try {
                r rVar = this.f41623c;
                if (rVar == null) {
                    C3673b1 c3673b1 = C3673b1.f41926a;
                    if (rVar != null) {
                        z10 = false;
                    }
                    Fe.e.y(z10, "realStream already set to %s", rVar);
                    this.f41623c = c3673b1;
                    this.f41628h = System.nanoTime();
                    this.f41624d = k0Var;
                } else {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            m(new RunnableC3666A(10, this, k0Var));
            return;
        }
        n();
        p(k0Var);
        this.f41622b.m(k0Var, EnumC3721s.f42082a, new md.b0());
    }

    @Override // od.X1
    public final void h() {
        Fe.e.w("May only be called before start", this.f41622b == null);
        this.f41629i.add(new J(this, 0));
    }

    @Override // od.r
    public void i(N.J0 j02) {
        synchronized (this) {
            try {
                if (this.f41622b == null) {
                    return;
                }
                if (this.f41623c != null) {
                    j02.c(Long.valueOf(this.f41628h - this.f41627g), "buffered_nanos");
                    this.f41623c.i(j02);
                } else {
                    j02.c(Long.valueOf(System.nanoTime() - this.f41627g), "buffered_nanos");
                    j02.f7714b.add("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // od.X1
    public final boolean isReady() {
        if (this.f41621a) {
            return this.f41623c.isReady();
        }
        return false;
    }

    @Override // od.r
    public final void j() {
        Fe.e.w("May only be called after start", this.f41622b != null);
        m(new J(this, 3));
    }

    @Override // od.r
    public final void k(InterfaceC3724t interfaceC3724t) {
        md.k0 k0Var;
        boolean z2;
        Fe.e.t(interfaceC3724t, "listener");
        Fe.e.w("already started", this.f41622b == null);
        synchronized (this) {
            try {
                k0Var = this.f41624d;
                z2 = this.f41621a;
                if (!z2) {
                    K k = new K(interfaceC3724t);
                    this.f41626f = k;
                    interfaceC3724t = k;
                }
                this.f41622b = interfaceC3724t;
                this.f41627g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (k0Var != null) {
            interfaceC3724t.m(k0Var, EnumC3721s.f42082a, new md.b0());
        } else if (z2) {
            o(interfaceC3724t);
        }
    }

    @Override // od.r
    public final void l(C3551t c3551t) {
        Fe.e.w("May only be called before start", this.f41622b == null);
        Fe.e.t(c3551t, "decompressorRegistry");
        this.f41629i.add(new RunnableC3666A(7, this, c3551t));
    }

    public final void m(Runnable runnable) {
        Fe.e.w("May only be called after start", this.f41622b != null);
        synchronized (this) {
            try {
                if (this.f41621a) {
                    runnable.run();
                } else {
                    this.f41625e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f41625e     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.f41625e = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.f41621a = r0     // Catch: java.lang.Throwable -> L1d
            od.K r0 = r3.f41626f     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.b()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.f41625e     // Catch: java.lang.Throwable -> L1d
            r3.f41625e = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: od.L.n():void");
    }

    public final void o(InterfaceC3724t interfaceC3724t) {
        Iterator it = this.f41629i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f41629i = null;
        this.f41623c.k(interfaceC3724t);
    }

    public final J q(r rVar) {
        synchronized (this) {
            try {
                if (this.f41623c != null) {
                    return null;
                }
                Fe.e.t(rVar, "stream");
                r rVar2 = this.f41623c;
                Fe.e.y(rVar2 == null, "realStream already set to %s", rVar2);
                this.f41623c = rVar;
                this.f41628h = System.nanoTime();
                InterfaceC3724t interfaceC3724t = this.f41622b;
                if (interfaceC3724t == null) {
                    this.f41625e = null;
                    this.f41621a = true;
                }
                if (interfaceC3724t == null) {
                    return null;
                }
                o(interfaceC3724t);
                return new J(this, 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(md.k0 k0Var) {
    }
}
