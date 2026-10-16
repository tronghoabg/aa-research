package com.unity3d.scar.adapter.common;

import android.content.Context;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;

/* loaded from: classes4.dex */
public interface e {
    void a(Context context, nb.c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler);

    void b(Context context, BannerView bannerView, nb.c cVar, int i5, int i10, ScarBannerAdHandler scarBannerAdHandler);

    void c(Context context, nb.c cVar, ScarRewardedAdHandler scarRewardedAdHandler);
}
