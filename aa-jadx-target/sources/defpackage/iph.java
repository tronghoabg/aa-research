package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iph extends defpackage.inn {
    public static final defpackage.yqm E = defpackage.yqm.c("CAR.CAM");
    static final android.util.SparseArray F;
    public static final defpackage.inm G;
    public final defpackage.ipg H;
    public final java.lang.Runnable I;
    public int J;
    protected int K;
    public volatile boolean L;
    public final defpackage.ipd M;
    public final defpackage.jhl N;
    public volatile defpackage.qyr O;
    boolean P;
    public android.os.Bundle Q;
    public volatile boolean R;
    public volatile boolean S;
    public boolean T;
    public volatile boolean U;
    public boolean V;
    public int W;
    public int X;
    public final java.lang.Object Y;
    public final java.util.Queue Z;
    public final java.util.Queue aa;
    public com.google.android.gms.car.InputFocusChangedEvent ab;
    public final defpackage.iyb ac;
    public int ad;
    public android.content.res.Configuration ae;
    public final java.util.concurrent.atomic.AtomicBoolean af;
    android.content.res.Configuration ag;
    public boolean ah;
    public boolean ai;
    public j$.util.Optional aj;
    public final defpackage.xzi ak;
    final defpackage.jhk al;
    public final defpackage.qyt am;
    private final java.lang.Object an;
    private boolean ao;
    private final android.content.ServiceConnection ap;
    private final int aq;
    private final defpackage.ipc ar;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        F = sparseArray;
        sparseArray.put(-1, "INVALID");
        sparseArray.put(49, "LIFETIME");
        sparseArray.put(50, "LIFETIME_COMPLETE");
        sparseArray.put(0, "SETUP");
        sparseArray.put(1, "SETUP_COMPLETE");
        sparseArray.put(2, "START");
        sparseArray.put(3, "START_WINDOW_READY");
        sparseArray.put(4, "START_COMPLETE");
        sparseArray.put(5, "STOP");
        sparseArray.put(6, "STOP_COMPLETE");
        sparseArray.put(7, "RESUME");
        sparseArray.put(8, "RESUME_COMPLETE");
        sparseArray.put(9, "VIDEO_CONFIG_CHANGE");
        sparseArray.put(10, "VIDEO_CONFIG_CHANGE_COMPLETE");
        sparseArray.put(11, "PAUSE");
        sparseArray.put(12, "PAUSE_COMPLETE");
        sparseArray.put(13, "NEW_INTENT");
        sparseArray.put(14, "NEW_INTENT_COMPLETE");
        sparseArray.put(15, "PRE_FINISH");
        sparseArray.put(16, "FINISH");
        sparseArray.put(17, "ON_CRASH");
        sparseArray.put(18, "RELINQUISH_VIDEO_FOCUS");
        sparseArray.put(19, "REQUEST_VIDEO_FOCUS");
        sparseArray.put(20, "INPUT_FOCUS_CHANGE");
        sparseArray.put(21, "INPUT_FOCUS_CHANGE_COMPLETE");
        sparseArray.put(22, "START_INPUT");
        sparseArray.put(23, "STOP_INPUT");
        sparseArray.put(24, "ON_STOP_IME_INPUT");
        sparseArray.put(26, "INPUT_EVENT");
        sparseArray.put(27, "WINDOW_REATTACH");
        sparseArray.put(28, "WINDOW_REATTACH_COMPLETE");
        sparseArray.put(47, "BOUND_TO_CLIENT");
        G = new defpackage.iox(0);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0219  */
    public iph(defpackage.ioh iohVar, defpackage.ioi ioiVar, int i, defpackage.jkr jkrVar, com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.iof iofVar, defpackage.ipc ipcVar, defpackage.xzi xziVar) {
        boolean z;
        android.util.Pair pairCreate;
        defpackage.jkj jkjVar;
        int i2;
        java.lang.Object obj;
        defpackage.ium iumVar = new defpackage.ium();
        defpackage.iyb iybVar = new defpackage.iyb(iohVar.d);
        android.content.Intent intent = iofVar.c;
        int i3 = iofVar.h;
        android.graphics.Rect rect = iofVar.j;
        android.graphics.Rect rect2 = iofVar.k;
        android.graphics.Rect rect3 = iofVar.l;
        int i4 = iofVar.m;
        int i5 = iofVar.n;
        java.util.UUID uuid = iofVar.o;
        int i6 = iofVar.p;
        super(iohVar, ioiVar, intent.getComponent(), jkrVar, carRegionId);
        this.an = new java.lang.Object();
        this.I = new defpackage.bgf(this, 19, null);
        this.J = 0;
        this.K = 0;
        this.L = false;
        this.M = new defpackage.ipd(this);
        this.P = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.W = -1;
        this.X = -1;
        this.Y = new java.lang.Object();
        this.Z = new java.util.ArrayDeque();
        this.aa = new java.util.ArrayDeque();
        this.af = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.ah = true;
        this.aj = j$.util.Optional.empty();
        this.al = new defpackage.ioz(this);
        android.content.ComponentName component = intent.getComponent();
        e(component);
        if (!defpackage.acvt.a.fF().j()) {
            this.ag = iohVar.c(P());
        }
        this.aq = i6;
        this.am = new defpackage.qyt(this);
        this.H = new defpackage.ipg(this, component);
        this.ac = iybVar;
        try {
            android.content.pm.ServiceInfo serviceInfo = this.b.d.getPackageManager().getServiceInfo(component, 128);
            z = serviceInfo.metaData == null ? true : serviceInfo.metaData.getBoolean("com.google.android.projection.gearhead.LIFETIME_REQUIRED", true);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ium.a.h()).p(e)).ai((char) 1348)).u("Unexpected exception during lookup, returning default");
            z = true;
        }
        ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(955)).N("CarActivityManager enabled for: %s, lifetime-aware: %b", e(component), z);
        this.ap = new defpackage.ipa(this, z);
        this.ar = ipcVar;
        this.ak = xziVar;
        android.content.Context context = iohVar.d;
        defpackage.jip jipVar = ((defpackage.inh) this.y).Y;
        try {
            android.content.Context contextCreatePackageContext = context.createPackageContext(component.getPackageName(), 0);
            try {
                android.os.Bundle bundle = contextCreatePackageContext.getPackageManager().getServiceInfo(component, 128).metaData;
                i2 = bundle != null ? bundle.getInt("com.google.android.projection.gearhead.WINDOW_ANIMATION_STYLE", iumVar.a(contextCreatePackageContext)) : iumVar.a(contextCreatePackageContext);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ium.a.g()).ai((char) 1350)).y("Could not get windowAnimationStyle for component %s", component);
                i2 = 0;
            }
            if (i2 != 0) {
                android.util.Pair pairB = defpackage.ium.b(contextCreatePackageContext, i2);
                int iIntValue = ((java.lang.Integer) pairB.first).intValue();
                int iIntValue2 = ((java.lang.Integer) pairB.second).intValue();
                if ((iIntValue == 0) != (iIntValue2 == 0)) {
                    ((defpackage.yqj) ((defpackage.yqj) E.h()).ai((char) 956)).u("enterAnimation and exitAnimation need to both be null or both be non-null.");
                    pairCreate = android.util.Pair.create(null, null);
                } else {
                    obj = null;
                    if (iIntValue != 0) {
                        pairCreate = android.util.Pair.create(jipVar.a(contextCreatePackageContext, iIntValue), jipVar.a(contextCreatePackageContext, iIntValue2));
                    }
                }
                jkjVar = new defpackage.jkj();
                jkjVar.n(carRegionId);
                jkjVar.c(this.d);
                jkjVar.l(i);
                jkjVar.m(i3);
                jkjVar.d(rect);
                rect2.getClass();
                rect3.getClass();
                jkjVar.g(new jhq(rect2, rect3));
                jkjVar.i(i4);
                jkjVar.h(i5);
                jkjVar.e(this.al);
                jkjVar.a = (defpackage.jik) pairCreate.first;
                jkjVar.f |= 128;
                jkjVar.b = (defpackage.jik) pairCreate.second;
                jkjVar.f |= 256;
                jkjVar.j(iohVar.m(carRegionId));
                jkjVar.f(intent.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0));
                jkjVar.k(iohVar.k(carRegionId));
                jkjVar.b(uuid);
                if (ipcVar != defpackage.ipc.a) {
                    jkjVar.c = new defpackage.ikd(this, 8);
                    jkjVar.f |= 8192;
                }
                defpackage.jhl jhlVarJ = jkrVar.j(jkjVar.a());
                jhlVarJ.getClass();
                this.N = jhlVarJ;
            }
            obj = null;
            pairCreate = android.util.Pair.create(obj, obj);
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) E.g()).p(e2)).ai((char) 957)).y("Failed to load window animations for componentName %s", component);
            pairCreate = android.util.Pair.create(null, null);
        }
        jkjVar = new defpackage.jkj();
        jkjVar.n(carRegionId);
        jkjVar.c(this.d);
        jkjVar.l(i);
        jkjVar.m(i3);
        jkjVar.d(rect);
        rect2.getClass();
        rect3.getClass();
        jkjVar.g(new jhq(rect2, rect3));
        jkjVar.i(i4);
        jkjVar.h(i5);
        jkjVar.e(this.al);
        jkjVar.a = (defpackage.jik) pairCreate.first;
        jkjVar.f |= 128;
        jkjVar.b = (defpackage.jik) pairCreate.second;
        jkjVar.f |= 256;
        jkjVar.j(iohVar.m(carRegionId));
        jkjVar.f(intent.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0));
        jkjVar.k(iohVar.k(carRegionId));
        jkjVar.b(uuid);
        if (ipcVar != defpackage.ipc.a) {
            jkjVar.c = new defpackage.ikd(this, 8);
            jkjVar.f |= 8192;
        }
        defpackage.jhl jhlVarJ2 = jkrVar.j(jkjVar.a());
        jhlVarJ2.getClass();
        this.N = jhlVarJ2;
    }

    static java.lang.String Q(int i) {
        if (i == -1) {
            return "S_FINISHED";
        }
        if (i == 0) {
            return "S_INIT";
        }
        if (i != 1) {
            return i != 3 ? "UNKNOWN" : "S_RESUMED";
        }
        return "S_STOPPED";
    }

    public static void V(boolean z) {
        defpackage.tgg.a.d(defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_INPUT_EVENT, true != z ? 2 : 1);
    }

    private final java.lang.String ad() {
        return "CarActivityManager: " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "\n Component: " + this.d.toShortString() + "\n State: " + Q(this.K);
    }

    private final void ae() {
        this.ac.c();
        synchronized (this.an) {
            if (!this.R) {
                ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(988)).M("component: %s; not bound %s", this.i, this.ap);
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(987)).y("Unbinding from %s", this.i);
            this.R = false;
            defpackage.sqf.a().b(this.b.d, this.ap);
            defpackage.rcm.d(this.H, this.I);
        }
    }

    @Override // defpackage.inn
    public final void A(com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams, java.util.UUID uuid) {
        defpackage.yqm yqmVar;
        android.content.res.Configuration configurationO;
        defpackage.ill.d();
        int i = carActivityLayoutParams.c;
        int i2 = carActivityLayoutParams.d;
        android.graphics.Rect rect = new android.graphics.Rect(i, i2, carActivityLayoutParams.a + i, carActivityLayoutParams.b + i2);
        defpackage.ioh iohVar = this.b;
        com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = carActivityLayoutParams.i;
        com.google.android.gms.car.display.CarRegionId carRegionId = this.z;
        this.x = iohVar.h(projectionWindowAnimationParams, carRegionId);
        this.v = iohVar.h(carActivityLayoutParams.h, carRegionId);
        defpackage.jhl jhlVar = this.N;
        if (this.ah || this.ai) {
            yqmVar = E;
            ((defpackage.yqj) yqmVar.l().ai(989)).y("%s Resizing will happen when client starts", this.i);
        } else {
            yqmVar = E;
            ((defpackage.yqj) yqmVar.l().ai(993)).y("%s Resizing started", this.i);
            jhlVar.ar();
        }
        defpackage.yqm yqmVar2 = yqmVar;
        int iF = this.y.f(jhlVar, rect, new jhq(carActivityLayoutParams.f, carActivityLayoutParams.l), carActivityLayoutParams.j, carActivityLayoutParams.k, carActivityLayoutParams.e, carActivityLayoutParams.a(), uuid, carActivityLayoutParams.g) | 256;
        if (!defpackage.acpa.l() || this.ae == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 990)).u("updateCarActivityLayoutParams: nextVideoConfig is null, using current video config");
            configurationO = O();
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 992)).u("updateCarActivityLayoutParams: nextVideoConfig is available, using it instead");
            configurationO = this.ae;
            android.content.Context context = iohVar.d;
            defpackage.rqt rqtVarA = defpackage.rqt.a(context);
            defpackage.yzd yzdVar = defpackage.yzd.CAR_SERVICE;
            defpackage.zbe zbeVar = defpackage.zbe.ACTIVITY_MANAGER;
            rqtVarA.c(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.MT).l());
            if ((this.ae.uiMode & 48) != (O().uiMode & 48)) {
                defpackage.rqt.a(context).c(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.MU).l());
            }
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 991)).y("updateCarActivityLayoutParams: videoConfig=%s", configurationO);
        r(configurationO, iF);
    }

    @Override // defpackage.inn
    public final void B(android.graphics.Rect rect) {
        this.N.au(rect);
    }

    @Override // defpackage.inn
    public final boolean C() {
        return this.K != 0;
    }

    @Override // defpackage.inn
    public final boolean G() {
        return this.L;
    }

    @Override // defpackage.inn
    public final void J() {
        ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(934)).M("component: %s; anr(anrDebugString:%s)", this.i, "Timeout connecting from CAMS");
        defpackage.ipg ipgVar = this.H;
        defpackage.rbz.g(ipgVar.getLooper(), new defpackage.inq(ipgVar, 4));
    }

    @Override // defpackage.inn
    public final void L() {
        defpackage.qyr qyrVar = Z("kill") ? this.O : null;
        if (qyrVar != null) {
            try {
                qyrVar.f();
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    public final int M() {
        return P().b;
    }

    public final int N(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) throws android.os.RemoteException {
        defpackage.qyr qyrVar = this.O;
        if (qyrVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(984)).y("component: %s; Service is null, ignoring sendInputFocusChange", this.i);
            return 3;
        }
        if (this.n < 4) {
            qyrVar.i(this.P);
        } else if (this.n < 7) {
            qyrVar.j(this.P, !inputFocusChangedEvent.b);
        } else {
            qyrVar.h(inputFocusChangedEvent);
        }
        return 1;
    }

    public final android.content.res.Configuration O() {
        S();
        return this.ag;
    }

    public final com.google.android.gms.car.display.CarDisplayId P() {
        return this.z.h;
    }

    public final void R(int i, android.content.res.Configuration configuration) throws android.os.RemoteException {
        com.google.android.gms.car.DrawingSpec drawingSpecAN = this.N.aN();
        ((defpackage.yqj) E.l().ai(953)).R("component: %s; doVideoConfigChangeInner type=%d config=%s", this.i, java.lang.Integer.valueOf(i), configuration);
        this.O.x(M(), i, drawingSpecAN, configuration);
        this.ag = configuration;
        this.ae = null;
    }

    public final void S() {
        if (this.ag == null) {
            this.ag = this.b.c(P());
        }
    }

    public final void T(android.graphics.Rect rect) {
        if (aa("updateInsets")) {
            defpackage.ill.d();
            if (!H()) {
                ((defpackage.yqj) E.l().ai(963)).y("Client %s is not resumed, not dispatching insets", this.i);
                return;
            }
            try {
                this.O.w(rect);
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) E.g()).p(e)).ai((char) 962)).u("Error calling updateInsets");
            }
        }
    }

    public final void U(android.graphics.Rect rect, boolean z) {
        if (aa("updateNonDrawableInsets")) {
            defpackage.ill.d();
            if (this.n < 11) {
                ((defpackage.yqj) E.l().ai(967)).y("Client %s does not support non-drawable insets", this.i);
                return;
            }
            if (!H() && !z) {
                ((defpackage.yqj) E.l().ai(966)).y("Client %s is not resumed, not dispatching non-drawable insets", this.i);
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(964)).M("Successfully sending non-drawable insets of %s to %s", rect, this.i);
            try {
                this.O.n(rect);
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) E.g()).p(e)).ai((char) 965)).u("Error calling updateInsets");
            }
        }
    }

    public final void W() {
        defpackage.ill.d();
        if (this.ae != null) {
            ((defpackage.yqj) E.l().ai(974)).K("component: %s; onVideoConfigurationChangedComplete (pending config present: type=%d)", this.i, this.ad);
            return;
        }
        ((defpackage.yqj) E.l().ai(975)).y("component: %s; onVideoConfigurationChangedComplete (no pending config)", this.i);
        this.N.L();
        defpackage.ipg ipgVar = this.H;
        ipgVar.sendMessage(android.os.Message.obtain(ipgVar, 48));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean X() {
        synchronized (this.an) {
            if (this.R) {
                ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(938)).M("component: %s; already bound %s", this.i, this.ap);
                return true;
            }
            defpackage.yqm yqmVar = E;
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(935);
            java.lang.String str = this.i;
            android.content.ServiceConnection serviceConnection = this.ap;
            yqjVar.M("component: %s; bindToClient() %s", str, serviceConnection);
            android.content.Context context = this.b.d;
            defpackage.iyb iybVar = this.ac;
            android.content.ComponentName componentName = this.d;
            iybVar.d(componentName);
            int i = this.aq | 1;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(936)).D("Using bind flags %s for %s", i, componentName);
            this.R = defpackage.sqf.a().e(context, "CarService", new android.content.Intent().setComponent(componentName), serviceConnection, i, false, null);
            if (this.R) {
                defpackage.rcm.c(this.H, this.I, defpackage.acps.a.fF().a());
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(937)).M("component: %s; bindService failed %s", str, serviceConnection);
            }
            return this.R;
        }
    }

    final boolean Y() {
        return (this.j || this.K == -1) ? false : true;
    }

    final boolean Z(java.lang.String str) {
        if (this.R && this.S) {
            return true;
        }
        ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(939)).M("component: %s; Callback not connected yet, ignoring %s", this.i, str);
        return false;
    }

    final boolean aa(java.lang.String str) {
        if (this.R && this.O != null) {
            return true;
        }
        ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(940)).M("component: %s; Service is null, ignoring %s", this.i, str);
        return false;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    final boolean ab(boolean z) {
        if (!z) {
            ((defpackage.yqj) ((defpackage.yqj) E.h()).ai(947)).y("component: %s; Start complete but resume failed", this.i);
        } else {
            if (this.K == 3) {
                this.V = true;
                this.b.z(this);
                defpackage.jhl jhlVar = this.N;
                if (jhlVar.g() == 1) {
                    this.y.ab(this.z, jhlVar, this.s.c.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0));
                }
                boolean z2 = this.ao;
                this.ao = false;
                if (z2) {
                    this.H.t(this.s.c);
                }
                this.H.d(7);
                return true;
            }
            ((defpackage.yqj) ((defpackage.yqj) E.h()).ai(946)).y("component: %s; Start complete but state is not resumed", this.i);
        }
        this.b.v(this);
        return false;
    }

    @Override // defpackage.inn
    public final int b() {
        return this.N.g();
    }

    @Override // defpackage.inn
    public final android.content.ComponentName c() {
        return this.d;
    }

    @Override // defpackage.inn
    public final defpackage.jhl d() {
        return this.N;
    }

    @Override // defpackage.inn
    public final java.lang.String g() {
        defpackage.ipg ipgVar = this.H;
        return ad() + "\n ProjectionClientMessageHandler: " + ipgVar.toString() + "\n";
    }

    @Override // defpackage.inn
    protected final void h() {
        this.O = null;
        this.S = false;
        this.P = false;
        this.N.aV();
        this.H.h();
    }

    @Override // defpackage.inn
    public final void k(java.io.PrintWriter printWriter) {
        printWriter.print("ProjectionCarActivityManager ");
        printWriter.println(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        printWriter.print("\tState=");
        printWriter.print(Q(this.K));
        android.content.Intent intent = this.M.a;
        printWriter.print(" currentIntent=");
        printWriter.print(intent != null ? intent.toString() : null);
        printWriter.print(" hasFocus=");
        printWriter.print(this.P);
        printWriter.print(" window=");
        printWriter.println(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.N)));
        printWriter.print(" clientMessageHandler=");
        printWriter.println(this.H);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ipp, java.lang.Object] */
    @Override // defpackage.inn
    public final void l() {
        super.l();
        this.H.n();
        ae();
        j$.util.Optional optional = this.aj;
        if (true == optional.isPresent()) {
            optional.get().a();
        }
        this.aj = j$.util.Optional.empty();
        this.K = -1;
        this.Q = null;
        this.M.a(null);
    }

    @Override // defpackage.inn
    public final void n() {
        if (this.K != 0) {
            return;
        }
        super.n();
        this.aj = this.ar.a();
        defpackage.ipg ipgVar = this.H;
        ipgVar.d(0);
        android.content.ServiceConnection serviceConnection = this.ap;
        if ((serviceConnection instanceof defpackage.ipa) && ((defpackage.ipa) serviceConnection).a) {
            ipgVar.d(49);
        }
        this.K = 1;
    }

    @Override // defpackage.inn
    public final void o(defpackage.ioa ioaVar) {
        if (ioaVar.c) {
            return;
        }
        defpackage.iof iofVar = ioaVar.a;
        x(iofVar);
        this.H.t(iofVar.c);
    }

    @Override // defpackage.inn
    public final void p(int i) {
        if (aa("onPowerStateChange") && this.K != 0 && this.n > 1) {
            try {
                this.O.o(i);
            } catch (android.os.RemoteException e) {
                defpackage.ipg ipgVar = this.H;
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(e);
                int i2 = defpackage.ipg.i;
                ipgVar.q(runtimeException);
            }
        }
    }

    @Override // defpackage.inn
    public final void q() {
        this.H.d(24);
    }

    @Override // defpackage.inn
    public final void r(android.content.res.Configuration configuration, int i) {
        defpackage.yqm yqmVar = E;
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(970);
        java.lang.String str = this.i;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        yqjVar.R("component: %s; onVideoConfigurationChanged type=%d newConfig=%s", str, numValueOf, configuration);
        if (this.ae == null) {
            ((defpackage.yqj) yqmVar.l().ai(971)).K("component: %s; Setting nextVideoConfig. Type=%d", str, i);
            this.ae = configuration;
            this.ad = i;
            this.H.d(9);
            return;
        }
        int i2 = this.ad;
        this.ad = i | i2;
        int iDiff = O().diff(configuration) | 3456;
        int i3 = this.ad & iDiff;
        this.ad = i3;
        if (i3 == 0) {
            ((defpackage.yqj) yqmVar.l().ai(973)).S("component: %s; Clearing nextVideoConfig (merged to no-op). OldType=%d, NewType=%d, KeptMask=%d", str, java.lang.Integer.valueOf(i2), numValueOf, java.lang.Integer.valueOf(iDiff));
            this.ae = null;
        } else {
            ((defpackage.yqj) yqmVar.l().ai(972)).T("component: %s; Merged into nextVideoConfig. OldType=%d, IncomingType=%d, ResultType=%d, KeptMask=%d", str, java.lang.Integer.valueOf(i2), numValueOf, java.lang.Integer.valueOf(this.ad), java.lang.Integer.valueOf(iDiff));
            this.ae = configuration;
        }
    }

    @Override // defpackage.inn
    public final void s(defpackage.inn innVar) {
        super.s(innVar);
        if (this.K != 3) {
            ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(977)).M("Spurious pause for %s, nextManager: %s", g(), innVar);
            return;
        }
        defpackage.ipg ipgVar = this.H;
        ipgVar.d(11);
        ipgVar.r(new com.google.android.gms.car.InputFocusChangedEvent(false, true, -1, null));
        this.K = 2;
    }

    @Override // defpackage.inn
    public final void t() {
        if (this.n < 3) {
            ((defpackage.yqj) ((defpackage.yqj) E.h()).ai((char) 980)).u("Client version too low; ignoring reattach");
            return;
        }
        defpackage.jhl jhlVar = this.N;
        if (jhlVar.aF()) {
            this.U = true;
            ((defpackage.inh) this.y).ak(jhlVar, 0);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) E.h()).ai((char) 979)).w("reattachWindow called with window in state %d", jhlVar.j());
        }
    }

    public final java.lang.String toString() {
        return defpackage.acvt.a.fF().m() ? ad() : g();
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [ipp, java.lang.Object] */
    @Override // defpackage.inn
    public final synchronized void u() {
        super.u();
        this.H.n();
        this.K = 0;
        this.O = null;
        this.P = false;
        ae();
        j$.util.Optional optional = this.aj;
        if (true == optional.isPresent()) {
            optional.get().a();
        }
        this.aj = j$.util.Optional.empty();
        this.S = false;
        this.T = false;
        this.U = false;
        this.X = -1;
        this.W = -1;
        synchronized (this.Y) {
            this.Z.clear();
            this.aa.clear();
            this.ab = null;
        }
        this.ao = false;
        if (this.ae != null) {
            ((defpackage.yqj) E.l().ai(981)).y("component: %s; reset() clearing nextVideoConfig", this.i);
        }
        this.ae = null;
        this.ah = false;
        this.ai = false;
    }

    @Override // defpackage.inn
    public final void w(defpackage.ioa ioaVar) {
        defpackage.iof iofVar = this.s;
        super.w(ioaVar);
        int i = this.K;
        if (i == 1 || i == 2) {
            if (iofVar == null) {
                this.M.a(ioaVar.a.c);
            } else {
                this.ao = (iofVar.c == ioaVar.a.c || ioaVar.c) ? false : true;
            }
            this.K = 3;
            this.H.d(2);
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) E.h()).ai((char) 983)).y("Spurious resume for %s", g());
        if (defpackage.acpa.j()) {
            defpackage.ioh iohVar = this.b;
            defpackage.rqt.a(iohVar.d).c(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.ACTIVITY_MANAGER, defpackage.zbd.MS).l());
            iohVar.x(this);
        }
    }

    @Override // defpackage.inn
    public final void y(defpackage.inn innVar) {
        super.y(innVar);
        this.ai = true;
        int i = this.K;
        if (i == 3) {
            defpackage.ipg ipgVar = this.H;
            ipgVar.d(11);
            ipgVar.r(new com.google.android.gms.car.InputFocusChangedEvent(false, true, -1, null));
        } else if (i != 2) {
            ((defpackage.yqj) ((defpackage.yqj) E.f()).ai(986)).M("Spurious stop for %s, nextManager: %s", g(), innVar);
            return;
        }
        this.H.d(5);
        this.K = 1;
    }
}
