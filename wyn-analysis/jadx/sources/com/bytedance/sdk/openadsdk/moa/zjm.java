package com.bytedance.sdk.openadsdk.moa;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zjm {
    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject oa(gzw gzwVar, String str, int i5, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("error_msg", str);
            }
            int i10 = 1;
            jSONObject2.put("ad_show_order", i5 + 1);
            jSONObject2.put("interaction_method", gzwVar.hg());
            jSONObject2.put("real_interaction_method", gzwVar.wxf());
            jSONObject2.put("give_up_reward", gzwVar.ab() ? 1 : 2);
            if (!gzwVar.sk()) {
                i10 = 2;
            }
            jSONObject2.put("has_reward", i10);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONObject2;
    }

    public static void uef(gzw gzwVar, String str, String str2, String str3) {
        uef(gzwVar, str, str2, str3, null);
    }

    public static void uef(gzw gzwVar, String str, String str2, String str3, JSONObject jSONObject) {
        uef(gzwVar, str, str2, str3, jSONObject, 0);
    }

    public static void uef(final gzw gzwVar, String str, String str2, final String str3, final JSONObject jSONObject, final int i5) {
        if (gzwVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        yo.uef(System.currentTimeMillis(), gzwVar, str2, str, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.moa.zjm.1
            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject oa() throws JSONException {
                if (jSONObject == null) {
                    return super.oa();
                }
                long jBs = gzwVar.bs();
                if (jBs < 0) {
                    long jCz = gzwVar.cz();
                    if (jCz > 0) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - jCz;
                        if (jElapsedRealtime > 0) {
                            jBs = jElapsedRealtime;
                        }
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", jBs);
                    return jSONObject2;
                } catch (Exception e7) {
                    dhk.yo(e7.getMessage(), new Object[0]);
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
            public JSONObject uef() {
                return zjm.oa(gzwVar, str3, i5, jSONObject);
            }
        });
    }

    public static void uef(String str, boolean z2, boolean z10, gzw gzwVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("has_close_invoke", z2 ? 1 : 2);
            jSONObject.put("has_show_invoke", z10 ? 1 : 2);
            uef(gzwVar, str, gzwVar != null ? gzwVar.lw() : null, null, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void uef(gzw gzwVar, String str, int i5) {
        uef(gzwVar, "close".equals(str) ? "close_listen_empty" : "show_listen_empty", gzwVar != null ? gzwVar.lw() : null, null, null, i5);
    }
}
