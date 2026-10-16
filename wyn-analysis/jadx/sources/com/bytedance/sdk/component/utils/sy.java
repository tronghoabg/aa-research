package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class sy {
    public static boolean bcc(Context context) {
        if (context == null) {
            return false;
        }
        int iYo = yo(context);
        return iYo == 2 || iYo == 3 || iYo == 4 || iYo == 5 || iYo == 6;
    }

    public static boolean ivm(Context context) {
        return yo(context) == 6;
    }

    public static boolean lw(Context context) {
        return yo(context) == 5;
    }

    public static boolean moa(Context context) {
        return yo(context) == 4;
    }

    public static int oa(Context context) {
        int iYo = yo(context);
        if (iYo == 1) {
            return 0;
        }
        if (iYo == 4) {
            return 1;
        }
        if (iYo == 5) {
            return 4;
        }
        if (iYo != 6) {
            return iYo;
        }
        return 6;
    }

    public static boolean uef(Context context) {
        return yo(context) != 0;
    }

    public static String xs(Context context) {
        int iYo = yo(context);
        return iYo != 2 ? iYo != 3 ? iYo != 4 ? iYo != 5 ? iYo != 6 ? "mobile" : "5g" : "4g" : "wifi" : "3g" : "2g";
    }

    public static int yo(Context context) {
        return gr.uef(context, 60000L);
    }

    public static boolean uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
