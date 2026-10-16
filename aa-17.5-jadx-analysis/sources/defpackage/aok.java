package defpackage;

/* loaded from: classes.dex */
final class aok extends afde implements afeg {
    int a;
    final /* synthetic */ aol b;
    final /* synthetic */ anr c;
    final /* synthetic */ api d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aok(aol aolVar, anr anrVar, api apiVar, afck afckVar) {
        super(2, afckVar);
        this.b = aolVar;
        this.c = anrVar;
        this.d = apiVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aok aokVar = new aok(this.b, this.c, this.d, afckVar);
        aokVar.e = obj;
        return aokVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            aitx aitxVar = (aitx) this.e;
            aol aolVar = this.b;
            long j = this.c.c;
            afeh afehVar = aolVar.c;
            long jC = dlv.c(j, aolVar.i ? -1.0f : 1.0f);
            api apiVar = this.d;
            afeh afehVar2 = aoi.a;
            Float f = new Float(apiVar == api.a ? Float.intBitsToFloat((int) (jC & 4294967295L)) : Float.intBitsToFloat((int) (jC >> 32)));
            this.a = 1;
            if (afehVar.invoke(aitxVar, f, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aok) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
