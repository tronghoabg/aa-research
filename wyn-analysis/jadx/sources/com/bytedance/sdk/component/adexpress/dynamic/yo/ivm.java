package com.bytedance.sdk.component.adexpress.dynamic.yo;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ivm.sy;
import com.bytedance.sdk.component.adexpress.ivm.tpx;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ivm extends bs<com.bytedance.sdk.component.adexpress.ivm.ivm> {
    public ivm(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw lwVar, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar, int i5, int i10, int i11, JSONObject jSONObject) {
        super(context, lwVar, xsVar);
        this.f24877oa = context;
        this.moa = xsVar;
        this.yo = lwVar;
        uef(i5, i10, i11, jSONObject, xsVar);
    }

    private void uef(int i5, int i10, int i11, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.moa.xs xsVar) {
        this.uef = new com.bytedance.sdk.component.adexpress.ivm.ivm(this.f24877oa, i5, i10, i11, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.f24877oa, 300.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.f24877oa, xsVar.au() > 0 ? xsVar.au() : com.bytedance.sdk.component.adexpress.moa.oa() ? 0 : 120);
        this.uef.setLayoutParams(layoutParams);
        this.uef.setClipChildren(false);
        this.uef.setSlideText(this.moa.rj());
        tpx tpxVar = this.uef;
        if (tpxVar instanceof com.bytedance.sdk.component.adexpress.ivm.ivm) {
            ((com.bytedance.sdk.component.adexpress.ivm.ivm) tpxVar).setShakeText(this.moa.zou());
            final com.bytedance.sdk.component.adexpress.ivm.oib shakeView = ((com.bytedance.sdk.component.adexpress.ivm.ivm) this.uef).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new sy.uef() { // from class: com.bytedance.sdk.component.adexpress.dynamic.yo.ivm.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.yo.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yo.bs
    public void moa() {
    }
}
