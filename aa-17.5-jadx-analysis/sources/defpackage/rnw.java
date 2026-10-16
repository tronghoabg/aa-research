package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class rnw implements KeyEvent.Callback, qqo, qqi, rbg {
    public static final SparseArray a;
    public Object A;
    public DrawingSpec B;
    public final rck C;
    public final Object D;
    public boolean E;
    public volatile int F;
    final rbe G;
    public boolean H;
    public qqh I;
    public qxu J;
    public ols K;
    public vag L;
    public lds M;
    private boolean N;
    private boolean O;
    private boolean P;
    private ComponentName Q;
    private final KeyEvent.DispatcherState R;
    public final Pair b;
    public final Semaphore c;
    public final Runnable d;
    public final IBinder.DeathRecipient e;
    public Service f;
    public Context g;
    public Class h;
    public qxy i;
    public CarRegionId j;
    public ror k;
    public qrn l;
    public Intent m;
    public Bundle n;
    public Configuration o;
    public boolean p;
    public int q;
    public volatile boolean r;
    public View s;
    public String t;
    public final Rect u;
    public final Rect v;
    public final reh w;
    public boolean x;
    public final qqf y;
    public final boolean z;

    static {
        SparseArray sparseArray = new SparseArray(7);
        a = sparseArray;
        sparseArray.put(0, "INITIALIZING");
        sparseArray.put(1, "CREATED");
        sparseArray.put(2, "STOPPED");
        sparseArray.put(3, "STARTED");
        sparseArray.put(4, "PAUSED");
        sparseArray.put(5, "RESUMED");
        sparseArray.put(6, "FINISHED");
    }

    public rnw(byte[] bArr) {
        rbe rbeVar = new rbe(false);
        this.c = new Semaphore(0);
        this.d = new nwg(this, 17, null);
        this.e = new rnm(this, 0);
        this.N = false;
        this.r = false;
        this.u = new Rect();
        this.v = new Rect();
        this.x = true;
        this.C = new rzs(this, 1);
        this.D = new Object();
        this.R = new KeyEvent.DispatcherState();
        this.F = 0;
        this.G = rbeVar;
        this.z = true;
        this.b = Pair.create(-1, null);
        reh rehVar = new reh(Looper.getMainLooper(), new nwg(this, 18, null));
        this.w = rehVar;
        this.y = new rnn(this, rehVar);
    }

    private final void A() throws PackageManager.NameNotFoundException {
        m(this.B);
        this.k.j();
        this.k.u(this.u);
        this.k.r(this.v);
        x();
    }

    private final void B(WindowManager.LayoutParams layoutParams) {
        try {
            qqh qqhVar = this.I;
            if (qqhVar != null) {
                qqhVar.u(layoutParams);
            }
        } catch (NoSuchMethodError unused) {
            boolean z = rrd.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Unable to deliver onWindowAttributesChanged callback", new Object[0]);
        }
    }

    private final void C() {
        reh rehVar = this.w;
        if (rehVar != null) {
            rehVar.J(this.C);
        }
        ror rorVar = this.k;
        if (rorVar != null) {
            rorVar.z();
        }
    }

    private static final qqh D(ClassLoader classLoader, String str) {
        try {
            return (qqh) classLoader.loadClass(str).getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new RuntimeException("Exception while instantiating class ".concat(String.valueOf(str)), e);
        }
    }

    public static String i(int i) {
        SparseArray sparseArray = a;
        return sparseArray.get(i) == null ? "Unknown" : (String) sparseArray.get(i);
    }

    private final int z(String str, int i) {
        try {
            return this.w.A(str, i);
        } catch (qrz e) {
            rrd.d(5, "CAR.PROJECTION.CAHI", e, "Unable to connect to car service to get %s. Using default value %s", str, Integer.valueOf(i));
            return i;
        }
    }

    @Override // defpackage.qqi
    public final void a() {
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s.finish()", this.t);
        }
        if (!this.r) {
            this.r = true;
            new sss(Looper.getMainLooper()).postAtFrontOfQueue(new nwg(this, 19, null));
        } else if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Already finishing %s, ignoring duplicate finish", this.t);
        }
    }

    @Override // defpackage.qqi
    public final void b(View view) {
        this.s = view;
        if (view != null) {
            this.k.q(view);
        }
    }

    @Override // defpackage.rbg
    public final raw c() {
        ror rorVar = this.k;
        if (rorVar instanceof rop) {
            return ((rop) rorVar).b;
        }
        throw new IllegalStateException("getPresentation not supported");
    }

    @Override // defpackage.rbg
    public final void d(boolean z, rom romVar) {
        try {
            if (this.i != null) {
                if (!this.w.p(raj.L)) {
                    this.i.k(z);
                } else {
                    this.i.j(new KeyEventCompleteData(z, romVar.c));
                }
            }
        } catch (RemoteException unused) {
            t();
        }
    }

    @Override // defpackage.rbg
    public final void e(WindowManager.LayoutParams layoutParams) {
        ror rorVar = this.k;
        if (rorVar != null) {
            rorVar.s((layoutParams.flags & 1024) != 0);
        }
        B(layoutParams);
    }

    @Override // defpackage.rbg
    public final void f(boolean z, boolean z2) {
        Object obj = this.D;
        synchronized (obj) {
            if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                rrd.d(2, "CAR.PROJECTION.CAHI", null, "%s performWindowFocusChange(hasFocus:%b, inTouchMode%b) [activityHasWindowFocus:%b]", this.t, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(this.E));
            }
            this.E = z;
            obj.notifyAll();
        }
        if (rrd.e("CAR.PROJECTION.CAHI", 3)) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s %s.onWindowFocusChanged, focus=%b, touch mode=%b", this.Q.toShortString(), this.t, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        this.I.x(z);
    }

    @Override // defpackage.rbg
    public final boolean g() {
        boolean z;
        synchronized (this.D) {
            if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                rrd.d(2, "CAR.PROJECTION.CAHI", null, "%s hasWindowFocus() [activityHasWindowFocus:%b]", this.t, Boolean.valueOf(this.E));
            }
            z = this.E;
        }
        return z;
    }

    @Override // defpackage.rbg
    public final boolean h(KeyEvent keyEvent) {
        return this.I != null && keyEvent.dispatch(this, this.R, this);
    }

    public final void j() {
        if (this.G.l(this.g, Binder.getCallingUid()) || this.g.checkCallingPermission("android.permission.CAPTURE_VIDEO_OUTPUT") == 0) {
            return;
        }
        throw new SecurityException("projection client manager does not have permission:android.permission.CAPTURE_VIDEO_OUTPUT pid:" + Binder.getCallingPid() + " uid:" + Binder.getCallingUid());
    }

    public final void k() {
        reh rehVar = this.w;
        this.k.t(rehVar.K(roy.PRESENTATION_CLEAR_PARENT_PADDING));
        this.k.H();
        this.k.u(this.u);
        this.k.r(this.v);
        boolean zP = rehVar.p(raj.G);
        ror rorVar = this.k;
        if (zP) {
            u(rorVar.i());
        } else {
            v(rorVar.b().getResources());
        }
        w();
        try {
            rehVar.L(CarDisplayId.a).b(this.C);
        } catch (qrz unused) {
            if (rrd.e("CAR.PROJECTION.CAHI", 3)) {
                rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s attachUiHost while not connected to car", this.t);
            }
        }
        reh rehVar2 = this.w;
        if (!rehVar2.p(raj.ab)) {
            Window windowH = this.k.h();
            windowH.getClass();
            windowH.setCallback(new rbf(this, rehVar2.p(raj.ac)));
        }
        if (this.k.h().getAttributes() != null) {
            this.k.h().getAttributes().setTitle(this.t);
        }
        if (this.N) {
            return;
        }
        boolean zP2 = rehVar2.p(raj.G);
        qqh qqhVar = this.I;
        if (zP2) {
            qqhVar.L(this.k.i());
        } else {
            qqhVar.L(this.k.b());
        }
        qqh qqhVar2 = this.I;
        if (Log.isLoggable("CAR.PROJECTION", 2)) {
            Log.v("CAR.PROJECTION", "Context DPI: " + qqhVar2.getResources().getConfiguration().densityDpi);
        }
        qqhVar2.e = this;
        this.N = true;
    }

    public final void l() {
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s.destroyUiHost()", this.t);
        }
        C();
        ror rorVar = this.k;
        if (rorVar != null) {
            rorVar.p();
            this.k = null;
        }
    }

    public final void m(DrawingSpec drawingSpec) throws PackageManager.NameNotFoundException {
        if (this.k == null) {
            if (omc.c("CAR.PROJECTION.CAHI", 3)) {
                rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s.createUiHost()", this.t);
            }
            reh rehVar = this.w;
            boolean zP = rehVar.p(raj.G);
            boolean zP2 = rehVar.p(raj.V);
            boolean zP3 = rehVar.p(raj.X);
            int iZ = 10;
            int iZ2 = 20;
            if (rehVar.p(raj.J)) {
                iZ = z("projected_presentation_config_max_checks", 10);
                iZ2 = z("projected_presentation_config_check_delay", 20);
            }
            rat ratVarA = rau.a();
            ratVarA.h(zP);
            ratVarA.g(zP2);
            ratVarA.i(zP3);
            ratVarA.c(rehVar.p(raj.K));
            ratVarA.f(iZ);
            ratVarA.d(iZ2);
            ratVarA.b(rehVar.p(raj.F));
            ratVarA.e(rehVar.p(raj.af));
            rau rauVarA = ratVarA.a();
            boolean zK = rehVar.K(roy.FULLSCREEN_PRESENTATION);
            if (Build.VERSION.SDK_INT < 36 || !rehVar.p(raj.ab)) {
                this.k = new rop(new roq() { // from class: rnk
                    @Override // defpackage.roq
                    public final Context a(Display display) {
                        return this.a.f;
                    }
                }, this.g, 0, null, rauVarA, zK, this.f.getPackageName() + "/" + this.h.getName(), new rnl(this));
            } else {
                this.k = new rou(new roq() { // from class: rnj
                    @Override // defpackage.roq
                    public final Context a(Display display) {
                        rnw rnwVar = this.a;
                        Context contextCreateWindowContext = rnwVar.f.createDisplayContext(display).createWindowContext(2038, null);
                        rnwVar.v(contextCreateWindowContext.getResources());
                        return contextCreateWindowContext;
                    }
                }, this.g, roc.h(this.f), this.f.getPackageName() + "/" + this.h.getName(), new rnp(this));
            }
        }
        this.k.x(drawingSpec);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rnw.n(int, boolean):void");
    }

    public final void o(InputFocusChangedEvent inputFocusChangedEvent, boolean z) {
        qxy qxyVar;
        if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
            rrd.d(2, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange(event:%s, callback:%b)", this.t, inputFocusChangedEvent, Boolean.valueOf(z));
        }
        if (!y()) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange() No-Op as CAR_API not connected", this.t);
            return;
        }
        this.x = inputFocusChangedEvent.b;
        ror rorVar = this.k;
        if (rorVar != null) {
            rorVar.o(inputFocusChangedEvent);
        } else {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange() uiHost is null", this.t);
        }
        if (!z || (qxyVar = this.i) == null) {
            return;
        }
        try {
            qxyVar.i();
        } catch (RemoteException e) {
            rrd.d(6, "CAR.PROJECTION.CAHI", null, "%s onInputFocusChange() [RemoteException:%s]", this.t, e);
            rbe.h(this.d);
        }
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.I.p(i, keyEvent);
    }

    public final void p(CarRegionId carRegionId, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) throws PackageManager.NameNotFoundException {
        ror rorVar;
        if (y()) {
            Bundle bundleExtra = intent.getBundleExtra("PROJECTION_CONFIGURATION");
            this.H = bundleExtra != null && bundleExtra.getBoolean("CANCEL_PENDING_LIFECYCLE_EVENTS_FOR_FINISH_ENABLED");
            if (rrd.e("CAR.PROJECTION.CAHI", 3)) {
                rrd.d(3, "CAR.PROJECTION.CAHI", null, "projectionConfigBundle: %s", bundleExtra);
            }
            if (this.H && this.r) {
                rrd.d(5, "CAR.PROJECTION.CAHI", null, "%s onProjectionStart not sent, activity is finishing", this.t);
                qxy qxyVar = this.i;
                if (qxyVar != null) {
                    try {
                        qxyVar.q();
                        return;
                    } catch (RemoteException unused) {
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
            Bundle bundle2 = this.n;
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
            if (this.w.p(raj.F) && (rorVar = this.k) != null) {
                rorVar.D(this.u);
            }
            x();
            qxy qxyVar2 = this.i;
            if (qxyVar2 != null) {
                try {
                    qxyVar2.q();
                } catch (RemoteException unused2) {
                    t();
                }
            }
        }
    }

    public final void q() {
        this.p = false;
        try {
            qxy qxyVar = this.i;
            if (qxyVar != null) {
                qxyVar.t();
            }
        } catch (RemoteException unused) {
            t();
        }
    }

    public final void r() throws PackageManager.NameNotFoundException {
        DrawingSpec drawingSpec = this.B;
        int i = this.F;
        boolean zE = this.k.E();
        rbx rbxVarA = zE ? rbx.a(this.s) : null;
        if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
            rrd.d(2, "CAR.PROJECTION.CAHI", null, "%s onVideoConfigurationChange() [hasInputFocus:%b, inTouchMode:%b]", this.t, Boolean.valueOf(zE), Boolean.valueOf(this.x));
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
        Bundle bundle = this.n;
        if (bundle != null) {
            bundle.setClassLoader(this.f.getClassLoader());
        }
        n(i, false);
        View view = this.s;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new rnv(this, zE, this.s, rbxVarA));
        } else if (zE) {
            this.k.o(new InputFocusChangedEvent(true, this.x, -1, null));
        }
    }

    public final void s(DrawingSpec drawingSpec) {
        Rect rect = drawingSpec.e;
        if (rect == null) {
            boolean z = rrd.a;
            rrd.d(2, "CAR.PROJECTION.CAHI", null, "spec has no insets. Will not update uiHost.", new Object[0]);
            return;
        }
        Rect rect2 = this.u;
        rect2.set(rect);
        ror rorVar = this.k;
        if (rorVar != null) {
            rorVar.u(rect2);
            this.k.r(new Rect());
        } else {
            boolean z2 = rrd.a;
            rrd.d(2, "CAR.PROJECTION.CAHI", null, "System window insets set before uiHost attached. Will apply to uiHost when attaching.", new Object[0]);
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

    public final void u(rax raxVar) {
        woy.aa(this.w.p(raj.G), "Configuration context must be enabled to call updateContextConfigurationForNightMode");
        if (this.o == null) {
            return;
        }
        Resources resources = raxVar.getResources();
        int i = resources.getConfiguration().uiMode & (-49);
        resources.getConfiguration().uiMode = (this.o.uiMode & 48) | i;
        raxVar.a(resources.getConfiguration(), resources.getDisplayMetrics());
    }

    public final void v(Resources resources) {
        if (this.o == null) {
            return;
        }
        int i = resources.getConfiguration().uiMode & (-49);
        resources.getConfiguration().uiMode = (this.o.uiMode & 48) | i;
        resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            r15 = this;
            java.lang.String r1 = "%s Configuration change while not connected to car"
            java.lang.String r2 = "%s Unable to get configuration from CarService!"
            java.lang.String r3 = "CAR.PROJECTION.CAHI"
            reh r0 = r15.w
            boolean r4 = r0.P()
            if (r4 == 0) goto La6
            boolean r4 = r15.r
            if (r4 == 0) goto L14
            goto La6
        L14:
            r4 = 6
            r5 = 3
            r6 = 1
            r7 = 0
            r8 = 0
            qup r0 = r0.C()     // Catch: java.lang.IllegalStateException -> L22 android.os.RemoteException -> L42
            com.google.android.gms.car.CarUiInfo r0 = r0.u()     // Catch: java.lang.IllegalStateException -> L22 android.os.RemoteException -> L42
            goto L4d
        L22:
            r0 = move-exception
            defpackage.olm.f(r0)     // Catch: java.lang.IllegalStateException -> L27 defpackage.qrz -> L32
            goto L4c
        L27:
            r0 = move-exception
            java.lang.String r9 = r15.t
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r8] = r9
            defpackage.rrd.d(r4, r3, r0, r2, r10)
            goto L4c
        L32:
            boolean r0 = defpackage.rrd.e(r3, r5)
            if (r0 == 0) goto L4c
            java.lang.String r0 = r15.t
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r8] = r0
            defpackage.rrd.d(r5, r3, r7, r1, r2)
            goto L4c
        L42:
            r0 = move-exception
            java.lang.String r9 = r15.t
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r8] = r9
            defpackage.rrd.d(r4, r3, r0, r2, r10)
        L4c:
            r0 = r7
        L4d:
            ror r2 = r15.k
            if (r2 != 0) goto L60
            r15 = 5
            boolean r0 = defpackage.omc.c(r3, r15)
            if (r0 == 0) goto La6
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "updateUiHostForInputMethods invoked when uiHost not set"
            defpackage.rrd.d(r15, r3, r7, r1, r0)
            return
        L60:
            if (r0 == 0) goto L77
            boolean r10 = r0.b
            boolean r11 = r0.a
            boolean r12 = r0.d
            int r13 = r0.i
            int r14 = r0.j
            raq r9 = new raq
            r9.<init>(r10, r11, r12, r13, r14)
            r2.A(r9)
            boolean r0 = r0.d
            goto L78
        L77:
            r0 = r8
        L78:
            reh r2 = r15.w     // Catch: defpackage.qrz -> L97
            java.lang.String r4 = "rotary_use_focus_finder"
            boolean r4 = r2.N(r4)     // Catch: defpackage.qrz -> L97
            if (r0 == 0) goto L8f
            java.lang.String r0 = "touchpad_focus_navigation_history_max_size"
            int r0 = r2.A(r0, r8)     // Catch: defpackage.qrz -> L97
            java.lang.String r9 = "touchpad_focus_navigation_history_max_age_ms"
            int r2 = r2.A(r9, r8)     // Catch: defpackage.qrz -> L97
            goto L91
        L8f:
            r0 = r8
            r2 = r0
        L91:
            ror r9 = r15.k     // Catch: defpackage.qrz -> L97
            r9.C(r4, r0, r2)     // Catch: defpackage.qrz -> L97
            goto La6
        L97:
            boolean r0 = defpackage.rrd.e(r3, r5)
            if (r0 == 0) goto La6
            java.lang.String r15 = r15.t
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r15
            defpackage.rrd.d(r5, r3, r7, r1, r0)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rnw.w():void");
    }

    public final void x() {
        Configuration configuration;
        ror rorVar = this.k;
        if (rorVar == null || (configuration = this.o) == null) {
            return;
        }
        rorVar.v(configuration);
    }

    public final boolean y() {
        if (this.w.P()) {
            return true;
        }
        rrd.d(5, "CAR.PROJECTION.CAHI", null, "%s ICar not available", this.t);
        return false;
    }

    public rnw() {
        throw null;
    }
}
