package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public class dhk {
    public static void uef(Uri uri, com.bytedance.sdk.openadsdk.core.oyt oytVar) {
        if (oytVar == null || !oytVar.uef(uri)) {
            return;
        }
        try {
            oytVar.oa(uri);
        } catch (Exception e7) {
            e7.toString();
        }
    }

    public static String uef(WebView webView, int i5) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i5;
    }
}
