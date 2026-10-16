package com.bytedance.sdk.openadsdk.core.ivm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
public class xs extends RelativeLayout {
    public xs(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
    }

    @Override // android.widget.RelativeLayout
    public void setGravity(int i5) {
        super.setGravity(cz.uef(i5));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(cz.uef(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i5, int i10, int i11, int i12) {
        super.setPaddingRelative(i5, i10, i11, i12);
    }

    public xs(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }
}
