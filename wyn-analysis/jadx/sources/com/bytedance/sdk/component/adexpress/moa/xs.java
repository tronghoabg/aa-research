package com.bytedance.sdk.component.adexpress.moa;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.orq;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* loaded from: classes.dex */
public class xs {
    private static float moa(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int oa(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().oa();
        }
        float fMoa = moa(context);
        if (fMoa <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fMoa = 1.0f;
        }
        return (int) ((f10 / fMoa) + 0.5f);
    }

    public static int uef(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static float yo(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().oa();
        }
        return f10 * moa(context);
    }

    public static float uef(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().oa();
        }
        return (f10 * moa(context)) + 0.5f;
    }

    public static int oa(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().oa();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String yo(Context context) {
        String language;
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = orq.oa(context).getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return uef(language);
    }

    public static int uef(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().oa();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String uef(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
