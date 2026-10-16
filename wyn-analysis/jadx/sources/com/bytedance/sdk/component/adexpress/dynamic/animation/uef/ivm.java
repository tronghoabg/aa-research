package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ivm extends moa {
    public ivm(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        super(view, uefVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa
    public List<ObjectAnimator> uef() {
        float f10 = this.yo.getLayoutParams().width;
        this.yo.setTranslationX(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yo, "translationX", f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.yo, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(uef(duration));
        arrayList.add(uef(duration2));
        return arrayList;
    }
}
