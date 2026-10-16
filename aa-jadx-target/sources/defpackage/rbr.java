package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rbr extends android.app.Presentation {
    public static final android.graphics.Rect a = new android.graphics.Rect();
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public final android.graphics.Rect G;
    public final android.graphics.Rect H;
    public boolean I;
    public boolean J;
    public android.view.View K;
    public final android.graphics.Rect L;
    public final java.util.Queue M;
    public java.lang.ref.WeakReference N;
    public final defpackage.rbn O;
    public final android.view.Display P;
    public final defpackage.rbp Q;
    public defpackage.rbs R;
    public android.os.HandlerThread S;
    public android.os.Handler T;
    public int U;
    final java.util.concurrent.Semaphore V;
    final boolean W;
    public defpackage.qum X;
    public final defpackage.nub Y;
    private final boolean Z;
    private boolean aa;
    private defpackage.rbb ab;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener ac;
    private final android.view.ViewTreeObserver.OnGlobalFocusChangeListener ad;
    private final android.view.ViewTreeObserver.OnGlobalFocusChangeListener ae;
    private final android.view.ViewTreeObserver.OnGlobalFocusChangeListener af;
    private final android.view.ViewTreeObserver.OnTouchModeChangeListener ag;
    public android.view.View b;
    public boolean c;
    public boolean d;
    public android.content.res.Configuration e;
    android.content.ComponentCallbacks f;
    public defpackage.rbl g;
    public final android.util.Pair h;
    public final android.util.Pair i;
    public final android.util.Pair j;
    public boolean k;
    public final defpackage.rpi l;
    public final java.lang.String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public defpackage.rbq q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    public rbr(android.content.Context context, android.view.Display display, int i, java.lang.String str, boolean z, defpackage.rbp rbpVar) {
        final int i2 = 1;
        final int i3 = 0;
        if (i == 0) {
            if (context instanceof android.app.Service) {
                android.content.ComponentName componentName = new android.content.ComponentName(context, context.getClass());
                try {
                    android.os.Bundle bundle = context.getPackageManager().getServiceInfo(componentName, 128).metaData;
                    int i4 = context.getApplicationInfo().theme;
                    i = bundle != null ? bundle.getInt("android.app.theme", i4) : i4;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    defpackage.rrx.d(6, "CAR.PROJECTION.PRES", null, "Could not get theme for component %s; use the default theme", componentName);
                    i = 0;
                }
            } else if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                boolean z2 = defpackage.rrx.a;
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "getTheme: context not an instance of service", new java.lang.Object[0]);
            }
            i = 0;
        }
        super(context, display, i);
        this.k = false;
        this.l = new defpackage.rpi();
        this.o = false;
        this.p = true;
        this.q = new defpackage.rbq(false, false);
        this.s = false;
        this.G = new android.graphics.Rect();
        this.H = new android.graphics.Rect(a);
        this.L = new android.graphics.Rect();
        this.M = new java.util.ArrayDeque();
        this.N = new java.lang.ref.WeakReference(null);
        this.O = new defpackage.qui();
        this.Y = new defpackage.nub(null, null, null);
        this.V = new java.util.concurrent.Semaphore(0);
        this.W = true;
        this.ac = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: rbh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                defpackage.rbr rbrVar = this.a;
                rbrVar.l(rbrVar.f().getDecorView());
            }
        };
        this.ad = new android.view.ViewTreeObserver.OnGlobalFocusChangeListener(this) { // from class: rbi
            public final /* synthetic */ defpackage.rbr a;

            {
                this.a = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
                int i5 = i2;
                if (i5 == 0) {
                    if (view != view2) {
                        defpackage.rbr rbrVar = this.a;
                        if (view == rbrVar.f().getDecorView() || view2 == null) {
                            rbrVar.l(rbrVar.f().getDecorView());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i5 == 1) {
                    defpackage.rbr rbrVar2 = this.a;
                    if (view != null) {
                        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for oldFocus: %s", rbrVar2.m, view);
                        }
                        rbrVar2.t(view, false);
                    }
                    android.view.View view3 = (android.view.View) rbrVar2.N.get();
                    if (view3 != null && view3 != view && view3 != view2) {
                        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for lastFocus: %s", rbrVar2.m, view3);
                        }
                        rbrVar2.t(view3, false);
                    }
                    if (view2 != null) {
                        rbrVar2.A(view2);
                    }
                    rbrVar2.N = new java.lang.ref.WeakReference(view2);
                    return;
                }
                if (view != view2) {
                    defpackage.qum qumVar = this.a.X;
                    if (view2 == null) {
                        return;
                    }
                    java.util.Deque deque = qumVar.a;
                    qul qulVar = (qul) deque.peek();
                    if (qulVar != null) {
                        android.view.View view4 = (android.view.View) qulVar.c.get();
                        if (!qumVar.d(qulVar.b, view4, (android.view.View) qulVar.d.get())) {
                            deque.clear();
                        } else if (view4 != view2) {
                            deque.clear();
                        }
                    }
                }
            }
        };
        this.ae = new android.view.ViewTreeObserver.OnGlobalFocusChangeListener(this) { // from class: rbi
            public final /* synthetic */ defpackage.rbr a;

            {
                this.a = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
                int i5 = i3;
                if (i5 == 0) {
                    if (view != view2) {
                        defpackage.rbr rbrVar = this.a;
                        if (view == rbrVar.f().getDecorView() || view2 == null) {
                            rbrVar.l(rbrVar.f().getDecorView());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i5 == 1) {
                    defpackage.rbr rbrVar2 = this.a;
                    if (view != null) {
                        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for oldFocus: %s", rbrVar2.m, view);
                        }
                        rbrVar2.t(view, false);
                    }
                    android.view.View view3 = (android.view.View) rbrVar2.N.get();
                    if (view3 != null && view3 != view && view3 != view2) {
                        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for lastFocus: %s", rbrVar2.m, view3);
                        }
                        rbrVar2.t(view3, false);
                    }
                    if (view2 != null) {
                        rbrVar2.A(view2);
                    }
                    rbrVar2.N = new java.lang.ref.WeakReference(view2);
                    return;
                }
                if (view != view2) {
                    defpackage.qum qumVar = this.a.X;
                    if (view2 == null) {
                        return;
                    }
                    java.util.Deque deque = qumVar.a;
                    qul qulVar = (qul) deque.peek();
                    if (qulVar != null) {
                        android.view.View view4 = (android.view.View) qulVar.c.get();
                        if (!qumVar.d(qulVar.b, view4, (android.view.View) qulVar.d.get())) {
                            deque.clear();
                        } else if (view4 != view2) {
                            deque.clear();
                        }
                    }
                }
            }
        };
        final int i5 = 2;
        this.af = new android.view.ViewTreeObserver.OnGlobalFocusChangeListener(this) { // from class: rbi
            public final /* synthetic */ defpackage.rbr a;

            {
                this.a = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
                int i6 = i5;
                if (i6 == 0) {
                    if (view != view2) {
                        defpackage.rbr rbrVar = this.a;
                        if (view == rbrVar.f().getDecorView() || view2 == null) {
                            rbrVar.l(rbrVar.f().getDecorView());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i6 == 1) {
                    defpackage.rbr rbrVar2 = this.a;
                    if (view != null) {
                        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for oldFocus: %s", rbrVar2.m, view);
                        }
                        rbrVar2.t(view, false);
                    }
                    android.view.View view3 = (android.view.View) rbrVar2.N.get();
                    if (view3 != null && view3 != view && view3 != view2) {
                        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for lastFocus: %s", rbrVar2.m, view3);
                        }
                        rbrVar2.t(view3, false);
                    }
                    if (view2 != null) {
                        rbrVar2.A(view2);
                    }
                    rbrVar2.N = new java.lang.ref.WeakReference(view2);
                    return;
                }
                if (view != view2) {
                    defpackage.qum qumVar = this.a.X;
                    if (view2 == null) {
                        return;
                    }
                    java.util.Deque deque = qumVar.a;
                    qul qulVar = (qul) deque.peek();
                    if (qulVar != null) {
                        android.view.View view4 = (android.view.View) qulVar.c.get();
                        if (!qumVar.d(qulVar.b, view4, (android.view.View) qulVar.d.get())) {
                            deque.clear();
                        } else if (view4 != view2) {
                            deque.clear();
                        }
                    }
                }
            }
        };
        this.ag = new defpackage.rbk(this);
        if (rbpVar.b) {
            android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
            configuration.uiMode = (configuration.uiMode & (-49)) | (context.getResources().getConfiguration().uiMode & 48);
            getContext().getResources().updateConfiguration(configuration, getContext().getResources().getDisplayMetrics());
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 4)) {
                defpackage.rrx.d(4, "CAR.PROJECTION.PRES", null, "applyProvidedContextConfiguration updated getContext() configuration with %s", configuration);
            }
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 4)) {
                defpackage.rrx.d(4, "CAR.PROJECTION.PRES", null, "ProjectedPresentation ctor context configuration: %s", context.getResources().getConfiguration());
                defpackage.rrx.d(4, "CAR.PROJECTION.PRES", null, "ProjectedPresentation ctor getContext() configuration: %s", getContext().getResources().getConfiguration());
            }
        }
        this.X = new defpackage.qum(0, 0);
        this.m = str;
        this.P = display;
        this.Q = rbpVar;
        this.h = android.util.Pair.create(0, null);
        this.i = android.util.Pair.create(-1, null);
        this.j = android.util.Pair.create(2, null);
        android.view.Window windowF = f();
        windowF.setType(2030);
        windowF.addFlags(16777216);
        windowF.addFlags(8);
        this.Z = z;
        if (z) {
            windowF.addFlags(1024);
        }
        if (rbpVar.h && defpackage.sqs.d() && (android.os.Build.VERSION.SDK_INT >= 37 || (android.os.Build.VERSION.CODENAME.charAt(0) >= 'C' && android.os.Build.VERSION.CODENAME.charAt(0) <= 'D'))) {
            windowF.addFlags(268435456);
        }
        windowF.setSoftInputMode(48);
        x(false);
        if (android.os.Build.VERSION.SDK_INT != 31) {
            this.R = new defpackage.rbs(getContext());
            this.ab = new defpackage.rbb(getContext());
            G(context);
        }
    }

    public static boolean D(android.view.View view, android.view.ViewGroup viewGroup) {
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            if (parent == viewGroup) {
                return true;
            }
        }
        return false;
    }

    private final void G(android.content.Context context) {
        if (this.Q.b) {
            this.e = context.getResources().getConfiguration();
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "ProjectedPresentation ctor registering ComponentCallbacks", new java.lang.Object[0]);
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "ProjectedPresentation initial currentVideoConfiguration: %s", this.e);
            }
            this.f = new defpackage.rbj(this, 0);
            d().registerComponentCallbacks(this.f);
            ((android.content.ContextWrapper) d()).getBaseContext().registerComponentCallbacks(this.f);
        }
    }

    public static int a(int i, float f) {
        return (int) (i * (160.0f / f));
    }

    public static int b(defpackage.rbl rblVar) {
        if (rblVar.c) {
            return 2;
        }
        return rblVar.b ? 4 : 1;
    }

    public static int c(defpackage.rbl rblVar) {
        return rblVar.a ? 3 : 1;
    }

    public static defpackage.rbr h(android.content.Context context, android.view.Display display, int i, java.lang.String str, boolean z, defpackage.rbp rbpVar) {
        defpackage.rbr rbrVar = new defpackage.rbr(context, display, i, str, z, rbpVar);
        if (android.os.Build.VERSION.SDK_INT == 31) {
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 4)) {
                defpackage.rrx.d(4, "CAR.PROJECTION.PRES", null, "Waiting for correct configuration", new java.lang.Object[0]);
            }
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ProjectedPresentation");
            rbrVar.S = handlerThread;
            handlerThread.start();
            defpackage.stq stqVar = new defpackage.stq(rbrVar.S.getLooper());
            rbrVar.T = stqVar;
            stqVar.post(new defpackage.qth(rbrVar, 7));
            try {
                rbrVar.V.acquire();
                return rbrVar;
            } catch (java.lang.InterruptedException e) {
                if (defpackage.rrx.e("CAR.PROJECTION.PRES", 6)) {
                    defpackage.rrx.b("CAR.PROJECTION.PRES", e, "Unable to acquire presentationConfiguredSemaphore");
                }
            }
        } else if (defpackage.rrx.e("CAR.PROJECTION.PRES", 4)) {
            defpackage.rrx.d(4, "CAR.PROJECTION.PRES", null, "Not waiting for correct configuration", new java.lang.Object[0]);
        }
        return rbrVar;
    }

    public final void A(android.view.View view) {
        if (view == null) {
            return;
        }
        boolean z = view.isFocused() && this.o && this.u;
        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s updateHoveredState(%s) for %s", this.m, java.lang.Boolean.valueOf(z), view);
        }
        t(view, z);
    }

    public final void B(android.graphics.Rect rect) {
        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s updateSystemWindowInsets: %s", this.m, rect);
        }
        v(rect);
        android.view.View view = this.b;
        if (view != null) {
            view.requestApplyInsets();
        }
    }

    public final void C(android.view.MotionEvent motionEvent, int i, double d, double d2) {
        if (d != 0.0d) {
            p((float) (((double) this.w) + (((double) i) * d)), motionEvent.getY());
        } else if (d2 != 0.0d) {
            p(motionEvent.getX(), (float) (((double) this.x) + (((double) i) * d2)));
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean E(android.view.View view, int i, android.graphics.Rect rect) {
        defpackage.rba rbaVarG = g(view);
        boolean zRequestFocus = rbaVarG == null ? view.requestFocus(i, rect) : rbaVarG.s(view, i, rect);
        if (zRequestFocus || !defpackage.omv.c("CAR.PROJECTION.PRES", 5)) {
            return zRequestFocus;
        }
        defpackage.rrx.d(5, "CAR.PROJECTION.PRES", null, "%s requestFocus(%s, %s) on %s returned false", this.m, sqg.n(i), rect, view);
        return false;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void F(android.view.View view) {
        boolean zU;
        defpackage.rba rbaVarG = g(view);
        if (rbaVarG == null) {
            int[] iArr = defpackage.ebt.a;
            zU = defpackage.ebo.c(view);
        } else {
            zU = rbaVarG.u(view);
        }
        if (zU || !defpackage.omv.c("CAR.PROJECTION.PRES", 5)) {
            return;
        }
        defpackage.rrx.d(5, "CAR.PROJECTION.PRES", null, "%s requestFocus() on %s returned false", this.m, view);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.k) {
            return;
        }
        super.cancel();
    }

    public final android.content.Context d() {
        defpackage.rbp rbpVar = this.Q;
        if (rbpVar.a) {
            return this.R;
        }
        return rbpVar.c ? this.ab : getContext();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.k) {
            return;
        }
        super.dismiss();
    }

    public final android.util.Pair e(int i) {
        defpackage.qum qumVar = this.X;
        android.view.View currentFocus = getCurrentFocus();
        quk qukVar = (quk) qumVar.b.get(i);
        if (qukVar != null) {
            if (i == qukVar.a && qukVar.c.get() == currentFocus && qumVar.c(qukVar.b) && qumVar.a.isEmpty()) {
                return android.util.Pair.create(-1, null);
            }
            qumVar.b();
        }
        z();
        return android.util.Pair.create(-1, new defpackage.rph(i, this.L));
    }

    public final android.view.Window f() {
        android.view.Window window = getWindow();
        window.getClass();
        return window;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.rba g(android.view.View view) {
        if (view == 0) {
            return null;
        }
        if (view instanceof defpackage.rba) {
            return (defpackage.rba) view;
        }
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            return g((android.view.View) parent);
        }
        return null;
    }

    @Override // android.app.Presentation
    public final android.content.res.Resources getResources() {
        defpackage.rbb rbbVar;
        defpackage.rbp rbpVar = this.Q;
        if (rbpVar.a) {
            return this.R.getResources();
        }
        return (!rbpVar.c || (rbbVar = this.ab) == null) ? super.getResources() : rbbVar.a;
    }

    public final void i(android.content.res.Configuration configuration) {
        if (this.e == null) {
            return;
        }
        configuration.uiMode = (this.e.uiMode & 48) | (configuration.uiMode & (-49));
    }

    public final void j(boolean z, boolean z2) {
        if (defpackage.rrx.e("CAR.PROJECTION.PRES", 2)) {
            defpackage.rrx.d(2, "CAR.PROJECTION.PRES", null, "%s callSetLocalFocus(hasFocus:%b, inTouchMode:%b)", this.m, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2));
        }
        this.p = z2;
        try {
            f().setLocalFocus(z, z2);
            this.q = new defpackage.rbq(z, z2);
        } catch (java.lang.IllegalStateException unused) {
            defpackage.rrx.d(5, "CAR.PROJECTION.PRES", null, "%s Trying to set input focus on window that's been removed.", this.m);
        }
    }

    public final void k() {
        if (this.W) {
            defpackage.ysr.bk(android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), "completePresentationConfiguration must happen on worker thread");
        }
        this.R = new defpackage.rbs(getContext());
        this.ab = new defpackage.rbb(getContext());
        G(getContext());
        this.V.release();
        android.os.HandlerThread handlerThread = this.S;
        if (handlerThread != null) {
            handlerThread.quit();
            this.S = null;
        }
        this.T = null;
    }

    public final void l(android.view.View view) {
        if (this.p) {
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i).hasFocusable()) {
                    if (view.isFocusable()) {
                        view.setFocusable(false);
                        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s ensureFocusable set view to non-focusable because it has focusable children: %s", this.m, view);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        view.setFocusable(true);
        F(view);
        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s ensureFocusable set view to focusable because it has no focusable children: %s", this.m, view);
        }
    }

    public final void m() {
        int size;
        int size2;
        android.view.View decorView = f().getDecorView();
        if (android.os.Build.VERSION.SDK_INT >= 33 && !(this.q.a == decorView.hasWindowFocus() && this.q.b == decorView.isInTouchMode())) {
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s executePendingWindowFocusReachedTasks aborting state not synced focus(expected=%b, actual=%b) touchMode(expected=%b actual=%b)", this.m, java.lang.Boolean.valueOf(this.q.a), java.lang.Boolean.valueOf(decorView.hasWindowFocus()), java.lang.Boolean.valueOf(this.q.b), java.lang.Boolean.valueOf(decorView.isInTouchMode()));
                return;
            }
            return;
        }
        while (true) {
            java.util.Queue queue = this.M;
            java.lang.Runnable runnable = (java.lang.Runnable) queue.poll();
            if (runnable == null) {
                return;
            }
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
                size = queue.size();
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onWindowFocusChangeReached() [pendingOnWindowFocusReachedTasks.size():%d]", this.m, java.lang.Integer.valueOf(size));
            } else {
                size = 0;
            }
            runnable.run();
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3) && size != (size2 = queue.size())) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onWindowFocusChangeReached() pendingOnWindowFocusReachedTasks queue size altered while tasks were running. [before:%d, after:%d]", this.m, java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2));
            }
        }
    }

    public final void n(android.graphics.Rect rect) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        android.graphics.Rect rect2 = this.H;
        if (rect2.equals(rect)) {
            return;
        }
        rect2.set(rect);
        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s nonDrawableInsets set to: %s", this.m, rect2);
        }
    }

    public final void o() {
        A(getCurrentFocus());
    }

    @Override // android.app.Presentation, android.app.Dialog
    protected final void onStop() {
        this.M.clear();
        if (this.Q.b && this.f != null) {
            d().unregisterComponentCallbacks(this.f);
        }
        super.onStop();
    }

    public final void p(float f, float f2) {
        this.w = f;
        this.x = f2;
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    public final void q(android.view.View view, int i, android.graphics.Rect rect) {
        if (view == null || view == f().getDecorView()) {
            view = f().getDecorView();
        } else {
            android.view.View decorView = f().getDecorView();
            if (decorView instanceof android.view.ViewGroup) {
                java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
                ((android.view.ViewGroup) decorView).addFocusables(arrayList, 0);
                if (!arrayList.contains(view)) {
                    view = f().getDecorView();
                }
            } else {
                view = f().getDecorView();
            }
        }
        if (view == null) {
            if (defpackage.omv.c("CAR.PROJECTION.PRES", 5)) {
                defpackage.rrx.d(5, "CAR.PROJECTION.PRES", null, "%s safeRequestFocus Unable to find view to request focus on.", this.m);
                return;
            }
            return;
        }
        if (this.z && view == f().getDecorView()) {
            l(view);
        }
        if (this.p && !view.isInTouchMode()) {
            if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s handleGainFocus requestFocusFromTouch() on %s", this.m, view);
            }
            defpackage.rba rbaVarG = g(view);
            if ((rbaVarG == null ? view.requestFocusFromTouch() : rbaVarG.t(view)) || !defpackage.omv.c("CAR.PROJECTION.PRES", 5)) {
                return;
            }
            defpackage.rrx.d(5, "CAR.PROJECTION.PRES", null, "%s requestFocusFromTouch() on %s returned false", this.m, view);
            return;
        }
        if (i == -1 || rect == null) {
            if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s handleGainFocus requestFocus() on %s", this.m, view);
            }
            F(view);
        } else {
            if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s handleGainFocus requestFocus(%s, %s) on %s", this.m, sqg.n(i), rect, view);
            }
            E(view, i, rect);
        }
    }

    final void r(boolean z) {
        if (defpackage.rrx.e("CAR.PROJECTION.PRES", 2)) {
            defpackage.rrx.d(2, "CAR.PROJECTION.PRES", null, "%s setAttachedWindow(attached: %b) [attachedToWindow: %b, hasInputFocus: %b, inTouchMode: %b]", this.m, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(this.n), java.lang.Boolean.valueOf(this.o), java.lang.Boolean.valueOf(this.p));
        }
        this.n = z;
        android.view.ViewTreeObserver viewTreeObserver = f().getDecorView().getViewTreeObserver();
        if (viewTreeObserver != null) {
            android.view.ViewTreeObserver.OnTouchModeChangeListener onTouchModeChangeListener = this.ag;
            if (!z) {
                viewTreeObserver.removeOnTouchModeChangeListener(onTouchModeChangeListener);
                if (this.z) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this.ac);
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this.ad);
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this.ae);
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this.af);
                    return;
                }
                return;
            }
            viewTreeObserver.addOnTouchModeChangeListener(onTouchModeChangeListener);
            if (this.z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.ac);
                viewTreeObserver.addOnGlobalFocusChangeListener(this.ad);
                viewTreeObserver.addOnGlobalFocusChangeListener(this.ae);
                viewTreeObserver.addOnGlobalFocusChangeListener(this.af);
            }
        } else if (!z) {
            return;
        }
        if (this.o) {
            x(true);
        } else if (this.p) {
            return;
        }
        j(this.o, this.p);
    }

    public final void s(boolean z) {
        android.view.View decorView = f().getDecorView();
        if (decorView instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) decorView).setDescendantFocusability(true != z ? 393216 : 262144);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View view) {
        if (this.K != view) {
            if (this.z) {
                this.l.b();
                this.X.a.clear();
            }
            this.K = view;
            this.b = new defpackage.rbm(this, d(), view);
            u((f().getAttributes().flags & 1024) != 0);
            y();
            super.setContentView(this.b);
            if (this.z) {
                this.l.a(f().getDecorView());
            }
        }
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void show() {
        super.show();
        new defpackage.stq().post(new defpackage.qtk(this, 4));
    }

    public final void t(android.view.View view, boolean z) {
        defpackage.rba rbaVarG = g(view);
        if (rbaVarG == null) {
            view.setHovered(z);
        } else {
            rbaVarG.x(z);
        }
    }

    public final void u(boolean z) {
        if (this.Z) {
            return;
        }
        this.aa = z;
        y();
    }

    public final void v(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.G;
        if (rect2.equals(rect)) {
            return;
        }
        rect2.set(rect);
    }

    public final void w(android.content.res.Configuration configuration) {
        if (this.Q.b) {
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "ProjectedPresentation#setVideoConfiguration new config: %s", configuration);
            }
            this.e = configuration;
            android.content.res.Configuration configuration2 = getResources().getConfiguration();
            i(configuration2);
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "ProjectedPresentation#setVideoConfiguration updateConfiguration using new config: %s", configuration2);
            }
            getResources().updateConfiguration(configuration2, getResources().getDisplayMetrics());
        }
    }

    public final void x(boolean z) {
        s(z);
        if (z) {
            q(null, -1, null);
            return;
        }
        android.view.View currentFocus = f().getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
    }

    public final void y() {
        android.view.View view = this.b;
        if (view == null) {
            return;
        }
        int i = true != this.aa ? 0 : 4;
        if (this.d) {
            i |= 1280;
        }
        view.setSystemUiVisibility(i);
    }

    public final void z() {
        android.view.View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            return;
        }
        int[] iArr = new int[2];
        currentFocus.getLocationInWindow(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        currentFocus.getFocusedRect(rect);
        android.graphics.Rect rect2 = this.L;
        rect2.left = iArr[0] + rect.left;
        rect2.right = iArr[0] + rect.right;
        rect2.top = iArr[1] + rect.top;
        rect2.bottom = iArr[1] + rect.bottom;
    }
}
