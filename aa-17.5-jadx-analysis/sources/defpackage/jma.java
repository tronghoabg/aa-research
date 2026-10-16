package defpackage;

/* loaded from: classes.dex */
public final class jma extends afde implements afeg {
    final /* synthetic */ jmh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jma(jmh jmhVar, afck afckVar) {
        super(2, afckVar);
        this.a = jmhVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new jma(this.a, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        this.a.a();
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((jma) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
