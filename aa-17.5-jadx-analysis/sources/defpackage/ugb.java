package defpackage;

import android.view.MotionEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class ugb extends tuu implements tuy {
    private static final double a = Math.log(2.0d);
    private final float b;
    private final ufz c;
    private ackk d;
    private float e;
    private float f;
    private boolean g;
    private boolean h;
    private final rhj k;
    private int j = 1;
    private final tvi i = new tvi();

    public ugb(tmb tmbVar, psj psjVar, ufz ufzVar, float f) {
        this.c = ufzVar;
        this.k = new rhj(tmbVar, psjVar);
        this.b = Math.round(f * 20.0f);
    }

    @ResultIgnorabilityUnspecified
    private final boolean A(boolean z, float f, float f2, float f3) {
        if (z && this.g) {
            return true;
        }
        ackk ackkVar = this.d;
        if (ackkVar == null) {
            return false;
        }
        ufz ufzVar = this.c;
        tto ttoVar = ufzVar.a.o;
        ((tux) ackkVar.a()).b();
        ttoVar.a();
        ((tux) this.d.a()).a();
        ttoVar.b();
        tvi tviVar = this.i;
        if (z) {
            if (tviVar.d) {
                float fQ = ufzVar.q();
                rhj rhjVar = this.k;
                zcf zcfVar = zcf.PINCH_CLOSED;
                float f4 = ufzVar.a.l;
                rhjVar.m(zcfVar);
                ((tux) this.d.a()).n(fQ, true);
            }
        } else if (tviVar.b) {
            float fLog = (float) (Math.log(f) / a);
            if (this.g && f > 0.999f && f < 1.001001f) {
                fLog = 0.0f;
            }
            float fC = D() ? ufzVar.c(fLog) : ufzVar.f(fLog, f2, f3);
            if (fLog > BitmapDescriptorFactory.HUE_RED) {
                rhj rhjVar2 = this.k;
                zcf zcfVar2 = zcf.PINCH_OPEN;
                float f5 = ufzVar.a.l;
                rhjVar2.m(zcfVar2);
            } else if (fLog < BitmapDescriptorFactory.HUE_RED) {
                rhj rhjVar3 = this.k;
                zcf zcfVar3 = zcf.PINCH_CLOSED;
                float f6 = ufzVar.a.l;
                rhjVar3.m(zcfVar3);
            }
            ((tux) this.d.a()).n(fC, !this.g);
        }
        return true;
    }

    @ResultIgnorabilityUnspecified
    private final boolean B(tvc tvcVar) {
        ackk ackkVar = this.d;
        if (ackkVar == null) {
            return false;
        }
        float f = tvcVar.a;
        float f2 = tvcVar.b;
        float f3 = tvcVar.c;
        return z((float) ((((f - f3) * Math.signum(f2 - r3)) * 3.141592653589793d) / 256.0d), ((tux) ackkVar.a()).b() / 2.0f, ((tux) this.d.a()).a() / 2.0f);
    }

    @ResultIgnorabilityUnspecified
    private final boolean C(float f) {
        if (!this.i.f) {
            return false;
        }
        float f2 = -f;
        ufz ufzVar = this.c;
        ufzVar.k(f2);
        rhj rhjVar = this.k;
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            zcf zcfVar = zcf.TWO_FINGER_DRAG_UP;
            float f3 = ufzVar.a.l;
            rhjVar.m(zcfVar);
        } else {
            zcf zcfVar2 = zcf.TWO_FINGER_DRAG_DOWN;
            float f4 = ufzVar.a.l;
            rhjVar.m(zcfVar2);
        }
        ackk ackkVar = this.d;
        if (ackkVar == null) {
            return true;
        }
        ((tux) ackkVar.a()).m();
        return true;
    }

    private final boolean D() {
        return this.h;
    }

    @ResultIgnorabilityUnspecified
    private final boolean z(float f, float f2, float f3) {
        if (!this.i.g) {
            return false;
        }
        boolean zD = D();
        ufz ufzVar = this.c;
        if (zD) {
            ufzVar.m(f);
        } else {
            ufzVar.n(f2, f3, f);
        }
        rhj rhjVar = this.k;
        ufz ufzVar2 = this.c;
        zcf zcfVar = zcf.ROLL;
        float f4 = ufzVar2.a.l;
        rhjVar.m(zcfVar);
        ackk ackkVar = this.d;
        if (ackkVar == null) {
            return true;
        }
        ((tux) ackkVar.a()).k();
        return true;
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
        this.c.j();
        ackk ackkVar = this.d;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).c();
        }
    }

    @Override // defpackage.tuu, defpackage.tut
    public final void h(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (D()) {
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
        ufz ufzVar = this.c;
        ufzVar.g(f, f2);
        rhj rhjVar = this.k;
        zcf zcfVar = zcf.DRAG;
        float f3 = ufzVar.a.l;
        rhjVar.m(zcfVar);
        ackk ackkVar2 = this.d;
        if (ackkVar2 != null) {
            ((tux) ackkVar2.a()).l();
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
        z(tvcVar.a(), tvcVar.a, tvcVar.b);
    }

    @Override // defpackage.tuy
    public final void l(tvc tvcVar, boolean z) {
        this.g = false;
        A(z, tvcVar.b(), tvcVar.a, tvcVar.b);
    }

    @Override // defpackage.tuy
    public final void m(tvc tvcVar) {
        B(tvcVar);
    }

    @Override // defpackage.tuy
    public final void n(tvc tvcVar) {
        C(tvcVar.c());
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
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugb.onDoubleTapEvent(android.view.MotionEvent):boolean");
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
        return z(tvcVar.a(), tvcVar.a, tvcVar.b);
    }

    @Override // defpackage.tuy
    public final boolean q(tvc tvcVar) {
        return z(tvcVar.a(), tvcVar.a, tvcVar.b);
    }

    @Override // defpackage.tuy
    public final boolean r(tvc tvcVar, boolean z) {
        return A(z, tvcVar.b(), tvcVar.a, tvcVar.b);
    }

    @Override // defpackage.tuy
    public final boolean s(tvc tvcVar, boolean z) {
        this.g = true;
        return A(z, tvcVar.b(), tvcVar.a, tvcVar.b);
    }

    @Override // defpackage.tuy
    public final boolean t(tvc tvcVar) {
        return B(tvcVar);
    }

    @Override // defpackage.tuy
    public final boolean u(tvc tvcVar) {
        return B(tvcVar);
    }

    @Override // defpackage.tuy
    public final boolean v(tvc tvcVar) {
        return C(tvcVar.c());
    }

    @Override // defpackage.tuy
    public final boolean w(tvc tvcVar) {
        if (this.i.f) {
            this.h = true;
        }
        return C(tvcVar.c());
    }

    @Override // defpackage.tuy
    public final tvi x() {
        return this.i;
    }

    @Override // defpackage.tuy
    public final void y(tve tveVar) {
        if (this.d == null) {
            return;
        }
        tpf tpfVar = tveVar.a;
        float[] fArr = {tpfVar.b, tpfVar.c, tveVar.b, tveVar.c};
        boolean z = this.j == 3;
        if (z) {
            float f = fArr[1];
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = (f / ((tux) r0.a()).a()) * 4.0f;
        } else {
            fArr[0] = -fArr[0];
            fArr[1] = -fArr[1];
        }
        if (D()) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        } else if (!this.i.a && (fArr[0] != BitmapDescriptorFactory.HUE_RED || fArr[1] != BitmapDescriptorFactory.HUE_RED)) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        if (fArr[2] != BitmapDescriptorFactory.HUE_RED) {
            tvi tviVar = this.i;
            if (z) {
                if (!tviVar.e) {
                    fArr[2] = 0.0f;
                }
            } else if (!tviVar.b) {
                fArr[2] = 0.0f;
            }
        }
        if (!this.i.g && fArr[3] != BitmapDescriptorFactory.HUE_RED) {
            fArr[3] = 0.0f;
        }
        this.c.i(fArr);
    }
}
