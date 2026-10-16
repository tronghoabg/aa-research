package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import Ef.H0;
import Hf.InterfaceC0603m;
import Hf.x0;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;

/* loaded from: classes4.dex */
public final class l implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30740b;

    public /* synthetic */ l(o oVar, int i5) {
        this.f30739a = i5;
        this.f30740b = oVar;
    }

    @Override // Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        C2515C c2515c = C2515C.f34653a;
        o oVar = this.f30740b;
        switch (this.f30739a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Webview page pending error resolution: " + zBooleanValue, null, false, 12, null);
                if (!zBooleanValue) {
                    int i5 = o.f30745s;
                    oVar.c();
                    break;
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue2 = bool.booleanValue();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Content loaded event received, isSuccess: " + zBooleanValue2, null, false, 12, null);
                x0 x0Var = oVar.f30750e;
                x0Var.getClass();
                x0Var.k(null, bool);
                H0 h02 = oVar.f30759o;
                if (h02 != null) {
                    h02.cancel(null);
                }
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("webview_required_content_loaded");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                hVar.a("result", zBooleanValue2 ? "success" : "failure");
                com.moloco.sdk.acm.recorder.c cVar = oVar.f30747b;
                cVar.a(hVar);
                com.moloco.sdk.acm.l lVar = oVar.f30761q;
                if (lVar != null) {
                    lVar.a("result", zBooleanValue2 ? "success" : "failure");
                    cVar.b(lVar);
                }
                if (zBooleanValue2) {
                    H0 h03 = oVar.f30756l;
                    if (h03 != null) {
                        h03.cancel(null);
                    }
                    oVar.f30756l = null;
                    oVar.k = 0;
                    break;
                }
                break;
        }
        return c2515c;
    }
}
