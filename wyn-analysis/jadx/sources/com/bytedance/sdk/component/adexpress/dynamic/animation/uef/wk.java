package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class wk extends moa {
    public wk(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        super(view, uefVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa
    public List<ObjectAnimator> uef() {
        float f10;
        float fUef = com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.f24800oa.ivm());
        float fUef2 = com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), this.f24800oa.xs());
        boolean zEquals = "reverse".equals(this.f24800oa.ab());
        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (zEquals) {
            f10 = fUef2;
            fUef2 = 0.0f;
            f11 = fUef;
            fUef = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.moa.oa.uef(this.yo.getContext())) {
            fUef = -fUef;
            f11 = -f11;
        }
        this.yo.setTranslationX(fUef);
        this.yo.setTranslationY(fUef2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yo, "translationX", fUef, f11).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.yo, "translationY", fUef2, f10).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(uef(duration));
        arrayList.add(uef(duration2));
        return arrayList;
    }
}
