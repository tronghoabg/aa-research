package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class uef implements xs {
    private com.bytedance.sdk.component.adexpress.ivm.oa uef;

    public uef(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        double dOu = xsVar.ou();
        dOu = dOu == 0.0d ? 1.0d : dOu;
        double dHnk = xsVar.hnk();
        int dynamicWidth = (int) (lwVar.getDynamicWidth() * 0.32d * dOu);
        int dynamicWidth2 = (int) (lwVar.getDynamicWidth() * 0.32d * (dHnk != 0.0d ? dHnk : 1.0d));
        this.uef = new com.bytedance.sdk.component.adexpress.ivm.oa(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, xsVar.wxf() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, xsVar.hg() - 3);
        this.uef.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void oa() {
        this.uef.oa();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void uef() {
        this.uef.uef();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public ViewGroup yo() {
        return this.uef;
    }
}
