package defpackage;

/* loaded from: classes3.dex */
public final class afcs extends afdc {
    final /* synthetic */ afec a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afcs(afck afckVar, afec afecVar) {
        super(afckVar);
        this.a = afecVar;
    }

    @Override // defpackage.afcy
    protected final Object hT(Object obj) throws Throwable {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.b = 2;
            woy.dF(obj);
            return obj;
        }
        this.b = 1;
        woy.dF(obj);
        afec afecVar = this.a;
        affz.g(afecVar, 1);
        return afecVar.invoke(this);
    }
}
