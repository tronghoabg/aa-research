package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rek implements defpackage.dog {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rek(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dog
    public final java.lang.Object a(final defpackage.doe doeVar) {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i == 0) {
            ((defpackage.rem) obj).b.a = doeVar;
            return "Start CallbackToFutureAdapter";
        }
        final defpackage.jpc jpcVar = (defpackage.jpc) obj;
        ((defpackage.jmb) ((defpackage.xzi) jpcVar.g.get()).fF()).a(defpackage.ebm.n(), new defpackage.jly() { // from class: jos
            @Override // defpackage.jly
            public final void a(int i2) {
                boolean z = i2 > 0;
                defpackage.jpc jpcVar2 = jpcVar;
                if (z) {
                    ((defpackage.yqj) defpackage.jpc.a.l().ai((char) 2522)).w("CDM association ID: %d", i2);
                    defpackage.omv.i(jpcVar2.b, defpackage.yyn.CAR_CONNECTION_CDM_APPROVED);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.jpc.a.g()).ai((char) 2521)).u("Invalid CDM association for Android Auto");
                    defpackage.omv.i(jpcVar2.b, defpackage.yyn.CAR_CONNECTION_CDM_REJECTED_INVALID_ASSOCIATION);
                }
                doeVar.b(java.lang.Boolean.valueOf(z));
            }
        });
        return "sendDeviceAppeared";
    }
}
