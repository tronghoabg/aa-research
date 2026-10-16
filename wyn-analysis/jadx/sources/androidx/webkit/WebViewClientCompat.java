package androidx.webkit;

import F6.k;
import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moloco.sdk.internal.publisher.H;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import tc.j;
import tg.b;
import x3.AbstractC4461d;
import x3.AbstractC4463f;
import y3.AbstractC4557o;
import y3.AbstractC4558p;
import y3.C4544b;
import y3.C4550h;
import y3.C4553k;

/* loaded from: classes.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        C4553k c4553k = new C4553k();
        c4553k.f48003b = (WebResourceErrorBoundaryInterface) b.o(WebResourceErrorBoundaryInterface.class, invocationHandler);
        onReceivedError(webView, webResourceRequest, c4553k);
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i5, InvocationHandler invocationHandler) throws IllegalArgumentException {
        C4550h c4550h = new C4550h();
        c4550h.f47998b = (SafeBrowsingResponseBoundaryInterface) b.o(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        onSafeBrowsingHit(webView, webResourceRequest, i5, c4550h);
    }

    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C4553k c4553k = new C4553k();
        c4553k.f48002a = webResourceError;
        onReceivedError(webView, webResourceRequest, c4553k);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i5, SafeBrowsingResponse safeBrowsingResponse) throws IllegalArgumentException {
        C4550h c4550h = new C4550h();
        c4550h.f47997a = safeBrowsingResponse;
        onSafeBrowsingHit(webView, webResourceRequest, i5, c4550h);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, AbstractC4463f abstractC4463f) {
        if (H.b0("WEB_RESOURCE_ERROR_GET_CODE") && H.b0("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, abstractC4463f.b(), abstractC4463f.a().toString(), webResourceRequest.getUrl().toString());
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i5, AbstractC4461d abstractC4461d) throws IllegalArgumentException {
        if (H.b0("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            C4550h c4550h = (C4550h) abstractC4461d;
            c4550h.getClass();
            C4544b c4544b = AbstractC4557o.f48008c;
            if (c4544b.a()) {
                if (c4550h.f47997a == null) {
                    j jVar = AbstractC4558p.f48018a;
                    c4550h.f47997a = k.b(((WebkitToCompatConverterBoundaryInterface) jVar.f46015a).convertSafeBrowsingResponse(Proxy.getInvocationHandler(c4550h.f47998b)));
                }
                c4550h.f47997a.showInterstitial(true);
                return;
            }
            if (c4544b.b()) {
                if (c4550h.f47998b == null) {
                    j jVar2 = AbstractC4558p.f48018a;
                    c4550h.f47998b = (SafeBrowsingResponseBoundaryInterface) b.o(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) jVar2.f46015a).convertSafeBrowsingResponse(c4550h.f47997a));
                }
                c4550h.f47998b.showInterstitial(true);
                return;
            }
            throw AbstractC4557o.a();
        }
        throw AbstractC4557o.a();
    }
}
