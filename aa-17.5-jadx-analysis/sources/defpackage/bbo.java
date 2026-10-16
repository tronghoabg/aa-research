package defpackage;

/* loaded from: classes.dex */
final class bbo extends afda {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bbt c;
    int d;
    aft e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbo(bbt bbtVar, afck afckVar) {
        super(afckVar);
        this.c = bbtVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.y(0, null, this);
    }
}
