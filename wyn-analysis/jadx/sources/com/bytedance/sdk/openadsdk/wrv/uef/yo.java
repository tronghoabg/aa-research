package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.component.uef.yo;
import com.bytedance.sdk.openadsdk.core.oyt;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo extends com.bytedance.sdk.component.uef.yo<JSONObject, JSONObject> {
    private final WeakReference<oyt> uef;

    public yo(oyt oytVar) {
        this.uef = new WeakReference<>(oytVar);
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, final oyt oytVar) {
        wkVar.uef("newClickEvent", new yo.oa() { // from class: com.bytedance.sdk.openadsdk.wrv.uef.yo.1
            @Override // com.bytedance.sdk.component.uef.yo.oa
            public com.bytedance.sdk.component.uef.yo uef() {
                return new yo(oytVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.uef.yo
    public void uef(JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        oyt oytVar = this.uef.get();
        if (oytVar == null) {
            yo();
        } else {
            oytVar.lw(jSONObject);
        }
    }
}
