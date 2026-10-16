package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class uef extends moa {
    public uef(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        super(view, uefVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa
    public List<ObjectAnimator> uef() {
        float fSy = this.f24800oa.sy() / 100.0f;
        float fOib = this.f24800oa.oib() / 100.0f;
        if ("reverse".equals(this.f24800oa.ab()) && this.f24800oa.dz() <= 0.0d) {
            fOib = fSy;
            fSy = fOib;
        }
        this.yo.setAlpha(fSy);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yo, "alpha", fSy, fOib).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(uef(duration));
        return arrayList;
    }
}
