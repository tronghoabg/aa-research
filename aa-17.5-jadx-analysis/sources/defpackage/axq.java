package defpackage;

/* loaded from: classes.dex */
final class axq extends afde implements afeg {
    final /* synthetic */ axr a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axq(axr axrVar, int i, afck afckVar) {
        super(2, afckVar);
        this.a = axrVar;
        this.b = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new axq(this.a, this.b, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        this.a.k(this.b, 0, true);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((axq) b((apr) obj, (afck) obj2)).hT(afak.a);
    }
}
