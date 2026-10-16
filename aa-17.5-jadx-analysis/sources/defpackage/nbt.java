package defpackage;

/* loaded from: classes2.dex */
final class nbt extends afda {
    float a;
    /* synthetic */ Object b;
    final /* synthetic */ nbu c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbt(nbu nbuVar, afck afckVar) {
        super(afckVar);
        this.c = nbuVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
