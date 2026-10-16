package com.bytedance.sdk.openadsdk.component.cz;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ab;
import com.bytedance.sdk.openadsdk.core.widget.bs;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.dj;

/* loaded from: classes3.dex */
public class ivm extends yo {
    private final com.bytedance.sdk.openadsdk.core.ivm.lw cq;
    private final ab dz;

    public ivm(Context context, gzw gzwVar) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        this.cq = lwVar;
        lwVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = af.oa(context, 24.0f);
        layoutParams.topMargin = af.oa(context, 56.0f);
        lwVar.setLayoutParams(layoutParams);
        lwVar.setClickable(false);
        lwVar.setGravity(16);
        lwVar.setOrientation(0);
        bs bsVar = new bs(context);
        this.ivm = bsVar;
        bsVar.setId(520093759);
        this.ivm.setLayoutParams(new LinearLayout.LayoutParams(af.oa(context, 24.0f), af.oa(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.xs = bccVar;
        bccVar.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = af.oa(context, 8.0f);
        this.xs.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = this.xs;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar2.setEllipsize(truncateAt);
        this.xs.setMaxLines(2);
        this.xs.setTextColor(Color.parseColor("#161823"));
        this.xs.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.ivm.xs xsVar = new com.bytedance.sdk.openadsdk.core.ivm.xs(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(af.oa(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = af.oa(context, 24.0f);
        layoutParams3.rightMargin = af.oa(context, 24.0f);
        xsVar.setLayoutParams(layoutParams3);
        bs bsVar2 = new bs(context);
        this.cz = bsVar2;
        int i5 = com.bytedance.sdk.openadsdk.utils.bs.gye;
        bsVar2.setId(i5);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(af.oa(context, 80.0f), af.oa(context, 80.0f));
        layoutParams4.addRule(14);
        this.cz.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar3 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.zjm = bccVar3;
        int i10 = com.bytedance.sdk.openadsdk.utils.bs.mva;
        bccVar3.setId(i10);
        this.zjm.setTextSize(24.0f);
        this.zjm.setTextColor(Color.parseColor("#161823"));
        this.zjm.setGravity(17);
        this.zjm.setMaxLines(1);
        this.zjm.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i5);
        layoutParams5.topMargin = af.oa(context, 12.0f);
        layoutParams5.addRule(14);
        this.zjm.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar4 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.dj = bccVar4;
        int i11 = com.bytedance.sdk.openadsdk.utils.bs.vk;
        bccVar4.setId(i11);
        this.dj.setTextSize(16.0f);
        this.dj.setTextColor(Color.parseColor("#80161823"));
        this.dj.setGravity(17);
        this.dj.setMaxLines(2);
        this.dj.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i10);
        layoutParams6.topMargin = af.oa(context, 4.0f);
        layoutParams6.addRule(14);
        this.dj.setLayoutParams(layoutParams6);
        ab abVar = new ab(context);
        this.dz = abVar;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = af.oa(context, 12.0f);
        abVar.setLayoutParams(layoutParams7);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar5 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.lw = bccVar5;
        bccVar5.setId(520093717);
        this.lw.setBackground(dj.uef(context, "tt_reward_full_video_backup_btn_bg"));
        this.lw.setEllipsize(truncateAt);
        this.lw.setLines(1);
        this.lw.setGravity(17);
        this.lw.setTextColor(-1);
        this.lw.setTextSize(16.0f);
        this.lw.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, af.oa(context, 44.0f));
        layoutParams8.addRule(3, i11);
        layoutParams8.topMargin = af.oa(context, 54.0f);
        layoutParams8.addRule(14);
        this.lw.setLayoutParams(layoutParams8);
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, gzwVar);
        this.moa = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, af.oa(context, 14.0f));
        layoutParams9.leftMargin = af.oa(context, 16.0f);
        layoutParams9.bottomMargin = af.oa(context, 24.0f);
        layoutParams9.addRule(12);
        this.moa.setLayoutParams(layoutParams9);
        addView(this.bcc);
        lwVar.addView(this.ivm);
        lwVar.addView(this.xs);
        addView(lwVar);
        xsVar.addView(this.cz);
        xsVar.addView(this.zjm);
        xsVar.addView(this.dj);
        xsVar.addView(abVar);
        xsVar.addView(this.lw);
        addView(xsVar);
        addView(this.moa);
    }

    @Override // com.bytedance.sdk.openadsdk.component.cz.yo
    public com.bytedance.sdk.openadsdk.core.ivm.moa getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.cz.yo
    public com.bytedance.sdk.openadsdk.core.ivm.bcc getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.cz.yo
    public ab getScoreBar() {
        return this.dz;
    }

    @Override // com.bytedance.sdk.openadsdk.component.cz.yo
    public View getUserInfo() {
        return this.cq;
    }
}
