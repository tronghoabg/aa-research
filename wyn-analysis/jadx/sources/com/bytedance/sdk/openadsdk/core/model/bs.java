package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bs {

    /* renamed from: oa, reason: collision with root package name */
    private uef f25661oa;
    private uef uef;

    public bs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.uef = new uef(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.f25661oa = new uef(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    public static uef oa(gzw gzwVar) {
        bs bsVarYka;
        if (gzwVar == null || (bsVarYka = gzwVar.yka()) == null) {
            return null;
        }
        return bsVarYka.f25661oa;
    }

    public static boolean uef(gzw gzwVar) {
        return uef(gzwVar, false);
    }

    public static uef yo(gzw gzwVar) {
        bs bsVarYka;
        if (gzwVar == null || (bsVarYka = gzwVar.yka()) == null) {
            return null;
        }
        return bsVarYka.uef;
    }

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        C0100uef f25662oa;
        C0100uef uef;

        /* renamed from: com.bytedance.sdk.openadsdk.core.model.bs$uef$uef, reason: collision with other inner class name */
        public static class C0100uef {
            String uef;

            public C0100uef(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.uef = jSONObject.optString("entry");
            }

            public boolean uef() {
                return !TextUtils.isEmpty(this.uef);
            }
        }

        public uef(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.uef = new C0100uef(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.f25662oa = new C0100uef(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean uef() {
            C0100uef c0100uef = this.f25662oa;
            if (c0100uef != null && c0100uef.uef()) {
                return true;
            }
            C0100uef c0100uef2 = this.uef;
            return c0100uef2 != null && c0100uef2.uef();
        }

        public String uef(boolean z2) {
            if (z2) {
                C0100uef c0100uef = this.uef;
                if (c0100uef != null) {
                    return c0100uef.uef;
                }
                return "";
            }
            C0100uef c0100uef2 = this.f25662oa;
            if (c0100uef2 != null) {
                return c0100uef2.uef;
            }
            return "";
        }
    }

    public static boolean uef(gzw gzwVar, boolean z2) {
        bs bsVarYka;
        if (gzwVar == null || (bsVarYka = gzwVar.yka()) == null) {
            return false;
        }
        if (z2) {
            uef uefVar = bsVarYka.f25661oa;
            return uefVar != null && uefVar.uef();
        }
        uef uefVar2 = bsVarYka.uef;
        return uefVar2 != null && uefVar2.uef();
    }
}
