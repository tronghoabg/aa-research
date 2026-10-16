package com.google.android.apps.auto.components.drawer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/* loaded from: classes2.dex */
public class AlphaJumpKey extends Button {
    public AlphaJumpKey(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, size);
    }

    public AlphaJumpKey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlphaJumpKey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AlphaJumpKey(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
