package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adur implements adtl {
    final defpackage.ador a;
    private final defpackage.adtj b;

    public adur(defpackage.ador adorVar, defpackage.adtj adtjVar) {
        defpackage.ysr.aY(!adorVar.g(), "error must not be OK");
        this.a = adorVar;
        this.b = adtjVar;
    }

    public final adti b(defpackage.adng adngVar, defpackage.adnd adndVar, defpackage.adjw adjwVar, defpackage.adkb[] adkbVarArr) {
        return new defpackage.aduq(this.a, this.b, adkbVarArr);
    }

    public final defpackage.adlo e() {
        throw new java.lang.UnsupportedOperationException("Not a real transport");
    }
}
