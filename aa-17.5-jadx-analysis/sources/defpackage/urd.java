package defpackage;

import android.view.MotionEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;

/* loaded from: classes3.dex */
public final class urd extends tuu implements tuy {
    private static final double a;
    private final float b;
    private final ackk c;
    private ackk d;
    private float e;
    private float f;
    private boolean g;
    private boolean h;
    private final rhj k;
    private int j = 1;
    private final tvi i = new tvi();

    static {
        Duration.ofMillis(330L);
        a = Math.log(2.0d);
    }

    public urd(rhj rhjVar, ackk ackkVar, float f) {
        this.c = ackkVar;
        this.k = rhjVar;
        this.b = Math.round(f * 20.0f);
    }

    @ResultIgnorabilityUnspecified
    private final boolean A(float f) {
        if (!this.i.f) {
            return false;
        }
        float f2 = -f;
        rhj rhjVar = this.k;
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            ackk ackkVar = this.c;
            zcf zcfVar = zcf.TWO_FINGER_DRAG_UP;
            ((gms) ackkVar.a()).l();
            rhjVar.m(zcfVar);
        } else {
            ackk ackkVar2 = this.c;
            zcf zcfVar2 = zcf.TWO_FINGER_DRAG_DOWN;
            ((gms) ackkVar2.a()).l();
            rhjVar.m(zcfVar2);
        }
        ackk ackkVar3 = this.d;
        if (ackkVar3 == null) {
            return true;
        }
        ((tux) ackkVar3.a()).m();
        return true;
    }

    private final boolean B() {
        return this.h;
    }

    @ResultIgnorabilityUnspecified
    private final boolean C() {
        if (!this.i.g) {
            return false;
        }
        rhj rhjVar = this.k;
        ackk ackkVar = this.c;
        zcf zcfVar = zcf.ROLL;
        ((gms) ackkVar.a()).l();
        rhjVar.m(zcfVar);
        ackk ackkVar2 = this.d;
        if (ackkVar2 == null) {
            return true;
        }
        ((tux) ackkVar2.a()).k();
        return true;
    }

    @ResultIgnorabilityUnspecified
    private final boolean D(boolean z, float f) {
        if (z && this.g) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        ackk ackkVar = this.c;
        trq trqVar = ((gms) ackkVar.a()).l().f;
        ((tux) this.d.a()).b();
        int i = tsw.a;
        float f2 = trqVar.b;
        ((tux) this.d.a()).a();
        float f3 = trqVar.c;
        tvi tviVar = this.i;
        if (z) {
            if (tviVar.d) {
                rhj rhjVar = this.k;
                zcf zcfVar = zcf.PINCH_CLOSED;
                ((gms) ackkVar.a()).l();
                rhjVar.m(zcfVar);
                ((tux) this.d.a()).n(BitmapDescriptorFactory.HUE_RED, true);
            }
        } else if (tviVar.b) {
            float fLog = (float) (Math.log(f) / a);
            if (this.g && f > 0.999f && f < 1.001001f) {
                fLog = 0.0f;
            }
            if (B()) {
                Duration duration = Duration.ZERO;
            } else {
                Duration duration2 = Duration.ZERO;
            }
            if (fLog > BitmapDescriptorFactory.HUE_RED) {
                rhj rhjVar2 = this.k;
                zcf zcfVar2 = zcf.PINCH_OPEN;
                ((gms) ackkVar.a()).l();
                rhjVar2.m(zcfVar2);
            } else if (fLog < BitmapDescriptorFactory.HUE_RED) {
                rhj rhjVar3 = this.k;
                zcf zcfVar3 = zcf.PINCH_CLOSED;
                ((gms) ackkVar.a()).l();
                rhjVar3.m(zcfVar3);
            }
            ((tux) this.d.a()).n(BitmapDescriptorFactory.HUE_RED, !this.g);
        }
        return true;
    }

    @ResultIgnorabilityUnspecified
    private final boolean z(tvc tvcVar) {
        ackk ackkVar = this.d;
        if (ackkVar == null) {
            return false;
        }
        float f = tvcVar.b;
        ((tux) ackkVar.a()).b();
        Math.signum(f - (((tux) this.d.a()).a() / 2.0f));
        return C();
    }

    @Override // defpackage.tuu, defpackage.tut
    public final void a(MotionEvent motionEvent) {
        ackk ackkVar;
        if (this.j != 1 || (ackkVar = this.d) == null) {
            return;
        }
        ((tux) ackkVar.a()).e(motionEvent.getX(), motionEvent.getY());
    }

    @Override // defpackage.tuu, defpackage.tut
    public final boolean b(MotionEvent motionEvent) {
        ackk ackkVar = this.d;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).i(motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }

    @Override // defpackage.tuu, defpackage.tut
    public final boolean c(MotionEvent motionEvent) {
        ackk ackkVar = this.d;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).j(motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }

    @Override // defpackage.tuu, defpackage.tut
    public final boolean d(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.tuu, defpackage.tut
    public final void e() {
        ackk ackkVar = this.d;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).h();
        }
    }

    @Override // defpackage.tuu, defpackage.tut
    public final void f(MotionEvent motionEvent) {
        ackk ackkVar = this.d;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).c();
        }
    }

    @Override // defpackage.tuu, defpackage.tut
    public final void h(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (B()) {
            return;
        }
        if (!this.i.a) {
            ackk ackkVar = this.d;
            if (ackkVar != null) {
                ((tux) ackkVar.a()).f();
                return;
            }
            return;
        }
        rhj rhjVar = this.k;
        ackk ackkVar2 = this.c;
        zcf zcfVar = zcf.DRAG;
        ((gms) ackkVar2.a()).l();
        rhjVar.m(zcfVar);
        ackk ackkVar3 = this.d;
        if (ackkVar3 != null) {
            ((tux) ackkVar3.a()).l();
        }
    }

    @Override // defpackage.tuu, defpackage.tut
    public final void j() {
        ackk ackkVar = this.d;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).d();
        }
    }

    @Override // defpackage.tuy
    public final void k(tvc tvcVar) {
        tvcVar.a();
        C();
    }

    @Override // defpackage.tuy
    public final void l(tvc tvcVar, boolean z) {
        this.g = false;
        D(z, tvcVar.b());
    }

    @Override // defpackage.tuy
    public final void m(tvc tvcVar) {
        z(tvcVar);
    }

    @Override // defpackage.tuy
    public final void n(tvc tvcVar) {
        A(tvcVar.c());
        this.h = false;
    }

    @Override // defpackage.tuy
    public final void o(ackk ackkVar) {
        this.d = ackkVar;
    }

    @Override // defpackage.tuu, android.view.GestureDetector.OnDoubleTapListener
    @ResultIgnorabilityUnspecified
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.j = 2;
        motionEvent.getX();
        this.e = motionEvent.getY();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    @Override // defpackage.tuu, android.view.GestureDetector.OnDoubleTapListener
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDoubleTapEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urd.onDoubleTapEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.tuu, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ackk ackkVar = this.d;
        if (ackkVar == null) {
            return true;
        }
        ((tux) ackkVar.a()).g(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // defpackage.tuy
    public final boolean p(tvc tvcVar) {
        tvcVar.a();
        return C();
    }

    @Override // defpackage.tuy
    public final boolean q(tvc tvcVar) {
        tvcVar.a();
        return C();
    }

    @Override // defpackage.tuy
    public final boolean r(tvc tvcVar, boolean z) {
        return D(z, tvcVar.b());
    }

    @Override // defpackage.tuy
    public final boolean s(tvc tvcVar, boolean z) {
        this.g = true;
        return D(z, tvcVar.b());
    }

    @Override // defpackage.tuy
    public final boolean t(tvc tvcVar) {
        return z(tvcVar);
    }

    @Override // defpackage.tuy
    public final boolean u(tvc tvcVar) {
        return z(tvcVar);
    }

    @Override // defpackage.tuy
    public final boolean v(tvc tvcVar) {
        return A(tvcVar.c());
    }

    @Override // defpackage.tuy
    public final boolean w(tvc tvcVar) {
        if (this.i.f) {
            this.h = true;
        }
        return A(tvcVar.c());
    }

    @Override // defpackage.tuy
    public final tvi x() {
        return this.i;
    }

    @Override // defpackage.tuy
    public final void y(tve tveVar) {
        ackk ackkVar = this.d;
        if (ackkVar == null) {
            return;
        }
        tpf tpfVar = tveVar.a;
        float f = tveVar.b;
        float f2 = tveVar.c;
        if (this.j == 3) {
            ((tux) ackkVar.a()).a();
        }
    }
}
