package defpackage;

/* loaded from: classes.dex */
public final class aqp extends afde implements afeg {
    int a;
    final /* synthetic */ cqz b;
    final /* synthetic */ afeh c;
    final /* synthetic */ afec d;
    final /* synthetic */ apl e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqp(cqz cqzVar, afeh afehVar, afec afecVar, apl aplVar, afck afckVar) {
        super(2, afckVar);
        this.b = cqzVar;
        this.c = afehVar;
        this.d = afecVar;
        this.e = aplVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aqp aqpVar = new aqp(this.b, this.c, this.d, this.e, afckVar);
        aqpVar.f = obj;
        return aqpVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            aitx aitxVar = (aitx) this.f;
            cqz cqzVar = this.b;
            aqo aqoVar = new aqo(aitxVar, this.c, this.d, this.e, null);
            this.a = 1;
            if (ca.aK(cqzVar, aqoVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aqp) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
