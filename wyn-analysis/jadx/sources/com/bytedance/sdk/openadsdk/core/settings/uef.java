package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.tpx;
import com.bytedance.sdk.openadsdk.core.settings.lw;
import com.bytedance.sdk.openadsdk.core.settings.zjm;
import com.bytedance.sdk.openadsdk.core.sy;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef extends zjm {
    public uef() {
        super(new zjm.uef() { // from class: com.bytedance.sdk.openadsdk.core.settings.uef.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.zjm.uef
            public void oa() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.zjm.uef
            public void uef() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.zjm
    public String uef() {
        try {
            if (sy.uef() == null || tpx.uef(sy.uef())) {
                return "tt_set_apm.prop";
            }
            return "tt_set_apm_" + tpx.yo(sy.uef()) + ".prop";
        } catch (Throwable unused) {
            return "tt_set_apm";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lw
    public void uef(JSONObject jSONObject) {
        lw.uef uefVarOa = oa();
        if (jSONObject.has("apm_url")) {
            uefVarOa.uef("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    uefVarOa.uef("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        uefVarOa.uef();
        lw();
    }
}
