package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.wk;

/* loaded from: classes3.dex */
public class xs extends uef<PAGInterstitialAdLoadListener, TTClientBidding> {
    public xs(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public int ivm() {
        return 5;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public int oa() {
        return 8;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public TTClientBidding uef(Context context, com.bytedance.sdk.openadsdk.core.model.uef uefVar, AdSlot adSlot) {
        return new oib(context, uefVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public void oa(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof oib) {
            ((oib) tTClientBidding).oa();
        }
    }

    public static xs uef(Context context) {
        return (xs) tpx.uef(context, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public wk uef() {
        return wk.uef(this.uef, wk.uef.FULL_SCREEN_VIDEO);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public Object uef(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof oib) {
            return ((oib) tTClientBidding).uef();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public void uef(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, int i5, String str) {
        pAGInterstitialAdLoadListener.onError(i5, str);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.uef
    public void uef(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, Object obj) {
        if (pAGInterstitialAdLoadListener == null || obj == null || !(obj instanceof PAGInterstitialAd)) {
            return;
        }
        pAGInterstitialAdLoadListener.onAdLoaded((PAGInterstitialAd) obj);
    }
}
