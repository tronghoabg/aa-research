package com.google.android.material.behavior;

/* JADX INFO: loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends android.view.View> extends defpackage.dsn<V> {
    public android.view.accessibility.AccessibilityManager a;
    public android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener b;
    public int c;
    public android.view.ViewPropertyAnimator d;
    private defpackage.wmm e;
    private final java.util.LinkedHashSet f;
    private int g;
    private int h;
    private android.animation.TimeInterpolator i;
    private android.animation.TimeInterpolator j;
    private int k;
    private int l;
    private int m;

    public HideViewOnScrollBehavior() {
        this.f = new java.util.LinkedHashSet();
        this.k = 0;
        this.c = 2;
        this.l = 0;
        this.m = 0;
    }

    private final void A(android.view.View view, int i, long j, android.animation.TimeInterpolator timeInterpolator) {
        this.d = this.e.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new defpackage.wmk(this, view));
    }

    private final void B(int i) {
        defpackage.wmm wmhVar;
        defpackage.wmm wmmVar = this.e;
        if (wmmVar == null || wmmVar.b() != i) {
            if (i != 0) {
                wmhVar = i != 1 ? new defpackage.wmg() : new defpackage.wmf();
            } else {
                wmhVar = new defpackage.wmh();
            }
            this.e = wmhVar;
        }
    }

    private final void C(android.view.View view, int i) {
        this.c = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.m);
            }
        }
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((defpackage.wml) it.next()).a();
        }
    }

    @Override // defpackage.dsn
    public final boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null) {
            accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService(android.view.accessibility.AccessibilityManager.class);
            this.a = accessibilityManager;
        }
        int i2 = 0;
        if (accessibilityManager != null && this.b == null) {
            defpackage.wmi wmiVar = new defpackage.wmi(this, view, i2);
            this.b = wmiVar;
            this.a.addTouchExplorationStateChangeListener(wmiVar);
            view.addOnAttachStateChangeListener(new defpackage.wmj(this, 0));
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((defpackage.dsq) view.getLayoutParams()).c;
        if (i3 == 80 || i3 == 81) {
            B(1);
        } else {
            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i3, i);
            int i4 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i4 = 0;
            }
            B(i4);
        }
        this.k = this.e.a(view, marginLayoutParams);
        this.g = defpackage.sqs.bm(view.getContext(), com.google.android.projection.gearhead.R.attr.motionDurationLong2, 225);
        this.h = defpackage.sqs.bm(view.getContext(), com.google.android.projection.gearhead.R.attr.motionDurationMedium4, 175);
        this.i = defpackage.wqn.c(view.getContext(), com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator, defpackage.wlm.d);
        this.j = defpackage.wqn.c(view.getContext(), com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator, defpackage.wlm.c);
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
                C(view, 1);
                A(view, this.k, this.h, this.j);
            }
        }
    }

    @Override // defpackage.dsn
    public final boolean q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2) {
        return i == 2;
    }

    public final boolean y() {
        return this.c == 1;
    }

    public final void z(android.view.View view) {
        if (this.c != 2) {
            C(view, 2);
            android.view.ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.e.d();
            A(view, 0, this.g, this.i);
        }
    }

    public HideViewOnScrollBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new java.util.LinkedHashSet();
        this.k = 0;
        this.c = 2;
        this.l = 0;
        this.m = 0;
    }
}
