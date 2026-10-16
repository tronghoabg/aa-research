package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ff extends defpackage.er implements android.view.LayoutInflater.Factory2, defpackage.hf {
    private static final defpackage.aba K = new defpackage.aba(0);
    private static final int[] L = {android.R.attr.windowBackground};
    public static final boolean i = !"robolectric".equals(android.os.Build.FINGERPRINT);
    boolean A;
    public defpackage.fd B;
    public boolean C;
    boolean D;
    public int E;
    public boolean F;
    public int G;
    public android.graphics.Rect H;
    public android.graphics.Rect I;
    private java.lang.CharSequence M;
    private fe N;
    private boolean O;
    private android.widget.TextView P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private defpackage.fd[] T;
    private boolean U;
    private boolean V;
    private android.content.res.Configuration W;
    private int X;
    private int Y;
    private boolean Z;
    private fa aa;
    private fa ab;
    private boolean ad;
    private android.support.v7.app.AppCompatViewInflater ae;
    private android.window.OnBackInvokedDispatcher af;
    private android.window.OnBackInvokedCallback ag;
    private fe ah;
    final java.lang.Object j;
    final android.content.Context k;
    public android.view.Window l;
    public defpackage.ex m;
    defpackage.ef n;
    android.view.MenuInflater o;
    public kg p;
    gm q;
    public android.support.v7.widget.ActionBarContextView r;
    public android.widget.PopupWindow s;
    public java.lang.Runnable t;
    android.view.ViewGroup v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;
    public defpackage.erh J = null;
    public boolean u = true;
    private final java.lang.Runnable ac = new defpackage.ap(this, 13, null);

    public ff(android.content.Context context, android.view.Window window, java.lang.Object obj) {
        defpackage.ep epVar = null;
        this.X = -100;
        this.k = context;
        this.j = obj;
        if (obj instanceof android.app.Dialog) {
            while (context != null) {
                if (!(context instanceof defpackage.ep)) {
                    if (!(context instanceof android.content.ContextWrapper)) {
                        break;
                    } else {
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                    }
                } else {
                    epVar = (defpackage.ep) context;
                    break;
                }
            }
            if (epVar != null) {
                this.X = ((defpackage.ff) epVar.p()).X;
            }
        }
        if (this.X == -100) {
            defpackage.aba abaVar = K;
            java.lang.Integer num = (java.lang.Integer) abaVar.get(this.j.getClass().getName());
            if (num != null) {
                this.X = num.intValue();
                abaVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            V(window);
        }
        defpackage.jd.f();
    }

    private final fa T(android.content.Context context) {
        if (this.ab == null) {
            this.ab = new ey(this, context);
        }
        return this.ab;
    }

    private final fa U(android.content.Context context) {
        if (this.aa == null) {
            if (defpackage.ndd.d == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                defpackage.ndd.d = new defpackage.ndd(applicationContext, (android.location.LocationManager) applicationContext.getSystemService("location"));
            }
            this.aa = new fb(this, defpackage.ndd.d);
        }
        return this.aa;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    private final void V(android.view.Window window) {
        if (this.l != null) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        android.view.Window.Callback callback = window.getCallback();
        if (callback instanceof defpackage.ex) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        defpackage.ex exVar = new defpackage.ex(this, callback);
        this.m = exVar;
        window.setCallback(exVar);
        android.content.Context context = this.k;
        defpackage.lam lamVar = new defpackage.lam(context, context.obtainStyledAttributes((android.util.AttributeSet) null, L));
        android.graphics.drawable.Drawable drawableT = lamVar.t(0);
        if (drawableT != null) {
            window.setBackgroundDrawable(drawableT);
        }
        lamVar.w();
        this.l = window;
        if (android.os.Build.VERSION.SDK_INT < 33 || this.af != null) {
            return;
        }
        java.lang.Object obj = this.j;
        if (obj instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) obj;
            if (activity.getWindow() != null) {
                this.af = ag$.ExternalSyntheticApiModelOutline0.m(activity);
            } else {
                this.af = null;
            }
        } else {
            this.af = null;
        }
        J();
    }

    private final void W() {
        if (this.l == null) {
            java.lang.Object obj = this.j;
            if (obj instanceof android.app.Activity) {
                V(((android.app.Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new java.lang.IllegalStateException("We have not been given a Window");
        }
    }

    private final void X() {
        H();
        if (this.w && this.n == null) {
            java.lang.Object obj = this.j;
            if (obj instanceof android.app.Activity) {
                this.n = new defpackage.fs((android.app.Activity) obj, this.x);
            } else if (obj instanceof android.app.Dialog) {
                this.n = new defpackage.fs((android.app.Dialog) obj);
            }
            defpackage.ef efVar = this.n;
            if (efVar != null) {
                efVar.f(this.ad);
            }
        }
    }

    private final void Y(int i2) {
        this.G = (1 << i2) | this.G;
        if (this.F) {
            return;
        }
        android.view.View decorView = this.l.getDecorView();
        java.lang.Runnable runnable = this.ac;
        int[] iArr = defpackage.ebt.a;
        decorView.postOnAnimation(runnable);
        this.F = true;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    private final void Z(defpackage.fd fdVar, android.view.KeyEvent keyEvent) {
        android.view.View view;
        int i2;
        android.view.ViewGroup.LayoutParams layoutParams;
        if (fdVar.m || this.D) {
            return;
        }
        int i3 = fdVar.a;
        if (i3 == 0 && (this.k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        android.view.Window.Callback callbackZ = z();
        if (callbackZ != null && !callbackZ.onMenuOpened(i3, fdVar.h)) {
            E(fdVar, true);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.k.getSystemService("window");
        if (windowManager == null || !N(fdVar, keyEvent)) {
            return;
        }
        android.view.ViewGroup viewGroup = fdVar.e;
        if (viewGroup != null && !fdVar.n) {
            android.view.View view2 = fdVar.g;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
                i2 = -1;
            }
            fdVar.l = false;
            android.view.WindowManager.LayoutParams layoutParams2 = new android.view.WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = fdVar.c;
            layoutParams2.windowAnimations = fdVar.d;
            windowManager.addView(fdVar.e, layoutParams2);
            fdVar.m = true;
            if (i3 == 0) {
                J();
            }
        }
        if (viewGroup == null) {
            android.content.Context contextW = w();
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.res.Resources.Theme themeNewTheme = contextW.getResources().newTheme();
            themeNewTheme.setTo(contextW.getTheme());
            themeNewTheme.resolveAttribute(2130968582, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            themeNewTheme.resolveAttribute(2130970194, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            } else {
                themeNewTheme.applyStyle(2132149886, true);
            }
            defpackage.pl plVar = new defpackage.pl(contextW, 0);
            plVar.getTheme().setTo(themeNewTheme);
            fdVar.j = plVar;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = plVar.obtainStyledAttributes(defpackage.ft.j);
            fdVar.b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            fdVar.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            fdVar.e = new fc(this, fdVar.j);
            fdVar.c = 81;
            if (fdVar.e == null) {
                return;
            }
        } else if (fdVar.n && viewGroup.getChildCount() > 0) {
            fdVar.e.removeAllViews();
        }
        android.view.View view3 = fdVar.g;
        if (view3 == null) {
            defpackage.hh hhVar = fdVar.h;
            if (hhVar != null) {
                fe feVar = this.N;
                if (feVar == null) {
                    feVar = new fe(this, 0);
                    this.N = feVar;
                }
                if (hhVar == null) {
                    view = null;
                } else {
                    if (fdVar.i == null) {
                        fdVar.i = new hd(fdVar.j);
                        defpackage.ht htVar = fdVar.i;
                        ((hd) htVar).e = feVar;
                        fdVar.h.g(htVar);
                    }
                    hd hdVar = fdVar.i;
                    android.view.ViewGroup viewGroup2 = fdVar.e;
                    if (hdVar.d == null) {
                        hdVar.d = hdVar.b.inflate(2131623949, viewGroup2, false);
                        if (hdVar.f == null) {
                            hdVar.f = new hc(hdVar);
                        }
                        hdVar.d.setAdapter(hdVar.f);
                        hdVar.d.setOnItemClickListener(hdVar);
                    }
                    view = hdVar.d;
                }
                fdVar.f = view;
                if (fdVar.f != null) {
                }
            }
            fdVar.n = true;
            return;
        }
        fdVar.f = view3;
        if (fdVar.f != null && (fdVar.g != null || fdVar.i.a().getCount() > 0)) {
            android.view.ViewGroup.LayoutParams layoutParams3 = fdVar.f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new android.view.ViewGroup.LayoutParams(-2, -2);
            }
            fdVar.e.setBackgroundResource(fdVar.b);
            android.view.ViewParent parent = fdVar.f.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(fdVar.f);
            }
            fdVar.e.addView(fdVar.f, layoutParams3);
            if (!fdVar.f.hasFocus()) {
                fdVar.f.requestFocus();
            }
        }
        fdVar.n = true;
        return;
        i2 = -2;
        fdVar.l = false;
        android.view.WindowManager.LayoutParams layoutParams4 = new android.view.WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
        layoutParams4.gravity = fdVar.c;
        layoutParams4.windowAnimations = fdVar.d;
        windowManager.addView(fdVar.e, layoutParams4);
        fdVar.m = true;
        if (i3 == 0) {
            J();
        }
    }

    private final void aa() {
        if (this.O) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    final defpackage.dwh A(android.content.Context context) {
        defpackage.dwh dwhVar;
        defpackage.dwh dwhVarB;
        if (android.os.Build.VERSION.SDK_INT >= 33 || (dwhVar = defpackage.er.c) == null) {
            return null;
        }
        defpackage.dwh dwhVarC = defpackage.dwh.c(a$.ExternalSyntheticApiModelOutline2.m(a$.ExternalSyntheticApiModelOutline2.m(context.getApplicationContext().getResources().getConfiguration())));
        if (dwhVar.f()) {
            dwhVarB = defpackage.dwh.a;
        } else {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int i2 = 0;
            while (i2 < dwhVar.a() + dwhVarC.a()) {
                java.util.Locale localeE = i2 < dwhVar.a() ? dwhVar.e(i2) : dwhVarC.e(i2 - dwhVar.a());
                if (localeE != null) {
                    linkedHashSet.add(localeE);
                }
                i2++;
            }
            dwhVarB = defpackage.dwh.b((java.util.Locale[]) linkedHashSet.toArray(new java.util.Locale[linkedHashSet.size()]));
        }
        return dwhVarB.f() ? dwhVarC : dwhVarB;
    }

    final java.lang.CharSequence B() {
        java.lang.Object obj = this.j;
        return obj instanceof android.app.Activity ? ((android.app.Activity) obj).getTitle() : this.M;
    }

    final void C(int i2, defpackage.fd fdVar, android.view.Menu menu) {
        if (menu == null) {
            menu = fdVar.h;
        }
        if (fdVar.m && !this.D) {
            defpackage.ex exVar = this.m;
            android.view.Window.Callback callback = this.l.getCallback();
            try {
                exVar.b = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                exVar.b = false;
            }
        }
    }

    final void D(defpackage.hh hhVar) {
        if (this.S) {
            return;
        }
        this.S = true;
        this.p.a();
        android.view.Window.Callback callbackZ = z();
        if (callbackZ != null && !this.D) {
            callbackZ.onPanelClosed(108, hhVar);
        }
        this.S = false;
    }

    final void E(defpackage.fd fdVar, boolean z) {
        android.view.ViewGroup viewGroup;
        kg kgVar;
        if (z && fdVar.a == 0 && (kgVar = this.p) != null && kgVar.s()) {
            D(fdVar.h);
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.k.getSystemService("window");
        if (windowManager != null && fdVar.m && (viewGroup = fdVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                C(fdVar.a, fdVar, null);
            }
        }
        fdVar.k = false;
        fdVar.l = false;
        fdVar.m = false;
        fdVar.f = null;
        fdVar.n = true;
        if (this.B == fdVar) {
            this.B = null;
        }
        if (fdVar.a == 0) {
            J();
        }
    }

    public final void F(int i2) {
        defpackage.fd fdVarQ = Q(i2);
        if (fdVarQ.h != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            fdVarQ.h.o(bundle);
            if (bundle.size() > 0) {
                fdVarQ.p = bundle;
            }
            fdVarQ.h.s();
            fdVarQ.h.clear();
        }
        fdVarQ.o = true;
        fdVarQ.n = true;
        if ((i2 == 108 || i2 == 0) && this.p != null) {
            defpackage.fd fdVarQ2 = Q(0);
            fdVarQ2.k = false;
            N(fdVarQ2, null);
        }
    }

    public final void G() {
        defpackage.erh erhVar = this.J;
        if (erhVar != null) {
            erhVar.D();
        }
    }

    public final void H() {
        android.view.ViewGroup viewGroup;
        if (this.O) {
            return;
        }
        android.content.Context plVar = this.k;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = plVar.obtainStyledAttributes(defpackage.ft.j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new java.lang.IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            t(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            t(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            t(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            t(10);
        }
        this.z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        W();
        this.l.getDecorView();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(plVar);
        if (this.A) {
            viewGroup = this.y ? (android.view.ViewGroup) layoutInflaterFrom.inflate(2131623958, (android.view.ViewGroup) null) : (android.view.ViewGroup) layoutInflaterFrom.inflate(2131623957, (android.view.ViewGroup) null);
        } else if (this.z) {
            viewGroup = (android.view.ViewGroup) layoutInflaterFrom.inflate(2131623948, (android.view.ViewGroup) null);
            this.x = false;
            this.w = false;
        } else if (this.w) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            plVar.getTheme().resolveAttribute(2130968589, typedValue, true);
            if (typedValue.resourceId != 0) {
                plVar = new defpackage.pl(plVar, typedValue.resourceId);
            }
            viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(plVar).inflate(2131623959, (android.view.ViewGroup) null);
            kg kgVarFindViewById = viewGroup.findViewById(2131427936);
            this.p = kgVarFindViewById;
            kgVarFindViewById.n(z());
            if (this.x) {
                this.p.c(109);
            }
            if (this.Q) {
                this.p.c(2);
            }
            if (this.R) {
                this.p.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.w + ", windowActionBarOverlay: " + this.x + ", android:windowIsFloating: " + this.z + ", windowActionModeOverlay: " + this.y + ", windowNoTitle: " + this.A + " }");
        }
        defpackage.es esVar = new defpackage.es(this);
        int[] iArr = defpackage.ebt.a;
        defpackage.ebl.e(viewGroup, esVar);
        if (this.p == null) {
            this.P = (android.widget.TextView) viewGroup.findViewById(2131429777);
        }
        try {
            java.lang.reflect.Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        android.support.v7.widget.ContentFrameLayout contentFrameLayout = (android.support.v7.widget.ContentFrameLayout) viewGroup.findViewById(2131427393);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.l.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                android.view.View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            if (viewGroup2 instanceof android.widget.FrameLayout) {
                ((android.widget.FrameLayout) viewGroup2).setForeground(null);
            }
        }
        if (contentFrameLayout != null) {
            contentFrameLayout.setId(android.R.id.content);
        }
        this.l.setContentView(viewGroup);
        if (contentFrameLayout != null) {
            contentFrameLayout.i = new defpackage.izq(this);
        }
        this.v = viewGroup;
        java.lang.CharSequence charSequenceB = B();
        if (!android.text.TextUtils.isEmpty(charSequenceB)) {
            kg kgVar = this.p;
            if (kgVar != null) {
                kgVar.o(charSequenceB);
            } else {
                defpackage.ef efVar = this.n;
                if (efVar != null) {
                    efVar.k(charSequenceB);
                } else {
                    android.widget.TextView textView = this.P;
                    if (textView != null) {
                        textView.setText(charSequenceB);
                    }
                }
            }
        }
        android.support.v7.widget.ContentFrameLayout contentFrameLayout2 = (android.support.v7.widget.ContentFrameLayout) this.v.findViewById(android.R.id.content);
        if (contentFrameLayout2 != null) {
            android.view.View decorView = this.l.getDecorView();
            contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (contentFrameLayout2.isLaidOut()) {
                contentFrameLayout2.requestLayout();
            }
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = this.k.obtainStyledAttributes(defpackage.ft.j);
            if (contentFrameLayout2.b == null) {
                contentFrameLayout2.b = new android.util.TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
            if (contentFrameLayout2.c == null) {
                contentFrameLayout2.c = new android.util.TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
            if (typedArrayObtainStyledAttributes2.hasValue(122)) {
                if (contentFrameLayout2.d == null) {
                    contentFrameLayout2.d = new android.util.TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(123)) {
                if (contentFrameLayout2.e == null) {
                    contentFrameLayout2.e = new android.util.TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(120)) {
                if (contentFrameLayout2.f == null) {
                    contentFrameLayout2.f = new android.util.TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(121)) {
                if (contentFrameLayout2.g == null) {
                    contentFrameLayout2.g = new android.util.TypedValue();
                }
                typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
            }
            typedArrayObtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
        }
        this.O = true;
        defpackage.fd fdVarQ = Q(0);
        if (this.D || fdVarQ.h != null) {
            return;
        }
        Y(108);
    }

    @Override // defpackage.hf
    public final void I(defpackage.hh hhVar) {
        kg kgVar = this.p;
        if (kgVar == null || !kgVar.p() || (android.view.ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.p.r())) {
            defpackage.fd fdVarQ = Q(0);
            fdVarQ.n = true;
            E(fdVarQ, false);
            Z(fdVarQ, null);
            return;
        }
        android.view.Window.Callback callbackZ = z();
        if (this.p.s()) {
            this.p.q();
            if (this.D) {
                return;
            }
            callbackZ.onPanelClosed(108, Q(0).h);
            return;
        }
        if (callbackZ == null || this.D) {
            return;
        }
        if (this.F && (1 & this.G) != 0) {
            android.view.View decorView = this.l.getDecorView();
            java.lang.Runnable runnable = this.ac;
            decorView.removeCallbacks(runnable);
            runnable.run();
        }
        defpackage.fd fdVarQ2 = Q(0);
        defpackage.hh hhVar2 = fdVarQ2.h;
        if (hhVar2 == null || fdVarQ2.o || !callbackZ.onPreparePanel(0, fdVarQ2.g, hhVar2)) {
            return;
        }
        callbackZ.onMenuOpened(108, fdVarQ2.h);
        this.p.u();
    }

    final void J() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            if (this.af == null || (!Q(0).m && this.q == null)) {
                android.window.OnBackInvokedCallback onBackInvokedCallback = this.ag;
                if (onBackInvokedCallback != null) {
                    ag$.ExternalSyntheticApiModelOutline0.m(this.af, onBackInvokedCallback);
                    this.ag = null;
                    return;
                }
                return;
            }
            if (this.ag == null) {
                android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = this.af;
                nh nhVar = new nh(this, 1);
                ag$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcher, 1000000, nhVar);
                this.ag = nhVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    final boolean K(android.view.KeyEvent keyEvent) {
        boolean zQ;
        android.media.AudioManager audioManager;
        java.lang.Object obj = this.j;
        if (((obj instanceof defpackage.eaj) || (obj instanceof defpackage.fh)) && this.l.getDecorView() != null) {
            int[] iArr = defpackage.ebt.a;
        }
        if (keyEvent.getKeyCode() == 82) {
            defpackage.ex exVar = this.m;
            android.view.Window.Callback callback = this.l.getCallback();
            try {
                exVar.a = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                exVar.a = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (java.lang.Throwable th) {
                exVar.a = false;
                throw th;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.U = (keyEvent.getFlags() & 128) != 0;
                return false;
            }
            if (keyCode != 82) {
                return false;
            }
            if (keyEvent.getRepeatCount() == 0) {
                defpackage.fd fdVarQ = Q(0);
                if (fdVarQ.m) {
                    return true;
                }
                N(fdVarQ, keyEvent);
            }
            return true;
        }
        if (keyCode == 4) {
            return L();
        }
        if (keyCode != 82) {
            return false;
        }
        if (this.q != null) {
            return true;
        }
        defpackage.fd fdVarQ2 = Q(0);
        kg kgVar = this.p;
        if (kgVar == null || !kgVar.p() || android.view.ViewConfiguration.get(this.k).hasPermanentMenuKey()) {
            boolean z = fdVarQ2.m;
            if (z || fdVarQ2.l) {
                E(fdVarQ2, true);
                zQ = z;
            } else {
                if (!fdVarQ2.k) {
                    return true;
                }
                if (fdVarQ2.o) {
                    fdVarQ2.k = false;
                    if (!N(fdVarQ2, keyEvent)) {
                        return true;
                    }
                }
                Z(fdVarQ2, keyEvent);
            }
            audioManager = (android.media.AudioManager) this.k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return true;
            }
            android.util.Log.w("AppCompatDelegate", "Couldn't get audio manager");
            return true;
        }
        if (this.p.s()) {
            zQ = this.p.q();
        } else {
            if (this.D || !N(fdVarQ2, keyEvent)) {
                return true;
            }
            zQ = this.p.u();
        }
        if (zQ) {
            audioManager = (android.media.AudioManager) this.k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return true;
            }
            android.util.Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return true;
    }

    public final boolean L() {
        boolean z = this.U;
        this.U = false;
        defpackage.fd fdVarQ = Q(0);
        if (fdVarQ.m) {
            if (!z) {
                E(fdVarQ, true);
            }
            return true;
        }
        gm gmVar = this.q;
        if (gmVar != null) {
            gmVar.f();
            return true;
        }
        defpackage.ef efVarB = b();
        return efVarB != null && efVarB.m();
    }

    @Override // defpackage.hf
    public final boolean M(defpackage.hh hhVar, android.view.MenuItem menuItem) {
        defpackage.fd fdVarY;
        android.view.Window.Callback callbackZ = z();
        if (callbackZ == null || this.D || (fdVarY = y(hhVar.a())) == null) {
            return false;
        }
        return callbackZ.onMenuItemSelected(fdVarY.a, menuItem);
    }

    public final boolean N(defpackage.fd fdVar, android.view.KeyEvent keyEvent) {
        kg kgVar;
        kg kgVar2;
        android.content.res.Resources.Theme themeNewTheme;
        kg kgVar3;
        kg kgVar4;
        if (this.D) {
            return false;
        }
        if (fdVar.k) {
            return true;
        }
        defpackage.fd fdVar2 = this.B;
        if (fdVar2 != null && fdVar2 != fdVar) {
            E(fdVar2, false);
        }
        android.view.Window.Callback callbackZ = z();
        if (callbackZ != null) {
            fdVar.g = callbackZ.onCreatePanelView(fdVar.a);
        }
        int i2 = fdVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (kgVar4 = this.p) != null) {
            kgVar4.m();
        }
        if (fdVar.g == null && (!z || !(this.n instanceof defpackage.fm))) {
            defpackage.hh hhVar = fdVar.h;
            if (hhVar == null || fdVar.o) {
                if (hhVar == null) {
                    android.content.Context context = this.k;
                    if ((i2 == 0 || i2 == 108) && this.p != null) {
                        android.util.TypedValue typedValue = new android.util.TypedValue();
                        android.content.res.Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(2130968589, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(2130968590, typedValue, true);
                        } else {
                            theme.resolveAttribute(2130968590, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            defpackage.pl plVar = new defpackage.pl(context, 0);
                            plVar.getTheme().setTo(themeNewTheme);
                            context = plVar;
                        }
                    }
                    defpackage.hh hhVar2 = new defpackage.hh(context);
                    hhVar2.b = this;
                    fdVar.a(hhVar2);
                    if (fdVar.h == null) {
                        return false;
                    }
                }
                if (z && (kgVar2 = this.p) != null) {
                    if (this.ah == null) {
                        this.ah = new fe(this, 1);
                    }
                    kgVar2.l(fdVar.h, this.ah);
                }
                fdVar.h.s();
                if (!callbackZ.onCreatePanelMenu(i2, fdVar.h)) {
                    fdVar.a(null);
                    if (z && (kgVar = this.p) != null) {
                        kgVar.l((android.view.Menu) null, this.ah);
                    }
                    return false;
                }
                fdVar.o = false;
            }
            fdVar.h.s();
            android.os.Bundle bundle = fdVar.p;
            if (bundle != null) {
                fdVar.h.n(bundle);
                fdVar.p = null;
            }
            if (!callbackZ.onPreparePanel(0, fdVar.g, fdVar.h)) {
                if (z && (kgVar3 = this.p) != null) {
                    kgVar3.l((android.view.Menu) null, this.ah);
                }
                fdVar.h.r();
                return false;
            }
            fdVar.h.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            fdVar.h.r();
        }
        fdVar.k = true;
        fdVar.l = false;
        this.B = fdVar;
        return true;
    }

    public final boolean O() {
        android.view.ViewGroup viewGroup;
        return this.O && (viewGroup = this.v) != null && viewGroup.isLaidOut();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v7.app.AppCompatViewInflater] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.support.v7.app.AppCompatViewInflater] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.support.v7.app.AppCompatViewInflater] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final android.view.View P(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View jlVar;
        android.support.v7.app.AppCompatViewInflater appCompatViewInflater = this.ae;
        android.view.View view = null;
        ?? r0 = appCompatViewInflater;
        if (appCompatViewInflater == null) {
            android.content.Context context2 = this.k;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(defpackage.ft.j);
            java.lang.String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                android.support.v7.app.AppCompatViewInflater appCompatViewInflater2 = new android.support.v7.app.AppCompatViewInflater();
                this.ae = appCompatViewInflater2;
                r0 = appCompatViewInflater2;
            } else {
                try {
                    android.support.v7.app.AppCompatViewInflater appCompatViewInflater3 = (android.support.v7.app.AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.ae = appCompatViewInflater3;
                    r0 = appCompatViewInflater3;
                } catch (java.lang.Throwable th) {
                    android.util.Log.i("AppCompatDelegate", defpackage.a.bp(string, "Failed to instantiate custom view inflater ", ". Falling back to default."), th);
                    android.support.v7.app.AppCompatViewInflater appCompatViewInflater4 = new android.support.v7.app.AppCompatViewInflater();
                    this.ae = appCompatViewInflater4;
                    r0 = appCompatViewInflater4;
                }
            }
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, defpackage.ft.z, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            android.util.Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        android.content.Context plVar = (resourceId == 0 || ((context instanceof defpackage.pl) && ((defpackage.pl) context).a == resourceId)) ? context : new defpackage.pl(context, resourceId);
        switch (str) {
            case "RatingBar":
                jlVar = new jl(plVar, attributeSet);
                break;
            case "CheckedTextView":
                jlVar = new ja(plVar, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                jlVar = new jh(plVar, attributeSet);
                break;
            case "TextView":
                jlVar = r0.e(plVar, attributeSet);
                break;
            case "ImageButton":
                jlVar = new defpackage.jf(plVar, attributeSet);
                break;
            case "SeekBar":
                jlVar = new jm(plVar, attributeSet);
                break;
            case "Spinner":
                jlVar = new android.support.v7.widget.AppCompatSpinner(plVar, attributeSet);
                break;
            case "RadioButton":
                jlVar = r0.d(plVar, attributeSet);
                break;
            case "ToggleButton":
                jlVar = new kd(plVar, attributeSet);
                break;
            case "ImageView":
                jlVar = new defpackage.jg(plVar, attributeSet);
                break;
            case "AutoCompleteTextView":
                jlVar = r0.a(plVar, attributeSet);
                break;
            case "CheckBox":
                jlVar = r0.c(plVar, attributeSet);
                break;
            case "EditText":
                jlVar = new defpackage.je(plVar, attributeSet);
                break;
            case "Button":
                jlVar = r0.b(plVar, attributeSet);
                break;
            default:
                jlVar = null;
                break;
        }
        if (jlVar == null && context != plVar) {
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                java.lang.Object[] objArr = r0.f;
                objArr[0] = plVar;
                objArr[1] = attributeSet;
                if (str.indexOf(46) == -1) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < 3) {
                            android.view.View viewF = r0.f(plVar, str, android.support.v7.app.AppCompatViewInflater.e[i2]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view = viewF;
                                r0 = r0;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                            r0 = r0;
                        }
                    }
                } else {
                    android.view.View viewF2 = r0.f(plVar, str, null);
                    java.lang.Object[] objArr2 = r0.f;
                    objArr2[0] = null;
                    objArr2[1] = null;
                    view = viewF2;
                    r0 = objArr2;
                }
            } catch (java.lang.Exception unused) {
                java.lang.Object[] objArr3 = r0.f;
                objArr3[0] = view;
                objArr3[1] = view;
            } catch (java.lang.Throwable th2) {
                java.lang.Object[] objArr4 = r0.f;
                objArr4[0] = view;
                objArr4[1] = view;
                throw th2;
            }
            jlVar = view;
        }
        if (jlVar != null) {
            android.content.Context context3 = jlVar.getContext();
            if ((context3 instanceof android.content.ContextWrapper) && jlVar.hasOnClickListeners()) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, android.support.v7.app.AppCompatViewInflater.a);
                java.lang.String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    jlVar.setOnClickListener(new fj(jlVar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes4 = plVar.obtainStyledAttributes(attributeSet, android.support.v7.app.AppCompatViewInflater.b);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    defpackage.ebt.o(jlVar, typedArrayObtainStyledAttributes4.getBoolean(0, false));
                }
                typedArrayObtainStyledAttributes4.recycle();
                android.content.res.TypedArray typedArrayObtainStyledAttributes5 = plVar.obtainStyledAttributes(attributeSet, android.support.v7.app.AppCompatViewInflater.c);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    defpackage.ebt.p(jlVar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                android.content.res.TypedArray typedArrayObtainStyledAttributes6 = plVar.obtainStyledAttributes(attributeSet, android.support.v7.app.AppCompatViewInflater.d);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    int[] iArr = defpackage.ebt.a;
                    new ebd(java.lang.Boolean.class).e(jlVar, java.lang.Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return jlVar;
    }

    public final defpackage.fd Q(int i2) {
        defpackage.fd[] fdVarArr = this.T;
        if (fdVarArr == null || fdVarArr.length <= i2) {
            defpackage.fd[] fdVarArr2 = new defpackage.fd[i2 + 1];
            if (fdVarArr != null) {
                java.lang.System.arraycopy(fdVarArr, 0, fdVarArr2, 0, fdVarArr.length);
            }
            this.T = fdVarArr2;
            fdVarArr = fdVarArr2;
        }
        defpackage.fd fdVar = fdVarArr[i2];
        if (fdVar != null) {
            return fdVar;
        }
        defpackage.fd fdVar2 = new defpackage.fd(i2);
        fdVarArr[i2] = fdVar2;
        return fdVar2;
    }

    public final boolean R(defpackage.fd fdVar, int i2, android.view.KeyEvent keyEvent) {
        defpackage.hh hhVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((fdVar.k || N(fdVar, keyEvent)) && (hhVar = fdVar.h) != null) {
            return hhVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0190  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void S(boolean z, boolean z2) {
        int i2;
        fa faVar;
        fa faVar2;
        if (this.D) {
            return;
        }
        int iU = u();
        android.content.Context context = this.k;
        int iV = v(context, iU);
        defpackage.dwh dwhVarA = android.os.Build.VERSION.SDK_INT < 33 ? A(context) : null;
        if (!z2 && dwhVarA != null) {
            dwhVarA = defpackage.dwh.c(a$.ExternalSyntheticApiModelOutline2.m(a$.ExternalSyntheticApiModelOutline2.m(context.getResources().getConfiguration())));
        }
        defpackage.dwh dwhVar = dwhVarA;
        android.content.res.Configuration configurationX = x(context, iV, dwhVar, null, false);
        boolean z3 = false;
        if (this.Z) {
            this.Z = true;
            i2 = this.Y;
        } else {
            java.lang.Object obj = this.j;
            if (obj instanceof android.app.Activity) {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    i2 = 0;
                } else {
                    try {
                        android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(new android.content.ComponentName(context, obj.getClass()), android.os.Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                        if (activityInfo != null) {
                            this.Y = activityInfo.configChanges;
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                        android.util.Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                        this.Y = 0;
                    }
                    this.Z = true;
                    i2 = this.Y;
                }
            } else {
                this.Z = true;
                i2 = this.Y;
            }
        }
        android.content.res.Configuration configuration = this.W;
        if (configuration == null) {
            configuration = this.k.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = configurationX.uiMode & 48;
        defpackage.dwh dwhVarC = defpackage.dwh.c(a$.ExternalSyntheticApiModelOutline2.m(a$.ExternalSyntheticApiModelOutline2.m(configuration)));
        defpackage.dwh dwhVarC2 = dwhVar == null ? null : defpackage.dwh.c(a$.ExternalSyntheticApiModelOutline2.m(a$.ExternalSyntheticApiModelOutline2.m(configurationX)));
        int i5 = i3 != i4 ? 512 : 0;
        if (dwhVarC2 != null && !dwhVarC.equals(dwhVarC2)) {
            i5 |= 8196;
        }
        if (((~i2) & i5) != 0 && z && this.C && (i || this.V)) {
            java.lang.Object obj2 = this.j;
            if (obj2 instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) obj2;
                if (!activity.isChild()) {
                    if (android.os.Build.VERSION.SDK_INT >= 31 && (i5 & 8192) != 0) {
                        activity.getWindow().getDecorView().setLayoutDirection(configurationX.getLayoutDirection());
                    }
                    activity.recreate();
                    z3 = true;
                }
            }
        }
        if (z3 || i5 == 0) {
            if (z3) {
            }
            if (dwhVarC2 != null) {
                a$.ExternalSyntheticApiModelOutline2.m(a$.ExternalSyntheticApiModelOutline2.m(defpackage.dwh.c(a$.ExternalSyntheticApiModelOutline2.m(a$.ExternalSyntheticApiModelOutline2.m(this.k.getResources().getConfiguration()))).d()));
            }
            if (iU == 0) {
                U(this.k).d();
            } else {
                faVar = this.aa;
                if (faVar != null) {
                    faVar.c();
                }
                if (iU == 3) {
                    T(this.k).d();
                    return;
                }
            }
            faVar2 = this.ab;
            if (faVar2 != null) {
                faVar2.c();
            }
        }
        int i6 = i5 & i2;
        android.content.Context context2 = this.k;
        android.content.res.Resources resources = context2.getResources();
        android.content.res.Configuration configuration2 = new android.content.res.Configuration(resources.getConfiguration());
        configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i4;
        if (dwhVarC2 != null) {
            defpackage.ca.f(configuration2, dwhVarC2);
        }
        resources.updateConfiguration(configuration2, null);
        int i7 = this.E;
        if (i7 != 0) {
            context2.setTheme(i7);
            context2.getTheme().applyStyle(this.E, true);
        }
        if (i6 == i5) {
            java.lang.Object obj3 = this.j;
            if (obj3 instanceof android.app.Activity) {
                android.app.Activity activity2 = (android.app.Activity) obj3;
                if (activity2 instanceof defpackage.eqg) {
                    if (((defpackage.eqg) activity2).getLifecycle().a().a(defpackage.epx.c)) {
                        activity2.onConfigurationChanged(configuration2);
                        this.l.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                } else if (this.V && !this.D) {
                    activity2.onConfigurationChanged(configuration2);
                    this.l.getDecorView().dispatchConfigurationChanged(configuration2);
                }
            }
        }
        java.lang.Object obj4 = this.j;
        if (obj4 instanceof defpackage.ep) {
            if ((i5 & 512) != 0) {
            }
            if ((i5 & 4) != 0) {
            }
        }
        if (dwhVarC2 != null) {
            a$.ExternalSyntheticApiModelOutline2.m(a$.ExternalSyntheticApiModelOutline2.m(defpackage.dwh.c(a$.ExternalSyntheticApiModelOutline2.m(a$.ExternalSyntheticApiModelOutline2.m(this.k.getResources().getConfiguration()))).d()));
        }
        if (iU == 0) {
            U(this.k).d();
        } else {
            faVar = this.aa;
            if (faVar != null) {
                faVar.c();
            }
            if (iU == 3) {
                T(this.k).d();
                return;
            }
        }
        faVar2 = this.ab;
        if (faVar2 != null) {
            faVar2.c();
        }
    }

    @Override // defpackage.er
    public final android.content.Context a() {
        return this.k;
    }

    @Override // defpackage.er
    public final defpackage.ef b() {
        X();
        return this.n;
    }

    @Override // defpackage.er
    public final android.view.MenuInflater c() {
        if (this.o == null) {
            X();
            defpackage.ef efVar = this.n;
            this.o = new defpackage.gs(efVar != null ? efVar.b() : this.k);
        }
        return this.o;
    }

    @Override // defpackage.er
    public final android.view.View d(int i2) {
        H();
        return this.l.findViewById(i2);
    }

    @Override // defpackage.er
    public final void e(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        H();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.v.findViewById(android.R.id.content);
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.er
    public final void f() {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof defpackage.ff) {
                return;
            }
            android.util.Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.er
    public final void g() {
        if (this.n == null || b().n()) {
            return;
        }
        Y(0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    @Override // defpackage.er
    public final void h() {
        if (this.j instanceof android.app.Activity) {
            synchronized (defpackage.er.g) {
                defpackage.er.k(this);
            }
        }
        if (this.F) {
            this.l.getDecorView().removeCallbacks(this.ac);
        }
        this.D = true;
        if (this.X != -100) {
            java.lang.Object obj = this.j;
            if ((obj instanceof android.app.Activity) && ((android.app.Activity) obj).isChangingConfigurations()) {
                K.put(obj.getClass().getName(), java.lang.Integer.valueOf(this.X));
            } else {
                K.remove(this.j.getClass().getName());
            }
        } else {
            K.remove(this.j.getClass().getName());
        }
        defpackage.ef efVar = this.n;
        if (efVar != null) {
            efVar.e();
        }
        fa faVar = this.aa;
        if (faVar != null) {
            faVar.c();
        }
        fa faVar2 = this.ab;
        if (faVar2 != null) {
            faVar2.c();
        }
    }

    @Override // defpackage.er
    public final void i() {
        defpackage.ef efVarB = b();
        if (efVarB != null) {
            efVarB.h(true);
        }
    }

    @Override // defpackage.er
    public final void j() {
        defpackage.ef efVarB = b();
        if (efVarB != null) {
            efVarB.h(false);
        }
    }

    @Override // defpackage.er
    public final void l(int i2) {
        H();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.v.findViewById(android.R.id.content);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            android.view.LayoutInflater.from(this.k).inflate(i2, viewGroup);
        }
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.er
    public final void m(android.view.View view) {
        H();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.v.findViewById(android.R.id.content);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.er
    public final void n(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        H();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.v.findViewById(android.R.id.content);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(view, layoutParams);
        }
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.er
    public final void o(java.lang.CharSequence charSequence) {
        this.M = charSequence;
        kg kgVar = this.p;
        if (kgVar != null) {
            kgVar.o(charSequence);
            return;
        }
        defpackage.ef efVar = this.n;
        if (efVar != null) {
            efVar.k(charSequence);
            return;
        }
        android.widget.TextView textView = this.P;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return P(str, context, attributeSet);
    }

    @Override // defpackage.er
    public final void q() {
        S(true, true);
    }

    @Override // defpackage.er
    public final void r() {
        java.lang.String strL;
        this.C = true;
        S(false, true);
        W();
        java.lang.Object obj = this.j;
        if (obj instanceof android.app.Activity) {
            try {
                android.app.Activity activity = (android.app.Activity) obj;
                try {
                    strL = defpackage.dlv.l(activity, activity.getComponentName());
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new java.lang.IllegalArgumentException(e);
                }
            } catch (java.lang.IllegalArgumentException unused) {
                strL = null;
            }
            if (strL != null) {
                defpackage.ef efVar = this.n;
                if (efVar == null) {
                    this.ad = true;
                } else {
                    efVar.f(true);
                }
            }
            synchronized (defpackage.er.g) {
                defpackage.er.k(this);
                defpackage.er.f.add(new java.lang.ref.WeakReference(this));
            }
        }
        this.W = new android.content.res.Configuration(this.k.getResources().getConfiguration());
        this.V = true;
    }

    @Override // defpackage.er
    public final void s() {
        defpackage.ef efVarB;
        if (this.w && this.O && (efVarB = b()) != null) {
            efVarB.r();
        }
        android.content.Context context = this.k;
        defpackage.jd.d().e(context);
        this.W = new android.content.res.Configuration(context.getResources().getConfiguration());
        S(false, false);
    }

    @Override // defpackage.er
    public final void t(int i2) {
        if (i2 == 8) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.A && i2 == 108) {
            return;
        }
        if (this.w && i2 == 1) {
            this.w = false;
        }
        if (i2 == 1) {
            aa();
            this.A = true;
            return;
        }
        if (i2 == 2) {
            aa();
            this.Q = true;
            return;
        }
        if (i2 == 5) {
            aa();
            this.R = true;
            return;
        }
        if (i2 == 10) {
            aa();
            this.y = true;
        } else if (i2 == 108) {
            aa();
            this.w = true;
        } else if (i2 != 109) {
            this.l.requestFeature(i2);
        } else {
            aa();
            this.x = true;
        }
    }

    public final int u() {
        int i2 = this.X;
        return i2 != -100 ? i2 : defpackage.er.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    final int v(android.content.Context context, int i2) {
        long j;
        ?? r0;
        boolean z;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                defpackage.ndd nddVar = U(context).b;
                fo foVar = (fo) nddVar.b;
                if (foVar.b <= java.lang.System.currentTimeMillis()) {
                    android.content.Context context2 = (android.content.Context) nddVar.a;
                    android.location.Location locationL = defpackage.dmh.F(context2, "android.permission.ACCESS_COARSE_LOCATION", android.os.Process.myPid(), android.os.Process.myUid(), context2.getPackageName()) == 0 ? nddVar.L("network") : null;
                    android.location.Location locationL2 = defpackage.dmh.F(context2, "android.permission.ACCESS_FINE_LOCATION", android.os.Process.myPid(), android.os.Process.myUid(), context2.getPackageName()) == 0 ? nddVar.L("gps") : null;
                    if (locationL2 == null || locationL == null ? locationL2 != null : locationL2.getTime() > locationL.getTime()) {
                        locationL = locationL2;
                    }
                    if (locationL != null) {
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        if (fn.a == null) {
                            fn.a = new fn();
                        }
                        fn fnVar = fn.a;
                        fnVar.a(jCurrentTimeMillis - 86400000, locationL.getLatitude(), locationL.getLongitude());
                        fnVar.a(jCurrentTimeMillis, locationL.getLatitude(), locationL.getLongitude());
                        int i3 = fnVar.d;
                        long j2 = fnVar.c;
                        long j3 = fnVar.b;
                        fnVar.a(jCurrentTimeMillis + 86400000, locationL.getLatitude(), locationL.getLongitude());
                        long j4 = fnVar.c;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        foVar.a = 1 == i3;
                        foVar.b = j;
                        r0 = i3;
                    } else {
                        android.util.Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i4 = java.util.Calendar.getInstance().get(11);
                        if (i4 >= 6 && i4 < 22) {
                            return 1;
                        }
                    }
                    r0 = z;
                    return 2;
                }
                z = foVar.a;
                if (r0 == 0) {
                    r0 = z;
                    return 1;
                }
                r0 = z;
                return 2;
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return T(context).a.isPowerSaveMode() ? 2 : 1;
                }
                throw new java.lang.IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    final android.content.Context w() {
        defpackage.ef efVarB = b();
        android.content.Context contextB = efVarB != null ? efVarB.b() : null;
        return contextB == null ? this.k : contextB;
    }

    public final android.content.res.Configuration x(android.content.Context context, int i2, defpackage.dwh dwhVar, android.content.res.Configuration configuration, boolean z) {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else if (i2 != 2) {
            i3 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i3 = 32;
        }
        android.content.res.Configuration configuration2 = new android.content.res.Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (dwhVar != null) {
            defpackage.ca.f(configuration2, dwhVar);
        }
        return configuration2;
    }

    final defpackage.fd y(android.view.Menu menu) {
        defpackage.fd[] fdVarArr = this.T;
        int length = fdVarArr != null ? fdVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            defpackage.fd fdVar = fdVarArr[i2];
            if (fdVar != null && fdVar.h == menu) {
                return fdVar;
            }
        }
        return null;
    }

    final android.view.Window.Callback z() {
        return this.l.getCallback();
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return P(str, context, attributeSet);
    }
}
