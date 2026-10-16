package defpackage;

/* loaded from: classes2.dex */
final class dxr extends afda {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ dxs d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxr(dxs dxsVar, afck afckVar) {
        super(afckVar);
        this.d = dxsVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
