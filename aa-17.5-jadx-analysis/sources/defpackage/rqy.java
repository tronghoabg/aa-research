package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public abstract class rqy {
    protected rqy() {
    }

    public abstract xxh a();

    public abstract xxh b();

    public abstract yfq c();

    public abstract ygr d();

    public abstract yxc e();

    public abstract yxy f();

    public abnp g() {
        abnp abnpVarN = yxb.a.n();
        abnp abnpVarN2 = yxx.a.n();
        int i = f().h;
        abnpVarN2.t();
        yxx yxxVar = (yxx) abnpVarN2.b;
        yxxVar.b |= 1;
        yxxVar.c = i;
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        yxx yxxVar2 = (yxx) abnpVarN2.q();
        yxxVar2.getClass();
        yxbVar.O = yxxVar2;
        yxbVar.c |= 32768;
        if (a().f()) {
            yzj yzjVarS = aclh.s((UUID) a().b());
            abnpVarN.t();
            yxb yxbVar2 = (yxb) abnpVarN.b;
            yzjVarS.getClass();
            yxbVar2.C = yzjVarS;
            yxbVar2.b |= 536870912;
        }
        if (b().f()) {
            int iIntValue = ((Integer) b().b()).intValue();
            abnpVarN.t();
            yxb yxbVar3 = (yxb) abnpVarN.b;
            yxbVar3.b |= 8388608;
            yxbVar3.x = iIntValue;
        }
        abnpVarN.N(c());
        return abnpVarN;
    }
}
