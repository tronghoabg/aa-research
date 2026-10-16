package defpackage;

/* loaded from: classes2.dex */
public final class fsa extends afda {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ wnq c;
    public ncp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsa(wnq wnqVar, afck afckVar) {
        super(afckVar);
        this.c = wnqVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
