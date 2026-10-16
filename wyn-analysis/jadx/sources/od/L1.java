package od;

import A7.C0237b0;
import kd.RunnableC3307c;
import md.AbstractC3537e;
import md.AbstractC3556y;
import md.C3533a;

/* loaded from: classes5.dex */
public final class L1 extends AbstractC3556y {

    /* renamed from: d, reason: collision with root package name */
    public static final C3533a f41639d = new C3533a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3556y f41640a;

    /* renamed from: b, reason: collision with root package name */
    public final C3689h f41641b;

    /* renamed from: c, reason: collision with root package name */
    public final md.n0 f41642c;

    public L1(O o7, C3689h c3689h, md.n0 n0Var) {
        this.f41640a = o7;
        this.f41641b = c3689h;
        this.f41642c = n0Var;
    }

    @Override // md.AbstractC3556y
    public String f() {
        return this.f41640a.f();
    }

    @Override // md.AbstractC3556y
    public final void h() {
        this.f41640a.h();
    }

    @Override // md.AbstractC3556y
    public final void j() {
        this.f41640a.j();
        C3689h c3689h = this.f41641b;
        md.n0 n0Var = c3689h.f41967b;
        n0Var.e();
        n0Var.execute(new RunnableC3307c(c3689h, 2));
    }

    @Override // md.AbstractC3556y
    public final void k(AbstractC3537e abstractC3537e) {
        this.f41640a.k(new K1(this, abstractC3537e));
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f41640a, "delegate");
        return c0237b0S.toString();
    }
}
