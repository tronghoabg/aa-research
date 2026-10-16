package defpackage;

/* loaded from: classes2.dex */
final class fab extends afda {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ faf c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fab(faf fafVar, afck afckVar) {
        super(afckVar);
        this.c = fafVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
