package defpackage;

/* loaded from: classes2.dex */
final class dyp extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ dyr b;
    int c;
    dyr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyp(dyr dyrVar, afck afckVar) {
        super(afckVar);
        this.b = dyrVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
