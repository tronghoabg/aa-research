package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class advs extends defpackage.aduw {
    public final defpackage.adsx a;
    private final adtt b;

    public advs(adtt adttVar, defpackage.adsx adsxVar) {
        this.b = adttVar;
        this.a = adsxVar;
    }

    @Override // defpackage.aduw
    protected final adtt a() {
        return this.b;
    }

    @Override // defpackage.aduw
    public final adti b(defpackage.adng adngVar, defpackage.adnd adndVar, defpackage.adjw adjwVar, defpackage.adkb[] adkbVarArr) {
        return new advr(this, this.b.b(adngVar, adndVar, adjwVar, adkbVarArr));
    }
}
