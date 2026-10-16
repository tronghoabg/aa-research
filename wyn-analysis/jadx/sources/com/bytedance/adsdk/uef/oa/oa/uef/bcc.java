package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bcc extends bs {
    public bcc() {
        super(com.bytedance.adsdk.uef.oa.moa.yo.LT_EQ);
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        Object objUef;
        if (this.uef.uef(map) == null || (objUef = this.f24662oa.uef(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.uef.oa.lw.uef.yo.uef(r0, (Number) objUef)).booleanValue());
    }
}
