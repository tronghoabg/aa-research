package com.iab.omid.library.applovin.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f27903g;

    /* renamed from: h, reason: collision with root package name */
    private Long f27904h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f27905i;

    /* renamed from: j, reason: collision with root package name */
    private final String f27906j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.applovin.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0154b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f27908a;

        public RunnableC0154b() {
            this.f27908a = b.this.f27903g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27908a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f27904h = null;
        this.f27905i = map;
        this.f27906j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0154b(), Math.max(4000 - (this.f27904h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f27904h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f27903g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f27903g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f27903g.getSettings().setAllowContentAccess(false);
        this.f27903g.getSettings().setAllowFileAccess(false);
        this.f27903g.setWebViewClient(new a());
        a(this.f27903g);
        h.a().c(this.f27903g, this.f27906j);
        for (String str : this.f27905i.keySet()) {
            h.a().d(this.f27903g, this.f27905i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f27904h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
