package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.projection.gearhead.R;
import defpackage.dsg;
import defpackage.dsj;
import defpackage.wkn;
import defpackage.wlh;
import defpackage.wli;
import defpackage.wlj;
import defpackage.wlk;
import defpackage.wll;
import defpackage.wlm;
import defpackage.wln;
import defpackage.wlo;
import defpackage.woy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends dsg<V> {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public int c;
    public ViewPropertyAnimator d;
    private wlo e;
    private final LinkedHashSet f;
    private int g;
    private int h;
    private TimeInterpolator i;
    private TimeInterpolator j;
    private int k;
    private int l;
    private int m;

    public HideViewOnScrollBehavior() {
        this.f = new LinkedHashSet();
        this.k = 0;
        this.c = 2;
        this.l = 0;
        this.m = 0;
    }

    private final void L(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.d = this.e.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new wlm(this, view));
    }

    private final void M(int i) {
        wlo wloVar = this.e;
        if (wloVar == null || wloVar.b() != i) {
            this.e = i != 0 ? i != 1 ? new wli() : new wlh() : new wlj();
        }
    }

    private final void N(View view, int i) {
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
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((wln) it.next()).a();
        }
    }

    public final boolean J() {
        return this.c == 1;
    }

    public final void K(View view) {
        if (this.c != 2) {
            N(view, 2);
            ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.e.d();
            L(view, 0, this.g, this.i);
        }
    }

    @Override // defpackage.dsg
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.a = accessibilityManager;
        }
        int i2 = 0;
        if (accessibilityManager != null && this.b == null) {
            wlk wlkVar = new wlk(this, view, i2);
            this.b = wlkVar;
            this.a.addTouchExplorationStateChangeListener(wlkVar);
            view.addOnAttachStateChangeListener(new wll(this, 0));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((dsj) view.getLayoutParams()).c;
        if (i3 == 80 || i3 == 81) {
            M(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            int i4 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i4 = 0;
            }
            M(i4);
        }
        this.k = this.e.a(view, marginLayoutParams);
        this.g = woy.u(view.getContext(), R.attr.motionDurationLong2, 225);
        this.h = woy.u(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.i = woy.C(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, wkn.d);
        this.j = woy.C(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, wkn.c);
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
                N(view, 1);
                L(view, this.k, this.h, this.j);
            }
        }
    }

    @Override // defpackage.dsg
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new LinkedHashSet();
        this.k = 0;
        this.c = 2;
        this.l = 0;
        this.m = 0;
    }
}
