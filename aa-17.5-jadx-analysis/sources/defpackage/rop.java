package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import com.google.android.gms.car.InputFocusChangedEvent;
import java.io.PrintWriter;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rop implements ror {
    public final roo a;
    public raw b;
    private final roq c;
    private final Context d;
    private final int e;
    private final rau f;
    private final boolean g;
    private final String h;
    private rcb i;
    private Context j;
    private final sgk k;

    public rop(roq roqVar, Context context, int i, sgk sgkVar, rau rauVar, boolean z, String str, roo rooVar) {
        context.getClass();
        rauVar.getClass();
        str.getClass();
        this.c = roqVar;
        this.d = context;
        this.e = i;
        this.k = sgkVar;
        this.f = rauVar;
        this.g = z;
        this.h = str;
        this.a = rooVar;
    }

    @Override // defpackage.ror
    public final void A(raq raqVar) {
        raw rawVar = this.b;
        if (rawVar != null) {
            if (omc.c("CAR.PROJECTION.PRES", 3)) {
                rrd.d(3, "CAR.PROJECTION.PRES", null, "%s updateConfiguration(%s)", rawVar.m, raqVar);
            }
            rawVar.g = raqVar;
            rawVar.getResources().getConfiguration().touchscreen = raw.c(raqVar);
            rawVar.getResources().getConfiguration().navigation = raw.b(raqVar);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            rawVar.getDisplay().getMetrics(displayMetrics);
            if (rawVar.Q.a) {
                rawVar.R.a(rawVar.getResources().getConfiguration(), displayMetrics);
            } else {
                rawVar.getResources().updateConfiguration(rawVar.getResources().getConfiguration(), displayMetrics);
            }
            rawVar.A = raqVar.d;
            rawVar.B = raqVar.e;
            if (rawVar.r) {
                if (rawVar.z != raqVar.c) {
                    throw new IllegalStateException("Changing the value of touchpadForUiNavigation configuration not supported");
                }
                return;
            }
            boolean z = raqVar.c;
            rawVar.z = z;
            rawVar.r = true;
            if (z) {
                ron ronVar = rawVar.l;
                ronVar.b();
                if (rawVar.K != null) {
                    ronVar.a(rawVar.f().getDecorView());
                }
            }
        }
    }

    @Override // defpackage.ror
    public final void B(Rect rect) {
        rect.getClass();
        raw rawVar = this.b;
        if (rawVar == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (omc.c("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s maybeUpdateNonDrawableInsets: %s", rawVar.m, rect);
        }
        rawVar.n(rect);
        View view = rawVar.b;
        if (view != null) {
            view.requestApplyInsets();
        }
    }

    @Override // defpackage.ror
    public final void C(boolean z, int i, int i2) {
        raw rawVar = this.b;
        if (rawVar != null) {
            if (omc.c("CAR.PROJECTION.PRES", 3)) {
                rrd.d(3, "CAR.PROJECTION.PRES", null, "%s updateSettings(isFocusFinderEnabledInRotary=%s, touchpadFocusNavigationHistoryMaxSize=%s, touchpadFocusNavigationHistoryMaxAgeMs=%s)", rawVar.m, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
            }
            rawVar.J = z;
            rawVar.X = new qtq(i, i2);
        }
    }

    @Override // defpackage.ror
    public final void D(Rect rect) {
        rect.getClass();
        raw rawVar = this.b;
        if (rawVar != null) {
            rawVar.B(rect);
        }
    }

    @Override // defpackage.ror
    public final boolean E() {
        raw rawVar = this.b;
        if (rawVar != null) {
            return rawVar.o;
        }
        return false;
    }

    @Override // defpackage.ror
    public final boolean F() {
        return this.b != null;
    }

    @Override // defpackage.ror
    public final void G() {
        raw rawVar = this.b;
        if (rawVar != null) {
            rawVar.d = true;
            rawVar.y();
        }
    }

    @Override // defpackage.ror
    public final void H() {
        raw rawVar = this.b;
        if (rawVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        rawVar.I = true;
    }

    @Override // defpackage.ror
    public final Context a() {
        Context context = this.j;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("configurationContext is not initialized");
    }

    @Override // defpackage.ror
    public final Context b() {
        raw rawVar = this.b;
        if (rawVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Context contextD = rawVar.d();
        contextD.getClass();
        return contextD;
    }

    @Override // defpackage.ror
    public final Pair c(KeyEvent keyEvent) {
        keyEvent.getClass();
        raw rawVar = this.b;
        rom romVar = null;
        if (rawVar == null) {
            return null;
        }
        if (omc.c("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s injectKeyEvent(event:%s) [windowHasFocus:%b, isShowing:%b, ready:%b]", rawVar.m, keyEvent, Boolean.valueOf(rawVar.s), Boolean.valueOf(rawVar.isShowing()), Boolean.valueOf(rawVar.k));
        }
        if (rawVar.z) {
            rawVar.t = false;
        }
        if (rawVar.Q.g) {
            rawVar.z();
            romVar = new rom(-1, rawVar.L);
        }
        if (!rawVar.isShowing() || !rawVar.k || !rawVar.s) {
            return new Pair(false, romVar);
        }
        rawVar.j(true, false);
        rawVar.f().injectInputEvent(keyEvent);
        return new Pair(true, romVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    @Override // defpackage.ror
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(android.view.MotionEvent r34) {
        /*
            Method dump skipped, instructions count: 1527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rop.d(android.view.MotionEvent):android.util.Pair");
    }

    @Override // defpackage.ror
    public final Display e() {
        rcb rcbVar = this.i;
        if (rcbVar != null) {
            return rcbVar.a;
        }
        return null;
    }

    @Override // defpackage.ror
    public final LayoutInflater f() {
        raw rawVar = this.b;
        if (rawVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        LayoutInflater layoutInflater = rawVar.getLayoutInflater();
        layoutInflater.getClass();
        return layoutInflater;
    }

    @Override // defpackage.ror
    public final View g(int i) {
        raw rawVar = this.b;
        if (rawVar != null) {
            return rawVar.findViewById(i);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.ror
    public final Window h() {
        raw rawVar = this.b;
        if (rawVar != null) {
            return rawVar.getWindow();
        }
        return null;
    }

    @Override // defpackage.ror
    public final rax i() {
        raw rawVar = this.b;
        if (rawVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        rax raxVar = rawVar.R;
        raxVar.getClass();
        return raxVar;
    }

    @Override // defpackage.ror
    public final void j() {
        Display display;
        String str = this.h;
        rrd.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] attach() presentation=%s", str, this.b);
        if (this.b == null) {
            rcb rcbVar = this.i;
            if (rcbVar == null || (display = rcbVar.a) == null) {
                throw new RuntimeException("createPresentation virtual display is null");
            }
            rrd.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] createPresentation(display=%s)", str, display);
            Context contextA = this.c.a(display);
            this.j = contextA;
            this.b = raw.h(contextA, display, this.e, str, this.g, this.f);
            this.a.a();
        }
    }

    @Override // defpackage.ror
    public final void k() {
        rrd.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] detach()", this.h);
        rcb rcbVar = this.i;
        if (rcbVar != null) {
            rcbVar.c(null);
        }
    }

    @Override // defpackage.ror
    public final void l(PrintWriter printWriter) {
        printWriter.getClass();
        rcb rcbVar = this.i;
        if (rcbVar != null) {
            Surface surfaceA = rcbVar.a();
            Objects.toString(surfaceA);
            printWriter.println("surface:".concat(String.valueOf(surfaceA)));
            Display display = rcbVar.a;
            Objects.toString(display);
            printWriter.println("display:".concat(String.valueOf(display)));
        }
        raw rawVar = this.b;
        if (rawVar != null) {
            printWriter.println("ProjectedPresentation:");
            printWriter.println("  configurationSet:" + rawVar.r);
            Resources resources = rawVar.getResources();
            if (resources != null) {
                printWriter.println("  configuration:".concat(String.valueOf(String.valueOf(resources.getConfiguration()))));
            }
            printWriter.println("  isShowing:" + rawVar.isShowing());
            printWriter.println("  attachedToWindow:" + rawVar.n);
            printWriter.println("  inTouchMode:" + rawVar.p);
            Rect rect = rawVar.G;
            printWriter.println("  systemWindowInsets:".concat(String.valueOf(String.valueOf(rect))));
            printWriter.println("  nonDrawableInsets:".concat(String.valueOf(String.valueOf(rawVar.H))));
            Window window = rawVar.getWindow();
            printWriter.println("  window:".concat(String.valueOf(String.valueOf(window))));
            printWriter.println("    hasInputFocus:" + rawVar.o);
            printWriter.println("    windowHasFocus:" + rawVar.s);
            printWriter.println("    systemWindowInsets:".concat(String.valueOf(String.valueOf(rect))));
            if (window != null) {
                printWriter.println("    layout param:".concat(String.valueOf(String.valueOf(window.getAttributes()))));
                printWriter.println("    flags:" + window.getAttributes().flags);
                printWriter.println("    view hierarchy:");
                View decorView = window.getDecorView();
                rbz rbzVar = rbz.a;
                StringBuilder sb = new StringBuilder();
                qrv.w(decorView, "", sb, rbzVar);
                printWriter.println(sb.toString());
            }
        }
    }

    @Override // defpackage.ror
    public final void m() {
        raw rawVar = this.b;
        if (rawVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (rawVar.isShowing()) {
            throw new IllegalStateException("Transparency cannot be enabled after the Presentation is shown");
        }
        rawVar.f().setFormat(-3);
    }

    @Override // defpackage.ror
    public final void n() {
        rrd.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] hide()", this.h);
        raw rawVar = this.b;
        if (rawVar != null) {
            rawVar.hide();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    @Override // defpackage.ror
    public final void o(InputFocusChangedEvent inputFocusChangedEvent) {
        ?? r16;
        inputFocusChangedEvent.getClass();
        if (this.b == null) {
            rrd.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] onInputFocusChange() presentation is null", this.h);
        }
        raw rawVar = this.b;
        if (rawVar != null) {
            boolean z = inputFocusChangedEvent.b;
            boolean z2 = inputFocusChangedEvent.a;
            if (rrd.e("CAR.PROJECTION.PRES", 2)) {
                r16 = 1;
                rrd.d(2, "CAR.PROJECTION.PRES", null, "%s onInputFocusChange(hasFocus:%b, inTouchMode:%b) [hasInputFocus:%b, attachedToWindow:%b]", rawVar.m, Boolean.valueOf(z2), Boolean.valueOf(z), Boolean.valueOf(rawVar.o), Boolean.valueOf(rawVar.n));
            } else {
                r16 = 1;
            }
            if (rawVar.o == z2) {
                return;
            }
            rawVar.o = z2;
            rawVar.p = (!z2 || z) ? r16 : false;
            if (rawVar.n) {
                Rect rect = inputFocusChangedEvent.d;
                int i = inputFocusChangedEvent.c;
                if (omc.c("CAR.PROJECTION.PRES", 3)) {
                    String str = rawVar.m;
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    String strN = qrv.n(i);
                    Object[] objArr = new Object[4];
                    objArr[0] = str;
                    objArr[r16] = boolValueOf;
                    objArr[2] = strN;
                    objArr[3] = rect;
                    rrd.d(3, "CAR.PROJECTION.PRES", null, "%s Deferring onInputFocusChange(hasFocus:%s, direction:%s, focusedRect:%s)", objArr);
                }
                rawVar.M.offer(new rak(rawVar, z2, i, rect, 0));
                rawVar.j(z2, rawVar.p);
            }
            if (rawVar.z) {
                rawVar.u = false;
                rawVar.o();
            }
        }
    }

    @Override // defpackage.ror
    public final void p() {
        rrd.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] release()", this.h);
        z();
        rcb rcbVar = this.i;
        if (rcbVar != null) {
            rcbVar.b();
        }
        this.i = null;
        this.j = null;
    }

    @Override // defpackage.ror
    public final void q(View view) {
        view.getClass();
        rrd.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] setContentView(view=%s)", this.h, view);
        raw rawVar = this.b;
        if (rawVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        rawVar.setContentView(view);
    }

    @Override // defpackage.ror
    public final void r(Rect rect) {
        rect.getClass();
        raw rawVar = this.b;
        if (rawVar != null) {
            rawVar.n(rect);
        }
    }

    @Override // defpackage.ror
    public final void s(boolean z) {
        raw rawVar = this.b;
        if (rawVar != null) {
            rawVar.u(z);
        }
    }

    @Override // defpackage.ror
    public final void t(boolean z) {
        raw rawVar = this.b;
        if (rawVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        rawVar.c = z;
    }

    @Override // defpackage.ror
    public final void u(Rect rect) {
        rect.getClass();
        raw rawVar = this.b;
        if (rawVar != null) {
            rawVar.v(rect);
        }
    }

    @Override // defpackage.ror
    public final void v(Configuration configuration) {
        raw rawVar = this.b;
        if (rawVar != null) {
            rawVar.w(configuration);
        }
    }

    @Override // defpackage.ror
    public final void w(int i) {
        raw rawVar = this.b;
        if (rawVar == null || !rawVar.z) {
            return;
        }
        ron ronVar = rawVar.l;
        ronVar.e = i;
        if (ronVar.a != null && ronVar.b != null && ronVar.c != null && ronVar.d != null) {
            ronVar.d();
        } else if (omc.c("CAR.PROJECTION", 3)) {
            rrd.a("CAR.PROJECTION", null, "Call to setCarWindowLayoutFlags prior to addTrampolines");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ror
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(com.google.android.gms.car.DrawingSpec r18) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rop.x(com.google.android.gms.car.DrawingSpec):void");
    }

    @Override // defpackage.ror
    public final void y() {
        rrd.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] show()", this.h);
        raw rawVar = this.b;
        if (rawVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        rawVar.show();
    }

    @Override // defpackage.ror
    public final void z() {
        rrd.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] stop()", this.h);
        raw rawVar = this.b;
        if (rawVar != null) {
            rawVar.k = false;
            rawVar.dismiss();
            HandlerThread handlerThread = rawVar.S;
            if (handlerThread != null) {
                handlerThread.quit();
                rawVar.S = null;
            }
            rawVar.T = null;
            this.a.c();
            this.b = null;
        }
    }
}
