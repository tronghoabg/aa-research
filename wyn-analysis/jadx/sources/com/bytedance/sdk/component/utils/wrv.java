package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* loaded from: classes.dex */
public class wrv {
    private static Context uef;

    private static Configuration oa(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }

    public static void uef(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            uef = context.createConfigurationContext(oa(context, str, str2));
        } catch (Throwable th) {
            th.getMessage();
        }
        orq.uef(uef);
    }
}
