package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class sy extends uef {
    private FrameLayout cq;
    private FrameLayout uef;
    private tpx wrv;

    public sy(Context context) {
        super(context);
        this.f25872oa = context;
    }

    private void oa() {
        this.xs = af.oa(this.f25872oa, this.wrv.getExpectExpressWidth());
        this.bcc = af.oa(this.f25872oa, this.wrv.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.xs, this.bcc);
        }
        layoutParams.width = this.xs;
        layoutParams.height = this.bcc;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.yo.bx();
        yo();
    }

    private void yo() {
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(this.f25872oa);
        this.uef = yoVar;
        addView(yoVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar2 = new com.bytedance.sdk.openadsdk.core.ivm.yo(this.f25872oa);
        this.cq = yoVar2;
        this.uef.addView(yoVar2, new FrameLayout.LayoutParams(-1, -1));
        this.cq.removeAllViews();
    }

    public View getBackupContainerBackgroundView() {
        return this.uef;
    }

    public FrameLayout getVideoContainer() {
        return this.cq;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, tpx tpxVar, ViewGroup viewGroup) {
        if (gzwVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.yo = gzwVar;
        this.wrv = tpxVar;
        if (gzwVar.dqw() == 7) {
            this.ivm = "rewarded_video";
        } else {
            this.ivm = "fullscreen_interstitial_ad";
        }
        oa();
        if (com.bytedance.sdk.openadsdk.core.model.dhk.yo(gzwVar)) {
            this.wrv.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.wrv.addView(this, layoutParams);
        }
        int i5 = com.bytedance.sdk.openadsdk.utils.bs.jh;
        View viewFindViewById = viewGroup.findViewById(i5);
        if (viewFindViewById != null) {
            Object tag = viewFindViewById.getTag(i5);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(str, viewFindViewById);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.uef
    public void uef(View view, int i5, com.bytedance.sdk.openadsdk.core.model.ab abVar) {
        tpx tpxVar = this.wrv;
        if (tpxVar != null) {
            tpxVar.uef(view, i5, abVar);
        }
    }
}
