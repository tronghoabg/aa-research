package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.openadsdk.core.oyt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa extends com.bytedance.sdk.component.uef.moa<JSONObject, JSONObject> {
    private final oyt uef;

    public moa(oyt oytVar) {
        this.uef = oytVar;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, oyt oytVar) {
        wkVar.uef("expressAdViewStartZoom", new moa(oytVar));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        this.uef.moa(jSONObject);
        return null;
    }
}
