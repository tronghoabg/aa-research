package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.ColorUtils;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class fz {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f1538f = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    static final int[] f1533a = {-16842910};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f1534b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f1535c = {R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f1536d = {R.attr.state_checked};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f1537e = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f1539g = new int[1];

    public static int a(Context context, int i2) {
        ColorStateList colorStateListC = c(context, i2);
        if (colorStateListC != null && colorStateListC.isStateful()) {
            return colorStateListC.getColorForState(f1533a, colorStateListC.getDefaultColor());
        }
        ThreadLocal threadLocal = f1538f;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return ColorUtils.setAlphaComponent(b(context, i2), Math.round(Color.alpha(r4) * f2));
    }

    public static int b(Context context, int i2) {
        int[] iArr = f1539g;
        iArr[0] = i2;
        gc gcVarM = gc.m(context, null, iArr);
        try {
            return gcVarM.t(0);
        } finally {
            gcVarM.q();
        }
    }

    public static ColorStateList c(Context context, int i2) {
        int[] iArr = f1539g;
        iArr[0] = i2;
        gc gcVarM = gc.m(context, null, iArr);
        try {
            return gcVarM.g(0);
        } finally {
            gcVarM.q();
        }
    }

    public static void d(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.support.v7.a.a.f488j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
