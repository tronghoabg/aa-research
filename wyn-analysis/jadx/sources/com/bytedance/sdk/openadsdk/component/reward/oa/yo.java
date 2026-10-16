package com.bytedance.sdk.openadsdk.component.reward.oa;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.bcc;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class yo extends oa {
    public yo(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        super(oaVar);
    }

    private void oa(bcc bccVar) {
        if (bccVar == null) {
            return;
        }
        Context context = bccVar.getContext();
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setOrientation(1);
        bccVar.addView(lwVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar.setId(bs.oyt);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 100.0f;
        lwVar.addView(yoVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar2 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar2.setId(bs.wrv);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        yoVar.addView(yoVar2, layoutParams2);
        yoVar2.addView(oa.uef(context));
        if (this.f25384oa.hw() != 3 && this.f25384oa.hw() != 5) {
            com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
            moaVar.setId(bs.hq);
            moaVar.setVisibility(8);
            moaVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.uef());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(af.oa(context, 28.0f), af.oa(context, 28.0f));
            layoutParams3.gravity = 8388693;
            layoutParams3.rightMargin = af.oa(context, 20.0f);
            layoutParams3.bottomMargin = af.oa(context, 10.0f);
            yoVar.addView(moaVar, layoutParams3);
        }
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar3 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar3.setId(bs.tpx);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lwVar.addView(yoVar3, layoutParams4);
        yoVar3.addView(moa.uef(context, this.uef.f25412oa));
        com.bytedance.sdk.openadsdk.component.reward.view.lw.uef(yoVar3, this.f25384oa);
        com.bytedance.sdk.openadsdk.component.reward.view.lw.uef(yoVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public void ivm() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public boolean lw() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public boolean moa() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public void uef(FrameLayout frameLayout) {
    }

    public static boolean uef(gzw gzwVar) {
        dhk.yo(gzwVar);
        return dhk.yo(gzwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public void uef(bcc bccVar) {
        oa(bccVar);
    }
}
