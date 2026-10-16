package com.bytedance.sdk.component.adexpress.moa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
public class yo {
    public static Drawable uef(Context context, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        if (context == null || xsVar == null) {
            return null;
        }
        return uef(context, (int) xs.uef(context, xsVar.bs()), xsVar.ab(), xsVar.pz());
    }

    public static Drawable uef(Context context, int i5, int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i5, i10);
        }
        gradientDrawable.setColor(i11);
        return gradientDrawable;
    }
}
