package e.a.d;

import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
abstract class cv implements af {
    cv() {
    }

    @Override // e.a.d.af
    public final e.a.c a() {
        throw null;
    }

    @Override // e.a.d.af
    public final void b(dn dnVar) {
        p().b(dnVar);
    }

    @Override // e.a.d.af
    public final void c(e.a.ee eeVar) {
        p().c(eeVar);
    }

    @Override // e.a.d.ju
    public final void d() {
        p().d();
    }

    @Override // e.a.d.af
    public final void e() {
        p().e();
    }

    @Override // e.a.d.ju
    public final void f() {
        p().f();
    }

    @Override // e.a.d.ju
    public final void g(int i2) {
        p().g(i2);
    }

    @Override // e.a.d.ju
    public final void h(e.a.s sVar) {
        p().h(sVar);
    }

    @Override // e.a.d.af
    public final void i(e.a.ad adVar) {
        p().i(adVar);
    }

    @Override // e.a.d.af
    public final void j(e.a.ag agVar) {
        p().j(agVar);
    }

    @Override // e.a.d.af
    public final void k(int i2) {
        p().k(i2);
    }

    @Override // e.a.d.af
    public final void l(int i2) {
        p().l(i2);
    }

    @Override // e.a.d.af
    public void m(ah ahVar) {
        throw null;
    }

    @Override // e.a.d.ju
    public final void n(InputStream inputStream) {
        p().n(inputStream);
    }

    @Override // e.a.d.ju
    public final boolean o() {
        return p().o();
    }

    protected abstract af p();

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("delegate", p());
        return zVarH.toString();
    }
}
