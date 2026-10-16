package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rxt implements defpackage.rxs {
    private static final defpackage.yqk c = defpackage.omv.n("CAR.ANALYTICS");
    public final defpackage.rqt a;
    public int b = -1;
    private final android.content.Context d;

    public rxt(defpackage.qtp qtpVar, android.content.Context context) {
        if (qtpVar == null) {
            throw new java.lang.IllegalArgumentException("args must not be null");
        }
        this.d = context;
        this.a = defpackage.rqt.a(context.getApplicationContext());
    }

    @Override // defpackage.rxs
    public final void a(byte[] bArr, defpackage.yyh yyhVar) {
        try {
            defpackage.abnf abnfVarH = defpackage.yyg.a.n().h(bArr, defpackage.abol.a());
            int i = defpackage.ygw.d;
            g((defpackage.abor) abnfVarH, yyhVar, defpackage.ymx.a);
        } catch (defpackage.abpp unused) {
            c.h().ai(8487).u("Error reading event proto");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rxs
    public final void b(defpackage.rrs rrsVar) {
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        defpackage.yot it = rrsVar.d().iterator();
        while (it.hasNext()) {
            ygrVar.i(java.lang.Integer.valueOf(((defpackage.acbk) it.next()).a()));
        }
        g(rrsVar.g(), rrsVar.e(), ygrVar.g());
    }

    @Override // defpackage.rxs
    public final void c(defpackage.zaj zajVar, defpackage.zak zakVar, long j, long j2) {
        zajVar.getClass();
        zakVar.getClass();
        defpackage.abor aborVarN = defpackage.zal.a.n();
        aborVarN.t();
        defpackage.zal zalVar = (defpackage.zal) aborVarN.b;
        zalVar.b |= 1;
        zalVar.c = zajVar.D;
        aborVarN.t();
        defpackage.zal zalVar2 = (defpackage.zal) aborVarN.b;
        zalVar2.b |= 2;
        zalVar2.d = zakVar.az;
        aborVarN.t();
        defpackage.zal zalVar3 = (defpackage.zal) aborVarN.b;
        zalVar3.b |= 4;
        zalVar3.e = j;
        aborVarN.t();
        defpackage.zal zalVar4 = (defpackage.zal) aborVarN.b;
        zalVar4.b |= 8;
        zalVar4.f = j2;
        defpackage.zal zalVar5 = (defpackage.zal) aborVarN.q();
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        zalVar5.getClass();
        yygVar.s = zalVar5;
        yygVar.b |= 65536;
        defpackage.yyh yyhVar = defpackage.yyh.OUT_OF_CAR_LIFECYCLE_ERROR;
        int i = defpackage.ygw.d;
        g(aborVarN2, yyhVar, defpackage.ymx.a);
    }

    @Override // defpackage.rxs
    public final void d(defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        defpackage.abor aborVarN = defpackage.zbg.a.n();
        aborVarN.t();
        defpackage.zbg zbgVar = (defpackage.zbg) aborVarN.b;
        zbgVar.b |= 1;
        zbgVar.d = zbeVar.he;
        int iA = zbdVar.a();
        aborVarN.t();
        defpackage.zbg zbgVar2 = (defpackage.zbg) aborVarN.b;
        zbgVar2.b |= 2;
        zbgVar2.e = iA;
        defpackage.zbg zbgVar3 = (defpackage.zbg) aborVarN.q();
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        zbgVar3.getClass();
        yygVar.o = zbgVar3;
        yygVar.b |= 4096;
        defpackage.yyh yyhVar = defpackage.yyh.UI;
        int i = defpackage.ygw.d;
        g(aborVarN2, yyhVar, defpackage.ymx.a);
    }

    @Override // defpackage.rxs
    public final void e(defpackage.zaa zaaVar) {
        defpackage.abor aborVarN = defpackage.zae.a.n();
        aborVarN.t();
        defpackage.zae zaeVar = (defpackage.zae) aborVarN.b;
        zaeVar.b |= 1;
        zaeVar.c = 23;
        aborVarN.t();
        defpackage.zae zaeVar2 = (defpackage.zae) aborVarN.b;
        zaeVar2.b |= 2;
        zaeVar2.d = zaaVar.fI;
        f((defpackage.zae) aborVarN.q());
    }

    public final void f(defpackage.zae zaeVar) {
        zaeVar.getClass();
        defpackage.ysr.bj(1 == (zaeVar.b & 1));
        defpackage.ysr.bj((zaeVar.b & 2) != 0);
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        yygVar.p = zaeVar;
        yygVar.b |= 8192;
        defpackage.yyh yyhVar = defpackage.yyh.NON_UI;
        int i = defpackage.ygw.d;
        g(aborVarN, yyhVar, defpackage.ymx.a);
    }

    @java.lang.Deprecated
    public final void g(defpackage.abor aborVar, defpackage.yyh yyhVar, java.util.List list) {
        java.lang.String strB;
        int i;
        if ((((defpackage.yyg) aborVar.b).c & 131072) != 0) {
            throw new java.lang.IllegalArgumentException("GearheadInfo already set, please add logic to merge it in.");
        }
        android.content.Context context = this.d;
        android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
        android.content.Context applicationContext = context.getApplicationContext();
        try {
            strB = defpackage.qun.b(applicationContext, defpackage.slj.a(applicationContext).b(applicationContext.getPackageName()));
        } catch (java.lang.IllegalStateException | java.lang.SecurityException unused) {
            strB = "";
        }
        try {
            i = packageManager.getPackageInfo(strB, 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            i = -1;
        }
        defpackage.abor aborVarN = defpackage.yzo.a.n();
        aborVarN.t();
        defpackage.yzo yzoVar = (defpackage.yzo) aborVarN.b;
        yzoVar.b |= 1;
        yzoVar.c = i;
        defpackage.yzo yzoVar2 = (defpackage.yzo) aborVarN.q();
        aborVar.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVar.b;
        yzoVar2.getClass();
        yygVar.Q = yzoVar2;
        yygVar.c |= 131072;
        int i2 = this.b;
        aborVar.t();
        defpackage.yyg yygVar2 = (defpackage.yyg) aborVar.b;
        yygVar2.b |= 8388608;
        yygVar2.x = i2;
        this.a.e(yyhVar, (defpackage.yyg) aborVar.q(), list);
    }
}
