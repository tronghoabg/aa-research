package com.vungle.ads.internal.ui;

import A.e0;
import Wf.F;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.s1;
import com.vungle.ads.internal.ui.z;
import ef.InterfaceC2525i;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class z extends WebViewClient implements com.vungle.ads.internal.util.v {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f33810a;

    /* renamed from: b, reason: collision with root package name */
    public final i3 f33811b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f33812c;

    /* renamed from: d, reason: collision with root package name */
    public final com.vungle.ads.internal.platform.f f33813d;

    /* renamed from: e, reason: collision with root package name */
    public final com.vungle.ads.internal.load.e f33814e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f33815f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2525i f33816g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33817h;

    /* renamed from: i, reason: collision with root package name */
    public String f33818i;

    /* renamed from: j, reason: collision with root package name */
    public String f33819j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public String f33820l;

    /* renamed from: m, reason: collision with root package name */
    public WebView f33821m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33822n;

    /* renamed from: o, reason: collision with root package name */
    public com.vungle.ads.internal.ui.view.o f33823o;

    /* renamed from: p, reason: collision with root package name */
    public com.vungle.ads.internal.ui.view.p f33824p;

    /* renamed from: q, reason: collision with root package name */
    public com.vungle.ads.internal.omsdk.f f33825q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f33826r;

    /* renamed from: s, reason: collision with root package name */
    public final s1 f33827s;

    /* renamed from: t, reason: collision with root package name */
    public final s1 f33828t;

    /* renamed from: u, reason: collision with root package name */
    public final m2 f33829u;

    public /* synthetic */ z(h0 h0Var, i3 i3Var, ExecutorService executorService, com.vungle.ads.internal.platform.f fVar) {
        this(h0Var, i3Var, executorService, fVar, null, null);
    }

    public static final void b(z this$0, WebView webView) throws Throwable {
        AbstractC3340k.e(this$0, "this$0");
        com.vungle.ads.internal.load.e eVar = this$0.f33814e;
        if (eVar != null) {
            eVar.b();
        }
        this$0.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public static final void c(z this$0, WebView webView) throws Throwable {
        AbstractC3340k.e(this$0, "this$0");
        com.vungle.ads.internal.load.e eVar = this$0.f33814e;
        if (eVar != null) {
            eVar.a();
        }
        this$0.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", r.f33744a);
        if (webView == null) {
            return;
        }
        this.f33821m = webView;
        webView.setVisibility(0);
        a();
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new o(this.f33824p));
        }
        com.vungle.ads.internal.omsdk.f fVar = this.f33825q;
        if (fVar != null) {
            ((com.vungle.ads.internal.omsdk.e) fVar).a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String description, String failingUrl) {
        AbstractC3340k.e(description, "description");
        AbstractC3340k.e(failingUrl, "failingUrl");
        super.onReceivedError(webView, i5, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String strValueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z2 = false;
        boolean z10 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        boolean z11 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Http Error desc " + strValueOf + ' ' + z10 + " for URL " + strValueOf2);
        if ((strValueOf2.length() > 0 ? this.f33810a.b(strValueOf2) : false) && z10) {
            z2 = true;
        }
        String str = strValueOf2 + ' ' + strValueOf;
        com.vungle.ads.internal.ui.view.p pVar = this.f33824p;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).a(z2, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f33821m = null;
        if (Build.VERSION.SDK_INT < 26) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", new s(webView));
            com.vungle.ads.internal.ui.view.p pVar = this.f33824p;
            if (pVar != null) {
                ((com.vungle.ads.internal.presenter.r) pVar).a(new WebViewRenderingProcessGone("didCrash=true"), true, null);
                return true;
            }
        } else {
            boolean z10 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", new t(webView, renderProcessGoneDetail));
            com.vungle.ads.internal.ui.view.p pVar2 = this.f33824p;
            if (pVar2 != null) {
                Boolean boolValueOf = renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null;
                com.vungle.ads.internal.presenter.r rVar = (com.vungle.ads.internal.presenter.r) pVar2;
                boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : true;
                rVar.a(new WebViewRenderingProcessGone("didCrash=" + zBooleanValue), zBooleanValue, null);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0115 A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #0 {all -> 0x00e9, blocks: (B:36:0x00c6, B:38:0x00cd, B:40:0x00e3, B:45:0x00ed, B:47:0x00f5, B:51:0x00ff, B:52:0x0104, B:53:0x010f, B:54:0x0115), top: B:78:0x00c6 }] */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r31, android.webkit.WebResourceRequest r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.ui.z.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(final WebView webView, String str) {
        String str2;
        final int i5 = 1;
        final int i10 = 0;
        try {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", "MRAID Command " + str);
        } catch (Throwable th) {
            if (th instanceof OutOfMemoryError) {
                new OutOfMemory(com.iab.omid.library.vungle.d.a("mraid:", str)).logErrorNoReturnValue$vungle_ads_release();
            }
        }
        if (str == null || str.length() == 0) {
            com.vungle.ads.internal.util.t.b("VungleWebClient", "Invalid URL ");
            return false;
        }
        Uri uri = Uri.parse(str);
        AbstractC3340k.d(uri, "parse(this)");
        String scheme = uri.getScheme();
        if (scheme != null && scheme.length() != 0) {
            String scheme2 = uri.getScheme();
            if (!AbstractC3340k.a(scheme2, "mraid")) {
                str2 = "VungleWebClient";
                if (!"http".equalsIgnoreCase(scheme2)) {
                    if (HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme2)) {
                    }
                    this.f33829u.a("url: ".concat(str));
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, this.f33829u, this.f33810a.q(), 4);
                    com.vungle.ads.internal.util.t.a(str2, new y(str));
                    return false;
                }
                com.vungle.ads.internal.util.t.a(str2, "Open URL".concat(str));
                com.vungle.ads.internal.ui.view.o oVar = this.f33823o;
                if (oVar != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    kotlinx.serialization.json.d element = Xf.j.b(str);
                    AbstractC3340k.e(element, "element");
                    ((com.vungle.ads.internal.presenter.r) oVar).a("openNonMraid", new kotlinx.serialization.json.c(linkedHashMap));
                }
                return true;
            }
            str2 = "VungleWebClient";
            String host = uri.getHost();
            if (host != null) {
                int iHashCode = host.hashCode();
                if (iHashCode != -1943542072) {
                    if (iHashCode != 88409791) {
                        if (iHashCode == 119543762 && host.equals("readyToPlay")) {
                            this.f33812c.execute(new Runnable(this) { // from class: Kb.b

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ z f6718b;

                                {
                                    this.f6718b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    switch (i10) {
                                        case 0:
                                            z.b(this.f6718b, webView);
                                            break;
                                        case 1:
                                            z.c(this.f6718b, webView);
                                            break;
                                        default:
                                            z.a(this.f6718b, webView);
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                    } else if (host.equals("failToLoad")) {
                        this.f33812c.execute(new Runnable(this) { // from class: Kb.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ z f6718b;

                            {
                                this.f6718b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                switch (i5) {
                                    case 0:
                                        z.b(this.f6718b, webView);
                                        break;
                                    case 1:
                                        z.c(this.f6718b, webView);
                                        break;
                                    default:
                                        z.a(this.f6718b, webView);
                                        break;
                                }
                            }
                        });
                        return true;
                    }
                } else if (host.equals("propertiesChangeCompleted")) {
                    if (!this.f33822n) {
                        this.f33822n = true;
                        final int i11 = 2;
                        this.f33812c.execute(new Runnable(this) { // from class: Kb.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ z f6718b;

                            {
                                this.f6718b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                switch (i11) {
                                    case 0:
                                        z.b(this.f6718b, webView);
                                        break;
                                    case 1:
                                        z.c(this.f6718b, webView);
                                        break;
                                    default:
                                        z.a(this.f6718b, webView);
                                        break;
                                }
                            }
                        });
                        return true;
                    }
                    return true;
                }
                com.vungle.ads.internal.ui.view.o oVar2 = this.f33823o;
                if (oVar2 == null) {
                    a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
                    return true;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String param : uri.getQueryParameterNames()) {
                    AbstractC3340k.d(param, "param");
                    kotlinx.serialization.json.d element2 = Xf.j.b(uri.getQueryParameter(param));
                    AbstractC3340k.e(element2, "element");
                }
                this.f33812c.execute(new Kb.c(oVar2, host, new kotlinx.serialization.json.c(linkedHashMap2), this, webView, 0));
                return true;
            }
            this.f33829u.a("url: ".concat(str));
            AnalyticsClient.a(AnalyticsClient.INSTANCE, this.f33829u, this.f33810a.q(), 4);
            com.vungle.ads.internal.util.t.a(str2, new y(str));
            return false;
        }
        return false;
    }

    public z(h0 advertisement, i3 placement, ExecutorService offloadExecutor, com.vungle.ads.internal.platform.f fVar, com.vungle.ads.internal.load.e eVar, Long l10) {
        AbstractC3340k.e(advertisement, "advertisement");
        AbstractC3340k.e(placement, "placement");
        AbstractC3340k.e(offloadExecutor, "offloadExecutor");
        this.f33810a = advertisement;
        this.f33811b = placement;
        this.f33812c = offloadExecutor;
        this.f33813d = fVar;
        this.f33814e = eVar;
        this.f33815f = l10;
        this.f33816g = Fe.c.z(p.f33742a);
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.f33827s = new s1(sDKMetricType);
        this.f33828t = new s1(sDKMetricType);
        this.f33829u = new m2(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    public final void a(int i5) {
        ((com.vungle.ads.internal.util.j) this.f33816g.getValue()).a(this.f33821m, i5, new q(this));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z2 = false;
        boolean z10 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        boolean z11 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Error desc " + strValueOf + ' ' + z10 + " for URL " + strValueOf2);
        if ((strValueOf2.length() > 0 ? this.f33810a.b(strValueOf2) : false) && z10) {
            z2 = true;
        }
        String str = strValueOf2 + ' ' + strValueOf;
        com.vungle.ads.internal.ui.view.p pVar = this.f33824p;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).a(z2, str);
        }
    }

    public final void b(boolean z2) {
        this.f33826r = Boolean.valueOf(z2);
        WebView webView = this.f33821m;
        if (webView != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean boolValueOf = Boolean.valueOf(z2);
            F f10 = Xf.j.f16280a;
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + new kotlinx.serialization.json.c(linkedHashMap) + ')');
        }
    }

    public final void a(boolean z2, String str, String str2, String str3, String str4) {
        this.f33817h = z2;
        this.f33818i = str;
        this.f33819j = str2;
        this.k = str3;
        this.f33820l = str4;
    }

    public final void a(com.vungle.ads.internal.ui.view.o oVar) {
        this.f33823o = oVar;
    }

    public static final void a(z this$0, WebView webView) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.a(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.f33810a.g() + ')');
    }

    public static final void a(com.vungle.ads.internal.ui.view.o it, String command, kotlinx.serialization.json.c args, z this$0, WebView webView) {
        AbstractC3340k.e(it, "$it");
        AbstractC3340k.e(command, "$command");
        AbstractC3340k.e(args, "$args");
        AbstractC3340k.e(this$0, "this$0");
        if (((com.vungle.ads.internal.presenter.r) it).a(command, args)) {
            this$0.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
        }
    }

    public final void a() {
        this.f33812c.execute(new C8.g(this, 8));
    }

    public final void a(String errorMessage, int i5) {
        AbstractC3340k.e(errorMessage, "errorMessage");
        WebView webView = this.f33821m;
        if (webView != null) {
            a(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + i5 + ')');
        }
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", "Returning black screen result: " + i5 + '%');
        if (i5 >= 0) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, i5, this.f33810a.q(), null, 8);
        } else {
            AnalyticsClient.INSTANCE.c(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, errorMessage, this.f33810a.q());
        }
    }

    @Override // com.vungle.ads.internal.util.v
    public final void a(boolean z2) {
        WebView webView = this.f33821m;
        if (webView != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean boolValueOf = Boolean.valueOf(z2);
            F f10 = Xf.j.f16280a;
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + new kotlinx.serialization.json.c(linkedHashMap) + ')');
        }
    }

    public final void a(com.vungle.ads.internal.ui.view.p errorHandler) {
        AbstractC3340k.e(errorHandler, "errorHandler");
        this.f33824p = errorHandler;
    }

    public final void a(com.vungle.ads.internal.omsdk.e eVar) {
        this.f33825q = eVar;
    }

    public final void a(WebView webView, String str) {
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new u(str));
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new v(this, webView, str));
    }

    public static final void a(boolean z2, z this$0) {
        AbstractC3340k.e(this$0, "this$0");
        e0 e0Var = new e0(25);
        Fe.b.P(e0Var, "placementType", this$0.f33810a.F());
        Boolean bool = this$0.f33826r;
        if (bool != null) {
            Fe.b.O(e0Var, "isViewable", bool);
        }
        Fe.b.P(e0Var, "os", "android");
        Fe.b.P(e0Var, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        Fe.b.O(e0Var, "incentivized", Boolean.valueOf(this$0.f33811b.j()));
        com.vungle.ads.internal.platform.f fVar = this$0.f33813d;
        if (fVar != null) {
            Fe.b.O(e0Var, "isSilent", Boolean.valueOf(((com.vungle.ads.internal.platform.c) fVar).o()));
        }
        Long l10 = this$0.f33815f;
        if (l10 != null) {
            e0Var.v("timeLoaded", Xf.j.a(l10));
        }
        if (this$0.f33817h) {
            Fe.b.O(e0Var, "consentRequired", Boolean.TRUE);
            Fe.b.P(e0Var, "consentTitleText", this$0.f33818i);
            Fe.b.P(e0Var, "consentBodyText", this$0.f33819j);
            Fe.b.P(e0Var, "consentAcceptButtonText", this$0.k);
            Fe.b.P(e0Var, "consentDenyButtonText", this$0.f33820l);
        } else {
            Fe.b.O(e0Var, "consentRequired", Boolean.FALSE);
        }
        Fe.b.P(e0Var, "sdkVersion", BuildConfig.VERSION_NAME);
        String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + new kotlinx.serialization.json.c((LinkedHashMap) e0Var.f152b) + ',' + z2 + ')';
        WebView webView = this$0.f33821m;
        if (webView != null) {
            this$0.a(webView, str);
        }
    }
}
