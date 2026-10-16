package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mau implements defpackage.lhg {
    public final /* synthetic */ defpackage.eqp a;
    private final /* synthetic */ int b;

    public /* synthetic */ mau(defpackage.eqp eqpVar, int i) {
        this.b = i;
        this.a = eqpVar;
    }

    @Override // defpackage.lhg
    public final void a(android.content.ComponentName componentName) {
        int i = this.b;
        defpackage.eqp eqpVar = this.a;
        if (i != 0) {
            eqpVar.m(componentName);
        } else {
            ((defpackage.mav) eqpVar).a();
        }
    }
}
