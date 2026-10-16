package k2;

import N1.C0773w;

/* loaded from: classes.dex */
public abstract class o0 extends AbstractC3155l {
    public final AbstractC3144a k;

    public o0(AbstractC3144a abstractC3144a) {
        this.k = abstractC3144a;
    }

    public abstract void B(N1.N n10);

    public void C() {
        y(null, this.k);
    }

    @Override // k2.AbstractC3144a
    public final N1.N g() {
        return this.k.g();
    }

    @Override // k2.AbstractC3144a
    public final C0773w h() {
        return this.k.h();
    }

    @Override // k2.AbstractC3144a
    public final boolean i() {
        return this.k.i();
    }

    @Override // k2.AbstractC3144a
    public final void l(S1.A a5) {
        this.f39117j = a5;
        this.f39116i = Q1.x.m(null);
        C();
    }

    @Override // k2.AbstractC3144a
    public void s(C0773w c0773w) {
        this.k.s(c0773w);
    }

    @Override // k2.AbstractC3155l
    public final H t(Object obj, H h10) {
        return z(h10);
    }

    @Override // k2.AbstractC3155l
    public final long u(long j8, Object obj) {
        return j8;
    }

    @Override // k2.AbstractC3155l
    public final int v(int i5, Object obj) {
        return i5;
    }

    @Override // k2.AbstractC3155l
    public final void x(Object obj, AbstractC3144a abstractC3144a, N1.N n10) {
        B(n10);
    }

    public H z(H h10) {
        return h10;
    }
}
