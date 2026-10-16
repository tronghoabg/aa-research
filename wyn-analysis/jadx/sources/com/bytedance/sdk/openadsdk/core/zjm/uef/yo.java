package com.bytedance.sdk.openadsdk.core.zjm.uef;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class yo implements com.bytedance.sdk.openadsdk.cq.uef {
    private final View uef;

    public yo(View view) {
        this.uef = view;
    }

    @Override // com.bytedance.sdk.openadsdk.cq.uef
    public int oa() {
        View view = this.uef;
        int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
        return measuredWidth <= 0 ? af.yo(sy.uef()) : measuredWidth;
    }

    @Override // com.bytedance.sdk.openadsdk.cq.uef
    public int uef() {
        View view = this.uef;
        int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
        return measuredHeight <= 0 ? af.lw(sy.uef()) : measuredHeight;
    }
}
