package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.openadsdk.core.oyt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bs extends com.bytedance.sdk.component.uef.moa<JSONObject, JSONObject> {
    private oyt uef;

    public bs(oyt oytVar) {
        this.uef = oytVar;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, oyt oytVar) {
        wkVar.uef("sendLogV3", new bs(oytVar));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        this.uef.wrv(jSONObject);
        return null;
    }
}
