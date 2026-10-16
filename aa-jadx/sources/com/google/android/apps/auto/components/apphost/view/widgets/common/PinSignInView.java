package com.google.android.apps.auto.components.apphost.view.widgets.common;

/* JADX INFO: loaded from: classes2.dex */
public class PinSignInView extends android.widget.FrameLayout {
    public android.widget.TextView a;
    private final int b;

    public PinSignInView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.projection.gearhead.R.attr.templateSignInMethodViewMaxWidth});
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.pin_text);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = this.b;
        int size = android.view.View.MeasureSpec.getSize(i);
        if (i3 > 0 && i3 < size) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(i3, android.view.View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    public PinSignInView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinSignInView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PinSignInView(android.content.Context context) {
        this(context, null);
    }
}
