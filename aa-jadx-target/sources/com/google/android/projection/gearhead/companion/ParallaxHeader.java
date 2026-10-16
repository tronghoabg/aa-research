package com.google.android.projection.gearhead.companion;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ParallaxHeader extends android.widget.FrameLayout {
    public int a;
    private final defpackage.ca b;

    public ParallaxHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = new defpackage.xad(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) getParent();
        if (recyclerView != null) {
            recyclerView.ay(this.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) getParent();
        if (recyclerView != null) {
            recyclerView.az(this.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            android.view.View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int i14 = i3 - i;
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = layoutParams.gravity;
                if (i15 == -1) {
                    i15 = 8388659;
                }
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i15, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i7 = layoutParams.leftMargin;
                    } else {
                        i5 = i14 - measuredWidth;
                        i6 = layoutParams.rightMargin;
                    }
                    i8 = i15 & 112;
                    i9 = i4 - i2;
                    if (i8 != 16) {
                        if (i8 == 48 && i8 == 80) {
                            i10 = i9 - measuredHeight;
                            i11 = layoutParams.bottomMargin;
                        }
                        int i16 = (int) (((double) this.a) * 0.5d);
                        childAt.layout(i7, i12 + i16, measuredWidth + i7, measuredHeight + i12 + i16);
                    } else {
                        i10 = ((i9 - measuredHeight) / 2) + layoutParams.topMargin;
                        i11 = layoutParams.bottomMargin;
                    }
                    i12 = i10 - i11;
                    int i17 = (int) (((double) this.a) * 0.5d);
                    childAt.layout(i7, i12 + i17, measuredWidth + i7, measuredHeight + i12 + i17);
                } else {
                    i5 = ((i14 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                i8 = i15 & 112;
                i9 = i4 - i2;
                if (i8 != 16) {
                    i12 = i8 == 48 ? layoutParams.topMargin : layoutParams.topMargin;
                    int i18 = (int) (((double) this.a) * 0.5d);
                    childAt.layout(i7, i12 + i18, measuredWidth + i7, measuredHeight + i12 + i18);
                } else {
                    i10 = ((i9 - measuredHeight) / 2) + layoutParams.topMargin;
                    i11 = layoutParams.bottomMargin;
                }
                i12 = i10 - i11;
                int i19 = (int) (((double) this.a) * 0.5d);
                childAt.layout(i7, i12 + i19, measuredWidth + i7, measuredHeight + i12 + i19);
            }
        }
    }
}
