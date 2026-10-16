package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class ecu extends defpackage.edc {
    private static boolean g = false;
    private static java.lang.reflect.Method h;
    private static java.lang.Class k;
    private static java.lang.reflect.Field l;
    private static java.lang.reflect.Field m;
    final android.view.WindowInsets a;
    defpackage.dvl b;
    int c;
    defpackage.eai d;
    int e;
    int f;
    private defpackage.dvl[] n;
    private defpackage.dvl o;
    private defpackage.edf p;
    private android.graphics.Rect[][] q;
    private android.graphics.Rect[][] r;

    public ecu(defpackage.edf edfVar, android.view.WindowInsets windowInsets) {
        super(edfVar);
        this.o = null;
        this.q = new android.graphics.Rect[10][];
        this.r = new android.graphics.Rect[10][];
        this.a = windowInsets;
    }

    private defpackage.dvl G(int i, boolean z) {
        defpackage.dvl dvlVarB = defpackage.dvl.a;
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                dvlVarB = defpackage.dvl.b(dvlVarB, b(i2, z));
            }
        }
        return dvlVarB;
    }

    private defpackage.dvl H() {
        defpackage.edf edfVar = this.p;
        return edfVar != null ? edfVar.h() : defpackage.dvl.a;
    }

    private defpackage.dvl I(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!g) {
            L();
        }
        java.lang.reflect.Method method = h;
        if (method != null && k != null && l != null) {
            try {
                java.lang.Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new java.lang.NullPointerException());
                    return null;
                }
                android.graphics.Rect rect = (android.graphics.Rect) l.get(m.get(objInvoke));
                if (rect != null) {
                    return defpackage.dvl.d(rect);
                }
                return null;
            } catch (java.lang.ReflectiveOperationException e) {
                android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(java.lang.String.valueOf(e.getMessage())), e);
            }
        }
        return null;
    }

    private defpackage.eai J(android.view.View view) {
        android.view.Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        android.graphics.Point point = new android.graphics.Point();
        display.getRealSize(point);
        if (this.j.b.s()) {
            int i = point.x;
            int i2 = point.y;
            return new defpackage.eai(defpackage.eai.a(i, i2, true, 0, 0, 0, 0), i, i2);
        }
        defpackage.eas easVarM = defpackage.ebl.m(display, 0);
        defpackage.eas easVarM2 = defpackage.ebl.m(display, 1);
        defpackage.eas easVarM3 = defpackage.ebl.m(display, 2);
        defpackage.eas easVarM4 = defpackage.ebl.m(display, 3);
        int i3 = point.x;
        int i4 = point.y;
        return new defpackage.eai(defpackage.eai.a(i3, i4, false, easVarM != null ? easVarM.a : 0, easVarM2 != null ? easVarM2.a : 0, easVarM3 != null ? easVarM3.a : 0, easVarM4 != null ? easVarM4.a : 0), i3, i4);
    }

    private static java.util.List<android.graphics.Rect> K(android.graphics.Rect[][] rectArr, int i) {
        android.graphics.Rect[] rectArr2;
        android.graphics.Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[defpackage.ebq.c(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    int length = rectArr3.length;
                    int length2 = rectArr2.length;
                    android.graphics.Rect[] rectArr4 = new android.graphics.Rect[length + length2];
                    java.lang.System.arraycopy(rectArr3, 0, rectArr4, 0, length);
                    java.lang.System.arraycopy(rectArr2, 0, rectArr4, length, length2);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? java.util.Collections.EMPTY_LIST : java.util.Arrays.asList(rectArr3);
    }

    private static void L() {
        try {
            h = android.view.View.class.getDeclaredMethod("getViewRootImpl", null);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (java.lang.ReflectiveOperationException e) {
            android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(java.lang.String.valueOf(e.getMessage())), e);
        }
        g = true;
    }

    private android.graphics.Rect[] M(defpackage.dvl dvlVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = dvlVar.b;
        if (i != 0) {
            arrayList.add(new android.graphics.Rect(0, 0, i, this.e));
        }
        int i2 = dvlVar.c;
        if (i2 != 0) {
            arrayList.add(new android.graphics.Rect(0, 0, this.f, i2));
        }
        int i3 = dvlVar.d;
        if (i3 != 0) {
            int i4 = this.f;
            arrayList.add(new android.graphics.Rect(i4 - i3, 0, i4, this.e));
        }
        int i5 = dvlVar.e;
        if (i5 != 0) {
            int i6 = this.e;
            arrayList.add(new android.graphics.Rect(0, i6 - i5, this.f, i6));
        }
        return (android.graphics.Rect[]) arrayList.toArray(new android.graphics.Rect[arrayList.size()]);
    }

    static boolean v(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.edc
    public defpackage.dvl a(int i) {
        return G(i, false);
    }

    protected defpackage.dvl b(int i, boolean z) {
        defpackage.dvl dvlVarH;
        defpackage.dvl dvlVar;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    defpackage.dvl[] dvlVarArr = this.n;
                    dvlVarH = dvlVarArr != null ? dvlVarArr[defpackage.ebq.c(8)] : null;
                    if (dvlVarH != null) {
                        return dvlVarH;
                    }
                    defpackage.dvl dvlVarD = d();
                    defpackage.dvl dvlVarH2 = H();
                    int i2 = dvlVarD.e;
                    int i3 = dvlVarH2.e;
                    if (i2 > i3 || ((dvlVar = this.b) != null && !dvlVar.equals(defpackage.dvl.a) && (i2 = this.b.e) > i3)) {
                        return defpackage.dvl.e(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return E();
                    }
                    if (i == 32) {
                        return D();
                    }
                    if (i == 64) {
                        return F();
                    }
                    if (i == 128) {
                        defpackage.edf edfVar = this.p;
                        defpackage.eag eagVarK = edfVar != null ? edfVar.k() : B();
                        if (eagVarK != null) {
                            android.view.DisplayCutout displayCutout = eagVarK.a;
                            return defpackage.dvl.e(hh$.ExternalSyntheticApiModelOutline0.m$1(displayCutout), hh$.ExternalSyntheticApiModelOutline0.m$2(displayCutout), hh$.ExternalSyntheticApiModelOutline0.m$3(displayCutout), hh$.ExternalSyntheticApiModelOutline0.m$4(displayCutout));
                        }
                    }
                }
            } else {
                if (z) {
                    defpackage.dvl dvlVarH3 = H();
                    defpackage.dvl dvlVarW = w();
                    return defpackage.dvl.e(java.lang.Math.max(dvlVarH3.b, dvlVarW.b), 0, java.lang.Math.max(dvlVarH3.d, dvlVarW.d), java.lang.Math.max(dvlVarH3.e, dvlVarW.e));
                }
                if ((this.c & 2) == 0) {
                    defpackage.dvl dvlVarD2 = d();
                    defpackage.edf edfVar2 = this.p;
                    dvlVarH = edfVar2 != null ? edfVar2.h() : null;
                    int iMin = dvlVarD2.e;
                    if (dvlVarH != null) {
                        iMin = java.lang.Math.min(iMin, dvlVarH.e);
                    }
                    return defpackage.dvl.e(dvlVarD2.b, 0, dvlVarD2.d, iMin);
                }
            }
        } else {
            if (z) {
                return defpackage.dvl.e(0, java.lang.Math.max(H().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return defpackage.dvl.e(0, d().c, 0, 0);
            }
        }
        return defpackage.dvl.a;
    }

    @Override // defpackage.edc
    public defpackage.dvl c(int i) {
        return G(i, true);
    }

    @Override // defpackage.edc
    public final defpackage.dvl d() {
        defpackage.dvl dvlVar = this.o;
        if (dvlVar != null) {
            return dvlVar;
        }
        android.view.WindowInsets windowInsets = this.a;
        defpackage.dvl dvlVarE = defpackage.dvl.e(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.o = dvlVarE;
        return dvlVarE;
    }

    @Override // defpackage.edc
    public defpackage.edf e(int i, int i2, int i3, int i4) {
        ecs ecnVar;
        defpackage.edf edfVarQ = defpackage.edf.q(this.a, null);
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            ecnVar = new ecs(edfVarQ);
        } else if (android.os.Build.VERSION.SDK_INT >= 35) {
            ecnVar = new ecr(edfVarQ);
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            ecnVar = new ecq(edfVarQ);
        } else if (android.os.Build.VERSION.SDK_INT >= 31) {
            ecnVar = new defpackage.ecp(edfVarQ);
        } else if (android.os.Build.VERSION.SDK_INT >= 30) {
            ecnVar = new defpackage.eco(edfVarQ);
        } else {
            ecnVar = android.os.Build.VERSION.SDK_INT >= 29 ? new defpackage.ecn(edfVarQ) : new ecm(edfVarQ);
        }
        ecnVar.c(defpackage.edf.j(d(), i, i2, i3, i4));
        ecnVar.b(defpackage.edf.j(w(), i, i2, i3, i4));
        return ecnVar.a();
    }

    @Override // defpackage.edc
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        defpackage.ecu ecuVar = (defpackage.ecu) obj;
        return j$.util.Objects.equals(this.b, ecuVar.b) && v(this.c, ecuVar.c);
    }

    @Override // defpackage.edc
    public java.util.List<android.graphics.Rect> f(int i) {
        return K(this.q, i);
    }

    @Override // defpackage.edc
    public java.util.List<android.graphics.Rect> g(int i) {
        return K(this.r, i);
    }

    @Override // defpackage.edc
    public void h(android.view.View view) {
        this.f = view.getWidth();
        this.e = view.getHeight();
        defpackage.dvl dvlVarI = I(view);
        if (dvlVarI == null) {
            dvlVarI = defpackage.dvl.a;
        }
        n(dvlVarI);
    }

    @Override // defpackage.edc
    public void i(defpackage.edf edfVar) {
        edfVar.u(this.p);
        edfVar.b.n(this.b);
        edfVar.v(this.c);
        edfVar.s(this.d);
        edfVar.w(this.q);
        edfVar.x(this.r);
    }

    @Override // defpackage.edc
    public void j(android.view.View view) {
        this.d = J(view);
    }

    @Override // defpackage.edc
    public void k() {
        for (int i = 1; i <= 512; i += i) {
            int iC = defpackage.ebq.c(i);
            this.q[iC] = M(a(i));
            if (i != 8) {
                this.r[iC] = M(c(i));
            }
        }
    }

    @Override // defpackage.edc
    public void l(defpackage.eai eaiVar) {
        this.d = eaiVar;
    }

    @Override // defpackage.edc
    public void m(defpackage.dvl[] dvlVarArr) {
        this.n = dvlVarArr;
    }

    @Override // defpackage.edc
    public void n(defpackage.dvl dvlVar) {
        this.b = dvlVar;
    }

    @Override // defpackage.edc
    public void o(defpackage.edf edfVar) {
        this.p = edfVar;
    }

    @Override // defpackage.edc
    public void p(int i) {
        this.c = i;
    }

    @Override // defpackage.edc
    public void q(android.graphics.Rect[][] rectArr) {
        rectArr.getClass();
        this.q = (android.graphics.Rect[][]) rectArr.clone();
    }

    @Override // defpackage.edc
    public void r(android.graphics.Rect[][] rectArr) {
        rectArr.getClass();
        this.r = (android.graphics.Rect[][]) rectArr.clone();
    }

    @Override // defpackage.edc
    public boolean s() {
        return this.a.isRound();
    }

    protected boolean t(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !b(i, false).equals(defpackage.dvl.a);
    }

    @Override // defpackage.edc
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0 && !t(i2)) {
                return false;
            }
        }
        return true;
    }

    public ecu(defpackage.edf edfVar, defpackage.ecu ecuVar) {
        this(edfVar, new android.view.WindowInsets(ecuVar.a));
    }
}
