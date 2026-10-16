package com.bytedance.sdk.openadsdk.core.widget.uef;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.dhk;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class yo {
    private final WeakReference<Context> uef;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25780oa = true;
    private final boolean yo = true;
    private final boolean moa = true;
    private final boolean lw = false;
    private final boolean ivm = true;
    private boolean xs = true;

    private yo(Context context) {
        this.uef = new WeakReference<>(context);
    }

    public static yo uef(Context context) {
        return new yo(context);
    }

    public yo oa(boolean z2) {
        this.f25780oa = z2;
        return this;
    }

    public static void oa(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            dhk.yo(th.toString(), new Object[0]);
        }
    }

    public yo uef(boolean z2) {
        this.xs = z2;
        return this;
    }

    public void uef(WebView webView) {
        if (webView == null || this.uef.get() == null) {
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
        } catch (Exception e7) {
            dhk.yo("SSWebSettings", e7.getMessage());
        }
        try {
            if (this.f25780oa) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            dhk.yo("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.xs) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            dhk.yo("SSWebSettings", th2.getMessage());
        }
    }

    private void uef(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            dhk.yo(th.toString(), new Object[0]);
        }
    }

    public static void uef(com.bytedance.sdk.component.cz.ivm ivmVar) {
        if (ivmVar == null) {
            return;
        }
        int iUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("clear_web_cache_new", 0);
        if (iUef == 0) {
            ivmVar.uef(true);
        } else if (iUef == 1) {
            ivmVar.uef(false);
        }
    }
}
