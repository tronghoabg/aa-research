package com.bytedance.sdk.openadsdk.component.cz;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ab;
import com.bytedance.sdk.openadsdk.core.zjm.ivm;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class lw extends yo {
    uef cq;

    public interface uef {
        void uef(View view, int i5);
    }

    public lw(Context context, gzw gzwVar) {
        super(context);
        uef(context, gzwVar);
    }

    private void uef(Context context, gzw gzwVar) {
        com.bytedance.sdk.openadsdk.core.zjm.ivm ivmVar = new com.bytedance.sdk.openadsdk.core.zjm.ivm(context);
        com.bytedance.sdk.openadsdk.core.zjm.moa.uef().yo(ivmVar);
        ivmVar.uef(gzwVar, new ivm.oa() { // from class: com.bytedance.sdk.openadsdk.component.cz.lw.1
            @Override // com.bytedance.sdk.openadsdk.core.zjm.ivm.oa
            public void oa() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ivm.oa
            public void uef(int i5, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ivm.oa
            public View uef() {
                return lw.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zjm.ivm.oa
            public void uef(View view, int i5) {
                uef uefVar = lw.this.cq;
                if (uefVar != null) {
                    uefVar.uef(view, i5);
                }
            }
        }, "open_ad");
        addView(ivmVar, new ViewGroup.LayoutParams(-1, -1));
        ivmVar.dhk();
        int iOa = af.oa(context, 9.0f);
        int iOa2 = af.oa(context, 10.0f);
        this.moa = PAGLogoView.createPAGLogoViewByMaterial(context, gzwVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, af.oa(context, 14.0f));
        layoutParams.leftMargin = iOa2;
        layoutParams.bottomMargin = iOa2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.moa, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.yo yoVar = new com.bytedance.sdk.openadsdk.core.widget.yo(context);
        this.wrv = yoVar;
        yoVar.setPadding(iOa, 0, iOa, 0);
        this.wrv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(af.oa(context, 32.0f), af.oa(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iOa2, iOa2);
        addView(this.wrv, layoutParams2);
        View view = this.bcc;
        if (view != null) {
            addView(view);
        }
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
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.cz.yo
    public View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.cq = null;
    }

    public void setRenderListener(uef uefVar) {
        this.cq = uefVar;
    }
}
