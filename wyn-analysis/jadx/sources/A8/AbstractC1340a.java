package a8;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: a8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1340a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f17397a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final String f17398b = AbstractC1340a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f17397a, 0)) != 0) {
            Log.w(f17398b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z2 = false;
        boolean z10 = false;
        for (int i5 : iArr) {
            if (i5 == 16842910) {
                z2 = true;
            } else if (i5 == 16842908 || i5 == 16842919 || i5 == 16843623) {
                z10 = true;
            }
        }
        return z2 && z10;
    }
}
