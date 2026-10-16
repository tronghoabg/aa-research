package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* loaded from: classes3.dex */
class oib implements TTClientBidding {
    private final bcc uef;

    public oib(Context context, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        this.uef = new bcc(context, uefVar);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d3, String str, String str2) {
        this.uef.loss(d3, str, str2);
    }

    public void oa() {
        this.uef.uef();
    }

    public bcc uef() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d3) {
        this.uef.win(d3);
    }
}
