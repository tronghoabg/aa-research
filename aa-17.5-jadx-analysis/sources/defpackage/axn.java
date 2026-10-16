package defpackage;

/* loaded from: classes.dex */
final class axn extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ axr b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axn(axr axrVar, afck afckVar) {
        super(afckVar);
        this.b = axrVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.n(0, this);
    }
}
