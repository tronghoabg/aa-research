package me.zhanghai.android.materialprogressbar.internal;

import android.content.Context;
import android.content.res.TypedArray;

/* loaded from: classes5.dex */
public class ThemeUtils {
    private ThemeUtils() {
    }

    public static int getColorFromAttrRes(int i5, int i10, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i5});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static float getFloatFromAttrRes(int i5, float f10, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i5});
        try {
            return typedArrayObtainStyledAttributes.getFloat(0, f10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
