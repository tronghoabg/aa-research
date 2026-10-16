package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class dj extends FrameLayout {
    private String bcc;
    private com.bytedance.sdk.openadsdk.core.yo.uef cz;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc ivm;
    private PAGLogoView lw;
    private ab moa;

    /* renamed from: oa, reason: collision with root package name */
    private bs f25762oa;
    private boolean uef;
    private gzw xs;
    private TextView yo;

    public dj(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.bs.lo);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.yo.uef uefVar) {
        this.cz = uefVar;
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
        boolean z2 = this.xs.cgg() == 1;
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
        this.f25762oa = bsVar;
        bsVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(af.oa(context, 80.0f), af.oa(context, 80.0f));
        layoutParams2.bottomMargin = af.oa(context, 12.0f);
        lwVar.addView(this.f25762oa, layoutParams2);
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
        this.ivm = bccVar2;
        bccVar2.setEllipsize(truncateAt);
        this.ivm.setGravity(17);
        this.ivm.setMaxLines(2);
        this.ivm.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.ivm.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = af.oa(context, 8.0f);
        lwVar.addView(this.ivm, layoutParams3);
        this.moa = new ab(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, af.oa(context, 16.0f));
        layoutParams4.topMargin = af.oa(context, 12.0f);
        this.moa.setVisibility(8);
        lwVar.addView(this.moa, layoutParams4);
        this.lw = PAGLogoView.createPAGLogoViewByMaterial(context, this.xs);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, af.oa(context, 14.0f));
        layoutParams5.gravity = 8388691;
        layoutParams5.leftMargin = af.oa(context, 18.0f);
        if (z2) {
            layoutParams5.bottomMargin = af.oa(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = af.oa(context, 24.0f);
        }
        addView(this.lw, layoutParams5);
    }

    public void uef(gzw gzwVar, String str, com.bytedance.sdk.openadsdk.core.yo.uef uefVar) {
        this.xs = gzwVar;
        this.bcc = str;
        this.cz = uefVar;
    }

    private void uef() {
        if (this.uef) {
            return;
        }
        this.uef = true;
        oa();
        if (this.f25762oa != null && this.xs.ifk() != null && !TextUtils.isEmpty(this.xs.ifk().uef())) {
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.xs.ifk(), this.f25762oa, this.xs);
        }
        ab abVar = this.moa;
        if (abVar != null) {
            af.uef((TextView) null, abVar, this.xs);
            if (this.xs.no() != null) {
                this.moa.setVisibility(0);
            }
        }
        if (this.yo != null) {
            if (this.xs.no() != null && !TextUtils.isEmpty(this.xs.no().oa())) {
                this.yo.setText(this.xs.no().oa());
            } else if (!TextUtils.isEmpty(this.xs.jp())) {
                this.yo.setText(this.xs.jp());
            } else {
                this.yo.setVisibility(8);
            }
        }
        if (this.ivm != null) {
            String strXw = this.xs.xw();
            if (!TextUtils.isEmpty(strXw)) {
                this.ivm.setText(strXw);
            } else {
                this.ivm.setVisibility(8);
            }
        }
        this.lw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.dj.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.uef(dj.this.getContext(), dj.this.xs, dj.this.bcc);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
