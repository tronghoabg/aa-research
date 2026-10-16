package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.cp;

/* loaded from: classes3.dex */
public class xs extends com.bytedance.sdk.openadsdk.core.ivm.xs {
    private boolean ivm;
    private boolean lw;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ivm.bcc f25782oa;
    private bs uef;
    private bcc yo;

    public xs(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (uef()) {
            oa();
        }
    }

    public com.bytedance.sdk.openadsdk.core.ivm.bcc getDownloadButton() {
        return this.moa;
    }

    public bcc getLoadingProgressBar() {
        return this.yo;
    }

    public void oa() {
        if (this.lw) {
            return;
        }
        this.lw = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        bs bsVar = new bs(context);
        this.uef = bsVar;
        bsVar.setId(520093745);
        int iOa = af.oa(context, 64.0f);
        this.uef.setLayoutParams(new RelativeLayout.LayoutParams(iOa, iOa));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        this.f25782oa = bccVar;
        bccVar.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(af.oa(context, 219.0f), -2);
        layoutParams2.topMargin = af.oa(context, 16.0f);
        this.f25782oa.setLayoutParams(layoutParams2);
        this.f25782oa.setEllipsize(TextUtils.TruncateAt.END);
        this.f25782oa.setGravity(17);
        this.f25782oa.setMaxWidth(af.oa(context, 150.0f));
        this.f25782oa.setMaxLines(2);
        this.f25782oa.setTextColor(-1);
        this.f25782oa.setTextSize(1, 16.0f);
        bcc bccVar2 = new bcc(context);
        this.yo = bccVar2;
        bccVar2.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(af.oa(context, 219.0f), af.oa(context, 6.0f));
        layoutParams3.topMargin = af.oa(context, 24.0f);
        this.yo.setLayoutParams(layoutParams3);
        this.moa = new com.bytedance.sdk.openadsdk.core.ivm.bcc(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(af.oa(context, 138.0f), af.oa(context, 42.0f));
        layoutParams4.topMargin = af.oa(context, 48.0f);
        this.moa.setLayoutParams(layoutParams4);
        this.moa.setTextColor(-1);
        this.moa.setTextSize(16.0f);
        this.moa.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.moa.setBackground(gradientDrawable);
        linearLayout.addView(this.uef);
        linearLayout.addView(this.f25782oa);
        linearLayout.addView(this.yo);
        linearLayout.addView(this.moa);
        addView(linearLayout);
    }

    public void setProgress(int i5) {
        bcc bccVar = this.yo;
        if (bccVar != null) {
            bccVar.setProgress(i5);
        }
    }

    public boolean uef() {
        return true;
    }

    public void uef(gzw gzwVar, int i5) {
        if (!this.lw || gzwVar == null || this.ivm) {
            return;
        }
        this.ivm = true;
        boolean zDy = gzwVar.dy();
        if (zDy || gzwVar.ifk() == null || TextUtils.isEmpty(gzwVar.ifk().uef())) {
            this.uef.setVisibility(8);
        } else {
            try {
                com.bytedance.sdk.openadsdk.zjm.moa.uef(gzwVar.ifk()).yo(1).uef(new com.bytedance.sdk.openadsdk.zjm.oa(gzwVar, gzwVar.ifk().uef(), new cp(this.uef)));
            } catch (Throwable unused) {
            }
        }
        if (zDy) {
            this.f25782oa.setText("Loading");
        } else if (TextUtils.isEmpty(gzwVar.xw())) {
            this.f25782oa.setVisibility(8);
        } else {
            this.f25782oa.setText(gzwVar.xw());
        }
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = this.moa;
        if (bccVar != null) {
            bccVar.setText(gzwVar.kik());
        }
    }
}
