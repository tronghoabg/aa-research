package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class scl implements defpackage.sec, defpackage.sef {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SETUP");
    public final android.content.Context b;
    public final defpackage.qtp c;
    public final defpackage.sed d;
    public final int e = 0;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final defpackage.sei i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final defpackage.ldx o;
    public defpackage.xei p;
    private final com.google.android.gms.carsetup.CarInfoInternal q;
    private final defpackage.sbg r;

    public scl(android.content.Context context, com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, defpackage.qtp qtpVar, defpackage.sed sedVar, boolean z, boolean z2, boolean z3, defpackage.ldx ldxVar, defpackage.sbg sbgVar, int i) {
        this.b = context;
        this.q = carInfoInternal;
        this.c = qtpVar;
        this.d = sedVar;
        this.f = z;
        this.o = ldxVar;
        this.r = sbgVar;
        this.h = i;
        defpackage.sei seiVar = defpackage.adch.a.fF().b() ? new defpackage.sei(context, new defpackage.roy(carInfoInternal), new sck(new sih(qtpVar)), new saz(context, this)) : null;
        this.i = seiVar;
        if (seiVar == null ? !z2 : !seiVar.b.a()) {
            this.g = true;
            this.l = false;
        } else if (seiVar == null ? !z3 : !seiVar.c()) {
            this.g = false;
            this.l = false;
        } else {
            this.g = false;
            this.l = true;
        }
    }

    @Override // defpackage.sef
    public final int a() {
        return this.q.a.e;
    }

    @Override // defpackage.sef
    public final int b() {
        return this.q.a.f;
    }

    public final sih c() {
        return new sih(this.c);
    }

    public final java.util.List d() {
        defpackage.sei seiVar = this.i;
        return seiVar != null ? seiVar.a() : new saz(this.b, this).e();
    }

    public final void e(defpackage.yyg yygVar, defpackage.yyh yyhVar) {
        if (this.j) {
            a.f().ai(8746).u("Dropping clearcut event. Setup already finished");
        } else {
            this.r.d(yygVar, yyhVar);
        }
    }

    public final void f(defpackage.zbd zbdVar, zaq[] zaqVarArr) {
        defpackage.abor aborVarN = defpackage.zbg.a.n();
        aborVarN.t();
        defpackage.zbg zbgVar = (defpackage.zbg) aborVarN.b;
        zbgVar.b |= 1;
        zbgVar.d = 399;
        int iA = zbdVar.a();
        aborVarN.t();
        defpackage.zbg zbgVar2 = (defpackage.zbg) aborVarN.b;
        zbgVar2.b |= 2;
        zbgVar2.e = iA;
        if (zbdVar == defpackage.zbd.hy) {
            aborVarN.t();
            defpackage.zbg zbgVar3 = (defpackage.zbg) aborVarN.b;
            zbgVar3.c |= 8;
            zbgVar3.K = 0;
        }
        if (zaqVarArr != null) {
            java.util.List listCP = defpackage.ysr.cP(defpackage.ysr.bK(zaqVarArr));
            aborVarN.t();
            defpackage.zbg zbgVar4 = (defpackage.zbg) aborVarN.b;
            defpackage.abpf abpfVar = zbgVar4.J;
            if (!abpfVar.c()) {
                zbgVar4.J = defpackage.abox.G(abpfVar);
            }
            defpackage.abnf.i(listCP, zbgVar4.J);
        }
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        defpackage.zbg zbgVar5 = (defpackage.zbg) aborVarN.q();
        zbgVar5.getClass();
        yygVar.o = zbgVar5;
        yygVar.b |= 4096;
        e((defpackage.yyg) aborVarN2.q(), defpackage.yyh.UI);
    }

    public final void g(defpackage.zbd zbdVar) {
        defpackage.zbe zbeVar = defpackage.zbe.CAR_SETUP_NOTIFICATION;
        defpackage.abor aborVarN = defpackage.zbg.a.n();
        int i = zbeVar.he;
        aborVarN.t();
        defpackage.zbg zbgVar = (defpackage.zbg) aborVarN.b;
        zbgVar.b |= 1;
        zbgVar.d = i;
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
        e((defpackage.yyg) aborVarN2.q(), defpackage.yyh.UI);
    }

    public final void h() {
        this.n = true;
        if (!this.k) {
            a.h().ai(8747).u("Setup not running. Will not notify listener.");
        } else {
            a.f().ai(8748).u("CarService started. Notifying listener.");
            ((sfc) this.p.a).d.f("EVENT_CAR_SERVICE_STARTED", (android.os.Parcelable) null);
        }
    }

    @Override // defpackage.sec
    public final void i(int i) {
        defpackage.xei xeiVar = this.p;
        if (xeiVar != null) {
            java.lang.Object obj = xeiVar.a;
            if (((sdn) obj).a) {
                ((sfc) obj).d.i(new sdm(xeiVar, i));
            }
        }
    }

    public final void j(int i) {
        android.content.SharedPreferences.Editor editorEdit = this.c.b.edit();
        editorEdit.putInt("times_show_reminder_notification", i);
        editorEdit.apply();
    }

    public final boolean k() {
        return this.q.c;
    }

    public final void l(int i, defpackage.zbd zbdVar, zaq[] zaqVarArr) {
        defpackage.abor aborVarN = defpackage.yzj.a.n();
        aborVarN.t();
        defpackage.yzj yzjVar = (defpackage.yzj) aborVarN.b;
        yzjVar.b |= 1;
        yzjVar.c = i - 1;
        if (zaqVarArr != null) {
            java.util.List listCP = defpackage.ysr.cP(defpackage.ysr.bK(zaqVarArr));
            aborVarN.t();
            defpackage.yzj yzjVar2 = (defpackage.yzj) aborVarN.b;
            defpackage.abpf abpfVar = yzjVar2.d;
            if (!abpfVar.c()) {
                yzjVar2.d = defpackage.abox.G(abpfVar);
            }
            defpackage.abnf.i(listCP, yzjVar2.d);
        }
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        defpackage.yzj yzjVar3 = (defpackage.yzj) aborVarN.q();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        yzjVar3.getClass();
        yygVar.E = yzjVar3;
        yygVar.b |= Integer.MIN_VALUE;
        e((defpackage.yyg) aborVarN2.q(), defpackage.yyh.FRX_START);
        if (defpackage.adch.a.fF().a()) {
            f(zbdVar, zaqVarArr);
        }
    }

    public final void m(java.lang.Boolean bool) {
        a.f().ai(8737).y("Setup finished: supported=%b", java.lang.Boolean.TRUE);
        if (this.k) {
            this.p = null;
            this.k = false;
            ((defpackage.ser) this.d).a.remove(this);
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                defpackage.ldx ldxVar = this.o;
                if (zBooleanValue) {
                    defpackage.rsr rsrVar = defpackage.rsr.b;
                    java.lang.Object obj = ldxVar.a;
                    android.content.Context context = (android.content.Context) obj;
                    defpackage.omv.g(context, "com.google.android.gms.car.FRX", rsrVar.ordinal(), null);
                    defpackage.omv.m(context, rsrVar, 0);
                    com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl = (com.google.android.gms.carsetup.CarSetupServiceImpl) obj;
                    if (carSetupServiceImpl.l()) {
                        carSetupServiceImpl.t.b();
                    } else {
                        try {
                            android.os.Bundle bundle = new android.os.Bundle();
                            ((com.google.android.gms.carsetup.CarSetupServiceImpl) obj).d.j(bundle);
                            ((com.google.android.gms.carsetup.CarSetupServiceImpl) obj).k.a.f(bundle);
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                    carSetupServiceImpl.k = null;
                    carSetupServiceImpl.i = null;
                    carSetupServiceImpl.c();
                } else {
                    defpackage.rsr rsrVar2 = defpackage.rsr.c;
                    java.lang.Object obj2 = ldxVar.a;
                    defpackage.omv.g((android.content.Context) obj2, "com.google.android.gms.car.FRX", rsrVar2.ordinal(), null);
                    ((com.google.android.gms.carsetup.CarSetupServiceImpl) obj2).n(3);
                }
            }
            this.j = true;
        }
    }

    public final void n() {
        a.f().ai(8749).u("setup failed");
        m(java.lang.Boolean.FALSE);
    }
}
