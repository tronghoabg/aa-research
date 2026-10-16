package defpackage;

/* loaded from: classes2.dex */
final class gcj extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ gck b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcj(gck gckVar, afck afckVar) {
        super(afckVar);
        this.b = gckVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, 0, this);
    }
}
