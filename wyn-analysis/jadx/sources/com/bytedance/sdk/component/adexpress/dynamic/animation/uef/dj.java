package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class dj extends moa {
    public dj(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        super(view, uefVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa
    public List<ObjectAnimator> uef() {
        float f10;
        float fDj = (float) this.f24800oa.dj();
        float fWrv = (float) this.f24800oa.wrv();
        String strAb = this.f24800oa.ab();
        float f11 = 1.0f;
        if ("reverse".equals(strAb) || "alternate-reverse".equals(strAb)) {
            f10 = 1.0f;
        } else {
            f10 = fWrv;
            fWrv = 1.0f;
            f11 = fDj;
            fDj = 1.0f;
        }
        this.yo.setTag(2097610710, this.f24800oa.oa());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yo, "scaleX", fDj, f11).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.yo, "scaleY", fWrv, f10).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(uef(duration));
        arrayList.add(uef(duration2));
        return arrayList;
    }
}
