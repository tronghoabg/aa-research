package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ror implements android.view.KeyEvent.Callback, defpackage.qrk, defpackage.qre, defpackage.rcb {
    public static final android.util.SparseArray a;
    public java.lang.Object A;
    public com.google.android.gms.car.DrawingSpec B;
    public final defpackage.rdf C;
    public final java.lang.Object D;
    public boolean E;
    public volatile int F;
    final defpackage.rbz G;
    public boolean H;
    public defpackage.qrd I;
    public defpackage.qyq J;
    public defpackage.oml K;
    public defpackage.kwv L;
    public vbd M;
    private boolean N;
    private boolean O;
    private boolean P;
    private android.content.ComponentName Q;
    private final android.view.KeyEvent.DispatcherState R;
    public final android.util.Pair b;
    public final java.util.concurrent.Semaphore c;
    public final java.lang.Runnable d;
    public final android.os.IBinder.DeathRecipient e;
    public android.app.Service f;
    public android.content.Context g;
    public java.lang.Class h;
    public defpackage.qyu i;
    public com.google.android.gms.car.display.CarRegionId j;
    public defpackage.rpm k;
    public defpackage.qsh l;
    public android.content.Intent m;
    public android.os.Bundle n;
    public android.content.res.Configuration o;
    public boolean p;
    public int q;
    public volatile boolean r;
    public android.view.View s;
    public java.lang.String t;
    public final android.graphics.Rect u;
    public final android.graphics.Rect v;
    public final defpackage.rfc w;
    public boolean x;
    public final defpackage.qrb y;
    public final boolean z;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray(7);
        a = sparseArray;
        sparseArray.put(0, "INITIALIZING");
        sparseArray.put(1, "CREATED");
        sparseArray.put(2, "STOPPED");
        sparseArray.put(3, "STARTED");
        sparseArray.put(4, "PAUSED");
        sparseArray.put(5, "RESUMED");
        sparseArray.put(6, "FINISHED");
    }

    public ror(byte[] bArr) {
        defpackage.rbz rbzVar = new defpackage.rbz(false);
        this.c = new java.util.concurrent.Semaphore(0);
        this.d = new defpackage.qtk(this, 9, null);
        this.e = new defpackage.roh(this, 0);
        this.N = false;
        this.r = false;
        this.u = new android.graphics.Rect();
        this.v = new android.graphics.Rect();
        this.x = true;
        this.C = new defpackage.sao(this, 1);
        this.D = new java.lang.Object();
        this.R = new android.view.KeyEvent.DispatcherState();
        this.F = 0;
        this.G = rbzVar;
        this.z = true;
        this.b = android.util.Pair.create(-1, null);
        defpackage.rfc rfcVar = new defpackage.rfc(android.os.Looper.getMainLooper(), new defpackage.qtk(this, 10, null));
        this.w = rfcVar;
        this.y = new defpackage.roi(this, rfcVar);
    }

    private final void A() {
        m(this.B);
        this.k.j();
        this.k.u(this.u);
        this.k.r(this.v);
        x();
    }

    private final void B(android.view.WindowManager.LayoutParams layoutParams) {
        try {
            defpackage.qrd qrdVar = this.I;
            if (qrdVar != null) {
                qrdVar.u(layoutParams);
            }
        } catch (java.lang.NoSuchMethodError unused) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Unable to deliver onWindowAttributesChanged callback", new java.lang.Object[0]);
        }
    }

    private final void C() {
        defpackage.rfc rfcVar = this.w;
        if (rfcVar != null) {
            rfcVar.J(this.C);
        }
        defpackage.rpm rpmVar = this.k;
        if (rpmVar != null) {
            rpmVar.z();
        }
    }

    private static final defpackage.qrd D(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return (defpackage.qrd) classLoader.loadClass(str).getConstructor(null).newInstance(null);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Exception while instantiating class ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    public static java.lang.String i(int i) {
        android.util.SparseArray sparseArray = a;
        return sparseArray.get(i) == null ? "Unknown" : (java.lang.String) sparseArray.get(i);
    }

    private final int z(java.lang.String str, int i) {
        try {
            return this.w.A(str, i);
        } catch (defpackage.qst e) {
            defpackage.rrx.d(5, "CAR.PROJECTION.CAHI", e, "Unable to connect to car service to get %s. Using default value %s", str, java.lang.Integer.valueOf(i));
            return i;
        }
    }

    @Override // defpackage.qre
    public final void a() {
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s.finish()", this.t);
        }
        if (!this.r) {
            this.r = true;
            new defpackage.stq(android.os.Looper.getMainLooper()).postAtFrontOfQueue(new defpackage.rid(this, 6, null));
        } else if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Already finishing %s, ignoring duplicate finish", this.t);
        }
    }

    @Override // defpackage.qre
    public final void b(android.view.View view) {
        this.s = view;
        if (view != null) {
            this.k.q(view);
        }
    }

    @Override // defpackage.rcb
    public final defpackage.rbr c() {
        defpackage.rpm rpmVar = this.k;
        if (rpmVar instanceof defpackage.rpk) {
            return ((defpackage.rpk) rpmVar).b;
        }
        throw new java.lang.IllegalStateException("getPresentation not supported");
    }

    @Override // defpackage.rcb
    public final void d(boolean z, defpackage.rph rphVar) {
        try {
            if (this.i != null) {
                if (!this.w.p(defpackage.rbf.L)) {
                    this.i.k(z);
                } else {
                    this.i.j(new com.google.android.gms.car.KeyEventCompleteData(z, rphVar.c));
                }
            }
        } catch (android.os.RemoteException unused) {
            t();
        }
    }

    @Override // defpackage.rcb
    public final void e(android.view.WindowManager.LayoutParams layoutParams) {
        defpackage.rpm rpmVar = this.k;
        if (rpmVar != null) {
            rpmVar.s((layoutParams.flags & 1024) != 0);
        }
        B(layoutParams);
    }

    @Override // defpackage.rcb
    public final void f(boolean z, boolean z2) {
        java.lang.Object obj = this.D;
        synchronized (obj) {
            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "%s performWindowFocusChange(hasFocus:%b, inTouchMode%b) [activityHasWindowFocus:%b]", this.t, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(this.E));
            }
            this.E = z;
            obj.notifyAll();
        }
        if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s %s.onWindowFocusChanged, focus=%b, touch mode=%b", this.Q.toShortString(), this.t, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2));
        }
        this.I.x(z);
    }

    @Override // defpackage.rcb
    public final boolean g() {
        boolean z;
        synchronized (this.D) {
            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "%s hasWindowFocus() [activityHasWindowFocus:%b]", this.t, java.lang.Boolean.valueOf(this.E));
            }
            z = this.E;
        }
        return z;
    }

    @Override // defpackage.rcb
    public final boolean h(android.view.KeyEvent keyEvent) {
        return this.I != null && keyEvent.dispatch(this, this.R, this);
    }

    public final void j() {
        if (this.G.l(this.g, android.os.Binder.getCallingUid()) || this.g.checkCallingPermission("android.permission.CAPTURE_VIDEO_OUTPUT") == 0) {
            return;
        }
        throw new java.lang.SecurityException("projection client manager does not have permission:android.permission.CAPTURE_VIDEO_OUTPUT pid:" + android.os.Binder.getCallingPid() + " uid:" + android.os.Binder.getCallingUid());
    }

    public final void k() {
        defpackage.rfc rfcVar = this.w;
        this.k.t(rfcVar.K(defpackage.rpt.PRESENTATION_CLEAR_PARENT_PADDING));
        this.k.H();
        this.k.u(this.u);
        this.k.r(this.v);
        boolean zP = rfcVar.p(defpackage.rbf.G);
        defpackage.rpm rpmVar = this.k;
        if (zP) {
            u(rpmVar.i());
        } else {
            v(rpmVar.b().getResources());
        }
        w();
        try {
            rfcVar.L(com.google.android.gms.car.display.CarDisplayId.a).b(this.C);
        } catch (defpackage.qst unused) {
            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s attachUiHost while not connected to car", this.t);
            }
        }
        defpackage.rfc rfcVar2 = this.w;
        if (!rfcVar2.p(defpackage.rbf.ab)) {
            android.view.Window windowH = this.k.h();
            windowH.getClass();
            windowH.setCallback(new defpackage.rca(this, rfcVar2.p(defpackage.rbf.ac)));
        }
        if (this.k.h().getAttributes() != null) {
            this.k.h().getAttributes().setTitle(this.t);
        }
        if (this.N) {
            return;
        }
        boolean zP2 = rfcVar2.p(defpackage.rbf.G);
        defpackage.qrd qrdVar = this.I;
        if (zP2) {
            qrdVar.L(this.k.i());
        } else {
            qrdVar.L(this.k.b());
        }
        defpackage.qrd qrdVar2 = this.I;
        if (android.util.Log.isLoggable("CAR.PROJECTION", 2)) {
            android.util.Log.v("CAR.PROJECTION", "Context DPI: " + qrdVar2.getResources().getConfiguration().densityDpi);
        }
        qrdVar2.e = this;
        this.N = true;
    }

    public final void l() {
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s.destroyUiHost()", this.t);
        }
        C();
        defpackage.rpm rpmVar = this.k;
        if (rpmVar != null) {
            rpmVar.p();
            this.k = null;
        }
    }

    public final void m(com.google.android.gms.car.DrawingSpec drawingSpec) {
        if (this.k == null) {
            if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s.createUiHost()", this.t);
            }
            defpackage.rfc rfcVar = this.w;
            boolean zP = rfcVar.p(defpackage.rbf.G);
            boolean zP2 = rfcVar.p(defpackage.rbf.V);
            boolean zP3 = rfcVar.p(defpackage.rbf.X);
            int iZ = 10;
            int iZ2 = 20;
            if (rfcVar.p(defpackage.rbf.J)) {
                iZ = z("projected_presentation_config_max_checks", 10);
                iZ2 = z("projected_presentation_config_check_delay", 20);
            }
            defpackage.rbo rboVarA = defpackage.rbp.a();
            rboVarA.h(zP);
            rboVarA.g(zP2);
            rboVarA.i(zP3);
            rboVarA.c(rfcVar.p(defpackage.rbf.K));
            rboVarA.f(iZ);
            rboVarA.d(iZ2);
            rboVarA.b(rfcVar.p(defpackage.rbf.F));
            rboVarA.e(rfcVar.p(defpackage.rbf.af));
            defpackage.rbp rbpVarA = rboVarA.a();
            boolean zK = rfcVar.K(defpackage.rpt.FULLSCREEN_PRESENTATION);
            if (android.os.Build.VERSION.SDK_INT < 36 || !rfcVar.p(defpackage.rbf.ab)) {
                this.k = new defpackage.rpk(new defpackage.rpl() { // from class: rof
                    @Override // defpackage.rpl
                    public final android.content.Context a(android.view.Display display) {
                        return this.a.f;
                    }
                }, this.g, 0, null, rbpVarA, zK, this.f.getPackageName() + "/" + this.h.getName(), new defpackage.rog(this));
            } else {
                this.k = new rpp(new roe(this), this.g, defpackage.rox.a(this.f), this.f.getPackageName() + "/" + this.h.getName(), new rok(this));
            }
        }
        this.k.x(drawingSpec);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public final void n(int i, boolean z) {
        if (this.I == null) {
            return;
        }
        int i2 = this.F;
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s.moveActivityToState() from: %s to: %s", this.t, i(i2), i(i));
        }
        if (i2 >= i) {
            if (i2 > i) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        this.I.I();
                        this.F = 4;
                        if (this.r && this.k.h() != null && this.k.h().getDecorView() != null) {
                            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                                defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "%s moveActivityToState(newState:%d) [currentState:%d]", this.t, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
                            }
                            f(false, this.x);
                            boolean zP = this.w.p(defpackage.rbf.T);
                            defpackage.rpm rpmVar = this.k;
                            if (zP) {
                                rpmVar.o(new com.google.android.gms.car.InputFocusChangedEvent(false, false, -1, null));
                            } else {
                                rpmVar.h().getDecorView().dispatchWindowFocusChanged(false);
                            }
                        }
                    }
                    if (i < 3) {
                        if (!this.r) {
                            android.os.Bundle bundle = new android.os.Bundle();
                            this.I.g(bundle);
                            this.n = bundle;
                            this.O = true;
                            try {
                                defpackage.qyu qyuVar = this.i;
                                if (qyuVar != null) {
                                    qyuVar.e(bundle);
                                }
                            } catch (android.os.RemoteException unused) {
                                new defpackage.stq(android.os.Looper.getMainLooper()).post(this.d);
                            }
                        }
                        this.I.j();
                        this.F = 2;
                    }
                }
                if (i < 2) {
                    if (z) {
                        this.A = this.I.E();
                    }
                    this.I.G();
                    this.F = 0;
                    this.I = null;
                    C();
                    return;
                }
                return;
            }
            return;
        }
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
            }
            if (i > 4) {
                this.I.K();
                this.F = 5;
                this.I.J();
                if (this.H || !this.r) {
                    this.k.y();
                } else {
                    defpackage.rrx.d(5, "CAR.PROJECTION.CAHI", null, "%s resume not completing, activity is finishing", this.t);
                    return;
                }
            }
        }
        A();
        if (this.w.p(defpackage.rbf.I)) {
            w();
        }
        this.I.a(this.n);
        this.F = 1;
        if (this.H && this.r) {
            defpackage.rrx.d(5, "CAR.PROJECTION.CAHI", null, "%s create not completing, activity is finishing", this.t);
            return;
        }
        B(this.k.h().getAttributes());
        if (i > 2) {
            A();
            b(this.s);
            this.I.h();
            this.F = 3;
            if (this.H && this.r) {
                defpackage.rrx.d(5, "CAR.PROJECTION.CAHI", null, "%s start not completing, activity is finishing", this.t);
                return;
            }
            android.os.Bundle bundle2 = this.n;
            if (bundle2 != null && this.O) {
                this.I.t(bundle2);
                this.O = false;
            }
        }
        if (i > 4) {
            this.I.K();
            this.F = 5;
            this.I.J();
            if (this.H) {
            }
            this.k.y();
        }
    }

    public final void o(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent, boolean z) {
        defpackage.qyu qyuVar;
        if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
            defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange(event:%s, callback:%b)", this.t, inputFocusChangedEvent, java.lang.Boolean.valueOf(z));
        }
        if (!y()) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange() No-Op as CAR_API not connected", this.t);
            return;
        }
        this.x = inputFocusChangedEvent.b;
        defpackage.rpm rpmVar = this.k;
        if (rpmVar != null) {
            rpmVar.o(inputFocusChangedEvent);
        } else {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange() uiHost is null", this.t);
        }
        if (!z || (qyuVar = this.i) == null) {
            return;
        }
        try {
            qyuVar.i();
        } catch (android.os.RemoteException e) {
            defpackage.rrx.d(6, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange() [RemoteException:%s]", this.t, e);
            defpackage.rbz.h(this.d);
        }
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        return this.I.p(i, keyEvent);
    }

    public final void p(com.google.android.gms.car.display.CarRegionId carRegionId, com.google.android.gms.car.DrawingSpec drawingSpec, android.content.Intent intent, android.content.res.Configuration configuration, android.os.Bundle bundle) {
        defpackage.rpm rpmVar;
        if (y()) {
            android.os.Bundle bundleExtra = intent.getBundleExtra("PROJECTION_CONFIGURATION");
            this.H = bundleExtra != null && bundleExtra.getBoolean("CANCEL_PENDING_LIFECYCLE_EVENTS_FOR_FINISH_ENABLED");
            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "projectionConfigBundle: %s", bundleExtra);
            }
            if (this.H && this.r) {
                defpackage.rrx.d(5, "CAR.PROJECTION.CAHI", null, "%s onProjectionStart not sent, activity is finishing", this.t);
                defpackage.qyu qyuVar = this.i;
                if (qyuVar != null) {
                    try {
                        qyuVar.q();
                        return;
                    } catch (android.os.RemoteException unused) {
                        t();
                        return;
                    }
                }
                return;
            }
            this.B = drawingSpec;
            this.j = carRegionId;
            this.o = configuration;
            v(this.f.getResources());
            m(drawingSpec);
            s(drawingSpec);
            this.n = bundle;
            if (this.Q == null) {
                this.Q = intent.getComponent();
            }
            android.os.Bundle bundle2 = this.n;
            if (bundle2 != null) {
                bundle2.setClassLoader(this.f.getClassLoader());
            }
            if (this.I == null) {
                this.I = D(this.f.getClassLoader(), this.h.getName());
                this.N = false;
            }
            if ((intent == null && this.m != null) || (intent != null && !intent.filterEquals(this.m))) {
                this.m = intent;
            }
            n(3, false);
            if (this.w.p(defpackage.rbf.F) && (rpmVar = this.k) != null) {
                rpmVar.D(this.u);
            }
            x();
            defpackage.qyu qyuVar2 = this.i;
            if (qyuVar2 != null) {
                try {
                    qyuVar2.q();
                } catch (android.os.RemoteException unused2) {
                    t();
                }
            }
        }
    }

    public final void q() {
        this.p = false;
        try {
            defpackage.qyu qyuVar = this.i;
            if (qyuVar != null) {
                qyuVar.t();
            }
        } catch (android.os.RemoteException unused) {
            t();
        }
    }

    public final void r() {
        com.google.android.gms.car.DrawingSpec drawingSpec = this.B;
        int i = this.F;
        boolean zE = this.k.E();
        rcs rcsVarA = zE ? rcs.a(this.s) : null;
        if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
            defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "%s onVideoConfigurationChange() [hasInputFocus:%b, inTouchMode:%b]", this.t, java.lang.Boolean.valueOf(zE), java.lang.Boolean.valueOf(this.x));
        }
        n(0, true);
        if (drawingSpec != null) {
            m(drawingSpec);
            s(drawingSpec);
        } else {
            this.k.k();
        }
        this.I = D(this.f.getClassLoader(), this.h.getName());
        this.N = false;
        android.os.Bundle bundle = this.n;
        if (bundle != null) {
            bundle.setClassLoader(this.f.getClassLoader());
        }
        n(i, false);
        android.view.View view = this.s;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new roq(this, zE, this.s, rcsVarA));
        } else if (zE) {
            this.k.o(new com.google.android.gms.car.InputFocusChangedEvent(true, this.x, -1, null));
        }
    }

    public final void s(com.google.android.gms.car.DrawingSpec drawingSpec) {
        android.graphics.Rect rect = drawingSpec.e;
        if (rect == null) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "spec has no insets. Will not update uiHost.", new java.lang.Object[0]);
            return;
        }
        android.graphics.Rect rect2 = this.u;
        rect2.set(rect);
        defpackage.rpm rpmVar = this.k;
        if (rpmVar != null) {
            rpmVar.u(rect2);
            this.k.r(new android.graphics.Rect());
        } else {
            boolean z2 = defpackage.rrx.a;
            defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "System window insets set before uiHost attached. Will apply to uiHost when attaching.", new java.lang.Object[0]);
        }
    }

    public final void t() {
        if (this.P) {
            return;
        }
        this.P = true;
        n(0, false);
        l();
        this.w.O(null);
    }

    public final void u(defpackage.rbs rbsVar) {
        defpackage.ysr.bk(this.w.p(defpackage.rbf.G), "Configuration context must be enabled to call updateContextConfigurationForNightMode");
        if (this.o == null) {
            return;
        }
        android.content.res.Resources resources = rbsVar.getResources();
        int i = resources.getConfiguration().uiMode & (-49);
        resources.getConfiguration().uiMode = (this.o.uiMode & 48) | i;
        rbsVar.a(resources.getConfiguration(), resources.getDisplayMetrics());
    }

    public final void v(android.content.res.Resources resources) {
        if (this.o == null) {
            return;
        }
        int i = resources.getConfiguration().uiMode & (-49);
        resources.getConfiguration().uiMode = (this.o.uiMode & 48) | i;
        resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
    }

    public final void w() {
        com.google.android.gms.car.CarUiInfo carUiInfoU;
        boolean z;
        int iA;
        int iA2;
        defpackage.rfc rfcVar = this.w;
        if (!rfcVar.P() || this.r) {
            return;
        }
        try {
            carUiInfoU = rfcVar.C().u();
        } catch (android.os.RemoteException e) {
            defpackage.rrx.d(6, "CAR.PROJECTION.CAHI", e, "%s Unable to get configuration from CarService!", this.t);
            carUiInfoU = null;
        } catch (java.lang.IllegalStateException e2) {
            try {
                defpackage.oml.G(e2);
            } catch (java.lang.IllegalStateException e3) {
                defpackage.rrx.d(6, "CAR.PROJECTION.CAHI", e3, "%s Unable to get configuration from CarService!", this.t);
            } catch (defpackage.qst unused) {
                if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 3)) {
                    defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s Configuration change while not connected to car", this.t);
                }
            }
            carUiInfoU = null;
        }
        defpackage.rpm rpmVar = this.k;
        if (rpmVar == null) {
            if (defpackage.omv.c("CAR.PROJECTION.CAHI", 5)) {
                defpackage.rrx.d(5, "CAR.PROJECTION.CAHI", null, "updateUiHostForInputMethods invoked when uiHost not set", new java.lang.Object[0]);
                return;
            }
            return;
        }
        if (carUiInfoU != null) {
            rpmVar.A(new defpackage.rbl(carUiInfoU.b, carUiInfoU.a, carUiInfoU.d, carUiInfoU.i, carUiInfoU.j));
            z = carUiInfoU.d;
        } else {
            z = false;
        }
        try {
            defpackage.rfc rfcVar2 = this.w;
            boolean zN = rfcVar2.N("rotary_use_focus_finder");
            if (z) {
                iA = rfcVar2.A("touchpad_focus_navigation_history_max_size", 0);
                iA2 = rfcVar2.A("touchpad_focus_navigation_history_max_age_ms", 0);
            } else {
                iA = 0;
                iA2 = 0;
            }
            this.k.C(zN, iA, iA2);
        } catch (defpackage.qst unused2) {
            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s Configuration change while not connected to car", this.t);
            }
        }
    }

    public final void x() {
        android.content.res.Configuration configuration;
        defpackage.rpm rpmVar = this.k;
        if (rpmVar == null || (configuration = this.o) == null) {
            return;
        }
        rpmVar.v(configuration);
    }

    public final boolean y() {
        if (this.w.P()) {
            return true;
        }
        defpackage.rrx.d(5, "CAR.PROJECTION.CAHI", null, "%s ICar not available", this.t);
        return false;
    }

    public ror() {
        throw null;
    }
}
