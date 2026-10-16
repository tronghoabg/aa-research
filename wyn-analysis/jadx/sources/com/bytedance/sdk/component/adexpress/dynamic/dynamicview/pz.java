package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class pz extends ivm implements com.bytedance.sdk.component.adexpress.dynamic.yo {
    private boolean uef;

    public pz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.uef = dynamicRootView.getRenderRequest().cq();
        }
        this.xs = this.bcc;
        ImageView imageView = new ImageView(context);
        this.wk = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.wk, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().gr()) {
            return;
        }
        this.wk.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        Drawable drawableYo;
        super.cz();
        ((ImageView) this.wk).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable drawableUef = com.bytedance.sdk.component.adexpress.moa.yo.uef(getContext(), this.wrv);
        if (drawableUef != null) {
            ((ImageView) this.wk).setBackground(drawableUef);
        }
        if (this.uef) {
            drawableYo = com.bytedance.sdk.component.utils.orq.yo(getContext(), "tt_close_btn");
        } else {
            drawableYo = com.bytedance.sdk.component.utils.orq.yo(getContext(), "tt_skip_btn");
            if (drawableYo != null) {
                drawableYo.setAutoMirrored(true);
            }
        }
        if (drawableYo != null) {
            ((ImageView) this.wk).setImageDrawable(drawableYo);
        }
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo
    public void uef(CharSequence charSequence, boolean z2, int i5, boolean z10) {
        int i10 = 0;
        if (!z2 && !z10) {
            i10 = 8;
        }
        setVisibility(i10);
    }
}
