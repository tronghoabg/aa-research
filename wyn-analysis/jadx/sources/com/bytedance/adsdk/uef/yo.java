package com.bytedance.adsdk.uef;

import com.bytedance.adsdk.ugeno.yo.uef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yo implements com.bytedance.adsdk.ugeno.yo.uef {

    public static class uef implements uef.InterfaceC0047uef {

        /* renamed from: oa, reason: collision with root package name */
        private String f24668oa;
        private com.bytedance.adsdk.uef.oa.uef uef;

        private uef(String str) {
            this.f24668oa = str;
            this.uef = com.bytedance.adsdk.uef.oa.uef.uef(str);
        }

        public static uef uef(String str) {
            return new uef(str);
        }

        @Override // com.bytedance.adsdk.ugeno.yo.uef.InterfaceC0047uef
        public Object uef(JSONObject jSONObject) {
            com.bytedance.adsdk.uef.oa.uef uefVar = this.uef;
            if (uefVar == null) {
                return this.f24668oa;
            }
            Object objUef = uefVar.uef(jSONObject);
            if (objUef instanceof String) {
                return objUef;
            }
            if (objUef instanceof com.bytedance.adsdk.uef.oa.uef.uef) {
                return String.valueOf(bs.uef((com.bytedance.adsdk.uef.oa.uef.uef) objUef));
            }
            if (objUef == null || !objUef.getClass().isArray()) {
                return String.valueOf(objUef);
            }
            try {
                return new JSONArray(objUef).toString();
            } catch (JSONException unused) {
                return String.valueOf(objUef);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yo.uef
    public uef.InterfaceC0047uef uef(String str) {
        return uef.uef(str);
    }
}
