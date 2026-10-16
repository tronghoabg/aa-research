package com.google.android.apps.auto.components.drawer;

/* JADX INFO: loaded from: classes2.dex */
public class AlphaJumpKey extends android.widget.Button {
    public AlphaJumpKey(android.content.Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, size);
    }

    public AlphaJumpKey(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlphaJumpKey(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AlphaJumpKey(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
