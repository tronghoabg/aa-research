package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rpk implements defpackage.rpm {
    public final defpackage.rpj a;
    public defpackage.rbr b;
    private final defpackage.rpl c;
    private final android.content.Context d;
    private final int e;
    private final defpackage.rbp f;
    private final boolean g;
    private final java.lang.String h;
    private defpackage.rcw i;
    private android.content.Context j;
    private final defpackage.shg k;

    public rpk(defpackage.rpl rplVar, android.content.Context context, int i, defpackage.shg shgVar, defpackage.rbp rbpVar, boolean z, java.lang.String str, defpackage.rpj rpjVar) {
        context.getClass();
        rbpVar.getClass();
        str.getClass();
        this.c = rplVar;
        this.d = context;
        this.e = i;
        this.k = shgVar;
        this.f = rbpVar;
        this.g = z;
        this.h = str;
        this.a = rpjVar;
    }

    @Override // defpackage.rpm
    public final void A(defpackage.rbl rblVar) {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s updateConfiguration(%s)", rbrVar.m, rblVar);
            }
            rbrVar.g = rblVar;
            rbrVar.getResources().getConfiguration().touchscreen = defpackage.rbr.c(rblVar);
            rbrVar.getResources().getConfiguration().navigation = defpackage.rbr.b(rblVar);
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            rbrVar.getDisplay().getMetrics(displayMetrics);
            if (rbrVar.Q.a) {
                rbrVar.R.a(rbrVar.getResources().getConfiguration(), displayMetrics);
            } else {
                rbrVar.getResources().updateConfiguration(rbrVar.getResources().getConfiguration(), displayMetrics);
            }
            rbrVar.A = rblVar.d;
            rbrVar.B = rblVar.e;
            if (rbrVar.r) {
                if (rbrVar.z != rblVar.c) {
                    throw new java.lang.IllegalStateException("Changing the value of touchpadForUiNavigation configuration not supported");
                }
                return;
            }
            boolean z = rblVar.c;
            rbrVar.z = z;
            rbrVar.r = true;
            if (z) {
                defpackage.rpi rpiVar = rbrVar.l;
                rpiVar.b();
                if (rbrVar.K != null) {
                    rpiVar.a(rbrVar.f().getDecorView());
                }
            }
        }
    }

    @Override // defpackage.rpm
    public final void B(android.graphics.Rect rect) {
        rect.getClass();
        defpackage.rbr rbrVar = this.b;
        if (rbrVar == null || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s maybeUpdateNonDrawableInsets: %s", rbrVar.m, rect);
        }
        rbrVar.n(rect);
        android.view.View view = rbrVar.b;
        if (view != null) {
            view.requestApplyInsets();
        }
    }

    @Override // defpackage.rpm
    public final void C(boolean z, int i, int i2) {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s updateSettings(isFocusFinderEnabledInRotary=%s, touchpadFocusNavigationHistoryMaxSize=%s, touchpadFocusNavigationHistoryMaxAgeMs=%s)", rbrVar.m, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            }
            rbrVar.J = z;
            rbrVar.X = new defpackage.qum(i, i2);
        }
    }

    @Override // defpackage.rpm
    public final void D(android.graphics.Rect rect) {
        rect.getClass();
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            rbrVar.B(rect);
        }
    }

    @Override // defpackage.rpm
    public final boolean E() {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            return rbrVar.o;
        }
        return false;
    }

    @Override // defpackage.rpm
    public final boolean F() {
        return this.b != null;
    }

    @Override // defpackage.rpm
    public final void G() {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            rbrVar.d = true;
            rbrVar.y();
        }
    }

    @Override // defpackage.rpm
    public final void H() {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        rbrVar.I = true;
    }

    @Override // defpackage.rpm
    public final android.content.Context a() {
        android.content.Context context = this.j;
        if (context != null) {
            return context;
        }
        throw new java.lang.IllegalStateException("configurationContext is not initialized");
    }

    @Override // defpackage.rpm
    public final android.content.Context b() {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        android.content.Context contextD = rbrVar.d();
        contextD.getClass();
        return contextD;
    }

    @Override // defpackage.rpm
    public final android.util.Pair c(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        defpackage.rbr rbrVar = this.b;
        defpackage.rph rphVar = null;
        if (rbrVar == null) {
            return null;
        }
        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s injectKeyEvent(event:%s) [windowHasFocus:%b, isShowing:%b, ready:%b]", rbrVar.m, keyEvent, java.lang.Boolean.valueOf(rbrVar.s), java.lang.Boolean.valueOf(rbrVar.isShowing()), java.lang.Boolean.valueOf(rbrVar.k));
        }
        if (rbrVar.z) {
            rbrVar.t = false;
        }
        if (rbrVar.Q.g) {
            rbrVar.z();
            rphVar = new defpackage.rph(-1, rbrVar.L);
        }
        if (!rbrVar.isShowing() || !rbrVar.k || !rbrVar.s) {
            return new android.util.Pair(java.lang.Boolean.FALSE, rphVar);
        }
        rbrVar.j(true, false);
        rbrVar.f().injectInputEvent(keyEvent);
        return new android.util.Pair(java.lang.Boolean.TRUE, rphVar);
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0329  */
    /* JADX WARN: Code duplicated, block: B:185:0x032d  */
    /* JADX WARN: Code duplicated, block: B:186:0x033f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0354  */
    /* JADX WARN: Code duplicated, block: B:191:0x035e  */
    /* JADX WARN: Code duplicated, block: B:202:0x039a  */
    /* JADX WARN: Code duplicated, block: B:204:0x039d  */
    /* JADX WARN: Code duplicated, block: B:206:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:209:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:211:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:215:0x03de  */
    /* JADX WARN: Code duplicated, block: B:233:0x0422  */
    /* JADX WARN: Code duplicated, block: B:234:0x0425  */
    /* JADX WARN: Code duplicated, block: B:241:0x0448  */
    /* JADX WARN: Code duplicated, block: B:249:0x045a  */
    /* JADX WARN: Code duplicated, block: B:251:0x046e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0475  */
    /* JADX WARN: Code duplicated, block: B:256:0x0499  */
    /* JADX WARN: Code duplicated, block: B:258:0x049c  */
    /* JADX WARN: Code duplicated, block: B:260:0x04a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:263:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:265:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:267:0x04be  */
    /* JADX WARN: Code duplicated, block: B:269:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:271:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:273:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:275:0x0504  */
    /* JADX WARN: Code duplicated, block: B:278:0x053e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0543  */
    /* JADX WARN: Code duplicated, block: B:286:0x056d  */
    /* JADX WARN: Code duplicated, block: B:290:0x0599 A[LOOP:1: B:288:0x0591->B:290:0x0599, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x05af  */
    /* JADX WARN: Code duplicated, block: B:300:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:303:0x05d4  */
    @Override // defpackage.rpm
    public final android.util.Pair d(android.view.MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        double dSignum;
        int i;
        int i2;
        int i3;
        android.view.KeyEvent keyEvent;
        int i4;
        int i5;
        double d;
        double d2;
        android.view.ViewGroup viewGroup;
        android.view.View currentFocus;
        android.view.View view;
        defpackage.rba rbaVarG;
        defpackage.qum qumVar;
        qul qulVar;
        android.view.View view2;
        android.view.View view3;
        java.lang.String str;
        char c;
        defpackage.qum qumVar2;
        java.util.Deque deque;
        qul qulVar2;
        android.view.View view4;
        int i6;
        double d3;
        boolean z3;
        boolean z4;
        boolean z5;
        java.util.ArrayList<android.view.View> arrayList;
        android.view.View view5;
        int i7;
        int i8;
        int i9;
        char c2;
        android.graphics.Rect rect;
        int iIndexOf;
        motionEvent.getClass();
        defpackage.rbr rbrVar = this.b;
        android.view.View viewA = null;
        if (rbrVar == null) {
            return null;
        }
        int i10 = 4;
        int i11 = 2;
        int i12 = 1;
        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s injectMotionEvent(event:%s) [isShowing():%b, ready:%b]", rbrVar.m, motionEvent, java.lang.Boolean.valueOf(rbrVar.isShowing()), java.lang.Boolean.valueOf(rbrVar.k));
        }
        if (rbrVar.z) {
            z = rbrVar.t;
            rbrVar.t = false;
        } else {
            z = false;
        }
        if (rbrVar.isShowing() && rbrVar.k) {
            if (motionEvent.getSource() == 4098) {
                defpackage.rbq rbqVar = rbrVar.q;
                if (rbqVar == null || !rbqVar.a || !rbqVar.b) {
                    rbrVar.j(true, true);
                }
                rbrVar.f().injectInputEvent(motionEvent);
                return rbrVar.h;
            }
            rbrVar.j(true, false);
            if (motionEvent.getSource() == 8194) {
                android.view.View currentFocus2 = rbrVar.getCurrentFocus();
                defpackage.rba rbaVarG2 = rbrVar.g(currentFocus2);
                if (rbaVarG2 != null) {
                    if (rbaVarG2.r(currentFocus2, motionEvent)) {
                        return rbrVar.h;
                    }
                } else if (currentFocus2 != null && currentFocus2.dispatchGenericMotionEvent(motionEvent)) {
                    return rbrVar.h;
                }
            }
            if (rbrVar.dispatchGenericMotionEvent(motionEvent)) {
                return rbrVar.h;
            }
            if (motionEvent.getActionMasked() == 8) {
                int axisValue = (int) motionEvent.getAxisValue(9);
                int i13 = axisValue > 0 ? 2 : 1;
                int i14 = 0;
                int i15 = 0;
                while (i14 < java.lang.Math.abs(axisValue)) {
                    if (i15 == 0) {
                        android.view.View currentFocus3 = rbrVar.getCurrentFocus();
                        defpackage.rba rbaVarG3 = rbrVar.g(currentFocus3);
                        if (rbaVarG3 == null || !rbaVarG3.v(currentFocus3, i13, false)) {
                            android.view.View decorView = rbrVar.f().getDecorView();
                            if (decorView instanceof android.view.ViewGroup) {
                                if (rbrVar.J) {
                                    decorView = rbrVar.O.a((android.view.ViewGroup) decorView, currentFocus3, i13, false);
                                } else {
                                    android.view.ViewGroup viewGroupB = defpackage.rbe.b((android.view.ViewGroup) decorView, currentFocus3);
                                    viewGroupB.focusSearch(i13);
                                    java.util.ArrayList<android.view.View> arrayList2 = new java.util.ArrayList<>();
                                    viewGroupB.addFocusables(arrayList2, i13);
                                    if (arrayList2.isEmpty()) {
                                        decorView = null;
                                    } else {
                                        c2 = 5;
                                        int size = arrayList2.size();
                                        if (currentFocus3 != null) {
                                            i8 = i11;
                                            iIndexOf = arrayList2.indexOf(currentFocus3) + (i13 == i11 ? i12 : -1);
                                            if (iIndexOf < 0 || iIndexOf >= size) {
                                                iIndexOf = defpackage.rbe.c(viewGroupB) ? (iIndexOf + size) % size : java.lang.Math.max(java.lang.Math.min(iIndexOf, size - 1), 0);
                                            }
                                        } else {
                                            i8 = i11;
                                            iIndexOf = 0;
                                        }
                                        decorView = arrayList2.get(iIndexOf);
                                    }
                                }
                                i8 = i11;
                                c2 = 5;
                            } else {
                                i8 = i11;
                                c2 = 5;
                            }
                            if (decorView == null) {
                                java.lang.String str2 = rbrVar.m;
                                java.lang.String strN = sqg.n(i13);
                                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(rbrVar.J);
                                java.lang.Object[] objArr = new java.lang.Object[i10];
                                objArr[0] = str2;
                                objArr[i12] = currentFocus3;
                                objArr[i8] = strN;
                                objArr[3] = boolValueOf;
                                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s moveFocus Nothing to grant focus to. current = %s, direction = %s, isFocusFinderEnabledInRotary = %s", objArr);
                                i7 = i10;
                                i9 = i12;
                            } else if (decorView == currentFocus3) {
                                java.lang.String str3 = rbrVar.m;
                                java.lang.String strN2 = sqg.n(i13);
                                java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(rbrVar.J);
                                i9 = i12;
                                java.lang.Object[] objArr2 = new java.lang.Object[i10];
                                objArr2[0] = str3;
                                objArr2[i9] = currentFocus3;
                                objArr2[i8] = strN2;
                                objArr2[3] = boolValueOf2;
                                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s moveFocus left focus on same View. current = %s, direction = %s, isFocusFinderEnabledInRotary = %s", objArr2);
                                rbrVar.E(decorView, i13, null);
                                i7 = i10;
                            } else {
                                i9 = i12;
                                if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                                    java.lang.String str4 = rbrVar.m;
                                    java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(decorView.isInTouchMode());
                                    java.lang.String strN3 = sqg.n(i13);
                                    java.lang.Boolean boolValueOf4 = java.lang.Boolean.valueOf(rbrVar.J);
                                    i7 = i10;
                                    java.lang.Object[] objArr3 = new java.lang.Object[6];
                                    objArr3[0] = str4;
                                    objArr3[i9] = currentFocus3;
                                    objArr3[i8] = boolValueOf3;
                                    objArr3[3] = strN3;
                                    objArr3[i7] = boolValueOf4;
                                    objArr3[c2] = decorView;
                                    defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s moveFocus current = %s, touchMode = %s, direction = %s, isFocusFinderEnabledInRotary = %s requestFocusFromTouch() on %s", objArr3);
                                } else {
                                    i7 = i10;
                                }
                                if (currentFocus3 != null) {
                                    android.graphics.Rect rect2 = new android.graphics.Rect();
                                    decorView.getGlobalVisibleRect(rect2);
                                    rect = new android.graphics.Rect();
                                    currentFocus3.getGlobalVisibleRect(rect, new android.graphics.Point(rect2.left, rect2.top));
                                } else {
                                    rect = null;
                                }
                                if (rbrVar.E(decorView, i13, rect)) {
                                }
                            }
                            i15 = 0;
                        } else {
                            i7 = i10;
                            i8 = i11;
                            i15 = i12;
                            i9 = i15;
                        }
                        i14++;
                        i12 = i9;
                        i10 = i7;
                        i11 = i8;
                    } else {
                        i7 = i10;
                        i8 = i11;
                        i9 = i12;
                    }
                    i15 = i9;
                    i14++;
                    i12 = i9;
                    i10 = i7;
                    i11 = i8;
                }
                return i15 != 0 ? rbrVar.h : rbrVar.e(i13);
            }
            if (rbrVar.z && motionEvent.getSource() == 1048584) {
                if (motionEvent.getActionMasked() == 0 || !rbrVar.u) {
                    rbrVar.p(motionEvent.getX(), motionEvent.getY());
                    rbrVar.v = false;
                    rbrVar.y = false;
                    z2 = true;
                    rbrVar.u = true;
                    rbrVar.o();
                } else {
                    z2 = true;
                }
                if (motionEvent.getActionMasked() != 2) {
                    if (motionEvent.getActionMasked() == z2) {
                        rbrVar.u = false;
                        rbrVar.o();
                    }
                    return android.util.Pair.create(0, null);
                }
                if (z) {
                    rbrVar.v = z2;
                }
                float x = motionEvent.getX() - rbrVar.w;
                float y = motionEvent.getY() - rbrVar.x;
                int i16 = (!rbrVar.v || rbrVar.y) ? rbrVar.A : rbrVar.B;
                float f = rbrVar.C;
                float f2 = i16;
                float f3 = (int) (f2 / 3.0f);
                if (f <= f3 || f - x <= f3) {
                    float f4 = rbrVar.D;
                    float f5 = -f3;
                    if (f4 >= f5 || x - f4 <= f3) {
                        float f6 = rbrVar.E;
                        if (f6 <= f3 || f6 - y <= f3) {
                            float f7 = rbrVar.F;
                            if (f7 >= f5 || y - f7 <= f3) {
                                if (x > f) {
                                    rbrVar.C = x;
                                } else if (x < f4) {
                                    rbrVar.D = x;
                                }
                                if (y > f6) {
                                    rbrVar.E = y;
                                } else if (y < f7) {
                                    rbrVar.F = y;
                                }
                                float fAbs = java.lang.Math.abs(x);
                                float fAbs2 = java.lang.Math.abs(y);
                                if (fAbs < f2 && fAbs2 < f2) {
                                    return rbrVar.h;
                                }
                                double d4 = 0.0d;
                                if (fAbs > fAbs2) {
                                    double dSignum2 = java.lang.Math.signum(x);
                                    if (x >= 0.0f) {
                                        d4 = dSignum2;
                                        dSignum = 0.0d;
                                        i = 66;
                                    } else {
                                        d4 = dSignum2;
                                        dSignum = 0.0d;
                                        i = 17;
                                    }
                                } else {
                                    dSignum = java.lang.Math.signum(y);
                                    i = y >= 0.0f ? 130 : 33;
                                }
                                if (i == 17) {
                                    i2 = 21;
                                } else if (i == 33) {
                                    i2 = 19;
                                } else {
                                    if (i != 66) {
                                        if (i != 130) {
                                            i3 = 0;
                                        } else {
                                            i2 = 20;
                                        }
                                        if (i3 != 0) {
                                            throw new java.lang.IllegalStateException("Unsupported keycode 0");
                                        }
                                        if (rbrVar.v) {
                                            keyEvent = new android.view.KeyEvent(0L, 0L, 1, i3, 0, 4096);
                                        } else {
                                            keyEvent = new android.view.KeyEvent(1, i3);
                                        }
                                        keyEvent.setSource(motionEvent.getSource());
                                        if (rbrVar.dispatchKeyEvent(keyEvent)) {
                                            rbrVar.C(motionEvent, i16, d4, dSignum);
                                            return rbrVar.h;
                                        }
                                        i4 = i;
                                        i5 = i16;
                                        d = dSignum;
                                        d2 = d4;
                                        viewGroup = (android.view.ViewGroup) rbrVar.f().getDecorView();
                                        currentFocus = rbrVar.getCurrentFocus();
                                        if (currentFocus != null || ((currentFocus == viewGroup || defpackage.rbr.D(currentFocus, viewGroup)) && currentFocus.isFocusable())) {
                                            view = currentFocus;
                                        } else {
                                            if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                                                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s Current touchpad focus view is no longer part of the view hierarchy. Clearing focus for %s.", rbrVar.m, currentFocus);
                                            }
                                            view = null;
                                        }
                                        if (view == null) {
                                            arrayList = new java.util.ArrayList<>();
                                            viewGroup.addFocusables(arrayList, 0);
                                            if (arrayList.isEmpty()) {
                                                view5 = null;
                                            } else {
                                                view5 = arrayList.get(0);
                                            }
                                            if (view5 != null) {
                                                if (defpackage.omv.c("CAR.PROJECTION.PRES", 5)) {
                                                    defpackage.rrx.d(5, "CAR.PROJECTION.PRES", null, "%s No touchpad focus even though there are focusables. requestFocus() on %s.", rbrVar.m, view5);
                                                }
                                                rbrVar.F(view5);
                                            }
                                            rbrVar.p(motionEvent.getX(), motionEvent.getY());
                                            return rbrVar.j;
                                        }
                                        rbaVarG = rbrVar.g(view);
                                        if (rbaVarG == null && rbaVarG.v(view, i4, rbrVar.y)) {
                                            rbrVar.C(motionEvent, i5, d2, d);
                                            if (!rbrVar.v || rbrVar.y) {
                                                z5 = true;
                                            } else {
                                                if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                                                    z5 = true;
                                                    defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onTouchpadMoveEvent multi-move started", rbrVar.m);
                                                } else {
                                                    z5 = true;
                                                }
                                                rbrVar.y = z5;
                                            }
                                            rbrVar.v = z5;
                                            return rbrVar.j;
                                        }
                                        qumVar = rbrVar.X;
                                        qulVar = (qul) qumVar.a.peek();
                                        if (qulVar == null) {
                                            str = "%s onTouchpadMoveEvent multi-move started";
                                        } else {
                                            view2 = (android.view.View) qulVar.c.get();
                                            view3 = (android.view.View) qulVar.d.get();
                                            str = "%s onTouchpadMoveEvent multi-move started";
                                            if (!qumVar.d(qulVar.b, view2, view3) && view2 == view && qulVar.a == i4) {
                                                viewA = view3;
                                            } else {
                                                viewA = null;
                                            }
                                        }
                                        if (viewA == null && viewA.isFocusable() && defpackage.rbr.D(viewA, viewGroup)) {
                                            c = 0;
                                        } else {
                                            defpackage.rpi rpiVar = rbrVar.l;
                                            rpiVar.c(true);
                                            viewA = rbrVar.O.a(viewGroup, view, i4, rbrVar.v);
                                            c = 0;
                                            rpiVar.c(false);
                                        }
                                        if (viewA == null) {
                                            if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                                                java.lang.String str5 = rbrVar.m;
                                                java.lang.String strN4 = sqg.n(i4);
                                                java.lang.Object[] objArr4 = new java.lang.Object[2];
                                                objArr4[c] = str5;
                                                objArr4[1] = strN4;
                                                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onTouchpadMoveEvent Nothing to grant focus to in direction %s", objArr4);
                                            }
                                            rbrVar.p(motionEvent.getX(), motionEvent.getY());
                                            return rbrVar.v ? rbrVar.h : rbrVar.e(i4);
                                        }
                                        if (view == viewA) {
                                            rbrVar.p(motionEvent.getX(), motionEvent.getY());
                                            return rbrVar.h;
                                        }
                                        if (viewA instanceof rpr) {
                                            z4 = rbrVar.v;
                                            if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                                                defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onTouchpadMoveEvent Found trampoline view %s in direction = %s. windowFocusChangeDisallowedByForceField = %s", rbrVar.m, viewA, sqg.n(i4), java.lang.Boolean.valueOf(z4));
                                            }
                                            if (z4) {
                                                rbrVar.p(motionEvent.getX(), motionEvent.getY());
                                                return rbrVar.h;
                                            }
                                            rbrVar.C(motionEvent, i5, d2, d);
                                            return rbrVar.e(i4);
                                        }
                                        rbrVar.z();
                                        if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                                            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onTouchpadMoveEvent currentFocus = %s, touchMode = %s, requestFocus(%s, %s) on %s", rbrVar.m, view, java.lang.Boolean.valueOf(viewA.isInTouchMode()), sqg.n(i4), rbrVar.L, viewA);
                                        }
                                        qumVar2 = rbrVar.X;
                                        deque = qumVar2.a;
                                        qulVar2 = (qul) deque.peek();
                                        if (qulVar2 == null) {
                                            i6 = i5;
                                            d3 = d2;
                                        } else {
                                            view4 = (android.view.View) qulVar2.c.get();
                                            i6 = i5;
                                            d3 = d2;
                                            if (!!qumVar2.d(qulVar2.b, view4, (android.view.View) qulVar2.d.get()) && view4 == view) {
                                                if (qulVar2.a == i4) {
                                                    deque.pop();
                                                }
                                                rbrVar.E(viewA, i4, rbrVar.L);
                                                rbrVar.C(motionEvent, i6, d3, d);
                                                if (rbrVar.v || rbrVar.y) {
                                                    z3 = true;
                                                } else {
                                                    if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                                                        z3 = true;
                                                        defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, str, rbrVar.m);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    rbrVar.y = z3;
                                                }
                                                rbrVar.v = z3;
                                                return rbrVar.j;
                                            }
                                            deque.clear();
                                        }
                                        deque.push(new qul(new java.lang.ref.WeakReference(viewA), new java.lang.ref.WeakReference(view), defpackage.qum.a(i4), android.os.SystemClock.elapsedRealtime()));
                                        while (deque.size() > qumVar2.c) {
                                            deque.removeLast();
                                        }
                                        rbrVar.E(viewA, i4, rbrVar.L);
                                        rbrVar.C(motionEvent, i6, d3, d);
                                        if (rbrVar.v) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        rbrVar.v = z3;
                                        return rbrVar.j;
                                    }
                                    i2 = 22;
                                }
                                i3 = i2;
                                if (i3 != 0) {
                                    throw new java.lang.IllegalStateException("Unsupported keycode 0");
                                }
                                if (rbrVar.v) {
                                    keyEvent = new android.view.KeyEvent(0L, 0L, 1, i3, 0, 4096);
                                } else {
                                    keyEvent = new android.view.KeyEvent(1, i3);
                                }
                                keyEvent.setSource(motionEvent.getSource());
                                if (rbrVar.dispatchKeyEvent(keyEvent)) {
                                    rbrVar.C(motionEvent, i16, d4, dSignum);
                                    return rbrVar.h;
                                }
                                i4 = i;
                                i5 = i16;
                                d = dSignum;
                                d2 = d4;
                                viewGroup = (android.view.ViewGroup) rbrVar.f().getDecorView();
                                currentFocus = rbrVar.getCurrentFocus();
                                if (currentFocus != null) {
                                    view = currentFocus;
                                } else {
                                    view = currentFocus;
                                }
                                if (view == null) {
                                    arrayList = new java.util.ArrayList<>();
                                    viewGroup.addFocusables(arrayList, 0);
                                    if (arrayList.isEmpty()) {
                                        view5 = arrayList.get(0);
                                    } else {
                                        view5 = null;
                                    }
                                    if (view5 != null) {
                                        if (defpackage.omv.c("CAR.PROJECTION.PRES", 5)) {
                                            defpackage.rrx.d(5, "CAR.PROJECTION.PRES", null, "%s No touchpad focus even though there are focusables. requestFocus() on %s.", rbrVar.m, view5);
                                        }
                                        rbrVar.F(view5);
                                    }
                                    rbrVar.p(motionEvent.getX(), motionEvent.getY());
                                    return rbrVar.j;
                                }
                                rbaVarG = rbrVar.g(view);
                                if (rbaVarG == null) {
                                }
                                qumVar = rbrVar.X;
                                qulVar = (qul) qumVar.a.peek();
                                if (qulVar == null) {
                                    str = "%s onTouchpadMoveEvent multi-move started";
                                } else {
                                    view2 = (android.view.View) qulVar.c.get();
                                    view3 = (android.view.View) qulVar.d.get();
                                    str = "%s onTouchpadMoveEvent multi-move started";
                                    if (!qumVar.d(qulVar.b, view2, view3)) {
                                        viewA = null;
                                    } else {
                                        viewA = null;
                                    }
                                }
                                if (viewA == null) {
                                    defpackage.rpi rpiVar2 = rbrVar.l;
                                    rpiVar2.c(true);
                                    viewA = rbrVar.O.a(viewGroup, view, i4, rbrVar.v);
                                    c = 0;
                                    rpiVar2.c(false);
                                } else {
                                    defpackage.rpi rpiVar3 = rbrVar.l;
                                    rpiVar3.c(true);
                                    viewA = rbrVar.O.a(viewGroup, view, i4, rbrVar.v);
                                    c = 0;
                                    rpiVar3.c(false);
                                }
                                if (viewA == null) {
                                    if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                                        java.lang.String str6 = rbrVar.m;
                                        java.lang.String strN5 = sqg.n(i4);
                                        java.lang.Object[] objArr5 = new java.lang.Object[2];
                                        objArr5[c] = str6;
                                        objArr5[1] = strN5;
                                        defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onTouchpadMoveEvent Nothing to grant focus to in direction %s", objArr5);
                                    }
                                    rbrVar.p(motionEvent.getX(), motionEvent.getY());
                                    if (rbrVar.v) {
                                    }
                                }
                                if (view == viewA) {
                                    rbrVar.p(motionEvent.getX(), motionEvent.getY());
                                    return rbrVar.h;
                                }
                                if (viewA instanceof rpr) {
                                    z4 = rbrVar.v;
                                    if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                                        defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onTouchpadMoveEvent Found trampoline view %s in direction = %s. windowFocusChangeDisallowedByForceField = %s", rbrVar.m, viewA, sqg.n(i4), java.lang.Boolean.valueOf(z4));
                                    }
                                    if (z4) {
                                        rbrVar.p(motionEvent.getX(), motionEvent.getY());
                                        return rbrVar.h;
                                    }
                                    rbrVar.C(motionEvent, i5, d2, d);
                                    return rbrVar.e(i4);
                                }
                                rbrVar.z();
                                if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                                    defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onTouchpadMoveEvent currentFocus = %s, touchMode = %s, requestFocus(%s, %s) on %s", rbrVar.m, view, java.lang.Boolean.valueOf(viewA.isInTouchMode()), sqg.n(i4), rbrVar.L, viewA);
                                }
                                qumVar2 = rbrVar.X;
                                deque = qumVar2.a;
                                qulVar2 = (qul) deque.peek();
                                if (qulVar2 == null) {
                                    i6 = i5;
                                    d3 = d2;
                                } else {
                                    view4 = (android.view.View) qulVar2.c.get();
                                    i6 = i5;
                                    d3 = d2;
                                    if (!qumVar2.d(qulVar2.b, view4, (android.view.View) qulVar2.d.get())) {
                                        if (qulVar2.a == i4) {
                                            deque.pop();
                                        }
                                        rbrVar.E(viewA, i4, rbrVar.L);
                                        rbrVar.C(motionEvent, i6, d3, d);
                                        if (rbrVar.v) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        rbrVar.v = z3;
                                        return rbrVar.j;
                                    }
                                    deque.clear();
                                }
                                deque.push(new qul(new java.lang.ref.WeakReference(viewA), new java.lang.ref.WeakReference(view), defpackage.qum.a(i4), android.os.SystemClock.elapsedRealtime()));
                                while (deque.size() > qumVar2.c) {
                                    deque.removeLast();
                                }
                                rbrVar.E(viewA, i4, rbrVar.L);
                                rbrVar.C(motionEvent, i6, d3, d);
                                if (rbrVar.v) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                rbrVar.v = z3;
                                return rbrVar.j;
                            }
                        }
                    }
                }
                rbrVar.p(motionEvent.getX(), motionEvent.getY());
                return rbrVar.h;
            }
        }
        return rbrVar.i;
    }

    @Override // defpackage.rpm
    public final android.view.Display e() {
        defpackage.rcw rcwVar = this.i;
        if (rcwVar != null) {
            return rcwVar.a;
        }
        return null;
    }

    @Override // defpackage.rpm
    public final android.view.LayoutInflater f() {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        android.view.LayoutInflater layoutInflater = rbrVar.getLayoutInflater();
        layoutInflater.getClass();
        return layoutInflater;
    }

    @Override // defpackage.rpm
    public final android.view.View g(int i) {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            return rbrVar.findViewById(i);
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.rpm
    public final android.view.Window h() {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            return rbrVar.getWindow();
        }
        return null;
    }

    @Override // defpackage.rpm
    public final defpackage.rbs i() {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        defpackage.rbs rbsVar = rbrVar.R;
        rbsVar.getClass();
        return rbsVar;
    }

    @Override // defpackage.rpm
    public final void j() {
        android.view.Display display;
        java.lang.String str = this.h;
        defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] attach() presentation=%s", str, this.b);
        if (this.b == null) {
            defpackage.rcw rcwVar = this.i;
            if (rcwVar == null || (display = rcwVar.a) == null) {
                throw new java.lang.RuntimeException("createPresentation virtual display is null");
            }
            defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] createPresentation(display=%s)", str, display);
            android.content.Context contextA = this.c.a(display);
            this.j = contextA;
            this.b = defpackage.rbr.h(contextA, display, this.e, str, this.g, this.f);
            this.a.a();
        }
    }

    @Override // defpackage.rpm
    public final void k() {
        defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] detach()", this.h);
        defpackage.rcw rcwVar = this.i;
        if (rcwVar != null) {
            rcwVar.c(null);
        }
    }

    @Override // defpackage.rpm
    public final void l(java.io.PrintWriter printWriter) {
        printWriter.getClass();
        defpackage.rcw rcwVar = this.i;
        if (rcwVar != null) {
            android.view.Surface surfaceA = rcwVar.a();
            java.util.Objects.toString(surfaceA);
            printWriter.println("surface:".concat(java.lang.String.valueOf(surfaceA)));
            android.view.Display display = rcwVar.a;
            java.util.Objects.toString(display);
            printWriter.println("display:".concat(java.lang.String.valueOf(display)));
        }
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            printWriter.println("ProjectedPresentation:");
            printWriter.println("  configurationSet:" + rbrVar.r);
            android.content.res.Resources resources = rbrVar.getResources();
            if (resources != null) {
                printWriter.println("  configuration:".concat(java.lang.String.valueOf(java.lang.String.valueOf(resources.getConfiguration()))));
            }
            printWriter.println("  isShowing:" + rbrVar.isShowing());
            printWriter.println("  attachedToWindow:" + rbrVar.n);
            printWriter.println("  inTouchMode:" + rbrVar.p);
            android.graphics.Rect rect = rbrVar.G;
            printWriter.println("  systemWindowInsets:".concat(java.lang.String.valueOf(java.lang.String.valueOf(rect))));
            printWriter.println("  nonDrawableInsets:".concat(java.lang.String.valueOf(java.lang.String.valueOf(rbrVar.H))));
            android.view.Window window = rbrVar.getWindow();
            printWriter.println("  window:".concat(java.lang.String.valueOf(java.lang.String.valueOf(window))));
            printWriter.println("    hasInputFocus:" + rbrVar.o);
            printWriter.println("    windowHasFocus:" + rbrVar.s);
            printWriter.println("    systemWindowInsets:".concat(java.lang.String.valueOf(java.lang.String.valueOf(rect))));
            if (window != null) {
                printWriter.println("    layout param:".concat(java.lang.String.valueOf(java.lang.String.valueOf(window.getAttributes()))));
                printWriter.println("    flags:" + window.getAttributes().flags);
                printWriter.println("    view hierarchy:");
                android.view.View decorView = window.getDecorView();
                rcu rcuVar = rcu.a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                defpackage.rox.e(decorView, "", sb, rcuVar);
                printWriter.println(sb.toString());
            }
        }
    }

    @Override // defpackage.rpm
    public final void m() {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        if (rbrVar.isShowing()) {
            throw new java.lang.IllegalStateException("Transparency cannot be enabled after the Presentation is shown");
        }
        rbrVar.f().setFormat(-3);
    }

    @Override // defpackage.rpm
    public final void n() {
        defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] hide()", this.h);
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            rbrVar.hide();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rpm
    public final void o(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) {
        char c;
        inputFocusChangedEvent.getClass();
        if (this.b == null) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] onInputFocusChange() presentation is null", this.h);
        }
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            boolean z = inputFocusChangedEvent.b;
            boolean z2 = inputFocusChangedEvent.a;
            if (defpackage.rrx.e("CAR.PROJECTION.PRES", 2)) {
                c = 1;
                defpackage.rrx.d(2, "CAR.PROJECTION.PRES", null, "%s onInputFocusChange(hasFocus:%b, inTouchMode:%b) [hasInputFocus:%b, attachedToWindow:%b]", rbrVar.m, java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(rbrVar.o), java.lang.Boolean.valueOf(rbrVar.n));
            } else {
                c = 1;
            }
            if (rbrVar.o == z2) {
                return;
            }
            rbrVar.o = z2;
            rbrVar.p = (!z2 || z) ? c : 0;
            if (rbrVar.n) {
                android.graphics.Rect rect = inputFocusChangedEvent.d;
                int i = inputFocusChangedEvent.c;
                if (defpackage.omv.c("CAR.PROJECTION.PRES", 3)) {
                    java.lang.String str = rbrVar.m;
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
                    java.lang.String strN = sqg.n(i);
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    objArr[0] = str;
                    objArr[c] = boolValueOf;
                    objArr[2] = strN;
                    objArr[3] = rect;
                    defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s Deferring onInputFocusChange(hasFocus:%s, direction:%s, focusedRect:%s)", objArr);
                }
                rbrVar.M.offer(new rbg(rbrVar, z2, i, rect, 0));
                rbrVar.j(z2, rbrVar.p);
            }
            if (rbrVar.z) {
                rbrVar.u = false;
                rbrVar.o();
            }
        }
    }

    @Override // defpackage.rpm
    public final void p() {
        defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] release()", this.h);
        z();
        defpackage.rcw rcwVar = this.i;
        if (rcwVar != null) {
            rcwVar.b();
        }
        this.i = null;
        this.j = null;
    }

    @Override // defpackage.rpm
    public final void q(android.view.View view) {
        view.getClass();
        defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] setContentView(view=%s)", this.h, view);
        defpackage.rbr rbrVar = this.b;
        if (rbrVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        rbrVar.setContentView(view);
    }

    @Override // defpackage.rpm
    public final void r(android.graphics.Rect rect) {
        rect.getClass();
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            rbrVar.n(rect);
        }
    }

    @Override // defpackage.rpm
    public final void s(boolean z) {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            rbrVar.u(z);
        }
    }

    @Override // defpackage.rpm
    public final void t(boolean z) {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        rbrVar.c = z;
    }

    @Override // defpackage.rpm
    public final void u(android.graphics.Rect rect) {
        rect.getClass();
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            rbrVar.v(rect);
        }
    }

    @Override // defpackage.rpm
    public final void v(android.content.res.Configuration configuration) {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            rbrVar.w(configuration);
        }
    }

    @Override // defpackage.rpm
    public final void w(int i) {
        defpackage.rbr rbrVar = this.b;
        if (rbrVar == null || !rbrVar.z) {
            return;
        }
        defpackage.rpi rpiVar = rbrVar.l;
        rpiVar.e = i;
        if (rpiVar.a != null && rpiVar.b != null && rpiVar.c != null && rpiVar.d != null) {
            rpiVar.d();
        } else if (defpackage.omv.c("CAR.PROJECTION", 3)) {
            defpackage.rrx.a("CAR.PROJECTION", null, "Call to setCarWindowLayoutFlags prior to addTrampolines");
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rpm
    public final void x(com.google.android.gms.car.DrawingSpec drawingSpec) {
        android.graphics.Rect rect;
        java.lang.String str = this.h;
        final int i = 0;
        final int i2 = 1;
        defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] setup(spec=%s)", str, drawingSpec);
        defpackage.rcw rcwVar = this.i;
        if (drawingSpec == null) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] setup setting Surface to null", str);
            if (rcwVar != null) {
                rcwVar.c(null);
                return;
            }
            return;
        }
        if (rcwVar != null) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            rcwVar.a.getMetrics(displayMetrics);
            if (drawingSpec.a == displayMetrics.widthPixels && drawingSpec.b == displayMetrics.heightPixels && drawingSpec.c == displayMetrics.densityDpi) {
                android.view.Surface surface = drawingSpec.d;
                defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] setup setting Surface to %s", str, surface);
                rcwVar.c(surface);
            }
            rect = drawingSpec.e;
            if (rect != null) {
                u(rect);
            }
        }
        rcwVar = null;
        defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] setup creating new VD", str);
        if (rcwVar != null) {
            rcwVar.b();
        }
        z();
        defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] createVirtualDisplay(spec=%s)", str, drawingSpec);
        defpackage.shg shgVar = this.k;
        if (shgVar != null) {
            final java.lang.Object obj = shgVar.b;
            defpackage.rcv rcvVar = new defpackage.rcv() { // from class: san
                @Override // defpackage.rcv
                public final void a(android.view.Surface surface2) {
                    if (i != 0) {
                        surface2.getClass();
                        ((defpackage.rpk) obj).a.b(surface2);
                    } else {
                        try {
                            ((defpackage.sau) obj).i.i();
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                }
            };
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                defpackage.sau sauVar = (defpackage.sau) obj;
                if (sauVar.q && sauVar.d.checkSelfPermission("android.permission.CAPTURE_SECURE_VIDEO_OUTPUT") == 0) {
                    i = 4;
                }
            }
            defpackage.sau sauVar2 = (defpackage.sau) obj;
            com.google.android.gms.car.DrawingSpec drawingSpec2 = (com.google.android.gms.car.DrawingSpec) shgVar.a;
            this.i = new defpackage.rcw((android.hardware.display.DisplayManager) sauVar2.d.getSystemService("display"), sauVar2.a, drawingSpec2.a, drawingSpec2.b, drawingSpec2.c, i, drawingSpec2.d, drawingSpec2.g, rcvVar);
        } else {
            java.lang.Object systemService = this.d.getSystemService("display");
            systemService.getClass();
            this.i = new defpackage.rcw((android.hardware.display.DisplayManager) systemService, str, drawingSpec.a, drawingSpec.b, drawingSpec.c, 0, drawingSpec.d, -1, new defpackage.rcv() { // from class: san
                @Override // defpackage.rcv
                public final void a(android.view.Surface surface2) {
                    if (i2 != 0) {
                        surface2.getClass();
                        ((defpackage.rpk) this).a.b(surface2);
                    } else {
                        try {
                            ((defpackage.sau) this).i.i();
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                }
            });
        }
        rect = drawingSpec.e;
        if (rect != null) {
            u(rect);
        }
    }

    @Override // defpackage.rpm
    public final void y() {
        defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] show()", this.h);
        defpackage.rbr rbrVar = this.b;
        if (rbrVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        rbrVar.show();
    }

    @Override // defpackage.rpm
    public final void z() {
        defpackage.rrx.d(3, "CAR.PROJECTION.PPUIHOST", null, "[%s] stop()", this.h);
        defpackage.rbr rbrVar = this.b;
        if (rbrVar != null) {
            rbrVar.k = false;
            rbrVar.dismiss();
            android.os.HandlerThread handlerThread = rbrVar.S;
            if (handlerThread != null) {
                handlerThread.quit();
                rbrVar.S = null;
            }
            rbrVar.T = null;
            this.a.c();
            this.b = null;
        }
    }
}
