package com.bytedance.sdk.openadsdk.core.ivm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.Button;

/* loaded from: classes3.dex */
public class uef extends Button {
    public uef(Context context) {
        super(context);
        uef();
    }

    private void uef() {
        setTextDirection(5);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i5, int i10, int i11, int i12) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i5, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setGravity(int i5) {
        super.setGravity(cz.uef(i5));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(cz.uef(this, layoutParams));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i5, int i10, int i11, int i12) {
        super.setPaddingRelative(i5, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
}
