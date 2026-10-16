package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.ivm.moa mAdLogo;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, gzw gzwVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(gzwVar);
        return pAGLogoView;
    }

    private void initView(Context context) {
        int iOa = af.oa(context, 2.0f);
        this.containerHeight = af.oa(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(af.oa(context, 14.0f), af.oa(context, 6.0f));
        layoutParams.leftMargin = iOa;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = iOa;
        layoutParams2.rightMargin = iOa;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iOa);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public void initData(gzw gzwVar) {
        if (gzwVar == null) {
            return;
        }
        initData(gzwVar.ys());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.ivm.cz.uef(this, layoutParams));
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.oa oaVar) {
        if (oaVar == null) {
            return;
        }
        if (oaVar.lw()) {
            this.mAdLogo.setImageDrawable(orq.yo(com.bytedance.sdk.openadsdk.core.sy.uef(), "tt_ad_logo"));
        } else {
            String strUef = oaVar.uef();
            if (TextUtils.isEmpty(strUef)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (strUef.contains("logo")) {
                    this.mAdLogo.setImageDrawable(orq.yo(com.bytedance.sdk.openadsdk.core.sy.uef(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.zjm.moa.uef(strUef).yo(1).uef(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String strOa = oaVar.oa();
        if (oaVar.lw()) {
            this.mAdText.setText(orq.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(strOa)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(strOa);
            this.mAdText.setVisibility(0);
        }
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        initView(context);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i5, int i10) {
        super(context, attributeSet, i5, i10);
        initView(context);
    }
}
