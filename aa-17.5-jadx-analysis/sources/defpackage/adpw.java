package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
final class adpw implements adsh {
    private final adph a;
    private final adqc b;

    public adpw(adph adphVar, adqc adqcVar) {
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
        adqc adqcVar = this.b;
        synchronized (adqcVar) {
            adqcVar.c(adjrVar);
        }
    }

    @Override // defpackage.adsh
    public final void m(adsj adsjVar) {
        adph adphVar = this.a;
        synchronized (adphVar) {
            adphVar.l(this.b, adsjVar);
        }
        adqc adqcVar = this.b;
        if (adqcVar.h()) {
            adsjVar.e();
        }
        try {
            synchronized (adqcVar) {
                adqcVar.e();
                adqcVar.g();
            }
        } catch (adnr e) {
            adph adphVar2 = this.a;
            synchronized (adphVar2) {
                adnq adnqVar = e.a;
                adphVar2.h(adnqVar, adnqVar, false);
            }
        }
    }

    @Override // defpackage.adzw
    public final void n(InputStream inputStream) {
        try {
            adqc adqcVar = this.b;
            synchronized (adqcVar) {
                adqcVar.d(inputStream);
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
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        adqc adqcVar = this.b;
        return "MultiMessageClientStream[" + this.a.toString() + "/" + adqcVar.toString() + "]";
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
