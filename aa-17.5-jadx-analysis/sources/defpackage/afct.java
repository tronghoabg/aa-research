package defpackage;

/* loaded from: classes3.dex */
public final class afct extends afda {
    final /* synthetic */ eyr a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afct(afck afckVar, afco afcoVar, afec afecVar) {
        super(afckVar, afcoVar);
        this.a = (eyr) afecVar;
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
        eyr eyrVar = this.a;
        affz.g(eyrVar, 1);
        return eyrVar.invoke(this);
    }
}
