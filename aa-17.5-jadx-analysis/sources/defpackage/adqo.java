package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
final class adqo implements adsh {
    private final adph a;
    private final adqc b;
    private InputStream c;
    private adjr d;

    public adqo(adph adphVar, adqc adqcVar) {
        this.a = adphVar;
        this.b = adqcVar;
    }

    @Override // defpackage.adsh
    public final adis a() {
        throw null;
    }

    @Override // defpackage.adsh
    public final void c(adnq adnqVar) {
        adph adphVar = this.a;
        synchronized (adphVar) {
            adphVar.i(adnqVar);
        }
    }

    @Override // defpackage.adsh
    public final void e() {
        try {
            adqc adqcVar = this.b;
            synchronized (adqcVar) {
                adjr adjrVar = this.d;
                if (adjrVar != null) {
                    adqcVar.c(adjrVar);
                }
                adqcVar.e();
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    adqcVar.d(inputStream);
                }
                adqcVar.f();
                adqcVar.g();
            }
        } catch (adnr e) {
            adph adphVar = this.a;
            synchronized (adphVar) {
                adnq adnqVar = e.a;
                adphVar.h(adnqVar, adnqVar, false);
            }
        }
    }

    @Override // defpackage.adzw
    public final void g(int i) {
        adph adphVar = this.a;
        synchronized (adphVar) {
            adphVar.n(i);
        }
    }

    @Override // defpackage.adsh
    public final void i(adjr adjrVar) {
        this.d = adjrVar;
    }

    @Override // defpackage.adsh
    public final void m(adsj adsjVar) {
        adph adphVar = this.a;
        synchronized (adphVar) {
            adphVar.l(this.b, adsjVar);
        }
        if (this.b.h()) {
            adsjVar.e();
        }
    }

    @Override // defpackage.adzw
    public final void n(InputStream inputStream) {
        if (this.c == null) {
            this.c = inputStream;
            return;
        }
        adph adphVar = this.a;
        synchronized (adphVar) {
            adnq adnqVarE = adnq.l.e("too many messages");
            adphVar.h(adnqVarE, adnqVarE, false);
        }
    }

    @Override // defpackage.adzw
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        adqc adqcVar = this.b;
        return "SingleMessageClientStream[" + this.a.toString() + "/" + adqcVar.toString() + "]";
    }

    @Override // defpackage.adzw
    public final void d() {
    }

    @Override // defpackage.adzw
    public final void f() {
    }

    @Override // defpackage.adsh
    public final void b(aduk adukVar) {
    }

    @Override // defpackage.adzw
    public final void h(adje adjeVar) {
    }

    @Override // defpackage.adsh
    public final void j(adjt adjtVar) {
    }

    @Override // defpackage.adsh
    public final void k(int i) {
    }

    @Override // defpackage.adsh
    public final void l(int i) {
    }
}
