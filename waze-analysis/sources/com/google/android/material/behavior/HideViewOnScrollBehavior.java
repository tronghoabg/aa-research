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
import androidx.core.content.ContextCompat;
import com.google.android.material.internal.t;
import com.waze.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    private j f6232a;

    /* renamed from: b, reason: collision with root package name */
    private AccessibilityManager f6233b;

    /* renamed from: c, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f6234c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f6235d;

    /* renamed from: e, reason: collision with root package name */
    private int f6236e;

    /* renamed from: f, reason: collision with root package name */
    private int f6237f;

    /* renamed from: g, reason: collision with root package name */
    private TimeInterpolator f6238g;

    /* renamed from: h, reason: collision with root package name */
    private TimeInterpolator f6239h;

    /* renamed from: i, reason: collision with root package name */
    private int f6240i;

    /* renamed from: j, reason: collision with root package name */
    private int f6241j;

    /* renamed from: k, reason: collision with root package name */
    private ViewPropertyAnimator f6242k;

    /* renamed from: l, reason: collision with root package name */
    private int f6243l;
    private int m;

    public HideViewOnScrollBehavior() {
        this.f6235d = new LinkedHashSet();
        this.f6240i = 0;
        this.f6241j = 2;
        this.f6243l = 0;
        this.m = 0;
    }

    private final void h(View view, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f6242k = this.f6232a.c(view, i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new h(this, view));
    }

    private final void i(int i2) {
        j jVar = this.f6232a;
        if (jVar == null || jVar.b() != i2) {
            this.f6232a = i2 != 0 ? i2 != 1 ? new d() : new c() : new e();
        }
    }

    private final void j(View view, int i2) {
        this.f6241j = i2;
        if (i2 == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f6243l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f6243l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.m);
            }
        }
        Iterator it = this.f6235d.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }

    public final void d(View view) {
        if (this.f6241j == 2) {
            return;
        }
        j(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f6242k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f6232a.d();
        h(view, 0, this.f6236e, this.f6238g);
    }

    public final boolean e() {
        return this.f6241j == 1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i2) {
        AccessibilityManager accessibilityManager = this.f6233b;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(v.getContext(), AccessibilityManager.class);
            this.f6233b = accessibilityManager;
        }
        int i3 = 0;
        if (accessibilityManager != null && this.f6234c == null) {
            f fVar = new f(this, v, i3);
            this.f6234c = fVar;
            this.f6233b.addTouchExplorationStateChangeListener(fVar);
            v.addOnAttachStateChangeListener(new g(this, 0));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int i4 = ((CoordinatorLayout.LayoutParams) v.getLayoutParams()).gravity;
        if (i4 == 80 || i4 == 81) {
            i(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i2);
            int i5 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i5 = 0;
            }
            i(i5);
        }
        this.f6240i = this.f6232a.a(v, marginLayoutParams);
        this.f6236e = t.e(v.getContext(), R.attr.motionDurationLong2, 225);
        this.f6237f = t.e(v.getContext(), R.attr.motionDurationMedium4, 175);
        this.f6238g = com.google.android.material.k.f.d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.a.a.f6176d);
        this.f6239h = com.google.android.material.k.f.d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.a.a.f6175c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i3 <= 0) {
            if (i3 < 0) {
                d(v);
            }
        } else {
            if (e()) {
                return;
            }
            AccessibilityManager accessibilityManager = this.f6233b;
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                ViewPropertyAnimator viewPropertyAnimator = this.f6242k;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                j(v, 1);
                h(v, this.f6240i, this.f6237f, this.f6239h);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6235d = new LinkedHashSet();
        this.f6240i = 0;
        this.f6241j = 2;
        this.f6243l = 0;
        this.m = 0;
    }
}
