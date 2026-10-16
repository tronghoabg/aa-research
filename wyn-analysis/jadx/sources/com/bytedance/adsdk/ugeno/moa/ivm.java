package com.bytedance.adsdk.ugeno.moa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ivm {

    /* renamed from: oa, reason: collision with root package name */
    private List<uef> f24738oa;
    private uef uef;
    private boolean yo = false;
    private int moa = 0;

    public static class uef {
        private Map<String, Object> ivm;
        private Map<String, Object> lw;
        private String moa;

        /* renamed from: oa, reason: collision with root package name */
        private String f24739oa;
        private String uef;
        private String yo = "global";

        public String lw() {
            return this.f24739oa;
        }

        public String moa() {
            return this.uef;
        }

        public String oa() {
            return this.moa;
        }

        public String toString() {
            return "Action{scheme='" + this.yo + "', name='" + this.moa + "', params=" + this.lw + ", host='" + this.f24739oa + "', origin='" + this.uef + "', extra=" + this.ivm + '}';
        }

        public String uef() {
            return this.yo;
        }

        public Map<String, Object> yo() {
            return this.lw;
        }

        public void moa(String str) {
            this.f24739oa = str;
        }

        public void oa(String str) {
            this.moa = str;
        }

        public void uef(String str) {
            this.yo = str;
        }

        public void yo(String str) {
            this.uef = str;
        }

        public void oa(Map<String, Object> map) {
            this.ivm = map;
        }

        public void uef(Map<String, Object> map) {
            this.lw = map;
        }
    }

    public int moa() {
        return this.moa;
    }

    public List<uef> oa() {
        return this.f24738oa;
    }

    public uef uef() {
        return this.uef;
    }

    public boolean yo() {
        return this.yo;
    }

    public static ivm uef(JSONObject jSONObject, JSONObject jSONObject2) {
        uef uefVarUef;
        if (jSONObject == null) {
            return null;
        }
        ivm ivmVar = new ivm();
        Object objOpt = jSONObject.opt("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        uef uefVarUef2 = objOpt instanceof String ? wrv.uef((String) objOpt, jSONObject2) : objOpt instanceof JSONObject ? wrv.uef((JSONObject) objOpt, jSONObject2) : null;
        if (uefVarUef2 != null) {
            ivmVar.uef = uefVarUef2;
        }
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
            Object objOpt2 = jSONArrayOptJSONArray.opt(i5);
            if (objOpt2 instanceof String) {
                uef uefVarUef3 = wrv.uef((String) objOpt2, jSONObject2);
                if (uefVarUef3 != null) {
                    arrayList.add(uefVarUef3);
                }
            } else if ((objOpt2 instanceof JSONObject) && (uefVarUef = wrv.uef((JSONObject) objOpt2, jSONObject2)) != null) {
                arrayList.add(uefVarUef);
            }
        }
        ivmVar.f24738oa = arrayList;
        if (jSONObject.has("delay")) {
            ivmVar.moa = com.bytedance.adsdk.ugeno.xs.yo.uef(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("delay"), jSONObject2), 0);
        }
        if (jSONObject.has("disable")) {
            ivmVar.yo = com.bytedance.adsdk.ugeno.xs.yo.uef(com.bytedance.adsdk.ugeno.yo.oa.uef(jSONObject.optString("disable"), jSONObject2), false);
        }
        return ivmVar;
    }
}
