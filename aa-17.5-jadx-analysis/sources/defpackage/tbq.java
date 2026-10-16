package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class tbq implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tbq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [afdr, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.b;
        if (i == 0) {
            tcf tcfVar = new tcf(obj);
            tbr tbrVar = (tbr) this.a;
            tbrVar.i = tcfVar;
            tbrVar.a();
            return afak.a;
        }
        if (i != 1) {
            if (i != 2) {
                obj.getClass();
                return this.a.invoke();
            }
            ((eqj) this.a).m(obj);
            return afak.a;
        }
        tcf tcfVar2 = new tcf(obj);
        tbr tbrVar2 = (tbr) this.a;
        tbrVar2.h = tcfVar2;
        tbrVar2.a();
        return afak.a;
    }
}
