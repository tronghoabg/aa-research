package com.bytedance.sdk.openadsdk.uef.oa;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.km;

/* loaded from: classes3.dex */
public class lw implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener uef;

    public lw(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.uef = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xs
    public void onError(final int i5, final String str) {
        if (this.uef == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.oa.lw.1
            @Override // java.lang.Runnable
            public void run() {
                if (lw.this.uef != null) {
                    lw.this.uef.onError(i5, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.uef == null) {
            return;
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.oa.lw.2
            @Override // java.lang.Runnable
            public void run() {
                if (lw.this.uef != null) {
                    lw.this.uef.onAdLoaded(pAGNativeAd);
                }
            }
        });
    }
}
