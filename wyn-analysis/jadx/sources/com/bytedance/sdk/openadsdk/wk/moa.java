package com.bytedance.sdk.openadsdk.wk;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.ivm.ivm;
import com.bytedance.sdk.openadsdk.core.ivm.xs;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.dj;

/* loaded from: classes3.dex */
public class moa extends xs {
    public moa(Context context) {
        this(context, null);
    }

    private void uef(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iOa = af.oa(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar.setId(bs.uxr);
        yoVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        yoVar.setBackgroundColor(0);
        addView(yoVar);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar.setId(bs.efa);
        moaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        moaVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        yoVar.addView(moaVar);
        ivm ivmVar = new ivm(context);
        ivmVar.setId(bs.xw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOa, iOa);
        layoutParams.gravity = 17;
        ivmVar.setLayoutParams(layoutParams);
        ivmVar.setIndeterminateDrawable(dj.uef(context, "tt_video_loading_progress_bar"));
        yoVar.addView(ivmVar);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar2.setId(bs.az);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        moaVar2.setLayoutParams(layoutParams2);
        moaVar2.setScaleType(ImageView.ScaleType.CENTER);
        moaVar2.setImageDrawable(dj.uef(context, "tt_play_movebar_textpage"));
        moaVar2.setVisibility(8);
        addView(moaVar2);
        View oaVar = new oa(context);
        oaVar.setId(bs.lpy);
        oaVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(oaVar);
    }

    public moa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public moa(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        uef(context);
    }
}
