package defpackage;

/* loaded from: classes3.dex */
final class aixg extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ aixh b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aixg(aixh aixhVar, afck afckVar) {
        super(afckVar);
        this.b = aixhVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objG = this.b.g(null, 0, 0L, this);
        return objG == afcr.a ? objG : new aixp(objG);
    }
}
