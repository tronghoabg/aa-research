package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jhe implements defpackage.jhb {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM.CW");
    private final boolean A;
    private com.google.android.gms.car.InputFocusChangedEvent B;
    private final java.util.concurrent.atomic.AtomicBoolean C = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final android.os.IBinder.DeathRecipient D;
    private defpackage.ipo E;
    private ipm F;
    private android.util.Size G;
    private boolean H;
    private final boolean I;
    private final defpackage.nub J;
    public final java.lang.String b;
    public final java.lang.String c;
    public final defpackage.jkr d;
    public final defpackage.jhd e;
    public final defpackage.jhd f;
    public com.google.android.gms.car.CarWindowLayoutParams g;
    public defpackage.jhl h;
    public boolean i;
    public defpackage.jik j;
    public defpackage.jik k;
    public boolean l;
    public boolean m;
    public boolean n;
    public com.google.android.gms.car.animation.ProjectionWindowAnimationParams o;
    public volatile int p;
    public boolean q;
    public boolean r;
    public final android.os.Handler s;
    public java.lang.Runnable t;
    public final defpackage.qzu u;
    private final java.lang.String v;
    private final android.content.ComponentName w;
    private final defpackage.qzy x;
    private final defpackage.jfo y;
    private final int z;

    public jhe(java.lang.String str, java.lang.String str2, com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams, defpackage.jkr jkrVar, defpackage.qzy qzyVar, int i, defpackage.ilj iljVar, defpackage.jfo jfoVar, defpackage.nub nubVar, boolean z) throws android.os.RemoteException {
        defpackage.roh rohVar = new defpackage.roh(this, 1);
        this.D = rohVar;
        this.H = true;
        this.p = 0;
        this.s = new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null);
        this.b = str;
        this.c = str2;
        this.v = defpackage.a.bI(str, str2, ":");
        this.w = new android.content.ComponentName(str2, str);
        this.g = carWindowLayoutParams;
        this.d = jkrVar;
        this.x = qzyVar;
        qzyVar.asBinder().linkToDeath(rohVar, 0);
        this.z = i;
        this.A = iljVar.m();
        this.y = jfoVar;
        this.J = nubVar;
        this.I = z;
        this.e = new defpackage.jhd(this);
        this.f = new defpackage.jhd(this);
        this.u = new defpackage.qzu(this);
    }

    private final android.graphics.Rect C(defpackage.jhi jhiVar) {
        android.content.Context context = ((defpackage.inh) this.d).l;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.view.View view = new android.view.View(context);
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams = this.g;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(carWindowLayoutParams.b, carWindowLayoutParams.c, carWindowLayoutParams.h);
        layoutParams.leftMargin = this.g.d;
        layoutParams.topMargin = this.g.e;
        layoutParams.rightMargin = this.g.f;
        layoutParams.bottomMargin = this.g.g;
        layoutParams.gravity = this.g.h;
        frameLayout.addView(view, layoutParams);
        int i = jhiVar.f;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        int i2 = jhiVar.g;
        frameLayout.measure(iMakeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
        frameLayout.layout(0, 0, i, i2);
        return new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private final void D(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) {
        ((defpackage.yqj) a.l().ai(2127)).M("%s.sendInputFocusChange(event: %s)", this.b, inputFocusChangedEvent);
        try {
            int i = this.z;
            defpackage.qzy qzyVar = this.x;
            if (i < 7) {
                qzyVar.h(inputFocusChangedEvent.a, !inputFocusChangedEvent.b);
            } else {
                qzyVar.g(inputFocusChangedEvent);
            }
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2128)).y("%s.onInputFocusChange RemoteException", this.b);
        }
    }

    public final void A() {
        ipm ipmVar;
        defpackage.ipo ipoVar;
        ((defpackage.yqj) a.l().ai((char) 2138)).y("%s.tearDown", this.b);
        if (this.C.compareAndSet(false, true)) {
            this.x.asBinder().unlinkToDeath(this.D, 0);
        }
        defpackage.jkr jkrVar = this.d;
        defpackage.jik jikVarV = v();
        defpackage.ill.d();
        defpackage.inh inhVar = (defpackage.inh) jkrVar;
        synchronized (inhVar.ab) {
            ((defpackage.inh) jkrVar).ac.remove(this);
            ((defpackage.inh) jkrVar).ad.remove(this);
        }
        inhVar.R(this.h, null, jikVarV, true, true, false, null);
        if (android.os.Build.VERSION.SDK_INT > 35 && (ipoVar = this.E) != null) {
            ipoVar.k(null);
            this.E.g();
            this.E = null;
            this.G = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 37 && (ipmVar = this.F) != null) {
            ipmVar.c.h(ipmVar.f);
            ipmVar.a().b();
            this.F = null;
        }
        this.e.c();
        this.f.c();
    }

    public final void B(com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams) {
        defpackage.ygw ygwVarB;
        defpackage.ill.d();
        this.g = carWindowLayoutParams;
        defpackage.jkr jkrVar = this.d;
        defpackage.jhi jhiVar = ((defpackage.inh) jkrVar).w;
        jhiVar.getClass();
        android.graphics.Rect rectC = C(jhiVar);
        android.graphics.Rect rectA = carWindowLayoutParams.a();
        defpackage.jhl jhlVar = this.h;
        int i = rectC.left;
        int i2 = jhiVar.g - rectC.bottom;
        int iWidth = rectC.width();
        int iHeight = rectC.height();
        int i3 = this.g.i;
        jhq jhqVar = new jhq(carWindowLayoutParams.q);
        int i4 = carWindowLayoutParams.z;
        int i5 = carWindowLayoutParams.A;
        defpackage.jik jikVar = this.j;
        defpackage.jik jikVar2 = this.k;
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams2 = this.g;
        int i6 = carWindowLayoutParams2.n;
        int i7 = carWindowLayoutParams2.y;
        if (this.r) {
            int i8 = defpackage.ygw.d;
            ygwVarB = defpackage.ymx.a;
        } else {
            ygwVarB = carWindowLayoutParams.b();
        }
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams3 = this.g;
        jhlVar.m(i, i2, iWidth, iHeight, i3, jhqVar, i4, i5, jikVar, jikVar2, i6, i7, ygwVarB, carWindowLayoutParams3.u, java.util.UUID.fromString(carWindowLayoutParams3.x), jkrVar.i(rectA));
    }

    @Override // defpackage.jhb, defpackage.jhk
    public final java.lang.String a() {
        return this.v;
    }

    @Override // defpackage.jhk
    public final void b(defpackage.jhl jhlVar) {
        int i;
        defpackage.ill.d();
        try {
            com.google.android.gms.car.DrawingSpec drawingSpecAN = this.h.aN();
            if (drawingSpecAN == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(2106)).y("%s.onWindowAttached dropped as window has been already torn down", this.b);
                return;
            }
            float f = this.g.C;
            if (f != 1.0f) {
                int i2 = (int) (drawingSpecAN.c * f);
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2113)).w("Using scaled DPI of %s", i2);
                drawingSpecAN.c = i2;
            }
            defpackage.yqm yqmVar = a;
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2108);
            java.lang.String str = this.b;
            yqjVar.y("%s.onWindowAttached", str);
            com.google.android.gms.car.BlackHoleParams blackHoleParams = this.g.B;
            if (blackHoleParams == null || android.os.Build.VERSION.SDK_INT < 37) {
                ((defpackage.yqj) yqmVar.l().ai(2109)).R("%s using local VD: %s, %s", str, blackHoleParams, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            } else {
                int i3 = drawingSpecAN.a;
                int i4 = drawingSpecAN.b;
                android.util.Size size = new android.util.Size(i3, i4);
                defpackage.ipo ipoVar = this.E;
                if (ipoVar != null) {
                    ((defpackage.yqj) yqmVar.l().ai(2112)).M("%s reusing VDM backed VirtualDisplay. Params: %s", str, blackHoleParams);
                    android.util.Size size2 = this.G;
                    if (size2 == null || !size.equals(size2)) {
                        ipoVar.i(size.getWidth(), size.getHeight(), drawingSpecAN.c);
                        this.G = size;
                    }
                    ipoVar.k(drawingSpecAN.d);
                    i = i3;
                } else {
                    ((defpackage.yqj) yqmVar.l().ai(2111)).M("%s using VDM backed VirtualDisplay. Params: %s", str, blackHoleParams);
                    this.G = size;
                    int i5 = drawingSpecAN.c;
                    android.content.Context context = ((defpackage.inh) this.d).l;
                    i = i3;
                    defpackage.ipo ipoVar2 = new defpackage.ipo(i, i4, i5, 10, defpackage.fzv.n(context).f(defpackage.ebm.n()), false, str, false, null);
                    ipoVar2.j(3, 1);
                    ipoVar2.j(6, 1);
                    ipoVar2.k(drawingSpecAN.d);
                    this.E = ipoVar2;
                    defpackage.nub nubVar = this.J;
                    context.getClass();
                    str.getClass();
                    defpackage.yqm yqmVar2 = ipm.a;
                    ipm ipmVar = new ipm(str, ipoVar2, new defpackage.gzv(nubVar, 16), new defpackage.ipk(blackHoleParams, context, str, 0));
                    ipmVar.c.d(ipmVar.f, new defpackage.zie(defpackage.zgt.INSTANCE));
                    this.F = ipmVar;
                }
                defpackage.ipo ipoVar3 = this.E;
                ipoVar3.getClass();
                drawingSpecAN = new com.google.android.gms.car.DrawingSpec(i, i4, drawingSpecAN.c, drawingSpecAN.d, drawingSpecAN.e, drawingSpecAN.f, ipoVar3.c().getDisplayId(), drawingSpecAN.h);
            }
            int i6 = this.z;
            defpackage.qzy qzyVar = this.x;
            if (i6 < 9) {
                qzyVar.n(drawingSpecAN);
            } else {
                qzyVar.m(drawingSpecAN, (android.content.res.Configuration) ((defpackage.inh) this.d).aa.fF());
            }
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2107)).y("%s.onWindowAttached RemoteException", this.b);
        }
    }

    @Override // defpackage.jhk
    public final void c(defpackage.jhl jhlVar, android.graphics.Rect rect) {
        ((defpackage.yqj) a.l().ai(2117)).M("%s.onWindowInsetsChanged(%s)", this.b, rect);
        defpackage.ill.d();
        try {
            this.x.i(rect);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2118)).y("%s.onWindowInsetsChanged RemoteException", this.b);
        }
    }

    @Override // defpackage.jhk
    public final void d(defpackage.jhl jhlVar) {
        try {
            this.x.p();
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2120)).y("%s.onWindowDetached RemoteException", this.b);
        }
    }

    @Override // defpackage.jhk
    public final void e(defpackage.jhl jhlVar, int i, int i2) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2121)).R("%s.onWindowSurfaceAvailable width: %d height: %d", this.b, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        defpackage.ill.d();
        this.d.q(this.h);
    }

    @Override // defpackage.jhk
    public final void f(defpackage.jhl jhlVar, android.view.KeyEvent keyEvent) {
        defpackage.ill.d();
        this.e.d(keyEvent);
        try {
            this.x.j(keyEvent);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2096)).M("%s.onKeyEvent(%s) RemoteException", this.b, keyEvent);
        }
    }

    @Override // defpackage.jhk
    public final void g(defpackage.jhl jhlVar, android.view.MotionEvent motionEvent) {
        defpackage.ill.d();
        this.f.d(motionEvent);
        try {
            this.x.k(motionEvent);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2099)).M("%s.onMotionEvent(%s) RemoteException", this.b, motionEvent);
        }
    }

    @Override // defpackage.jhk
    public final void h(int i) {
        defpackage.ill.d();
        try {
            this.x.f(i);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2093)).y("%s.onFrameRateChange RemoteException", this.b);
        }
    }

    @Override // defpackage.jhk
    public final void i(defpackage.jhl jhlVar, com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) {
        defpackage.ill.d();
        defpackage.jhd jhdVar = this.e;
        if (jhdVar.e() && this.f.e()) {
            D(inputFocusChangedEvent);
            return;
        }
        defpackage.yqj yqjVar = (defpackage.yqj) a.l().ai(2094);
        java.lang.String str = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.jhd jhdVar2 = this.f;
        if (!jhdVar2.e()) {
            sb.append("touchQueue:\n");
            jhdVar2.b(sb);
        }
        if (!jhdVar.e()) {
            sb.append("keyQueue:\n");
            jhdVar.b(sb);
        }
        yqjVar.R("%s.onInputFocusChange(event: %s) pending\nUnhandled items:\n%s", str, inputFocusChangedEvent, sb.toString());
        this.B = inputFocusChangedEvent;
    }

    @Override // defpackage.jhk
    public final void j(defpackage.jhl jhlVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(2105)).K("%s.onWindowAttachFailed state=%d", this.b, this.h.j());
        defpackage.ill.d();
        this.y.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.Jw).l());
    }

    @Override // defpackage.jhk
    public final void k(defpackage.jhl jhlVar) {
        if (this.z >= 7) {
            try {
                this.x.o(jhlVar.B());
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2115)).y("%s.onWindowAttributesChanged RemoteException", this.b);
            }
        }
    }

    @Override // defpackage.jhk
    public final void l(defpackage.jhl jhlVar) {
        defpackage.ill.d();
    }

    @Override // defpackage.jhk
    public final void m(defpackage.jhl jhlVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(2122)).y("%s.onWindowSurfaceInitFailed", this.b);
        defpackage.ill.d();
    }

    @Override // defpackage.jhb
    public final defpackage.jhl o() {
        return this.h;
    }

    @Override // defpackage.jhb
    public final void p(android.content.res.Configuration configuration, int i) {
        int i2 = this.z;
        if (i2 < 9) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(2103)).K("%s.onVideoConfigurationChanged ignored, clientVersion not supported v=%d", this.b, i2);
            return;
        }
        try {
            this.x.l(configuration, i);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2102)).y("%s.onVideoConfigurationChanged RemoteException", this.b);
        }
    }

    @Override // defpackage.jhb
    public final boolean q() {
        defpackage.jhl jhlVar = this.h;
        if (jhlVar == null) {
            return false;
        }
        if (!this.H) {
            return jhlVar.aF();
        }
        this.H = false;
        return true;
    }

    @Override // defpackage.jhb
    public final void r(defpackage.jhi jhiVar) {
        defpackage.jhl jhpVar;
        defpackage.ygw ygwVarB;
        defpackage.jhe jheVar = this;
        if (jheVar.I) {
            defpackage.jkr jkrVar = jheVar.d;
            com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams = jheVar.g;
            jhpVar = new defpackage.jhs(jkrVar, 1, jheVar, carWindowLayoutParams.s, java.util.UUID.fromString(carWindowLayoutParams.x), jheVar.w, jheVar.g.B != null);
        } else {
            int i = jheVar.g.l;
            if (i == 0) {
                defpackage.jkr jkrVar2 = jheVar.d;
                com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams2 = jheVar.g;
                jhpVar = new defpackage.jhh(jkrVar2, 1, jheVar, carWindowLayoutParams2.s, java.util.UUID.fromString(carWindowLayoutParams2.x), jheVar.w);
            } else {
                boolean z = i == 1;
                com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams3 = jheVar.g;
                jhpVar = new jhp(jheVar.d, jheVar, z, carWindowLayoutParams3.p, carWindowLayoutParams3.s, java.util.UUID.fromString(carWindowLayoutParams3.x), jheVar.w);
                jheVar = jheVar;
            }
        }
        defpackage.jhl jhlVar = jhpVar;
        if (jheVar.g.m) {
            jhlVar.K();
        }
        android.graphics.Rect rectC = C(jhiVar);
        ((defpackage.yqj) a.l().ai(2083)).M("%s window: %s", jheVar.b, rectC);
        android.graphics.Rect rectA = jheVar.g.a();
        int i2 = rectC.left;
        int i3 = jhiVar.g - rectC.bottom;
        int iWidth = rectC.width();
        int iHeight = rectC.height();
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams4 = jheVar.g;
        int i4 = carWindowLayoutParams4.i;
        jhq jhqVar = new jhq(carWindowLayoutParams4.q);
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams5 = jheVar.g;
        int i5 = carWindowLayoutParams5.z;
        int i6 = carWindowLayoutParams5.A;
        defpackage.jik jikVar = jheVar.j;
        defpackage.jik jikVar2 = jheVar.k;
        int i7 = carWindowLayoutParams5.n;
        int i8 = carWindowLayoutParams5.y;
        if (jheVar.r) {
            int i9 = defpackage.ygw.d;
            ygwVarB = defpackage.ymx.a;
        } else {
            ygwVarB = carWindowLayoutParams5.b();
        }
        defpackage.ygw ygwVar = ygwVarB;
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams6 = jheVar.g;
        jhlVar.al(i2, i3, iWidth, iHeight, i4, jhqVar, i5, i6, jikVar, jikVar2, i7, i8, ygwVar, carWindowLayoutParams6.u, java.util.UUID.fromString(carWindowLayoutParams6.x), jheVar.d.i(rectA), jheVar.p);
        jheVar.h = jhlVar;
        if (jheVar.i) {
            jhlVar.at(true);
        }
    }

    public final int s() {
        defpackage.jhl jhlVar = this.h;
        return jhlVar != null ? jhlVar.d() : this.d.a(this.g.c);
    }

    public final int t() {
        defpackage.jhl jhlVar = this.h;
        return jhlVar != null ? jhlVar.k() : this.d.a(this.g.b);
    }

    public final java.lang.String toString() {
        return "CarProjectionWindowImpl{name='" + this.v + ", clientVersion=" + this.z + ", params=" + java.lang.String.valueOf(this.g) + ", isHidden=" + this.l + ", window=" + java.lang.String.valueOf(this.h) + "}";
    }

    public final android.content.Context u(java.lang.String str) {
        try {
            return ((defpackage.inh) this.d).l.createPackageContext(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2084)).M("%s Failed to find package %s", this.b, str);
            return null;
        }
    }

    public final defpackage.jik v() {
        if (this.g.w.a <= 0) {
            return null;
        }
        defpackage.jkr jkrVar = this.d;
        defpackage.inh inhVar = (defpackage.inh) jkrVar;
        return inhVar.Y.b(defpackage.tna.aQ(inhVar.l, this.c), this.g.w, t(), s());
    }

    public final void w() {
        if (this.A) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(2085)).y("%s Ignoring ANR because ANR monitoring is disabled.", this.b);
        } else {
            try {
                this.x.e();
            } catch (android.os.RemoteException unused) {
            }
            A();
        }
    }

    public final void x(defpackage.jik jikVar) {
        if (this.r) {
            ((defpackage.yqj) a.l().ai((char) 2089)).y("%s was transiently showing, cancelling transient hide during normal hide", this.b);
            this.r = false;
            this.q = false;
            java.lang.Runnable runnable = this.t;
            if (runnable != null) {
                this.s.removeCallbacks(runnable);
            }
            B(this.g);
        }
        if (this.l) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(2088)).y("%s already hidden, nothing to do.", this.b);
            return;
        }
        ((defpackage.yqj) a.l().ai(2087)).M("%s.hideWindow(%s)", this.b, jikVar);
        this.l = true;
        defpackage.jkr jkrVar = this.d;
        defpackage.ill.d();
        defpackage.inh inhVar = (defpackage.inh) jkrVar;
        synchronized (inhVar.ab) {
            ((defpackage.inh) jkrVar).ad.add(this);
            ((defpackage.inh) jkrVar).ac.remove(this);
        }
        defpackage.jhl jhlVar = this.h;
        inhVar.R(jhlVar, jhlVar == null ? null : jhlVar.A(), jikVar, true, false, false, null);
        this.f.c();
        this.e.c();
    }

    public final void y() {
        com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent;
        if (this.e.e() && this.f.e() && (inputFocusChangedEvent = this.B) != null) {
            D(inputFocusChangedEvent);
            this.B = null;
        }
    }

    public final void z(boolean z, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams, int i) {
        if (this.r) {
            ((defpackage.yqj) a.l().ai((char) 2137)).y("%s was transiently showing, cancelling transient hide and restoring insets", this.b);
            this.r = false;
            this.q = false;
            java.lang.Runnable runnable = this.t;
            if (runnable != null) {
                this.s.removeCallbacks(runnable);
            }
            B(this.g);
            return;
        }
        if (!this.l) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(2136)).y("%s not hidden, nothing to do.", this.b);
            return;
        }
        ((defpackage.yqj) a.l().ai(2135)).N("%s.showWindow(%b)", this.b, z);
        this.l = false;
        this.h.getClass();
        if (this.d.aj(this, i)) {
            this.m = true;
            this.n = z;
            this.o = projectionWindowAnimationParams;
        }
    }

    @Override // defpackage.jhk
    public final void n(android.graphics.Rect rect) {
    }
}
