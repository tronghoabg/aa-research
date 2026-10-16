package com.bytedance.sdk.component.lw.oa.oa;

import android.text.TextUtils;
import com.bytedance.sdk.component.lw.oib;
import com.bytedance.sdk.component.utils.ab;

/* loaded from: classes.dex */
public class oa implements ivm {
    @Override // com.bytedance.sdk.component.lw.oa.oa.ivm
    public boolean uef(com.bytedance.sdk.component.lw.oa.yo.yo yoVar, oib oibVar, com.bytedance.sdk.component.lw.oa.yo.uef uefVar) {
        if (TextUtils.isEmpty(yoVar.bcc())) {
            String strUef = uef(yoVar);
            yoVar.oa(strUef);
            yoVar.uef(strUef);
        }
        yoVar.uef();
        return true;
    }

    @Override // com.bytedance.sdk.component.lw.oa.oa.ivm
    public String uef() {
        return "generate_key";
    }

    private String uef(com.bytedance.sdk.component.lw.oa.yo.yo yoVar) {
        return ab.uef(yoVar.uef());
    }
}
