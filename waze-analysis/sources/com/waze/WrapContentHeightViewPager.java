package com.waze;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class WrapContentHeightViewPager extends ViewPager {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13567a;

    public WrapContentHeightViewPager(Context context) {
        super(context);
    }

    public final void a(boolean z) {
        this.f13567a = z;
        requestLayout();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected final void onMeasure(int i2, int i3) throws Resources.NotFoundException {
        if (!this.f13567a) {
            super.onMeasure(i2, i3);
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                childAt.measure(i2, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i4) {
                    i4 = measuredHeight;
                }
            }
            i3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    public WrapContentHeightViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
