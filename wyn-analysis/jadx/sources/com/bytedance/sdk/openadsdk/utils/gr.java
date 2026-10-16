package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;

/* loaded from: classes3.dex */
public class gr {
    public static String uef(Context context) {
        int iUef = com.bytedance.sdk.component.utils.gr.uef(context, 0L);
        return iUef != 2 ? iUef != 3 ? iUef != 4 ? iUef != 5 ? iUef != 6 ? "mobile" : "5g" : "4g" : "wifi" : "3g" : "2g";
    }
}
