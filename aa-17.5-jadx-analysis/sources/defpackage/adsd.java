package defpackage;

/* loaded from: classes.dex */
final class adsd extends adsu {
    final /* synthetic */ adnq a;
    final /* synthetic */ admc b;
    final /* synthetic */ adsf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adsd(adsf adsfVar, adnq adnqVar, admc admcVar) {
        super(adsfVar.b.e);
        this.a = adnqVar;
        this.b = admcVar;
        this.c = adsfVar;
    }

    @Override // defpackage.adsu
    public final void a() {
        int i = aeeb.a;
        adsf adsfVar = this.c;
        adsfVar.b.f.c();
        adnq adnqVar = this.a;
        admc admcVar = this.b;
        adnq adnqVar2 = adsfVar.a;
        if (adnqVar2 != null) {
            admcVar = new admc();
            adnqVar = adnqVar2;
        }
        try {
            adsg.l(adsfVar.c, adnqVar, admcVar);
        } finally {
            this.c.b.d.a(adnqVar.g());
        }
    }
}
