package com.bytedance.sdk.openadsdk.component.cz;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.ab;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.sdk.openadsdk.core.zjm.uef {
    private tpx uef;

    public uef(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.uef
    public void uef(View view, int i5, ab abVar) {
        tpx tpxVar = this.uef;
        if (tpxVar != null) {
            tpxVar.uef(view, i5, abVar);
        }
    }

    public void uef(tpx tpxVar) {
        this.uef = tpxVar;
        tpxVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
