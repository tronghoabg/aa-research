package com.google.android.libraries.surveys.internal.view;

/* JADX INFO: loaded from: classes3.dex */
public class ButtonWithMaxTextSize extends com.google.android.material.button.MaterialButton {
    public ButtonWithMaxTextSize(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    private final void c(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.wid.a);
        setTextSize(0, java.lang.Math.min(getTextSize(), typedArrayObtainStyledAttributes.getDimensionPixelSize(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public ButtonWithMaxTextSize(android.content.Context context) {
        super(context);
    }

    public ButtonWithMaxTextSize(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet);
    }
}
