package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class bs extends ivm {
    private TextView dhk;
    private LinearLayout gzw;

    /* renamed from: oa, reason: collision with root package name */
    private TextView f24809oa;
    private TextView orq;
    private TextView tpx;
    private TextView uef;

    public bs(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
        this.uef = new TextView(this.dj);
        this.f24809oa = new TextView(this.dj);
        this.dhk = new TextView(this.dj);
        this.gzw = new LinearLayout(this.dj);
        this.tpx = new TextView(this.dj);
        this.orq = new TextView(this.dj);
        this.uef.setTag(9);
        this.f24809oa.setTag(10);
        this.dhk.setTag(12);
        this.gzw.addView(this.dhk);
        this.gzw.addView(this.orq);
        this.gzw.addView(this.f24809oa);
        this.gzw.addView(this.tpx);
        this.gzw.addView(this.uef);
        addView(this.gzw, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        this.dhk.setText("Function");
        this.f24809oa.setText("Permission list");
        this.tpx.setText(" | ");
        this.orq.setText(" | ");
        this.uef.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar = this.wrv;
        if (xsVar != null) {
            this.dhk.setTextColor(xsVar.xs());
            this.dhk.setTextSize(this.wrv.lw());
            this.f24809oa.setTextColor(this.wrv.xs());
            this.f24809oa.setTextSize(this.wrv.lw());
            this.tpx.setTextColor(this.wrv.xs());
            this.orq.setTextColor(this.wrv.xs());
            this.uef.setTextColor(this.wrv.xs());
            this.uef.setTextSize(this.wrv.lw());
            return false;
        }
        this.dhk.setTextColor(-1);
        this.dhk.setTextSize(12.0f);
        this.f24809oa.setTextColor(-1);
        this.f24809oa.setTextSize(12.0f);
        this.tpx.setTextColor(-1);
        this.orq.setTextColor(-1);
        this.uef.setTextColor(-1);
        this.uef.setTextSize(12.0f);
        return false;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.xs, this.bcc);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public boolean moa() {
        this.uef.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.uef.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f24809oa.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f24809oa.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.dhk.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.dhk.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }
}
