package com.bytedance.sdk.openadsdk.component.uef;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.sdk.openadsdk.core.yo.uef {
    private final com.bytedance.sdk.openadsdk.component.bcc.uef uef;

    public uef(Context context, gzw gzwVar, String str, int i5, com.bytedance.sdk.openadsdk.component.bcc.uef uefVar) {
        super(context, gzwVar, str, i5);
        this.uef = uefVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.yo.uef, com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
    public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
        if (view.getTag() == "open_ad_click_button_tag") {
            uef("click_bar");
        } else {
            uef("click_material");
        }
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(this.uef.yo()));
        uef(map);
        super.uef(view, f10, f11, f12, f13, sparseArray, z2);
        lw.uef(((com.bytedance.sdk.openadsdk.core.yo.oa) this).ivm, 9);
    }
}
