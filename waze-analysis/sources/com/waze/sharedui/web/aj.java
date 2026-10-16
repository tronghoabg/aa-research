package com.waze.sharedui.web;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj extends WebViewClientCompat {

    /* renamed from: a, reason: collision with root package name */
    private final WazeWebView f39316a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39317b;

    protected aj(WazeWebView wazeWebView) {
        this.f39316a = wazeWebView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f39316a.w(!this.f39317b);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f39317b = false;
        this.f39316a.x(str);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        com.waze.shared_infra.i.h.b(this.f39316a.f39295e, String.format(Locale.getDefault(), "onReceivedError, errorCode=%d; desc=%s; url=%s", Integer.valueOf(i2), str, str2));
        this.f39317b = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (renderProcessGoneDetail.didCrash()) {
            String str = String.format(Locale.getDefault(), "WebView crash detected. host=%s, url=%s, priority=%d", this.f39316a.f39295e, webView.getUrl(), Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            com.waze.shared_infra.i.h.c(str);
            ((com.waze.shared_infra.i.b) com.waze.web.r.h(com.waze.shared_infra.i.b.class)).a(new Exception(str), null);
        }
        this.f39316a.y();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WazeWebView wazeWebView = this.f39316a;
        if (wazeWebView.f39294d == null || webResourceRequest == null || webResourceRequest.getUrl() == null) {
            com.waze.shared_infra.i.h.a("WebAssetLoader unavailable or request/URL is null. WebViewClient intercepted request.");
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        Uri url = webResourceRequest.getUrl();
        com.waze.shared_infra.i.h.a("Using WebAssetLoader. WebViewClient intercepted request: ".concat(String.valueOf(String.valueOf(url))));
        return wazeWebView.f39294d.shouldInterceptRequest(url);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String strValueOf = String.valueOf(str);
        WazeWebView wazeWebView = this.f39316a;
        com.waze.shared_infra.i.h.b(wazeWebView.f39295e, "Try to load...".concat(strValueOf));
        if (wazeWebView.f39300j.a(str)) {
            return true;
        }
        Context context = wazeWebView.getContext();
        int i2 = ax.f39342a;
        if (!TextUtils.isEmpty(str)) {
            Uri uri = Uri.parse(str);
            if ("tel".equals(uri.getScheme())) {
                context.startActivity(new Intent("android.intent.action.DIAL", uri));
                return true;
            }
        }
        if (ax.a(wazeWebView.getContext(), str) || wazeWebView.f39301k.a(str)) {
            return true;
        }
        j jVarB = com.waze.sharedui.h.k().b();
        if (!jVarB.c(str)) {
            if (!jVarB.d(str)) {
                return false;
            }
            jVarB.b(str);
            return true;
        }
        String host = Uri.parse(str).getHost();
        if ("dialog_hide_current".equals(host) || "browser_close".equals(host)) {
            WazeWebView.l(wazeWebView);
        } else if ("browser_error".equals(host)) {
            wazeWebView.M();
        } else {
            jVarB.a(str);
        }
        return true;
    }
}
