package defpackage;

/* loaded from: classes2.dex */
final class klh extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ klj b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klh(klj kljVar, afck afckVar) {
        super(afckVar);
        this.b = kljVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return klj.e(this.b, null, false, this);
    }
}
