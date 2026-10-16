package defpackage;

/* loaded from: classes.dex */
final class cpx extends afda {
    long a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ cpz d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpx(cpz cpzVar, afck afckVar) {
        super(afckVar);
        this.d = cpzVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(0L, 0L, this);
    }
}
