package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class dj implements com.bytedance.sdk.openadsdk.uef.lw.uef {
    private final gzw ivm;
    private final AtomicBoolean lw;
    private final AtomicBoolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private final PAGRewardedAdInteractionCallback f25367oa;
    private final PAGRewardedAdInteractionListener uef;
    private final AtomicBoolean yo;

    public dj(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        this.yo = new AtomicBoolean(false);
        this.moa = new AtomicBoolean(false);
        this.lw = new AtomicBoolean(false);
        this.uef = pAGRewardedAdInteractionListener;
        this.f25367oa = null;
        this.ivm = uefVar != null ? uefVar.xs() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.uef.lw.uef
    public void oa() {
        this.moa.get();
        com.bytedance.sdk.openadsdk.moa.zjm.uef("close_callback", this.moa.get(), this.yo.get(), this.ivm);
        if (this.moa.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.dhk.uef("BVA", "reward video onAdClose");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.uef;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdDismissed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f25367oa;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdDismissed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.uef;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f25367oa;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.uef.lw.uef
    public void uef() {
        this.yo.get();
        com.bytedance.sdk.openadsdk.moa.zjm.uef("show_callback", this.moa.get(), this.yo.get(), this.ivm);
        if (this.yo.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.dhk.uef("BVA", "reward video onAdShow");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.uef;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdShowed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f25367oa;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdShowed();
            }
        }
    }

    public dj(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        this.yo = new AtomicBoolean(false);
        this.moa = new AtomicBoolean(false);
        this.lw = new AtomicBoolean(false);
        this.f25367oa = pAGRewardedAdInteractionCallback;
        this.uef = null;
        this.ivm = uefVar != null ? uefVar.xs() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.uef.lw.uef
    public void uef(boolean z2, int i5, String str, int i10, String str2) {
        if (this.lw.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.dhk.uef("BVA", "reward video onRewardVerify");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.uef;
            if (pAGRewardedAdInteractionListener != null) {
                if (z2) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i5, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i10, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f25367oa;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z2) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i5, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i10, str2));
                }
            }
        }
    }
}
