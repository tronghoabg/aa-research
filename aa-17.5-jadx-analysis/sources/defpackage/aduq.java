package defpackage;

/* loaded from: classes3.dex */
final class aduq extends adtu {
    final /* synthetic */ adsh a;
    final /* synthetic */ adur b;

    public aduq(adur adurVar, adsh adshVar) {
        this.a = adshVar;
        this.b = adurVar;
    }

    @Override // defpackage.adtu, defpackage.adsh
    public final void m(adsj adsjVar) {
        this.b.a.b();
        this.a.m(new adup(this, adsjVar));
    }

    @Override // defpackage.adtu
    protected final adsh p() {
        return this.a;
    }
}
