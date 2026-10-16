package com.google.android.apps.auto.components.drawer;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import androidx.drawerlayout.widget.DrawerLayout;
import defpackage.lbb;

/* loaded from: classes2.dex */
public class MotionFilteringDrawerLayout extends DrawerLayout {
    private lbb k;
    private final Context l;

    public MotionFilteringDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = context;
        y(1.0f);
        setFocusable(0);
        this.g = getContext().getDrawable(R.color.transparent);
        invalidate();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public final void k(int i) {
        super.k(Color.argb((int) (Color.alpha(i) * 0.8f), Color.red(i), Color.green(i), Color.blue(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.u()
            if (r0 == 0) goto L89
            lbb r0 = r8.k
            int r1 = r9.getActionMasked()
            int r2 = r9.getActionIndex()
            r3 = 0
            if (r1 != 0) goto L18
            r0.a()
            goto L7e
        L18:
            if (r1 == 0) goto L7e
            r4 = 1
            if (r1 == r4) goto L7a
            r5 = 2
            if (r1 == r5) goto L4e
            r5 = 3
            if (r1 == r5) goto L7a
            r5 = 5
            if (r1 == r5) goto L42
            r3 = 6
            if (r1 == r3) goto L2a
            goto L89
        L2a:
            int r1 = r9.getPointerId(r2)
            boolean r2 = r0.c(r1)
            if (r2 == 0) goto L89
            float[] r2 = r0.b
            r3 = 0
            r2[r1] = r3
            int r2 = r0.c
            int r1 = r4 << r1
            int r1 = ~r1
            r1 = r1 & r2
            r0.c = r1
            goto L89
        L42:
            float r1 = r9.getAxisValue(r3, r2)
            int r2 = r9.getPointerId(r2)
            r0.b(r1, r2)
            goto L89
        L4e:
            int r1 = r9.getPointerCount()
            r2 = r3
            r5 = r2
        L54:
            if (r2 >= r1) goto L77
            int r6 = r9.getPointerId(r2)
            boolean r7 = r0.c(r6)
            if (r7 == 0) goto L74
            float r5 = r9.getAxisValue(r3, r2)
            float[] r7 = r0.b
            r6 = r7[r6]
            float r5 = r5 - r6
            float r6 = r0.a
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L89
            r5 = r4
        L74:
            int r2 = r2 + 1
            goto L54
        L77:
            if (r5 == 0) goto L89
            return r3
        L7a:
            r0.a()
            goto L89
        L7e:
            float r1 = r9.getAxisValue(r3)
            int r2 = r9.getPointerId(r3)
            r0.b(r1, r2)
        L89:
            boolean r8 = super.onInterceptTouchEvent(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.drawer.MotionFilteringDrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void y(float f) {
        this.k = new lbb(ViewConfiguration.get(this.l).getScaledTouchSlop() * f);
    }

    public MotionFilteringDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MotionFilteringDrawerLayout(Context context) {
        this(context, null);
    }
}
