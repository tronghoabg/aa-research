package com.bytedance.sdk.openadsdk.orq;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public class cz {
    private static void oa(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            xs.uef("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    private static void uef(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            xs.uef("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    public static void uef(WebView webView) {
        if (webView == null) {
            return;
        }
        oa(webView);
        WebSettings settings = webView.getSettings();
        uef(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            xs.uef("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            xs.uef("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        int i5 = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z2 = i5 >= 28;
        try {
        } catch (Throwable th3) {
            xs.uef("WebViewSettings", "setLayerType error", th3);
        }
        if (!z2) {
            webView.setLayerType(0, null);
        } else {
            if (z2) {
                webView.setLayerType(2, null);
            }
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
