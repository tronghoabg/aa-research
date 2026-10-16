package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw {
    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str, int i5, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i5);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, str, "convert_track", jSONObject);
    }
}
