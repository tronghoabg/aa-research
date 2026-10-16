package defpackage;

/* loaded from: classes2.dex */
final class dxo extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ dxs b;
    int c;
    dyw d;
    dxs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxo(dxs dxsVar, afck afckVar) {
        super(afckVar);
        this.b = dxsVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
