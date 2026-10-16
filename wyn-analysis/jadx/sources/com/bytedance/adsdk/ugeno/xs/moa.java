package com.bytedance.adsdk.ugeno.xs;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class moa {

    /* renamed from: oa, reason: collision with root package name */
    private static Resources f24776oa;
    private static String uef;
    private static Context yo;

    public static int oa(Context context, String str) {
        return uef(context, str, "drawable");
    }

    public static void uef(String str) {
        uef = str;
    }

    private static String uef(Context context) {
        if (uef == null) {
            uef = context.getPackageName();
        }
        return uef;
    }

    private static int uef(Context context, String str, String str2) {
        if (f24776oa == null) {
            f24776oa = context.getResources();
        }
        return f24776oa.getIdentifier(str, str2, uef(context));
    }

    public static int uef(Context context, String str) {
        return uef(context, str, "raw");
    }
}
