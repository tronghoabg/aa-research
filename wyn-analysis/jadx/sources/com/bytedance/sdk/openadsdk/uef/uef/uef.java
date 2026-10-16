package com.bytedance.sdk.openadsdk.uef.uef;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.km;

/* loaded from: classes3.dex */
public class uef implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener uef;

    public uef(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.uef = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xs
    public void onError(final int i5, final String str) {
        if (this.uef == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.uef.uef.1
            @Override // java.lang.Runnable
            public void run() {
                uef.this.uef.onError(i5, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.uef == null) {
            return;
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.uef.uef.2
            @Override // java.lang.Runnable
            public void run() {
                uef.this.uef.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
