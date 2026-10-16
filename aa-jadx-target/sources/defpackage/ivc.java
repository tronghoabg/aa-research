package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ivc implements defpackage.ivd, defpackage.ikh, defpackage.jkq {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.DISPLAY");
    public final defpackage.ivb c;
    public final defpackage.jfo d;
    public final defpackage.jfd e;
    public final defpackage.jfe f;
    public final defpackage.ilm g;
    public final defpackage.iya h;
    public final defpackage.xzi i;
    public final com.google.android.gms.car.display.CarDisplayId j;
    public final defpackage.xkd k;
    public final defpackage.xle l;
    public final defpackage.iwj m;
    public defpackage.iuz n;
    public defpackage.ivi o;
    public defpackage.jkr p;
    public defpackage.ikk q;
    public defpackage.xpq t;
    private final defpackage.xzi u;
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());
    public final defpackage.iuw r = new defpackage.iuw(this);
    public final defpackage.ivw s = new defpackage.ivw(this);

    public ivc(defpackage.ivb ivbVar, defpackage.jfo jfoVar, defpackage.jfd jfdVar, defpackage.jfe jfeVar, defpackage.ilm ilmVar, defpackage.iya iyaVar, defpackage.xzi xziVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, defpackage.xkd xkdVar, defpackage.xle xleVar, defpackage.iwj iwjVar, defpackage.xzi xziVar2) {
        this.c = ivbVar;
        this.d = jfoVar;
        this.e = jfdVar;
        this.f = jfeVar;
        this.g = ilmVar;
        this.h = iyaVar;
        this.i = xziVar;
        this.j = carDisplayId;
        this.k = xkdVar;
        this.l = xleVar;
        this.m = iwjVar;
        this.u = xziVar2;
    }

    @Override // defpackage.ikh
    public final void a(xlf xlfVar, int i, int i2, j$.time.Duration duration) {
        this.b.post(new iva(this, xlfVar, i, i2, duration, 0));
    }

    @Override // defpackage.ikh
    public final void b(android.view.MotionEvent motionEvent) {
        this.b.post(new defpackage.inq(this, motionEvent, 10));
    }

    @Override // defpackage.ivd
    public final void c(defpackage.xpq xpqVar) {
        android.graphics.Rect rect;
        com.google.android.gms.car.display.CarDisplay carDisplay;
        if (this.p == null) {
            this.t = xpqVar;
            return;
        }
        com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures = null;
        this.t = null;
        defpackage.ive iveVarA = this.o.a();
        iveVarA.getClass();
        defpackage.iuw iuwVar = this.r;
        synchronized (iuwVar.c) {
            com.google.android.gms.car.display.CarDisplay carDisplay2 = iuwVar.d;
            android.graphics.Point point = carDisplay2 == null ? null : carDisplay2.d;
            android.util.Size size = iveVarA.m;
            android.graphics.Point point2 = new android.graphics.Point(size.getWidth(), size.getHeight());
            boolean z = false;
            if (defpackage.actb.f()) {
                defpackage.abpj abpjVar = xpqVar.j;
                float f = iveVarA.l;
                if (!j$.util.Objects.equals(iuwVar.f, defpackage.ivs.c(abpjVar, f))) {
                    iuwVar.f = defpackage.ivs.c(xpqVar.j, f);
                    z = true;
                }
            }
            rect = iveVarA.o;
            boolean zEquals = j$.util.Objects.equals(iuwVar.e, rect);
            defpackage.ivc ivcVar = iuwVar.b;
            boolean zEquals2 = ivcVar.k.equals(defpackage.xkd.DISPLAY_TYPE_MAIN);
            if (j$.util.Objects.equals(point, point2) && j$.util.Objects.equals(carDisplay2.e, iveVarA.n) && ((!zEquals2 || zEquals) && !z && (!defpackage.actb.f() || j$.util.Objects.equals(carDisplay2.i, iveVarA.r)))) {
                carDisplay = null;
            } else {
                iuwVar.d = iuwVar.f(iveVarA, ivcVar);
                carDisplay = iuwVar.d;
            }
            if (zEquals) {
                rect = null;
            } else {
                iuwVar.e = rect;
            }
            com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures2 = iveVarA.q;
            if (!j$.util.Objects.equals(iuwVar.g, carDisplayUiFeatures2)) {
                iuwVar.g = carDisplayUiFeatures2;
                carDisplayUiFeatures = carDisplayUiFeatures2;
            }
        }
        if (carDisplay != null) {
            iuwVar.h.e(carDisplay);
        } else if (rect != null) {
            iuwVar.i.e(rect);
        }
        if (carDisplayUiFeatures != null) {
            iuwVar.j.e(carDisplayUiFeatures);
        }
        this.p.J(xpqVar, java.util.UUID.fromString(this.r.g().g));
    }

    @Override // defpackage.ivd
    public final void d(android.view.Surface surface) {
        defpackage.jkr jkrVar = this.p;
        boolean zE = e();
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        defpackage.ivb ivbVar = this.c;
        defpackage.imi imiVar = (defpackage.imi) ivbVar;
        defpackage.ysr.bk(looperMyLooper == imiVar.o.getLooper(), "onVideoFocusGained should happen in the default handler thread.");
        synchronized (imiVar.q) {
            if (zE) {
                defpackage.omv.g(((defpackage.imi) ivbVar).k, "com.google.android.gms.car.STARTUP_LATENCY_MEASUREMENT_EVENT", defpackage.rss.c.ordinal(), null);
                ((defpackage.imi) ivbVar).O.e(defpackage.zbe.VIDEO_FOCUS, defpackage.zbd.Cs);
                ((defpackage.imi) ivbVar).aP();
            }
            if (((defpackage.imi) ivbVar).s) {
                if (!jkrVar.am(surface)) {
                    imiVar.ax(defpackage.zaj.COMPOSITION, defpackage.zak.COMPOSITION_INIT_FAIL, "Starting composition failed");
                    return;
                }
                com.google.android.gms.car.display.CarDisplayId carDisplayId = this.j;
                imiVar.E.c(jkrVar);
                defpackage.ioh iohVarN = imiVar.n();
                if (iohVarN != null) {
                    iohVarN.C(carDisplayId);
                }
                if (com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId)) {
                    imiVar.l.h(true);
                }
            }
        }
    }

    public final boolean e() {
        return com.google.android.gms.car.display.CarDisplayId.a.equals(this.j);
    }

    @Override // defpackage.jkq
    public final boolean f() {
        return ((java.lang.Boolean) this.u.fF()).booleanValue();
    }
}
