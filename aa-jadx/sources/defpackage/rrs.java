package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rrs {
    protected rrs() {
    }

    public abstract defpackage.xyn a();

    public abstract defpackage.xyn b();

    public abstract defpackage.ygw c();

    public abstract defpackage.yhx d();

    public abstract defpackage.yyh e();

    public abstract defpackage.yzd f();

    public defpackage.abor g() {
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        defpackage.abor aborVarN2 = defpackage.yzc.a.n();
        int i = f().h;
        aborVarN2.t();
        defpackage.yzc yzcVar = (defpackage.yzc) aborVarN2.b;
        yzcVar.b |= 1;
        yzcVar.c = i;
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        defpackage.yzc yzcVar2 = (defpackage.yzc) aborVarN2.q();
        yzcVar2.getClass();
        yygVar.O = yzcVar2;
        yygVar.c |= 32768;
        if (a().f()) {
            defpackage.zao zaoVarL = defpackage.acmj.l((java.util.UUID) a().b());
            aborVarN.t();
            defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN.b;
            zaoVarL.getClass();
            yygVar2.C = zaoVarL;
            yygVar2.b |= 536870912;
        }
        if (b().f()) {
            int iIntValue = ((java.lang.Integer) b().b()).intValue();
            aborVarN.t();
            defpackage.yyg yygVar3 = (defpackage.yyg) aborVarN.b;
            yygVar3.b |= 8388608;
            yygVar3.x = iIntValue;
        }
        aborVarN.N(c());
        return aborVarN;
    }
}
