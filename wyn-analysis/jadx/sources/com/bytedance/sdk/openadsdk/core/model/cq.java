package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cq {

    /* renamed from: oa, reason: collision with root package name */
    private String f25665oa;
    private String uef;
    private int yo;

    public JSONObject moa() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.uef);
            jSONObject.put("ft", this.yo);
            jSONObject.put("fu", this.f25665oa);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String oa() {
        return this.f25665oa;
    }

    public String uef() {
        return this.uef;
    }

    public int yo() {
        return this.yo;
    }

    public void oa(String str) {
        this.f25665oa = str;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public void uef(int i5) {
        this.yo = i5;
    }
}
