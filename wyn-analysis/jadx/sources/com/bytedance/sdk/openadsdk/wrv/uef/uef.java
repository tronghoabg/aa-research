package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.component.uef.yo;
import com.bytedance.sdk.openadsdk.core.oyt;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.sdk.component.uef.yo<JSONObject, JSONObject> {
    private final WeakReference<oyt> uef;

    public uef(oyt oytVar) {
        this.uef = new WeakReference<>(oytVar);
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, final oyt oytVar) {
        wkVar.uef("getNetworkData", new yo.oa() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.uef.1
            @Override // com.bytedance.sdk.component.uef.yo.oa
            public com.bytedance.sdk.component.uef.yo uef() {
                return new uef(oytVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.uef.yo
    public void uef(JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        oyt oytVar = this.uef.get();
        if (oytVar == null) {
            yo();
        } else {
            oytVar.uef(jSONObject, new com.bytedance.sdk.openadsdk.cq.moa() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.uef.2
                @Override // com.bytedance.sdk.openadsdk.cq.moa
                public void uef(boolean z2, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z2) {
                            uef.this.uef((uef) jSONObject2);
                        } else {
                            jSONObject2.put("creatives", oyt.uef(uefVar));
                            uef.this.uef((uef) jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
