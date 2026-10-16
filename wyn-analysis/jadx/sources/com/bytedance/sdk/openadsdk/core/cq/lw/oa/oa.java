package com.bytedance.sdk.openadsdk.core.cq.lw.oa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public class oa extends com.bytedance.adsdk.ugeno.moa.moa.yo {
    private String dj;

    public oa(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        Object obj;
        Map<String, Object> map = this.lw;
        if (map == null || map.size() <= 0 || (obj = this.lw.get("id")) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf)) {
            return false;
        }
        Object obj2 = this.lw.get("state");
        if (obj2 != null) {
            this.dj = String.valueOf(obj2);
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVar = this.f24741oa;
        com.bytedance.adsdk.ugeno.oa.yo yoVarOa = yoVar.oa(yoVar);
        if (yoVarOa == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.oa.yo yoVarLw = yoVarOa.lw(strValueOf);
        if (yoVarLw instanceof com.bytedance.sdk.openadsdk.core.cq.oa.oa.uef) {
            ((com.bytedance.sdk.openadsdk.core.cq.oa.oa.uef) yoVarLw).uef(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.cq.lw.oa.oa.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (!TextUtils.equals(oa.this.dj, "complete") || ((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).uef == null) {
                        return;
                    }
                    ((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).uef.uef(((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).f24741oa, ((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).ivm, ((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).yo.oa(), ((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).yo);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (!TextUtils.equals(oa.this.dj, "start") || ((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).uef == null) {
                        return;
                    }
                    ((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).uef.uef(((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).f24741oa, ((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).ivm, ((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).yo.oa(), ((com.bytedance.adsdk.ugeno.moa.moa.yo) oa.this).yo);
                }
            });
        }
        return false;
    }
}
