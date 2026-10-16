package com.unity3d.services.banners.bridge;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.BannerShowListenerWithOnFailedToShow;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006J'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/unity3d/services/banners/bridge/BannerBridge$onBannerLoaded$1$2", "Lcom/unity3d/ads/core/data/model/Listeners;", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "Lef/C;", "onLeftApplication", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "state", "onComplete", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;)V", "onClick", "onStart", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "error", PglCryptUtils.KEY_MESSAGE, "onError", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowError;Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannerBridge$onBannerLoaded$1$2 implements Listeners {
    final /* synthetic */ BannerView $bannerAdView;
    final /* synthetic */ BannerView.IListener $bannerListener;

    public BannerBridge$onBannerLoaded$1$2(BannerView.IListener iListener, BannerView bannerView) {
        this.$bannerListener = iListener;
        this.$bannerAdView = bannerView;
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onClick(@NotNull String placementId) {
        AbstractC3340k.e(placementId, "placementId");
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerClick(this.$bannerAdView);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onComplete(@NotNull String placementId, @NotNull UnityAds.UnityAdsShowCompletionState state) {
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(state, "state");
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onError(@NotNull String placementId, @NotNull UnityAds.UnityAdsShowError error, @NotNull String message) {
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(error, "error");
        AbstractC3340k.e(message, "message");
        if (this.$bannerListener instanceof BannerShowListenerWithOnFailedToShow) {
            BannerErrorInfo bannerErrorInfo = BannerErrorInfo.fromShowError(error, message);
            BannerView.IListener iListener = this.$bannerListener;
            AbstractC3340k.c(iListener, "null cannot be cast to non-null type com.unity3d.ads.BannerShowListenerWithOnFailedToShow");
            BannerView bannerView = this.$bannerAdView;
            AbstractC3340k.d(bannerErrorInfo, "bannerErrorInfo");
            ((BannerShowListenerWithOnFailedToShow) iListener).onBannerFailedToShow(bannerView, bannerErrorInfo);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onLeftApplication(@NotNull String placementId) {
        AbstractC3340k.e(placementId, "placementId");
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerLeftApplication(this.$bannerAdView);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onRewarded(@NotNull String str) {
        Listeners.DefaultImpls.onRewarded(this, str);
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onStart(@NotNull String placementId) {
        AbstractC3340k.e(placementId, "placementId");
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerShown(this.$bannerAdView);
        }
    }
}
