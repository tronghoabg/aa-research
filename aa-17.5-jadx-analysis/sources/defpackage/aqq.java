package defpackage;

/* loaded from: classes.dex */
final class aqq extends afdd implements afeg {
    int a;
    final /* synthetic */ aitx b;
    final /* synthetic */ apl c;
    final /* synthetic */ afeh d;
    final /* synthetic */ afec e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqq(aitx aitxVar, apl aplVar, afeh afehVar, afec afecVar, afck afckVar) {
        super(afckVar);
        this.b = aitxVar;
        this.c = aplVar;
        this.d = afehVar;
        this.e = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aqq aqqVar = new aqq(this.b, this.c, this.d, this.e, afckVar);
        aqqVar.f = obj;
        return aqqVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            crl crlVar = (crl) this.f;
            aitx aitxVar = this.b;
            apl aplVar = this.c;
            afeh afehVar = this.d;
            afec afecVar = this.e;
            this.a = 1;
            if (aqx.g(crlVar, aitxVar, aplVar, afehVar, afecVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aqq) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
