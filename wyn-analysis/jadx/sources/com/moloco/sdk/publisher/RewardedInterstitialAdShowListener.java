package com.moloco.sdk.publisher;

import ef.InterfaceC2519c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;", "Lcom/moloco/sdk/publisher/InterstitialAdShowListener;", "Lcom/moloco/sdk/publisher/MolocoAd;", "molocoAd", "Lef/C;", "onUserRewarded", "(Lcom/moloco/sdk/publisher/MolocoAd;)V", "onRewardedVideoStarted", "onRewardedVideoCompleted", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface RewardedInterstitialAdShowListener extends InterstitialAdShowListener {
    @InterfaceC2519c
    void onRewardedVideoCompleted(@NotNull MolocoAd molocoAd);

    @InterfaceC2519c
    void onRewardedVideoStarted(@NotNull MolocoAd molocoAd);

    void onUserRewarded(@NotNull MolocoAd molocoAd);
}
