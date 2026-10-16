package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import A7.AbstractC0279p0;
import Ef.H;
import Ef.H0;
import Ef.S;
import Hf.e0;
import Hf.k0;
import Hf.x0;
import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import cb.AbstractC1593a;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.F;
import kotlin.jvm.internal.AbstractC3340k;
import x3.AbstractC4463f;

/* loaded from: classes4.dex */
public final class o extends WebViewClientCompat {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f30745s = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.l f30746a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f30747b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30748c;

    /* renamed from: d, reason: collision with root package name */
    public final Kd.a f30749d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f30750e;

    /* renamed from: f, reason: collision with root package name */
    public final x0 f30751f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f30752g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f30753h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f30754i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f30755j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public H0 f30756l;

    /* renamed from: m, reason: collision with root package name */
    public H0 f30757m;

    /* renamed from: n, reason: collision with root package name */
    public final x0 f30758n;

    /* renamed from: o, reason: collision with root package name */
    public H0 f30759o;

    /* renamed from: p, reason: collision with root package name */
    public com.moloco.sdk.acm.l f30760p;

    /* renamed from: q, reason: collision with root package name */
    public com.moloco.sdk.acm.l f30761q;

    /* renamed from: r, reason: collision with root package name */
    public String f30762r;

    public o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.l lVar, com.moloco.sdk.acm.recorder.c cVar, boolean z2) {
        this.f30746a = lVar;
        this.f30747b = cVar;
        this.f30748c = z2;
        Lf.e eVar = S.f3698a;
        this.f30749d = H.c(Jf.n.f6132a);
        Boolean bool = Boolean.FALSE;
        x0 x0VarC = k0.c(bool);
        this.f30750e = x0VarC;
        this.f30751f = x0VarC;
        x0 x0VarC2 = k0.c(bool);
        this.f30752g = x0VarC2;
        this.f30753h = new e0(x0VarC2);
        x0 x0VarC3 = k0.c(null);
        this.f30754i = x0VarC3;
        this.f30755j = new e0(x0VarC3);
        this.f30758n = k0.c(bool);
    }

    public final void a(int i5, WebView webView, String str) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Retrying error... Attempt: " + (this.k + 1), null, false, 12, null);
        this.k = this.k + 1;
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("webview_html_ad_retry_attempt");
        hVar.a("required", "true");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar.a("attempt", String.valueOf(this.k));
        hVar.a("reason", String.valueOf(str));
        hVar.a("status_code", String.valueOf(i5));
        this.f30747b.a(hVar);
        H0 h02 = this.f30756l;
        if (h02 != null) {
            h02.cancel(null);
        }
        this.f30756l = H.D(this.f30749d, null, new k(this, webView, null), 3);
    }

    public final void b(String str, int i5, F f10) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sbK = AbstractC1593a.k(i5, "Setting unrecoverable error with description: ", str, ", code: ", ", errorType: ");
        sbK.append(f10);
        MolocoLogger.warn$default(molocoLogger, "TemplateWebViewClientImpl", sbK.toString(), null, false, 12, null);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("webview_html_ad_error");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar.a("result", "failure");
        hVar.a("required", "true");
        hVar.a("reason", String.valueOf(str));
        hVar.a("status_code", String.valueOf(i5));
        hVar.a("is_loaded", String.valueOf(((Boolean) this.f30751f.getValue()).booleanValue()));
        this.f30747b.a(hVar);
        this.f30762r = str;
        x0 x0Var = this.f30754i;
        x0Var.getClass();
        x0Var.k(null, f10);
    }

    public final void c() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("HTML Page finished loading is success: ");
        e0 e0Var = this.f30755j;
        sb2.append(((x0) e0Var.f5122a).getValue() == null);
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", sb2.toString(), null, false, 12, null);
        Boolean bool = Boolean.TRUE;
        x0 x0Var = this.f30752g;
        x0Var.getClass();
        x0Var.k(null, bool);
        Object value = ((x0) e0Var.f5122a).getValue();
        com.moloco.sdk.acm.recorder.c cVar = this.f30747b;
        if (value == null) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Waiting for content HTML assets to load or error out", null, false, 12, null);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("webview_page_load_end");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            hVar.a("result", "success");
            cVar.a(hVar);
            com.moloco.sdk.acm.l lVar = this.f30760p;
            if (lVar != null) {
                lVar.a("result", "success");
                cVar.b(lVar);
            }
            this.f30759o = H.D(this.f30749d, null, new n(this, null), 3);
            return;
        }
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Unrecoverable error occurred, not setting isLoaded to true", null, false, 12, null);
        Boolean bool2 = Boolean.FALSE;
        x0 x0Var2 = this.f30750e;
        x0Var2.getClass();
        x0Var2.k(null, bool2);
        H0 h02 = this.f30759o;
        if (h02 != null) {
            h02.cancel(null);
        }
        H0 h03 = this.f30756l;
        if (h03 != null) {
            h03.cancel(null);
        }
        this.f30756l = null;
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("webview_page_load_end");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar2.a("result", "failure");
        String str = this.f30762r;
        if (str == null) {
            str = "unknown";
        }
        hVar2.a("reason", str);
        cVar.a(hVar2);
        com.moloco.sdk.acm.l lVar2 = this.f30760p;
        if (lVar2 != null) {
            lVar2.a("result", "failure");
            String str2 = this.f30762r;
            lVar2.a("reason", str2 != null ? str2 : "unknown");
            cVar.b(lVar2);
        }
    }

    public final boolean d() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("retryCount: ");
        sb2.append(this.k);
        sb2.append(", MAX_RETRY_LIMIT: 5, retryCount < MAX_RETRY_LIMIT: ");
        sb2.append(this.k < 5);
        MolocoLogger.debug$default(molocoLogger, "TemplateWebViewClientImpl", sb2.toString(), false, 4, null);
        return this.k < 5;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("Webview page finished loading has pending error: ");
        x0 x0Var = this.f30758n;
        sb2.append(((Boolean) x0Var.getValue()).booleanValue());
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", sb2.toString(), null, false, 12, null);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("webview_page_load_finish_callback");
        hVar.a("pending_error", String.valueOf(((Boolean) x0Var.getValue()).booleanValue()));
        this.f30747b.a(hVar);
        if (!((Boolean) x0Var.getValue()).booleanValue()) {
            c();
        } else {
            this.f30757m = H.D(this.f30749d, null, new m(this, null), 3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "HTML Page started loading", null, false, 12, null);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("webview_page_load_start");
        com.moloco.sdk.acm.recorder.c cVar = this.f30747b;
        cVar.a(hVar);
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
        this.f30760p = cVar.c("webview_page_load_ms");
        this.f30761q = cVar.c("webview_required_content_load_ms");
    }

    @Override // androidx.webkit.WebViewClientCompat
    public final void onReceivedError(WebView view, WebResourceRequest request, AbstractC4463f error) {
        AbstractC3340k.e(view, "view");
        AbstractC3340k.e(request, "request");
        AbstractC3340k.e(error, "error");
        Boolean bool = Boolean.TRUE;
        x0 x0Var = this.f30758n;
        x0Var.getClass();
        x0Var.k(null, bool);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Received error: " + error.b() + ", with description: " + ((Object) error.a()) + " for url: " + request.getUrl() + " ad isLoaded: " + ((Boolean) this.f30751f.getValue()).booleanValue() + ", isPageFinished: " + ((Boolean) ((x0) this.f30753h.f5122a).getValue()).booleanValue(), null, false, 12, null);
        String string = request.getUrl().toString();
        AbstractC3340k.d(string, "toString(...)");
        view.evaluateJavascript(AbstractC0279p0.l("ContentChecker.isRequiredContent('", string, "');"), new j(this, error, view, 0));
        super.onReceivedError(view, request, error);
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        AbstractC3340k.e(view, "view");
        AbstractC3340k.e(request, "request");
        AbstractC3340k.e(errorResponse, "errorResponse");
        Boolean bool = Boolean.TRUE;
        x0 x0Var = this.f30758n;
        x0Var.getClass();
        x0Var.k(null, bool);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "[" + Thread.currentThread().getName() + "] Received HTTP error: " + Integer.valueOf(errorResponse.getStatusCode()) + ", with description: " + errorResponse.getReasonPhrase() + " for url: " + request.getUrl(), null, false, 12, null);
        String string = request.getUrl().toString();
        AbstractC3340k.d(string, "toString(...)");
        view.evaluateJavascript(AbstractC0279p0.l("ContentChecker.isRequiredContent('", string, "');"), new j(this, errorResponse, view, 1));
        super.onReceivedHttpError(view, request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC3340k.e(view, "view");
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("webview_html_ad_error");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar.a("result", "failure");
        hVar.a("reason", "render_process_gone_error");
        hVar.a("is_loaded", String.valueOf(((Boolean) this.f30751f.getValue()).booleanValue()));
        this.f30747b.a(hVar);
        F f10 = F.f30633e;
        x0 x0Var = this.f30754i;
        x0Var.getClass();
        x0Var.k(null, f10);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "onRenderProcessGone", null, false, 12, null);
        Boolean bool = Boolean.FALSE;
        x0 x0Var2 = this.f30758n;
        x0Var2.getClass();
        x0Var2.k(null, bool);
        return true;
    }
}
