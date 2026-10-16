package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jnt {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CAR.AUTH");
    public final java.util.Map b;
    public final android.content.Context c;
    public final defpackage.jns d;
    private final defpackage.rqt e;

    public jnt(android.content.Context context, defpackage.jns jnsVar) {
        defpackage.rqt rqtVarA = defpackage.rqt.a(context);
        this.b = new j$.util.concurrent.ConcurrentHashMap();
        this.c = context;
        this.d = jnsVar;
        this.e = rqtVarA;
    }

    public final void a() {
        ((defpackage.yqj) a.l().ai((char) 2413)).u("Clearing approved packages cache.");
        this.b.clear();
    }

    public final void b(java.util.SortedSet sortedSet, boolean z) {
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        defpackage.abor aborVarN2 = defpackage.yzl.a.n();
        aborVarN2.t();
        defpackage.yzl yzlVar = (defpackage.yzl) aborVarN2.b;
        defpackage.abpj abpjVar = yzlVar.c;
        if (!abpjVar.c()) {
            int size = abpjVar.size();
            yzlVar.c = abpjVar.d(size + size);
        }
        defpackage.abnf.i(sortedSet, yzlVar.c);
        aborVarN2.t();
        defpackage.yzl yzlVar2 = (defpackage.yzl) aborVarN2.b;
        yzlVar2.b |= 1;
        yzlVar2.d = 2;
        aborVarN2.t();
        defpackage.yzl yzlVar3 = (defpackage.yzl) aborVarN2.b;
        yzlVar3.b = 2 | yzlVar3.b;
        yzlVar3.e = z;
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        defpackage.yzl yzlVar4 = (defpackage.yzl) aborVarN2.q();
        yzlVar4.getClass();
        yygVar.V = yzlVar4;
        yygVar.c |= 8388608;
        defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN.q();
        defpackage.rqt rqtVar = this.e;
        defpackage.yyh yyhVar = defpackage.yyh.GEARHEAD_CAR_SERVICE_CONNECTION;
        int i = defpackage.ygw.d;
        rqtVar.e(yyhVar, yygVar2, defpackage.ymx.a);
    }
}
