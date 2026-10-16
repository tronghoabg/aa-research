package com.bytedance.sdk.openadsdk.core.cq.lw.uef;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.moa.ivm;
import com.bytedance.adsdk.ugeno.oa.yo;
import java.util.Map;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.adsdk.ugeno.moa.oa.uef {
    public uef(yo yoVar, String str, ivm.uef uefVar) {
        super(yoVar, str, uefVar);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.oa.uef
    public void oa() {
    }

    @Override // com.bytedance.adsdk.ugeno.moa.oa.uef
    public void uef() {
        Object obj;
        yo yoVar;
        yo yoVarOa;
        Map<String, Object> map = this.ivm;
        if (map == null || map.isEmpty() || (obj = this.ivm.get("id")) == null) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf) || (yoVarOa = (yoVar = this.yo).oa(yoVar)) == null) {
            return;
        }
        yo yoVarLw = yoVarOa.lw(strValueOf);
        if (yoVarLw instanceof com.bytedance.sdk.openadsdk.core.cq.oa.oa.uef) {
            com.bytedance.sdk.openadsdk.core.cq.oa.oa.uef uefVar = (com.bytedance.sdk.openadsdk.core.cq.oa.oa.uef) yoVarLw;
            uefVar.moa();
            uefVar.uef(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.cq.lw.uef.uef.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    uef.this.yo();
                }
            });
        }
    }
}
