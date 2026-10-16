package com.bytedance.sdk.openadsdk.wk;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.core.ivm.bcc;
import com.bytedance.sdk.openadsdk.core.ivm.xs;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;

/* loaded from: classes3.dex */
public class lw extends xs {
    public lw(Context context) {
        this(context, null);
    }

    private void uef(Context context) {
        setId(bs.cgg);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        bcc bccVar = new bcc(context);
        int i5 = bs.gze;
        bccVar.setId(i5);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        bccVar.setLayoutParams(layoutParams);
        bccVar.setIncludeFontPadding(false);
        bccVar.setText(orq.uef(context, "tt_video_without_wifi_tips"));
        bccVar.setTextColor(Color.parseColor("#cacaca"));
        bccVar.setTextSize(2, 14.0f);
        addView(bccVar);
        xs xsVar = new xs(context);
        xsVar.setId(bs.ln);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i5);
        layoutParams2.addRule(13);
        xsVar.setLayoutParams(layoutParams2);
        addView(xsVar);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar.setId(bs.lox);
        int iOa = af.oa(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOa, iOa);
        layoutParams3.addRule(15);
        moaVar.setLayoutParams(layoutParams3);
        moaVar.setImageDrawable(orq.yo(context, "tt_new_play_video"));
        moaVar.setScaleType(ImageView.ScaleType.FIT_XY);
        xsVar.addView(moaVar);
    }

    public lw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public lw(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        uef(context);
    }
}
