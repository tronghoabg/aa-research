package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.wk;

/* loaded from: classes3.dex */
public class sy extends uef<PAGRewardedAdLoadListener, TTClientBidding> {
    public sy(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public int ivm() {
        return 6;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public int oa() {
        return 7;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public TTClientBidding uef(Context context, com.bytedance.sdk.openadsdk.core.model.uef uefVar, AdSlot adSlot) {
        return new dhk(context, uefVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public void oa(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof dhk) {
            ((dhk) tTClientBidding).oa();
        }
    }

    public static sy uef(Context context) {
        return (sy) tpx.uef(context, 7);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public wk uef() {
        return wk.uef(this.uef, wk.uef.REWARD_VIDEO);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public Object uef(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof dhk) {
            return ((dhk) tTClientBidding).uef();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public void uef(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, int i5, String str) {
        pAGRewardedAdLoadListener.onError(i5, str);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public void uef(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, Object obj) {
        if (pAGRewardedAdLoadListener == null || obj == null || !(obj instanceof PAGRewardedAd)) {
            return;
        }
        pAGRewardedAdLoadListener.onAdLoaded((PAGRewardedAd) obj);
    }
}
