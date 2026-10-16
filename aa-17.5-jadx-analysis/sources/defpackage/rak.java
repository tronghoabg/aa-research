package defpackage;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class rak implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ rak(jgy jgyVar, int i, boolean z, ProjectionWindowAnimationParams projectionWindowAnimationParams, int i2) {
        this.e = i2;
        this.d = jgyVar;
        this.b = i;
        this.a = z;
        this.c = projectionWindowAnimationParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.d;
        if (i != 0) {
            jgy jgyVar = (jgy) obj;
            boolean z = jgyVar.l;
            int i2 = this.b;
            if (z) {
                Object obj2 = this.c;
                boolean z2 = this.a;
                ((ype) jgy.a.l().ai((char) 2122)).u("Window hidden, moving to drag step and showing");
                jgyVar.z(z2, (ProjectionWindowAnimationParams) obj2, i2);
                return;
            }
            yph yphVar = jgy.a;
            ((ype) yphVar.l().ai((char) 2123)).u("Window not hidden, just moving to drag step");
            jhf jhfVar = jgyVar.h;
            if (jhfVar != null) {
                jhfVar.Q(i2);
                return;
            } else {
                ((ype) ((ype) yphVar.f()).ai((char) 2124)).w("No window, making drag state %s default", i2);
                jgyVar.p = i2;
                return;
            }
        }
        int i3 = this.b;
        boolean z3 = this.a;
        Object obj3 = this.c;
        if (omc.c("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s executeOnWindowFocusReached(hasFocus:%b, direction%d, focusedRect:%s)", ((raw) obj3).m, Boolean.valueOf(z3), Integer.valueOf(i3), obj);
        }
        if (!z3) {
            raw rawVar = (raw) obj3;
            if (rawVar.z) {
                rawVar.t = false;
            }
            View currentFocus = rawVar.f().getCurrentFocus();
            rawVar.x(false);
            rawVar.Y.a = new WeakReference(currentFocus);
            return;
        }
        raw rawVar2 = (raw) obj3;
        rawVar2.s(true);
        boolean z4 = rawVar2.z;
        if (!z4 || obj == null) {
            if (z4) {
                rawVar2.t = false;
                rawVar2.X.b();
            }
            ntn ntnVar = rawVar2.Y;
            View view = (View) ((WeakReference) ntnVar.a).get();
            ((WeakReference) ntnVar.a).clear();
            rawVar2.q(view, -1, null);
            return;
        }
        View decorView = rawVar2.f().getDecorView();
        if (decorView instanceof ViewGroup) {
            decorView = FocusFinder.getInstance().findNextFocusFromRect((ViewGroup) decorView, (Rect) obj, i3);
        }
        if (omc.c("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "%s safeRequestFocus(next:%s, direction:%s, focusedRect:%s)", rawVar2.m, decorView, qrv.n(i3), obj);
        }
        rawVar2.q(decorView, i3, (Rect) obj);
        rawVar2.t = true;
        qtq qtqVar = rawVar2.X;
        View currentFocus2 = rawVar2.getCurrentFocus();
        int iA = qtq.a(i3);
        qtqVar.b.put(iA, new qto(currentFocus2, iA, SystemClock.elapsedRealtime()));
    }

    public /* synthetic */ rak(raw rawVar, boolean z, int i, Rect rect, int i2) {
        this.e = i2;
        this.c = rawVar;
        this.a = z;
        this.b = i;
        this.d = rect;
    }
}
