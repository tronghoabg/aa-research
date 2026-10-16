package com.bytedance.sdk.openadsdk.component.yo;

import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.moa.zjm;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class uef implements com.bytedance.sdk.openadsdk.uef.yo.oa {
    private final gzw moa;
    private final PAGInterstitialAdInteractionListener uef;

    /* renamed from: oa, reason: collision with root package name */
    private final AtomicBoolean f25489oa = new AtomicBoolean(false);
    private final AtomicBoolean yo = new AtomicBoolean(false);

    public uef(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        this.uef = pAGInterstitialAdInteractionListener;
        this.moa = uefVar != null ? uefVar.xs() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.uef.yo.oa
    public void oa() {
        zjm.uef("close_callback", this.yo.get(), this.f25489oa.get(), this.moa);
        if (this.yo.compareAndSet(false, true)) {
            dhk.uef("BVA", "full video onAdClose");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.uef;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdDismissed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.uef;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.uef.yo.oa
    public void uef() {
        zjm.uef("show_callback", this.yo.get(), this.f25489oa.get(), this.moa);
        if (this.f25489oa.compareAndSet(false, true)) {
            dhk.uef("BVA", "full video onAdShow");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.uef;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdShowed();
            }
        }
    }
}
