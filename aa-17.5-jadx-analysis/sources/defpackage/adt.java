package defpackage;

/* loaded from: classes.dex */
final class adt extends afde implements afec {
    final /* synthetic */ adu a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adt(adu aduVar, Object obj, afck afckVar) {
        super(1, afckVar);
        this.a = aduVar;
        this.b = obj;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        adu aduVar = this.a;
        aduVar.g();
        Object obj2 = this.b;
        aed aedVar = aduVar.b;
        Object objB = aduVar.b(obj2);
        aedVar.c(objB);
        aduVar.i(objB);
        return afak.a;
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new adt(this.a, this.b, (afck) obj).hT(afak.a);
    }
}
