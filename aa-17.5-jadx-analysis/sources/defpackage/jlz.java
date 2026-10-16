package defpackage;

/* loaded from: classes.dex */
public final class jlz extends afde implements afeg {
    final /* synthetic */ jlr a;
    final /* synthetic */ jmc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlz(jlr jlrVar, jmc jmcVar, afck afckVar) {
        super(2, afckVar);
        this.a = jlrVar;
        this.b = jmcVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new jlz(this.a, this.b, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        this.a.a(this.b.b);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((jlz) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
