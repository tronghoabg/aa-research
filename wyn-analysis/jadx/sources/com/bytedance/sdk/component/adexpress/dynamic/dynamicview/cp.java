package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class cp extends ivm implements com.bytedance.sdk.component.adexpress.dynamic.yo {
    private boolean uef;

    public cp(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        this.xs = this.bcc;
        ImageView imageView = new ImageView(context);
        this.wk = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.wk, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            if (!dynamicRootView.getRenderRequest().gr()) {
                this.wk.setVisibility(8);
                setVisibility(8);
            }
            this.uef = dynamicRootView.getRenderRequest().cq();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        super.cz();
        View view = this.wk;
        if (view != null) {
            ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable drawableUef = com.bytedance.sdk.component.adexpress.moa.yo.uef(getContext(), this.wrv);
            if (drawableUef != null) {
                ((ImageView) this.wk).setBackground(drawableUef);
            }
            Drawable drawableYo = this.uef ? com.bytedance.sdk.component.utils.orq.yo(getContext(), "tt_close_btn") : com.bytedance.sdk.component.utils.orq.yo(getContext(), "tt_skip_btn");
            if (drawableYo != null) {
                drawableYo.setAutoMirrored(true);
                ((ImageView) this.wk).setImageDrawable(drawableYo);
            }
            int iUef = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.oa());
            this.wk.setPadding(iUef, iUef, iUef, iUef);
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
