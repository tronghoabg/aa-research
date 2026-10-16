package com.carstream.tech.car;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.IOException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class i extends WebViewClient {
    public final /* synthetic */ CarScreen a;

    public i(CarScreen carScreen) {
        this.a = carScreen;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) throws Resources.NotFoundException, IOException {
        CarScreen carScreen = this.a;
        carScreen.syncNav();
        carScreen.js("if(window.__cntNavReset){window.__cntNavReset();}");
        carScreen.autoOpen.c(str);
        carScreen.afterCommandedOpen(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) throws Resources.NotFoundException, IOException {
        CarScreen carScreen = this.a;
        carScreen.injectScripts(webView);
        carScreen.syncNav();
        carScreen.autoOpen.c(str);
        carScreen.afterCommandedOpen(str);
        carScreen.traTieuDiemVeTrang();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) throws Resources.NotFoundException, IOException {
        CarScreen carScreen = this.a;
        carScreen.dongOnhapTrang();
        carScreen.injectScripts(webView);
        carScreen.syncUrl(str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest == null ? null : webResourceRequest.getUrl();
        String scheme = url != null ? url.getScheme() : null;
        if ((url != null && String.valueOf(url).startsWith("file:///android_asset/")) || scheme == null || "http".equals(scheme) || "https".equals(scheme)) {
            return false;
        }
        String.valueOf(url);
        return true;
    }
}
