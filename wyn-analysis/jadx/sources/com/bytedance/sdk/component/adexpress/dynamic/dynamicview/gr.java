package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class gr extends xs implements com.bytedance.sdk.component.adexpress.dynamic.yo {
    private boolean dhk;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f24815oa;
    private boolean uef;

    public gr(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(bccVar.zjm().oa())) {
            dynamicRootView.setTimedown(this.bcc);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xs, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        super.cz();
        if (com.bytedance.sdk.component.adexpress.moa.ivm.oa(this.dz.getRenderRequest().moa())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.cq.zjm().oa())) {
            ((TextView) this.wk).setText(String.valueOf((int) Double.parseDouble(this.wrv.zjm())));
            return true;
        }
        ((TextView) this.wk).setText(((int) Double.parseDouble(this.wrv.zjm())) + "s");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public void ivm() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.cq.zjm().oa()) && !TextUtils.equals("skip-with-time-countdown", this.cq.zjm().oa())) {
            super.ivm();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xs, this.bcc);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            layoutParams.leftMargin = this.cz;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
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
        if (z10 || this.dhk) {
            ((TextView) this.wk).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z2 && this.dz.getRenderRequest().uef() && com.bytedance.sdk.component.adexpress.moa.ivm.oa(this.dz.getRenderRequest().moa())) {
            if (com.bytedance.sdk.component.adexpress.moa.oa()) {
                ((TextView) this.wk).setText(i5 + "s");
            } else {
                ((TextView) this.wk).setText(String.format(com.bytedance.sdk.component.utils.orq.uef(com.bytedance.sdk.component.adexpress.moa.uef(), "tt_reward_full_skip"), Integer.valueOf(i5)));
            }
            this.uef = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.moa.oa() && !"open_ad".equals(this.dz.getRenderRequest().moa()) && this.dz.getRenderRequest().uef()) {
            this.dhk = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.cq.zjm().oa())) {
            ((TextView) this.wk).setText(charSequence);
            return;
        }
        ((TextView) this.wk).setText(((Object) charSequence) + "s");
        this.f24815oa = true;
        if (this.uef) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.moa() + this.wrv.yo()) + com.bytedance.sdk.component.adexpress.dynamic.lw.dj.oa(((TextView) this.wk).getText() != null ? r5.toString() : "", this.wrv.lw(), true)[0]), this.bcc);
            layoutParams.gravity = 8388629;
            this.wk.setLayoutParams(layoutParams);
            this.uef = false;
            requestLayout();
        }
    }
}
