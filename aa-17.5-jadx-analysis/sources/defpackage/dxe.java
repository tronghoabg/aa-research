package defpackage;

/* loaded from: classes2.dex */
public final class dxe extends afda {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ aabf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxe(aabf aabfVar, afck afckVar) {
        super(afckVar);
        this.c = aabfVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.k(this);
    }
}
