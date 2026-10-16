package defpackage;

/* loaded from: classes.dex */
final class blq extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ blr b;
    int c;
    blr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blq(blr blrVar, afck afckVar) {
        super(afckVar);
        this.b = blrVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(this);
    }
}
