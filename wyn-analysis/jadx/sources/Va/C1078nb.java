package Va;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: Va.nb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1078nb extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14438a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1091ob f14439b;

    public C1078nb(C1091ob c1091ob) {
        this.f14439b = c1091ob;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        this.f14439b.c(webView, str2);
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i5) {
        if (i5 != 100 || this.f14438a) {
            return;
        }
        this.f14438a = true;
        this.f14439b.a(webView);
    }
}
