package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class AppBarLayout$ScrollingViewBehavior extends g {
    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f6200a);
        h(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    static final d c(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            if (view instanceof d) {
                return (d) view;
            }
        }
        return null;
    }

    @Override // com.google.android.material.appbar.g
    final int a(View view) {
        throw null;
    }

    @Override // com.google.android.material.appbar.g
    final /* bridge */ /* synthetic */ View b(List list) {
        return c(list);
    }

    @Override // com.google.android.material.appbar.g
    final void d(View view) {
        if (view instanceof d) {
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
        if (behavior instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) behavior).f6177b;
            ViewCompat.offsetTopAndBottom(view, (bottom + f()) - e(view2));
        }
        if (!(view2 instanceof d)) {
            return false;
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view2 instanceof d) {
            ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
        }
    }

    @Override // com.google.android.material.appbar.i, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i2) {
        super.onLayoutChild(coordinatorLayout, view, i2);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        if (c(coordinatorLayout.getDependencies(view)) != null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            Rect rect3 = this.f6196a;
            rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (!rect3.contains(rect2)) {
                throw null;
            }
        }
        return false;
    }

    public AppBarLayout$ScrollingViewBehavior() {
    }
}
