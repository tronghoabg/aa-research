package com.bytedance.sdk.component.uef;

import A7.AbstractC0279p0;
import N0.a;
import android.text.TextUtils;

/* loaded from: classes.dex */
class oib {
    private static boolean uef;

    public static String uef(Throwable th) {
        return AbstractC0279p0.j(th instanceof ab ? ((ab) th).uef : 0, "}", new StringBuilder("{\"code\":"));
    }

    public static String uef(String str, boolean z2) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (uef && !z2) {
            strSubstring = str.substring(1, str.length() - 1);
        } else {
            strSubstring = "";
        }
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!strSubstring.isEmpty()) {
            return strConcat + "," + strSubstring + "}";
        }
        return a.f(strConcat, "}");
    }

    public static String uef() {
        return "";
    }

    public static void uef(boolean z2) {
        uef = z2;
    }
}
