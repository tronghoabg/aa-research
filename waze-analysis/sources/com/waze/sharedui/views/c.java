package com.waze.sharedui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class c extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f39221a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39222b;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.waze.sharedui.n.f39064b);
        this.f39221a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f39222b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4 = this.f39221a;
        int size = View.MeasureSpec.getSize(i2);
        if (i4 > 0 && i4 < size) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(i2));
        }
        int size2 = View.MeasureSpec.getSize(i3);
        int i5 = this.f39222b;
        if (i5 > 0 && i5 < size2) {
            i3 = View.MeasureSpec.makeMeasureSpec(i5, View.MeasureSpec.getMode(i3));
        }
        super.onMeasure(i2, i3);
    }

    public c(Context context) {
        super(context);
        this.f39221a = 0;
        this.f39222b = 0;
    }
}
