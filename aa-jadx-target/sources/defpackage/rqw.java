package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rqw {
    public volatile defpackage.yzc a;
    final /* synthetic */ defpackage.rqx b;
    private final defpackage.yzd c;
    private final defpackage.xzg d;

    public rqw(defpackage.rqx rqxVar, defpackage.yzd yzdVar) {
        this.b = rqxVar;
        this.c = yzdVar;
        defpackage.xzg xzgVar = new defpackage.xzg(rqxVar.a);
        xzgVar.d();
        this.d = xzgVar;
    }

    public final synchronized void a() {
        if (!b()) {
            defpackage.yzd yzdVar = this.c;
            defpackage.abor aborVarN = defpackage.yzc.a.n();
            int i = yzdVar.h;
            aborVarN.t();
            defpackage.yzc yzcVar = (defpackage.yzc) aborVarN.b;
            yzcVar.b |= 1;
            yzcVar.c = i;
            defpackage.zao zaoVarL = defpackage.acmj.l(java.util.UUID.randomUUID());
            aborVarN.t();
            defpackage.yzc yzcVar2 = (defpackage.yzc) aborVarN.b;
            zaoVarL.getClass();
            yzcVar2.d = zaoVarL;
            yzcVar2.b |= 2;
            this.a = (defpackage.yzc) aborVarN.q();
        }
        defpackage.xzg xzgVar = this.d;
        xzgVar.d();
        xzgVar.e();
    }

    public final boolean b() {
        defpackage.xzg xzgVar = this.d;
        return xzgVar.a(java.util.concurrent.TimeUnit.NANOSECONDS) < this.b.b && xzgVar.a;
    }
}
