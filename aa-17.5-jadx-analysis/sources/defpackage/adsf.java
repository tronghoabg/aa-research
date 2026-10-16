package defpackage;

/* loaded from: classes.dex */
final class adsf implements adsj {
    public adnq a;
    final /* synthetic */ adsg b;
    public final adqq c;

    public adsf(adsg adsgVar, adqq adqqVar) {
        this.b = adsgVar;
        this.c = adqqVar;
    }

    @Override // defpackage.adsj
    public final void a(adnq adnqVar, adsi adsiVar, admc admcVar) {
        int i = aeeb.a;
        adsg adsgVar = this.b;
        adjr adjrVarK = adsgVar.k();
        if (adnqVar.p == adnn.CANCELLED && adjrVarK != null && adjrVarK.f()) {
            adnqVar = adsgVar.f.b();
            admcVar = new admc();
        }
        adsgVar.c.execute(new adsd(this, adnqVar, admcVar));
    }

    public final void b(adnq adnqVar) {
        this.a = adnqVar;
        this.b.h.c(adnqVar);
    }

    @Override // defpackage.adsj
    public final void c(admc admcVar) {
        int i = aeeb.a;
        this.b.c.execute(new adsb(this, admcVar));
    }

    @Override // defpackage.adzy
    public final void d(adzx adzxVar) {
        int i = aeeb.a;
        this.b.c.execute(new adsc(this, adzxVar));
    }

    @Override // defpackage.adzy
    public final void e() {
        adsg adsgVar = this.b;
        if (adsgVar.b.a.a()) {
            return;
        }
        int i = aeeb.a;
        adsgVar.c.execute(new adse(this));
    }
}
