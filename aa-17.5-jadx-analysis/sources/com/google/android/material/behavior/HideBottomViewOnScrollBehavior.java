package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.projection.gearhead.R;
import defpackage.dsg;
import defpackage.wkn;
import defpackage.wlf;
import defpackage.wlg;
import defpackage.wlk;
import defpackage.wll;
import defpackage.woy;
import java.util.Iterator;
import java.util.LinkedHashSet;

@Deprecated
/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends dsg<V> {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public int c;
    public ViewPropertyAnimator d;
    private final LinkedHashSet e;
    private int f;
    private int g;
    private TimeInterpolator h;
    private TimeInterpolator i;
    private int j;
    private int k;
    private int l;

    public HideBottomViewOnScrollBehavior() {
        this.e = new LinkedHashSet();
        this.j = 0;
        this.c = 2;
        this.k = 0;
        this.l = 0;
    }

    private final void L(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.d = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new wlf(this, view));
    }

    private final void M(View view, int i) {
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
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((wlg) it.next()).a();
        }
    }

    public final boolean J() {
        return this.c == 1;
    }

    public final void K(View view) {
        if (this.c != 2) {
            M(view, 2);
            ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            L(view, 0, this.f, this.h);
        }
    }

    @Override // defpackage.dsg
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.j = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f = woy.u(view.getContext(), R.attr.motionDurationLong2, 225);
        this.g = woy.u(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.h = woy.C(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, wkn.d);
        this.i = woy.C(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, wkn.c);
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.a = accessibilityManager;
        }
        if (accessibilityManager == null || this.b != null) {
            return false;
        }
        wlk wlkVar = new wlk(this, view, 1);
        this.b = wlkVar;
        this.a.addTouchExplorationStateChangeListener(wlkVar);
        view.addOnAttachStateChangeListener(new wll(this, 1));
        return false;
    }

    @Override // defpackage.dsg
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                K(view);
            }
        } else {
            if (J()) {
                return;
            }
            AccessibilityManager accessibilityManager = this.a;
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                ViewPropertyAnimator viewPropertyAnimator = this.d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                M(view, 1);
                L(view, this.j, this.g, this.i);
            }
        }
    }

    @Override // defpackage.dsg
    public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new LinkedHashSet();
        this.j = 0;
        this.c = 2;
        this.k = 0;
        this.l = 0;
    }
}
