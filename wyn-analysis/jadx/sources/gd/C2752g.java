package gd;

import C6.i;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* renamed from: gd.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2752g extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f35876a;

    public C2752g(WebViewActivity webViewActivity) {
        this.f35876a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z2, boolean z10, Message message) {
        i iVar = new i(this, 2);
        WebView webView2 = new WebView(this.f35876a.f37187c.getContext());
        webView2.setWebViewClient(iVar);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
