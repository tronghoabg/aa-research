package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ue extends ivm implements com.bytedance.sdk.component.adexpress.dynamic.yo {
    private int dhk;

    /* renamed from: oa, reason: collision with root package name */
    boolean f24832oa;
    private boolean orq;
    private int tpx;
    int uef;

    public ue(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        this.tpx = 0;
        setTag(Integer.valueOf(getClickArea()));
        uef();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().gr()) {
            return;
        }
        View view = this.wk;
        if (view != null) {
            view.setVisibility(8);
        }
        setVisibility(8);
    }

    private void uef() {
        List<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> listDj = this.cq.dj();
        if (listDj == null || listDj.size() <= 0) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.moa.bcc> it = listDj.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.moa.bcc next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.zjm().oa())) {
                int iUef = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.dj, next.bcc() + (com.bytedance.sdk.component.adexpress.moa.oa() ? next.cq() : 0));
                this.dhk = iUef;
                this.uef = this.xs - iUef;
            }
        }
        this.tpx = this.xs - this.uef;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        if (com.bytedance.sdk.component.adexpress.moa.ivm.oa(this.dz.getRenderRequest().moa())) {
            return true;
        }
        super.cz();
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
        if (this.f24832oa) {
            layoutParams.leftMargin = this.cz;
        } else {
            layoutParams.leftMargin = this.cz + this.tpx;
        }
        if (this.orq && this.wrv != null) {
            layoutParams.leftMargin = ((this.cz + this.tpx) - ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.yo()))) - ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.moa()));
        }
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            layoutParams.topMargin = this.zjm - ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.oa()));
        } else {
            layoutParams.topMargin = this.zjm;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        if (this.orq && this.wrv != null) {
            setMeasuredDimension(this.dhk + ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.yo())) + ((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.wrv.moa())), this.bcc);
        } else if (this.f24832oa) {
            setMeasuredDimension(this.xs, this.bcc);
        } else {
            setMeasuredDimension(this.uef, this.bcc);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo
    public void uef(CharSequence charSequence, boolean z2, int i5, boolean z10) {
        if (z10 && this.orq != z10) {
            this.orq = z10;
            ivm();
            return;
        }
        if (z2 && this.f24832oa != z2) {
            this.f24832oa = z2;
            ivm();
        }
        this.f24832oa = z2;
    }
}
