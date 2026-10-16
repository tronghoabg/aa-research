package com.bytedance.sdk.component.adexpress.moa;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class lw {
    public static boolean uef(String str) {
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
