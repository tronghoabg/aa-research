package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class wrv implements xs {
    private com.bytedance.sdk.component.adexpress.ivm.cq uef;

    public wrv(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        this.uef = new com.bytedance.sdk.component.adexpress.ivm.cq(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, 180.0f));
        layoutParams.gravity = 17;
        this.uef.setLayoutParams(layoutParams);
        this.uef.setGuideText(xsVar.rj());
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
