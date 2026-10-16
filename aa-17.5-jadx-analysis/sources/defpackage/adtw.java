package defpackage;

/* loaded from: classes.dex */
abstract class adtw implements adss {
    protected abstract adss a();

    @Override // defpackage.adsk
    public adsh b(admf admfVar, admc admcVar, adiw adiwVar, adjb[] adjbVarArr) {
        throw null;
    }

    @Override // defpackage.adwi
    public final Runnable c(adwh adwhVar) {
        return a().c(adwhVar);
    }

    @Override // defpackage.adkt
    public final adkn e() {
        return a().e();
    }

    @Override // defpackage.adwi
    public void q(adnq adnqVar) {
        a().q(adnqVar);
    }

    @Override // defpackage.adss
    public final adis s() {
        return a().s();
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", a());
        return xxgVarAo.toString();
    }
}
