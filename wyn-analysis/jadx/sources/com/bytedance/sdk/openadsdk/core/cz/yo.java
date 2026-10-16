package com.bytedance.sdk.openadsdk.core.cz;

import com.bytedance.sdk.component.xs.oa.moa;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.gzw;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {
    private static JSONObject oa(String str, long j8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j8);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void uef(String str, long j8) throws JSONException {
        JSONObject jSONObjectOa = oa(str, j8);
        moa moaVarOa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().oa();
        moaVarOa.yo(gb.moa("/api/ad/union/sdk/stats/"));
        moaVarOa.lw(jSONObjectOa.toString());
        moaVarOa.uef(6);
        moaVarOa.oa("uploadFrequentEvent");
        moaVarOa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.cz.yo.1
            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
            }

            @Override // com.bytedance.sdk.component.xs.uef.uef
            public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                iOException.getMessage();
                if (yoVar != null) {
                    gzw.uef(yoVar.ivm());
                }
            }
        });
    }
}
