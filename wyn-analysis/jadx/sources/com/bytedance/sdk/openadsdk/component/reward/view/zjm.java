package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;

/* loaded from: classes3.dex */
public class zjm extends dj {
    public zjm(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        super(oaVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.dj
    public boolean uef() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.dj
    public void uef(int i5, int i10) {
        super.uef(i5, i10);
        if (gzw.lw(this.moa) && this.moa.aos() == 3 && this.moa.bx() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.yo.km.findViewById(bs.wrv);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.moa.cgg() == 1) {
                    int iOa = af.oa(sy.uef(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iOa;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
