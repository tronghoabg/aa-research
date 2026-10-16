package com.google.android.projection.gearhead.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class CheckboxWrapperView extends android.widget.CheckBox {
    public CheckboxWrapperView(android.content.Context context) {
        super(context);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable.getClass().getClassLoader() != getClass().getClassLoader()) {
            super.onRestoreInstanceState(onSaveInstanceState());
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    public CheckboxWrapperView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckboxWrapperView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
