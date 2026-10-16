package md;

import A7.C0237b0;

/* renamed from: md.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3555x extends AbstractC3538f {
    @Override // md.AbstractC3538f
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // md.AbstractC3538f
    public void b() {
        f().b();
    }

    @Override // md.AbstractC3538f
    public final void c(int i5) {
        f().c(i5);
    }

    @Override // md.AbstractC3538f
    public final void d(Object obj) {
        f().d(obj);
    }

    @Override // md.AbstractC3538f
    public void e(AbstractC3537e abstractC3537e, b0 b0Var) {
        f().e(abstractC3537e, b0Var);
    }

    public abstract AbstractC3538f f();

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(f(), "delegate");
        return c0237b0S.toString();
    }
}
