package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.car.app.model.Alert;
import com.google.android.material.button.MaterialButton;
import defpackage.whe;

/* loaded from: classes3.dex */
public class ButtonWithMaxTextSize extends MaterialButton {
    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    private final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, whe.a);
        setTextSize(0, Math.min(getTextSize(), typedArrayObtainStyledAttributes.getDimensionPixelSize(0, Alert.DURATION_SHOW_INDEFINITELY)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public ButtonWithMaxTextSize(Context context) {
        super(context);
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet);
    }
}
