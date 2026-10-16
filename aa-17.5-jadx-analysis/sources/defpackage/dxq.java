package defpackage;

/* loaded from: classes2.dex */
public final class dxq extends afde implements afeg {
    /* synthetic */ int a;
    final /* synthetic */ sm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxq(sm smVar, afck afckVar) {
        super(2, afckVar);
        this.b = smVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        dxq dxqVar = new dxq(this.b, afckVar);
        dxqVar.a = ((Number) obj).intValue();
        return dxqVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [dyl, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        this.b.a.c(this.a);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dxq) b(Integer.valueOf(((Number) obj).intValue()), (afck) obj2)).hT(afak.a);
    }
}
