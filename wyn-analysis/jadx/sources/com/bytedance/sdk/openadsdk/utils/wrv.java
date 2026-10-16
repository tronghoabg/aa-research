package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class wrv {
    private static String oa(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.oib.moa.uef.oa((String) null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void uef(String str) {
        uef("any_door_id", str);
    }

    public static String uef() {
        return oa("any_door_id", null);
    }

    private static void uef(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
