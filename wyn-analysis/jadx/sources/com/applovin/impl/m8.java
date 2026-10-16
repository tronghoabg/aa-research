package com.applovin.impl;

import A7.AbstractC0279p0;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class m8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21938a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21939b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f21940c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21941d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f21942e = DesugarCollections.synchronizedSet(new HashSet());

    public class a extends u4 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f21943a;

        public a(boolean z2) {
            this.f21943a = z2;
        }

        @Override // com.applovin.impl.u4
        public Map a() {
            return CollectionUtils.hashMap(MediationMetaData.KEY_NAME, "WebTrackerManagerWebViewClient");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f21943a) {
                com.applovin.impl.sdk.o unused = m8.this.f21939b;
                if (com.applovin.impl.sdk.o.a()) {
                    m8.this.f21939b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                m8.this.f21941d = true;
            }
        }

        @Override // com.applovin.impl.u4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == m8.this.f21940c) {
                AppLovinSdkUtils.runOnUiThread(new D0(this, 0));
            } else {
                m8.this.b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            m8.this.f21940c.destroy();
            m8.this.f21940c = null;
        }
    }

    public m8(com.applovin.impl.sdk.k kVar) {
        this.f21938a = kVar;
        this.f21939b = kVar.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        WebView webViewA = a(str);
        if (webViewA != null) {
            this.f21942e.add(webViewA);
            AppLovinSdkUtils.runOnUiThreadDelayed(new F(12, this, webViewA), ((Integer) this.f21938a.a(y4.f23667P2)).intValue());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f21939b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new D0(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String strAppendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f21938a.a(y4.f23860n3)).booleanValue());
        if (this.f21940c == null) {
            WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f21940c = webViewA;
            if (webViewA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21939b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.f21941d) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21939b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put("source", "webViewNotInitialized");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f21938a.D().d(d2.f21308b1, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        String strL = AbstractC0279p0.l("al_firePostback('", strAppendQueryParameters, "')");
        if (((Boolean) this.f21938a.a(y4.f23714V2)).booleanValue()) {
            p8.a(this.f21940c, strL, this.f21938a).a(this.f21938a.r0().a("evaluateJavascriptPromise"), new A5.g(this, appLovinPostbackListener, strAppendQueryParameters, 11));
        } else {
            p8.a(this.f21940c, strL);
            appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f21940c = webViewA;
        if (webViewA == null && com.applovin.impl.sdk.o.a()) {
            this.f21939b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    public void a(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Ab.a(this, eVar, appLovinPostbackListener, 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z2, String str2, String str3) {
        if (z2) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.f21938a.D().d(d2.f21308b1, map);
    }

    private boolean c() {
        return ((Boolean) this.f21938a.a(y4.f23706U2)).booleanValue();
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z2) {
        o7.b();
        WebView webViewB = o7.b(com.applovin.impl.sdk.k.o(), "web tracker");
        if (webViewB == null) {
            return null;
        }
        webViewB.getSettings().setJavaScriptEnabled(true);
        webViewB.setWebViewClient(new a(z2 && c()));
        webViewB.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return webViewB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(WebView webView) {
        if (webView == null || !this.f21942e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new C0(webView, 0));
    }

    public void b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21939b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21939b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new F(11, this, str));
        }
    }
}
