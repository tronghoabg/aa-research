package od;

import md.AbstractC3537e;

/* loaded from: classes5.dex */
public final class F0 extends AbstractC3537e {

    /* renamed from: d, reason: collision with root package name */
    public final E0 f41555d;

    /* renamed from: e, reason: collision with root package name */
    public final L1 f41556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M0 f41557f;

    public F0(M0 m02, E0 e02, L1 l12) {
        this.f41557f = m02;
        this.f41555d = e02;
        Fe.e.t(l12, "resolver");
        this.f41556e = l12;
    }

    @Override // md.AbstractC3537e
    public final void j(md.k0 k0Var) {
        Fe.e.p("the error status must not be OK", !k0Var.f());
        this.f41557f.f41692m.execute(new RunnableC3666A(16, this, k0Var));
    }

    @Override // md.AbstractC3537e
    public final void n(md.e0 e0Var) {
        this.f41557f.f41692m.execute(new RunnableC3666A(17, this, e0Var));
    }
}
