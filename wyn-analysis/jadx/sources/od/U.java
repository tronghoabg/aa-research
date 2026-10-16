package od;

import A7.C0237b0;
import md.C3534b;

/* loaded from: classes5.dex */
public abstract class U implements InterfaceC3739y {
    @Override // od.U0
    public void a(md.k0 k0Var) {
        g().a(k0Var);
    }

    @Override // od.InterfaceC3739y
    public final C3534b b() {
        return g().b();
    }

    @Override // od.U0
    public void d(md.k0 k0Var) {
        g().d(k0Var);
    }

    @Override // od.U0
    public final Runnable e(T0 t02) {
        return g().e(t02);
    }

    @Override // md.E
    public final md.F f() {
        return g().f();
    }

    public abstract InterfaceC3739y g();

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(g(), "delegate");
        return c0237b0S.toString();
    }
}
