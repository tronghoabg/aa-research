package Ef;

/* renamed from: Ef.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0512s0 extends AbstractC0509q0 {

    /* renamed from: e, reason: collision with root package name */
    public final z0 f3765e;

    /* renamed from: f, reason: collision with root package name */
    public final t0 f3766f;

    /* renamed from: g, reason: collision with root package name */
    public final r f3767g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3768h;

    public C0512s0(z0 z0Var, t0 t0Var, r rVar, Object obj) {
        this.f3765e = z0Var;
        this.f3766f = t0Var;
        this.f3767g = rVar;
        this.f3768h = obj;
    }

    @Override // Ef.AbstractC0509q0
    public final boolean i() {
        return false;
    }

    @Override // Ef.AbstractC0509q0
    public final void j(Throwable th) {
        r rVar = this.f3767g;
        z0 z0Var = this.f3765e;
        z0Var.getClass();
        r rVarN = z0.N(rVar);
        t0 t0Var = this.f3766f;
        Object obj = this.f3768h;
        if (rVarN == null || !z0Var.X(t0Var, rVarN, obj)) {
            t0Var.f3772a.c(new Jf.h(2), 2);
            r rVarN2 = z0.N(rVar);
            if (rVarN2 == null || !z0Var.X(t0Var, rVarN2, obj)) {
                z0Var.k(z0Var.x(t0Var, obj));
            }
        }
    }
}
