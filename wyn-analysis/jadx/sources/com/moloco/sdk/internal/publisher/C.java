package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C1890d;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class C implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final AdLoad.Listener f28906a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.B f28907b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.l f28908c;

    /* renamed from: d, reason: collision with root package name */
    public final AdFormatType f28909d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f28910e;

    /* renamed from: f, reason: collision with root package name */
    public final tf.a f28911f;

    public C(AdLoad.Listener listener, com.moloco.sdk.internal.B sdkEventUrlTracker, com.moloco.sdk.acm.l acmLoadTimerEvent, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.c cVar, tf.a aVar) {
        AbstractC3340k.e(sdkEventUrlTracker, "sdkEventUrlTracker");
        AbstractC3340k.e(acmLoadTimerEvent, "acmLoadTimerEvent");
        AbstractC3340k.e(adFormatType, "adFormatType");
        this.f28906a = listener;
        this.f28907b = sdkEventUrlTracker;
        this.f28908c = acmLoadTimerEvent;
        this.f28909d = adFormatType;
        this.f28910e = cVar;
        this.f28911f = aVar;
    }

    public final void a(com.moloco.sdk.internal.r internalError, C1890d c1890d) {
        String str;
        AbstractC3340k.e(internalError, "internalError");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadFailed: " + internalError, null, false, 12, null);
        if (c1890d != null && (str = c1890d.f28783b) != null) {
            this.f28907b.a(str, System.currentTimeMillis(), internalError);
        }
        String str2 = (String) internalError.f29365c.get("missing_fields");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        com.moloco.sdk.acm.l lVar = this.f28908c;
        lVar.a("result", "failure");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = internalError.f29364b;
        lVar.a("reason", cVar.a());
        AdFormatType adFormatType = this.f28909d;
        String strName = adFormatType.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        lVar.a("ad_type", lowerCase);
        com.moloco.sdk.acm.recorder.c cVar2 = this.f28910e;
        cVar2.b(lVar);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("load_ad_failed");
        MolocoAdError molocoAdError = internalError.f29363a;
        hVar.a("network", molocoAdError.getNetworkName());
        hVar.a("reason", cVar.a());
        String lowerCase2 = adFormatType.name().toLowerCase(locale);
        AbstractC3340k.d(lowerCase2, "toLowerCase(...)");
        hVar.a("ad_type", lowerCase2);
        xg.g.g(hVar, this.f28911f);
        if (str2 != null && !Bf.k.y0(str2)) {
            hVar.a("missing_fields", str2);
        }
        cVar2.a(hVar);
        AdLoad.Listener listener = this.f28906a;
        if (listener != null) {
            listener.onAdLoadFailed(molocoAdError);
        }
    }

    public final void b(MolocoAd molocoAd, long j8, C1890d c1890d) {
        String str;
        AbstractC3340k.e(molocoAd, "molocoAd");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadStarted: " + molocoAd + ", " + j8, null, false, 12, null);
        if (c1890d == null || (str = c1890d.f28782a) == null) {
            return;
        }
        this.f28907b.a(str, j8, null);
    }

    public final void c(MolocoAd molocoAd, C1890d c1890d) {
        String str;
        AbstractC3340k.e(molocoAd, "molocoAd");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadSuccess: " + molocoAd, null, false, 12, null);
        if (c1890d != null && (str = c1890d.f28784c) != null) {
            this.f28907b.a(str, System.currentTimeMillis(), null);
        }
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        com.moloco.sdk.acm.l lVar = this.f28908c;
        lVar.a("result", "success");
        AdFormatType adFormatType = this.f28909d;
        String strName = adFormatType.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        lVar.a("ad_type", lowerCase);
        tf.a aVar = this.f28911f;
        String strF = xg.g.f(aVar);
        if (strF != null) {
            lVar.a("creative_type", strF);
        }
        com.moloco.sdk.acm.recorder.c cVar = this.f28910e;
        cVar.b(lVar);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("load_ad_success");
        String lowerCase2 = adFormatType.name().toLowerCase(locale);
        AbstractC3340k.d(lowerCase2, "toLowerCase(...)");
        hVar.a("ad_type", lowerCase2);
        xg.g.g(hVar, aVar);
        cVar.a(hVar);
        AdLoad.Listener listener = this.f28906a;
        if (listener != null) {
            listener.onAdLoadSuccess(molocoAd);
        }
    }
}
