package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
final class adpx implements adzj {
    private final adpi a;
    private final adqd b;
    private final adis c;

    public adpx(adpi adpiVar, adqd adqdVar, adis adisVar) {
        this.a = adpiVar;
        this.b = adqdVar;
        this.c = adisVar;
    }

    @Override // defpackage.adzj
    public final adis a() {
        return this.c;
    }

    @Override // defpackage.adzj
    public final adzv b() {
        return this.b.f;
    }

    @Override // defpackage.adzj
    public final void c(adnq adnqVar) {
        adpi adpiVar = this.a;
        synchronized (adpiVar) {
            adpiVar.i(adnqVar);
        }
    }

    @Override // defpackage.adzj
    public final void e(adnq adnqVar, admc admcVar) {
        try {
            adqd adqdVar = this.b;
            synchronized (adqdVar) {
                if (adqdVar.b == null) {
                    woy.Z(adqdVar.c == null);
                    adqdVar.b = adnqVar;
                    adqdVar.c = admcVar;
                    adqdVar.e();
                    adqdVar.f();
                    adqdVar.g();
                }
            }
            adpi adpiVar = this.a;
            synchronized (adpiVar) {
                adpiVar.f();
            }
        } catch (adnr e) {
            adpi adpiVar2 = this.a;
            synchronized (adpiVar2) {
                adnq adnqVar2 = e.a;
                adpiVar2.h(adnqVar2, adnqVar2, false);
            }
        }
    }

    @Override // defpackage.adzw
    public final void g(int i) {
        adpi adpiVar = this.a;
        synchronized (adpiVar) {
            adpiVar.n(2);
        }
    }

    @Override // defpackage.adzj
    public final void i(adzk adzkVar) {
        adpi adpiVar = this.a;
        synchronized (adpiVar) {
            adpiVar.l(this.b, adzkVar);
        }
    }

    @Override // defpackage.adzj
    public final void j(admc admcVar) {
        try {
            adqd adqdVar = this.b;
            synchronized (adqdVar) {
                adqdVar.a = admcVar;
                adqdVar.e();
                adqdVar.g();
            }
        } catch (adnr e) {
            adpi adpiVar = this.a;
            synchronized (adpiVar) {
                adnq adnqVar = e.a;
                adpiVar.h(adnqVar, adnqVar, false);
            }
        }
    }

    @Override // defpackage.adzj
    public final void k() {
    }

    @Override // defpackage.adzw
    public final void n(InputStream inputStream) {
        try {
            adqd adqdVar = this.b;
            synchronized (adqdVar) {
                adqdVar.d(inputStream);
                adqdVar.g();
            }
        } catch (adnr e) {
            adpi adpiVar = this.a;
            synchronized (adpiVar) {
                adnq adnqVar = e.a;
                adpiVar.h(adnqVar, adnqVar, false);
            }
        }
    }

    @Override // defpackage.adzw
    public final boolean o() {
        throw null;
    }

    public final String toString() {
        adqd adqdVar = this.b;
        return "MultiMessageServerStream[" + this.a.toString() + "/" + adqdVar.toString() + "]";
    }

    @Override // defpackage.adzw
    public final void d() {
    }

    @Override // defpackage.adzw
    public final void f() {
    }

    @Override // defpackage.adzw
    public final void h(adje adjeVar) {
    }
}
