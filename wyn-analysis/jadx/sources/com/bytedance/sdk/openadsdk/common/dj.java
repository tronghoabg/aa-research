package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class dj {
    private com.bytedance.sdk.openadsdk.core.ivm.bcc lw;
    private com.bytedance.sdk.openadsdk.core.widget.bs moa;

    /* renamed from: oa, reason: collision with root package name */
    protected Context f25304oa;
    protected View uef = lw();
    private com.bytedance.sdk.openadsdk.core.widget.bcc yo;

    public dj(Context context) {
        this.f25304oa = context;
    }

    private View lw() {
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(this.f25304oa);
        lwVar.setGravity(1);
        lwVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.bs bsVar = new com.bytedance.sdk.openadsdk.core.widget.bs(this.f25304oa);
        this.moa = bsVar;
        bsVar.setId(520093745);
        int iOa = af.oa(this.f25304oa, 64.0f);
        lwVar.addView(this.moa, new LinearLayout.LayoutParams(iOa, iOa));
        com.bytedance.sdk.openadsdk.core.ivm.bcc bccVar = new com.bytedance.sdk.openadsdk.core.ivm.bcc(this.f25304oa);
        this.lw = bccVar;
        bccVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(af.oa(this.f25304oa, 219.0f), -2);
        layoutParams.topMargin = af.oa(this.f25304oa, 16.0f);
        this.lw.setLayoutParams(layoutParams);
        this.lw.setEllipsize(TextUtils.TruncateAt.END);
        this.lw.setGravity(17);
        this.lw.setMaxWidth(af.oa(this.f25304oa, 150.0f));
        this.lw.setMaxLines(2);
        this.lw.setTextColor(-1);
        this.lw.setTextSize(1, 16.0f);
        lwVar.addView(this.lw);
        this.yo = new com.bytedance.sdk.openadsdk.core.widget.bcc(this.f25304oa);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(af.oa(this.f25304oa, 219.0f), af.oa(this.f25304oa, 6.0f));
        layoutParams2.topMargin = af.oa(this.f25304oa, 32.0f);
        lwVar.addView(this.yo, layoutParams2);
        return lwVar;
    }

    public void moa() {
        this.uef = null;
        this.f25304oa = null;
    }

    public com.bytedance.sdk.openadsdk.core.widget.bs oa() {
        return this.moa;
    }

    public View uef() {
        return this.uef;
    }

    public com.bytedance.sdk.openadsdk.core.ivm.bcc yo() {
        return this.lw;
    }

    public void uef(int i5) {
        this.yo.setProgress(i5);
    }
}
