package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewParent;
import androidx.customview.widget.ViewDragHelper;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k extends ViewDragHelper.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SwipeDismissBehavior f6261a;

    /* renamed from: b, reason: collision with root package name */
    private int f6262b;

    /* renamed from: c, reason: collision with root package name */
    private int f6263c;

    k(SwipeDismissBehavior swipeDismissBehavior) {
        Objects.requireNonNull(swipeDismissBehavior);
        this.f6261a = swipeDismissBehavior;
        this.f6263c = -1;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View view, int i2, int i3) {
        int width;
        int width2;
        int width3;
        int layoutDirection = view.getLayoutDirection();
        int i4 = this.f6261a.f6246c;
        if (i4 == 0) {
            width = this.f6262b;
            if (layoutDirection == 1) {
                width -= view.getWidth();
                width2 = this.f6262b;
            } else {
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i4 == 1) {
            width = this.f6262b;
            if (layoutDirection == 1) {
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width -= view.getWidth();
                width2 = this.f6262b;
            }
        } else {
            width = this.f6262b - view.getWidth();
            width2 = this.f6262b + view.getWidth();
        }
        return Math.min(Math.max(width, i2), width2);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionVertical(View view, int i2, int i3) {
        return view.getTop();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewCaptured(View view, int i2) {
        this.f6263c = i2;
        this.f6262b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f6261a;
            swipeDismissBehavior.f6250g = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f6250g = false;
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i2) {
        m mVar = this.f6261a.f6245b;
        if (mVar != null) {
            mVar.b(i2);
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f6261a;
        float f2 = width * swipeDismissBehavior.f6247d;
        float width2 = view.getWidth() * swipeDismissBehavior.f6248e;
        float fAbs = Math.abs(i2 - this.f6262b);
        if (fAbs <= f2) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.d(1.0f - ((fAbs - f2) / (width2 - f2))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewReleased(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r9 = -1
            r6.f6263c = r9
            r9 = 0
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            int r1 = r7.getWidth()
            r2 = 1
            if (r0 == 0) goto L2f
            int r3 = r7.getLayoutDirection()
            com.google.android.material.behavior.SwipeDismissBehavior r4 = r6.f6261a
            int r4 = r4.f6246c
            r5 = 2
            if (r4 != r5) goto L19
            goto L48
        L19:
            if (r4 != 0) goto L25
            if (r3 != r2) goto L22
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 < 0) goto L48
            goto L5c
        L22:
            if (r0 <= 0) goto L5c
            goto L48
        L25:
            if (r3 != r2) goto L2a
            if (r0 <= 0) goto L5c
            goto L48
        L2a:
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 >= 0) goto L5c
            goto L48
        L2f:
            int r0 = r7.getLeft()
            int r3 = r6.f6262b
            int r0 = r0 - r3
            int r3 = r7.getWidth()
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            int r0 = java.lang.Math.abs(r0)
            if (r0 < r3) goto L5c
        L48:
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L57
            int r8 = r7.getLeft()
            int r9 = r6.f6262b
            if (r8 >= r9) goto L55
            goto L57
        L55:
            int r9 = r9 + r1
            goto L5f
        L57:
            int r8 = r6.f6262b
            int r9 = r8 - r1
            goto L5f
        L5c:
            int r9 = r6.f6262b
            r2 = 0
        L5f:
            com.google.android.material.behavior.SwipeDismissBehavior r6 = r6.f6261a
            androidx.customview.widget.ViewDragHelper r8 = r6.f6244a
            int r0 = r7.getTop()
            boolean r8 = r8.settleCapturedViewAt(r9, r0)
            if (r8 == 0) goto L76
            com.google.android.material.behavior.n r8 = new com.google.android.material.behavior.n
            r8.<init>(r6, r7, r2)
            r7.postOnAnimation(r8)
            return
        L76:
            if (r2 == 0) goto L7f
            com.google.android.material.behavior.m r6 = r6.f6245b
            if (r6 == 0) goto L7f
            r6.a(r7)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.k.onViewReleased(android.view.View, float, float):void");
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View view, int i2) {
        int i3 = this.f6263c;
        return (i3 == -1 || i3 == i2) && this.f6261a.c(view);
    }
}
