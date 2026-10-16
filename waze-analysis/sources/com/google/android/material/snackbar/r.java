package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r extends o {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f6783e = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: f, reason: collision with root package name */
    private final AccessibilityManager f6784f;

    private r(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.f6784f = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:3:0x0002->B:34:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.material.snackbar.r B(android.view.View r7, java.lang.CharSequence r8) {
        /*
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L9:
            boolean r2 = r7 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L19:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r7 == 0) goto L2a
            android.view.ViewParent r7 = r7.getParent()
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r7 = (android.view.View) r7
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 != 0) goto L2
            r7 = r1
        L2d:
            if (r7 == 0) goto L6b
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int[] r2 = com.google.android.material.snackbar.r.f6783e
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2)
            r3 = 0
            r4 = -1
            int r5 = r2.getResourceId(r3, r4)
            r6 = 1
            int r6 = r2.getResourceId(r6, r4)
            r2.recycle()
            r2 = 2131558504(0x7f0d0068, float:1.8742326E38)
            if (r5 == r4) goto L55
            if (r6 == r4) goto L55
            r2 = 2131558600(0x7f0d00c8, float:1.874252E38)
        L55:
            android.view.View r1 = r1.inflate(r2, r7, r3)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            com.google.android.material.snackbar.r r2 = new com.google.android.material.snackbar.r
            r2.<init>(r0, r7, r1, r1)
            android.widget.TextView r7 = r2.F()
            r7.setText(r8)
            r2.y()
            return r2
        L6b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No suitable parent found from the given view. Please provide a valid view."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.r.B(android.view.View, java.lang.CharSequence):com.google.android.material.snackbar.r");
    }

    private final TextView F() {
        return G().a();
    }

    private final SnackbarContentLayout G() {
        return (SnackbarContentLayout) this.f6777b.getChildAt(0);
    }

    public final void C(int i2) {
        this.f6777b.setBackgroundTintList(ColorStateList.valueOf(i2));
    }

    public final void D(int i2) {
        G().c(i2);
    }

    public final void E(int i2) {
        F().setTextColor(i2);
    }

    @Override // com.google.android.material.snackbar.o
    public final int e() {
        return this.f6784f.getRecommendedTimeoutMillis(super.e(), 3);
    }
}
