package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sbt extends defpackage.sgc {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ com.google.android.gms.carsetup.CarSetupServiceImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbt(final com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl) {
        super(carSetupServiceImpl, new defpackage.sgb() { // from class: sbs
            @Override // defpackage.sgb
            public final int a() {
                int i = defpackage.sbt.b;
                return carSetupServiceImpl.e;
            }
        });
        this.a = carSetupServiceImpl;
    }

    @Override // defpackage.sgc
    public final void a(defpackage.zaj zajVar, defpackage.zak zakVar) {
        defpackage.sbg sbgVar = this.a.g;
        defpackage.sqs.aB(zajVar, "errorCode is necessary");
        defpackage.abor aborVarN = defpackage.zal.a.n();
        aborVarN.t();
        defpackage.zal zalVar = (defpackage.zal) aborVarN.b;
        zalVar.b |= 1;
        zalVar.c = zajVar.D;
        aborVarN.t();
        defpackage.zal zalVar2 = (defpackage.zal) aborVarN.b;
        zalVar2.b |= 2;
        zalVar2.d = zakVar.az;
        defpackage.zal zalVar3 = (defpackage.zal) aborVarN.q();
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        zalVar3.getClass();
        yygVar.s = zalVar3;
        yygVar.b |= 65536;
        defpackage.yyh yyhVar = defpackage.yyh.PROJECTION_ERROR;
        int i = defpackage.ygw.d;
        sbgVar.f(aborVarN2, yyhVar, defpackage.ymx.a);
    }

    @Override // defpackage.sgc
    public final void b() {
        this.a.k();
    }
}
