package com.bytedance.sdk.openadsdk.component.cz;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class xs extends com.bytedance.sdk.openadsdk.core.ivm.xs {

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.ivm.moa f25330oa;
    private final com.bytedance.sdk.openadsdk.core.ivm.moa uef;
    private final com.bytedance.sdk.openadsdk.core.ivm.bcc yo;

    public xs(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iOa = af.oa(context, 12.0f);
        int iOa2 = af.oa(context, 16.0f);
        int iOa3 = af.oa(context, 20.0f);
        int iOa4 = af.oa(context, 24.0f);
        int iOa5 = af.oa(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        this.uef = moaVar;
        moaVar.setId(520093713);
        int iOa6 = af.oa(getContext(), 5.0f);
        moaVar.setPadding(iOa6, iOa6, iOa6, iOa6);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        moaVar.setScaleType(scaleType);
        moaVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.uef());
        moaVar.setImageResource(orq.moa(sy.uef(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOa5, iOa5);
        layoutParams.topMargin = iOa3;
        layoutParams.leftMargin = iOa2;
        layoutParams.setMarginStart(iOa2);
        moaVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        this.f25330oa = moaVar2;
        moaVar2.setId(520093714);
        moaVar2.setPadding(iOa6, iOa6, iOa6, iOa6);
        moaVar2.setScaleType(scaleType);
        moaVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.uef());
        moaVar2.setImageResource(orq.moa(sy.uef(), "tt_close_btn"));
        if (moaVar2.getDrawable() != null) {
            moaVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOa5, iOa5);
        layoutParams2.topMargin = iOa3;
        layoutParams2.rightMargin = iOa2;
        layoutParams2.setMarginEnd(iOa2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        moaVar2.setLayoutParams(layoutParams2);
        moaVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.yo = bccVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iOa4);
        layoutParams3.topMargin = iOa3;
        layoutParams3.rightMargin = iOa2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(iOa2);
        layoutParams3.addRule(21);
        bccVar.setLayoutParams(layoutParams3);
        bccVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.oa());
        bccVar.setGravity(17);
        bccVar.setPadding(iOa, 0, iOa, 0);
        bccVar.setTextColor(-1);
        bccVar.setTextSize(1, 14.0f);
        bccVar.setVisibility(4);
        addView(moaVar);
        addView(bccVar);
        addView(moaVar2);
    }

    public com.bytedance.sdk.openadsdk.core.ivm.bcc getTopCountDown() {
        return this.yo;
    }

    public View getTopDislike() {
        return this.uef;
    }

    public com.bytedance.sdk.openadsdk.core.ivm.moa getTopSkip() {
        return this.f25330oa;
    }
}
