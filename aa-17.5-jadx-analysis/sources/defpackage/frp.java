package defpackage;

/* loaded from: classes2.dex */
final class frp extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ frr b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frp(frr frrVar, afck afckVar) {
        super(afckVar);
        this.b = frrVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
