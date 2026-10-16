package com.bytedance.sdk.component.adexpress.dynamic.lw;

import com.bytedance.sdk.component.adexpress.oa.cq;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xs implements bcc {
    private com.bytedance.sdk.component.adexpress.dynamic.ivm.oa uef;

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(cq cqVar) {
        try {
            JSONObject jSONObjectYo = cqVar.yo();
            JSONObject jSONObject = new JSONObject(jSONObjectYo.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectYo.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVarUef = new ivm(jSONObject, jSONObjectOptJSONObject, jSONObjectYo.optJSONObject("AdSize"), new JSONObject(jSONObjectYo.optString("diff_template_Plugin"))).uef(cqVar.oa(), cqVar.zjm(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), cqVar);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                bccVarUef.uef(jSONObject2.optString("color"));
                bccVarUef.uef(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.uef.uef(bccVarUef);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lw.bcc
    public void uef(com.bytedance.sdk.component.adexpress.dynamic.ivm.oa oaVar) {
        this.uef = oaVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lw.bcc
    public void uef(final cq cqVar) {
        if (cqVar.wrv() == 1) {
            oa(cqVar);
        } else {
            com.bytedance.sdk.component.adexpress.moa.moa.uef(new com.bytedance.sdk.component.bcc.oa.yo("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.lw.xs.1
                @Override // java.lang.Runnable
                public void run() {
                    xs.this.oa(cqVar);
                }
            }, 5);
        }
    }
}
