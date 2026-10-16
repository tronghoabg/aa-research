package com.bytedance.sdk.component.cz;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.cz.uef;
import java.util.List;

/* loaded from: classes.dex */
public class xs extends WebViewClient {

    /* renamed from: oa, reason: collision with root package name */
    private final uef.InterfaceC0059uef f24982oa;
    private final WebViewClient uef;
    private final List<String> yo;

    public xs(uef.InterfaceC0059uef interfaceC0059uef, WebViewClient webViewClient, List<String> list) {
        this.f24982oa = interfaceC0059uef;
        this.uef = webViewClient;
        this.yo = list;
    }

    private int uef(WebView webView) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                return webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.uef.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        uef.InterfaceC0059uef interfaceC0059uef = this.f24982oa;
        if (interfaceC0059uef != null) {
            interfaceC0059uef.uef(uef(webView));
        }
        this.uef.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.uef.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.uef.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.uef.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return Build.VERSION.SDK_INT >= 26 ? this.uef.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.uef.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        uef.InterfaceC0059uef interfaceC0059uef = this.f24982oa;
        if (interfaceC0059uef != null) {
            interfaceC0059uef.uef();
        }
        return this.uef.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i5, String str, String str2) {
        this.uef.onReceivedError(webView, i5, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        uef.InterfaceC0059uef interfaceC0059uef;
        if (oa.uef(this.yo, webResourceRequest.getUrl().toString()) && (interfaceC0059uef = this.f24982oa) != null) {
            interfaceC0059uef.uef();
        }
        return this.uef.shouldInterceptRequest(webView, webResourceRequest);
    }
}
