package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class dhk extends xs implements com.bytedance.sdk.component.adexpress.dynamic.yo {
    public dhk(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xs, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public void ivm() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xs, this.bcc);
        int i5 = this.cz;
        layoutParams.leftMargin = i5;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i5);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        if (TextUtils.isEmpty(((TextView) this.wk).getText())) {
            setMeasuredDimension(0, this.bcc);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo
    public void uef(CharSequence charSequence, boolean z2, int i5, boolean z10) {
        if (i5 != 0) {
            ((TextView) this.wk).setText(" | ".concat(String.format(com.bytedance.sdk.component.utils.orq.uef(com.bytedance.sdk.component.adexpress.moa.uef(), "tt_reward_full_skip_count_down"), Integer.valueOf(i5))));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }
}
