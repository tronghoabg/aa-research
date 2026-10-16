package defpackage;

/* loaded from: classes2.dex */
public final class gpz extends afde implements afeh {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ aiyk c;
    final /* synthetic */ aiyk d;
    final /* synthetic */ aiyk e;
    final /* synthetic */ gqb f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpz(afck afckVar, aiyk aiykVar, aiyk aiykVar2, aiyk aiykVar3, gqb gqbVar) {
        super(3, afckVar);
        this.c = aiykVar;
        this.d = aiykVar2;
        this.e = aiykVar3;
        this.f = gqbVar;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [aiyl, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            ?? r10 = this.g;
            int iIntValue = ((Number) this.b).intValue();
            aiyk jxzVar = (iIntValue == 0 || iIntValue == 1) ? new jxz(gbk.a, 4) : aiov.a(this.c, this.d, this.e, new gqa(this.f, iIntValue, null));
            this.a = 1;
            if (aimr.c(r10, jxzVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        gpz gpzVar = new gpz((afck) obj3, this.c, this.d, this.e, this.f);
        gpzVar.g = (aiyl) obj;
        gpzVar.b = obj2;
        return gpzVar.hT(afak.a);
    }
}
