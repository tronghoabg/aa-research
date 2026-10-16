package defpackage;

/* loaded from: classes.dex */
final class anc extends afde implements afeg {
    int a;
    final /* synthetic */ arf b;
    final /* synthetic */ ane c;
    final /* synthetic */ amy d;
    final /* synthetic */ long e;
    final /* synthetic */ aivh f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anc(arf arfVar, ane aneVar, amy amyVar, long j, aivh aivhVar, afck afckVar) {
        super(2, afckVar);
        this.b = arfVar;
        this.c = aneVar;
        this.d = amyVar;
        this.e = j;
        this.f = aivhVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        anc ancVar = new anc(this.b, this.c, this.d, this.e, this.f, afckVar);
        ancVar.g = obj;
        return ancVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            izj izjVar = (izj) this.g;
            arf arfVar = this.b;
            ane aneVar = this.c;
            amy amyVar = this.d;
            arfVar.e = aneVar.b(amyVar, this.e);
            acg acgVar = new acg((Object) aneVar, (Object) this.f, (Object) izjVar, 2, (char[]) null);
            axf axfVar = new axf(aneVar, arfVar, amyVar, 1);
            this.a = 1;
            if (arfVar.a(acgVar, axfVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((anc) b((izj) obj, (afck) obj2)).hT(afak.a);
    }
}
