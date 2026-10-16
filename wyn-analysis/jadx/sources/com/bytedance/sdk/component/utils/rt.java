package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class rt {
    private static volatile String uef;

    public static String uef() {
        if (!TextUtils.isEmpty(uef)) {
            return uef;
        }
        String str = Build.MODEL;
        uef = str;
        return str;
    }

    public static int uef(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }
}
