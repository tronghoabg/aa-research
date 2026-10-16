package od;

import md.AbstractC3541i;
import md.C3542j;
import md.C3550s;
import md.C3551t;
import md.InterfaceC3543k;

/* renamed from: od.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3668a {

    /* renamed from: a, reason: collision with root package name */
    public W0 f41870a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41871b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final a2 f41872c;

    /* renamed from: d, reason: collision with root package name */
    public final W0 f41873d;

    /* renamed from: e, reason: collision with root package name */
    public int f41874e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41875f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41876g;

    /* renamed from: h, reason: collision with root package name */
    public final W1 f41877h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41878i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC3724t f41879j;
    public C3551t k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41880l;

    /* renamed from: m, reason: collision with root package name */
    public A7.W0 f41881m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f41882n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41883o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f41884p;

    public AbstractC3668a(int i5, W1 w12, a2 a2Var) {
        Fe.e.t(a2Var, "transportTracer");
        this.f41872c = a2Var;
        W0 w02 = new W0(this, i5, w12, a2Var);
        this.f41873d = w02;
        this.f41870a = w02;
        this.k = C3551t.f40724d;
        this.f41880l = false;
        this.f41877h = w12;
    }

    public abstract void a(int i5);

    public final void b(md.k0 k0Var, EnumC3721s enumC3721s, md.b0 b0Var) {
        if (this.f41878i) {
            return;
        }
        this.f41878i = true;
        W1 w12 = this.f41877h;
        if (w12.f41843b.compareAndSet(false, true)) {
            for (AbstractC3541i abstractC3541i : w12.f41842a) {
                abstractC3541i.m(k0Var);
            }
        }
        if (this.f41872c != null) {
            k0Var.f();
        }
        this.f41879j.m(k0Var, enumC3721s, b0Var);
    }

    public abstract void c(boolean z2);

    public final void d(md.b0 b0Var) {
        Fe.e.w("Received headers on closed stream", !this.f41883o);
        for (AbstractC3541i abstractC3541i : this.f41877h.f41842a) {
            abstractC3541i.b();
        }
        C3542j c3542j = C3542j.f40651b;
        String str = (String) b0Var.c(AbstractC3669a0.f41888d);
        if (str != null) {
            C3550s c3550s = (C3550s) this.k.f40725a.get(str);
            InterfaceC3543k interfaceC3543k = c3550s != null ? c3550s.f40721a : null;
            if (interfaceC3543k == null) {
                ((pd.j) this).n(md.k0.f40681m.h("Can't find decompressor for ".concat(str)).a());
                return;
            } else if (interfaceC3543k != c3542j) {
                W0 w02 = this.f41870a;
                w02.getClass();
                Fe.e.w("Already set full stream decompressor", true);
                w02.f41829e = interfaceC3543k;
            }
        }
        this.f41879j.f(b0Var);
    }

    public final boolean e() {
        boolean z2;
        synchronized (this.f41871b) {
            try {
                z2 = this.f41875f && this.f41874e < 32768 && !this.f41876g;
            } finally {
            }
        }
        return z2;
    }

    public final void f() {
        boolean zE;
        synchronized (this.f41871b) {
            zE = e();
        }
        if (zE) {
            this.f41879j.h();
        }
    }

    public final void g(md.k0 k0Var, EnumC3721s enumC3721s, boolean z2, md.b0 b0Var) throws Throwable {
        Fe.e.t(k0Var, "status");
        if (!this.f41883o || z2) {
            this.f41883o = true;
            this.f41884p = k0Var.f();
            synchronized (this.f41871b) {
                try {
                    this.f41876g = true;
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            if (this.f41880l) {
                this.f41881m = null;
                b(k0Var, enumC3721s, b0Var);
                return;
            }
            this.f41881m = new A7.W0(this, k0Var, enumC3721s, b0Var, 20);
            if (z2) {
                this.f41870a.close();
                return;
            }
            W0 w02 = this.f41870a;
            if (w02.isClosed()) {
                return;
            }
            if (w02.f41835l.f42123c == 0) {
                w02.close();
            } else {
                w02.f41840q = true;
            }
        }
    }

    public final void h(md.k0 k0Var, boolean z2, md.b0 b0Var) throws Throwable {
        g(k0Var, EnumC3721s.f42082a, z2, b0Var);
    }
}
