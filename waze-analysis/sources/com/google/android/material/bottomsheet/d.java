package com.google.android.material.bottomsheet;

import android.os.SystemClock;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.customview.widget.ViewDragHelper;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends ViewDragHelper.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BottomSheetBehavior f6286a;

    d(BottomSheetBehavior bottomSheetBehavior) {
        Objects.requireNonNull(bottomSheetBehavior);
        this.f6286a = bottomSheetBehavior;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View view, int i2, int i3) {
        return view.getLeft();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionVertical(View view, int i2, int i3) {
        return MathUtils.clamp(i2, this.f6286a.e(), getViewVerticalDragRange(view));
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewVerticalDragRange(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f6286a;
        return bottomSheetBehavior.ab() ? bottomSheetBehavior.f6278k : bottomSheetBehavior.f6272e;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i2) {
        if (i2 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f6286a;
            if (bottomSheetBehavior.W) {
                bottomSheetBehavior.y(1);
            }
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
        this.f6286a.q(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewReleased(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r5.f6286a
            r3 = 6
            r4 = 3
            if (r1 >= 0) goto L1f
            boolean r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.A(r2)
            if (r7 == 0) goto L12
        Lf:
            r3 = r4
            goto Le0
        L12:
            int r7 = r6.getTop()
            android.os.SystemClock.uptimeMillis()
            int r8 = r2.f6270c
            if (r7 <= r8) goto Lf
            goto Le0
        L1f:
            boolean r1 = r2.f6274g
            if (r1 == 0) goto L73
            boolean r1 = r2.M(r6, r8)
            if (r1 == 0) goto L73
            float r7 = java.lang.Math.abs(r7)
            float r0 = java.lang.Math.abs(r8)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r0 = 5
            if (r7 >= 0) goto L3f
            int r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.d(r2)
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L4e
        L3f:
            int r7 = r6.getTop()
            int r8 = r2.f6278k
            int r1 = r2.e()
            int r8 = r8 + r1
            int r8 = r8 / 2
            if (r7 <= r8) goto L51
        L4e:
            r3 = r0
            goto Le0
        L51:
            boolean r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.A(r2)
            if (r7 == 0) goto L58
            goto Lf
        L58:
            int r7 = r6.getTop()
            int r8 = r2.e()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r0 = r2.f6270c
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Le0
            goto Lf
        L73:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 4
            if (r0 == 0) goto La2
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L85
            goto La2
        L85:
            boolean r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.A(r2)
            if (r7 == 0) goto L8c
            goto Lbf
        L8c:
            int r7 = r6.getTop()
            int r8 = r2.f6270c
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r2.f6272e
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Lbf
            goto Le0
        La2:
            int r7 = r6.getTop()
            boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.A(r2)
            if (r8 == 0) goto Lc1
            int r8 = r2.f6269b
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r2.f6272e
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Lbf
            goto Lf
        Lbf:
            r3 = r1
            goto Le0
        Lc1:
            int r8 = r2.f6270c
            if (r7 >= r8) goto Ld1
            int r8 = r2.f6272e
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Le0
            goto Lf
        Ld1:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r2.f6272e
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Lbf
        Le0:
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r5.f6286a
            r7 = 1
            com.google.android.material.bottomsheet.BottomSheetBehavior.o(r5, r6, r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.d.onViewReleased(android.view.View, float, float):void");
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View view, int i2) {
        BottomSheetBehavior bottomSheetBehavior = this.f6286a;
        int i3 = bottomSheetBehavior.f6275h;
        if (i3 == 1 || bottomSheetBehavior.o) {
            return false;
        }
        if (i3 == 3 && bottomSheetBehavior.n == i2) {
            View viewT = bottomSheetBehavior.w ? bottomSheetBehavior.ai != null ? (View) bottomSheetBehavior.ai.get() : null : bottomSheetBehavior.T();
            if (viewT != null && viewT.canScrollVertically(-1)) {
                return false;
            }
        }
        SystemClock.uptimeMillis();
        WeakReference weakReference = bottomSheetBehavior.f6279l;
        return weakReference != null && weakReference.get() == view;
    }
}
