package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C1890d;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.internal.publisher.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1913b {

    /* renamed from: a, reason: collision with root package name */
    public final AdShowListener f28993a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.u f28994b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.events.c f28995c;

    /* renamed from: d, reason: collision with root package name */
    public final tf.a f28996d;

    /* renamed from: e, reason: collision with root package name */
    public final tf.a f28997e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.internal.B f28998f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.j f28999g;

    /* renamed from: h, reason: collision with root package name */
    public final AdFormatType f29000h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f29001i;

    /* renamed from: j, reason: collision with root package name */
    public final Y2.B f29002j;
    public final tf.a k;

    public C1913b(AdShowListener adShowListener, com.moloco.sdk.internal.services.u appLifecycleTrackerService, com.moloco.sdk.internal.services.events.c customUserEventBuilderService, tf.a aVar, tf.a aVar2, com.moloco.sdk.internal.B b5, com.moloco.sdk.internal.j jVar, AdFormatType adType, com.moloco.sdk.acm.recorder.c metricsRecorder, Y2.B b10, tf.a aVar3) {
        AbstractC3340k.e(appLifecycleTrackerService, "appLifecycleTrackerService");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(adType, "adType");
        AbstractC3340k.e(metricsRecorder, "metricsRecorder");
        this.f28993a = adShowListener;
        this.f28994b = appLifecycleTrackerService;
        this.f28995c = customUserEventBuilderService;
        this.f28996d = aVar;
        this.f28997e = aVar2;
        this.f28998f = b5;
        this.f28999g = jVar;
        this.f29000h = adType;
        this.f29001i = metricsRecorder;
        this.f29002j = b10;
        this.k = aVar3;
    }

    public final void a(com.moloco.sdk.internal.r internalError) {
        String str;
        AbstractC3340k.e(internalError, "internalError");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdShowFailed: " + internalError, false, 4, null);
        C1890d c1890d = (C1890d) this.f28996d.invoke();
        if (c1890d != null && (str = c1890d.f28785d) != null) {
            this.f28998f.a(str, System.currentTimeMillis(), internalError);
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("show_ad_failed");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        String lowerCase = this.f29000h.name().toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        hVar.a("ad_type", lowerCase);
        MolocoAdError molocoAdError = internalError.f29363a;
        hVar.a("reason", String.valueOf(molocoAdError.getErrorType()));
        this.f29001i.a(hVar);
        AdShowListener adShowListener = this.f28993a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(molocoAdError);
        }
    }

    public final void b(MolocoAd molocoAd, String str) {
        C1913b c1913b;
        String str2;
        AbstractC3340k.e(molocoAd, "molocoAd");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("onAdShowSuccess: ");
        sb2.append(molocoAd);
        sb2.append(", creativeType: ");
        tf.a aVar = this.k;
        sb2.append(aVar != null ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l) aVar.invoke() : null);
        MolocoLogger.debug$default(molocoLogger, "InternalAdShowListenerImpl", sb2.toString(), false, 4, null);
        C1890d c1890d = (C1890d) this.f28996d.invoke();
        if (c1890d != null && (str2 = c1890d.f28786e) != null) {
            this.f28998f.a(str2, System.currentTimeMillis(), null);
        }
        ((AtomicBoolean) this.f29002j.f16384c).set(false);
        D d3 = (D) this.f28997e.invoke();
        if (d3 != null) {
            c1913b = this;
            Ef.H.D(com.moloco.sdk.internal.scheduling.a.f29366a, null, new C1912a(c1913b, System.currentTimeMillis(), d3, null), 3);
        } else {
            c1913b = this;
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("show_ad_success");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        String lowerCase = c1913b.f29000h.name().toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        hVar.a("ad_type", lowerCase);
        xg.g.g(hVar, aVar);
        if (str != null) {
            hVar.a("parent_view_type", str);
        }
        c1913b.f29001i.a(hVar);
        AdShowListener adShowListener = c1913b.f28993a;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }

    public final void c(MolocoAd molocoAd) {
        String str;
        AbstractC3340k.e(molocoAd, "molocoAd");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "InternalAdShowListenerImpl", "onAdClicked: " + molocoAd, false, 4, null);
        com.moloco.sdk.internal.services.u uVar = this.f28994b;
        Ef.H.D(uVar.f29721c, null, new com.moloco.sdk.internal.services.t(uVar, null), 3);
        C1890d c1890d = (C1890d) this.f28996d.invoke();
        if (c1890d != null && (str = c1890d.f28787f) != null) {
            this.f28998f.a(str, System.currentTimeMillis(), null);
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("ad_clicked");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        AdFormatType adFormatType = this.f29000h;
        String strName = adFormatType.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        hVar.a("ad_type", lowerCase);
        xg.g.g(hVar, this.k);
        this.f29001i.a(hVar);
        Y2.B b5 = this.f29002j;
        AtomicBoolean atomicBoolean = (AtomicBoolean) b5.f16384c;
        if (atomicBoolean.compareAndSet(false, true)) {
            MolocoLogger.info$default(molocoLogger, "AcmClickDeduper", "Deduped click logged", null, false, 12, null);
            com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("ad_clicked_deduped");
            String lowerCase2 = adFormatType.name().toLowerCase(locale);
            AbstractC3340k.d(lowerCase2, "toLowerCase(...)");
            hVar2.a("ad_type", lowerCase2);
            ((com.moloco.sdk.acm.recorder.c) b5.f16383b).a(hVar2);
        }
        atomicBoolean.set(true);
        AdShowListener adShowListener = this.f28993a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    public final void d(MolocoAd molocoAd) {
        String str;
        AbstractC3340k.e(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdHidden: " + molocoAd, false, 4, null);
        C1890d c1890d = (C1890d) this.f28996d.invoke();
        if (c1890d != null && (str = c1890d.f28788g) != null) {
            this.f28998f.a(str, System.currentTimeMillis(), null);
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("ad_hidden");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        String lowerCase = this.f29000h.name().toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        hVar.a("ad_type", lowerCase);
        xg.g.g(hVar, this.k);
        this.f29001i.a(hVar);
        AdShowListener adShowListener = this.f28993a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }
}
