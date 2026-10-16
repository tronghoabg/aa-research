package com.bytedance.sdk.openadsdk.uef.oa.uef;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.zjm.dhk;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;

/* loaded from: classes3.dex */
public class oa extends yo {
    public oa(Context context, gzw gzwVar, AdSlot adSlot) {
        super(context, gzwVar, adSlot);
    }

    public com.bytedance.sdk.openadsdk.oib.yo.uef oa() {
        tpx tpxVar = this.zjm;
        if (tpxVar != null) {
            return ((dhk) tpxVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.uef.oa.uef.yo
    public void uef() {
        dhk dhkVar = new dhk(((yo) this).bcc, this.f26109oa, ((yo) this).cz, this.dj, false);
        this.zjm = dhkVar;
        this.uef.uef(dhkVar.getVideoController());
        yo();
    }
}
