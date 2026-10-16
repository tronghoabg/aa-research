package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ab extends moa {
    public ab(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        super(view, uefVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa
    public List<ObjectAnimator> uef() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yo, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), 20.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.moa.xs.uef(com.bytedance.sdk.component.adexpress.moa.uef(), 20.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(uef(duration));
        return arrayList;
    }
}
