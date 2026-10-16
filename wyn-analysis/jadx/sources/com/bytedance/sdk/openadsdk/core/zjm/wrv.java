package com.bytedance.sdk.openadsdk.core.zjm;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class wrv {
    public static void uef(String str, int i5, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.cz.uef(i5);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            gzw.uef uefVarVep = gzwVar.vep();
            if (uefVarVep != null) {
                jSONObject.put("tpl_id", uefVarVep.moa());
                if ("Web".equals(str)) {
                    if (uefVarVep.wrv()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (gzwVar.aje() != null) {
                jSONObject.put("tpl_id", gzwVar.aje().uef());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.ab.moa.uef().uef(com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef(uef(str3)).yo(str4).lw(gzwVar != null ? gzwVar.ofp() : "").oa(i5).oa(jSONObject.toString()).ivm(str2));
    }

    private static int uef(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}
