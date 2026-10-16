package com.unity3d.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@UnityAdsExperimental
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/RewardedShowListener;", "Lcom/unity3d/ads/ShowListener;", "Lcom/unity3d/ads/RewardedAd;", "rewardedAd", "Lef/C;", "onRewarded", "(Lcom/unity3d/ads/RewardedAd;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface RewardedShowListener extends ShowListener<RewardedAd> {
    void onRewarded(@NotNull RewardedAd rewardedAd);
}
