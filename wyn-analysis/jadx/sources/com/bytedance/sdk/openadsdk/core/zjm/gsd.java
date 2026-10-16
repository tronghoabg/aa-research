package com.bytedance.sdk.openadsdk.core.zjm;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.AdSlot;

/* loaded from: classes3.dex */
public class gsd extends tpx {
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private lw f25857oa;
    public int uef;
    private String yo;

    public gsd(Activity activity, Context context, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot, String str) {
        super(activity, context, gzwVar, adSlot, str);
        this.uef = 1;
        this.moa = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public void bcc() {
        this.bs = new com.bytedance.sdk.openadsdk.moa.oib(11, this.zjm, this.wrv);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public boolean dhk() {
        return this.moa;
    }

    public void dz() {
        if (getJsObject() != null) {
            getJsObject().dhk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.openadsdk.core.zjm.ab
    public void ivm() {
        lw lwVar = this.f25857oa;
        if (lwVar != null) {
            lwVar.uef(this.yo);
        }
    }

    public void setAdInteractionListener(com.bytedance.sdk.openadsdk.component.reward.yo.uef uefVar) {
        if (getJsObject() != null) {
            getJsObject().uef(uefVar);
        }
    }

    public void setDislikeClickListener(lw lwVar) {
        this.f25857oa = lwVar;
    }

    public void setHeartBeatListener(com.bytedance.sdk.openadsdk.component.reward.yo.moa moaVar) {
        if (getJsObject() != null) {
            getJsObject().uef(moaVar);
        }
    }

    public void setRewardControlListener(com.bytedance.sdk.openadsdk.component.reward.yo.ivm ivmVar) {
        if (getJsObject() != null) {
            getJsObject().uef(ivmVar);
        }
    }

    public void setShouldNotifyAdVisibility(boolean z2) {
        this.moa = z2;
    }

    public void setVideoTrackListener(com.bytedance.sdk.openadsdk.component.reward.yo.cz czVar) {
        if (getJsObject() != null) {
            getJsObject().uef(czVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.component.adexpress.oa.wk
    public void uef(com.bytedance.sdk.component.adexpress.oa.moa<? extends View> moaVar, com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
        this.cp = moaVar;
        super.uef(moaVar, dzVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
    public void xs() {
        this.wk = true;
        super.xs();
        com.bytedance.sdk.component.cz.ivm webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx, com.bytedance.sdk.component.adexpress.oa.bcc
    public void uef(View view, int i5, com.bytedance.sdk.component.adexpress.yo yoVar) {
        if (i5 != -1 && yoVar != null && i5 == 3) {
            if (yoVar instanceof com.bytedance.sdk.openadsdk.core.model.ab) {
                this.yo = ((com.bytedance.sdk.openadsdk.core.model.ab) yoVar).f25656ab;
            }
            ivm();
            return;
        }
        super.uef(view, i5, yoVar);
    }
}
