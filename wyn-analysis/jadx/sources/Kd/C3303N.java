package kd;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: kd.N, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3303N extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public WebViewClient f39593a;

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z2, boolean z10, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f39593a == null) {
            return false;
        }
        webView2.setWebViewClient(new C3302M(this, webView));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
