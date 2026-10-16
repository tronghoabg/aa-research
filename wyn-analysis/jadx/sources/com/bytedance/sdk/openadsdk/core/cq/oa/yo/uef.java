package com.bytedance.sdk.openadsdk.core.cq.oa.yo;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.adsdk.ugeno.cz.oa.uef {
    private final com.bytedance.adsdk.ugeno.cz.oa.uef uef;

    public uef(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.cz.oa.uef uefVar = new com.bytedance.adsdk.ugeno.cz.oa.uef(context);
        this.uef = uefVar;
        addView(uefVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.cz.oa.uef getPlayableView() {
        return this.uef;
    }
}
