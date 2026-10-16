package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ivm.tpx;

/* loaded from: classes.dex */
public class lw extends bs<com.bytedance.sdk.component.adexpress.ivm.xs> {
    public lw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        super(context, lwVar, xsVar);
        uef(xsVar);
    }

    private void uef(com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        this.uef = new com.bytedance.sdk.component.adexpress.ivm.bcc(this.f24877oa);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.uef.setLayoutParams(layoutParams);
        tpx tpxVar = this.uef;
        if (tpxVar instanceof com.bytedance.sdk.component.adexpress.ivm.bcc) {
            ((com.bytedance.sdk.component.adexpress.ivm.bcc) tpxVar).setButtonText(this.moa.rj());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.bs
    public void moa() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.bs, com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void oa() {
        this.uef.oa();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.bs, com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void uef() {
        this.uef.uef();
    }
}
