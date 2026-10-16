package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.gc;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t {
    public static void a(View view, r rVar) {
        ViewCompat.setOnApplyWindowInsetsListener(view, new p(rVar, new s(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new q());
        }
    }

    public static boolean b(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static void c(View view) {
        InputMethodManager inputMethodManagerS = s(view);
        if (inputMethodManagerS != null) {
            inputMethodManagerS.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static int e(Context context, int i2, int i3) {
        TypedValue typedValueH = h(context.getTheme(), i2);
        return (typedValueH == null || typedValueH.type != 16) ? i3 : typedValueH.data;
    }

    public static int f(Context context, int i2, String str) {
        return i(context, i2, str).data;
    }

    public static TypedValue g(Context context, int i2) {
        return h(context.getTheme(), i2);
    }

    public static TypedValue h(Resources.Theme theme, int i2) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue i(Context context, int i2, String str) {
        TypedValue typedValueG = g(context, i2);
        if (typedValueG != null) {
            return typedValueG;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static boolean j(Context context, int i2, boolean z) {
        return k(context.getTheme(), i2, z);
    }

    public static boolean k(Resources.Theme theme, int i2, boolean z) {
        TypedValue typedValueH = h(theme, i2);
        return (typedValueH == null || typedValueH.type != 18) ? z : typedValueH.data != 0;
    }

    public static Typeface l(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, MathUtils.clamp(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static int m(TypedArray typedArray, int i2, int i3) {
        return typedArray.hasValue(i2) ? i2 : i3;
    }

    public static ColorStateList n(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateList;
    }

    public static ColorStateList o(Context context, gc gcVar, int i2) {
        int iF;
        ColorStateList colorStateList;
        return (!gcVar.s(i2) || (iF = gcVar.f(i2, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(context, iF)) == null) ? gcVar.g(i2) : colorStateList;
    }

    public static Drawable p(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableD;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableD = android.support.a.i.d(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableD;
    }

    public static boolean q(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean r(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    private static InputMethodManager s(View view) {
        return (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
    }
}
