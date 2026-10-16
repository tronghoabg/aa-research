package defpackage;

/* loaded from: classes3.dex */
final class aixf extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ aixh b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aixf(aixh aixhVar, afck afckVar) {
        super(afckVar);
        this.b = aixhVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objF = aixh.f(this.b, this);
        return objF == afcr.a ? objF : new aixp(objF);
    }
}
