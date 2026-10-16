package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nvs extends defpackage.eqr {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.OngoingNotifLD");
    public static final j$.time.Duration h = defpackage.ysr.cB(75);
    private static final defpackage.nvr l = new defpackage.nvr(null, defpackage.afce.a);
    public final defpackage.eqp i;
    public aiuw j;
    public aiwg k;
    private final defpackage.eqp m;
    private final defpackage.eqp n;

    public nvs(defpackage.eqp eqpVar, defpackage.eqp eqpVar2, defpackage.eqp eqpVar3) {
        eqpVar3.getClass();
        this.m = eqpVar;
        this.i = eqpVar2;
        this.n = eqpVar3;
        defpackage.sqs.aP(this, new defpackage.eqp[]{eqpVar, eqpVar3, eqpVar2}, new defpackage.nnp(this, 9));
    }

    public final java.util.List a() {
        java.lang.Object objE = this.m.e();
        objE.getClass();
        return (java.util.List) objE;
    }

    public final java.util.List b() {
        java.lang.Object objE = this.n.e();
        objE.getClass();
        return (java.util.List) objE;
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void c() {
        this.j = ahoi.b(defpackage.mks.a.e().i());
        super.c();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.eqr, defpackage.eqp
    protected final void d() throws afbj {
        super.d();
        aiuw aiuwVar = this.j;
        if (aiuwVar == null) {
            defpackage.afga.d("coroutineScope");
            aiuwVar = null;
        }
        ahoi.e(aiuwVar, (java.util.concurrent.CancellationException) null);
        m(l);
    }
}
