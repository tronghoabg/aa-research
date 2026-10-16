package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ioz implements defpackage.jhk {
    final /* synthetic */ defpackage.iph a;

    public ioz(defpackage.iph iphVar) {
        this.a = iphVar;
    }

    private final void o(boolean z, boolean z2) {
        defpackage.iph iphVar = this.a;
        if (iphVar.T) {
            iphVar.T = false;
            if (!z) {
                iphVar.H.u(false);
                return;
            } else {
                defpackage.ipg ipgVar = iphVar.H;
                ipgVar.p(2, android.os.Message.obtain(ipgVar, 3, z2 ? 1 : 0, 0));
                return;
            }
        }
        if (iphVar.U) {
            if (z) {
                iphVar.H.d(27);
            } else {
                iphVar.U = false;
            }
        }
    }

    @Override // defpackage.jhk
    public final java.lang.String a() {
        return this.a.i;
    }

    @Override // defpackage.jhk
    public final void b(defpackage.jhl jhlVar) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.iph iphVar = this.a;
        if (iphVar.V) {
            iphVar.V = false;
            iphVar.H.i(2, true);
        } else if (iphVar.U) {
            iphVar.y.K(iphVar.N, false);
            iphVar.U = false;
            iphVar.H.i(27, true);
        }
    }

    @Override // defpackage.jhk
    public final void c(defpackage.jhl jhlVar, android.graphics.Rect rect) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.T(rect);
    }

    @Override // defpackage.jhk
    public final void d(defpackage.jhl jhlVar) {
        defpackage.iph iphVar = this.a;
        defpackage.yqm yqmVar = defpackage.iph.E;
        java.lang.String str = iphVar.i;
        ((defpackage.yqj) yqmVar.l().ai((char) 887)).y("component: %s; onWindowRemoved", str);
        defpackage.qyr qyrVar = iphVar.O;
        if (qyrVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 890)).y("%s: service is null in onWindowRemoved", str);
        } else {
            try {
                qyrVar.A();
                if (iphVar.n >= 5) {
                    return;
                }
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.g()).p(e)).ai((char) 889)).u("Error calling onWindowRemoved");
            }
        }
        ((defpackage.yqj) defpackage.iph.E.l().ai((char) 888)).u("Don't expect callback, immediately releasing window");
        this.a.N.aV();
    }

    @Override // defpackage.jhk
    public final void e(defpackage.jhl jhlVar, int i, int i2) {
        int i3;
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.iph iphVar = this.a;
        int i4 = iphVar.X;
        boolean z = false;
        if (i4 != -1 && (i3 = iphVar.W) != -1 && (i4 != i2 || i3 != i)) {
            z = true;
        }
        iphVar.X = i2;
        iphVar.W = i;
        o(true, z);
    }

    @Override // defpackage.jhk
    public final void f(defpackage.jhl jhlVar, android.view.KeyEvent keyEvent) {
        this.a.H.s(keyEvent, false);
    }

    @Override // defpackage.jhk
    public final void g(defpackage.jhl jhlVar, android.view.MotionEvent motionEvent) {
        this.a.H.s(motionEvent, true);
    }

    @Override // defpackage.jhk
    public final void h(int i) {
        defpackage.yqj yqjVar = (defpackage.yqj) defpackage.iph.E.l().ai(878);
        defpackage.iph iphVar = this.a;
        yqjVar.K("component: %s; onFrameRateChange(frameRate:%d)", iphVar.i, i);
        if (iphVar.aa("onFrameRateChange")) {
            int i2 = iphVar.K;
            if ((i2 == 3 || i2 == 2) && iphVar.n > 1) {
                try {
                    iphVar.O.g(i);
                } catch (android.os.RemoteException e) {
                    defpackage.iph iphVar2 = this.a;
                    java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(e);
                    int i3 = defpackage.ipg.i;
                    iphVar2.H.q(runtimeException);
                }
            }
        }
    }

    @Override // defpackage.jhk
    public final void i(defpackage.jhl jhlVar, com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.H.r(inputFocusChangedEvent);
    }

    @Override // defpackage.jhk
    public final void j(defpackage.jhl jhlVar) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.iph iphVar = this.a;
        if (iphVar.V) {
            iphVar.V = false;
            iphVar.b.v(iphVar);
            iphVar.H.i(2, false);
        } else if (iphVar.U) {
            iphVar.U = false;
            iphVar.H.i(27, true);
        }
    }

    @Override // defpackage.jhk
    public final void k(defpackage.jhl jhlVar) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.iph iphVar = this.a;
        if (iphVar.n < 7) {
            return;
        }
        defpackage.qyr qyrVar = iphVar.O;
        if (qyrVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.f()).ai(884)).y("%s: service is null in onWindowAttributesChanged", iphVar.i);
        } else {
            try {
                qyrVar.y(jhlVar.B());
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.g()).p(e)).ai((char) 883)).u("Error calling onWindowAttributesChanged");
            }
        }
    }

    @Override // defpackage.jhk
    public final void m(defpackage.jhl jhlVar) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.h()).ai(892)).y("component: %s; onWindowSurfaceInitFailed", this.a.i);
        o(false, false);
    }

    @Override // defpackage.jhk
    public final void n(android.graphics.Rect rect) {
        ((defpackage.yqj) defpackage.iph.E.l().ai(886)).M("Activity %s non drawable insets changed to %s", a(), rect);
        this.a.U(rect, false);
    }

    @Override // defpackage.jhk
    public final void l(defpackage.jhl jhlVar) {
    }
}
