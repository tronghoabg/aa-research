package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.d;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class AppBarLayout$BaseBehavior<T extends d> extends f<T> {

    /* renamed from: b, reason: collision with root package name */
    private int f6177b;

    /* renamed from: c, reason: collision with root package name */
    private int f6178c;

    /* renamed from: d, reason: collision with root package name */
    private c f6179d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference f6180e;

    public AppBarLayout$BaseBehavior() {
    }

    private final void h(CoordinatorLayout coordinatorLayout) {
        if (ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
            return;
        }
        ViewCompat.setAccessibilityDelegate(coordinatorLayout, new a(this));
    }

    @Override // com.google.android.material.appbar.f
    final /* synthetic */ int a(View view) {
        throw null;
    }

    @Override // com.google.android.material.appbar.f
    final /* bridge */ /* synthetic */ boolean b(View view) {
        WeakReference weakReference = this.f6180e;
        if (weakReference == null) {
            return true;
        }
        View view2 = (View) weakReference.get();
        return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
    }

    @Override // com.google.android.material.appbar.f
    final /* synthetic */ void d(View view) {
        throw null;
    }

    @Override // com.google.android.material.appbar.f
    final /* synthetic */ void e(CoordinatorLayout coordinatorLayout, View view, int i2, int i3) {
        if (MathUtils.clamp(i2, Integer.MIN_VALUE, i3) != 0) {
            throw null;
        }
        h(coordinatorLayout);
    }

    @Override // com.google.android.material.appbar.f
    final /* bridge */ /* synthetic */ void f(View view) {
        throw null;
    }

    @Override // com.google.android.material.appbar.f
    final void g() {
    }

    @Override // com.google.android.material.appbar.i, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i2) {
        super.onLayoutChild(coordinatorLayout, (d) view, i2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        d dVar = (d) view;
        if (((CoordinatorLayout.LayoutParams) dVar.getLayoutParams()).height != -2) {
            return false;
        }
        coordinatorLayout.onMeasureChild(dVar, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        if (i3 != 0 && i3 >= 0) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i5 < 0) {
            throw null;
        }
        if (i5 == 0) {
            h(coordinatorLayout);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            this.f6179d = null;
            return;
        }
        c cVar = (c) parcelable;
        this.f6179d = cVar;
        cVar.getSuperState();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        d dVar = (d) view;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, dVar);
        int childCount = dVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = dVar.getChildAt(i2);
            int bottom = childAt.getBottom();
            if (childAt.getTop() <= 0 && bottom >= 0) {
                if (parcelableOnSaveInstanceState == null) {
                    parcelableOnSaveInstanceState = AbsSavedState.EMPTY_STATE;
                }
                c cVar = new c(parcelableOnSaveInstanceState);
                cVar.f6182b = true;
                cVar.f6181a = false;
                cVar.f6183c = i2;
                childAt.getMinimumHeight();
                throw null;
            }
        }
        return parcelableOnSaveInstanceState;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        if ((i2 & 2) != 0) {
            throw null;
        }
        this.f6180e = null;
        this.f6178c = i3;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
        if (this.f6178c == 0 || i2 == 1) {
            throw null;
        }
        this.f6180e = new WeakReference(view2);
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
