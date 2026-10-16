package defpackage;

/* loaded from: classes2.dex */
final class crk extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ crl b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crk(crl crlVar, afck afckVar) {
        super(afckVar);
        this.b = crlVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.t(0L, null, this);
    }
}
