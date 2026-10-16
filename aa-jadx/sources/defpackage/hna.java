package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hna extends android.webkit.WebViewClient {
    final /* synthetic */ defpackage.hne a;

    public hna(defpackage.hne hneVar) {
        this.a = hneVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.a.g.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        return ((java.lang.Boolean) this.a.f.invoke(webResourceRequest)).booleanValue();
    }
}
