package com.vungle.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/BaseAdListener;", "", "Lcom/vungle/ads/BaseAd;", "baseAd", "Lef/C;", "onAdLoaded", "(Lcom/vungle/ads/BaseAd;)V", "onAdStart", "onAdImpression", "onAdEnd", "onAdClicked", "onAdLeftApplication", "Lcom/vungle/ads/VungleError;", "adError", "onAdFailedToLoad", "(Lcom/vungle/ads/BaseAd;Lcom/vungle/ads/VungleError;)V", "onAdFailedToPlay", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public interface BaseAdListener {
    void onAdClicked(@NotNull BaseAd baseAd);

    void onAdEnd(@NotNull BaseAd baseAd);

    void onAdFailedToLoad(@NotNull BaseAd baseAd, @NotNull VungleError adError);

    void onAdFailedToPlay(@NotNull BaseAd baseAd, @NotNull VungleError adError);

    void onAdImpression(@NotNull BaseAd baseAd);

    void onAdLeftApplication(@NotNull BaseAd baseAd);

    void onAdLoaded(@NotNull BaseAd baseAd);

    void onAdStart(@NotNull BaseAd baseAd);
}
