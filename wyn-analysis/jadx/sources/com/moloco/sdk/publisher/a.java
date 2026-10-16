package com.moloco.sdk.publisher;

import android.app.Activity;
import com.moloco.sdk.publisher.MolocoAdError;
import tf.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f29814b;

    public /* synthetic */ a(Activity activity, int i5) {
        this.f29813a = i5;
        this.f29814b = activity;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29813a) {
            case 0:
                return BannerActivitySample.onCreate$lambda$0((BannerActivitySample) this.f29814b, (Banner) obj, (MolocoAdError.AdCreateError) obj2);
            case 1:
                return InterstitialAdActivitySample.onCreate$lambda$0((InterstitialAdActivitySample) this.f29814b, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            default:
                return RewardedInterstitialAdSample.onCreate$lambda$0((RewardedInterstitialAdSample) this.f29814b, (RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
        }
    }
}
