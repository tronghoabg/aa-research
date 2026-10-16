package defpackage;

import android.graphics.Rect;
import android.os.Message;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes.dex */
final class iot implements jhe {
    final /* synthetic */ ipb a;

    public iot(ipb ipbVar) {
        this.a = ipbVar;
    }

    private final void o(boolean z, boolean z2) {
        ipb ipbVar = this.a;
        if (ipbVar.T) {
            ipbVar.T = false;
            if (!z) {
                ipbVar.H.u(false);
                return;
            } else {
                ipa ipaVar = ipbVar.H;
                ipaVar.p(2, Message.obtain(ipaVar, 3, z2 ? 1 : 0, 0));
                return;
            }
        }
        if (ipbVar.U) {
            if (z) {
                ipbVar.H.d(27);
            } else {
                ipbVar.U = false;
            }
        }
    }

    @Override // defpackage.jhe
    public final String a() {
        return this.a.i;
    }

    @Override // defpackage.jhe
    public final void b(jhf jhfVar) {
        yph yphVar = ipb.E;
        ipb ipbVar = this.a;
        if (ipbVar.V) {
            ipbVar.V = false;
            ipbVar.H.i(2, true);
        } else if (ipbVar.U) {
            ipbVar.y.K(ipbVar.N, false);
            ipbVar.U = false;
            ipbVar.H.i(27, true);
        }
    }

    @Override // defpackage.jhe
    public final void c(jhf jhfVar, Rect rect) {
        yph yphVar = ipb.E;
        this.a.T(rect);
    }

    @Override // defpackage.jhe
    public final void d(jhf jhfVar) {
        ipb ipbVar = this.a;
        yph yphVar = ipb.E;
        String str = ipbVar.i;
        ((ype) yphVar.l().ai((char) 887)).y("component: %s; onWindowRemoved", str);
        qxv qxvVar = ipbVar.O;
        if (qxvVar == null) {
            ((ype) ((ype) yphVar.f()).ai((char) 890)).y("%s: service is null in onWindowRemoved", str);
        } else {
            try {
                qxvVar.A();
                if (ipbVar.n >= 5) {
                    return;
                }
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) ipb.E.g()).p(e)).ai((char) 889)).u("Error calling onWindowRemoved");
            }
        }
        ((ype) ipb.E.l().ai((char) 888)).u("Don't expect callback, immediately releasing window");
        this.a.N.aT();
    }

    @Override // defpackage.jhe
    public final void e(jhf jhfVar, int i, int i2) {
        int i3;
        yph yphVar = ipb.E;
        ipb ipbVar = this.a;
        int i4 = ipbVar.X;
        boolean z = false;
        if (i4 != -1 && (i3 = ipbVar.W) != -1 && (i4 != i2 || i3 != i)) {
            z = true;
        }
        ipbVar.X = i2;
        ipbVar.W = i;
        o(true, z);
    }

    @Override // defpackage.jhe
    public final void f(jhf jhfVar, KeyEvent keyEvent) {
        this.a.H.s(keyEvent, false);
    }

    @Override // defpackage.jhe
    public final void g(jhf jhfVar, MotionEvent motionEvent) {
        this.a.H.s(motionEvent, true);
    }

    @Override // defpackage.jhe
    public final void h(int i) {
        ype ypeVar = (ype) ipb.E.l().ai(878);
        ipb ipbVar = this.a;
        ypeVar.K("component: %s; onFrameRateChange(frameRate:%d)", ipbVar.i, i);
        if (ipbVar.aa("onFrameRateChange")) {
            int i2 = ipbVar.K;
            if ((i2 == 3 || i2 == 2) && ipbVar.n > 1) {
                try {
                    ipbVar.O.g(i);
                } catch (RemoteException e) {
                    ipb ipbVar2 = this.a;
                    RuntimeException runtimeException = new RuntimeException(e);
                    int i3 = ipa.i;
                    ipbVar2.H.q(runtimeException);
                }
            }
        }
    }

    @Override // defpackage.jhe
    public final void i(jhf jhfVar, InputFocusChangedEvent inputFocusChangedEvent) {
        yph yphVar = ipb.E;
        this.a.H.r(inputFocusChangedEvent);
    }

    @Override // defpackage.jhe
    public final void j(jhf jhfVar) {
        yph yphVar = ipb.E;
        ipb ipbVar = this.a;
        if (ipbVar.V) {
            ipbVar.V = false;
            ipbVar.b.v(ipbVar);
            ipbVar.H.i(2, false);
        } else if (ipbVar.U) {
            ipbVar.U = false;
            ipbVar.H.i(27, true);
        }
    }

    @Override // defpackage.jhe
    public final void k(jhf jhfVar) {
        yph yphVar = ipb.E;
        ipb ipbVar = this.a;
        if (ipbVar.n < 7) {
            return;
        }
        qxv qxvVar = ipbVar.O;
        if (qxvVar == null) {
            ((ype) ((ype) ipb.E.f()).ai(884)).y("%s: service is null in onWindowAttributesChanged", ipbVar.i);
        } else {
            try {
                qxvVar.y(jhfVar.A());
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) ipb.E.g()).p(e)).ai((char) 883)).u("Error calling onWindowAttributesChanged");
            }
        }
    }

    @Override // defpackage.jhe
    public final void m(jhf jhfVar) {
        ((ype) ((ype) ipb.E.h()).ai(892)).y("component: %s; onWindowSurfaceInitFailed", this.a.i);
        o(false, false);
    }

    @Override // defpackage.jhe
    public final void n(Rect rect) {
        ((ype) ipb.E.l().ai(886)).M("Activity %s non drawable insets changed to %s", a(), rect);
        this.a.U(rect, false);
    }

    @Override // defpackage.jhe
    public final void l(jhf jhfVar) {
    }
}
