package defpackage;

/* loaded from: classes.dex */
final class adtr implements adsk {
    final adnq a;
    private final adsi b;

    public adtr(adnq adnqVar, adsi adsiVar) {
        woy.O(!adnqVar.g(), "error must not be OK");
        this.a = adnqVar;
        this.b = adsiVar;
    }

    @Override // defpackage.adsk
    public final adsh b(admf admfVar, admc admcVar, adiw adiwVar, adjb[] adjbVarArr) {
        return new adtq(this.a, this.b, adjbVarArr);
    }

    @Override // defpackage.adkt
    public final adkn e() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
