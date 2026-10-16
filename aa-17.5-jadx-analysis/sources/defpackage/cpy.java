package defpackage;

/* loaded from: classes.dex */
final class cpy extends afda {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ cpz c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpy(cpz cpzVar, afck afckVar) {
        super(afckVar);
        this.c = cpzVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(0L, this);
    }
}
