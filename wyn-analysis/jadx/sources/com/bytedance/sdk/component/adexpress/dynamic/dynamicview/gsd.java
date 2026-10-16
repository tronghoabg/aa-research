package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class gsd extends ivm {
    private int uef;

    public gsd(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        this.uef = 0;
        com.bytedance.sdk.component.adexpress.ivm.gzw gzwVar = new com.bytedance.sdk.component.adexpress.ivm.gzw(context, null);
        this.wk = gzwVar;
        gzwVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.wk, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() throws NumberFormatException {
        DynamicRootView dynamicRootView;
        super.cz();
        double dCq = this.wrv.cq();
        if (com.bytedance.sdk.component.adexpress.moa.oa() && (dCq < 0.0d || dCq > 5.0d || ((dynamicRootView = this.dz) != null && dynamicRootView.getRenderRequest() != null && this.dz.getRenderRequest().zjm() != 4))) {
            this.wk.setVisibility(8);
            return true;
        }
        double d3 = (dCq < 0.0d || dCq > 5.0d) ? 5.0d : dCq;
        this.wk.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.ivm.gzw) this.wk).uef(d3, this.wrv.xs(), (int) this.wrv.lw(), ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.oa())) + ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.uef())) + ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.lw())));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iUef = (int) (com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.moa()) + this.wrv.yo()) + (com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.lw()) * 5.0f));
        if (this.xs > iUef && 4 == this.wrv.bcc()) {
            this.uef = (this.xs - iUef) / 2;
        }
        this.xs = iUef;
        return new FrameLayout.LayoutParams(this.xs, this.bcc);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public void ivm() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xs, this.bcc);
        layoutParams.topMargin = this.zjm;
        int i5 = this.cz + this.uef;
        layoutParams.leftMargin = i5;
        layoutParams.setMarginStart(i5);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }
}
