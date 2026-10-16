package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class ab extends ivm implements com.bytedance.sdk.component.adexpress.dynamic.oa {
    public ab(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        ImageView imageView = new ImageView(context);
        this.wk = imageView;
        imageView.setTag(5);
        addView(this.wk, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().gr()) {
            return;
        }
        this.wk.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        super.cz();
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.wk).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.dz.mIsMute);
        if (!com.bytedance.sdk.component.adexpress.moa.oa()) {
            ((ImageView) this.wk).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.moa.bcc.uef(0, Integer.valueOf(this.wrv.pz()), new int[]{this.bcc / 2}, null, null, null));
            return true;
        }
        Drawable drawableUef = com.bytedance.sdk.component.adexpress.moa.yo.uef(getContext(), this.wrv);
        if (drawableUef == null) {
            return true;
        }
        ((ImageView) this.wk).setBackground(drawableUef);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public boolean lw() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oa
    public void setSoundMute(boolean z2) {
        ((ImageView) this.wk).setImageResource(z2 ? com.bytedance.sdk.component.utils.orq.moa(getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.orq.moa(getContext(), "tt_reward_full_unmute"));
        if (((ImageView) this.wk).getDrawable() != null) {
            ((ImageView) this.wk).getDrawable().setAutoMirrored(true);
        }
    }
}
