package defpackage;

/* loaded from: classes.dex */
final class apz extends afda {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ aqa c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apz(aqa aqaVar, afck afckVar) {
        super(afckVar);
        this.c = aqaVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(0L, 0L, this);
    }
}
