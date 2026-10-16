package Va;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: Va.mb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1065mb extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14396a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14397b = false;

    /* renamed from: c, reason: collision with root package name */
    public String f14398c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1091ob f14399d;

    public C1065mb(C1091ob c1091ob) {
        this.f14399d = c1091ob;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f14399d.a(webView);
        this.f14396a = false;
        this.f14397b = true;
        if (this.f14398c == null) {
            this.f14398c = webView.getOriginalUrl();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f14399d.a(webView);
        this.f14396a = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C1091ob c1091ob = this.f14399d;
        if (str.startsWith(c1091ob.f14464a)) {
            this.f14398c = webView.getOriginalUrl();
            String str2 = c1091ob.f14464a;
            c1091ob.d(webView, str2, str.substring(str2.length()));
            return true;
        }
        if (this.f14398c == null) {
            this.f14398c = webView.getOriginalUrl();
        }
        c1091ob.b(webView, str, (this.f14396a && this.f14397b) || !(webView.getOriginalUrl() == null || this.f14398c == null || webView.getOriginalUrl().equals(this.f14398c)));
        this.f14397b = true;
        this.f14396a = false;
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
