package defpackage;

/* loaded from: classes2.dex */
final class npf extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ npi b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npf(npi npiVar, afck afckVar) {
        super(afckVar);
        this.b = npiVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
