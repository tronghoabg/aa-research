package defpackage;

/* loaded from: classes2.dex */
final class hch extends afde implements afeg {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ axr c;
    final /* synthetic */ hcl d;
    final /* synthetic */ ajju e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hch(long j, axr axrVar, ajju ajjuVar, hcl hclVar, afck afckVar) {
        super(2, afckVar);
        this.b = j;
        this.c = axrVar;
        this.e = ajjuVar;
        this.d = hclVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new hch(this.b, this.c, this.e, this.d, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            axr axrVar = this.c;
            aiyk aiykVarA = aiyr.a(aizc.b(ainb.a(byx.d(new gzm(axrVar, 7)), this.b), new hcg(new fmn(byx.d(new gzm(axrVar, 8)), 18), axrVar, 0)));
            gvz gvzVar = new gvz(axrVar, this.e, this.d, 2);
            this.a = 1;
            if (aiykVarA.hR(gvzVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((hch) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
