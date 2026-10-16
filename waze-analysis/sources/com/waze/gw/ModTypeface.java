package com.waze.gw;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes10.dex */
final class ModTypeface {
    private static final String BRAND_FONT = "gw_fonts/Anta-Regular.ttf";
    private static final String SPEED_FONT = "gw_fonts/TGL_0-1451Eng.ttf";
    private static volatile boolean attempted;
    private static volatile Typeface brand;
    private static volatile boolean brandAttempted;
    private static volatile Typeface speed;

    private ModTypeface() {
    }

    static void applySpeed(TextView textView) {
        if (textView == null) {
            return;
        }
        Typeface typefaceSpeed = speed(textView.getContext());
        if (typefaceSpeed == null) {
            typefaceSpeed = Typeface.DEFAULT_BOLD;
        }
        textView.setTypeface(typefaceSpeed);
        textView.setIncludeFontPadding(false);
        textView.setTextScaleX(1.16f);
    }

    static void applyBrand(TextView textView) {
        if (textView == null) {
            return;
        }
        Typeface typefaceBrand = brand(textView.getContext());
        if (typefaceBrand == null) {
            typefaceBrand = Typeface.DEFAULT_BOLD;
        }
        textView.setTypeface(typefaceBrand);
        textView.setIncludeFontPadding(false);
    }

    static void fitSpeed(TextView textView, int i2, float f2, float f3) {
        if (textView == null) {
            return;
        }
        if (i2 >= 100) {
            f2 = f3;
        }
        if (Math.abs(textView.getTextSize() - (textView.getResources().getDisplayMetrics().scaledDensity * f2)) > 0.5f) {
            textView.setTextSize(f2);
        }
    }

    static Typeface speed(Context context) {
        if (context == null) {
            return null;
        }
        if (!attempted) {
            synchronized (ModTypeface.class) {
                if (!attempted) {
                    try {
                        speed = Typeface.createFromAsset(context.getAssets(), SPEED_FONT);
                    } catch (Throwable th) {
                    }
                    attempted = true;
                }
            }
        }
        return speed;
    }

    private static Typeface brand(Context context) {
        if (context == null) {
            return null;
        }
        if (!brandAttempted) {
            synchronized (ModTypeface.class) {
                if (!brandAttempted) {
                    try {
                        brand = Typeface.createFromAsset(context.getAssets(), BRAND_FONT);
                    } catch (Throwable th) {
                    }
                    brandAttempted = true;
                }
            }
        }
        return brand;
    }
}
