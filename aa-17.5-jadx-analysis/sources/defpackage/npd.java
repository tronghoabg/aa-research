package defpackage;

/* loaded from: classes2.dex */
final class npd extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ npe b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npd(npe npeVar, afck afckVar) {
        super(afckVar);
        this.b = npeVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
