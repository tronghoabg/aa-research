package com.applovin.impl.adview;

import R8.v;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.b8;
import com.applovin.impl.d2;
import com.applovin.impl.f2;
import com.applovin.impl.o7;
import com.applovin.impl.p7;
import com.applovin.impl.s7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.u4;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinAdSize;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends u4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21061a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21062b;

    /* renamed from: c, reason: collision with root package name */
    private final a f21063c;

    public c(a aVar, com.applovin.impl.sdk.k kVar) {
        this.f21061a = kVar;
        this.f21062b = kVar.O();
        this.f21063c = aVar;
    }

    private void b() {
        this.f21063c.z();
    }

    private void c() {
        this.f21063c.a();
    }

    @Override // com.applovin.impl.u4
    public Map a() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(MediationMetaData.KEY_NAME, "AdWebViewClient");
        mapHashMap.putAll(f2.a((AppLovinAdImpl) this.f21063c.g()));
        return mapHashMap;
    }

    public a d() {
        return this.f21063c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21062b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21062b.d("AdWebView", "Loaded URL: " + str);
        }
        this.f21063c.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b bVarG = this.f21063c.g();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21062b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + bVarG);
        }
        if (o7.a(webResourceRequest.getUrl().toString(), this.f21061a)) {
            this.f21061a.D().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b bVarG = this.f21063c.g();
        String str = "Received SSL error: " + sslError;
        if (com.applovin.impl.sdk.o.a()) {
            this.f21062b.b("AdWebView", str + " for ad: " + bVarG);
        }
    }

    @Override // com.applovin.impl.u4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b bVarG = this.f21063c.g();
        com.applovin.impl.sdk.o.h("AdWebView", "Render process gone for ad: " + bVarG + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.f21061a.a(y4.f23693S5)).booleanValue()) {
            a(webView, renderProcessGoneDetail, bVarG);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.o.a()) {
            return false;
        }
        this.f21062b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i5, String str, String str2) {
        super.onReceivedError(webView, i5, str, str2);
        com.applovin.impl.sdk.ad.b bVarG = this.f21063c.g();
        String str3 = "Received error with error code: " + i5 + " with description \\'" + str + "\\' for URL: " + str2;
        if (com.applovin.impl.sdk.o.a()) {
            this.f21062b.b("AdWebView", str3 + " for ad: " + bVarG);
        }
        if (o7.a(str2, this.f21061a)) {
            this.f21061a.D().a("adWebViewReceivedError", str2, i5, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.webkit.WebView r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.c.a(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f21061a.a(y4.f23748Z5)).booleanValue()) {
            throw new RuntimeException(v.f("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null"));
        }
        if (webView == null || !webView.equals(this.f21063c.f())) {
            return;
        }
        this.f21063c.b();
        AppLovinAdSize appLovinAdSizeK = this.f21063c.k();
        if (o7.a(appLovinAdSizeK)) {
            this.f21063c.a(appLovinAdSizeK);
            this.f21063c.F();
        }
    }

    private boolean a(boolean z2, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z2) {
            return false;
        }
        boolean zY0 = bVar.Y0();
        a(uri, zY0, bVar, this.f21061a);
        return zY0;
    }

    private static void a(Uri uri, boolean z2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        if (kVar.c(y4.f23694S6).contains(uri.getScheme())) {
            return;
        }
        kVar.D().d(d2.f21274J0, a(bVar, uri, z2));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z2) {
        Map mapA = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapA);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z2), mapA);
        return mapA;
    }

    private void a(MotionEvent motionEvent) {
        this.f21063c.a(motionEvent);
    }

    private void a(p7 p7Var, b bVar) {
        s7 s7VarG1 = p7Var.g1();
        if (s7VarG1 != null) {
            b8.a(s7VarG1.b(), this.f21063c.j());
            a(bVar, s7VarG1.c());
        }
    }

    private void a(b bVar, Uri uri) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView appLovinAdViewI = this.f21063c.i();
        if (appLovinAdViewI != null && currentAd != null) {
            if (currentAd instanceof p7) {
                ((p7) currentAd).getAdEventTracker().v();
            }
            this.f21063c.a(currentAd, appLovinAdViewI, uri, bVar.getAndClearLastClickEvent());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f21062b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String strF;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            strF = v.f("Tracked event: ", queryParameter);
        } else {
            strF = v.f("Failed to track event: ", queryParameter);
        }
        o7.a(strF, com.applovin.impl.sdk.k.o());
    }
}
