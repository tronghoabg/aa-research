package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import N0.a;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public class dxx extends ivm implements com.bytedance.sdk.component.adexpress.dynamic.lw {
    boolean dhk;

    /* renamed from: oa, reason: collision with root package name */
    FrameLayout f24811oa;
    TextView uef;

    public dxx(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        this.dhk = false;
        View view = new View(context);
        this.wk = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.uef = new TextView(context);
        this.f24811oa = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.uef.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.uef.setBackground(gradientDrawable);
        this.uef.setTextSize(10.0f);
        this.uef.setGravity(17);
        this.uef.setTextColor(-1);
        this.uef.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.moa.oa()) {
            addView(this.f24811oa, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.uef);
        addView(this.wk, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.moa.oa()) {
            addView(this.f24811oa, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.f24811oa;
        dynamicRootView.setVideoListener(this);
    }

    private void yo(View view) {
        if (view == this.uef || view == ((ivm) this).oib) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.uef.ivm)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i5 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i5 >= viewGroup.getChildCount()) {
                return;
            }
            yo(viewGroup.getChildAt(i5));
            i5++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        super.cz();
        double dXs = 0.0d;
        double dIvm = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVarWrv = this.cq; bccVarWrv != null; bccVarWrv = bccVarWrv.wrv()) {
            dIvm = (dIvm + bccVarWrv.ivm()) - bccVarWrv.moa();
            dXs = (dXs + bccVarWrv.xs()) - bccVarWrv.lw();
        }
        try {
            float f10 = (float) dIvm;
            int iUef = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), f10);
            int iUef2 = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), f10 + this.lw);
            if (com.bytedance.sdk.component.adexpress.moa.oa.uef(getContext())) {
                int dynamicWidth = ((sy) this.dz.getChildAt(0)).getDynamicWidth();
                int i5 = dynamicWidth - iUef2;
                iUef2 = dynamicWidth - iUef;
                iUef = i5;
            }
            if ("open_ad".equals(this.dz.getRenderRequest().moa())) {
                this.dz.videoView = this.f24811oa;
            } else {
                float f11 = (float) dXs;
                ((sy) this.dz.getChildAt(0)).uef.uef(iUef, (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), f11), iUef2, (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), f11 + this.ivm));
            }
        } catch (Exception unused) {
        }
        this.dz.updateRenderInfoForVideo(dIvm, dXs, this.lw, this.ivm, this.wrv.wk());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public boolean lw() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lw
    public void setTimeUpdate(int i5) {
        if (!this.cq.zjm().lw().dy() || i5 <= 0 || this.dhk) {
            this.dhk = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                yo(getChildAt(i10));
            }
            this.uef.setVisibility(8);
            return;
        }
        String strF = a.f(i5 >= 60 ? "0" + (i5 / 60) : "00", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        int i11 = i5 % 60;
        this.uef.setText(i11 > 9 ? strF + i11 : strF + "0" + i11);
        this.uef.setVisibility(0);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lw
    public void uef() {
        this.uef.setVisibility(8);
    }
}
