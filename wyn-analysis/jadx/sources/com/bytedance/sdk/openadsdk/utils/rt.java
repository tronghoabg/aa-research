package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes3.dex */
public class rt {
    public static boolean uef() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 33) {
            return i5 >= 32 && uef("T", Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean uef(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
