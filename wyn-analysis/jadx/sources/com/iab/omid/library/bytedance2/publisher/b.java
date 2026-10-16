package com.iab.omid.library.bytedance2.publisher;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f28031g;

    /* renamed from: h, reason: collision with root package name */
    private Long f28032h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f28033i;

    /* renamed from: j, reason: collision with root package name */
    private final String f28034j;

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

    /* renamed from: com.iab.omid.library.bytedance2.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0158b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f28036a;

        public RunnableC0158b() {
            this.f28036a = b.this.f28031g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28036a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f28032h = null;
        this.f28033i = map;
        this.f28034j = str2;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0158b(), Math.max(4000 - (this.f28032h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f28032h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f28031g = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f28031g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f28031g.getSettings().setAllowContentAccess(false);
        this.f28031g.getSettings().setAllowFileAccess(false);
        this.f28031g.setWebViewClient(new a());
        a(this.f28031g);
        h.a().c(this.f28031g, this.f28034j);
        for (String str : this.f28033i.keySet()) {
            h.a().c(this.f28031g, this.f28033i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f28032h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
