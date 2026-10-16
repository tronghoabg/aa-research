package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wrv extends bs {
    public wrv() {
        super(com.bytedance.adsdk.uef.oa.moa.yo.MOD);
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        Object objUef;
        Object objUef2 = this.uef.uef(map);
        if (objUef2 == null || (objUef = this.f24662oa.uef(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.uef.oa.lw.uef.ivm.uef((Number) objUef2, (Number) objUef);
    }
}
