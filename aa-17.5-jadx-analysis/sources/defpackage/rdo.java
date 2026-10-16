package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class rdo implements dny {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rdo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dny
    public final Object a(final dnw dnwVar) {
        int i = this.b;
        Object obj = this.a;
        if (i == 0) {
            ((rdq) obj).b.a = dnwVar;
            return "Start CallbackToFutureAdapter";
        }
        final jou jouVar = (jou) obj;
        ((jlu) ((xyc) jouVar.g.get()).gu()).a(dlz.D(), new jlr() { // from class: jok
            @Override // defpackage.jlr
            public final void a(int i2) {
                boolean z = i2 > 0;
                jou jouVar2 = jouVar;
                if (z) {
                    ((ype) jou.a.l().ai((char) 2521)).w("CDM association ID: %d", i2);
                    ols.M(jouVar2.b, yxi.CAR_CONNECTION_CDM_APPROVED);
                } else {
                    ((ype) ((ype) jou.a.g()).ai((char) 2520)).u("Invalid CDM association for Android Auto");
                    ols.M(jouVar2.b, yxi.CAR_CONNECTION_CDM_REJECTED_INVALID_ASSOCIATION);
                }
                dnwVar.b(Boolean.valueOf(z));
            }
        });
        return "sendDeviceAppeared";
    }
}
