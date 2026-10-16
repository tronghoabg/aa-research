package com.bytedance.sdk.openadsdk.core.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw {

    /* renamed from: oa, reason: collision with root package name */
    private moa f25697oa;
    private ArrayList<uef> uef;

    public static class uef {
        private Set<com.bytedance.sdk.openadsdk.core.dz.zjm> moa;

        /* renamed from: oa, reason: collision with root package name */
        private final String f25698oa;
        private final String uef;
        private com.bytedance.sdk.openadsdk.core.dz.moa yo;

        public uef(JSONObject jSONObject) {
            this.uef = jSONObject.optString("vast_url");
            this.f25698oa = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.dz.moa moaVar = new com.bytedance.sdk.openadsdk.core.dz.moa();
                this.yo = moaVar;
                moaVar.uef(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.moa = com.bytedance.sdk.openadsdk.core.dz.zjm.uef(jSONArrayOptJSONArray);
            }
        }

        public String moa() {
            return this.f25698oa;
        }

        public Set<com.bytedance.sdk.openadsdk.core.dz.zjm> oa() {
            return this.moa;
        }

        public com.bytedance.sdk.openadsdk.core.dz.moa uef() {
            return this.yo;
        }

        public String yo() {
            return this.uef;
        }

        public void uef(com.bytedance.sdk.openadsdk.core.dz.moa moaVar) {
            this.yo = moaVar;
        }

        public void uef(Set<com.bytedance.sdk.openadsdk.core.dz.zjm> set) {
            this.moa = set;
        }
    }

    public lw(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            uef uefVar = new uef(jSONArray.optJSONObject(i5));
            if (this.uef == null) {
                this.uef = new ArrayList<>();
            }
            this.uef.add(uefVar);
        }
    }

    public static boolean uef(gzw gzwVar) {
        if (gzwVar == null || gzwVar.ku()) {
            return false;
        }
        int iDqw = gzwVar.dqw();
        int iHw = gzwVar.hw();
        return (iDqw == 3 || iDqw == 7 || iDqw == 8) && (iHw == 5 || iHw == 15 || iHw == 50);
    }

    public moa oa() {
        if (this.f25697oa == null) {
            this.f25697oa = new moa();
            ArrayList<uef> arrayList = this.uef;
            if (arrayList != null) {
                Iterator<uef> it = arrayList.iterator();
                while (it.hasNext()) {
                    uef next = it.next();
                    com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef = next.uef();
                    Set<com.bytedance.sdk.openadsdk.core.dz.zjm> setOa = next.oa();
                    if (moaVarUef != null) {
                        this.f25697oa.uef().uef(moaVarUef);
                    }
                    if (setOa != null) {
                        this.f25697oa.oa().addAll(setOa);
                    }
                }
            }
        }
        return this.f25697oa;
    }

    public boolean yo() {
        ArrayList<uef> arrayList = this.uef;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public ArrayList<uef> uef() {
        return this.uef;
    }
}
