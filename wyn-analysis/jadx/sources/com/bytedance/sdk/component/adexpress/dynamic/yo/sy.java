package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class sy implements xs<com.bytedance.sdk.component.adexpress.ivm.dj> {
    private final com.bytedance.sdk.component.adexpress.ivm.dj uef;

    public sy(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        com.bytedance.sdk.component.adexpress.ivm.dj djVar = new com.bytedance.sdk.component.adexpress.ivm.dj(context);
        this.uef = djVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, xsVar.au() > 0 ? xsVar.au() : com.bytedance.sdk.component.adexpress.moa.oa() ? 0 : 120);
        djVar.setLayoutParams(layoutParams);
        djVar.setClipChildren(false);
        djVar.setText(xsVar.rj());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    /* renamed from: moa, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ivm.dj yo() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void oa() {
        com.bytedance.sdk.component.adexpress.ivm.dj djVar = this.uef;
        if (djVar != null) {
            djVar.oa();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void uef() {
        com.bytedance.sdk.component.adexpress.ivm.dj djVar = this.uef;
        if (djVar != null) {
            djVar.uef();
        }
    }
}
