package defpackage;

/* loaded from: classes.dex */
final class aqr extends afde implements afeg {
    int a;
    final /* synthetic */ cqz b;
    final /* synthetic */ afeh c;
    final /* synthetic */ afec d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqr(cqz cqzVar, afeh afehVar, afec afecVar, afck afckVar) {
        super(2, afckVar);
        this.b = cqzVar;
        this.c = afehVar;
        this.d = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aqr aqrVar = new aqr(this.b, this.c, this.d, afckVar);
        aqrVar.e = obj;
        return aqrVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            aitx aitxVar = (aitx) this.e;
            cqz cqzVar = this.b;
            aqq aqqVar = new aqq(aitxVar, new apl(cqzVar), this.c, this.d, null);
            this.a = 1;
            if (ca.aK(cqzVar, aqqVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aqr) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
