package com.bytedance.adsdk.uef.oa.oa.uef;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class moa extends bs {
    public moa() {
        super(com.bytedance.adsdk.uef.oa.moa.yo.EQ);
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public Object uef(Map<String, JSONObject> map) {
        Object objUef = this.uef.uef(map);
        Object objUef2 = this.f24662oa.uef(map);
        return (objUef == null && objUef2 == null) ? Boolean.TRUE : (objUef != null || objUef2 == null) ? (objUef == null || objUef2 != null) ? ((objUef instanceof Number) && (objUef2 instanceof Number)) ? Boolean.valueOf(com.bytedance.adsdk.uef.oa.lw.uef.oa.uef((Number) objUef, (Number) objUef2)) : Boolean.valueOf(objUef.equals(objUef2)) : Boolean.FALSE : Boolean.FALSE;
    }
}
