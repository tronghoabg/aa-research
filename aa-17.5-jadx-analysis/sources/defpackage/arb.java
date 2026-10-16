package defpackage;

/* loaded from: classes.dex */
final class arb extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ ard b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arb(ard ardVar, afck afckVar) {
        super(afckVar);
        this.b = ardVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
