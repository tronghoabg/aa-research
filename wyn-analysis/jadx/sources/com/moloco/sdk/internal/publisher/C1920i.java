package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.C1890d;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.internal.publisher.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1920i implements RewardedInterstitialAdShowListener, AdShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.ads.nativead.l f29038a;

    /* renamed from: b, reason: collision with root package name */
    public final RewardedInterstitialAdShowListener f29039b;

    /* renamed from: c, reason: collision with root package name */
    public final C1917f f29040c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.B f29041d;

    public C1920i(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, C1917f c1917f, com.moloco.sdk.internal.B sdkEventUrlTracker) {
        AbstractC3340k.e(sdkEventUrlTracker, "sdkEventUrlTracker");
        this.f29038a = new com.google.android.gms.ads.nativead.l(rewardedInterstitialAdShowListener, 1);
        this.f29039b = rewardedInterstitialAdShowListener;
        this.f29040c = c1917f;
        this.f29041d = sdkEventUrlTracker;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        this.f29038a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        this.f29038a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        AbstractC3340k.e(molocoAdError, "molocoAdError");
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f29039b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        this.f29038a.onAdShowSuccess(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoCompleted(MolocoAd molocoAd) {
        String str;
        AbstractC3340k.e(molocoAd, "molocoAd");
        C1890d c1890d = (C1890d) this.f29040c.invoke();
        if (c1890d != null && (str = c1890d.f28791j) != null) {
            this.f29041d.a(str, System.currentTimeMillis(), null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f29039b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoCompleted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoStarted(MolocoAd molocoAd) {
        String str;
        AbstractC3340k.e(molocoAd, "molocoAd");
        C1890d c1890d = (C1890d) this.f29040c.invoke();
        if (c1890d != null && (str = c1890d.f28790i) != null) {
            this.f29041d.a(str, System.currentTimeMillis(), null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f29039b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onUserRewarded(MolocoAd molocoAd) {
        String str;
        AbstractC3340k.e(molocoAd, "molocoAd");
        C1890d c1890d = (C1890d) this.f29040c.invoke();
        if (c1890d != null && (str = c1890d.f28789h) != null) {
            this.f29041d.a(str, System.currentTimeMillis(), null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f29039b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onUserRewarded(molocoAd);
        }
    }
}
