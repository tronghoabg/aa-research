package defpackage;

/* loaded from: classes2.dex */
final class mwq extends afde implements afeg {
    /* synthetic */ float a;
    final /* synthetic */ mwu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwq(mwu mwuVar, afck afckVar) {
        super(2, afckVar);
        this.b = mwuVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        mwq mwqVar = new mwq(this.b, afckVar);
        mwqVar.a = ((Number) obj).floatValue();
        return mwqVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        return Boolean.valueOf(Math.abs(this.a) > ((float) this.b.b.getWidth()));
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((mwq) b(Float.valueOf(((Number) obj).floatValue()), (afck) obj2)).hT(afak.a);
    }
}
