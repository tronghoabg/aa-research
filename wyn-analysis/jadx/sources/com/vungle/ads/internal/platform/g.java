package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.C2529m;
import ef.C2530n;
import j1.InterfaceC3073a;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class g {
    public static void a(Context context, InterfaceC3073a consumer) {
        Object objZ;
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(consumer, "consumer");
        try {
            objZ = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        if (!(objZ instanceof C2529m)) {
            consumer.accept((String) objZ);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z2 = u.f33874a;
            t.a("WebViewUtil", "Failed to get user agent", thA);
            consumer.accept(null);
        }
    }

    public static void a(WebView webView, f0 f0Var) {
        Boolean boolB;
        Boolean boolA;
        AbstractC3340k.e(webView, "webView");
        WebSettings settings = webView.getSettings();
        AbstractC3340k.d(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((f0Var == null || (boolA = f0Var.a()) == null) ? false : boolA.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((f0Var == null || (boolB = f0Var.b()) == null) ? false : boolB.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }
}
