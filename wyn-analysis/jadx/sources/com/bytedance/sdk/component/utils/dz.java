package com.bytedance.sdk.component.utils;

import android.webkit.WebView;

/* loaded from: classes.dex */
public class dz {
    private static final uef uef = new oa();

    public static class oa extends uef {
        private oa() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.dz.uef
        public void uef(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    boolean z2 = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static class uef {
        private uef() {
        }

        public void uef(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void uef(WebView webView, String str) {
        uef.uef(webView, str);
    }
}
