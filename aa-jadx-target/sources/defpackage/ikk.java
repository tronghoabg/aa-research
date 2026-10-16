package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ikk implements defpackage.jax, defpackage.jbv, defpackage.izc {
    public static final android.view.MotionEvent.PointerProperties[] b;
    private static final android.util.SparseIntArray r;
    private final java.util.List A;
    private final defpackage.iki B;
    public int[] c;
    public defpackage.xkv d;
    public iwi e;
    boolean h;
    public final defpackage.ikh i;
    public final defpackage.ilj j;
    public volatile com.google.android.gms.car.CarUiInfo m;
    public boolean n;
    public boolean o;
    private defpackage.jay s;
    private long u;
    private int v;
    private int w;
    private final defpackage.jfo x;
    private final com.google.android.gms.car.display.CarDisplayId y;
    private final defpackage.jfa z;
    private static final defpackage.yqm p = defpackage.yqm.c("CAR.INPUT");
    private static final defpackage.yhx q = defpackage.yhx.t(23, 19, 20, 21, 22, 65536, new java.lang.Integer[0]);
    public static final long a = android.view.ViewConfiguration.getLongPressTimeout();
    private final java.util.EnumSet t = java.util.EnumSet.noneOf(defpackage.xkj.class);
    public final android.util.SparseArray f = new android.util.SparseArray();
    public final android.os.Handler g = new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null);
    public final java.util.Queue k = new java.util.ArrayDeque();
    public final android.content.SharedPreferences.OnSharedPreferenceChangeListener l = new defpackage.ilq(this, 1);

    static {
        b = new android.view.MotionEvent.PointerProperties[]{pointerProperties};
        android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
        pointerProperties.id = 31;
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        r = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        sparseIntArray.put(5, 5);
        sparseIntArray.put(6, 6);
    }

    public ikk(defpackage.ikh ikhVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, defpackage.jfa jfaVar, defpackage.ilj iljVar, defpackage.jfo jfoVar, defpackage.iki ikiVar) {
        this.i = ikhVar;
        this.y = carDisplayId;
        this.z = jfaVar;
        this.j = iljVar;
        this.B = ikiVar;
        this.x = jfoVar;
        j$.util.stream.Stream streamD = defpackage.tht.d(new defpackage.ilz(1), defpackage.acyi.a.fF().f());
        int i = defpackage.ygw.d;
        this.A = (defpackage.ygw) streamD.collect(defpackage.yds.a);
    }

    public static android.view.KeyEvent h(xlf xlfVar, int i, int i2, j$.time.Duration duration) {
        boolean zContains = q.contains(java.lang.Integer.valueOf(xlfVar.c));
        return new android.view.KeyEvent(0L, duration.toMillis(), !xlfVar.d ? 1 : 0, xlfVar.c, (i & 128) != 0 ? 1 : i2, zContains ? 0 : xlfVar.e, 0, 0, i | 4);
    }

    public static defpackage.iyl i(xpn xpnVar) {
        int i;
        defpackage.iyl iylVar;
        defpackage.iyk iykVar;
        android.util.SparseIntArray sparseIntArray = r;
        if ((xpnVar.b & 2) != 0) {
            int iW = defpackage.wqn.w(xpnVar.e);
            if (iW == 0) {
                iW = 1;
            }
            i = iW - 1;
        } else {
            i = 0;
        }
        int i2 = sparseIntArray.get(i);
        int i3 = xpnVar.d;
        int size = xpnVar.c.size();
        synchronized (defpackage.iyl.a) {
            iylVar = defpackage.iyl.c;
            if (iylVar == null) {
                iylVar = new defpackage.iyl();
            } else {
                defpackage.iyl.c = iylVar.d;
                defpackage.iyl.b--;
                iylVar.d = null;
            }
        }
        iylVar.e = i2;
        iylVar.f = i3;
        iylVar.g = android.os.SystemClock.elapsedRealtime();
        if (iylVar.h.length != size) {
            iylVar.h = new defpackage.iyk[size];
        }
        for (int i4 = 0; i4 < xpnVar.c.size(); i4++) {
            xpm xpmVar = (xpm) xpnVar.c.get(i4);
            defpackage.iyk[] iykVarArr = iylVar.h;
            int i5 = xpmVar.c;
            int i6 = xpmVar.d;
            int i7 = xpmVar.e;
            synchronized (defpackage.iyk.a) {
                iykVar = defpackage.iyk.c;
                if (iykVar == null) {
                    iykVar = new defpackage.iyk();
                } else {
                    defpackage.iyk.c = iykVar.d;
                    defpackage.iyk.b--;
                    iykVar.d = null;
                }
            }
            iykVar.e = i5;
            iykVar.f = i6;
            iykVar.g = i7;
            iykVarArr[i4] = iykVar;
        }
        return iylVar;
    }

    private final float p() {
        defpackage.xkv xkvVar;
        int iA = (int) defpackage.kjl.a(this.A, this.z.t(), 0L);
        if (iA == 0 && ((xkvVar = this.d) == null || (xkvVar.b & 128) == 0 || (iA = xkvVar.j) == 0)) {
            return 1.0f;
        }
        return (((iA - 5.0f) * (-0.5f)) / 5.0f) + 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jbv
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        int i;
        boolean z;
        boolean z2;
        com.google.android.gms.car.CarInfo carInfoT;
        defpackage.ill.d();
        if ((xpaVar.b & 8) != 0) {
            defpackage.xkx xkxVar = xpaVar.f;
            if (xkxVar == null) {
                xkxVar = defpackage.xkx.b;
            }
            com.google.android.gms.car.display.CarDisplayId carDisplayId = this.y;
            int i2 = xkxVar.g;
            int i3 = carDisplayId.b;
            if (i2 == i3) {
                this.c = defpackage.ysr.cQ(xkxVar.c);
                this.d = xkxVar.e.size() > 0 ? (defpackage.xkv) xkxVar.e.get(0) : null;
                this.t.addAll(new defpackage.abph(xkxVar.f, defpackage.xkx.a));
                java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(defpackage.xle.class);
                boolean z3 = false;
                boolean z4 = false;
                for (int i4 : this.c) {
                    if (i4 == 84) {
                        z4 = true;
                    } else if (i4 != 65536) {
                        switch (i4) {
                            case 19:
                                enumSetNoneOf.add(defpackage.xle.KEYCODE_DPAD_UP);
                                break;
                            case 20:
                                enumSetNoneOf.add(defpackage.xle.KEYCODE_DPAD_DOWN);
                                break;
                            case 21:
                                enumSetNoneOf.add(defpackage.xle.KEYCODE_DPAD_LEFT);
                                break;
                            case 22:
                                enumSetNoneOf.add(defpackage.xle.KEYCODE_DPAD_RIGHT);
                                break;
                            case 23:
                                enumSetNoneOf.add(defpackage.xle.KEYCODE_DPAD_CENTER);
                                break;
                        }
                    } else {
                        z3 = true;
                    }
                }
                boolean zContainsAll = enumSetNoneOf.containsAll(java.util.EnumSet.of(defpackage.xle.KEYCODE_DPAD_UP, defpackage.xle.KEYCODE_DPAD_DOWN, defpackage.xle.KEYCODE_DPAD_LEFT, defpackage.xle.KEYCODE_DPAD_RIGHT, defpackage.xle.KEYCODE_DPAD_CENTER));
                defpackage.xkw xkwVar = xkxVar.d.size() > 0 ? (defpackage.xkw) xkxVar.d.get(0) : null;
                if (xkwVar == null) {
                    i = 0;
                } else if ((xkwVar.b & 4) != 0) {
                    int iAq = defpackage.a.aq(xkwVar.e);
                    i = (iAq == 0 || iAq == 1) ? 2 : iAq != 2 ? 4 : 3;
                } else {
                    i = 1;
                }
                boolean zO = o();
                if (zO && z3) {
                    ((defpackage.yqj) ((defpackage.yqj) p.h()).ai((char) 150)).u("Rotary controller not supported when touchpad for UI navigation is present. Reporting rotary controller as not present.");
                    z = false;
                } else {
                    z = z3;
                }
                boolean z5 = defpackage.acri.a.fF().a() && (carInfoT = this.z.t()) != null && carInfoT.r == 3 && zContainsAll && !z && this.d == null;
                this.h = z5;
                if (z5) {
                    iwi iwiVar = new iwi(new ajnd(this));
                    this.e = iwiVar;
                    this.d = iwiVar.b;
                    ((defpackage.yqj) ((defpackage.yqj) p.f()).ai((char) 149)).u("Using virtual touchpad input for UI navigation");
                    this.x.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.INPUT_CONFIGURATION, defpackage.zbd.oQ).l());
                    z2 = true;
                } else {
                    z2 = zO;
                }
                int iE = e();
                int iF = f();
                iwi iwiVar2 = this.e;
                if (iwiVar2 != null) {
                    defpackage.yqm yqmVar = iwi.a;
                    ((defpackage.yqj) yqmVar.l().ai(1443)).w("VirtualTouchpad move threshold: %dpx", iE);
                    int i5 = -iE;
                    iwiVar2.c = iwi.b(0, i5);
                    ((defpackage.yqj) yqmVar.l().ai(1439)).y("VirtualTouchpad upSwipe: %s", iwiVar2.c);
                    iwiVar2.d = iwi.b(0, iE);
                    ((defpackage.yqj) yqmVar.l().ai(1440)).y("VirtualTouchpad downSwipe: %s", iwiVar2.d);
                    iwiVar2.e = iwi.b(i5, 0);
                    ((defpackage.yqj) yqmVar.l().ai(1441)).y("VirtualTouchpad leftSwipe: %s", iwiVar2.e);
                    iwiVar2.f = iwi.b(iE, 0);
                    ((defpackage.yqj) yqmVar.l().ai(1442)).y("VirtualTouchpad rightSwipe: %s", iwiVar2.f);
                }
                this.m = new com.google.android.gms.car.CarUiInfo(z, i, z4, z2, g(), zContainsAll, false, iE, iF);
                defpackage.iki ikiVar = this.B;
                if (ikiVar != null) {
                    ikiVar.a(this.m);
                }
                this.j.d(this.l);
                ((defpackage.yqj) ((defpackage.yqj) p.f()).ai(148)).R("Discovered input for display %d with service %d: %s", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(xpaVar.c), this.m);
                return this;
            }
        }
        return null;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new defpackage.jay(this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    public final int e() {
        int iMax;
        int i = this.v;
        if (i != 0) {
            return i;
        }
        defpackage.xkv xkvVar = this.d;
        if (xkvVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) p.h()).ai((char) 144)).u("No touchpad found. Using default threshold.");
            return 48;
        }
        int i2 = xkvVar.c;
        int i3 = xkvVar.d;
        int i4 = xkvVar.f;
        int i5 = xkvVar.g;
        if (i2 == 0 || i3 == 0) {
            ((defpackage.yqj) ((defpackage.yqj) p.h()).ai((char) 142)).u("No virtual touchpad dimens. Using default threshold.");
            return 48;
        }
        if (i4 == 0 || i5 == 0) {
            ((defpackage.yqj) ((defpackage.yqj) p.h()).ai((char) 143)).u("No physical touchpad dimens. Assuming physical dimens = virtual dimens.");
            i4 = i2;
            i5 = i3;
        }
        int iB = (int) defpackage.acyi.b();
        int iE = (int) defpackage.acyi.e();
        float fP = p();
        int i6 = i2 / iB;
        int i7 = i3 / iB;
        float f = iE;
        if (i6 > i7) {
            iMax = java.lang.Math.max(i6, (int) (f * (i2 / i4)));
        } else {
            iMax = java.lang.Math.max(i7, (int) (f * (i3 / i5)));
        }
        int i8 = (int) (iMax * fP);
        this.v = i8;
        return i8;
    }

    public final int f() {
        float f;
        float f2;
        int i = this.w;
        if (i != 0) {
            return i;
        }
        defpackage.xkv xkvVar = this.d;
        if (xkvVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) p.h()).ai((char) 147)).u("No touchpad found. Using default threshold.");
            return 64;
        }
        int i2 = xkvVar.c;
        int i3 = xkvVar.d;
        int i4 = xkvVar.f;
        int i5 = xkvVar.g;
        if (i2 == 0 || i3 == 0) {
            ((defpackage.yqj) ((defpackage.yqj) p.h()).ai((char) 145)).u("No virtual touchpad dimens. Using default threshold.");
            return 64;
        }
        if (i4 == 0 || i5 == 0) {
            ((defpackage.yqj) ((defpackage.yqj) p.h()).ai((char) 146)).u("No physical touchpad dimens. Assuming physical dimens = virtual dimens.");
            i4 = i2;
            i5 = i3;
        }
        int iF = (int) defpackage.acyi.f();
        int iE = e();
        float fP = p();
        float f3 = iF;
        if (i2 > i3) {
            f = i4;
            f2 = i2;
        } else {
            f = i5;
            f2 = i3;
        }
        int i6 = iE + ((int) (((int) (f3 * (f2 / f))) * fP));
        this.w = i6;
        return i6;
    }

    public final android.graphics.Point g() {
        defpackage.xkv xkvVar = this.d;
        if (xkvVar == null) {
            return null;
        }
        return new android.graphics.Point(xkvVar.c, xkvVar.d);
    }

    @Override // defpackage.jax
    public final void j(xpn xpnVar) {
        int i = xpnVar.d;
        defpackage.iyl iylVarI = i(xpnVar);
        iylVarI.e = (i << 8) | iylVarI.e;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i2 = iylVarI.e;
        if (i2 == 0) {
            this.u = jElapsedRealtime;
            i2 = 0;
        }
        this.i.b(defpackage.iyl.a(this.u, jElapsedRealtime, i2, java.util.Arrays.asList(iylVarI.h), 0, 0, 1048584, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.izc
    public final void k(defpackage.xpa xpaVar) {
        if (this.d != null) {
            defpackage.xkx xkxVar = xpaVar.f;
            if (xkxVar == null) {
                xkxVar = defpackage.xkx.b;
            }
            if ((((defpackage.xkv) xkxVar.e.get(0)).b & 128) != 0) {
                defpackage.abor aborVarO = defpackage.xkv.a.o(this.d);
                defpackage.xkx xkxVar2 = xpaVar.f;
                if (xkxVar2 == null) {
                    xkxVar2 = defpackage.xkx.b;
                }
                int i = ((defpackage.xkv) xkxVar2.e.get(0)).j;
                aborVarO.t();
                defpackage.xkv xkvVar = (defpackage.xkv) aborVarO.b;
                xkvVar.b |= 128;
                xkvVar.j = i;
                this.d = (defpackage.xkv) aborVarO.q();
            }
        }
        l();
    }

    public final void l() {
        if (this.d != null) {
            this.v = 0;
            this.w = 0;
        }
        com.google.android.gms.car.CarUiInfo carUiInfo = this.m;
        int[] iArr = carUiInfo.e;
        this.m = new com.google.android.gms.car.CarUiInfo(carUiInfo.a, carUiInfo.g, carUiInfo.c, carUiInfo.d, iArr != null ? new android.graphics.Point(iArr[0], iArr[1]) : null, carUiInfo.f, carUiInfo.h, e(), f());
        defpackage.iki ikiVar = this.B;
        if (ikiVar != null) {
            ikiVar.a(this.m);
        }
    }

    @Override // defpackage.izd
    public final void m(java.io.PrintWriter printWriter) {
        printWriter.println("Supported keys: ".concat(java.lang.String.valueOf(java.util.Arrays.toString(this.c))));
        defpackage.xkv xkvVar = this.d;
        if (xkvVar != null) {
            java.lang.Integer numValueOf = (xkvVar.b & 1) != 0 ? java.lang.Integer.valueOf(xkvVar.c) : null;
            defpackage.xkv xkvVar2 = this.d;
            java.lang.Integer numValueOf2 = (xkvVar2.b & 2) != 0 ? java.lang.Integer.valueOf(xkvVar2.d) : null;
            defpackage.xkv xkvVar3 = this.d;
            java.lang.Integer numValueOf3 = (xkvVar3.b & 8) != 0 ? java.lang.Integer.valueOf(xkvVar3.f) : null;
            defpackage.xkv xkvVar4 = this.d;
            java.lang.Integer numValueOf4 = (xkvVar4.b & 16) != 0 ? java.lang.Integer.valueOf(xkvVar4.g) : null;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(o());
            java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(e());
            java.lang.Integer numValueOf6 = java.lang.Integer.valueOf(f());
            java.lang.Float fValueOf = java.lang.Float.valueOf(p());
            defpackage.xkv xkvVar5 = this.d;
            java.lang.Boolean boolValueOf2 = (xkvVar5.b & 4) != 0 ? java.lang.Boolean.valueOf(xkvVar5.e) : null;
            defpackage.xkv xkvVar6 = this.d;
            java.lang.Boolean boolValueOf3 = (xkvVar6.b & 32) != 0 ? java.lang.Boolean.valueOf(xkvVar6.h) : null;
            defpackage.xkv xkvVar7 = this.d;
            java.lang.Boolean boolValueOf4 = (xkvVar7.b & 64) != 0 ? java.lang.Boolean.valueOf(xkvVar7.i) : null;
            defpackage.xkv xkvVar8 = this.d;
            printWriter.printf("Touchpad: width x height:%dx%d, physicalWidth x physicalHeight:%dx%d\n\tgetTouchPadForUiNavigation():%b\n\tgetTouchpadMoveThresholdPx():%d, getTouchpadMultimoveThresholdPx():%d, getTouchpadThresholdMultiplier():%.4f\n\tuiNavigation:%b, uiAbsolute:%b, tapAsSelect:%b, sensitivity:%d, useVirtualTouchpad:%b\n", numValueOf, numValueOf2, numValueOf3, numValueOf4, boolValueOf, numValueOf5, numValueOf6, fValueOf, boolValueOf2, boolValueOf3, boolValueOf4, (xkvVar8.b & 128) != 0 ? java.lang.Integer.valueOf(xkvVar8.j) : null, java.lang.Boolean.valueOf(this.h));
        }
        printWriter.println("Feedback events: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.t))));
        printWriter.println("CarUiInfo: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.m))));
    }

    public final void n(int i) {
        defpackage.xkj xkjVarB = defpackage.xkj.b(i);
        if (xkjVarB == null || !this.t.contains(xkjVarB)) {
            return;
        }
        defpackage.jay jayVar = this.s;
        defpackage.abor aborVarN = xkt.a.n();
        aborVarN.t();
        xkt xktVar = aborVarN.b;
        xktVar.c = xkjVarB.f;
        xktVar.b |= 1;
        jayVar.k(32772, aborVarN.q());
    }

    public final boolean o() {
        defpackage.xkv xkvVar = this.d;
        if (xkvVar != null) {
            return xkvVar.e || defpackage.acyi.i();
        }
        return false;
    }

    @Override // defpackage.izd
    public final void q() {
        throw null;
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        defpackage.jay jayVar = (defpackage.jay) jbqVar;
        this.s = jayVar;
        int[] iArr = this.c;
        defpackage.abor aborVarN = defpackage.xlc.a.n();
        java.util.List listCP = defpackage.ysr.cP(iArr);
        aborVarN.t();
        defpackage.xlc xlcVar = (defpackage.xlc) aborVarN.b;
        defpackage.abpf abpfVar = xlcVar.b;
        if (!abpfVar.c()) {
            int size = abpfVar.size();
            xlcVar.b = abpfVar.d(size + size);
        }
        defpackage.abnf.i(listCP, xlcVar.b);
        jayVar.k(32770, (defpackage.xlc) aborVarN.q());
    }
}
