package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class reo implements defpackage.zhh {
    final /* synthetic */ defpackage.rei a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.qtv c;

    public reo(defpackage.qtv qtvVar, defpackage.rei reiVar, int i) {
        this.a = reiVar;
        this.b = i;
        this.c = qtvVar;
    }

    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        if (defpackage.rrx.e("CAR.TOKEN", 4)) {
            defpackage.zke zkeVar = defpackage.zke.a;
            defpackage.rrx.d(4, "CAR.TOKEN", null, "Failed to connect %s using %s (cx attempt %s)", new defpackage.zkf(zkeVar, this), new defpackage.zkf(zkeVar, this.a), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(this.b)));
        }
    }

    @Override // defpackage.zhh
    public final /* synthetic */ void b(java.lang.Object obj) {
        if (defpackage.rrx.e("CAR.TOKEN", 4)) {
            defpackage.zke zkeVar = defpackage.zke.a;
            defpackage.rrx.d(4, "CAR.TOKEN", null, "Successfully connected %s using %s (cx attempt %s)", new defpackage.zkf(zkeVar, this), new defpackage.zkf(zkeVar, this.a), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(this.b)));
        }
        defpackage.qtv qtvVar = this.c;
        if (!qtvVar.b()) {
            defpackage.rrx.d(5, "CAR.TOKEN", null, "Reached connection callbacks, but token not currently connected!", new java.lang.Object[0]);
            return;
        }
        new defpackage.stq(qtvVar.e).post(new defpackage.qtk(qtvVar, 7));
        this.a.F(qtvVar.d);
        android.content.Context context = qtvVar.a;
        if (qtvVar.g == 1) {
            defpackage.rrx.d(4, "CAR.TOKEN", null, "Token caller not specified, so skipping telemetry logging. Process: %s", defpackage.rbz.c(context, android.os.Process.myPid()));
            return;
        }
        defpackage.abor aborVarN = defpackage.yye.a.n();
        aborVarN.t();
        defpackage.yye yyeVar = (defpackage.yye) aborVarN.b;
        yyeVar.b |= 1;
        yyeVar.c = 1;
        aborVarN.t();
        defpackage.yye yyeVar2 = (defpackage.yye) aborVarN.b;
        yyeVar2.b = 4 | yyeVar2.b;
        yyeVar2.d = true;
        java.lang.String strC = defpackage.rbz.c(context, android.os.Process.myPid());
        aborVarN.t();
        defpackage.yye yyeVar3 = (defpackage.yye) aborVarN.b;
        strC.getClass();
        yyeVar3.b |= 16;
        yyeVar3.e = strC;
        defpackage.yye yyeVar4 = (defpackage.yye) aborVarN.q();
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        yyeVar4.getClass();
        yygVar.T = yyeVar4;
        yygVar.c |= 2097152;
        try {
            qtvVar.d().m(((defpackage.yyg) aborVarN2.q()).h(), defpackage.yyh.CAR_CLIENT_CONNECTION);
        } catch (defpackage.qst unused) {
            defpackage.rrx.b("CAR.TOKEN", null, "Failed to log connection event.");
        }
    }
}
