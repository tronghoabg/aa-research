package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Region;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.util.Pair;
import android.view.AttachedSurfaceControl;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceControlViewHost;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.window.InputTransferToken;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import java.io.PrintWriter;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class rou implements ror {
    public final String a;
    public final Rect b;
    public View.OnAttachStateChangeListener c;
    private final roq d;
    private final Context e;
    private final int f;
    private final ros g;
    private rot h;
    private SurfaceControlViewHost i;
    private rov j;
    private rax k;
    private int l;
    private int m;
    private InputTransferToken n;
    private int o;
    private Display p;
    private boolean q;
    private boolean r;

    public rou(roq roqVar, Context context, int i, String str, ros rosVar) {
        context.getClass();
        str.getClass();
        this.d = roqVar;
        this.e = context;
        this.f = i;
        this.a = str;
        this.g = rosVar;
        this.b = new Rect();
        this.o = -1;
    }

    private final void I() {
        rov rovVar = this.j;
        if (rovVar != null) {
            ViewGroup viewGroup = (ViewGroup) rovVar.a.findViewById(R.id.content);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            rov rovVar2 = this.j;
            if (rovVar2 == null) {
                affa.d("scvhWindow");
                rovVar2 = null;
            }
            ecw.e(rovVar2.a, null);
            View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
            if (onAttachStateChangeListener != null) {
                rov rovVar3 = this.j;
                if (rovVar3 == null) {
                    affa.d("scvhWindow");
                    rovVar3 = null;
                }
                rovVar3.a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                this.c = null;
            }
        }
    }

    @Override // defpackage.ror
    public final void B(Rect rect) {
        rect.getClass();
    }

    @Override // defpackage.ror
    public final void D(Rect rect) {
        rect.getClass();
        u(rect);
        rov rovVar = this.j;
        if (rovVar == null) {
            affa.d("scvhWindow");
            rovVar = null;
        }
        rovVar.a.requestApplyInsets();
    }

    @Override // defpackage.ror
    public final boolean E() {
        return this.r;
    }

    @Override // defpackage.ror
    public final boolean F() {
        return this.q;
    }

    @Override // defpackage.ror
    public final Context a() {
        rax raxVar = this.k;
        if (raxVar != null) {
            return raxVar;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.ror
    public final Context b() {
        rax raxVar = this.k;
        if (raxVar != null) {
            return raxVar;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.ror
    public final Pair c(KeyEvent keyEvent) {
        keyEvent.getClass();
        return null;
    }

    @Override // defpackage.ror
    public final Pair d(MotionEvent motionEvent) {
        motionEvent.getClass();
        return null;
    }

    @Override // defpackage.ror
    public final Display e() {
        return this.p;
    }

    @Override // defpackage.ror
    public final LayoutInflater f() {
        rax raxVar = this.k;
        if (raxVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(raxVar);
        layoutInflaterFrom.getClass();
        return layoutInflaterFrom;
    }

    @Override // defpackage.ror
    public final View g(int i) {
        rov rovVar = this.j;
        if (rovVar == null) {
            affa.d("scvhWindow");
            rovVar = null;
        }
        return rovVar.a.findViewById(i);
    }

    @Override // defpackage.ror
    public final Window h() {
        rov rovVar = this.j;
        if (rovVar != null) {
            return rovVar;
        }
        affa.d("scvhWindow");
        return null;
    }

    @Override // defpackage.ror
    public final rax i() {
        rax raxVar = this.k;
        if (raxVar != null) {
            return raxVar;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.ror
    public final void j() {
        if (this.i == null) {
            throw new IllegalStateException("Cannot attach: SurfaceControlViewHost is null. setup() must be called before attach() after a detach().");
        }
        this.q = true;
        rot rotVar = this.h;
        if (rotVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        rotVar.a.f(eps.d);
        this.g.a();
    }

    @Override // defpackage.ror
    public final void k() {
        I();
        rot rotVar = this.h;
        if (rotVar != null) {
            eqc eqcVar = rotVar.a;
            if (eqcVar.e.a(eps.d)) {
                z();
            }
            eps epsVar = eqcVar.e;
            eps epsVar2 = eps.a;
            if (epsVar != epsVar2) {
                eqcVar.f(epsVar2);
            }
        }
        this.h = null;
        SurfaceControlViewHost surfaceControlViewHost = this.i;
        if (surfaceControlViewHost != null) {
            surfaceControlViewHost.release();
        }
        this.i = null;
        this.q = false;
    }

    @Override // defpackage.ror
    public final void l(PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println("ScvhProjectedUiHost: ".concat(this.a));
        SurfaceControlViewHost surfaceControlViewHost = this.i;
        StringBuilder sb = new StringBuilder("  SCVH active: ");
        sb.append(surfaceControlViewHost != null);
        printWriter.println(sb.toString());
        printWriter.println("  hasInputFocus: " + this.r);
        printWriter.println("  isAttached: " + this.q);
        printWriter.println("  currentWidth: " + this.l);
        printWriter.println("  currentHeight: " + this.m);
        InputTransferToken inputTransferToken = this.n;
        Objects.toString(inputTransferToken);
        printWriter.println("  currentToken: ".concat(String.valueOf(inputTransferToken)));
        Display display = this.p;
        Objects.toString(display);
        printWriter.println("  display: ".concat(String.valueOf(display)));
    }

    @Override // defpackage.ror
    public final void n() {
        rot rotVar = this.h;
        if (rotVar == null) {
            return;
        }
        rotVar.a.f(eps.d);
    }

    @Override // defpackage.ror
    public final void o(InputFocusChangedEvent inputFocusChangedEvent) {
        inputFocusChangedEvent.getClass();
        this.r = inputFocusChangedEvent.a;
    }

    @Override // defpackage.ror
    public final void p() {
        k();
    }

    @Override // defpackage.ror
    public final void q(View view) {
        view.getClass();
        rov rovVar = this.j;
        if (rovVar == null) {
            affa.d("scvhWindow");
            rovVar = null;
        }
        rovVar.setContentView(view);
    }

    @Override // defpackage.ror
    public final void r(Rect rect) {
        rect.getClass();
    }

    @Override // defpackage.ror
    public final void u(Rect rect) {
        rect.getClass();
        Rect rect2 = this.b;
        if (affa.f(rect2, rect)) {
            return;
        }
        rect2.set(rect);
    }

    @Override // defpackage.ror
    public final void x(DrawingSpec drawingSpec) throws PackageManager.NameNotFoundException {
        Display display;
        String str = this.a;
        rrd.d(3, "CAR.PROJECTION.SCVH", null, "[%s] setup(spec=%s)", str, drawingSpec);
        if (drawingSpec == null) {
            return;
        }
        Bundle bundle = drawingSpec.h;
        if (bundle == null) {
            throw new IllegalStateException(a.bq(str, "[", "] setup: spec.extras is null"));
        }
        Object objG = dlz.g(bundle, "input_transfer_token", hy$$ExternalSyntheticApiModelOutline2.m());
        if (objG == null) {
            throw new IllegalStateException(a.bq(str, "[", "] setup: InputTransferToken is missing"));
        }
        int i = drawingSpec.g;
        InputTransferToken inputTransferTokenM = hy$$ExternalSyntheticApiModelOutline2.m(objG);
        SurfaceControlViewHost surfaceControlViewHost = this.i;
        if (surfaceControlViewHost != null && affa.f(inputTransferTokenM, this.n) && i == this.o) {
            int i2 = drawingSpec.a;
            if (i2 == this.l && drawingSpec.b == this.m) {
                rrd.d(3, "CAR.PROJECTION.SCVH", null, "[%s] setup: no change, skipping recreation", str);
            } else {
                Integer numValueOf = Integer.valueOf(i2);
                int i3 = drawingSpec.b;
                rrd.d(3, "CAR.PROJECTION.SCVH", null, "[%s] setup: resizing SurfaceControlViewHost to %dx%d", str, numValueOf, Integer.valueOf(i3));
                surfaceControlViewHost.relayout(i2, i3);
                this.l = i2;
                this.m = i3;
            }
            Rect rect = drawingSpec.e;
            if (rect != null) {
                u(rect);
                return;
            }
            return;
        }
        k();
        rot rotVar = new rot();
        rotVar.a.f(eps.c);
        this.h = rotVar;
        rrd.d(3, "CAR.PROJECTION.SCVH", null, "[%s] setup: creating new SurfaceControlViewHost", str);
        if (this.i != null) {
            throw new IllegalStateException("Existing SurfaceControlViewHost must be detached before creating a new one.");
        }
        I();
        int i4 = drawingSpec.a;
        this.l = i4;
        int i5 = drawingSpec.b;
        this.m = i5;
        this.n = inputTransferTokenM;
        this.o = i;
        Object systemService = this.e.getSystemService("display");
        systemService.getClass();
        DisplayManager displayManager = (DisplayManager) systemService;
        int i6 = 4;
        if (hrq.a()) {
            rrd.d(4, "CAR.PROJECTION.SCVH", null, "[%s] setup: resolving display using getDisplayForHostToken", str);
            display = displayManager.getDisplayForHostToken(inputTransferTokenM);
        } else {
            display = displayManager.getDisplay(i);
        }
        if (display == null) {
            throw new IllegalStateException(a.bn(i, "display with id=", " not found!"));
        }
        this.p = display;
        roq roqVar = this.d;
        int iH = this.f;
        Context contextA = roqVar.a(display);
        if (iH == 0) {
            iH = roc.h(contextA);
        }
        if (iH != 0) {
            contextA = new ContextThemeWrapper(contextA, iH);
        }
        rax raxVar = new rax(contextA);
        this.k = raxVar;
        rov rovVar = new rov(raxVar);
        this.j = rovVar;
        rot rotVar2 = this.h;
        if (rotVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ecw.e(rovVar.a, rotVar2);
        rov rovVar2 = this.j;
        if (rovVar2 == null) {
            affa.d("scvhWindow");
            rovVar2 = null;
        }
        rovVar2.a.setOnApplyWindowInsetsListener(new jsg(this, i6));
        SurfaceControlViewHost surfaceControlViewHost2 = new SurfaceControlViewHost(raxVar, display, inputTransferTokenM);
        this.i = surfaceControlViewHost2;
        rov rovVar3 = this.j;
        if (rovVar3 == null) {
            affa.d("scvhWindow");
            rovVar3 = null;
        }
        surfaceControlViewHost2.setView(rovVar3.a, i4, i5);
        if ((bundle.getInt("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0) & 128) != 0) {
            rov rovVar4 = this.j;
            if (rovVar4 == null) {
                affa.d("scvhWindow");
                rovVar4 = null;
            }
            FrameLayout frameLayout = rovVar4.a;
            if (frameLayout.isAttachedToWindow()) {
                rrd.d(3, "CAR.PROJECTION.SCVH", null, "[%s] decorView already attached, setting empty touchable region", str);
                AttachedSurfaceControl rootSurfaceControl = frameLayout.getRootSurfaceControl();
                if (rootSurfaceControl != null) {
                    rootSurfaceControl.setTouchableRegion(new Region());
                }
            } else {
                rrd.d(3, "CAR.PROJECTION.SCVH", null, "[%s] waiting for decorView to attach to set touchable region", str);
                hy hyVar = new hy(this, 5);
                this.c = hyVar;
                frameLayout.addOnAttachStateChangeListener(hyVar);
            }
        }
        Rect rect2 = drawingSpec.e;
        if (rect2 != null) {
            u(rect2);
        }
        SurfaceControlViewHost.SurfacePackage surfacePackage = surfaceControlViewHost2.getSurfacePackage();
        if (surfacePackage == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("surface_package", surfacePackage);
        this.g.b(bundle2);
    }

    @Override // defpackage.ror
    public final void y() {
        rot rotVar = this.h;
        if (rotVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        rotVar.a.f(eps.e);
    }

    @Override // defpackage.ror
    public final void z() {
        rot rotVar = this.h;
        if (rotVar == null) {
            return;
        }
        rotVar.a.f(eps.c);
        this.g.c();
    }

    @Override // defpackage.ror
    public final void G() {
    }

    @Override // defpackage.ror
    public final void H() {
    }

    @Override // defpackage.ror
    public final void m() {
    }

    @Override // defpackage.ror
    public final void A(raq raqVar) {
    }

    @Override // defpackage.ror
    public final void s(boolean z) {
    }

    @Override // defpackage.ror
    public final void t(boolean z) {
    }

    @Override // defpackage.ror
    public final void v(Configuration configuration) {
    }

    @Override // defpackage.ror
    public final void w(int i) {
    }

    @Override // defpackage.ror
    public final void C(boolean z, int i, int i2) {
    }
}
