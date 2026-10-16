package defpackage;

/* loaded from: classes2.dex */
final class ezp extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ ezv b;
    int c;
    sx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezp(ezv ezvVar, afck afckVar) {
        super(afckVar);
        this.b = ezvVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
