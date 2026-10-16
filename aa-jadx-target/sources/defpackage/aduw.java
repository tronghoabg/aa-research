package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class aduw implements adtt {
    protected abstract adtt a();

    public adti b(defpackage.adng adngVar, defpackage.adnd adndVar, defpackage.adjw adjwVar, defpackage.adkb[] adkbVarArr) {
        throw null;
    }

    public final java.lang.Runnable c(adxi adxiVar) {
        return a().c(adxiVar);
    }

    public final defpackage.adlo e() {
        return a().e();
    }

    public void q(defpackage.ador adorVar) {
        a().q(adorVar);
    }

    public final defpackage.adjs s() {
        return a().s();
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("delegate", a());
        return xymVarBy.toString();
    }
}
