package kd;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: kd.M, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3302M extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f39591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3303N f39592b;

    public C3302M(C3303N c3303n, WebView webView) {
        this.f39592b = c3303n;
        this.f39591a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f39592b.f39593a;
        WebView webView2 = this.f39591a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, webResourceRequest)) {
            return true;
        }
        webView2.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClient = this.f39592b.f39593a;
        WebView webView2 = this.f39591a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, str)) {
            return true;
        }
        webView2.loadUrl(str);
        return true;
    }
}
