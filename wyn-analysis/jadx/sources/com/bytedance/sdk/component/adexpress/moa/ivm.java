package com.bytedance.sdk.component.adexpress.moa;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class ivm {
    public static boolean oa(String str) {
        return com.bytedance.sdk.component.adexpress.moa.oa() && uef(str);
    }

    public static boolean uef(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }
}
