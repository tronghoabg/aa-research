package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tcm extends defpackage.eqr {
    public defpackage.sqs a;
    public defpackage.sqs h;
    public defpackage.sqs i;
    private final defpackage.affh j;
    private boolean k;

    public tcm(defpackage.eqp eqpVar, defpackage.eqp eqpVar2, defpackage.eqp eqpVar3, defpackage.affh affhVar) {
        this.j = affhVar;
        defpackage.tda tdaVar = defpackage.tda.a;
        this.a = tdaVar;
        this.h = tdaVar;
        this.i = tdaVar;
        r(eqpVar, new defpackage.kku(new defpackage.nnp(this, 19), 11));
        r(eqpVar2, new defpackage.kku(new defpackage.nnp(this, 20), 11));
        r(eqpVar3, new defpackage.kku(new defpackage.tcr(this, 1), 11));
    }

    public final void a() {
        defpackage.sqs sqsVar = this.a;
        boolean z = sqsVar instanceof defpackage.tdb;
        defpackage.sqs sqsVar2 = this.h;
        defpackage.sqs sqsVar3 = this.i;
        if (z && (sqsVar2 instanceof defpackage.tdb) && (sqsVar3 instanceof defpackage.tdb)) {
            java.lang.Object objInvoke = this.j.invoke(((defpackage.tdb) sqsVar).a, ((defpackage.tdb) sqsVar2).a, ((defpackage.tdb) sqsVar3).a);
            if (this.k && objInvoke == e()) {
                return;
            }
            m(objInvoke);
            this.k = true;
        }
    }
}
