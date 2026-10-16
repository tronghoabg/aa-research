package com.iab.omid.library.vungle.publisher;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.internal.g;
import com.iab.omid.library.vungle.internal.h;
import com.iab.omid.library.vungle.internal.l;
import com.iab.omid.library.vungle.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f28192g;

    /* renamed from: h, reason: collision with root package name */
    private Long f28193h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f28194i;

    /* renamed from: j, reason: collision with root package name */
    private final String f28195j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return b.this.a(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return com.iab.omid.library.vungle.webviewclient.a.a(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return com.iab.omid.library.vungle.webviewclient.a.a(str);
        }
    }

    /* renamed from: com.iab.omid.library.vungle.publisher.b$b, reason: collision with other inner class name */
    public class C0164b extends WebViewClient {
        public C0164b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return b.this.a(webView, renderProcessGoneDetail);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f28198a;

        public c() {
            this.f28198a = b.this.f28192g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28198a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f28193h = null;
        this.f28194i = map;
        this.f28195j = str2;
    }

    private WebViewClient c(boolean z2) {
        return z2 ? k() : j();
    }

    private WebViewClient j() {
        return new C0164b();
    }

    private WebViewClient k() {
        return new a();
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new c(), Math.max(4000 - (this.f28193h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f28193h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f28192g = null;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        l();
    }

    public void l() {
        Context contextA = g.b().a();
        WebView webView = new WebView(contextA);
        this.f28192g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f28192g.getSettings().setAllowContentAccess(false);
        this.f28192g.getSettings().setAllowFileAccess(false);
        this.f28192g.setWebViewClient(c(a(com.iab.omid.library.vungle.attestation.g.a(this.f28192g), contextA)));
        a(this.f28192g);
        h.a().c(this.f28192g, this.f28195j);
        for (String str : this.f28194i.keySet()) {
            h.a().d(this.f28192g, this.f28194i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f28193h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.vungle.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.vungle.utils.c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    private boolean a(boolean z2, Context context) {
        return !z2 && com.iab.omid.library.vungle.attestation.c.a(context).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        StringBuilder sbA = l.a("WebView renderer gone: ");
        sbA.append(renderProcessGoneDetail.toString());
        sbA.append(" for WebView: ");
        sbA.append(webView);
        Log.w("NativeBridge", sbA.toString());
        if (getWebView() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            a((WebView) null);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }
}
