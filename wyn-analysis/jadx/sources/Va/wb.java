package Va;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes4.dex */
public final class wb extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14740a;

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f14740a) {
            case 2:
                webView.loadUrl(webResourceRequest.getUrl().toString());
                return false;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
