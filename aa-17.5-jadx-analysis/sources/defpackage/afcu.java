package defpackage;

/* loaded from: classes3.dex */
public final class afcu extends afdc {
    final /* synthetic */ afeg a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afcu(afck afckVar, afeg afegVar, Object obj) {
        super(afckVar);
        this.a = afegVar;
        this.b = obj;
    }

    @Override // defpackage.afcy
    protected final Object hT(Object obj) throws Throwable {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.c = 2;
            woy.dF(obj);
            return obj;
        }
        this.c = 1;
        woy.dF(obj);
        afeg afegVar = this.a;
        affz.g(afegVar, 2);
        return afegVar.invoke(this.b, this);
    }
}
