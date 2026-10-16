package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mun implements defpackage.muj {
    static final /* synthetic */ defpackage.afja[] a = {new defpackage.afgn(defpackage.mun.class, "perLifetimeState", "getPerLifetimeState()Lcom/google/android/apps/auto/components/system/dashboard/DashboardWindowControllerImpl$perLifetimeState$2$1;", 0)};
    public static final /* synthetic */ int e = 0;
    public final defpackage.eqs c;
    private final defpackage.nfb g;
    private final defpackage.eqp i;
    private final defpackage.eqp j;
    public final defpackage.ngb d = new defpackage.ngb(defpackage.nta.q);
    public final defpackage.yqm b = new defpackage.yqm(defpackage.yrs.d("GH.DashWinController"));
    private final defpackage.afhl f = new defpackage.lib(new defpackage.lto(this, 6), defpackage.lhv.a);

    public mun() {
        defpackage.lhy lhyVar = new defpackage.lhy(defpackage.mui.b, 2);
        this.c = lhyVar;
        this.g = new defpackage.nfb();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.afdo afdoVar = defpackage.tcu.a;
        this.i = new defpackage.eqs(bool);
        this.j = defpackage.ebo.f(lhyVar, new defpackage.nnp(defpackage.mui.a, 12));
    }

    private final defpackage.mul d() {
        return (defpackage.mul) this.f.getValue(this, a[0]);
    }

    @Override // defpackage.muj
    public final defpackage.eqp a() {
        return this.c;
    }

    @Override // defpackage.muj
    public final defpackage.eqp b() {
        return this.i;
    }

    @Override // defpackage.muj
    public final defpackage.eqp c() {
        return this.j;
    }

    @Override // defpackage.muj
    public final defpackage.nta e() {
        return defpackage.nta.q;
    }

    @Override // defpackage.muj
    public final void f() {
        defpackage.mul mulVarD = d();
        if (mulVarD.b == null) {
            this.b.l().u("Redundant call to finish()");
            return;
        }
        if (mulVarD.d) {
            defpackage.mwr.a(defpackage.zbd.v, null);
            mulVarD.a(defpackage.mui.c);
        }
        mulVarD.d = false;
        defpackage.noz nozVar = mulVarD.b;
        if (nozVar != null) {
            nozVar.d();
        }
        mulVarD.b = null;
        defpackage.nfb nfbVar = this.g;
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        context.unregisterReceiver(nfbVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final /* synthetic */ void g(boolean z) throws wfo {
        int i = defpackage.mug.a;
        i(z, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final void h(boolean z, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) throws wfo {
        i(z, projectionWindowAnimationParams);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final void i(boolean z, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) throws wfo {
        defpackage.mul mulVarD = d();
        if (!mulVarD.d) {
            this.b.l().u("Redundant call to hide()");
            return;
        }
        mulVarD.d = false;
        mulVarD.e = z || projectionWindowAnimationParams != null;
        if (projectionWindowAnimationParams == null) {
            defpackage.noz nozVar = mulVarD.b;
            if (nozVar != null) {
                nozVar.e(z);
            }
        } else {
            defpackage.noz nozVar2 = mulVarD.b;
            if (nozVar2 != null) {
                nozVar2.h(projectionWindowAnimationParams);
            }
        }
        defpackage.mwr.a(defpackage.zbd.v, null);
        mulVarD.a(defpackage.mui.b);
    }

    @Override // defpackage.muj
    public final /* synthetic */ void j() {
        int i = defpackage.mug.a;
    }

    @Override // defpackage.muj
    public final /* synthetic */ void k() {
        int i = defpackage.mug.a;
        l(true);
    }

    @Override // defpackage.muj
    public final void l(boolean z) {
        if (d().b()) {
            return;
        }
        int i = defpackage.mug.a;
        p(z, null);
    }

    @Override // defpackage.muj
    public final /* synthetic */ void n() {
        int i = defpackage.mug.a;
        p(true, null);
    }

    @Override // defpackage.muj
    public final /* synthetic */ void o(boolean z) {
        int i = defpackage.mug.a;
        p(z, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final void p(boolean z, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) throws wfo {
        defpackage.mul mulVarD = d();
        if (!defpackage.nte.c().b().K()) {
            throw new java.lang.IllegalStateException("Dashboard should only be shown when current display supports it");
        }
        if (z) {
            defpackage.ntb ntbVar = mulVarD.a;
            if ((ntbVar.m() == defpackage.nti.a || ntbVar.m() == defpackage.nti.g || ntbVar.m() == defpackage.nti.h) && !defpackage.nte.c().b().H()) {
                defpackage.mqj mqjVarE = defpackage.mpj.b().e(com.google.android.gms.car.display.CarRegionId.a);
                defpackage.mqg mqgVar = mqjVarE != null ? mqjVarE.b : null;
                defpackage.mqg mqgVar2 = defpackage.mqg.NAVIGATION;
                if (mqgVar != mqgVar2) {
                    android.content.ComponentName componentNameA = defpackage.lhc.a().a(mqgVar2);
                    if (componentNameA != null) {
                        this.b.l().u("Starting navigation for dashboard");
                        defpackage.mpk mpkVarA = defpackage.mpk.a();
                        android.content.Intent intent = new android.content.Intent();
                        intent.setComponent(componentNameA);
                        intent.putExtra("com.google.android.apps.auto.components.system.dashboard.EXTRA_FOR_DASHBOARD", true);
                        intent.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1);
                        mpkVarA.i(intent);
                    }
                } else {
                    this.b.l().u("Navigation already started when opening dashboard");
                }
            }
        }
        if (mulVarD.d) {
            this.b.l().u("Redundant call to show()");
            return;
        }
        mulVarD.d = true;
        int i = 0;
        mulVarD.f = false;
        defpackage.mwr.a(defpackage.zbd.u, null);
        defpackage.noz nozVar = mulVarD.b;
        int i2 = 3;
        if (nozVar == null) {
            defpackage.lel lelVar = defpackage.lem.a;
            lelVar.a();
            defpackage.ntb ntbVar2 = mulVarD.a;
            com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsA = defpackage.nsu.a(ntbVar2, defpackage.nta.q, new defpackage.mtb(ntbVar2, i));
            if (carWindowLayoutParamsA == null) {
                throw new java.lang.IllegalStateException("No dashboard region available");
            }
            java.lang.String string = carWindowLayoutParamsA.r.getString(defpackage.ntb.d);
            boolean zU = string != null ? afzh.u(string, "horizontal", false) : false;
            lelVar.a();
            defpackage.mtc mtcVar = new defpackage.mtc();
            mtcVar.setArguments(defpackage.lyd.m(zU));
            mulVarD.b = (defpackage.noz) defpackage.khg.u(new defpackage.wde("GH.DashWinController", defpackage.zbe.DASHBOARD, defpackage.zbd.r, "Unable to show dashboard", new java.lang.Object[0]), new defpackage.mtd(carWindowLayoutParamsA, mtcVar, i2));
            mulVarD.a(defpackage.mui.a);
            defpackage.nfb nfbVar = this.g;
            android.content.Context context = defpackage.mkp.a.c;
            context.getClass();
            nfbVar.c(context);
            return;
        }
        if (projectionWindowAnimationParams == null) {
            nozVar.j(mulVarD.e);
        } else {
            defpackage.wfp.c();
            defpackage.yqm yqmVar = defpackage.nou.a;
            defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(5324);
            java.lang.String str = nozVar.h;
            yqjVar.M("show(%s): %s", projectionWindowAnimationParams, str);
            defpackage.ysr.bn(!nozVar.e, "show called when %s already finished", str);
            if (nozVar.f) {
                nozVar.f = false;
                defpackage.sax saxVar = nozVar.k;
                defpackage.rct rctVar = nozVar.m;
                defpackage.sau sauVar = (defpackage.sau) saxVar.g.get(rctVar);
                if (sauVar == null) {
                    defpackage.rrx.d(5, "CAR.WM", null, "attempting to show window layout, but inflater not found: %s", rctVar);
                } else {
                    if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
                        defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s showWindowWithAnimation(%s)", sauVar.a, projectionWindowAnimationParams);
                    }
                    try {
                        sauVar.i.s(projectionWindowAnimationParams);
                    } catch (android.os.RemoteException e2) {
                        defpackage.rrx.b("CAR.CLIENT.WM.WIN", e2, "showWindowWithAnimation RemoteException");
                    }
                }
                ((defpackage.yqj) yqmVar.l().ai(5325)).M("show(%s) completed: %s", projectionWindowAnimationParams, str);
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5326)).y("show called when %s not hidden. Nothing to do", str);
            }
        }
        mulVarD.a(defpackage.mui.a);
    }

    @Override // defpackage.muj
    public final /* synthetic */ void q() {
        int i = defpackage.mug.a;
        p(true, null);
    }

    @Override // defpackage.muj
    public final void r(boolean z) {
        int i = defpackage.mug.a;
        p(true, null);
    }

    @Override // defpackage.muj
    public final void s() {
        defpackage.qsh qshVarE = defpackage.kit.b().e();
        qshVarE.getClass();
        defpackage.mul mulVarD = d();
        if (mulVarD.c) {
            return;
        }
        defpackage.ebo.e(defpackage.tcu.E(defpackage.tcu.d(this.c, defpackage.mpj.b().h, new defpackage.mjm(12)))).eM(defpackage.ler.c(), new defpackage.mel(new defpackage.lyi(mulVarD, qshVarE, 7, null), 7));
        defpackage.mpj.b().g(new defpackage.mum(this, mulVarD, qshVarE));
        mulVarD.c = true;
    }

    @Override // defpackage.muj
    public final /* synthetic */ void t(java.util.List list) {
        int i = defpackage.mug.a;
    }

    @Override // defpackage.muj
    public final boolean u() {
        return d().d;
    }

    @Override // defpackage.muj
    public final boolean v() {
        return false;
    }

    @Override // defpackage.muj
    public final boolean w() {
        return d().d || d().f;
    }

    @Override // defpackage.muj
    public final /* synthetic */ void x() {
        int i = defpackage.mug.a;
        i(true, null);
    }

    @Override // defpackage.muj
    public final void y() {
        defpackage.noz nozVar = d().b;
        if (nozVar != null) {
            nozVar.p(null);
        }
    }

    @Override // defpackage.muj
    public final void z(java.io.PrintWriter printWriter) {
        defpackage.mso msoVar;
        printWriter.getClass();
        if (!defpackage.ler.c().g()) {
            printWriter.println("Unable to get dashboard state out of lifetime");
            return;
        }
        defpackage.mul mulVarD = d();
        java.lang.Object objE = mulVarD.h.c.e();
        objE.getClass();
        printWriter.println("Current state: " + ((defpackage.mui) objE) + ", isShowing: " + mulVarD.d + ", hiddenWithAnimation: " + mulVarD.e + ", isFullScreenMaps: " + mulVarD.b());
        defpackage.noz nozVar = mulVarD.b;
        if (nozVar == null || (msoVar = (defpackage.mso) nozVar.a()) == null) {
            return;
        }
        msoVar.h(printWriter);
    }

    @Override // defpackage.muj
    public final void m() {
    }
}
