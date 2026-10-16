package com.google.android.material.behavior;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends defpackage.dsn<V> {
    public android.view.accessibility.AccessibilityManager a;
    public android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener b;
    public int c;
    public android.view.ViewPropertyAnimator d;
    private final java.util.LinkedHashSet e;
    private int f;
    private int g;
    private android.animation.TimeInterpolator h;
    private android.animation.TimeInterpolator i;
    private int j;
    private int k;
    private int l;

    public HideBottomViewOnScrollBehavior() {
        this.e = new java.util.LinkedHashSet();
        this.j = 0;
        this.c = 2;
        this.k = 0;
        this.l = 0;
    }

    private final void A(android.view.View view, int i, long j, android.animation.TimeInterpolator timeInterpolator) {
        this.d = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new defpackage.wmd(this, view));
    }

    private final void B(android.view.View view, int i) {
        this.c = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.k = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.l = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.k);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.l);
            }
        }
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((defpackage.wme) it.next()).a();
        }
    }

    @Override // defpackage.dsn
    public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        this.j = view.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f = defpackage.sqs.bm(view.getContext(), com.google.android.projection.gearhead.R.attr.motionDurationLong2, 225);
        this.g = defpackage.sqs.bm(view.getContext(), com.google.android.projection.gearhead.R.attr.motionDurationMedium4, 175);
        this.h = defpackage.wqn.c(view.getContext(), com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator, defpackage.wlm.d);
        this.i = defpackage.wqn.c(view.getContext(), com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator, defpackage.wlm.c);
        android.view.accessibility.AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null) {
            accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService(android.view.accessibility.AccessibilityManager.class);
            this.a = accessibilityManager;
        }
        if (accessibilityManager == null || this.b != null) {
            return false;
        }
        defpackage.wmi wmiVar = new defpackage.wmi(this, view, 1);
        this.b = wmiVar;
        this.a.addTouchExplorationStateChangeListener(wmiVar);
        view.addOnAttachStateChangeListener(new defpackage.wmj(this, 1));
        return false;
    }

    @Override // defpackage.dsn
    public final void n(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                z(view);
            }
        } else {
            if (y()) {
                return;
            }
            android.view.accessibility.AccessibilityManager accessibilityManager = this.a;
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                android.view.ViewPropertyAnimator viewPropertyAnimator = this.d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                B(view, 1);
                A(view, this.j, this.g, this.i);
            }
        }
    }

    @Override // defpackage.dsn
    public boolean q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2) {
        return i == 2;
    }

    public final boolean y() {
        return this.c == 1;
    }

    public final void z(android.view.View view) {
        if (this.c != 2) {
            B(view, 2);
            android.view.ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            A(view, 0, this.f, this.h);
        }
    }

    public HideBottomViewOnScrollBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new java.util.LinkedHashSet();
        this.j = 0;
        this.c = 2;
        this.k = 0;
        this.l = 0;
    }
}
