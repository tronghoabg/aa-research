package com.afollestad.materialdialogs.color;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* loaded from: classes.dex */
public class FillGridView extends GridView {
    public FillGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }
}
