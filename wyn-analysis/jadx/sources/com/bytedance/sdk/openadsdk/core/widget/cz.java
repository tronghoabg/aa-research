package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class cz extends FrameLayout {
    private gzw bcc;
    private String cz;
    private com.bytedance.sdk.openadsdk.core.yo.uef dj;
    private PAGLogoView ivm;
    private TextView lw;
    private ab moa;

    /* renamed from: oa, reason: collision with root package name */
    private bs f25759oa;
    private boolean uef;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc xs;
    private TextView yo;
    private boolean zjm;

    public cz(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.bs.qn);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.yo.uef uefVar) {
        this.dj = uefVar;
        TextView textView = this.lw;
        if (textView != null) {
            textView.setOnClickListener(uefVar);
            this.lw.setOnTouchListener(this.dj);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        if (i5 == 0) {
            uef();
        }
    }

    private void oa() {
        Context context = getContext();
        boolean z2 = this.bcc.cgg() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setGravity(1);
        lwVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z2 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(af.oa(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iOa = af.oa(context, 24.0f);
        layoutParams.rightMargin = iOa;
        layoutParams.leftMargin = iOa;
        addView(lwVar, layoutParams);
        bs bsVar = new bs(context);
        this.f25759oa = bsVar;
        bsVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(af.oa(context, 80.0f), af.oa(context, 80.0f));
        layoutParams2.bottomMargin = af.oa(context, 12.0f);
        lwVar.addView(this.f25759oa, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.yo = bccVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        bccVar.setEllipsize(truncateAt);
        this.yo.setGravity(17);
        this.yo.setMaxLines(2);
        this.yo.setMaxWidth(af.oa(context, 180.0f));
        this.yo.setTextColor(-1);
        this.yo.setTextSize(2, 24.0f);
        lwVar.addView(this.yo, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar2 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.xs = bccVar2;
        bccVar2.setEllipsize(truncateAt);
        this.xs.setGravity(17);
        this.xs.setMaxLines(2);
        this.xs.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.xs.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = af.oa(context, 8.0f);
        lwVar.addView(this.xs, layoutParams3);
        this.moa = new ab(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, af.oa(context, 16.0f));
        layoutParams4.topMargin = af.oa(context, 12.0f);
        this.moa.setVisibility(8);
        lwVar.addView(this.moa, layoutParams4);
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar3 = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.lw = bccVar3;
        bccVar3.setId(520093707);
        this.lw.setGravity(17);
        this.lw.setText(orq.uef(context, "tt_video_download_apk"));
        this.lw.setTextColor(-1);
        this.lw.setTextSize(2, 16.0f);
        this.lw.setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, af.oa(context, 44.0f));
        layoutParams5.topMargin = af.oa(context, 54.0f);
        lwVar.addView(this.lw, layoutParams5);
        if (!this.zjm && this.bcc.hs() && cp.yo(this.bcc)) {
            this.lw.setVisibility(8);
        }
        this.ivm = PAGLogoView.createPAGLogoViewByMaterial(context, this.bcc);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, af.oa(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = af.oa(context, 18.0f);
        if (z2) {
            layoutParams6.bottomMargin = af.oa(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = af.oa(context, 24.0f);
        }
        addView(this.ivm, layoutParams6);
    }

    public void uef(gzw gzwVar, String str, com.bytedance.sdk.openadsdk.core.yo.uef uefVar, boolean z2) {
        this.bcc = gzwVar;
        this.cz = str;
        this.zjm = z2;
        this.dj = uefVar;
    }

    private void uef() {
        if (this.uef) {
            return;
        }
        this.uef = true;
        oa();
        this.lw.setOnClickListener(this.dj);
        this.lw.setOnTouchListener(this.dj);
        String strKik = this.bcc.kik();
        if (!TextUtils.isEmpty(strKik)) {
            this.lw.setText(strKik);
        }
        if (this.f25759oa != null && this.bcc.ifk() != null && !TextUtils.isEmpty(this.bcc.ifk().uef())) {
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.bcc.ifk(), this.f25759oa, this.bcc);
        }
        ab abVar = this.moa;
        if (abVar != null) {
            af.uef((TextView) null, abVar, this.bcc);
            if (this.bcc.no() != null) {
                this.moa.setVisibility(0);
            }
        }
        if (this.yo != null) {
            if (this.bcc.no() != null && !TextUtils.isEmpty(this.bcc.no().oa())) {
                this.yo.setText(this.bcc.no().oa());
            } else if (!TextUtils.isEmpty(this.bcc.jp())) {
                this.yo.setText(this.bcc.jp());
            } else {
                this.yo.setVisibility(8);
            }
        }
        if (this.xs != null) {
            String strXw = this.bcc.xw();
            if (!TextUtils.isEmpty(strXw)) {
                this.xs.setText(strXw);
            } else {
                this.xs.setVisibility(8);
            }
        }
        this.ivm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.cz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.uef(cz.this.getContext(), cz.this.bcc, cz.this.cz);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
