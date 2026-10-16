package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ivm extends com.bytedance.sdk.component.uef.moa<JSONObject, JSONObject> {
    private final WeakReference<oyt> uef;

    public ivm(oyt oytVar) {
        this.uef = new WeakReference<>(oytVar);
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, oyt oytVar) {
        wkVar.uef("interactiveFinish", new ivm(oytVar));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<oyt> weakReference = this.uef;
        if (weakReference != null && weakReference.get() != null) {
            oyt oytVar = this.uef.get();
            gzw gzwVarMoa = oytVar.moa();
            try {
                boolean z2 = true;
                int i5 = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z2 = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iMbv = gzwVarMoa != null ? gzwVarMoa.mbv() : 0;
                if (iOptInt >= 0 && iMbv >= 0) {
                    iOptInt = Math.min(iOptInt, iMbv);
                } else if (iOptInt < 0) {
                    iOptInt = iMbv >= 0 ? iMbv : 0;
                }
                if (z2) {
                    oytVar.yo(iOptInt);
                } else {
                    i5 = -1;
                }
                jSONObject2.put("code", i5);
                jSONObject2.put("reduce_duration", iOptInt);
                return jSONObject2;
            } catch (JSONException e7) {
                com.bytedance.sdk.component.utils.dhk.yo("InteractiveFinishMethod", e7.getMessage());
            }
        }
        return jSONObject2;
    }
}
