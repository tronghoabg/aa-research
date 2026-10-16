package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bcc extends moa {
    public bcc(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        super(view, uefVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa
    public List<ObjectAnimator> uef() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yo, "rippleValue", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ((ViewGroup) this.yo.getParent()).setClipChildren(false);
        ((ViewGroup) this.yo.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.yo.getParent().getParent().getParent()).setClipChildren(false);
        this.yo.setTag(2097610712, this.f24800oa.bcc());
        ArrayList arrayList = new ArrayList();
        arrayList.add(uef(duration));
        return arrayList;
    }
}
