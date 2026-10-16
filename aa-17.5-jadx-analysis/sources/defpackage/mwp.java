package defpackage;

/* loaded from: classes2.dex */
final class mwp extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ mwu b;
    int c;
    emp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwp(mwu mwuVar, afck afckVar) {
        super(afckVar);
        this.b = mwuVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
