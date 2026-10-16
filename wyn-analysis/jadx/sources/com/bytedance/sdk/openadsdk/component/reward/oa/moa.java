package com.bytedance.sdk.openadsdk.component.reward.oa;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.bcc;
import com.bytedance.sdk.openadsdk.component.reward.view.dj;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.dz;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class moa extends oa {
    public moa(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        super(oaVar);
    }

    private static LinearLayout oa(Context context) {
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setId(bs.gzw);
        lwVar.setOrientation(1);
        lwVar.setVisibility(8);
        lwVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return lwVar;
    }

    public static boolean uef(gzw gzwVar) {
        return dhk.oa(gzwVar) || dhk.moa(gzwVar) || dhk.xs(gzwVar);
    }

    private static ImageView yo(Context context) {
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar.setScaleType(ImageView.ScaleType.FIT_XY);
        moaVar.setImageResource(orq.moa(context, "tt_up_slide"));
        moaVar.setId(bs.gsd);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(af.oa(context, 18.0f), af.oa(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = af.oa(context, 45.0f);
        moaVar.setLayoutParams(layoutParams);
        return moaVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public void dj() {
        dj djVar;
        dhk dhkVar;
        if (dhk.oa(this.uef.f25412oa) && (djVar = this.uef.oyt) != null && (dhkVar = djVar.wk) != null) {
            if (dhkVar.moa()) {
                this.uef.oyt.oa(0);
                this.uef.cq.set(true);
            } else {
                this.uef.dz.set(true);
                uef(true, false, true, 80);
            }
        }
        if (dhk.moa(this.uef.f25412oa) || dhk.xs(this.uef.f25412oa)) {
            uef(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public void ivm() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public boolean lw() {
        if (dhk.oa(this.uef.f25412oa)) {
            return true;
        }
        return (dhk.moa(this.uef.f25412oa) || dhk.xs(this.uef.f25412oa)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public boolean moa() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public RFEndCardBackUpLayout xs() {
        return null;
    }

    public static void uef(gzw gzwVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        if (dhk.oa(gzwVar)) {
            uef(frameLayout, gzwVar);
        } else if (dhk.moa(gzwVar) || dhk.xs(gzwVar)) {
            oa(frameLayout, gzwVar);
        } else {
            oa.uef(frameLayout, oaVar);
        }
    }

    public static void oa(FrameLayout frameLayout, gzw gzwVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar.setId(bs.tpx);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = af.oa(sy.uef(), 58.0f);
        frameLayout.addView(yoVar, layoutParams);
        yoVar.addView(uef(context, gzwVar));
        LinearLayout linearLayoutOa = oa(context);
        linearLayoutOa.setBackgroundColor(Color.parseColor("#99161823"));
        yoVar.addView(linearLayoutOa);
        linearLayoutOa.addView(yo(context));
        com.bytedance.sdk.openadsdk.component.reward.view.lw.uef(yoVar, gzwVar);
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar2 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar2.setId(bs.oyt);
        frameLayout.addView(yoVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar3 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar3.setId(bs.wrv);
        yoVar2.addView(yoVar3, new FrameLayout.LayoutParams(-1, -1));
        yoVar3.addView(oa.uef(context));
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar4 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar4.setId(bs.oib);
        yoVar4.setVisibility(8);
        yoVar4.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        yoVar3.addView(yoVar4, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar.setId(bs.dhk);
        moaVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        yoVar4.addView(moaVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.lw.uef(yoVar2);
    }

    public static void uef(FrameLayout frameLayout, gzw gzwVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(context);
        lwVar.setOrientation(1);
        frameLayout.addView(lwVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar.setId(bs.oyt);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        lwVar.addView(yoVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar2 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar2.setId(bs.wrv);
        yoVar.addView(yoVar2, new FrameLayout.LayoutParams(-1, -1));
        yoVar2.addView(oa.uef(context));
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar3 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar3.setId(bs.oib);
        yoVar3.setVisibility(8);
        yoVar3.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        yoVar2.addView(yoVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = new com.bytedance.sdk.openadsdk.core.ivm.moa(context);
        moaVar.setId(bs.dhk);
        moaVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        yoVar3.addView(moaVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.lw.uef(yoVar);
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar4 = new com.bytedance.sdk.openadsdk.core.ivm.yo(context);
        yoVar4.setId(bs.tpx);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lwVar.addView(yoVar4, layoutParams3);
        yoVar4.addView(uef(context, gzwVar));
        LinearLayout linearLayoutOa = oa(context);
        linearLayoutOa.setBackgroundColor(Color.parseColor("#70161823"));
        yoVar4.addView(linearLayoutOa);
        linearLayoutOa.addView(yo(context));
        com.bytedance.sdk.openadsdk.component.reward.view.lw.uef(yoVar4, gzwVar);
    }

    public static com.bytedance.sdk.component.cz.ivm uef(Context context, gzw gzwVar) {
        com.bytedance.sdk.component.cz.ivm ivmVarOa = com.bytedance.sdk.openadsdk.dz.uef.uef().oa(gzwVar);
        if (ivmVarOa != null) {
            ivmVarOa.setLpPreRender(true);
            ViewGroup viewGroup = (ViewGroup) ivmVarOa.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(ivmVarOa);
            }
        } else {
            ivmVarOa = new com.bytedance.sdk.component.cz.ivm(context, true, ivm.yo.LANDING_PAGE_LOADING);
            ivmVarOa.setLayerType(2, null);
        }
        af.uef((View) ivmVarOa, 0);
        ivmVarOa.setId(bs.orq);
        ivmVarOa.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return ivmVarOa;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public void uef(bcc bccVar) {
        uef(this.f25384oa, bccVar, this.uef);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.oa.oa
    public void uef(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar;
        dz dzVar;
        if (!dhk.moa(this.uef.f25412oa) || this.uef.f25412oa.gem() || (dzVar = (oaVar = this.uef).hnk) == null) {
            return;
        }
        dzVar.uef(oaVar.f25412oa.gsd().oa() * 1000);
    }
}
