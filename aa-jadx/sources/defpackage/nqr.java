package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nqr implements defpackage.nps {
    public final defpackage.eqp a;
    private final defpackage.kkf b;

    public nqr(defpackage.kkf kkfVar) {
        this.b = kkfVar;
        this.a = defpackage.jub.d(kkfVar);
    }

    @Override // defpackage.nps
    public final defpackage.eqp a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(boolean z, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.nqq nqqVar;
        java.lang.Object objE;
        if (afdkVar instanceof defpackage.nqq) {
            nqqVar = (defpackage.nqq) afdkVar;
            int i = nqqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqqVar.c = i - Integer.MIN_VALUE;
            } else {
                nqqVar = new defpackage.nqq(this, afdkVar);
            }
        } else {
            nqqVar = new defpackage.nqq(this, afdkVar);
        }
        java.lang.Object obj = nqqVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = nqqVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            defpackage.kkf kkfVar = this.b;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            nqqVar.c = 1;
            objE = defpackage.jub.e(kkfVar, boolValueOf, nqqVar);
            if (objE == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
            objE = ((defpackage.afaw) obj).a;
        }
        java.lang.Throwable thA = defpackage.afaw.a(objE);
        if (thA != null) {
            ((defpackage.yqj) defpackage.npu.c.h()).M("Unable to change toggle value of %s: %s", this.b, thA.getMessage());
        }
        return defpackage.afbk.a;
    }
}
