package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sau implements android.content.ComponentCallbacks, defpackage.rcb {
    private final boolean A;
    private final boolean B;
    private final boolean C;
    private final boolean D;
    private final defpackage.rbp E;
    private boolean F;
    private final defpackage.ret H;
    public final java.lang.String a;
    public final defpackage.rct b;
    public final android.content.Context d;
    public final int e;
    public android.content.Context f;
    public defpackage.rpm g;
    public defpackage.qzv i;
    public android.view.View j;
    android.content.res.Configuration k;
    public boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public boolean r;
    public boolean t;
    public final defpackage.qzx u;
    private final boolean v;
    private final defpackage.rpv w;
    private final defpackage.rpw x;
    private final int z;
    public final java.lang.Object c = new java.lang.Object();
    private final defpackage.rdf y = new defpackage.sao(this, 0);
    public final android.content.res.Configuration h = new android.content.res.Configuration();
    public final java.util.List s = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.List G = new java.util.ArrayList();

    public sau(defpackage.ret retVar, defpackage.rct rctVar, java.lang.String str, android.content.Context context, boolean z, android.os.Handler handler, int i, boolean z2, int i2, defpackage.rpv rpvVar, defpackage.rpw rpwVar, boolean z3, boolean z4, boolean z5, defpackage.rbp rbpVar, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.b = rctVar;
        this.a = str;
        this.d = context;
        this.v = z;
        this.H = retVar;
        this.u = new defpackage.qzx(this, handler);
        this.e = i;
        this.A = z2;
        this.z = i2;
        this.w = rpvVar;
        this.x = rpwVar;
        this.E = rbpVar;
        this.B = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.C = z8;
        this.q = z9;
        this.D = z10;
    }

    public static void q(android.content.res.Configuration configuration, android.content.res.Configuration configuration2, android.content.res.Configuration configuration3) {
        configuration.uiMode = (configuration2.uiMode & (-49)) | (configuration3.uiMode & 48);
    }

    public static final void r(defpackage.rpm rpmVar, com.google.android.gms.car.CarUiInfo carUiInfo) {
        rpmVar.A(new defpackage.rbl(carUiInfo.b, carUiInfo.a, carUiInfo.d, carUiInfo.i, carUiInfo.j));
    }

    private final void s(defpackage.rpm rpmVar) {
        int i = 5;
        if (this.B) {
            try {
                u(rpmVar);
            } catch (java.lang.IllegalStateException e) {
                t(e);
            } catch (defpackage.qst unused) {
                defpackage.rrx.d(5, "CAR.CLIENT.WM.WIN", null, "Swallowing CarNotConnectedException; hope we're tearing down...", new java.lang.Object[0]);
            }
        }
        rpmVar.y();
        this.t = true;
        n();
        try {
            this.i.j();
        } catch (android.os.RemoteException e2) {
            defpackage.rrx.b("CAR.CLIENT.WM.WIN", e2, "onWindowAttached RemoteException");
            defpackage.rbz.g(android.os.Looper.getMainLooper(), new defpackage.ryw(this, i));
        }
    }

    private static void t(java.lang.IllegalStateException illegalStateException) {
        java.lang.String message = illegalStateException.getMessage();
        if (!"Client not connected.".equals(message) && !"Client is not connected.".equals(message)) {
            throw illegalStateException;
        }
        defpackage.rrx.d(5, "CAR.CLIENT.WM.WIN", null, "Ignoring IllegalStateException, hope we're tearing down...", new java.lang.Object[0]);
    }

    private final void u(defpackage.rpm rpmVar) throws defpackage.qst {
        r(rpmVar, this.H.a());
    }

    public final android.content.Context a(android.content.Context context, android.content.res.Configuration configuration, android.view.Display display) {
        try {
            com.google.android.gms.car.CarUiInfo carUiInfoA = this.H.a();
            boolean z = carUiInfoA.b;
            boolean z2 = carUiInfoA.a;
            boolean z3 = carUiInfoA.d;
            configuration.touchscreen = true != z ? 1 : 3;
            configuration.navigation = (z2 || z3) ? 4 : 1;
        } catch (java.lang.IllegalStateException e) {
            t(e);
        } catch (defpackage.qst unused) {
            defpackage.rrx.d(5, "CAR.CLIENT.WM.WIN", null, "Swallowing CarNotConnectedException; hope we're tearing down...", new java.lang.Object[0]);
        }
        android.content.Context contextCreateConfigurationContext = context.createDisplayContext(display).createConfigurationContext(configuration);
        contextCreateConfigurationContext.setTheme(this.z);
        return contextCreateConfigurationContext;
    }

    public final void b(java.io.PrintWriter printWriter) {
        if (this.g == null) {
            printWriter.println("No presentation");
            return;
        }
        printWriter.println("Window ".concat(java.lang.String.valueOf(this.a)));
        printWriter.println("hasFocus = " + this.l);
        printWriter.println("CriticalUi -- isSecureAndNotReadable: " + this.F + " externalCriticalUiStateReady: " + this.r);
        this.g.l(printWriter);
    }

    @Override // defpackage.rcb
    public final defpackage.rbr c() {
        defpackage.rpm rpmVar = this.g;
        if (rpmVar == null) {
            return null;
        }
        if (rpmVar instanceof defpackage.rpk) {
            return ((defpackage.rpk) rpmVar).b;
        }
        throw new java.lang.IllegalStateException("getPresentation not supported");
    }

    @Override // defpackage.rcb
    public final void d(boolean z, defpackage.rph rphVar) {
        android.graphics.Rect rect;
        if (rphVar != null) {
            try {
                rect = rphVar.c;
            } catch (android.os.RemoteException e) {
                defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "onKeyEventComplete RemoteException");
                defpackage.rbz.j(new defpackage.ryw(this, 5));
                return;
            }
        } else {
            rect = null;
        }
        this.i.g(new com.google.android.gms.car.KeyEventCompleteData(z, rect));
    }

    @Override // defpackage.rcb
    public final void e(android.view.WindowManager.LayoutParams layoutParams) {
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s onWindowAttributesChanged(%s): %s", this.a, layoutParams, java.lang.Integer.valueOf(layoutParams.flags));
        }
        if (!this.D || android.os.Build.VERSION.SDK_INT >= 35) {
            return;
        }
        if ((layoutParams.flags & 8192) != 0) {
            this.F = true;
            i();
            n();
        } else if (this.F) {
            this.F = false;
            i();
            n();
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.rcb
    public final void f(boolean z, boolean z2) {
        java.lang.Object obj = this.c;
        synchronized (obj) {
            if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 2)) {
                defpackage.rrx.d(2, "CAR.CLIENT.WM.WIN", null, "%s performWindowFocusChange(hasFocus:%b, inTouchMode:%b) [this.hasFocus:%b]", this.a, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(this.l));
            }
            this.l = z;
            for (usd usdVar : new java.util.ArrayList(this.s)) {
                if (z) {
                    ((defpackage.sau) usdVar.b).s.remove(usdVar);
                    usdVar.a.run();
                }
            }
            obj.notifyAll();
        }
    }

    @Override // defpackage.rcb
    public final boolean g() {
        boolean z;
        synchronized (this.c) {
            z = this.l;
        }
        return z;
    }

    @Override // defpackage.rcb
    public final boolean h(android.view.KeyEvent keyEvent) {
        return false;
    }

    public final void i() {
        boolean z = !this.F && this.r;
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s maybeUpdateCriticalUiStateInner ready:%s secureAndNotReadable:%s", this.a, java.lang.Boolean.valueOf(this.r), java.lang.Boolean.valueOf(this.F));
        }
        try {
            this.i.t(z);
        } catch (android.os.RemoteException e) {
            defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "updateCriticalUiState RemoteException");
        }
    }

    public final void j(int i, defpackage.rph rphVar) {
        int i2;
        if (rphVar != null) {
            try {
                i2 = rphVar.b;
            } catch (android.os.RemoteException e) {
                defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "onMotionEvent RemoteException");
                defpackage.rbz.j(new defpackage.ryw(this, 5));
                return;
            }
        } else {
            i2 = -1;
        }
        this.i.h(new com.google.android.gms.car.TouchEventCompleteData(i, rphVar != null ? rphVar.c : null, i2));
    }

    final void k(com.google.android.gms.car.DrawingSpec drawingSpec) {
        defpackage.rpm rpmVar = this.g;
        if (rpmVar == null) {
            defpackage.rrx.d(5, "CAR.CLIENT.WM.WIN", null, "uiHost is null in onPresentationUiCreated, likely due to concurrent teardown.", new java.lang.Object[0]);
            return;
        }
        rpmVar.t(this.w.K(defpackage.rpt.PRESENTATION_CLEAR_PARENT_PADDING));
        rpmVar.G();
        try {
            u(rpmVar);
            defpackage.rpw rpwVar = this.x;
            rpmVar.C(rpwVar.N("rotary_use_focus_finder"), rpwVar.A("touchpad_focus_navigation_history_max_size", 0), rpwVar.A("touchpad_focus_navigation_history_max_age_ms", 0));
            this.H.b(this.y);
        } catch (java.lang.IllegalStateException e) {
            t(e);
        } catch (defpackage.qst unused) {
            defpackage.rrx.d(5, "CAR.CLIENT.WM.WIN", null, "Swallowing CarNotConnectedException; hope we're tearing down...", new java.lang.Object[0]);
            return;
        }
        android.graphics.Rect rect = drawingSpec.e;
        if (rect == null) {
            rect = new android.graphics.Rect();
        }
        rpmVar.u(rect);
        android.content.Context contextA = rpmVar.a();
        this.f = contextA;
        contextA.registerComponentCallbacks(this);
        android.view.Window windowH = rpmVar.h();
        windowH.getClass();
        if (!this.p) {
            windowH.setCallback(new defpackage.rca(this, this.C));
        }
        if (this.v) {
            rpmVar.m();
            windowH.getDecorView().setBackgroundColor(0);
        }
        this.j = this.b.a(this.f);
        this.k = new android.content.res.Configuration(this.j.getResources().getConfiguration());
        rpmVar.q(this.j);
        if (windowH.getAttributes() != null) {
            windowH.getAttributes().setTitle(this.a);
        }
        s(rpmVar);
    }

    final void l() {
        this.H.c(this.y);
        android.content.Context context = this.f;
        if (context != null) {
            context.unregisterComponentCallbacks(this);
        }
    }

    public final void m(final com.google.android.gms.car.DrawingSpec drawingSpec, android.content.res.Configuration configuration) {
        byte[] bArr = null;
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s onWindowAttached drawingSpec %s config %s", this.a, drawingSpec, configuration);
        }
        android.content.res.Configuration configuration2 = this.h;
        configuration2.densityDpi = drawingSpec.c;
        defpackage.rpm rpmVar = this.g;
        if (rpmVar == null) {
            if (this.A) {
                configuration.getClass();
                q(configuration2, this.d.getResources().getConfiguration(), configuration);
            }
            rpp rppVar = this.p ? new rpp(new sap(this, drawingSpec), this.d, this.z, this.a, new saq(this, drawingSpec)) : new defpackage.rpk(new defpackage.rpl() { // from class: sam
                @Override // defpackage.rpl
                public final android.content.Context a(android.view.Display display) {
                    defpackage.sau sauVar = this.a;
                    android.content.res.Configuration configuration3 = new android.content.res.Configuration(sauVar.h);
                    configuration3.densityDpi = drawingSpec.c;
                    return sauVar.a(sauVar.d, configuration3, display);
                }
            }, this.d, this.z, new defpackage.shg(this, drawingSpec, bArr), this.E, this.w.K(defpackage.rpt.FULLSCREEN_PRESENTATION), this.a, new defpackage.sar(this, drawingSpec));
            this.g = rppVar;
            rppVar.x(drawingSpec);
            this.g.j();
            return;
        }
        rpmVar.x(drawingSpec);
        boolean zF = this.g.F();
        defpackage.rpm rpmVar2 = this.g;
        if (zF) {
            s(rpmVar2);
        } else {
            rpmVar2.j();
        }
    }

    public final void n() {
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s maybeSendOnWindowVisibilityChanged shown:%s secureAndNotReadable:%s", this.a, java.lang.Boolean.valueOf(this.t), java.lang.Boolean.valueOf(this.F));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.G);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((sat) arrayList.get(i)).a();
        }
    }

    public final void o() {
        defpackage.wfp.c();
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "teardown(): %s", this.a);
        }
        this.j = null;
        this.H.c(this.y);
        android.content.Context context = this.f;
        if (context != null) {
            context.unregisterComponentCallbacks(this);
            this.f = null;
        }
        defpackage.rpm rpmVar = this.g;
        if (rpmVar != null) {
            rpmVar.p();
            this.g = null;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s onConfigurationChanged. newApplicationConfig %s view %s", this.a, configuration, this.j);
        }
        if (this.j == null || this.A) {
            if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
                defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s ignoring config change hasLocalNightModeFeature=%b view=%s ", this.a, java.lang.Boolean.valueOf(this.A), this.j);
                return;
            }
            return;
        }
        android.content.res.Configuration configuration2 = this.f.getResources().getConfiguration();
        if ((configuration2.uiMode & 15) != 3) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "ignoring non-car mode configuration change", new java.lang.Object[0]);
            return;
        }
        int iDiff = this.k.diff(configuration2);
        if (iDiff != 0) {
            if ((iDiff & (~this.e)) == 0) {
                this.j.dispatchConfigurationChanged(configuration2);
                return;
            }
            this.j = this.b.a(this.f);
            this.k = new android.content.res.Configuration(configuration2);
            this.g.q(this.j);
        }
    }

    public final void p(android.graphics.Rect rect) {
        defpackage.rpm rpmVar = this.g;
        if (rpmVar != null) {
            rpmVar.D(rect);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
