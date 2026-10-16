package defpackage;

/* loaded from: classes3.dex */
final class adsb extends adsu {
    final /* synthetic */ admc a;
    final /* synthetic */ adsf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adsb(adsf adsfVar, admc admcVar) {
        super(adsfVar.b.e);
        this.a = admcVar;
        this.b = adsfVar;
    }

    @Override // defpackage.adsu
    public final void a() {
        int i = aeeb.a;
        adsf adsfVar = this.b;
        if (adsfVar.a == null) {
            try {
                adsfVar.c.be(this.a);
            } catch (Throwable th) {
                this.b.b(adnq.c.d(th).e("Failed to read headers"));
            }
        }
    }
}
