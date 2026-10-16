package Ef;

import jf.InterfaceC3103c;

/* renamed from: Ef.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0510r0 extends C0502n {

    /* renamed from: i, reason: collision with root package name */
    public final z0 f3764i;

    public C0510r0(z0 z0Var, InterfaceC3103c interfaceC3103c) {
        super(1, interfaceC3103c);
        this.f3764i = z0Var;
    }

    @Override // Ef.C0502n
    public final Throwable r(z0 z0Var) {
        Throwable thC;
        z0 z0Var2 = this.f3764i;
        z0Var2.getClass();
        Object obj = z0.f3793a.get(z0Var2);
        return (!(obj instanceof t0) || (thC = ((t0) obj).c()) == null) ? obj instanceof C0517x ? ((C0517x) obj).f3788a : z0Var.getCancellationException() : thC;
    }

    @Override // Ef.C0502n
    public final String z() {
        return "AwaitContinuation";
    }
}
