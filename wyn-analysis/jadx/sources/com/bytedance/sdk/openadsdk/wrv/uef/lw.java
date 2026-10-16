package com.bytedance.sdk.openadsdk.wrv.uef;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw extends com.bytedance.sdk.component.uef.moa<JSONObject, JSONObject> {
    private JSONObject uef;

    public lw(JSONObject jSONObject) {
        this.uef = jSONObject;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, JSONObject jSONObject) {
        wkVar.uef("getData", new lw(jSONObject));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.zjm.oa.yo.uef(this.uef, jSONObject);
    }
}
