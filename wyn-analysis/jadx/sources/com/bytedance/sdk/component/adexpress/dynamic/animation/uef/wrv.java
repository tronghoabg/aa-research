package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class wrv extends moa {
    public wrv(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        super(view, uefVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.uef.moa
    public List<ObjectAnimator> uef() {
        int i5;
        int i10;
        this.yo.setTag(2097610711, Integer.valueOf(this.f24800oa.moa()));
        View view = this.yo;
        if (view == null || !com.bytedance.sdk.component.adexpress.moa.oa.uef(view.getContext())) {
            i5 = 0;
            i10 = 1;
        } else {
            i10 = 0;
            i5 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yo, "shineValue", i5, i10).setDuration((int) (this.f24800oa.zjm() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(uef(duration));
        return arrayList;
    }
}
