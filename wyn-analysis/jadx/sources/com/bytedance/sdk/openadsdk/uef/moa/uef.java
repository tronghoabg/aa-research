package com.bytedance.sdk.openadsdk.uef.moa;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.km;

/* loaded from: classes3.dex */
public class uef implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener uef;

    public uef(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.uef = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xs
    public void onError(final int i5, final String str) {
        if (this.uef == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.moa.uef.1
            @Override // java.lang.Runnable
            public void run() {
                if (uef.this.uef != null) {
                    uef.this.uef.onError(i5, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.uef == null) {
            return;
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uef.moa.uef.2
            @Override // java.lang.Runnable
            public void run() {
                if (uef.this.uef != null) {
                    uef.this.uef.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
