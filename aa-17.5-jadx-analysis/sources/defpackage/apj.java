package defpackage;

/* loaded from: classes.dex */
final class apj extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ apl b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apj(apl aplVar, afck afckVar) {
        super(afckVar);
        this.b = aplVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.n(this);
    }
}
