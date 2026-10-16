package defpackage;

/* loaded from: classes.dex */
final class aob extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ aoe b;
    int c;
    anq d;
    arw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aob(aoe aoeVar, afck afckVar) {
        super(afckVar);
        this.b = aoeVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.u(null, this);
    }
}
