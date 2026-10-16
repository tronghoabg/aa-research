package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* loaded from: classes3.dex */
public class oyt {
    private static String uef;

    public static String oa() {
        if (TextUtils.isEmpty(uef)) {
            uef = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return uef;
    }

    public static boolean uef() {
        return com.bytedance.sdk.component.utils.wk.yo() && com.bytedance.sdk.openadsdk.core.zjm.oa().wk() && com.bytedance.sdk.openadsdk.core.zjm.oa().bs();
    }

    public static boolean yo() {
        return false;
    }

    public static String uef(String str) {
        try {
            if (!uef()) {
                return str;
            }
            String strSy = com.bytedance.sdk.openadsdk.core.zjm.oa().sy();
            if (TextUtils.isEmpty(strSy)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(strSy)));
            return Uri.parse(str).buildUpon().appendQueryParameter(oa(), strSy).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
