package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hll implements defpackage.hlu {
    private int b;
    public final defpackage.gfa i;
    public androidx.car.app.model.TemplateWrapper k;
    public android.view.View l;
    public defpackage.hll m;
    public android.view.View n;
    public final defpackage.gzl o;
    private int ss;
    private j$.util.Optional c = j$.util.Optional.empty();
    private android.graphics.Rect d = new android.graphics.Rect();
    private final android.view.ViewTreeObserver.OnTouchModeChangeListener e = new defpackage.rcr(this, 1);
    private final android.view.ViewTreeObserver.OnGlobalFocusChangeListener f = new defpackage.hlk(this, 0);
    public final defpackage.eqi j = new defpackage.eqi(this, true);

    public hll(defpackage.gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, defpackage.gzl gzlVar) {
        this.i = gfaVar;
        this.k = androidx.car.app.model.TemplateWrapper.copyOf(templateWrapper);
        this.o = gzlVar;
    }

    protected static boolean I(android.view.View view, android.view.View view2, boolean z) {
        if (view == null || view2 == null) {
            return false;
        }
        return J(defpackage.ygw.q(view), defpackage.ygw.q(view2), z);
    }

    public static boolean J(java.util.List list, java.util.List list2, boolean z) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (view != null && view.hasFocus()) {
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    android.view.View view2 = (android.view.View) it2.next();
                    if (view2 != null) {
                        if (z) {
                            if (view2.isShown() && view2.requestFocus()) {
                                return true;
                            }
                        } else if (view2.getVisibility() == 0 && view2.requestFocus()) {
                            return true;
                        }
                    }
                }
                break;
            }
        }
        return false;
    }

    @Override // defpackage.hlu
    public void A() {
        defpackage.gnb.c("CarApp.H.Tem", "Presenter onPause: %s", this);
        this.j.f(defpackage.epx.d);
        android.view.ViewTreeObserver viewTreeObserver = e().getViewTreeObserver();
        viewTreeObserver.removeOnTouchModeChangeListener(this.e);
        viewTreeObserver.removeOnGlobalFocusChangeListener(this.f);
        this.i.z();
    }

    @Override // defpackage.hlu
    public void B() {
        defpackage.gnb.c("CarApp.H.Tem", "Presenter onResume: %s", this);
        this.j.f(defpackage.epx.e);
        if (this.m == null) {
            ((defpackage.gew) this.i.l(defpackage.gew.class)).getClass();
            e();
        }
        android.view.ViewTreeObserver viewTreeObserver = e().getViewTreeObserver();
        viewTreeObserver.addOnTouchModeChangeListener(this.e);
        viewTreeObserver.addOnGlobalFocusChangeListener(this.f);
    }

    @Override // defpackage.hlu
    public final defpackage.wi C() {
        return this.k.getTemplate();
    }

    @Override // defpackage.hlu
    public final defpackage.gzl D() {
        return this.o;
    }

    protected final void E(android.view.View view, android.graphics.Rect rect) {
        defpackage.gfa gfaVar = this.i;
        int i = gfaVar.getResources().getConfiguration().screenWidthDp;
        int i2 = gfaVar.getResources().getConfiguration().screenHeightDp;
        defpackage.gnb.c("CarApp.H.Tem", "App available screen width: %d, App available screen height: %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        gfaVar.i();
        if (eo(i - (((rect.left + rect.right) * 160) / gfaVar.getResources().getDisplayMetrics().densityDpi), i2)) {
            rect.left = this.ss;
            rect.right = this.b;
        } else {
            this.ss = rect.left;
            this.b = rect.right;
        }
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // defpackage.hlu
    public void F() {
        defpackage.gnb.c("CarApp.H.Tem", "Presenter onCreate: %s", this);
        this.j.f(defpackage.epx.c);
    }

    protected final boolean G() {
        return this.c.isPresent();
    }

    public final boolean H() {
        return e().hasWindowFocus();
    }

    @Override // defpackage.hlu
    public final void K() {
        android.view.View viewA = a();
        if (viewA != null) {
            viewA.requestFocus();
            this.l = viewA;
        }
    }

    protected android.view.View a() {
        return e();
    }

    @Override // defpackage.hlu
    public void b() {
        defpackage.gnb.c("CarApp.H.Tem", "Presenter onDestroy: %s", this);
        this.m = null;
        this.n = null;
        this.j.f(defpackage.epx.a);
    }

    @Override // defpackage.hlu
    public void c() {
        defpackage.gnb.c("CarApp.H.Tem", "Presenter onStart: %s", this);
        this.j.f(defpackage.epx.d);
    }

    public abstract void d();

    @Override // defpackage.hlu
    public boolean ek() {
        return false;
    }

    @Override // defpackage.hlu
    public void el(androidx.car.app.model.TemplateWrapper templateWrapper) {
        this.k = androidx.car.app.model.TemplateWrapper.copyOf(templateWrapper);
        d();
        if (!templateWrapper.isRefresh()) {
            e().clearFocus();
            K();
            return;
        }
        android.view.View viewFindFocus = e().findFocus();
        if (viewFindFocus == null || viewFindFocus.getVisibility() != 0) {
            K();
        } else {
            this.l = viewFindFocus;
        }
    }

    @Override // defpackage.hlu
    public boolean em() {
        return false;
    }

    @Override // defpackage.hlu
    public boolean en() {
        return false;
    }

    protected boolean eo(int i, int i2) {
        return defpackage.gsu.d(defpackage.gsu.c(i, i2));
    }

    public void g(defpackage.hll hllVar, android.view.View view) {
        this.m = hllVar;
        this.n = view;
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.j;
    }

    @Override // defpackage.hlu
    public boolean i(int i, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.hlu
    public void n() {
        defpackage.gnb.c("CarApp.H.Tem", "Presenter onStop: %s", this);
        this.j.f(defpackage.epx.c);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("[%s: %s (Insets: %s)]", java.lang.Integer.toHexString(hashCode()), this.k.getTemplate().getClass().getSimpleName(), this.d);
    }

    @Override // defpackage.hlu
    public void z(android.view.WindowInsets windowInsets, int i) {
        int systemWindowInsetLeft;
        int iMax;
        int systemWindowInsetRight;
        int systemWindowInsetBottom;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.gfa gfaVar = this.i;
            if (gfaVar.i().c() <= 4) {
            }
            android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.systemBars() | android.view.WindowInsets.Type.ime());
            systemWindowInsetLeft = insets.left;
            iMax = java.lang.Math.max(insets.top, i);
            systemWindowInsetRight = insets.right;
            systemWindowInsetBottom = insets.bottom;
        } else {
            systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            iMax = java.lang.Math.max(windowInsets.getSystemWindowInsetTop(), i);
            systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
            systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        }
        this.d = new android.graphics.Rect(systemWindowInsetLeft, iMax, systemWindowInsetRight, systemWindowInsetBottom);
        ((defpackage.gew) this.i.l(defpackage.gew.class)).getClass();
        e();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            E(e(), new android.graphics.Rect(systemWindowInsetLeft, iMax, systemWindowInsetRight, systemWindowInsetBottom));
            return;
        }
        boolean zG = G();
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(windowInsets.getDisplayCutout());
        this.c = optionalOfNullable;
        if (true == optionalOfNullable.isPresent()) {
            android.view.DisplayCutout displayCutoutM311m = defpackage.hh$$ExternalSyntheticApiModelOutline0.m311m(optionalOfNullable.get());
            optionalOfNullable = j$.util.Optional.ofNullable(android.graphics.Insets.of(displayCutoutM311m.getSafeInsetLeft(), displayCutoutM311m.getSafeInsetTop(), displayCutoutM311m.getSafeInsetRight(), displayCutoutM311m.getSafeInsetBottom()));
        }
        android.graphics.Insets insetsM = defpackage.ep$$ExternalSyntheticApiModelOutline0.m(optionalOfNullable.orElse(android.graphics.Insets.NONE));
        android.graphics.Insets insetsOf = android.graphics.Insets.of(java.lang.Math.max(systemWindowInsetLeft, insetsM.left), java.lang.Math.max(iMax, insetsM.top), java.lang.Math.max(systemWindowInsetRight, insetsM.right), java.lang.Math.max(systemWindowInsetBottom, insetsM.bottom));
        if (G() ^ zG) {
            int unused = insetsOf.left;
            int unused2 = insetsOf.top;
            int unused3 = insetsOf.right;
            int unused4 = insetsOf.bottom;
        }
        E(e(), new android.graphics.Rect(insetsOf.left, insetsOf.top, insetsOf.right, insetsOf.bottom));
    }
}
