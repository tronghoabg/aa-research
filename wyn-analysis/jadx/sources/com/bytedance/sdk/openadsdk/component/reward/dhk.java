package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* loaded from: classes3.dex */
class dhk implements TTClientBidding {
    private final zjm uef;

    public dhk(Context context, com.bytedance.sdk.openadsdk.core.model.uef uefVar, AdSlot adSlot) {
        this.uef = new zjm(context, uefVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d3, String str, String str2) {
        this.uef.loss(d3, str, str2);
    }

    public void oa() {
        this.uef.uef();
    }

    public zjm uef() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d3) {
        this.uef.win(d3);
    }
}
