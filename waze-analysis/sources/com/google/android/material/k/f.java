package com.google.android.material.k;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.PathParser;
import androidx.dynamicanimation.animation.SpringForce;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class f {
    public static void c(View view, k kVar) {
        if (kVar.D()) {
            float elevation = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                elevation += ((View) parent).getElevation();
            }
            kVar.x(elevation);
        }
    }

    public static TimeInterpolator d(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!i(strValueOf, "cubic-bezier") && !i(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!i(strValueOf, "cubic-bezier")) {
            if (i(strValueOf, "path")) {
                return new PathInterpolator(PathParser.createPathFromPathData(h(strValueOf, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(strValueOf)));
        }
        String[] strArrSplit = h(strValueOf, "cubic-bezier").split(",");
        int length = strArrSplit.length;
        if (length == 4) {
            return new PathInterpolator(g(strArrSplit, 0), g(strArrSplit, 1), g(strArrSplit, 2), g(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + length);
    }

    public static SpringForce e(Context context) {
        TypedValue typedValueG = com.google.android.material.internal.t.g(context, R.attr.motionSpringFastSpatial);
        TypedArray typedArrayObtainStyledAttributes = typedValueG == null ? context.obtainStyledAttributes(null, com.google.android.material.f.a.f6514a, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueG.resourceId, com.google.android.material.f.a.f6514a);
        SpringForce springForce = new SpringForce();
        try {
            float f2 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f3 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f3 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            springForce.setStiffness(f2);
            springForce.setDampingRatio(f3);
            return springForce;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static f f(int i2) {
        return i2 != 1 ? new n() : new e();
    }

    private static float g(String[] strArr, int i2) throws NumberFormatException {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    private static String h(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean i(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public void a(ab abVar, float f2, float f3) {
    }

    public void b(float f2, float f3, float f4, ab abVar) {
        abVar.c(f2, 0.0f);
    }
}
