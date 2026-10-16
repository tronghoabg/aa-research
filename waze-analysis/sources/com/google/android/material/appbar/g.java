package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class g extends i {

    /* renamed from: a, reason: collision with root package name */
    final Rect f6196a;

    /* renamed from: b, reason: collision with root package name */
    final Rect f6197b;

    /* renamed from: c, reason: collision with root package name */
    private int f6198c;

    /* renamed from: d, reason: collision with root package name */
    private int f6199d;

    public g() {
        this.f6196a = new Rect();
        this.f6197b = new Rect();
        this.f6198c = 0;
    }

    int a(View view) {
        throw null;
    }

    @Override // com.google.android.material.appbar.i
    protected final void aj(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View viewB = b(coordinatorLayout.getDependencies(view));
        if (viewB == null) {
            coordinatorLayout.onLayoutChild(view, i2);
            this.f6198c = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        Rect rect = this.f6196a;
        rect.set(coordinatorLayout.getPaddingLeft() + layoutParams.leftMargin, viewB.getBottom() + layoutParams.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - layoutParams.rightMargin, ((coordinatorLayout.getHeight() + viewB.getBottom()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.getSystemWindowInsetLeft();
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f6197b;
        int i3 = layoutParams.gravity;
        if (i3 == 0) {
            i3 = 8388659;
        }
        Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
        int iE = e(viewB);
        view.layout(rect2.left, rect2.top - iE, rect2.right, rect2.bottom - iE);
        this.f6198c = rect2.top - viewB.getBottom();
    }

    abstract View b(List list);

    void d(View view) {
        throw null;
    }

    final int e(View view) {
        if (this.f6199d == 0) {
            return 0;
        }
        d(view);
        int i2 = this.f6199d;
        return MathUtils.clamp((int) (i2 * 0.0f), 0, i2);
    }

    final int f() {
        return this.f6198c;
    }

    public final void h(int i2) {
        this.f6199d = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        WindowInsetsCompat lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if (i6 != -1) {
            if (i6 != -2) {
                return false;
            }
            i6 = -2;
        }
        View viewB = b(coordinatorLayout.getDependencies(view));
        if (viewB == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewB.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int iA = size + a(viewB);
        int measuredHeight = viewB.getMeasuredHeight();
        view.setTranslationY(0.0f);
        coordinatorLayout.onMeasureChild(view, i2, i3, View.MeasureSpec.makeMeasureSpec(iA - measuredHeight, i6 == -1 ? 1073741824 : Integer.MIN_VALUE), i5);
        return true;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6196a = new Rect();
        this.f6197b = new Rect();
        this.f6198c = 0;
    }
}
