package X;

import N.C0718d;
import x.C4425r;

/* loaded from: classes.dex */
public final class D extends C1270c {

    /* renamed from: o, reason: collision with root package name */
    public final C1270c f15673o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f15674p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15675q;

    /* renamed from: r, reason: collision with root package name */
    public tf.l f15676r;

    /* renamed from: s, reason: collision with root package name */
    public tf.l f15677s;

    /* renamed from: t, reason: collision with root package name */
    public final long f15678t;

    public D(C1270c c1270c, tf.l lVar, tf.l lVar2, boolean z2, boolean z10) {
        tf.l lVarI;
        tf.l lVarX;
        super(0, k.f15710e, m.l(lVar, (c1270c == null || (lVarX = c1270c.f()) == null) ? ((C1269b) m.f15725i.get()).f15685e : lVarX, z2), m.b(lVar2, (c1270c == null || (lVarI = c1270c.i()) == null) ? ((C1269b) m.f15725i.get()).f15686f : lVarI));
        this.f15673o = c1270c;
        this.f15674p = z2;
        this.f15675q = z10;
        this.f15676r = this.f15685e;
        this.f15677s = this.f15686f;
        this.f15678t = C0718d.y();
    }

    @Override // X.C1270c
    public final void B(C4425r c4425r) {
        q.f();
        throw null;
    }

    @Override // X.C1270c
    public final C1270c C(tf.l lVar, tf.l lVar2) {
        tf.l lVarL = m.l(lVar, this.f15676r, true);
        tf.l lVarB = m.b(lVar2, this.f15677s);
        return !this.f15674p ? new D(D().C(null, lVarB), lVarL, lVarB, false, true) : D().C(lVarL, lVarB);
    }

    public final C1270c D() {
        C1270c c1270c = this.f15673o;
        return c1270c == null ? (C1270c) m.f15725i.get() : c1270c;
    }

    @Override // X.C1270c, X.g
    public final void c() {
        C1270c c1270c;
        this.f15701c = true;
        if (!this.f15675q || (c1270c = this.f15673o) == null) {
            return;
        }
        c1270c.c();
    }

    @Override // X.g
    public final int d() {
        return D().d();
    }

    @Override // X.g
    public final k e() {
        return D().e();
    }

    @Override // X.C1270c, X.g
    public final tf.l f() {
        return this.f15676r;
    }

    @Override // X.C1270c, X.g
    public final boolean g() {
        return D().g();
    }

    @Override // X.C1270c, X.g
    public final int h() {
        return D().h();
    }

    @Override // X.C1270c, X.g
    public final tf.l i() {
        return this.f15677s;
    }

    @Override // X.C1270c, X.g
    public final void k() {
        q.f();
        throw null;
    }

    @Override // X.C1270c, X.g
    public final void l() {
        q.f();
        throw null;
    }

    @Override // X.C1270c, X.g
    public final void m() {
        D().m();
    }

    @Override // X.C1270c, X.g
    public final void n(y yVar) {
        D().n(yVar);
    }

    @Override // X.g
    public final void q(int i5) {
        q.f();
        throw null;
    }

    @Override // X.g
    public final void r(k kVar) {
        q.f();
        throw null;
    }

    @Override // X.C1270c, X.g
    public final void s(int i5) {
        D().s(i5);
    }

    @Override // X.C1270c, X.g
    public final g t(tf.l lVar) {
        tf.l lVarL = m.l(lVar, this.f15676r, true);
        return !this.f15674p ? m.h(D().t(null), lVarL, true) : D().t(lVarL);
    }

    @Override // X.C1270c
    public final q v() {
        return D().v();
    }

    @Override // X.C1270c
    public final C4425r w() {
        return D().w();
    }

    @Override // X.C1270c
    /* renamed from: x */
    public final tf.l f() {
        return this.f15676r;
    }
}
