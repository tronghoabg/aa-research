package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class cz extends ivm {
    public cz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            this.wk = new ImageView(context);
        } else {
            this.wk = new com.bytedance.sdk.component.adexpress.ivm.cz(context);
        }
        this.wk.setTag(3);
        addView(this.wk, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        super.cz();
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            Drawable drawableUef = com.bytedance.sdk.component.adexpress.moa.yo.uef(getContext(), this.wrv);
            if (drawableUef != null) {
                this.wk.setBackground(drawableUef);
            }
            int iMoa = com.bytedance.sdk.component.utils.orq.moa(getContext(), "tt_close_btn");
            if (iMoa > 0) {
                ((ImageView) this.wk).setImageResource(iMoa);
            }
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iUef = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.bs());
        View view = this.wk;
        if (view instanceof com.bytedance.sdk.component.adexpress.ivm.cz) {
            ((com.bytedance.sdk.component.adexpress.ivm.cz) view).setRadius((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.wk()));
            ((com.bytedance.sdk.component.adexpress.ivm.cz) this.wk).setStrokeWidth(iUef);
            ((com.bytedance.sdk.component.adexpress.ivm.cz) this.wk).setStrokeColor(this.wrv.ab());
            ((com.bytedance.sdk.component.adexpress.ivm.cz) this.wk).setBgColor(this.wrv.pz());
            ((com.bytedance.sdk.component.adexpress.ivm.cz) this.wk).setDislikeColor(this.wrv.xs());
            ((com.bytedance.sdk.component.adexpress.ivm.cz) this.wk).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, 1.0f));
        }
        return true;
    }
}
