package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class tpx extends xs implements com.bytedance.sdk.component.adexpress.dynamic.yo {
    private int dhk;

    /* renamed from: oa, reason: collision with root package name */
    private int f24831oa;
    private int[] uef;

    public tpx(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xs, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        super.cz();
        ((TextView) this.wk).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public void ivm() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xs, this.bcc);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        if (TextUtils.isEmpty(((TextView) this.wk).getText())) {
            setMeasuredDimension(0, this.bcc);
        } else {
            setMeasuredDimension(this.xs, this.bcc);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo
    public void uef(CharSequence charSequence, boolean z2, int i5, boolean z10) {
        String strUef = com.bytedance.sdk.component.utils.orq.uef(com.bytedance.sdk.component.adexpress.moa.uef(), "tt_reward_screen_skip_tx");
        if (i5 == 0) {
            this.wk.setVisibility(0);
            ((TextView) this.wk).setText("| ".concat(String.valueOf(strUef)));
            this.wk.measure(-2, -2);
            this.uef = new int[]{this.wk.getMeasuredWidth() + 1, this.wk.getMeasuredHeight()};
            View view = this.wk;
            int[] iArr = this.uef;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.wk).setGravity(17);
            ((TextView) this.wk).setIncludeFontPadding(false);
            uef();
            this.wk.setPadding(this.wrv.yo(), this.f24831oa, this.wrv.moa(), this.dhk);
        }
        requestLayout();
    }

    private void uef() {
        int iUef = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, this.wrv.lw());
        this.f24831oa = ((this.bcc - iUef) / 2) - this.wrv.uef();
        this.dhk = 0;
    }
}
