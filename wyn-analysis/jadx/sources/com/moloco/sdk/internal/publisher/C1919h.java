package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.internal.publisher.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1919h implements RewardedInterstitialAdShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final C1920i f29027a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29028b;

    /* renamed from: c, reason: collision with root package name */
    public final C1917f f29029c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29030d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29031e;

    /* renamed from: f, reason: collision with root package name */
    public final C1917f f29032f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f29033g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29034h;

    public C1919h(C1920i c1920i, boolean z2, C1917f c1917f, String adUnitId, boolean z10, C1917f c1917f2, com.moloco.sdk.acm.recorder.c cVar) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        this.f29027a = c1920i;
        this.f29028b = z2;
        this.f29029c = c1917f;
        this.f29030d = adUnitId;
        this.f29031e = z10;
        this.f29032f = c1917f2;
        this.f29033g = cVar;
    }

    public final void a(MolocoAd molocoAd) {
        String strName;
        if (this.f29034h) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "issuing of reward is already handled", false, 4, null);
            return;
        }
        this.f29034h = true;
        if (!AbstractC3340k.a(this.f29029c.invoke(), Boolean.FALSE)) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "reward can't be issued: ad was forcibly closed or ad was missing", false, 4, null);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l) this.f29032f.invoke();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "issuing of reward... creativeType: " + lVar, false, 4, null);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("reward_issued");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        String lowerCase = (lVar == null || (strName = lVar.name()) == null) ? "UNKNOWN".toLowerCase(Locale.ROOT) : strName.toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        hVar.a("creative_type", lowerCase);
        this.f29033g.a(hVar);
        onUserRewarded(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        this.f29027a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        a(molocoAd);
        this.f29027a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        AbstractC3340k.e(molocoAdError, "molocoAdError");
        this.f29027a.onAdShowFailed(molocoAdError);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        this.f29027a.onAdShowSuccess(molocoAd);
        if (this.f29028b) {
            onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoCompleted(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        a(molocoAd);
        this.f29027a.onRewardedVideoCompleted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoStarted(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        this.f29027a.onRewardedVideoStarted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onUserRewarded(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        this.f29027a.onUserRewarded(molocoAd);
    }
}
