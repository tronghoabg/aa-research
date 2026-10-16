package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {
    private boolean lw;
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f25701oa;
    private String uef;
    private String yo;

    public JSONObject ivm() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacy_url", this.yo);
            jSONObject.put("privacy_title", this.moa);
            jSONObject.put("text", this.f25701oa);
            jSONObject.put("icon", this.uef);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean lw() {
        return this.lw;
    }

    public String moa() {
        return this.moa;
    }

    public String oa() {
        return this.f25701oa;
    }

    public void uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.uef = jSONObject.optString("icon");
        this.f25701oa = jSONObject.optString("text");
        this.yo = jSONObject.optString("privacy_url");
        this.moa = jSONObject.optString("privacy_title");
    }

    public String yo() {
        return this.yo;
    }

    public String uef() {
        return this.uef;
    }

    public void uef(boolean z2) {
        this.lw = z2;
    }
}
