package com.bytedance.adsdk.ugeno.ivm.uef;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
public class oa extends uef {
    public oa(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ivm.uef.uef
    public Drawable oa(int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i5);
        return gradientDrawable;
    }
}
