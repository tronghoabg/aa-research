package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class cq extends moa {
    public cq(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        super(view, uefVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa
    public List<ObjectAnimator> uef() {
        View view = this.yo;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dj)) {
            View view2 = (View) this.yo.getParent();
            this.yo = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.yo.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yo, "stretchValue", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(uef(duration));
        return arrayList;
    }
}
