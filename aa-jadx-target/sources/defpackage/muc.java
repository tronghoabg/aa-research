package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class muc implements defpackage.muj {
    static final /* synthetic */ defpackage.afja[] a = {new defpackage.afgn(defpackage.muc.class, "perLifetimeState", "getPerLifetimeState()Lcom/google/android/apps/auto/components/system/dashboard/DashboardShadeWindowController$perLifetimeState$2$1;", 0)};
    public static final defpackage.yqm b = defpackage.yqm.c("GH.DashShadeWinCtrl");
    public final defpackage.eqs d;
    public final defpackage.eqs e;
    public final defpackage.rat f;
    private final defpackage.nfb j;
    public final defpackage.ngb g = new defpackage.ngb(defpackage.nta.r);
    private final defpackage.afhl i = new defpackage.lib(new defpackage.lto(this, 5), defpackage.lhv.a);
    public final defpackage.eqs c = new defpackage.lhy(defpackage.mui.b, 2);

    public muc() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.d = new defpackage.lhy(bool, 1);
        this.e = new defpackage.lhy(bool, 1);
        this.j = new defpackage.nfb();
        this.f = new defpackage.rat(this);
    }

    private final defpackage.noz A(defpackage.ntb ntbVar) {
        java.lang.Object objU = defpackage.khg.u(new defpackage.wde("GH.DashShadeWinCtrl", defpackage.zbe.DASHBOARD, defpackage.zbd.r, "Unable to show dashboard", new java.lang.Object[0]), new defpackage.mtd(ntbVar, this, 2));
        objU.getClass();
        return (defpackage.noz) objU;
    }

    private final void B() {
        defpackage.ntb ntbVar = d().a;
        if ((ntbVar.m() == defpackage.nti.a || ntbVar.m() == defpackage.nti.g || ntbVar.m() == defpackage.nti.h) && !ntbVar.H()) {
            defpackage.mqj mqjVarE = defpackage.mpj.b().e(com.google.android.gms.car.display.CarRegionId.a);
            defpackage.mqg mqgVar = mqjVarE != null ? mqjVarE.b : null;
            defpackage.mqg mqgVar2 = defpackage.mqg.NAVIGATION;
            if (mqgVar == mqgVar2) {
                b.l().u("Navigation already started when opening dashboard");
                return;
            }
            android.content.ComponentName componentNameA = defpackage.lhc.a().a(mqgVar2);
            if (componentNameA != null) {
                b.l().u("Starting navigation for dashboard");
                defpackage.mpk mpkVarA = defpackage.mpk.a();
                android.content.Intent intent = new android.content.Intent();
                intent.setComponent(componentNameA);
                intent.putExtra("com.google.android.apps.auto.components.system.dashboard.EXTRA_FOR_DASHBOARD", true);
                intent.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1);
                mpkVarA.i(intent);
            }
        }
    }

    @Override // defpackage.muj
    public final defpackage.eqp a() {
        return this.c;
    }

    @Override // defpackage.muj
    public final defpackage.eqp b() {
        return this.d;
    }

    @Override // defpackage.muj
    public final defpackage.eqp c() {
        return this.e;
    }

    public final mua d() {
        return (mua) this.i.getValue(this, a[0]);
    }

    @Override // defpackage.muj
    public final defpackage.nta e() {
        return defpackage.nta.r;
    }

    @Override // defpackage.muj
    public final void f() {
        mua muaVarD = d();
        if (muaVarD.b == null) {
            b.l().u("Redundant call to finish()");
            return;
        }
        if (muaVarD.d) {
            defpackage.mwr.a(defpackage.zbd.v, null);
            muaVarD.b(defpackage.mui.c);
        }
        muaVarD.d = false;
        muaVarD.g = false;
        muaVarD.h = 0;
        defpackage.noz nozVar = muaVarD.b;
        if (nozVar != null) {
            nozVar.d();
        }
        muaVarD.b = null;
        defpackage.nfb nfbVar = this.j;
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        context.unregisterReceiver(nfbVar);
        mty.a.a().a();
        defpackage.eqs eqsVar = this.d;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        eqsVar.m(bool);
        this.e.m(bool);
    }

    @Override // defpackage.muj
    public final /* synthetic */ void g(boolean z) {
        int i = defpackage.mug.a;
        h(z, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final void h(boolean z, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) throws wfo {
        mua muaVarD = d();
        if (!muaVarD.d) {
            b.l().u("Redundant call to hide()");
            return;
        }
        muaVarD.d = false;
        muaVarD.g = false;
        muaVarD.h = 0;
        muaVarD.e = z || projectionWindowAnimationParams != null;
        if (projectionWindowAnimationParams == null) {
            defpackage.noz nozVar = muaVarD.b;
            if (nozVar != null) {
                nozVar.e(z);
            }
        } else {
            defpackage.noz nozVar2 = muaVarD.b;
            if (nozVar2 != null) {
                nozVar2.h(projectionWindowAnimationParams);
            }
        }
        muaVarD.b(defpackage.mui.b);
        defpackage.eqs eqsVar = this.d;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        eqsVar.m(bool);
        this.e.m(bool);
        mty.a.a().a();
        defpackage.mwr.a(defpackage.zbd.v, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final void i(boolean z, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) throws wfo {
        mua muaVarD = d();
        if (!muaVarD.g) {
            b.l().u("Not expanded, early exiting collapse");
            return;
        }
        defpackage.noz nozVar = muaVarD.b;
        if (nozVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        nozVar.l(0, null);
        muaVarD.g = false;
        muaVarD.b(defpackage.mui.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final void j() throws wfo {
        mua muaVarD = d();
        this.d.m(java.lang.Boolean.TRUE);
        defpackage.nth nthVarL = defpackage.nte.c().b().l();
        int i = nthVarL != null ? ((defpackage.ymx) nthVarL.e).c : 1;
        int i2 = muaVarD.h;
        int i3 = i - 1;
        if (i2 >= i3) {
            muaVarD.i = false;
        } else if (i2 <= 1) {
            muaVarD.i = true;
        }
        int iMin = muaVarD.i ? java.lang.Math.min(i2 + 1, i3) : 1;
        b.l().S("onDragHandleClicked: current=%d, next=%d, max=%d, isExpanding=%b", java.lang.Integer.valueOf(muaVarD.h), java.lang.Integer.valueOf(iMin), java.lang.Integer.valueOf(i3), java.lang.Boolean.valueOf(muaVarD.i));
        defpackage.noz nozVar = muaVarD.b;
        if (nozVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        nozVar.l(iMin, null);
    }

    @Override // defpackage.muj
    public final /* synthetic */ void k() {
        int i = defpackage.mug.a;
        l(true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final void l(boolean z) throws wfo {
        if (d().a() > 0) {
            int i = defpackage.mug.a;
            p(z, null);
            return;
        }
        defpackage.mqj mqjVarF = defpackage.mpj.b().f();
        if (mqjVarF == null || mqjVarF.b == defpackage.mqg.NAVIGATION) {
            r(z);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final void m() throws wfo {
        mua muaVarD = d();
        if (!muaVarD.g) {
            b.l().u("Dashboard shade not expanded, unable to retract");
            return;
        }
        int i = muaVarD.h;
        if (i <= 0) {
            ((defpackage.yqj) b.h()).w("Expanded but state is not retractable %s", i);
            return;
        }
        if (i == 1) {
            x();
            return;
        }
        defpackage.noz nozVar = muaVarD.b;
        if (nozVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        nozVar.l(i - 1, null);
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
        mua muaVarD = d();
        defpackage.ntb ntbVar = muaVarD.a;
        if (!ntbVar.K()) {
            throw new java.lang.IllegalStateException("Dashboard should only be shown when current display supports it");
        }
        boolean z2 = false;
        muaVarD.f = false;
        if (z) {
            B();
        }
        if (muaVarD.g) {
            b.l().u("Already expanded, early exiting expand");
            return;
        }
        if (muaVarD.b == null) {
            muaVarD.b = A(ntbVar);
            defpackage.nfb nfbVar = this.j;
            android.content.Context context = defpackage.mkp.a.c;
            context.getClass();
            nfbVar.c(context);
        }
        defpackage.nth nthVarL = ntbVar.l();
        defpackage.ygw ygwVar = nthVarL != null ? nthVarL.e : null;
        int iG = (ygwVar == null || ((defpackage.ymx) ygwVar).c < 2) ? 1 : defpackage.afqt.g(muaVarD.a(), 1, defpackage.afga.ab(ygwVar));
        defpackage.noz nozVar = muaVarD.b;
        if (nozVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        nozVar.l(iG, projectionWindowAnimationParams);
        muaVarD.d = true;
        muaVarD.g = true;
        muaVarD.b(defpackage.mui.a);
        muaVarD.h = iG;
        defpackage.eqs eqsVar = this.e;
        if (ygwVar != null && iG == defpackage.afga.ab(ygwVar)) {
            z2 = true;
        }
        eqsVar.m(java.lang.Boolean.valueOf(z2));
        mty.a.a().b(ygwVar != null ? (java.lang.Integer) defpackage.afga.aC(ygwVar, iG) : null);
    }

    @Override // defpackage.muj
    public final /* synthetic */ void q() {
        int i = defpackage.mug.a;
        r(true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final void r(boolean z) throws wfo {
        mua muaVarD = d();
        defpackage.ntb ntbVar = muaVarD.a;
        if (!ntbVar.K()) {
            throw new java.lang.IllegalStateException("Dashboard should only be shown when current display supports it");
        }
        if (z) {
            B();
        }
        if (muaVarD.d) {
            b.l().u("Redundant call to show()");
            return;
        }
        muaVarD.d = true;
        defpackage.nth nthVarL = ntbVar.l();
        defpackage.ygw ygwVar = nthVarL != null ? nthVarL.e : null;
        mty.a.a().b(ygwVar != null ? (java.lang.Integer) defpackage.afga.aB(ygwVar) : null);
        muaVarD.f = false;
        defpackage.mwr.a(defpackage.zbd.u, null);
        muaVarD.b(defpackage.mui.b);
        muaVarD.h = 0;
        muaVarD.c(0);
        defpackage.noz nozVar = muaVarD.b;
        if (nozVar != null) {
            nozVar.l(0, null);
            return;
        }
        muaVarD.b = A(ntbVar);
        defpackage.nfb nfbVar = this.j;
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        nfbVar.c(context);
    }

    @Override // defpackage.muj
    public final void s() {
        mua muaVarD = d();
        if (muaVarD.c) {
            return;
        }
        defpackage.mpj.b().g(new mub(this, muaVarD));
        muaVarD.c = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.muj
    public final void t(java.util.List list) throws wfo {
        defpackage.noz nozVar;
        if (defpackage.ler.c().i() || (nozVar = d().b) == null) {
            return;
        }
        defpackage.wfp.c();
        defpackage.ysr.bn(!nozVar.e, "requestDraggableAreaChange called when %s already finished", nozVar.h);
        defpackage.rct rctVar = nozVar.m;
        defpackage.sau sauVar = (defpackage.sau) nozVar.k.g.get(rctVar);
        if (sauVar == null) {
            defpackage.rrx.d(5, "CAR.WM", null, "attempting to request draggable area change, but inflater not found: %s", rctVar);
            return;
        }
        try {
            sauVar.i.m(list);
        } catch (android.os.RemoteException e) {
            defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "requestDraggableAreaChange RemoteException");
        }
    }

    @Override // defpackage.muj
    public final boolean u() {
        return d().g;
    }

    @Override // defpackage.muj
    public final boolean v() {
        return d().h > 1;
    }

    @Override // defpackage.muj
    public final boolean w() {
        return d().g || d().f;
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
        printWriter.getClass();
        if (!defpackage.ler.c().g()) {
            printWriter.println("Unable to get dashboard state out of lifetime");
            return;
        }
        mua muaVarD = d();
        java.lang.Object objE = muaVarD.j.c.e();
        objE.getClass();
        printWriter.println("Dashboard Shade current state: " + ((defpackage.mui) objE) + ", isShowing: " + muaVarD.d + ", isExpanded: " + muaVarD.g + " hiddenWithAnimation: " + muaVarD.e + ", savedDragStep: " + muaVarD.a() + ", currentDragStep: " + muaVarD.h + ", isExpanding: " + muaVarD.i);
        mty mtyVarA = mty.a.a();
        boolean z = mtyVarA.d().a;
        java.lang.Object obj = mtyVarA.d().b;
        java.lang.Object obj2 = mtyVarA.d().d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DashboardShadeScrimController: isShowing=");
        sb.append(z);
        sb.append(", scrimView=");
        sb.append(obj != null);
        sb.append(", viewInflater=");
        sb.append(obj2 != null);
        printWriter.println(sb.toString());
    }
}
