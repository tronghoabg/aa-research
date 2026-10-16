package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.zjm.gsd;

/* loaded from: classes3.dex */
public class wk extends com.bytedance.sdk.openadsdk.core.zjm.uef.uef {
    public wk(ViewGroup viewGroup, gzw gzwVar, String str, Activity activity, Context context, com.bytedance.sdk.openadsdk.component.reward.yo.oa oaVar) {
        super(viewGroup, gzwVar, str, activity, context, oaVar);
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.yo.ivm ivmVar) {
        gsd gsdVar = this.uef;
        if (gsdVar != null) {
            gsdVar.setRewardControlListener(ivmVar);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.yo.uef uefVar) {
        gsd gsdVar = this.uef;
        if (gsdVar != null) {
            gsdVar.setAdInteractionListener(uefVar);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.yo.cz czVar) {
        gsd gsdVar = this.uef;
        if (gsdVar != null) {
            gsdVar.setVideoTrackListener(czVar);
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.yo.moa moaVar) {
        gsd gsdVar = this.uef;
        if (gsdVar != null) {
            gsdVar.setHeartBeatListener(moaVar);
        }
    }

    public void uef() {
        gsd gsdVar = this.uef;
        if (gsdVar != null) {
            gsdVar.dz();
        }
    }
}
