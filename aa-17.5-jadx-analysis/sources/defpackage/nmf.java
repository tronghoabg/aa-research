package defpackage;

/* loaded from: classes.dex */
public final class nmf extends afde implements afeg {
    final /* synthetic */ agg a;
    final /* synthetic */ afdr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmf(agg aggVar, afdr afdrVar, afck afckVar) {
        super(2, afckVar);
        this.a = aggVar;
        this.b = afdrVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new nmf(this.a, this.b, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        agg aggVar = this.a;
        if (affa.f(aggVar.e(), aggVar.g())) {
            this.b.invoke();
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((nmf) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
