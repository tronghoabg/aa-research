package defpackage;

/* loaded from: classes3.dex */
final class adyx extends adsu {
    final /* synthetic */ adyy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adyx(adyy adyyVar) {
        super(adyyVar.a);
        this.a = adyyVar;
    }

    @Override // defpackage.adsu
    public final void a() {
        try {
            int i = aeeb.a;
            this.a.c().e();
        } catch (Throwable th) {
            this.a.f(th);
            throw th;
        }
    }
}
