package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b1.AbstractC1492a;
import i.AbstractC2820a;

/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f43761a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f43762b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f43763c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f43764d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f43765e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f43766f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f43767g = new int[1];

    public static void a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC2820a.f36447j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i5) {
        ColorStateList colorStateListD = d(context, i5);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f43762b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f43761a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return AbstractC1492a.d(c(context, i5), Math.round(Color.alpha(r4) * f10));
    }

    public static int c(Context context, int i5) {
        int[] iArr = f43767g;
        iArr[0] = i5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i5) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f43767g;
        iArr[0] = i5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = Y0.e.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
