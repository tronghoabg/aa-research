package defpackage;

/* loaded from: classes.dex */
public final class blb extends afde implements afeg {
    int a;
    final /* synthetic */ bym b;
    final /* synthetic */ adu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blb(bym bymVar, adu aduVar, afck afckVar) {
        super(2, afckVar);
        this.b = bymVar;
        this.c = aduVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        blb blbVar = new blb(this.b, this.c, afckVar);
        blbVar.d = obj;
        return blbVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            aitx aitxVar = (aitx) this.d;
            aiyk aiykVarD = byx.d(new bih(this.b, 13));
            asc ascVar = new asc(this.c, aitxVar, 4);
            this.a = 1;
            if (aiykVarD.hR(ascVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((blb) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
