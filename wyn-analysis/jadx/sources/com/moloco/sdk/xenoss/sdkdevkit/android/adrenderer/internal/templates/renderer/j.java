package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import Hf.x0;
import Jd.v;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.F;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.z;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import x3.AbstractC4463f;

/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f30734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30735d;

    public /* synthetic */ j(o oVar, Object obj, WebView webView, int i5) {
        this.f30732a = i5;
        this.f30733b = oVar;
        this.f30735d = obj;
        this.f30734c = webView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        WebView webView = this.f30734c;
        Object obj2 = this.f30735d;
        o oVar = this.f30733b;
        switch (this.f30732a) {
            case 0:
                boolean z2 = Boolean.parseBoolean((String) obj);
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "[" + Thread.currentThread().getName() + "] Content type with webview error is required: " + z2, null, false, 12, null);
                AbstractC4463f abstractC4463f = (AbstractC4463f) obj2;
                com.moloco.sdk.acm.recorder.c cVar = oVar.f30747b;
                x0 x0Var = oVar.f30751f;
                if (!z2) {
                    MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                    com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("webview_html_ad_error");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                    hVar.a("result", "failure");
                    hVar.a("required", "false");
                    hVar.a("reason", String.valueOf(abstractC4463f.a()));
                    hVar.a("status_code", String.valueOf(abstractC4463f.b()));
                    hVar.a("is_loaded", String.valueOf(((Boolean) x0Var.getValue()).booleanValue()));
                    cVar.a(hVar);
                } else if (((Boolean) x0Var.getValue()).booleanValue()) {
                    MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already showing and received error: " + ((Object) abstractC4463f.a()), null, false, 12, null);
                    String string = abstractC4463f.a().toString();
                    AbstractC3340k.e(string, "<this>");
                    s sVar = (s) ((Map) s.f30655d.getValue()).get(string);
                    if (sVar == null) {
                        sVar = r.f30654e;
                    }
                    if (sVar.f30658c) {
                        oVar.b(abstractC4463f.a().toString(), abstractC4463f.b(), F.f30631c);
                    } else {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                        com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("webview_html_ad_ignored_error");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                        hVar2.a("result", "failure");
                        hVar2.a("required", "true");
                        hVar2.a("reason", String.valueOf(abstractC4463f.a()));
                        hVar2.a("status_code", String.valueOf(abstractC4463f.b()));
                        hVar2.a("is_loaded", String.valueOf(((Boolean) x0Var.getValue()).booleanValue()));
                        cVar.a(hVar2);
                        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already showing but received " + ((Object) abstractC4463f.a()) + ", not setting unrecoverable error", null, false, 12, null);
                    }
                } else {
                    String string2 = abstractC4463f.a().toString();
                    AbstractC3340k.e(string2, "<this>");
                    s sVar2 = (s) ((Map) s.f30655d.getValue()).get(string2);
                    if (sVar2 == null) {
                        sVar2 = r.f30654e;
                    }
                    String strA = sVar2.a();
                    z zVar = z.f30665f;
                    if (AbstractC3340k.a(strA, "net::ERR_FAILED") && oVar.f30748c) {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                        com.moloco.sdk.acm.h hVar3 = new com.moloco.sdk.acm.h("webview_html_ad_ignored_error");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                        hVar3.a("result", "failure");
                        hVar3.a("required", "true");
                        hVar3.a("reason", String.valueOf(abstractC4463f.a()));
                        hVar3.a("status_code", String.valueOf(abstractC4463f.b()));
                        hVar3.a("is_loaded", String.valueOf(((Boolean) x0Var.getValue()).booleanValue()));
                        cVar.a(hVar3);
                        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Ignoring error: " + ((Object) abstractC4463f.a()) + " with code: " + abstractC4463f.b() + " since it's marked to be ignored pre load", null, false, 12, null);
                    } else if (sVar2.f30657b && oVar.d()) {
                        oVar.a(abstractC4463f.b(), webView, abstractC4463f.a().toString());
                    } else {
                        oVar.b(abstractC4463f.a().toString(), abstractC4463f.b(), F.f30631c);
                    }
                }
                Boolean bool = Boolean.FALSE;
                x0 x0Var2 = oVar.f30758n;
                x0Var2.getClass();
                x0Var2.k(null, bool);
                break;
            default:
                boolean z10 = Boolean.parseBoolean((String) obj);
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger2, "TemplateWebViewClientImpl", "[" + Thread.currentThread().getName() + "] Content isRequired with http error: " + z10, null, false, 12, null);
                WebResourceResponse webResourceResponse = (WebResourceResponse) obj2;
                com.moloco.sdk.acm.recorder.c cVar2 = oVar.f30747b;
                x0 x0Var3 = oVar.f30751f;
                if (!z10) {
                    MolocoLogger.info$default(molocoLogger2, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr4 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                    com.moloco.sdk.acm.h hVar4 = new com.moloco.sdk.acm.h("webview_html_ad_error");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr4 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                    hVar4.a("result", "failure");
                    hVar4.a("required", "false");
                    hVar4.a("reason", String.valueOf(webResourceResponse.getStatusCode()));
                    hVar4.a("is_loaded", String.valueOf(((Boolean) x0Var3.getValue()).booleanValue()));
                    cVar2.a(hVar4);
                } else if (((Boolean) x0Var3.getValue()).booleanValue()) {
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr5 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                    com.moloco.sdk.acm.h hVar5 = new com.moloco.sdk.acm.h("webview_html_ad_ignored_error");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr5 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                    hVar5.a("result", "failure");
                    hVar5.a("required", "true");
                    hVar5.a("reason", String.valueOf(webResourceResponse.getStatusCode()));
                    hVar5.a("is_loaded", String.valueOf(((Boolean) x0Var3.getValue()).booleanValue()));
                    cVar2.a(hVar5);
                    MolocoLogger.info$default(molocoLogger2, "TemplateWebViewClientImpl", "Webview is already showing but received HTTP " + webResourceResponse.getStatusCode() + ", not setting unrecoverable error", null, false, 12, null);
                } else {
                    int statusCode = webResourceResponse.getStatusCode();
                    if ((statusCode == v.f6086n.f6089a || statusCode == v.f6085m.f6089a || statusCode < 400 || statusCode >= 500) && oVar.d()) {
                        oVar.a(webResourceResponse.getStatusCode(), webView, String.valueOf(webResourceResponse.getStatusCode()));
                    } else {
                        oVar.b(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), F.f30632d);
                        MolocoLogger.warn$default(molocoLogger2, "TemplateWebViewClientImpl", "Setting unrecoverable error: " + ((x0) oVar.f30755j.f5122a).getValue(), null, false, 12, null);
                    }
                }
                Boolean bool2 = Boolean.FALSE;
                x0 x0Var4 = oVar.f30758n;
                x0Var4.getClass();
                x0Var4.k(null, bool2);
                break;
        }
    }
}
