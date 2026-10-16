package com.bytedance.sdk.openadsdk.core.cq.oa.oa;

import android.content.Context;
import com.bytedance.adsdk.oa.ivm;
import com.bytedance.adsdk.ugeno.moa;

/* loaded from: classes3.dex */
public class oa extends ivm {
    private moa uef;

    public oa(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.oa.ivm, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.xs();
        }
    }

    @Override // com.bytedance.adsdk.oa.ivm, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.bcc();
        }
    }

    public void uef(moa moaVar) {
        this.uef = moaVar;
    }
}
