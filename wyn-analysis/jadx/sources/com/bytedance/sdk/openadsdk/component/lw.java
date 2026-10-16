package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class lw implements com.bytedance.sdk.openadsdk.uef.moa.oa {
    private final PAGAppOpenAdInteractionListener uef;

    /* renamed from: oa, reason: collision with root package name */
    private final AtomicBoolean f25341oa = new AtomicBoolean(false);
    private final AtomicBoolean yo = new AtomicBoolean(false);

    public lw(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.uef = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.uef.moa.oa
    public void oa() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        dhk.uef("BVA", "onAdSkip");
        if (this.f25341oa.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.uef) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        dhk.uef("BVA", "onAdClicked");
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.uef;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.uef.moa.oa
    public void uef() {
        if (this.yo.compareAndSet(false, true)) {
            dhk.uef("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.uef;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.uef.moa.oa
    public void yo() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.f25341oa.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.uef) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
