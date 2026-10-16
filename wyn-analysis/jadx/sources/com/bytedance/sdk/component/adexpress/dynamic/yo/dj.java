package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cp;
import com.bytedance.sdk.component.utils.orq;

/* loaded from: classes.dex */
public class dj implements xs<ViewGroup> {

    /* renamed from: oa, reason: collision with root package name */
    private final FrameLayout f24879oa;
    private final com.bytedance.sdk.component.adexpress.ivm.zjm uef;

    public dj(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar, String str, String str2) {
        com.bytedance.sdk.component.adexpress.ivm.zjm zjmVar = new com.bytedance.sdk.component.adexpress.ivm.zjm(context);
        this.uef = zjmVar;
        zjmVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24879oa = frameLayout;
        frameLayout.addView(zjmVar, new FrameLayout.LayoutParams(-2, -2));
        double dOu = xsVar.ou();
        dOu = dOu == 0.0d ? 1.0d : dOu;
        double dHnk = xsVar.hnk();
        double d3 = dHnk != 0.0d ? dHnk : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if (!"20".equals(str2)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (lwVar.getDynamicWidth() * 0.32d * dOu), (int) (lwVar.getDynamicWidth() * 0.32d * d3));
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            uef(context, frameLayout, xsVar);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 81;
            layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(context, xsVar.au() > 0 ? xsVar.au() : com.bytedance.sdk.component.adexpress.moa.oa() ? 0 : 120);
            frameLayout.setLayoutParams(layoutParams3);
            frameLayout.setClipChildren(false);
        }
    }

    private void uef(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -cp.uef(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(orq.oa(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, cp.uef(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(orq.oa(context, "tt_splash_brush_mask_hint")));
        if (xsVar != null && !TextUtils.isEmpty(xsVar.rj())) {
            textView2.setText(xsVar.rj());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void oa() {
        this.uef.ivm();
        ViewParent parent = this.f24879oa.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f24879oa);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public ViewGroup yo() {
        return this.f24879oa;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.xs
    public void uef() {
        this.uef.bcc();
    }
}
