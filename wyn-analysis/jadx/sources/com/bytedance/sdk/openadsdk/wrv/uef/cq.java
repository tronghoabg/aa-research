package com.bytedance.sdk.openadsdk.wrv.uef;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cq extends com.bytedance.sdk.component.uef.moa<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.cz.ivm> uef;

    public cq(com.bytedance.sdk.component.cz.ivm ivmVar) {
        this.uef = new WeakReference<>(ivmVar);
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, com.bytedance.sdk.component.cz.ivm ivmVar) {
        wkVar.uef("preventTouchEvent", new cq(ivmVar));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.cz.ivm ivmVar = this.uef.get();
            if (ivmVar != null) {
                ivmVar.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
                return jSONObject2;
            }
            jSONObject2.put("success", false);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
