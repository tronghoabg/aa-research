package com.bytedance.sdk.openadsdk.wk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.ivm.bcc;
import com.bytedance.sdk.openadsdk.core.ivm.xs;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.dj;

/* loaded from: classes3.dex */
public class oa extends xs {
    public oa(Context context) {
        this(context, null);
    }

    private void uef(Context context) {
        setId(bs.lpy);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(getContext());
        moaVar.setId(bs.f26134df);
        moaVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        moaVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        moaVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        moaVar.setBackgroundColor(Color.parseColor("#7f000000"));
        moaVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(moaVar);
        xs xsVar = new xs(context);
        xsVar.setId(bs.wp);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        xsVar.setLayoutParams(layoutParams);
        addView(xsVar);
        int iOa = af.oa(context, 20.0f);
        bcc bccVar = new bcc(context);
        bccVar.setId(bs.cop);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.setMargins(iOa, 0, iOa, 0);
        bccVar.setLayoutParams(layoutParams2);
        bccVar.setMaxLines(2);
        bccVar.setMinHeight(af.oa(context, 40.0f));
        bccVar.setEllipsize(TextUtils.TruncateAt.END);
        bccVar.setTextColor(-1);
        bccVar.setTextSize(2, 14.0f);
        bccVar.setBackground(dj.uef(context, "tt_ad_cover_btn_begin_bg"));
        bccVar.setGravity(17);
        int iOa2 = af.oa(context, 10.0f);
        int iOa3 = af.oa(context, 2.0f);
        bccVar.setPadding(iOa2, iOa3, iOa2, iOa3);
        bccVar.setVisibility(8);
        xsVar.addView(bccVar);
    }

    public oa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public oa(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        uef(context);
    }
}
