package com.bytedance.sdk.openadsdk.uef.lw;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.km;

/* loaded from: classes3.dex */
public class oa implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener uef;

    public oa(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.uef = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xs
    public void onError(final int i5, final String str) {
        if (this.uef == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.lw.oa.1
            @Override // java.lang.Runnable
            public void run() {
                if (oa.this.uef != null) {
                    oa.this.uef.onError(i5, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.uef == null) {
            return;
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.lw.oa.2
            @Override // java.lang.Runnable
            public void run() {
                if (oa.this.uef != null) {
                    oa.this.uef.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
