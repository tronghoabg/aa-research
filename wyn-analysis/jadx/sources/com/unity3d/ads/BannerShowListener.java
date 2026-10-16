package com.unity3d.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@UnityAdsExperimental
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/BannerShowListener;", "", "Lcom/unity3d/ads/BannerAd;", "banner", "Lef/C;", "onImpression", "(Lcom/unity3d/ads/BannerAd;)V", "onClicked", "Lcom/unity3d/ads/UnityAdsError;", "error", "onFailedToShow", "(Lcom/unity3d/ads/BannerAd;Lcom/unity3d/ads/UnityAdsError;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BannerShowListener {
    void onClicked(@NotNull BannerAd banner);

    void onFailedToShow(@NotNull BannerAd banner, @NotNull UnityAdsError error);

    void onImpression(@NotNull BannerAd banner);
}
