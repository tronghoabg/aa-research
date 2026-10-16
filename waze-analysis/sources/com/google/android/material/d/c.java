package com.google.android.material.d;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Window;
import androidx.core.view.WindowCompat;
import com.google.android.material.focus.d;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {
    public static Drawable a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static void b(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(outline, path);
        } else {
            try {
                a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static void c(Window window, Integer num) {
        boolean z = true;
        if (num != null && num.intValue() != 0) {
            z = false;
        }
        int iC = d.c(window.getContext(), R.attr.colorBackground, -16777216);
        if (z) {
            num = Integer.valueOf(iC);
        }
        Integer numValueOf = Integer.valueOf(iC);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.getContext();
        window.getContext();
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(f(d.f(num.intValue())));
        numValueOf.getClass();
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(f(d.f(iC)));
    }

    public static boolean d() {
        return g().equals("lge") || g().equals("samsung");
    }

    public static boolean e() {
        return g().equals("meizu");
    }

    private static boolean f(boolean z) {
        return d.f(0) || z;
    }

    private static String g() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }
}
