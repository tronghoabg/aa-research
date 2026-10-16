package defpackage;

/* loaded from: classes3.dex */
final class adts extends adli {
    final /* synthetic */ adtt f;
    private final adla g;

    public adts(adtt adttVar, adla adlaVar) {
        this.f = adttVar;
        this.g = adlaVar;
    }

    @Override // defpackage.adli
    public final adnq a(adle adleVar) {
        adla adlaVar = this.g;
        adtt adttVar = this.f;
        adlaVar.f(adttVar.a, adttVar.b);
        return adttVar.c;
    }

    @Override // defpackage.adli
    public final void b(adnq adnqVar) {
        adla adlaVar = this.g;
        adtt adttVar = this.f;
        adlaVar.f(adttVar.a, adttVar.b);
    }

    @Override // defpackage.adli
    public final void d() {
    }
}
