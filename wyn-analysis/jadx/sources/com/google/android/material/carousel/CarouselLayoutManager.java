package com.google.android.material.carousel;

import P7.a;
import P7.b;
import P7.c;
import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.V;
import androidx.recyclerview.widget.W;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.j0;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import za.C4658a;

/* loaded from: classes4.dex */
public class CarouselLayoutManager extends V {

    /* renamed from: a, reason: collision with root package name */
    public int f26868a;

    public CarouselLayoutManager() {
        new b();
        requestLayout();
    }

    public static C4658a d(List list, float f10, boolean z2) {
        float f11 = Float.MAX_VALUE;
        int i5 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((c) list.get(i13)).getClass();
            float fAbs = Math.abs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f10);
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f10 && fAbs <= f11) {
                i5 = i13;
                f11 = fAbs;
            }
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f10 && fAbs <= f13) {
                i11 = i13;
                f13 = fAbs;
            }
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f14) {
                f14 = 0.0f;
                i10 = i13;
            }
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f12) {
                f12 = 0.0f;
                i12 = i13;
            }
        }
        if (i5 == -1) {
            i5 = i10;
        }
        if (i11 == -1) {
            i11 = i12;
        }
        return new C4658a((c) list.get(i5), (c) list.get(i11));
    }

    @Override // androidx.recyclerview.widget.V
    public final boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.V
    public final int computeHorizontalScrollExtent(j0 j0Var) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.V
    public final int computeHorizontalScrollOffset(j0 j0Var) {
        return this.f26868a;
    }

    @Override // androidx.recyclerview.widget.V
    public final int computeHorizontalScrollRange(j0 j0Var) {
        return 0 - 0;
    }

    public final boolean e() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.V
    public final W generateDefaultLayoutParams() {
        return new W(-2, -2);
    }

    @Override // androidx.recyclerview.widget.V
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerX();
        throw null;
    }

    @Override // androidx.recyclerview.widget.V
    public final void measureChildWithMargins(View view, int i5, int i10) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.V
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final void onLayoutChildren(c0 c0Var, j0 j0Var) {
        if (j0Var.b() <= 0) {
            removeAndRecycleAllViews(c0Var);
        } else {
            e();
            measureChildWithMargins(c0Var.j(0, Long.MAX_VALUE).itemView, 0, 0);
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final void onLayoutCompleted(j0 j0Var) {
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.V
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z10) {
        return false;
    }

    @Override // androidx.recyclerview.widget.V
    public final int scrollHorizontallyBy(int i5, c0 c0Var, j0 j0Var) {
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        int i10 = this.f26868a;
        int i11 = i10 + i5;
        if (i11 < 0 || i11 > 0) {
            i5 = 0 - i10;
        }
        this.f26868a = i10 + i5;
        e();
        throw null;
    }

    @Override // androidx.recyclerview.widget.V
    public final void scrollToPosition(int i5) {
    }

    @Override // androidx.recyclerview.widget.V
    public final void smoothScrollToPosition(RecyclerView recyclerView, j0 j0Var, int i5) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.setTargetPosition(i5);
        startSmoothScroll(aVar);
    }
}
