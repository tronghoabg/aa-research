package defpackage;

/* loaded from: classes.dex */
final class aoj extends afde implements afeg {
    int a;
    final /* synthetic */ aol b;
    final /* synthetic */ long c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoj(aol aolVar, long j, afck afckVar) {
        super(2, afckVar);
        this.b = aolVar;
        this.c = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aoj aojVar = new aoj(this.b, this.c, afckVar);
        aojVar.d = obj;
        return aojVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            aitx aitxVar = (aitx) this.d;
            aol aolVar = this.b;
            long j = this.c;
            afeh afehVar = aolVar.b;
            cja cjaVar = new cja(j);
            this.a = 1;
            if (afehVar.invoke(aitxVar, cjaVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aoj) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
