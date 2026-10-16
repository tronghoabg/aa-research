package com.waze.view.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class BoundedLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f45032a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45033b;

    public BoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BoundedView);
        this.f45032a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f45033b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BoundedView_bounded_height, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4 = this.f45032a;
        int size = View.MeasureSpec.getSize(i2);
        if (i4 > 0 && i4 < size) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(i2));
        }
        int size2 = View.MeasureSpec.getSize(i3);
        int i5 = this.f45033b;
        if (i5 > 0 && i5 < size2) {
            i3 = View.MeasureSpec.makeMeasureSpec(i5, View.MeasureSpec.getMode(i3));
        }
        super.onMeasure(i2, i3);
    }

    public BoundedLinearLayout(Context context) {
        super(context);
        this.f45032a = 0;
        this.f45033b = 0;
    }
}
