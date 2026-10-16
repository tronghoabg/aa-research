package com.google.android.projection.gearhead.sdk;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes3.dex */
public class CheckboxWrapperView extends CheckBox {
    public CheckboxWrapperView(Context context) {
        super(context);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass().getClassLoader() != getClass().getClassLoader()) {
            super.onRestoreInstanceState(onSaveInstanceState());
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    public CheckboxWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckboxWrapperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
