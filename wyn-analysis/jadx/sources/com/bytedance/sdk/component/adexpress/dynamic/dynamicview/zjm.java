package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class zjm extends ivm {
    public zjm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            ImageView imageView = new ImageView(context);
            this.wk = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.xs = this.bcc;
        } else {
            this.wk = new TextView(context);
        }
        this.wk.setTag(3);
        addView(this.wk, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().bcc() && dynamicRootView.getRenderRequest().gr()) {
                return;
            }
            this.wk.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        super.cz();
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            Drawable drawableUef = com.bytedance.sdk.component.adexpress.moa.yo.uef(getContext(), this.wrv);
            if (drawableUef != null) {
                ((ImageView) this.wk).setBackground(drawableUef);
            }
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iMoa = com.bytedance.sdk.component.utils.orq.moa(getContext(), "tt_reward_full_feedback");
            if (iMoa > 0) {
                ((ImageView) this.wk).setImageResource(iMoa);
            }
        }
        return true;
    }
}
