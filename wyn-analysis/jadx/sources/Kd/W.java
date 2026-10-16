package kd;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes5.dex */
public final class W extends WebViewClient {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f39625c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final r f39626a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39627b = false;

    public W(r rVar) {
        this.f39626a = rVar;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        this.f39626a.f39692a.x(new Db.b(this, webView, str, z2, 10));
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f39626a.f39692a.x(new Cb.a(this, webView, message, message2, 27));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f39626a.f39692a.x(new U(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f39626a.f39692a.x(new U(this, webView, str, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f39626a.f39692a.x(new U(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f39626a.f39692a.x(new U(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f39626a.f39692a.x(new com.applovin.impl.mediation.ads.f(this, webView, clientCertRequest, 21));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        this.f39626a.f39692a.x(new com.applovin.impl.N(this, webView, i5, str, str2, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f39626a.f39692a.x(new Kb.c((WebViewClient) this, webView, httpAuthHandler, str, str2, 8));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f39626a.f39692a.x(new V(this, webView, webResourceRequest, webResourceResponse, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f39626a.f39692a.x(new Kb.c((WebViewClient) this, webView, str, str2, str3, 7));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f39626a.f39692a.x(new Cb.a(this, webView, sslErrorHandler, sslError, 28));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        this.f39626a.f39692a.x(new S(this, webView, f10, f11, 1));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f39626a.f39692a.x(new com.applovin.impl.mediation.ads.f(this, webView, webResourceRequest, 22));
        return webResourceRequest.isForMainFrame() && this.f39627b;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f39626a.f39692a.x(new Cb.a(this, webView, webResourceRequest, webResourceError, 29));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f39626a.f39692a.x(new U(this, webView, str, 1));
        return this.f39627b;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
