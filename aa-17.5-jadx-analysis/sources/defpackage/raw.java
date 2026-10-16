package defpackage;

import android.app.Presentation;
import android.app.Service;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class raw extends Presentation {
    public static final Rect a = new Rect();
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public final Rect G;
    public final Rect H;
    public boolean I;
    public boolean J;
    public View K;
    public final Rect L;
    public final Queue M;
    public WeakReference N;
    public final ras O;
    public final Display P;
    public final rau Q;
    public rax R;
    public HandlerThread S;
    public Handler T;
    public int U;
    final Semaphore V;
    final boolean W;
    public qtq X;
    public final ntn Y;
    private final boolean Z;
    private boolean aa;
    private raf ab;
    private final ViewTreeObserver.OnGlobalLayoutListener ac;
    private final ViewTreeObserver.OnGlobalFocusChangeListener ad;
    private final ViewTreeObserver.OnGlobalFocusChangeListener ae;
    private final ViewTreeObserver.OnGlobalFocusChangeListener af;
    private final ViewTreeObserver.OnTouchModeChangeListener ag;
    public View b;
    public boolean c;
    public boolean d;
    public Configuration e;
    ComponentCallbacks f;
    public raq g;
    public final Pair h;
    public final Pair i;
    public final Pair j;
    public boolean k;
    public final ron l;
    public final String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public rav q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    public raw(Context context, Display display, int i, String str, boolean z, rau rauVar) {
        final int i2 = 1;
        final int i3 = 0;
        if (i == 0) {
            if (context instanceof Service) {
                ComponentName componentName = new ComponentName(context, context.getClass());
                try {
                    Bundle bundle = context.getPackageManager().getServiceInfo(componentName, 128).metaData;
                    int i4 = context.getApplicationInfo().theme;
                    i = bundle != null ? bundle.getInt("android.app.theme", i4) : i4;
                } catch (PackageManager.NameNotFoundException unused) {
                    rrd.d(6, "CAR.PROJECTION.PRES", null, "Could not get theme for component %s; use the default theme", componentName);
                }
            } else if (omc.c("CAR.PROJECTION.PRES", 3)) {
                boolean z2 = rrd.a;
                rrd.d(3, "CAR.PROJECTION.PRES", null, "getTheme: context not an instance of service", new Object[0]);
            }
            i = 0;
        }
        super(context, display, i);
        this.k = false;
        this.l = new ron();
        this.o = false;
        this.p = true;
        this.q = new rav(false, false);
        this.s = false;
        this.G = new Rect();
        this.H = new Rect(a);
        this.L = new Rect();
        this.M = new ArrayDeque();
        this.N = new WeakReference(null);
        this.O = new qtm();
        this.Y = new ntn(null, null, null);
        this.V = new Semaphore(0);
        this.W = true;
        this.ac = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ram
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                raw rawVar = this.a;
                rawVar.l(rawVar.f().getDecorView());
            }
        };
        this.ad = new ViewTreeObserver.OnGlobalFocusChangeListener(this) { // from class: ran
            public final /* synthetic */ raw a;

            {
                this.a = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                int i5 = i2;
                if (i5 == 0) {
                    if (view != view2) {
                        raw rawVar = this.a;
                        if (view == rawVar.f().getDecorView() || view2 == null) {
                            rawVar.l(rawVar.f().getDecorView());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i5 == 1) {
                    raw rawVar2 = this.a;
                    if (view != null) {
                        if (omc.c("CAR.PROJECTION.PRES", 3)) {
                            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for oldFocus: %s", rawVar2.m, view);
                        }
                        rawVar2.t(view, false);
                    }
                    View view3 = (View) rawVar2.N.get();
                    if (view3 != null && view3 != view && view3 != view2) {
                        if (omc.c("CAR.PROJECTION.PRES", 3)) {
                            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for lastFocus: %s", rawVar2.m, view3);
                        }
                        rawVar2.t(view3, false);
                    }
                    if (view2 != null) {
                        rawVar2.A(view2);
                    }
                    rawVar2.N = new WeakReference(view2);
                    return;
                }
                if (view != view2) {
                    qtq qtqVar = this.a.X;
                    if (view2 == null) {
                        return;
                    }
                    Deque deque = qtqVar.a;
                    qtp qtpVar = (qtp) deque.peek();
                    if (qtpVar != null) {
                        View view4 = (View) qtpVar.c.get();
                        if (!qtqVar.d(qtpVar.b, view4, (View) qtpVar.d.get())) {
                            deque.clear();
                        } else if (view4 != view2) {
                            deque.clear();
                        }
                    }
                }
            }
        };
        this.ae = new ViewTreeObserver.OnGlobalFocusChangeListener(this) { // from class: ran
            public final /* synthetic */ raw a;

            {
                this.a = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                int i5 = i3;
                if (i5 == 0) {
                    if (view != view2) {
                        raw rawVar = this.a;
                        if (view == rawVar.f().getDecorView() || view2 == null) {
                            rawVar.l(rawVar.f().getDecorView());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i5 == 1) {
                    raw rawVar2 = this.a;
                    if (view != null) {
                        if (omc.c("CAR.PROJECTION.PRES", 3)) {
                            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for oldFocus: %s", rawVar2.m, view);
                        }
                        rawVar2.t(view, false);
                    }
                    View view3 = (View) rawVar2.N.get();
                    if (view3 != null && view3 != view && view3 != view2) {
                        if (omc.c("CAR.PROJECTION.PRES", 3)) {
                            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for lastFocus: %s", rawVar2.m, view3);
                        }
                        rawVar2.t(view3, false);
                    }
                    if (view2 != null) {
                        rawVar2.A(view2);
                    }
                    rawVar2.N = new WeakReference(view2);
                    return;
                }
                if (view != view2) {
                    qtq qtqVar = this.a.X;
                    if (view2 == null) {
                        return;
                    }
                    Deque deque = qtqVar.a;
                    qtp qtpVar = (qtp) deque.peek();
                    if (qtpVar != null) {
                        View view4 = (View) qtpVar.c.get();
                        if (!qtqVar.d(qtpVar.b, view4, (View) qtpVar.d.get())) {
                            deque.clear();
                        } else if (view4 != view2) {
                            deque.clear();
                        }
                    }
                }
            }
        };
        final int i5 = 2;
        this.af = new ViewTreeObserver.OnGlobalFocusChangeListener(this) { // from class: ran
            public final /* synthetic */ raw a;

            {
                this.a = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                int i52 = i5;
                if (i52 == 0) {
                    if (view != view2) {
                        raw rawVar = this.a;
                        if (view == rawVar.f().getDecorView() || view2 == null) {
                            rawVar.l(rawVar.f().getDecorView());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i52 == 1) {
                    raw rawVar2 = this.a;
                    if (view != null) {
                        if (omc.c("CAR.PROJECTION.PRES", 3)) {
                            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for oldFocus: %s", rawVar2.m, view);
                        }
                        rawVar2.t(view, false);
                    }
                    View view3 = (View) rawVar2.N.get();
                    if (view3 != null && view3 != view && view3 != view2) {
                        if (omc.c("CAR.PROJECTION.PRES", 3)) {
                            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s.onGlobalFocusChanged: setHovered(false) for lastFocus: %s", rawVar2.m, view3);
                        }
                        rawVar2.t(view3, false);
                    }
                    if (view2 != null) {
                        rawVar2.A(view2);
                    }
                    rawVar2.N = new WeakReference(view2);
                    return;
                }
                if (view != view2) {
                    qtq qtqVar = this.a.X;
                    if (view2 == null) {
                        return;
                    }
                    Deque deque = qtqVar.a;
                    qtp qtpVar = (qtp) deque.peek();
                    if (qtpVar != null) {
                        View view4 = (View) qtpVar.c.get();
                        if (!qtqVar.d(qtpVar.b, view4, (View) qtpVar.d.get())) {
                            deque.clear();
                        } else if (view4 != view2) {
                            deque.clear();
                        }
                    }
                }
            }
        };
        this.ag = new rap(this);
        if (rauVar.b) {
            Configuration configuration = getContext().getResources().getConfiguration();
            configuration.uiMode = (configuration.uiMode & (-49)) | (context.getResources().getConfiguration().uiMode & 48);
            getContext().getResources().updateConfiguration(configuration, getContext().getResources().getDisplayMetrics());
            if (rrd.e("CAR.PROJECTION.PRES", 4)) {
                rrd.d(4, "CAR.PROJECTION.PRES", null, "applyProvidedContextConfiguration updated getContext() configuration with %s", configuration);
            }
            if (rrd.e("CAR.PROJECTION.PRES", 4)) {
                rrd.d(4, "CAR.PROJECTION.PRES", null, "ProjectedPresentation ctor context configuration: %s", context.getResources().getConfiguration());
                rrd.d(4, "CAR.PROJECTION.PRES", null, "ProjectedPresentation ctor getContext() configuration: %s", getContext().getResources().getConfiguration());
            }
        }
        this.X = new qtq(0, 0);
        this.m = str;
        this.P = display;
        this.Q = rauVar;
        this.h = Pair.create(0, null);
        this.i = Pair.create(-1, null);
        this.j = Pair.create(2, null);
        Window windowF = f();
        windowF.setType(2030);
        windowF.addFlags(16777216);
        windowF.addFlags(8);
        this.Z = z;
        if (z) {
            windowF.addFlags(1024);
        }
        if (rauVar.h && spu.b() && (Build.VERSION.SDK_INT >= 37 || (Build.VERSION.CODENAME.charAt(0) >= 'C' && Build.VERSION.CODENAME.charAt(0) <= 'D'))) {
            windowF.addFlags(268435456);
        }
        windowF.setSoftInputMode(48);
        x(false);
        if (Build.VERSION.SDK_INT != 31) {
            this.R = new rax(getContext());
            this.ab = new raf(getContext());
            G(context);
        }
    }

    public static boolean D(View view, ViewGroup viewGroup) {
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent == viewGroup) {
                return true;
            }
        }
        return false;
    }

    private final void G(Context context) {
        if (this.Q.b) {
            this.e = context.getResources().getConfiguration();
            if (rrd.e("CAR.PROJECTION.PRES", 3)) {
                rrd.d(3, "CAR.PROJECTION.PRES", null, "ProjectedPresentation ctor registering ComponentCallbacks", new Object[0]);
                rrd.d(3, "CAR.PROJECTION.PRES", null, "ProjectedPresentation initial currentVideoConfiguration: %s", this.e);
            }
            this.f = new rao(this, 0);
            d().registerComponentCallbacks(this.f);
            ((ContextWrapper) d()).getBaseContext().registerComponentCallbacks(this.f);
        }
    }

    public static int a(int i, float f) {
        return (int) (i * (160.0f / f));
    }

    public static int b(raq raqVar) {
        if (raqVar.c) {
            return 2;
        }
        return raqVar.b ? 4 : 1;
    }

    public static int c(raq raqVar) {
        return raqVar.a ? 3 : 1;
    }

    public static raw h(Context context, Display display, int i, String str, boolean z, rau rauVar) throws InterruptedException {
        raw rawVar = new raw(context, display, i, str, z, rauVar);
        int i2 = 0;
        if (Build.VERSION.SDK_INT == 31) {
            if (rrd.e("CAR.PROJECTION.PRES", 4)) {
                rrd.d(4, "CAR.PROJECTION.PRES", null, "Waiting for correct configuration", new Object[0]);
            }
            HandlerThread handlerThread = new HandlerThread("ProjectedPresentation");
            rawVar.S = handlerThread;
            handlerThread.start();
            sss sssVar = new sss(rawVar.S.getLooper());
            rawVar.T = sssVar;
            sssVar.post(new ral(rawVar, i2));
            try {
                rawVar.V.acquire();
                return rawVar;
            } catch (InterruptedException e) {
                if (rrd.e("CAR.PROJECTION.PRES", 6)) {
                    rrd.b("CAR.PROJECTION.PRES", e, "Unable to acquire presentationConfiguredSemaphore");
                }
            }
        } else if (rrd.e("CAR.PROJECTION.PRES", 4)) {
            rrd.d(4, "CAR.PROJECTION.PRES", null, "Not waiting for correct configuration", new Object[0]);
        }
        return rawVar;
    }

    public final void A(View view) {
        if (view == null) {
            return;
        }
        boolean z = view.isFocused() && this.o && this.u;
        if (omc.c("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s updateHoveredState(%s) for %s", this.m, Boolean.valueOf(z), view);
        }
        t(view, z);
    }

    public final void B(Rect rect) {
        if (omc.c("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s updateSystemWindowInsets: %s", this.m, rect);
        }
        v(rect);
        View view = this.b;
        if (view != null) {
            view.requestApplyInsets();
        }
    }

    public final void C(MotionEvent motionEvent, int i, double d, double d2) {
        if (d != 0.0d) {
            p((float) (this.w + (i * d)), motionEvent.getY());
        } else if (d2 != 0.0d) {
            p(motionEvent.getX(), (float) (this.x + (i * d2)));
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean E(View view, int i, Rect rect) {
        rae raeVarG = g(view);
        boolean zRequestFocus = raeVarG == null ? view.requestFocus(i, rect) : raeVarG.s(view, i, rect);
        if (zRequestFocus || !omc.c("CAR.PROJECTION.PRES", 5)) {
            return zRequestFocus;
        }
        rrd.d(5, "CAR.PROJECTION.PRES", null, "%s requestFocus(%s, %s) on %s returned false", this.m, qrv.n(i), rect, view);
        return false;
    }

    @ResultIgnorabilityUnspecified
    public final void F(View view) {
        boolean zU;
        rae raeVarG = g(view);
        if (raeVarG == null) {
            int[] iArr = ebm.a;
            zU = ebh.c(view);
        } else {
            zU = raeVarG.u(view);
        }
        if (zU || !omc.c("CAR.PROJECTION.PRES", 5)) {
            return;
        }
        rrd.d(5, "CAR.PROJECTION.PRES", null, "%s requestFocus() on %s returned false", this.m, view);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.k) {
            return;
        }
        super.cancel();
    }

    public final Context d() {
        rau rauVar = this.Q;
        return !rauVar.a ? rauVar.c ? this.ab : getContext() : this.R;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.k) {
            return;
        }
        super.dismiss();
    }

    public final Pair e(int i) {
        qtq qtqVar = this.X;
        View currentFocus = getCurrentFocus();
        qto qtoVar = (qto) qtqVar.b.get(i);
        if (qtoVar != null) {
            if (i == qtoVar.a && qtoVar.c.get() == currentFocus && qtqVar.c(qtoVar.b) && qtqVar.a.isEmpty()) {
                return Pair.create(-1, null);
            }
            qtqVar.b();
        }
        z();
        return Pair.create(-1, new rom(i, this.L));
    }

    public final Window f() {
        Window window = getWindow();
        window.getClass();
        return window;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rae g(View view) {
        if (view == 0) {
            return null;
        }
        if (view instanceof rae) {
            return (rae) view;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return g((View) parent);
        }
        return null;
    }

    @Override // android.app.Presentation
    public final Resources getResources() {
        raf rafVar;
        rau rauVar = this.Q;
        return !rauVar.a ? (!rauVar.c || (rafVar = this.ab) == null) ? super.getResources() : rafVar.a : this.R.getResources();
    }

    public final void i(Configuration configuration) {
        if (this.e == null) {
            return;
        }
        configuration.uiMode = (this.e.uiMode & 48) | (configuration.uiMode & (-49));
    }

    public final void j(boolean z, boolean z2) {
        if (rrd.e("CAR.PROJECTION.PRES", 2)) {
            rrd.d(2, "CAR.PROJECTION.PRES", null, "%s callSetLocalFocus(hasFocus:%b, inTouchMode:%b)", this.m, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        this.p = z2;
        try {
            f().setLocalFocus(z, z2);
            this.q = new rav(z, z2);
        } catch (IllegalStateException unused) {
            rrd.d(5, "CAR.PROJECTION.PRES", null, "%s Trying to set input focus on window that's been removed.", this.m);
        }
    }

    public final void k() {
        if (this.W) {
            woy.aa(Looper.myLooper() != Looper.getMainLooper(), "completePresentationConfiguration must happen on worker thread");
        }
        this.R = new rax(getContext());
        this.ab = new raf(getContext());
        G(getContext());
        this.V.release();
        HandlerThread handlerThread = this.S;
        if (handlerThread != null) {
            handlerThread.quit();
            this.S = null;
        }
        this.T = null;
    }

    public final void l(View view) {
        if (this.p) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i).hasFocusable()) {
                    if (view.isFocusable()) {
                        view.setFocusable(false);
                        if (omc.c("CAR.PROJECTION.PRES", 3)) {
                            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s ensureFocusable set view to non-focusable because it has focusable children: %s", this.m, view);
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
        if (omc.c("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s ensureFocusable set view to focusable because it has no focusable children: %s", this.m, view);
        }
    }

    public final void m() {
        int size;
        int size2;
        View decorView = f().getDecorView();
        if (Build.VERSION.SDK_INT >= 33 && !(this.q.a == decorView.hasWindowFocus() && this.q.b == decorView.isInTouchMode())) {
            if (rrd.e("CAR.PROJECTION.PRES", 3)) {
                rrd.d(3, "CAR.PROJECTION.PRES", null, "%s executePendingWindowFocusReachedTasks aborting state not synced focus(expected=%b, actual=%b) touchMode(expected=%b actual=%b)", this.m, Boolean.valueOf(this.q.a), Boolean.valueOf(decorView.hasWindowFocus()), Boolean.valueOf(this.q.b), Boolean.valueOf(decorView.isInTouchMode()));
                return;
            }
            return;
        }
        while (true) {
            Queue queue = this.M;
            Runnable runnable = (Runnable) queue.poll();
            if (runnable == null) {
                return;
            }
            if (rrd.e("CAR.PROJECTION.PRES", 3)) {
                size = queue.size();
                rrd.d(3, "CAR.PROJECTION.PRES", null, "%s onWindowFocusChangeReached() [pendingOnWindowFocusReachedTasks.size():%d]", this.m, Integer.valueOf(size));
            } else {
                size = 0;
            }
            runnable.run();
            if (rrd.e("CAR.PROJECTION.PRES", 3) && size != (size2 = queue.size())) {
                rrd.d(3, "CAR.PROJECTION.PRES", null, "%s onWindowFocusChangeReached() pendingOnWindowFocusReachedTasks queue size altered while tasks were running. [before:%d, after:%d]", this.m, Integer.valueOf(size), Integer.valueOf(size2));
            }
        }
    }

    public final void n(Rect rect) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        Rect rect2 = this.H;
        if (rect2.equals(rect)) {
            return;
        }
        rect2.set(rect);
        if (omc.c("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s nonDrawableInsets set to: %s", this.m, rect2);
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
        this.C = BitmapDescriptorFactory.HUE_RED;
        this.D = BitmapDescriptorFactory.HUE_RED;
        this.E = BitmapDescriptorFactory.HUE_RED;
        this.F = BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r10, int r11, android.graphics.Rect r12) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L29
            android.view.Window r1 = r9.f()
            android.view.View r1 = r1.getDecorView()
            if (r10 == r1) goto L29
            android.view.Window r1 = r9.f()
            android.view.View r1 = r1.getDecorView()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L29
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.addFocusables(r2, r0)
            boolean r1 = r2.contains(r10)
            if (r1 != 0) goto L31
        L29:
            android.view.Window r10 = r9.f()
            android.view.View r10 = r10.getDecorView()
        L31:
            r1 = 5
            r2 = 0
            r3 = 1
            java.lang.String r4 = "CAR.PROJECTION.PRES"
            if (r10 != 0) goto L4a
            boolean r10 = defpackage.omc.c(r4, r1)
            if (r10 == 0) goto L9e
            java.lang.String r9 = r9.m
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r0] = r9
            java.lang.String r9 = "%s safeRequestFocus Unable to find view to request focus on."
            defpackage.rrd.d(r1, r4, r2, r9, r10)
            return
        L4a:
            boolean r5 = r9.z
            if (r5 == 0) goto L5b
            android.view.Window r5 = r9.f()
            android.view.View r5 = r5.getDecorView()
            if (r10 != r5) goto L5b
            r9.l(r10)
        L5b:
            boolean r5 = r9.p
            r6 = 2
            r7 = 3
            if (r5 == 0) goto L9f
            boolean r5 = r10.isInTouchMode()
            if (r5 != 0) goto L9f
            boolean r11 = defpackage.omc.c(r4, r7)
            if (r11 == 0) goto L7a
            java.lang.String r11 = r9.m
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r0] = r11
            r12[r3] = r10
            java.lang.String r11 = "%s handleGainFocus requestFocusFromTouch() on %s"
            defpackage.rrd.d(r7, r4, r2, r11, r12)
        L7a:
            rae r11 = r9.g(r10)
            if (r11 != 0) goto L85
            boolean r11 = r10.requestFocusFromTouch()
            goto L89
        L85:
            boolean r11 = r11.t(r10)
        L89:
            if (r11 != 0) goto L9e
            boolean r11 = defpackage.omc.c(r4, r1)
            if (r11 == 0) goto L9e
            java.lang.String r9 = r9.m
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r0] = r9
            r11[r3] = r10
            java.lang.String r9 = "%s requestFocusFromTouch() on %s returned false"
            defpackage.rrd.d(r1, r4, r2, r9, r11)
        L9e:
            return
        L9f:
            r1 = -1
            if (r11 == r1) goto Lc4
            if (r12 == 0) goto Lc4
            boolean r1 = defpackage.omc.c(r4, r7)
            if (r1 == 0) goto Lc0
            java.lang.String r1 = r9.m
            java.lang.String r5 = defpackage.qrv.n(r11)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r0] = r1
            r8[r3] = r5
            r8[r6] = r12
            r8[r7] = r10
            java.lang.String r0 = "%s handleGainFocus requestFocus(%s, %s) on %s"
            defpackage.rrd.d(r7, r4, r2, r0, r8)
        Lc0:
            r9.E(r10, r11, r12)
            return
        Lc4:
            boolean r11 = defpackage.omc.c(r4, r7)
            if (r11 == 0) goto Ld7
            java.lang.String r11 = r9.m
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r0] = r11
            r12[r3] = r10
            java.lang.String r11 = "%s handleGainFocus requestFocus() on %s"
            defpackage.rrd.d(r7, r4, r2, r11, r12)
        Ld7:
            r9.F(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.raw.q(android.view.View, int, android.graphics.Rect):void");
    }

    final void r(boolean z) {
        if (rrd.e("CAR.PROJECTION.PRES", 2)) {
            rrd.d(2, "CAR.PROJECTION.PRES", null, "%s setAttachedWindow(attached: %b) [attachedToWindow: %b, hasInputFocus: %b, inTouchMode: %b]", this.m, Boolean.valueOf(z), Boolean.valueOf(this.n), Boolean.valueOf(this.o), Boolean.valueOf(this.p));
        }
        this.n = z;
        ViewTreeObserver viewTreeObserver = f().getDecorView().getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserver.OnTouchModeChangeListener onTouchModeChangeListener = this.ag;
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
        View decorView = f().getDecorView();
        if (decorView instanceof ViewGroup) {
            ((ViewGroup) decorView).setDescendantFocusability(true != z ? 393216 : 262144);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        if (this.K != view) {
            if (this.z) {
                this.l.b();
                this.X.a.clear();
            }
            this.K = view;
            this.b = new rar(this, d(), view);
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
        new sss().post(new nwg(this, 11));
    }

    public final void t(View view, boolean z) {
        rae raeVarG = g(view);
        if (raeVarG == null) {
            view.setHovered(z);
        } else {
            raeVarG.x(z);
        }
    }

    public final void u(boolean z) {
        if (this.Z) {
            return;
        }
        this.aa = z;
        y();
    }

    public final void v(Rect rect) {
        Rect rect2 = this.G;
        if (rect2.equals(rect)) {
            return;
        }
        rect2.set(rect);
    }

    public final void w(Configuration configuration) {
        if (this.Q.b) {
            if (rrd.e("CAR.PROJECTION.PRES", 3)) {
                rrd.d(3, "CAR.PROJECTION.PRES", null, "ProjectedPresentation#setVideoConfiguration new config: %s", configuration);
            }
            this.e = configuration;
            Configuration configuration2 = getResources().getConfiguration();
            i(configuration2);
            if (rrd.e("CAR.PROJECTION.PRES", 3)) {
                rrd.d(3, "CAR.PROJECTION.PRES", null, "ProjectedPresentation#setVideoConfiguration updateConfiguration using new config: %s", configuration2);
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
        View currentFocus = f().getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
    }

    public final void y() {
        View view = this.b;
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
        View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            return;
        }
        int[] iArr = new int[2];
        currentFocus.getLocationInWindow(iArr);
        Rect rect = new Rect();
        currentFocus.getFocusedRect(rect);
        Rect rect2 = this.L;
        rect2.left = iArr[0] + rect.left;
        rect2.right = iArr[0] + rect.right;
        rect2.top = iArr[1] + rect.top;
        rect2.bottom = iArr[1] + rect.bottom;
    }
}
