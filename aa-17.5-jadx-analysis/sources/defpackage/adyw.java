package defpackage;

/* loaded from: classes3.dex */
final class adyw extends adsu {
    final /* synthetic */ adzx a;
    final /* synthetic */ adyy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adyw(adyy adyyVar, adzx adzxVar) {
        super(adyyVar.a);
        this.a = adzxVar;
        this.b = adyyVar;
    }

    @Override // defpackage.adsu
    public final void a() {
        try {
            int i = aeeb.a;
            this.b.c().d(this.a);
        } catch (Throwable th) {
            this.b.f(th);
            throw th;
        }
    }
}
