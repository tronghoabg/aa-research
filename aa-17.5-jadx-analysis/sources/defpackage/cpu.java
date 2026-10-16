package defpackage;

/* loaded from: classes.dex */
public final class cpu extends afda {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ tp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpu(tp tpVar, afck afckVar) {
        super(afckVar);
        this.c = tpVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.d(0L, 0L, this);
    }
}
