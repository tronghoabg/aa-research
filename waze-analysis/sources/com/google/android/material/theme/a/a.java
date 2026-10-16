package com.google.android.material.theme.a;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6921a = {R.attr.theme, com.waze.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6922b = {com.waze.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i2, int i3) {
        return b(context, attributeSet, i2, i3, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i2, int i3, int[] iArr) {
        int i4 = c(context, attributeSet, f6922b, i2, i3)[0];
        boolean z = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == i4;
        if (i4 == 0 || z) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
        int[] iArrC = c(context, attributeSet, iArr, i2, i3);
        int length = iArrC.length;
        for (int i5 = 0; i5 < length; i5 = 1) {
            int i6 = iArrC[0];
            if (i6 != 0) {
                contextThemeWrapper.getTheme().applyStyle(i6, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6921a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId, true);
        }
        return contextThemeWrapper;
    }

    private static int[] c(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        if (length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 = 0; i4 < iArr.length; i4 = 1) {
                iArr2[0] = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }
}
