package com.bytedance.sdk.openadsdk.uef.oa;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.km;

/* loaded from: classes3.dex */
public class xs implements ivm {
    private final PAGNativeAdInteractionListener uef;

    public xs(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.uef = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.uef.oa.ivm
    public boolean oa() {
        return this.uef != null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.oa.xs.1
            @Override // java.lang.Runnable
            public void run() {
                if (xs.this.uef != null) {
                    xs.this.uef.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.uef.oa.ivm
    public void uef(PAGNativeAd pAGNativeAd) {
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.oa.xs.2
            @Override // java.lang.Runnable
            public void run() {
                if (xs.this.uef != null) {
                    xs.this.uef.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.uef.oa.ivm
    public void uef() {
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.oa.xs.3
            @Override // java.lang.Runnable
            public void run() {
                if (xs.this.uef != null) {
                    xs.this.uef.onAdDismissed();
                }
            }
        });
    }
}
