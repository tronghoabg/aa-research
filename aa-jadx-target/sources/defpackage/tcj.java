package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tcj extends defpackage.eqr {
    public defpackage.sqs a;
    public defpackage.sqs h;
    private final defpackage.affg i;
    private boolean j;

    public tcj(defpackage.eqp eqpVar, defpackage.eqp eqpVar2, defpackage.affg affgVar) {
        this.i = affgVar;
        defpackage.tda tdaVar = defpackage.tda.a;
        this.a = tdaVar;
        this.h = tdaVar;
        if (eqpVar == eqpVar2) {
            r(eqpVar, new defpackage.kku(new defpackage.opb(this, 19), 11));
        } else {
            r(eqpVar, new defpackage.kku(new defpackage.nnp(this, 17), 11));
            r(eqpVar2, new defpackage.kku(new defpackage.nnp(this, 18), 11));
        }
    }

    public final void a() {
        defpackage.sqs sqsVar = this.a;
        boolean z = sqsVar instanceof defpackage.tdb;
        defpackage.sqs sqsVar2 = this.h;
        if (z && (sqsVar2 instanceof defpackage.tdb)) {
            java.lang.Object objInvoke = this.i.invoke(((defpackage.tdb) sqsVar).a, ((defpackage.tdb) sqsVar2).a);
            if (this.j && objInvoke == e()) {
                return;
            }
            m(objInvoke);
            this.j = true;
        }
    }
}
