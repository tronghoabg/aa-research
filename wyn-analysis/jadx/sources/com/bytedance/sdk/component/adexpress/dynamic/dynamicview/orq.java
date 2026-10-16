package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* loaded from: classes.dex */
public class orq extends ivm implements com.bytedance.sdk.component.adexpress.dynamic.yo {
    private int dhk;

    /* renamed from: oa, reason: collision with root package name */
    private int f24829oa;
    private int uef;

    public orq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        uef();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.yo()), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.oa()), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.moa()), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.uef()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public void ivm() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i5 = this.cz;
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = this.zjm;
        layoutParams.setMarginStart(i5);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        if (this.dhk == 0) {
            setMeasuredDimension(this.f24829oa, this.bcc);
        } else {
            setMeasuredDimension(this.uef, this.bcc);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo
    public void uef(CharSequence charSequence, boolean z2, int i5, boolean z10) {
        this.dhk = i5;
    }

    private void uef() {
        List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> listDj = this.cq.dj();
        if (listDj == null || listDj.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar : listDj) {
            if (bccVar.zjm().uef() == 21) {
                this.uef = (int) (this.xs - com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, bccVar.bcc()));
            }
            if (bccVar.zjm().uef() == 20) {
                this.f24829oa = (int) (this.xs - com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, bccVar.bcc()));
            }
        }
    }
}
