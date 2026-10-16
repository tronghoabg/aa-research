package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class dz extends ivm {
    public dz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        ImageView imageView = new ImageView(context);
        this.wk = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            this.bcc = Math.max(dynamicRootView.getLogoUnionHeight(), this.bcc);
        }
        addView(this.wk, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        super.cz();
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.dz;
        if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || TextUtils.isEmpty(this.dz.getRenderRequest().ue())) {
            setVisibility(8);
        } else {
            String strUe = this.dz.getRenderRequest().ue();
            if (strUe.equals("logo")) {
                ((ImageView) this.wk).setImageResource(com.bytedance.sdk.component.utils.orq.moa(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.lw.zjm zjmVarLw = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().lw().uef(strUe).uef(this.xs).oa(this.bcc).moa(this.xs).lw(this.bcc);
                String strDz = this.dz.getRenderRequest().dz();
                if (!TextUtils.isEmpty(strDz)) {
                    zjmVarLw.oa(strDz);
                }
                zjmVarLw.uef((ImageView) this.wk);
            }
        }
        ((ImageView) this.wk).setColorFilter(this.wrv.xs(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
