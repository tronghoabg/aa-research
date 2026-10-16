package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
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
@Deprecated
/* loaded from: classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f6220a;

    /* renamed from: b, reason: collision with root package name */
    private int f6221b;

    /* renamed from: c, reason: collision with root package name */
    private int f6222c;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f6223d;

    /* renamed from: e, reason: collision with root package name */
    private TimeInterpolator f6224e;

    /* renamed from: f, reason: collision with root package name */
    private int f6225f;

    /* renamed from: g, reason: collision with root package name */
    private AccessibilityManager f6226g;

    /* renamed from: h, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f6227h;

    /* renamed from: i, reason: collision with root package name */
    private int f6228i;

    /* renamed from: j, reason: collision with root package name */
    private ViewPropertyAnimator f6229j;

    /* renamed from: k, reason: collision with root package name */
    private int f6230k;

    /* renamed from: l, reason: collision with root package name */
    private int f6231l;

    public HideBottomViewOnScrollBehavior() {
        this.f6220a = new LinkedHashSet();
        this.f6225f = 0;
        this.f6228i = 2;
        this.f6230k = 0;
        this.f6231l = 0;
    }

    private final void h(View view, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f6229j = view.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a(this, view));
    }

    private final void i(View view, int i2) {
        this.f6228i = i2;
        if (i2 == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f6230k = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f6231l = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f6230k);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f6231l);
            }
        }
        Iterator it = this.f6220a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
    }

    public final void d(View view) {
        if (this.f6228i == 2) {
            return;
        }
        i(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f6229j;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        h(view, 0, this.f6221b, this.f6223d);
    }

    public final boolean e() {
        return this.f6228i == 1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i2) {
        this.f6225f = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.f6221b = t.e(v.getContext(), R.attr.motionDurationLong2, 225);
        this.f6222c = t.e(v.getContext(), R.attr.motionDurationMedium4, 175);
        this.f6223d = com.google.android.material.k.f.d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.a.a.f6176d);
        this.f6224e = com.google.android.material.k.f.d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.a.a.f6175c);
        AccessibilityManager accessibilityManager = this.f6226g;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(v.getContext(), AccessibilityManager.class);
            this.f6226g = accessibilityManager;
        }
        if (accessibilityManager == null || this.f6227h != null) {
            return false;
        }
        f fVar = new f(this, v, 1);
        this.f6227h = fVar;
        this.f6226g.addTouchExplorationStateChangeListener(fVar);
        v.addOnAttachStateChangeListener(new g(this, 1));
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
            AccessibilityManager accessibilityManager = this.f6226g;
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                ViewPropertyAnimator viewPropertyAnimator = this.f6229j;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                i(v, 1);
                h(v, this.f6225f, this.f6222c, this.f6224e);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6220a = new LinkedHashSet();
        this.f6225f = 0;
        this.f6228i = 2;
        this.f6230k = 0;
        this.f6231l = 0;
    }
}
