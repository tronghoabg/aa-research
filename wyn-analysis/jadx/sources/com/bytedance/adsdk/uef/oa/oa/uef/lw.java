package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lw extends bs {
    public lw() {
        super(com.bytedance.adsdk.uef.oa.moa.yo.GT_EQ);
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        Object objUef;
        if (this.uef.uef(map) == null || (objUef = this.f24662oa.uef(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.uef.oa.lw.uef.moa.uef(r0, (Number) objUef)).booleanValue());
    }
}
