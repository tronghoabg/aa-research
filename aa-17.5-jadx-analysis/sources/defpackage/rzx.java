package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.TouchEventCompleteData;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class rzx implements ComponentCallbacks, rbg {
    private final boolean A;
    private final boolean B;
    private final boolean C;
    private final boolean D;
    private final rau E;
    private boolean F;
    private final rdx H;
    public final String a;
    public final rby b;
    public final Context d;
    public final int e;
    public Context f;
    public ror g;
    public qyz i;
    public View j;
    Configuration k;
    public boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public boolean r;
    public boolean t;
    public final qzb u;
    private final boolean v;
    private final rpa w;
    private final rpb x;
    private final int z;
    public final Object c = new Object();
    private final rck y = new rzs(this, 0);
    public final Configuration h = new Configuration();
    public final List s = new CopyOnWriteArrayList();
    private final List G = new ArrayList();

    public rzx(rdx rdxVar, rby rbyVar, String str, Context context, boolean z, Handler handler, int i, boolean z2, int i2, rpa rpaVar, rpb rpbVar, boolean z3, boolean z4, boolean z5, rau rauVar, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.b = rbyVar;
        this.a = str;
        this.d = context;
        this.v = z;
        this.H = rdxVar;
        this.u = new qzb(this, handler);
        this.e = i;
        this.A = z2;
        this.z = i2;
        this.w = rpaVar;
        this.x = rpbVar;
        this.E = rauVar;
        this.B = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.C = z8;
        this.q = z9;
        this.D = z10;
    }

    public static void q(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        configuration.uiMode = (configuration2.uiMode & (-49)) | (configuration3.uiMode & 48);
    }

    public static final void r(ror rorVar, CarUiInfo carUiInfo) {
        rorVar.A(new raq(carUiInfo.b, carUiInfo.a, carUiInfo.d, carUiInfo.i, carUiInfo.j));
    }

    private final void s(ror rorVar) {
        if (this.B) {
            try {
                u(rorVar);
            } catch (IllegalStateException e) {
                t(e);
            } catch (qrz unused) {
                rrd.d(5, "CAR.CLIENT.WM.WIN", null, "Swallowing CarNotConnectedException; hope we're tearing down...", new Object[0]);
            }
        }
        rorVar.y();
        this.t = true;
        n();
        try {
            this.i.j();
        } catch (RemoteException e2) {
            rrd.b("CAR.CLIENT.WM.WIN", e2, "onWindowAttached RemoteException");
            rbe.g(Looper.getMainLooper(), new rnq(this, 18));
        }
    }

    private static void t(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (!"Client not connected.".equals(message) && !"Client is not connected.".equals(message)) {
            throw illegalStateException;
        }
        rrd.d(5, "CAR.CLIENT.WM.WIN", null, "Ignoring IllegalStateException, hope we're tearing down...", new Object[0]);
    }

    private final void u(ror rorVar) throws qrz {
        r(rorVar, this.H.a());
    }

    public final Context a(Context context, Configuration configuration, Display display) {
        try {
            CarUiInfo carUiInfoA = this.H.a();
            boolean z = carUiInfoA.b;
            boolean z2 = carUiInfoA.a;
            boolean z3 = carUiInfoA.d;
            configuration.touchscreen = true != z ? 1 : 3;
            configuration.navigation = (z2 || z3) ? 4 : 1;
        } catch (IllegalStateException e) {
            t(e);
        } catch (qrz unused) {
            rrd.d(5, "CAR.CLIENT.WM.WIN", null, "Swallowing CarNotConnectedException; hope we're tearing down...", new Object[0]);
        }
        Context contextCreateConfigurationContext = context.createDisplayContext(display).createConfigurationContext(configuration);
        contextCreateConfigurationContext.setTheme(this.z);
        return contextCreateConfigurationContext;
    }

    public final void b(PrintWriter printWriter) {
        if (this.g == null) {
            printWriter.println("No presentation");
            return;
        }
        printWriter.println("Window ".concat(String.valueOf(this.a)));
        printWriter.println("hasFocus = " + this.l);
        printWriter.println("CriticalUi -- isSecureAndNotReadable: " + this.F + " externalCriticalUiStateReady: " + this.r);
        this.g.l(printWriter);
    }

    @Override // defpackage.rbg
    public final raw c() {
        ror rorVar = this.g;
        if (rorVar == null) {
            return null;
        }
        if (rorVar instanceof rop) {
            return ((rop) rorVar).b;
        }
        throw new IllegalStateException("getPresentation not supported");
    }

    @Override // defpackage.rbg
    public final void d(boolean z, rom romVar) {
        Rect rect;
        if (romVar != null) {
            try {
                rect = romVar.c;
            } catch (RemoteException e) {
                rrd.b("CAR.CLIENT.WM.WIN", e, "onKeyEventComplete RemoteException");
                rbe.j(new rnq(this, 18));
                return;
            }
        } else {
            rect = null;
        }
        this.i.g(new KeyEventCompleteData(z, rect));
    }

    @Override // defpackage.rbg
    public final void e(WindowManager.LayoutParams layoutParams) {
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s onWindowAttributesChanged(%s): %s", this.a, layoutParams, Integer.valueOf(layoutParams.flags));
        }
        if (!this.D || Build.VERSION.SDK_INT >= 35) {
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
    @Override // defpackage.rbg
    public final void f(boolean z, boolean z2) {
        Object obj = this.c;
        synchronized (obj) {
            if (omc.c("CAR.CLIENT.WM.WIN", 2)) {
                rrd.d(2, "CAR.CLIENT.WM.WIN", null, "%s performWindowFocusChange(hasFocus:%b, inTouchMode:%b) [this.hasFocus:%b]", this.a, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(this.l));
            }
            this.l = z;
            Iterator it = new ArrayList(this.s).iterator();
            while (it.hasNext()) {
                urg urgVar = (urg) it.next();
                if (z) {
                    ((rzx) urgVar.b).s.remove(urgVar);
                    urgVar.a.run();
                }
            }
            obj.notifyAll();
        }
    }

    @Override // defpackage.rbg
    public final boolean g() {
        boolean z;
        synchronized (this.c) {
            z = this.l;
        }
        return z;
    }

    @Override // defpackage.rbg
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }

    public final void i() {
        boolean z = !this.F && this.r;
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s maybeUpdateCriticalUiStateInner ready:%s secureAndNotReadable:%s", this.a, Boolean.valueOf(this.r), Boolean.valueOf(this.F));
        }
        try {
            this.i.s(z);
        } catch (RemoteException e) {
            rrd.b("CAR.CLIENT.WM.WIN", e, "updateCriticalUiState RemoteException");
        }
    }

    public final void j(int i, rom romVar) {
        int i2;
        if (romVar != null) {
            try {
                i2 = romVar.b;
            } catch (RemoteException e) {
                rrd.b("CAR.CLIENT.WM.WIN", e, "onMotionEvent RemoteException");
                rbe.j(new rnq(this, 18));
                return;
            }
        } else {
            i2 = -1;
        }
        this.i.h(new TouchEventCompleteData(i, romVar != null ? romVar.c : null, i2));
    }

    final void k(DrawingSpec drawingSpec) {
        ror rorVar = this.g;
        if (rorVar == null) {
            rrd.d(5, "CAR.CLIENT.WM.WIN", null, "uiHost is null in onPresentationUiCreated, likely due to concurrent teardown.", new Object[0]);
            return;
        }
        rorVar.t(this.w.K(roy.PRESENTATION_CLEAR_PARENT_PADDING));
        rorVar.G();
        try {
            u(rorVar);
            rpb rpbVar = this.x;
            rorVar.C(rpbVar.N("rotary_use_focus_finder"), rpbVar.A("touchpad_focus_navigation_history_max_size", 0), rpbVar.A("touchpad_focus_navigation_history_max_age_ms", 0));
            this.H.b(this.y);
        } catch (IllegalStateException e) {
            t(e);
        } catch (qrz unused) {
            rrd.d(5, "CAR.CLIENT.WM.WIN", null, "Swallowing CarNotConnectedException; hope we're tearing down...", new Object[0]);
            return;
        }
        Rect rect = drawingSpec.e;
        if (rect == null) {
            rect = new Rect();
        }
        rorVar.u(rect);
        Context contextA = rorVar.a();
        this.f = contextA;
        contextA.registerComponentCallbacks(this);
        Window windowH = rorVar.h();
        windowH.getClass();
        if (!this.p) {
            windowH.setCallback(new rbf(this, this.C));
        }
        if (this.v) {
            rorVar.m();
            windowH.getDecorView().setBackgroundColor(0);
        }
        this.j = this.b.a(this.f);
        this.k = new Configuration(this.j.getResources().getConfiguration());
        rorVar.q(this.j);
        if (windowH.getAttributes() != null) {
            windowH.getAttributes().setTitle(this.a);
        }
        s(rorVar);
    }

    final void l() {
        this.H.c(this.y);
        Context context = this.f;
        if (context != null) {
            context.unregisterComponentCallbacks(this);
        }
    }

    public final void m(final DrawingSpec drawingSpec, Configuration configuration) {
        byte[] bArr = null;
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s onWindowAttached drawingSpec %s config %s", this.a, drawingSpec, configuration);
        }
        Configuration configuration2 = this.h;
        configuration2.densityDpi = drawingSpec.c;
        ror rorVar = this.g;
        if (rorVar == null) {
            if (this.A) {
                configuration.getClass();
                q(configuration2, this.d.getResources().getConfiguration(), configuration);
            }
            ror rouVar = this.p ? new rou(new roq() { // from class: rzt
                @Override // defpackage.roq
                public final Context a(Display display) {
                    rzx rzxVar = this.a;
                    Configuration configuration3 = new Configuration(rzxVar.h);
                    configuration3.densityDpi = drawingSpec.c;
                    return rzxVar.a(rzxVar.d, configuration3, display);
                }
            }, this.d, this.z, this.a, new rzu(this, drawingSpec)) : new rop(new roq() { // from class: rzq
                @Override // defpackage.roq
                public final Context a(Display display) {
                    rzx rzxVar = this.a;
                    Configuration configuration3 = new Configuration(rzxVar.h);
                    configuration3.densityDpi = drawingSpec.c;
                    return rzxVar.a(rzxVar.d, configuration3, display);
                }
            }, this.d, this.z, new sgk(this, drawingSpec, bArr), this.E, this.w.K(roy.FULLSCREEN_PRESENTATION), this.a, new rzv(this, drawingSpec));
            this.g = rouVar;
            rouVar.x(drawingSpec);
            this.g.j();
            return;
        }
        rorVar.x(drawingSpec);
        boolean zF = this.g.F();
        ror rorVar2 = this.g;
        if (zF) {
            s(rorVar2);
        } else {
            rorVar2.j();
        }
    }

    public final void n() {
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s maybeSendOnWindowVisibilityChanged shown:%s secureAndNotReadable:%s", this.a, Boolean.valueOf(this.t), Boolean.valueOf(this.F));
        }
        ArrayList arrayList = new ArrayList(this.G);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rzw) arrayList.get(i)).a();
        }
    }

    public final void o() {
        wer.c();
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "teardown(): %s", this.a);
        }
        this.j = null;
        this.H.c(this.y);
        Context context = this.f;
        if (context != null) {
            context.unregisterComponentCallbacks(this);
            this.f = null;
        }
        ror rorVar = this.g;
        if (rorVar != null) {
            rorVar.p();
            this.g = null;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s onConfigurationChanged. newApplicationConfig %s view %s", this.a, configuration, this.j);
        }
        if (this.j == null || this.A) {
            if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
                rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s ignoring config change hasLocalNightModeFeature=%b view=%s ", this.a, Boolean.valueOf(this.A), this.j);
                return;
            }
            return;
        }
        Configuration configuration2 = this.f.getResources().getConfiguration();
        if ((configuration2.uiMode & 15) != 3) {
            rrd.a("CAR.CLIENT.WM.WIN", null, "ignoring non-car mode configuration change");
            return;
        }
        int iDiff = this.k.diff(configuration2);
        if (iDiff != 0) {
            if ((iDiff & (~this.e)) == 0) {
                this.j.dispatchConfigurationChanged(configuration2);
                return;
            }
            this.j = this.b.a(this.f);
            this.k = new Configuration(configuration2);
            this.g.q(this.j);
        }
    }

    public final void p(Rect rect) {
        ror rorVar = this.g;
        if (rorVar != null) {
            rorVar.D(rect);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
