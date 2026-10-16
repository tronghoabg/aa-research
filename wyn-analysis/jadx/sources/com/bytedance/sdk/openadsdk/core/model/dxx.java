package com.bytedance.sdk.openadsdk.core.model;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dxx {
    private uef ivm;
    private JSONObject lw;
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f25674oa;
    private String uef;
    private String yo;

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        private JSONArray f25675oa;
        private JSONArray uef;
        private JSONArray yo;

        public JSONArray oa() {
            return this.f25675oa;
        }

        public JSONArray uef() {
            return this.uef;
        }

        public JSONArray yo() {
            return this.yo;
        }

        public void oa(JSONArray jSONArray) {
            this.f25675oa = jSONArray;
        }

        public void uef(JSONArray jSONArray) {
            this.uef = jSONArray;
        }

        public void yo(JSONArray jSONArray) {
            this.yo = jSONArray;
        }

        public static uef uef(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            uef uefVar = new uef();
            uefVar.uef(jSONArrayOptJSONArray);
            uefVar.oa(jSONObject.optJSONArray("fetch"));
            uefVar.yo(jSONObject.optJSONArray("script"));
            return uefVar;
        }
    }

    public uef ivm() {
        return this.ivm;
    }

    public JSONObject lw() {
        return this.lw;
    }

    public String moa() {
        return this.moa;
    }

    public String oa() {
        return this.f25674oa;
    }

    public String uef() {
        return this.uef;
    }

    public String yo() {
        return this.yo;
    }

    public static dxx uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        dxx dxxVar = new dxx();
        dxxVar.uef = jSONObject.optString("id");
        dxxVar.moa = jSONObject.optString(JsonStorageKeyNames.DATA_KEY);
        dxxVar.yo = jSONObject.optString("url");
        dxxVar.f25674oa = jSONObject.optString("md5");
        dxxVar.lw = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            dxxVar.ivm = uef.uef(jSONObjectOptJSONObject);
        }
        return dxxVar;
    }
}
