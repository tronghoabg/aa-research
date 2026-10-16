package com.google.android.projection.gearhead.companion;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.ca;
import defpackage.wzh;

/* loaded from: classes.dex */
public class ParallaxHeader extends FrameLayout {
    public int a;
    private final ca b;

    public ParallaxHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = new wzh(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView recyclerView = (RecyclerView) getParent();
        if (recyclerView != null) {
            recyclerView.ay(this.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RecyclerView recyclerView = (RecyclerView) getParent();
        if (recyclerView != null) {
            recyclerView.az(this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.getChildCount()
            r0 = 0
        L5:
            if (r0 >= r11) goto L80
            android.view.View r1 = r10.getChildAt(r0)
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto L7d
            int r2 = r14 - r12
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            int r6 = r3.gravity
            r7 = -1
            if (r6 != r7) goto L2b
            r6 = 8388659(0x800033, float:1.1755015E-38)
        L2b:
            int r7 = r10.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L42
            r8 = 5
            if (r7 == r8) goto L3e
            int r2 = r3.leftMargin
            goto L4b
        L3e:
            int r2 = r2 - r4
            int r7 = r3.rightMargin
            goto L4a
        L42:
            int r2 = r2 - r4
            int r2 = r2 / 2
            int r7 = r3.leftMargin
            int r2 = r2 + r7
            int r7 = r3.rightMargin
        L4a:
            int r2 = r2 - r7
        L4b:
            r6 = r6 & 112(0x70, float:1.57E-43)
            int r7 = r15 - r13
            r8 = 16
            if (r6 == r8) goto L65
            r8 = 48
            if (r6 == r8) goto L62
            r8 = 80
            if (r6 == r8) goto L5e
            int r3 = r3.topMargin
            goto L6f
        L5e:
            int r7 = r7 - r5
            int r3 = r3.bottomMargin
            goto L6d
        L62:
            int r3 = r3.topMargin
            goto L6f
        L65:
            int r7 = r7 - r5
            int r7 = r7 / 2
            int r6 = r3.topMargin
            int r7 = r7 + r6
            int r3 = r3.bottomMargin
        L6d:
            int r3 = r7 - r3
        L6f:
            int r6 = r10.a
            double r6 = (double) r6
            int r4 = r4 + r2
            int r5 = r5 + r3
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r6 = r6 * r8
            int r6 = (int) r6
            int r5 = r5 + r6
            int r3 = r3 + r6
            r1.layout(r2, r3, r4, r5)
        L7d:
            int r0 = r0 + 1
            goto L5
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.projection.gearhead.companion.ParallaxHeader.onLayout(boolean, int, int, int, int):void");
    }
}
