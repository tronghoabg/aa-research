package com.bytedance.sdk.openadsdk.ab.oa;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa {

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        public final JSONObject f25148oa;
        public final String uef;

        public uef(String str, JSONObject jSONObject) throws JSONException {
            this.uef = str;
            this.f25148oa = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device_info");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put("gaid", com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa());
                    jSONObject.put("device_info", jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static yo uef() {
        return lw.uef();
    }
}
