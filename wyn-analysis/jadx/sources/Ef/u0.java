package Ef;

import ef.C2515C;

/* loaded from: classes5.dex */
public final class u0 extends AbstractC0509q0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3773e;

    /* renamed from: f, reason: collision with root package name */
    public final Mf.i f3774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z0 f3775g;

    public /* synthetic */ u0(z0 z0Var, Mf.i iVar, int i5) {
        this.f3773e = i5;
        this.f3775g = z0Var;
        this.f3774f = iVar;
    }

    @Override // Ef.AbstractC0509q0
    public final boolean i() {
        switch (this.f3773e) {
        }
        return false;
    }

    @Override // Ef.AbstractC0509q0
    public final void j(Throwable th) {
        switch (this.f3773e) {
            case 0:
                z0 z0Var = this.f3775g;
                z0Var.getClass();
                Object objN = z0.f3793a.get(z0Var);
                if (!(objN instanceof C0517x)) {
                    objN = H.N(objN);
                }
                ((Mf.h) this.f3774f).g(z0Var, objN);
                break;
            default:
                ((Mf.h) this.f3774f).g(this.f3775g, C2515C.f34653a);
                break;
        }
    }
}
