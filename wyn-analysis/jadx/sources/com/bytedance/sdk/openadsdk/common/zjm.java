package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class zjm extends RelativeLayout {
    public zjm(Context context) {
        super(context);
        uef();
    }

    private void uef() {
        Context context = getContext();
        int iOa = af.oa(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, af.oa(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar.setId(520093720);
        moaVar.setClickable(true);
        moaVar.setFocusable(true);
        moaVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_leftbackicon_selector"));
        int iOa2 = af.oa(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOa2, iOa2);
        layoutParams.leftMargin = iOa;
        layoutParams.addRule(15);
        addView(moaVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar2.setId(520093716);
        moaVar2.setClickable(true);
        moaVar2.setFocusable(true);
        moaVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOa2, iOa2);
        layoutParams2.leftMargin = iOa;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(moaVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar3 = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        int i5 = com.bytedance.sdk.openadsdk.utils.bs.vep;
        moaVar3.setId(i5);
        moaVar3.setImageDrawable(com.bytedance.sdk.component.utils.orq.yo(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOa2, iOa2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iOa;
        addView(moaVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        bccVar.setId(com.bytedance.sdk.openadsdk.utils.bs.uu);
        bccVar.setSingleLine(true);
        bccVar.setEllipsize(TextUtils.TruncateAt.END);
        bccVar.setGravity(17);
        bccVar.setTextColor(-16777216);
        bccVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(af.oa(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i5);
        int iOa3 = af.oa(context, 25.0f);
        layoutParams4.rightMargin = iOa3;
        layoutParams4.leftMargin = iOa3;
        addView(bccVar, layoutParams4);
    }
}
