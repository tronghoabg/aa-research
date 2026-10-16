package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
final class adqp implements adzj {
    private final adpi a;
    private final adqd b;
    private final adis c;
    private admc d;
    private InputStream e;

    public adqp(adpi adpiVar, adqd adqdVar, adis adisVar) {
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
                admc admcVar2 = this.d;
                InputStream inputStream = this.e;
                if (adqdVar.b == null) {
                    if (admcVar2 != null) {
                        adqdVar.a = admcVar2;
                    }
                    adqdVar.e();
                    if (inputStream != null) {
                        adqdVar.d(inputStream);
                    }
                    woy.Z(adqdVar.c == null);
                    adqdVar.b = adnqVar;
                    adqdVar.c = admcVar;
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
        this.d = admcVar;
    }

    @Override // defpackage.adzj
    public final void k() {
    }

    @Override // defpackage.adzw
    public final void n(InputStream inputStream) {
        if (this.e == null) {
            this.e = inputStream;
            return;
        }
        adpi adpiVar = this.a;
        synchronized (adpiVar) {
            adnq adnqVarE = adnq.l.e("too many messages");
            adpiVar.h(adnqVarE, adnqVarE, false);
        }
    }

    @Override // defpackage.adzw
    public final boolean o() {
        throw null;
    }

    public final String toString() {
        adqd adqdVar = this.b;
        return "SingleMessageServerStream[" + this.a.toString() + "/" + adqdVar.toString() + "]";
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
