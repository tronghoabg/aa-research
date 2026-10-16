package defpackage;

/* loaded from: classes3.dex */
abstract class adtv implements adsj {
    @Override // defpackage.adsj
    public void a(adnq adnqVar, adsi adsiVar, admc admcVar) {
        throw null;
    }

    protected abstract adsj b();

    @Override // defpackage.adsj
    public final void c(admc admcVar) {
        b().c(admcVar);
    }

    @Override // defpackage.adzy
    public final void d(adzx adzxVar) {
        b().d(adzxVar);
    }

    @Override // defpackage.adzy
    public final void e() {
        b().e();
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", b());
        return xxgVarAo.toString();
    }
}
