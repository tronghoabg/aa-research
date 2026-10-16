package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class i0 extends BaseAd {

    /* renamed from: s, reason: collision with root package name */
    public final VungleAdSize f33020s;

    /* renamed from: t, reason: collision with root package name */
    public final j0 f33021t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, String placementId, VungleAdSize adSize, AdConfig adConfig) {
        super(context, placementId, adConfig);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(adSize, "adSize");
        AbstractC3340k.e(adConfig, "adConfig");
        this.f33020s = adSize;
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.f33021t = ((k0) adInternal$vungle_ads_release).a(new h0(this));
    }

    public final j0 a() {
        return this.f33021t;
    }

    @Override // com.vungle.ads.BaseAd
    public final s constructAdInternal$vungle_ads_release(Context context) {
        AbstractC3340k.e(context, "context");
        return new k0(context, this.f33020s);
    }

    public final VungleAdSize getAdViewSize() {
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        VungleAdSize vungleAdSizeM = ((k0) adInternal$vungle_ads_release).m();
        return vungleAdSizeM == null ? this.f33020s : vungleAdSizeM;
    }
}
