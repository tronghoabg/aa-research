package defpackage;

/* loaded from: classes2.dex */
final class ezm extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ ezn b;
    int c;
    int[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezm(ezn eznVar, afck afckVar) {
        super(afckVar);
        this.b = eznVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
