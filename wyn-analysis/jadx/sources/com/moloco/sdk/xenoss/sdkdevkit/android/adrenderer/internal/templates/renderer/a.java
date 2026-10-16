package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import A7.AbstractC0279p0;
import R8.v;
import android.webkit.JavascriptInterface;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2532p;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final G9.e f30613a;

    public a(G9.e eVar) {
        this.f30613a = eVar;
    }

    @JavascriptInterface
    public final void log(@NotNull String message) {
        AbstractC3340k.e(message, "message");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateJavascript", message, null, false, 12, null);
    }

    @JavascriptInterface
    public final void onEvent(@NotNull String event) throws JSONException {
        com.moloco.sdk.acm.l lVar;
        String str;
        String str2;
        String str3;
        com.moloco.sdk.acm.l lVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar;
        com.moloco.sdk.acm.l lVar3;
        AbstractC3340k.e(event, "event");
        G9.e eVar = this.f30613a;
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
        com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) eVar.f4686c;
        com.moloco.sdk.acm.l lVarC = cVar.c("webview_event_handled_time_ms");
        JSONObject jSONObject = new JSONObject(event);
        String string = jSONObject.getString("event");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "CompositeEventHandler", v.f("Event received: ", string), false, 4, null);
        List list = (List) ((Map) ((C2532p) eVar.f4687d).getValue()).get(string);
        if (list == null || list.isEmpty()) {
            MolocoLogger.error$default(molocoLogger, "CompositeEventHandler", v.f("Event not handled: ", string), null, false, 12, null);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("webview_event_handled");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            hVar.a("result", "failure");
            hVar.a("reason", "no_handler");
            AbstractC3340k.b(string);
            hVar.a("event", string);
            cVar.a(hVar);
            lVarC.a("result", "failure");
            lVarC.a("reason", "no_handler");
            lVarC.a("event", string);
            cVar.b(lVarC);
            return;
        }
        if (list.size() > 1) {
            str = "reason";
            lVar = lVarC;
            str3 = "result";
            str2 = "failure";
            MolocoLogger.warn$default(molocoLogger, "CompositeEventHandler", AbstractC0279p0.l("Found multiple event handlers for event: ", string, ", using first one"), null, false, 12, null);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("webview_event_multiple_handlers");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            hVar2.a(str3, str2);
            AbstractC3340k.b(string);
            hVar2.a("event", string);
            cVar.a(hVar2);
        } else {
            lVar = lVarC;
            str = "reason";
            str2 = "failure";
            str3 = "result";
        }
        com.moloco.sdk.acm.l lVarC2 = cVar.c("webview_event_handler_latency_ms");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) ff.o.q0(list);
        try {
            aVar2.a(jSONObject);
            lVar2 = lVarC2;
        } catch (Exception e7) {
            e = e7;
            lVar2 = lVarC2;
        }
        try {
            aVar = aVar2;
            try {
                MolocoLogger.info$default(molocoLogger, "CompositeEventHandler", "Event handled: " + string, null, false, 12, null);
                AbstractC3340k.b(string);
                lVar2.a("event", string);
                lVar2.a("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                lVar2.a(str3, "success");
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            aVar = aVar2;
            lVar3 = lVar;
            Exception exc = e;
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", v.f("Event handling failed: ", string), exc, false, 8, null);
            AbstractC3340k.b(string);
            lVar2.a("event", string);
            lVar2.a("handler", aVar.b());
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr4 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            String str4 = str;
            lVar2.a(str4, exc.getClass().getSimpleName());
            lVar2.a(str3, str2);
            cVar.b(lVar2);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar3 = new com.moloco.sdk.acm.h("webview_event_handled");
            hVar3.a(str3, str2);
            hVar3.a(str4, exc.getClass().getSimpleName());
            hVar3.a("handler", aVar.b());
            hVar3.a("event", string);
            cVar.a(hVar3);
            lVar3.a(str3, str2);
            lVar3.a(str4, exc.getClass().getSimpleName());
            lVar3.a("handler", aVar.b());
            lVar3.a("event", string);
            cVar.b(lVar3);
        }
        try {
            cVar.b(lVar2);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr4 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar4 = new com.moloco.sdk.acm.h("webview_event_handled");
            hVar4.a(str3, "success");
            hVar4.a("handler", aVar.b());
            hVar4.a("event", string);
            cVar.a(hVar4);
            lVar3 = lVar;
            try {
                lVar3.a(str3, "success");
                lVar3.a("handler", aVar.b());
                lVar3.a("event", string);
                cVar.b(lVar3);
            } catch (Exception e12) {
                e = e12;
                Exception exc2 = e;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", v.f("Event handling failed: ", string), exc2, false, 8, null);
                AbstractC3340k.b(string);
                lVar2.a("event", string);
                lVar2.a("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr42 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                String str42 = str;
                lVar2.a(str42, exc2.getClass().getSimpleName());
                lVar2.a(str3, str2);
                cVar.b(lVar2);
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr32 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                com.moloco.sdk.acm.h hVar32 = new com.moloco.sdk.acm.h("webview_event_handled");
                hVar32.a(str3, str2);
                hVar32.a(str42, exc2.getClass().getSimpleName());
                hVar32.a("handler", aVar.b());
                hVar32.a("event", string);
                cVar.a(hVar32);
                lVar3.a(str3, str2);
                lVar3.a(str42, exc2.getClass().getSimpleName());
                lVar3.a("handler", aVar.b());
                lVar3.a("event", string);
                cVar.b(lVar3);
            }
        } catch (Exception e13) {
            e = e13;
            lVar3 = lVar;
            Exception exc22 = e;
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", v.f("Event handling failed: ", string), exc22, false, 8, null);
            AbstractC3340k.b(string);
            lVar2.a("event", string);
            lVar2.a("handler", aVar.b());
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr422 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            String str422 = str;
            lVar2.a(str422, exc22.getClass().getSimpleName());
            lVar2.a(str3, str2);
            cVar.b(lVar2);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr322 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            com.moloco.sdk.acm.h hVar322 = new com.moloco.sdk.acm.h("webview_event_handled");
            hVar322.a(str3, str2);
            hVar322.a(str422, exc22.getClass().getSimpleName());
            hVar322.a("handler", aVar.b());
            hVar322.a("event", string);
            cVar.a(hVar322);
            lVar3.a(str3, str2);
            lVar3.a(str422, exc22.getClass().getSimpleName());
            lVar3.a("handler", aVar.b());
            lVar3.a("event", string);
            cVar.b(lVar3);
        }
    }

    @JavascriptInterface
    @NotNull
    public final String sdkVersion() {
        return BuildConfig.SDK_VERSION_NAME;
    }
}
