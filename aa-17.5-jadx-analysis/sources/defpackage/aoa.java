package defpackage;

/* loaded from: classes.dex */
final class aoa extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ aoe b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoa(aoe aoeVar, afck afckVar) {
        super(afckVar);
        this.b = aoeVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.r(this);
    }
}
