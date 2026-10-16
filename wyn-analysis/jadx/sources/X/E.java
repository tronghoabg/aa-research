package X;

import N.C0718d;

/* loaded from: classes.dex */
public final class E extends g {

    /* renamed from: e, reason: collision with root package name */
    public final g f15679e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15680f;

    /* renamed from: g, reason: collision with root package name */
    public final tf.l f15681g;

    public E(g gVar, tf.l lVar, boolean z2) {
        tf.l lVarF;
        super(0, k.f15710e);
        this.f15679e = gVar;
        this.f15680f = z2;
        this.f15681g = m.l(lVar, (gVar == null || (lVarF = gVar.f()) == null) ? ((C1269b) m.f15725i.get()).f15685e : lVarF, false);
        C0718d.y();
    }

    @Override // X.g
    public final void c() {
        g gVar;
        this.f15701c = true;
        if (!this.f15680f || (gVar = this.f15679e) == null) {
            return;
        }
        gVar.c();
    }

    @Override // X.g
    public final int d() {
        return u().d();
    }

    @Override // X.g
    public final k e() {
        return u().e();
    }

    @Override // X.g
    public final tf.l f() {
        return this.f15681g;
    }

    @Override // X.g
    public final boolean g() {
        return u().g();
    }

    @Override // X.g
    public final tf.l i() {
        return null;
    }

    @Override // X.g
    public final void k() {
        q.f();
        throw null;
    }

    @Override // X.g
    public final void l() {
        q.f();
        throw null;
    }

    @Override // X.g
    public final void m() {
        u().m();
    }

    @Override // X.g
    public final void n(y yVar) {
        u().n(yVar);
    }

    @Override // X.g
    public final g t(tf.l lVar) {
        return m.h(u().t(null), m.l(lVar, this.f15681g, true), true);
    }

    public final g u() {
        g gVar = this.f15679e;
        return gVar == null ? (g) m.f15725i.get() : gVar;
    }
}
