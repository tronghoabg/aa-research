package com.google.android.apps.auto.sdk.ui;

/* JADX INFO: loaded from: classes2.dex */
public class MaxWidthLayout extends android.widget.FrameLayout {
    public int f;

    public MaxWidthLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context.obtainStyledAttributes(attributeSet, defpackage.oyi.c, i, 0));
    }

    private final void a(android.content.res.TypedArray typedArray) {
        int[] iArr = defpackage.oyi.a;
        this.f = typedArray.getDimensionPixelSize(0, 0);
        typedArray.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f == 0) {
            return;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int i3 = this.f;
                    if (measuredWidth > i3) {
                        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec((i3 - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    }
                }
            }
        }
    }

    public MaxWidthLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context.obtainStyledAttributes(attributeSet, defpackage.oyi.c));
    }

    public MaxWidthLayout(android.content.Context context) {
        super(context);
        a(context.obtainStyledAttributes(defpackage.oyi.c));
    }
}
