package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class yo implements xs {
    com.bytedance.sdk.component.adexpress.ivm.lw uef;

    public yo(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        this.uef = new com.bytedance.sdk.component.adexpress.ivm.lw(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(lwVar.getDynamicHeight(), lwVar.getDynamicHeight());
        layoutParams.gravity = 17;
        this.uef.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    /* renamed from: moa, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ivm.lw yo() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void oa() {
        this.uef.oa();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void uef() {
        this.uef.uef();
    }
}
