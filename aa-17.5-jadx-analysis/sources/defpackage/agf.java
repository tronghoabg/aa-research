package defpackage;

/* loaded from: classes.dex */
public final class agf extends afde implements afeg {
    float a;
    int b;
    final /* synthetic */ agg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agf(agg aggVar, afck afckVar) {
        super(2, afckVar);
        this.c = aggVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        agf agfVar = new agf(this.c, afckVar);
        agfVar.d = obj;
        return agfVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        aitx aitxVar;
        float fC;
        afcr afcrVar = afcr.a;
        if (this.b != 0) {
            fC = this.a;
            aitxVar = (aitx) this.d;
            woy.dF(obj);
        } else {
            woy.dF(obj);
            aitxVar = (aitx) this.d;
            fC = afp.c(aitxVar.c());
        }
        while (ahni.g(aitxVar)) {
            ale aleVar = new ale(this.c, fC, 1);
            this.d = aitxVar;
            this.a = fC;
            this.b = 1;
            if (czz.ah(hH()).a(aleVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((agf) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
