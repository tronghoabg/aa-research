package com.bytedance.sdk.openadsdk.core.wk.yo;

import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {
    public static void uef(gzw gzwVar) {
        if (cp.oa(gzwVar)) {
            com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void uef(gzw gzwVar, long j8, long j10) throws JSONException {
        if (gzwVar != null) {
            if (cp.yo(gzwVar) || cp.oa(gzwVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j8);
                    jSONObject.put("unzip_success_time", j10);
                } catch (JSONException e7) {
                    dhk.uef("PlayableEvent", "onSuccess json error", e7);
                }
                com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void uef(gzw gzwVar, int i5, String str) {
        if (gzwVar != null) {
            if (cp.yo(gzwVar) || cp.oa(gzwVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i5);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e7) {
                    dhk.uef("PlayableEvent", "onFail json error", e7);
                }
                com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
