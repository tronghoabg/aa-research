package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes3.dex */
public class BaseTransientBottomBar {
    public final int c;
    public final int d;
    public final int e;
    public final android.animation.TimeInterpolator f;
    public final android.animation.TimeInterpolator g;
    public final android.view.ViewGroup h;
    public final android.content.Context i;
    public final defpackage.wwp j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final com.google.android.material.snackbar.SnackbarContentLayout r;
    private final android.animation.TimeInterpolator x;
    private final android.view.accessibility.AccessibilityManager z;
    private static final android.animation.TimeInterpolator t = defpackage.wlm.b;
    private static final android.animation.TimeInterpolator u = defpackage.wlm.a;
    private static final android.animation.TimeInterpolator v = defpackage.wlm.d;
    private static final int[] w = {com.google.android.projection.gearhead.R.attr.snackbarStyle};
    public static final java.lang.String b = "BaseTransientBottomBar";
    public static final android.os.Handler a = new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.wwk());
    private final java.lang.Runnable y = new defpackage.wuj(this, 5, null);
    public final defpackage.xei s = new defpackage.xei(this);

    public static class Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {
        public final defpackage.sk g = new defpackage.sk(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.dsn
        public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            defpackage.sk skVar = this.g;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    defpackage.wwt.a().f((defpackage.xei) skVar.a);
                }
            } else if (coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                defpackage.wwt.a().e((defpackage.xei) skVar.a);
            }
            return super.d(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean y(android.view.View view) {
            return view instanceof defpackage.wwp;
        }
    }

    protected BaseTransientBottomBar(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.h = viewGroup;
        this.r = snackbarContentLayout;
        this.i = context;
        defpackage.wro.b(context);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(w);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        defpackage.wwp wwpVar = (defpackage.wwp) layoutInflaterFrom.inflate(resourceId != -1 ? com.google.android.projection.gearhead.R.layout.mtrl_layout_snackbar : com.google.android.projection.gearhead.R.layout.design_layout_snackbar, viewGroup, false);
        this.j = wwpVar;
        wwpVar.a = this;
        float f = wwpVar.d;
        if (f != 1.0f) {
            com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout2 = (com.google.android.material.snackbar.SnackbarContentLayout) view;
            snackbarContentLayout2.b.setTextColor(defpackage.sqs.bx(defpackage.sqs.bv(view, com.google.android.projection.gearhead.R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f));
        }
        ((com.google.android.material.snackbar.SnackbarContentLayout) view).d = wwpVar.e;
        wwpVar.addView(view);
        wwpVar.setAccessibilityLiveRegion(1);
        wwpVar.setImportantForAccessibility(1);
        wwpVar.setFitsSystemWindows(true);
        defpackage.wwl wwlVar = new defpackage.wwl(this, 0);
        int[] iArr = defpackage.ebt.a;
        defpackage.ebl.e(wwpVar, wwlVar);
        defpackage.ebt.n(wwpVar, new defpackage.wwm(this));
        this.z = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        this.e = defpackage.sqs.bm(context, com.google.android.projection.gearhead.R.attr.motionDurationLong2, 250);
        this.c = defpackage.sqs.bm(context, com.google.android.projection.gearhead.R.attr.motionDurationLong2, 150);
        this.d = defpackage.sqs.bm(context, com.google.android.projection.gearhead.R.attr.motionDurationMedium1, 75);
        this.x = defpackage.wqn.c(context, com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator, u);
        this.g = defpackage.wqn.c(context, com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator, v);
        this.f = defpackage.wqn.c(context, com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator, t);
    }

    public int a() {
        throw null;
    }

    public final int b() {
        defpackage.wwp wwpVar = this.j;
        int height = wwpVar.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams = wwpVar.getLayoutParams();
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? height + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final android.animation.ValueAnimator c(float... fArr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.x);
        valueAnimatorOfFloat.addUpdateListener(new defpackage.wmr(this, 2));
        return valueAnimatorOfFloat;
    }

    public final void d(int i) {
        defpackage.wwt wwtVarA = defpackage.wwt.a();
        java.lang.Object obj = wwtVarA.a;
        defpackage.xei xeiVar = this.s;
        synchronized (obj) {
            if (wwtVarA.g(xeiVar)) {
                wwtVarA.d(wwtVarA.c, i);
            } else if (wwtVarA.h(xeiVar)) {
                wwtVarA.d(wwtVarA.d, i);
            }
        }
    }

    public final void e() {
        defpackage.wwt wwtVarA = defpackage.wwt.a();
        java.lang.Object obj = wwtVarA.a;
        defpackage.xei xeiVar = this.s;
        synchronized (obj) {
            if (wwtVarA.g(xeiVar)) {
                wwtVarA.b(wwtVarA.c);
            }
        }
    }

    public final void f() {
        defpackage.wwt wwtVarA = defpackage.wwt.a();
        java.lang.Object obj = wwtVarA.a;
        int iA = a();
        defpackage.xei xeiVar = this.s;
        synchronized (obj) {
            if (wwtVarA.g(xeiVar)) {
                defpackage.wws wwsVar = wwtVarA.c;
                wwsVar.a = iA;
                wwtVarA.b.removeCallbacksAndMessages(wwsVar);
                wwtVarA.b(wwtVarA.c);
                return;
            }
            if (wwtVarA.h(xeiVar)) {
                wwtVarA.d.a = iA;
            } else {
                wwtVarA.d = new defpackage.wws(iA, xeiVar);
            }
            defpackage.wws wwsVar2 = wwtVarA.c;
            if (wwsVar2 == null || !wwtVarA.d(wwsVar2, 4)) {
                wwtVarA.c = null;
                wwtVarA.c();
            }
        }
    }

    public final void g() {
        boolean zI = i();
        defpackage.wwp wwpVar = this.j;
        if (zI) {
            wwpVar.post(new defpackage.wuj(this, 7, null));
            return;
        }
        if (wwpVar.getParent() != null) {
            wwpVar.setVisibility(0);
        }
        e();
    }

    public final void h() {
        defpackage.wwp wwpVar = this.j;
        android.view.ViewGroup.LayoutParams layoutParams = wwpVar.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.util.Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (wwpVar.f == null) {
            android.util.Log.w(b, "Unable to update margins because original view margins are not set");
            return;
        }
        if (wwpVar.getParent() == null) {
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int i = wwpVar.f.bottom + this.l;
        int i2 = wwpVar.f.left + this.m;
        int i3 = wwpVar.f.right + this.n;
        int i4 = wwpVar.f.top;
        if (marginLayoutParams.bottomMargin != i || marginLayoutParams.leftMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.topMargin != i4) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.topMargin = i4;
            wwpVar.requestLayout();
        } else if (this.p == this.o) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 29 || this.o <= 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = wwpVar.getLayoutParams();
        if ((layoutParams2 instanceof defpackage.dsq) && (((defpackage.dsq) layoutParams2).a instanceof com.google.android.material.behavior.SwipeDismissBehavior)) {
            java.lang.Runnable runnable = this.y;
            wwpVar.removeCallbacks(runnable);
            wwpVar.post(runnable);
        }
    }

    public final boolean i() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.z;
        if (accessibilityManager == null) {
            return true;
        }
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void j() {
        defpackage.wwt wwtVarA = defpackage.wwt.a();
        java.lang.Object obj = wwtVarA.a;
        defpackage.xei xeiVar = this.s;
        synchronized (obj) {
            if (wwtVarA.g(xeiVar)) {
                wwtVarA.c = null;
                if (wwtVarA.d != null) {
                    wwtVarA.c();
                }
            }
        }
        defpackage.wwp wwpVar = this.j;
        android.view.ViewParent parent = wwpVar.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(wwpVar);
        }
    }
}
