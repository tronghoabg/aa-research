package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.km;

/* loaded from: classes3.dex */
public class cz implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener uef;

    public cz(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.uef = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xs
    public void onError(final int i5, final String str) {
        if (this.uef != null) {
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.cz.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = cz.this.uef;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i5, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.uef != null) {
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.cz.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = cz.this.uef;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }
}
