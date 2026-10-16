package kd;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import x3.AbstractC4463f;

/* loaded from: classes5.dex */
public final class T extends WebViewClientCompat {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f39613c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final r f39614a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39615b = false;

    public T(r rVar) {
        this.f39614a = rVar;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        this.f39614a.f39692a.x(new Db.b(this, webView, str, z2, 9));
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f39614a.f39692a.x(new Cb.a(this, webView, message, message2, 25));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f39614a.f39692a.x(new Q(this, webView, str, 2));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f39614a.f39692a.x(new Q(this, webView, str, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f39614a.f39692a.x(new Q(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f39614a.f39692a.x(new Q(this, webView, str, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f39614a.f39692a.x(new com.applovin.impl.mediation.ads.f(this, webView, clientCertRequest, 19));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        this.f39614a.f39692a.x(new com.applovin.impl.N(this, webView, i5, str, str2, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f39614a.f39692a.x(new Kb.c((WebViewClient) this, webView, httpAuthHandler, str, str2, 6));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f39614a.f39692a.x(new Cb.a(this, webView, webResourceRequest, webResourceResponse, 24));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f39614a.f39692a.x(new Kb.c((WebViewClient) this, webView, str, str2, str3, 5));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f39614a.f39692a.x(new Cb.a(this, webView, sslErrorHandler, sslError, 26));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        this.f39614a.f39692a.x(new S(this, webView, f10, f11, 0));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f39614a.f39692a.x(new com.applovin.impl.mediation.ads.f(this, webView, webResourceRequest, 20));
        return webResourceRequest.isForMainFrame() && this.f39615b;
    }

    @Override // androidx.webkit.WebViewClientCompat
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, AbstractC4463f abstractC4463f) {
        this.f39614a.f39692a.x(new Cb.a(this, webView, webResourceRequest, abstractC4463f, 23));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f39614a.f39692a.x(new Q(this, webView, str, 0));
        return this.f39615b;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
