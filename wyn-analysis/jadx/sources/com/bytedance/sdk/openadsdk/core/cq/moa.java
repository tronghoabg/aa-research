package com.bytedance.sdk.openadsdk.core.cq;

import N0.a;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.dj;

/* loaded from: classes3.dex */
public class moa {
    public static String uef(String str) {
        return TextUtils.isEmpty(str) ? str : uef(dj.oa().dhk(), str);
    }

    public static String uef(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith("http://") || str2.startsWith("https://")) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return a.g(str, "/static/", str2);
        }
        return a.g(str, "static/", str2);
    }
}
