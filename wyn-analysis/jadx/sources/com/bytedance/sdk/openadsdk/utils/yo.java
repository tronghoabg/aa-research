package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes3.dex */
public class yo {
    public static int uef = -1;

    public static int uef(Context context, int i5, int i10) {
        int iUef = uef(context, i10);
        if (iUef == -1) {
            return uef;
        }
        return Math.max(Math.min(i5 > 655 ? Math.round((i5 / 728.0f) * 90.0f) : i5 > 632 ? 81 : i5 > 526 ? Math.round((i5 / 468.0f) * 60.0f) : i5 > 432 ? 68 : Math.round((i5 / 320.0f) * 50.0f), Math.min(90, Math.round(iUef * 0.15f))), 50);
    }

    public static int uef(Context context, int i5) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (configuration = resources.getConfiguration()) != null) {
                    int i10 = configuration.orientation;
                    if (i5 == 0) {
                        i5 = i10;
                    }
                    if (i5 == i10) {
                        return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                    }
                    return Math.round(displayMetrics.widthPixels / displayMetrics.density);
                }
            } catch (Throwable unused) {
                return uef;
            }
        }
        return uef;
    }
}
