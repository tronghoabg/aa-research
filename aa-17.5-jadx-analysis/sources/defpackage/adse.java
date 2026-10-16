package defpackage;

/* loaded from: classes3.dex */
final class adse extends adsu {
    final /* synthetic */ adsf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adse(adsf adsfVar) {
        super(adsfVar.b.e);
        this.a = adsfVar;
    }

    @Override // defpackage.adsu
    public final void a() {
        int i = aeeb.a;
        adsf adsfVar = this.a;
        if (adsfVar.a == null) {
            try {
                adsfVar.c.h();
            } catch (Throwable th) {
                this.a.b(adnq.c.d(th).e("Failed to call onReady."));
            }
        }
    }
}
