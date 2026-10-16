package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nye implements defpackage.nyf {
    public final defpackage.eqs b;
    public final defpackage.eqp c;
    public final defpackage.eqp d;
    public defpackage.noz e;
    private final android.os.Handler g = new android.os.Handler();
    private static final defpackage.yqm f = defpackage.yqm.c("GH.NotificationCtrl");
    public static final android.content.ComponentName a = new android.content.ComponentName("com.google.android.projection.gearhead", "NotificationCenter");

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public nye() throws wfo {
        defpackage.eqs eqsVar = new defpackage.eqs(java.lang.Boolean.FALSE);
        this.b = eqsVar;
        defpackage.nyh nyhVar = new defpackage.nyh();
        int i = defpackage.nuz.b;
        defpackage.wfp.c();
        nyhVar.r(((defpackage.nuz) defpackage.mkp.a.i(defpackage.nuz.class)).a(), new defpackage.kkr(nyhVar, 7));
        this.c = nyhVar;
        defpackage.yqm yqmVar = defpackage.nyk.a;
        defpackage.nog nogVar = new defpackage.nog(5);
        defpackage.afdo afdoVar = defpackage.tcu.a;
        this.d = defpackage.ebo.f(defpackage.ebo.e(new defpackage.tcj(eqsVar, nyhVar, nogVar)), new defpackage.tco(new defpackage.nyj(0)));
        this.e = null;
    }

    public static defpackage.nye b() {
        return (defpackage.nye) defpackage.mkp.a.i(defpackage.nye.class);
    }

    @Override // defpackage.nyf
    public final defpackage.eqp a() {
        return new nyd();
    }

    public final void c() {
        this.g.removeCallbacks(new defpackage.ocy(this, 1));
        ((defpackage.yqj) f.l().ai((char) 5550)).u("NotificationCenter.hide()");
        if (!f()) {
            this.e = null;
            return;
        }
        defpackage.omf.u().o(defpackage.zbe.NOTIFICATION_CENTER, defpackage.zbd.lD);
        this.b.m(java.lang.Boolean.FALSE);
        if (!defpackage.acyc.aF()) {
            defpackage.mpr.e().a();
        }
        this.e.d();
        this.e = null;
        defpackage.mpk.a();
    }

    @Override // defpackage.nyf
    public final void d() {
        this.g.removeCallbacks(new defpackage.ocy(this, 1));
        if (f()) {
            (f() ? this.e.a() : null).getClass();
            c();
        }
    }

    public final void e() {
        ((defpackage.yqj) f.l().ai((char) 5555)).u("NotificationCenter.show()");
        if (f()) {
            return;
        }
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.zbe zbeVar = defpackage.zbe.NOTIFICATION_CENTER;
        oimVarU.o(zbeVar, defpackage.zbd.lC);
        defpackage.ngy.g().h(nvm.a);
        this.b.m(java.lang.Boolean.TRUE);
        if (!defpackage.acyc.aF()) {
            defpackage.mpr.e().m();
        }
        defpackage.lem.a();
        nxp nxpVar = new nxp();
        defpackage.qts qtsVarN = defpackage.nte.c().b().n(defpackage.nta.j);
        qtsVarN.getClass();
        qtsVarN.l = true;
        qtsVarN.c(2130772025);
        qtsVarN.b(2130772024);
        defpackage.lem.a();
        qtsVarN.n = true != defpackage.lem.a().b() ? 2132149922 : 2132149926;
        if (defpackage.nrr.a().f()) {
            defpackage.mpr.a();
        }
        defpackage.kgu.d(new mjf(this, qtsVarN.a(), nxpVar, 6), "GH.NotificationCtrl", zbeVar, defpackage.zbd.lE, "Unable to show NotificationCenter", new java.lang.Object[0]);
    }

    public final boolean f() {
        defpackage.noz nozVar = this.e;
        return (nozVar == null || nozVar.a() == null) ? false : true;
    }
}
