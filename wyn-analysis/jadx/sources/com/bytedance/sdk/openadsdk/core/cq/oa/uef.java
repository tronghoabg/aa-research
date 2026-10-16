package com.bytedance.sdk.openadsdk.core.cq.oa;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.orq;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.adsdk.ugeno.cz.ivm.oa {
    public uef(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.cz.ivm.oa
    public void dz(String str) {
        super.dz(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String str2 = String.format(orq.uef(this.f24755oa, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.cz.ivm.uef) this.lw).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
