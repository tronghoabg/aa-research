package com.google.android.material.snackbar;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.google.android.projection.gearhead.R;
import defpackage.sqd;
import defpackage.wvs;

/* loaded from: classes3.dex */
public final class Snackbar extends BaseTransientBottomBar {
    private static final int[] t = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    private final AccessibilityManager u;
    private boolean v;

    private Snackbar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.u = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static Snackbar k(View view, int i) {
        return l(view, view.getResources().getText(i), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:3:0x0002->B:34:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.material.snackbar.Snackbar l(android.view.View r7, java.lang.CharSequence r8, int r9) {
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
            if (r7 == 0) goto L6c
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int[] r2 = com.google.android.material.snackbar.Snackbar.t
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2)
            r3 = 0
            r4 = -1
            int r5 = r2.getResourceId(r3, r4)
            r6 = 1
            int r6 = r2.getResourceId(r6, r4)
            r2.recycle()
            r2 = 2131624141(0x7f0e00cd, float:1.8875453E38)
            if (r5 == r4) goto L55
            if (r6 == r4) goto L55
            r2 = 2131624392(0x7f0e01c8, float:1.8875962E38)
        L55:
            android.view.View r1 = r1.inflate(r2, r7, r3)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            com.google.android.material.snackbar.Snackbar r2 = new com.google.android.material.snackbar.Snackbar
            r2.<init>(r0, r7, r1, r1)
            com.google.android.material.snackbar.SnackbarContentLayout r7 = r2.n()
            android.widget.TextView r7 = r7.a
            r7.setText(r8)
            r2.k = r9
            return r2
        L6c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No suitable parent found from the given view. Please provide a valid view."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.l(android.view.View, java.lang.CharSequence, int):com.google.android.material.snackbar.Snackbar");
    }

    private final SnackbarContentLayout n() {
        return (SnackbarContentLayout) this.j.getChildAt(0);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final int a() {
        int i = this.k;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = this.v;
        if (i2 >= 29) {
            return this.u.getRecommendedTimeoutMillis(i, (true != z ? 0 : 4) | 3);
        }
        if (z && this.u.isTouchExplorationEnabled()) {
            return -2;
        }
        return i;
    }

    public final void m(int i, View.OnClickListener onClickListener) {
        CharSequence text = this.i.getText(i);
        Button button = n().b;
        if (TextUtils.isEmpty(text)) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.v = false;
        } else {
            this.v = true;
            button.setVisibility(0);
            button.setText(text);
            button.setOnClickListener(new sqd(this, onClickListener, 16));
        }
    }

    public static final class SnackbarLayout extends wvs {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // defpackage.wvs, android.widget.FrameLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
