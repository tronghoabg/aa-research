package com.waze.map;

import android.graphics.Color;
import android.opengl.GLES20;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.waze.NativeManager;
import com.waze.ig;
import com.waze.mg;
import j$.lang.Iterable$EL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeCanvasRenderer implements com.waze.map.isolated.ab {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27902d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static volatile DisplayMetrics f27903e = new DisplayMetrics();

    /* renamed from: i, reason: collision with root package name */
    private long f27910i;

    /* renamed from: j, reason: collision with root package name */
    private long f27911j;

    /* renamed from: l, reason: collision with root package name */
    private eg f27913l;
    private final String m;
    private final com.waze.map.isolated.d n;

    /* renamed from: f, reason: collision with root package name */
    private long f27907f = 0;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f27908g = com.waze.shared_infra.i.a.d("WAZE NTV RENDERER");

    /* renamed from: a, reason: collision with root package name */
    final AtomicBoolean f27904a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    final List f27905b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final List f27906c = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f27909h = 0;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27912k = false;
    private int o = -1;
    private int p = -1;
    private volatile String q = null;
    private volatile boolean r = false;
    private volatile boolean s = false;
    private final android.support.v4.a.a.a u = new android.support.v4.a.a.a((byte[]) null);
    private volatile eh t = null;

    static {
        w();
    }

    public NativeCanvasRenderer(String str, com.waze.map.isolated.d dVar) {
        this.m = str;
        this.n = dVar;
    }

    private final synchronized void B() {
        if (this.s) {
            this.s = false;
            notifyAll();
        }
    }

    private final void C(String str) {
        this.f27908g.a("removeCanvas(reason: " + str + ", canvasId:" + this.q + ")");
        ig igVar = new ig(this, 14);
        if (NativeManager.isAppStarted()) {
            NativeManager.Post(igVar);
        } else {
            NativeManager.registerOnAppStartedEvent(igVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native String CreateSurfaceNTV(String str, String str2, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void D() {
        if (this.f27913l != null) {
            E();
        }
        this.f27913l = new eg(this);
        NativeManager.getInstance().PostPriorityEvent(this.f27913l);
    }

    private native void DestroySurfaceNTV(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean DrawNTV(String str);

    private final synchronized void E() {
        eg egVar = this.f27913l;
        if (egVar == null) {
            return;
        }
        egVar.f28829a.set(true);
        this.f27913l = null;
    }

    private final synchronized void F() {
        while (this.s) {
            try {
                wait();
            } catch (Exception e2) {
                com.waze.shared_infra.i.a.b().c("Exception when waiting for canvas destroy", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void FlushNTV(String str, int i2, int i3);

    private static final void G(Runnable runnable, Runnable runnable2) {
        NativeManager.getInstance().PostPriorityEvent(runnable, runnable2);
    }

    private static final void H(Runnable runnable) {
        G(runnable, new com.google.android.gms.common.api.internal.bc(14));
    }

    private native void RemoveCanvasNTV(String str);

    private native void RenderNTV(String str, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void ResizeSurfaceNTV(String str, int i2, int i3);

    public static int a() {
        return f27903e.densityDpi;
    }

    public static /* synthetic */ void j(NativeCanvasRenderer nativeCanvasRenderer) {
        if (nativeCanvasRenderer.q != null) {
            nativeCanvasRenderer.RemoveCanvasNTV(nativeCanvasRenderer.q);
            nativeCanvasRenderer.q = null;
            nativeCanvasRenderer.n.e();
        }
    }

    public static /* synthetic */ void k(NativeCanvasRenderer nativeCanvasRenderer) {
        String strValueOf = String.valueOf(nativeCanvasRenderer.q);
        com.waze.shared_infra.i.e eVar = nativeCanvasRenderer.f27908g;
        eVar.a("Going to run destroy event. CanvasId: ".concat(strValueOf));
        if (nativeCanvasRenderer.q != null) {
            nativeCanvasRenderer.DestroySurfaceNTV(nativeCanvasRenderer.q);
            nativeCanvasRenderer.n.queueEvent(new ig(nativeCanvasRenderer, 13));
        }
        nativeCanvasRenderer.B();
        eVar.a("Finished to run destroy event");
    }

    public static /* synthetic */ void l(NativeCanvasRenderer nativeCanvasRenderer) {
        boolean zIsAppStarted = NativeManager.isAppStarted();
        boolean z = false;
        if (NativeManager.getInstance() != null && NativeManager.getInstance().isShutdown()) {
            z = true;
        }
        String str = "couldn't post destroyEvent, canceling our blocking-wait.isAppStarted(" + zIsAppStarted + "), isShutDown(" + z + ")";
        nativeCanvasRenderer.f27908g.b(str);
        nativeCanvasRenderer.B();
        ((com.waze.shared_infra.i.b) com.waze.web.r.h(com.waze.shared_infra.i.b.class)).a(new RuntimeException(str), null);
    }

    public static void w() {
        WindowManager windowManager = (WindowManager) mg.a().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        x(displayMetrics);
    }

    public static void x(DisplayMetrics displayMetrics) {
        f27903e = displayMetrics;
        com.waze.resources.a.f(f27903e);
        b.f27982a = f27903e.xdpi / 160.0f;
    }

    @Override // com.waze.map.isolated.ab
    public final void A() {
        this.f27904a.set(true);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.q == null || !this.r || this.f27904a.get()) {
            return;
        }
        if (!this.f27912k) {
            this.f27911j = System.currentTimeMillis();
            this.f27909h = 0;
            this.f27910i = 0L;
            this.f27912k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        RenderNTV(this.q, 0, 0);
        List list = this.f27906c;
        synchronized (list) {
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list);
                list.clear();
                Iterable$EL.forEach(arrayList, new com.google.b.d.b.m(2));
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        int i2 = this.f27909h + 1;
        this.f27909h = i2;
        long j2 = this.f27910i + (jCurrentTimeMillis2 - jCurrentTimeMillis);
        this.f27910i = j2;
        long j3 = jCurrentTimeMillis2 - this.f27911j;
        if (j3 >= 1000) {
            Log.i("RenderFPS", String.format(Locale.US, "Avg render time in last 1000 millis: %.3f (Actual: %d)", Float.valueOf((1000.0f / j3) * (j2 / i2)), Integer.valueOf(this.f27909h)));
            this.f27912k = false;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        if (this.o == i2 && this.p == i3) {
            return;
        }
        this.r = true;
        this.f27908g.a("onSurfaceChanged [ " + this.m + " ] :" + i2 + ", " + i3 + String.valueOf(this.t));
        ee eeVar = new ee(this, i2, i3);
        ef efVar = new ef(this, i2, i3);
        if (this.o == -1 || this.p == -1) {
            this.u.d();
            H(eeVar);
        } else {
            H(efVar);
        }
        this.o = i2;
        this.p = i3;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) throws SecurityException, IllegalArgumentException {
        this.f27908g.a("onSurfaceCreated [ " + this.m + " ]. " + String.valueOf(this.t));
        this.p = -1;
        this.o = -1;
        Process.setThreadPriority(-4);
        GLES20.glClearColor((float) Color.red(-657158), (float) Color.green(-657158), (float) Color.blue(-657158), (float) Color.alpha(-657158));
        GLES20.glClear(16384);
    }

    @Override // com.waze.map.isolated.ab
    public final void q() {
        C("onHostScreenDestroyed");
    }

    @Override // com.waze.map.isolated.ab
    public final void r(MotionEvent motionEvent) {
        this.f27907f = System.currentTimeMillis();
    }

    @Override // com.waze.map.isolated.ab
    public final void s() {
        C("onViewDetached");
    }

    @Override // com.waze.map.isolated.ab
    public final void t() {
        this.f27908g.a("onViewSurfaceChanged [ " + this.m + " ].");
        if (this.t != null) {
            this.t.c(2);
        }
    }

    @Override // com.waze.map.isolated.ab
    public final void u() {
        if (this.t != null && this.t.a()) {
            this.f27908g.a("onViewSurfaceCreated - already created. ".concat(String.valueOf(String.valueOf(this.t))));
            return;
        }
        this.f27908g.a("onViewSurfaceCreated [ " + this.m + " ].");
        this.t = new eh();
    }

    @Override // com.waze.map.isolated.ab
    public final void v() {
        String str = "onViewSurfaceDestroyed: [ " + this.m + " ]. Event: " + String.valueOf(this.t);
        com.waze.shared_infra.i.e eVar = this.f27908g;
        eVar.a(str);
        if (this.t == null || this.t.b() || !this.r) {
            return;
        }
        this.r = false;
        this.t.c(3);
        E();
        this.s = true;
        G(new ig(this, 15), new ig(this, 16));
        F();
        this.u.d();
        eVar.a("Finished onViewSurfaceDestroyed");
    }
}
