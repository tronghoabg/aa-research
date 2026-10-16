package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
abstract class adtu implements adsh {
    @Override // defpackage.adsh
    public final adis a() {
        throw null;
    }

    @Override // defpackage.adsh
    public final void b(aduk adukVar) {
        p().b(adukVar);
    }

    @Override // defpackage.adsh
    public final void c(adnq adnqVar) {
        p().c(adnqVar);
    }

    @Override // defpackage.adzw
    public final void d() {
        p().d();
    }

    @Override // defpackage.adsh
    public final void e() {
        p().e();
    }

    @Override // defpackage.adzw
    public final void f() {
        p().f();
    }

    @Override // defpackage.adzw
    public final void g(int i) {
        p().g(i);
    }

    @Override // defpackage.adzw
    public final void h(adje adjeVar) {
        p().h(adjeVar);
    }

    @Override // defpackage.adsh
    public final void i(adjr adjrVar) {
        p().i(adjrVar);
    }

    @Override // defpackage.adsh
    public final void j(adjt adjtVar) {
        p().j(adjtVar);
    }

    @Override // defpackage.adsh
    public final void k(int i) {
        p().k(i);
    }

    @Override // defpackage.adsh
    public final void l(int i) {
        p().l(i);
    }

    @Override // defpackage.adsh
    public void m(adsj adsjVar) {
        throw null;
    }

    @Override // defpackage.adzw
    public final void n(InputStream inputStream) {
        p().n(inputStream);
    }

    @Override // defpackage.adzw
    public final boolean o() {
        return p().o();
    }

    protected abstract adsh p();

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", p());
        return xxgVarAo.toString();
    }
}
