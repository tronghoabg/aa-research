package com.bytedance.sdk.openadsdk.moa.oa;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo implements oa {
    oa uef;

    @Override // com.bytedance.sdk.openadsdk.moa.oa.oa
    public void uef(JSONObject jSONObject, long j8) throws JSONException {
        oa oaVar = this.uef;
        if (oaVar != null) {
            oaVar.uef(jSONObject, j8);
        }
        if (j8 <= 0) {
            j8 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j8);
    }
}
