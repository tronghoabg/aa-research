package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class orq {
    private static boolean ivm = false;
    private static boolean lw = false;
    private static String moa;

    /* renamed from: oa, reason: collision with root package name */
    private static String f25102oa;
    private static Context uef;
    private static Resources yo;

    public static int bcc(Context context, String str) {
        return uef(context, str, "color");
    }

    public static int cz(Context context, String str) {
        return uef(context, str, "anim");
    }

    public static int ivm(Context context, String str) {
        return uef(context, str, "style");
    }

    public static int lw(Context context, String str) {
        return uef(context, str, "id");
    }

    private static String moa(Context context) {
        if (moa == null) {
            moa = context.getPackageName();
        }
        return moa;
    }

    public static int oa(Context context, String str) {
        return uef(context, str, "string");
    }

    public static void uef(Context context) {
        uef = context;
    }

    public static int xs(Context context, String str) {
        return oa(context).getColor(bcc(context, str));
    }

    public static Drawable yo(Context context, String str) {
        try {
            return oa(context).getDrawable(moa(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Resources oa(Context context) {
        Resources resources = yo;
        if (resources == null) {
            resources = null;
        }
        Context context2 = uef;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static void uef(String str) {
        moa = str;
    }

    private static int uef(Context context, String str, String str2) {
        int identifier = oa(context).getIdentifier(str, str2, moa(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!lw) {
            yo(context);
            return oa(context).getIdentifier(str, str2, moa(context));
        }
        return context.getResources().getIdentifier(str, str2, moa(context));
    }

    public static synchronized void yo(Context context) {
        try {
            if (TextUtils.isEmpty(f25102oa)) {
                return;
            }
            lw = true;
        } catch (Throwable th) {
            Log.e("ResourceHelp", "makePluginResources failed", th);
        }
    }

    public static int moa(Context context, String str) {
        try {
            return uef(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String uef(Context context, String str) {
        return oa(context).getString(oa(context, str));
    }
}
