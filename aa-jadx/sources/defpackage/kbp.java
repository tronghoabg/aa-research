package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kbp implements defpackage.gub {
    private final defpackage.eqs a;
    private final defpackage.eqp b;

    public kbp() {
        defpackage.eqs eqsVar = new defpackage.eqs(java.lang.Boolean.FALSE);
        this.a = eqsVar;
        this.b = eqsVar;
    }

    @Override // defpackage.gub
    public final defpackage.eqp a() {
        return this.b;
    }

    @Override // defpackage.gub
    public final void b(android.content.Intent intent) {
        intent.getClass();
        defpackage.eqs eqsVar = this.a;
        java.lang.Object objE = eqsVar.e();
        if (objE == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        eqsVar.m(java.lang.Boolean.valueOf(intent.getBooleanExtra("com.google.android.gms.car.EXTRA_SHOW_TURN_CARD", ((java.lang.Boolean) objE).booleanValue())));
    }
}
