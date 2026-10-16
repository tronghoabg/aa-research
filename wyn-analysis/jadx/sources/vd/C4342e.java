package vd;

import A7.C0237b0;
import md.EnumC3545m;
import md.L;
import md.M;
import md.O;
import md.P;
import md.k0;
import od.C3680e;

/* renamed from: vd.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4342e extends O {

    /* renamed from: o, reason: collision with root package name */
    public static final C3680e f47163o = new C3680e(1);

    /* renamed from: f, reason: collision with root package name */
    public final C4340c f47164f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC4338a f47165g;

    /* renamed from: h, reason: collision with root package name */
    public P f47166h;

    /* renamed from: i, reason: collision with root package name */
    public O f47167i;

    /* renamed from: j, reason: collision with root package name */
    public P f47168j;
    public O k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC3545m f47169l;

    /* renamed from: m, reason: collision with root package name */
    public M f47170m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f47171n;

    public C4342e(AbstractC4338a abstractC4338a) {
        C4340c c4340c = new C4340c(this);
        this.f47164f = c4340c;
        this.f47167i = c4340c;
        this.k = c4340c;
        this.f47165g = abstractC4338a;
    }

    @Override // md.O
    public final boolean b() {
        return g().b();
    }

    @Override // md.O
    public final void c(k0 k0Var) {
        g().c(k0Var);
    }

    @Override // md.O
    public final void d(L l10) {
        g().d(l10);
    }

    @Override // md.O
    public final void e() {
        g().e();
    }

    @Override // md.O
    public final void f() {
        this.k.f();
        this.f47167i.f();
    }

    public final O g() {
        O o7 = this.k;
        return o7 == this.f47164f ? this.f47167i : o7;
    }

    public final void h() {
        this.f47165g.l(this.f47169l, this.f47170m);
        this.f47167i.f();
        this.f47167i = this.k;
        this.f47166h = this.f47168j;
        this.k = this.f47164f;
        this.f47168j = null;
    }

    public final void i(P p10) {
        Fe.e.t(p10, "newBalancerFactory");
        if (p10.equals(this.f47168j)) {
            return;
        }
        this.k.f();
        this.k = this.f47164f;
        this.f47168j = null;
        this.f47169l = EnumC3545m.f40692a;
        this.f47170m = f47163o;
        if (p10.equals(this.f47166h)) {
            return;
        }
        C4341d c4341d = new C4341d(this);
        O oB = p10.b(c4341d);
        c4341d.f47161b = oB;
        this.k = oB;
        this.f47168j = p10;
        if (this.f47171n) {
            return;
        }
        h();
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(g(), "delegate");
        return c0237b0S.toString();
    }
}
