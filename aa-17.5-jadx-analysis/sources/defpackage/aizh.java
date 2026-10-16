package defpackage;

/* loaded from: classes3.dex */
public final class aizh extends afde implements afeg {
    /* synthetic */ int a;

    public aizh(afck afckVar) {
        super(2, afckVar);
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aizh aizhVar = new aizh(afckVar);
        aizhVar.a = ((Number) obj).intValue();
        return aizhVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        return Boolean.valueOf(this.a > 0);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aizh) b(Integer.valueOf(((Number) obj).intValue()), (afck) obj2)).hT(afak.a);
    }
}
